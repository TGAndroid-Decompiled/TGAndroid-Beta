package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.p009ui.ActionBar.ActionBarMenu;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ChatActivity;
import org.telegram.p009ui.Components.AudioPlayerAlert;
import org.telegram.p009ui.Components.FragmentContextView;
import org.telegram.p009ui.Components.SharingLocationsAlert;
import org.telegram.p009ui.Components.voip.CellFlickerDrawable;
import org.telegram.p009ui.Components.voip.VoIPHelper;
import org.telegram.p009ui.DialogsActivity;
import org.telegram.p009ui.GroupCallActivity;
import org.telegram.p009ui.LaunchActivity;
import org.telegram.p009ui.LocationActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$GroupCall;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$ReplyMarkup;
import org.telegram.tgnet.TLRPC$TL_groupCallParticipant;
import org.telegram.tgnet.TLRPC$User;

public class FragmentContextView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    private final int account;
    private FragmentContextView additionalContextView;
    private int animationIndex;
    private AnimatorSet animatorSet;
    private View applyingView;
    private AvatarsImageView avatars;
    private ChatActivityInterface chatActivity;
    private boolean checkCallAfterAnimation;
    private boolean checkImportAfterAnimation;
    private Runnable checkLocationRunnable;
    private boolean checkPlayerAfterAnimation;
    private ImageView closeButton;
    float collapseProgress;
    boolean collapseTransition;
    private int currentProgress;
    private int currentStyle;
    private FragmentContextViewDelegate delegate;
    boolean drawOverlay;
    float extraHeight;
    private boolean firstLocationsLoaded;
    private BaseFragment fragment;
    private FrameLayout frameLayout;
    private Paint gradientPaint;
    private TextPaint gradientTextPaint;
    private int gradientWidth;
    private RLottieImageView importingImageView;
    private boolean isLocation;
    private boolean isMusic;
    private boolean isMuted;
    private TextView joinButton;
    private CellFlickerDrawable joinButtonFlicker;
    private int lastLocationSharingCount;
    private MessageObject lastMessageObject;
    private String lastString;
    private LinearGradient linearGradient;
    private Matrix matrix;
    float micAmplitude;
    private RLottieImageView muteButton;
    private RLottieDrawable muteDrawable;
    private ImageView playButton;
    private PlayPauseDrawable playPauseDrawable;
    private ActionBarMenuItem playbackSpeedButton;
    private RectF rect;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean scheduleRunnableScheduled;
    private View selector;
    private View shadow;
    private FrameLayout silentButton;
    private ImageView silentButtonImage;
    float speakerAmplitude;
    private ActionBarMenuSubItem[] speedItems;
    private AudioPlayerAlert.ClippingTextViewSwitcher subtitleTextView;
    private boolean supportsCalls;
    private StaticLayout timeLayout;
    private AudioPlayerAlert.ClippingTextViewSwitcher titleTextView;
    protected float topPadding;
    private final Runnable updateScheduleTimeRunnable;
    private boolean visible;
    boolean wasDraw;

    public interface FragmentContextViewDelegate {
        void onAnimation(boolean z, boolean z2);
    }

    @Override
    public void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override
    public void onCameraSwitch(boolean z) {
        VoIPService.StateListener.CC.$default$onCameraSwitch(this, z);
    }

    @Override
    public void onMediaStateUpdated(int i, int i2) {
        VoIPService.StateListener.CC.$default$onMediaStateUpdated(this, i, i2);
    }

    @Override
    public void onScreenOnChange(boolean z) {
        VoIPService.StateListener.CC.$default$onScreenOnChange(this, z);
    }

    @Override
    public void onSignalBarsCountChanged(int i) {
        VoIPService.StateListener.CC.$default$onSignalBarsCountChanged(this, i);
    }

    @Override
    public void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    protected void playbackSpeedChanged(float f) {
    }

    @Override
    public void onAudioSettingsChanged() {
        boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        if (this.isMuted != z) {
            this.isMuted = z;
            this.muteDrawable.setCustomEndFrame(z ? 15 : 29);
            RLottieDrawable rLottieDrawable = this.muteDrawable;
            rLottieDrawable.setCurrentFrame(rLottieDrawable.getCustomEndFrame() - 1, false, true);
            this.muteButton.invalidate();
            Theme.getFragmentContextViewWavesDrawable().updateState(this.visible);
        }
        if (this.isMuted) {
            this.micAmplitude = 0.0f;
            Theme.getFragmentContextViewWavesDrawable().setAmplitude(0.0f);
        }
    }

    public FragmentContextView(Context context, BaseFragment baseFragment, boolean z) {
        this(context, baseFragment, null, z, null);
    }

    public FragmentContextView(Context context, BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this(context, baseFragment, null, z, resourcesProvider);
    }

    public FragmentContextView(final Context context, final BaseFragment baseFragment, View view, boolean z, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        int i;
        float f;
        this.speedItems = new ActionBarMenuSubItem[4];
        this.currentProgress = -1;
        this.currentStyle = -1;
        this.supportsCalls = true;
        this.rect = new RectF();
        this.updateScheduleTimeRunnable = new Runnable() {
            @Override
            public void run() {
                String formatFullDuration;
                if (FragmentContextView.this.gradientTextPaint == null || !(FragmentContextView.this.fragment instanceof ChatActivity)) {
                    FragmentContextView.this.scheduleRunnableScheduled = false;
                    return;
                }
                ChatObject.Call groupCall = FragmentContextView.this.chatActivity.getGroupCall();
                if (groupCall == null || !groupCall.isScheduled()) {
                    FragmentContextView.this.timeLayout = null;
                    FragmentContextView.this.scheduleRunnableScheduled = false;
                    return;
                }
                int currentTime = FragmentContextView.this.fragment.getConnectionsManager().getCurrentTime();
                int i2 = groupCall.call.schedule_date;
                int i3 = i2 - currentTime;
                if (i3 >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(i3 / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(i2 - currentTime);
                }
                String str = formatFullDuration;
                int ceil = (int) Math.ceil(FragmentContextView.this.gradientTextPaint.measureText(str));
                FragmentContextView.this.timeLayout = new StaticLayout(str, FragmentContextView.this.gradientTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                AndroidUtilities.runOnUIThread(FragmentContextView.this.updateScheduleTimeRunnable, 1000L);
                FragmentContextView.this.frameLayout.invalidate();
            }
        };
        this.account = UserConfig.selectedAccount;
        this.lastLocationSharingCount = -1;
        this.checkLocationRunnable = new Runnable() {
            @Override
            public void run() {
                FragmentContextView.this.checkLocationString();
                AndroidUtilities.runOnUIThread(FragmentContextView.this.checkLocationRunnable, 1000L);
            }
        };
        this.animationIndex = -1;
        this.resourcesProvider = resourcesProvider;
        this.fragment = baseFragment;
        if (baseFragment instanceof ChatActivityInterface) {
            this.chatActivity = (ChatActivityInterface) baseFragment;
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = baseFragment.getFragmentView() instanceof SizeNotifierFrameLayout ? (SizeNotifierFrameLayout) this.fragment.getFragmentView() : null;
        this.applyingView = view;
        this.visible = true;
        this.isLocation = z;
        if (view == null) {
            ((ViewGroup) this.fragment.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
        BlurredFrameLayout blurredFrameLayout = new BlurredFrameLayout(context, sizeNotifierFrameLayout) {
            @Override
            public void invalidate() {
                super.invalidate();
                if (FragmentContextView.this.avatars == null || FragmentContextView.this.avatars.getVisibility() != 0) {
                    return;
                }
                FragmentContextView.this.avatars.invalidate();
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                float f2;
                super.dispatchDraw(canvas);
                if (FragmentContextView.this.currentStyle != 4 || FragmentContextView.this.timeLayout == null) {
                    return;
                }
                int ceil = ((int) Math.ceil(FragmentContextView.this.timeLayout.getLineWidth(0))) + AndroidUtilities.m36dp(24.0f);
                if (ceil != FragmentContextView.this.gradientWidth) {
                    FragmentContextView.this.linearGradient = new LinearGradient(0.0f, 0.0f, 1.7f * ceil, 0.0f, new int[]{-10187532, -7575089, -2860679, -2860679}, new float[]{0.0f, 0.294f, 0.588f, 1.0f}, Shader.TileMode.CLAMP);
                    FragmentContextView.this.gradientPaint.setShader(FragmentContextView.this.linearGradient);
                    FragmentContextView.this.gradientWidth = ceil;
                }
                ChatObject.Call groupCall = FragmentContextView.this.chatActivity.getGroupCall();
                if (FragmentContextView.this.fragment == null || groupCall == null || !groupCall.isScheduled()) {
                    f2 = 0.0f;
                } else {
                    long currentTimeMillis = (groupCall.call.schedule_date * 1000) - FragmentContextView.this.fragment.getConnectionsManager().getCurrentTimeMillis();
                    f2 = currentTimeMillis >= 0 ? currentTimeMillis < 5000 ? 1.0f - (((float) currentTimeMillis) / 5000.0f) : 0.0f : 1.0f;
                    if (currentTimeMillis < 6000) {
                        invalidate();
                    }
                }
                FragmentContextView.this.matrix.reset();
                FragmentContextView.this.matrix.postTranslate((-FragmentContextView.this.gradientWidth) * 0.7f * f2, 0.0f);
                FragmentContextView.this.linearGradient.setLocalMatrix(FragmentContextView.this.matrix);
                int measuredWidth = (getMeasuredWidth() - ceil) - AndroidUtilities.m36dp(10.0f);
                int m36dp = AndroidUtilities.m36dp(10.0f);
                FragmentContextView.this.rect.set(0.0f, 0.0f, ceil, AndroidUtilities.m36dp(28.0f));
                canvas.save();
                canvas.translate(measuredWidth, m36dp);
                canvas.drawRoundRect(FragmentContextView.this.rect, AndroidUtilities.m36dp(16.0f), AndroidUtilities.m36dp(16.0f), FragmentContextView.this.gradientPaint);
                canvas.translate(AndroidUtilities.m36dp(12.0f), AndroidUtilities.m36dp(6.0f));
                FragmentContextView.this.timeLayout.draw(canvas);
                canvas.restore();
            }
        };
        this.frameLayout = blurredFrameLayout;
        addView(blurredFrameLayout, LayoutHelper.createFrame(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.selector = view2;
        this.frameLayout.addView(view2, LayoutHelper.createFrame(-1, -1.0f));
        View view3 = new View(context);
        this.shadow = view3;
        view3.setBackgroundResource(C1072R.C1073drawable.blockpanel_shadow);
        addView(this.shadow, LayoutHelper.createFrame(-1, 2.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.playButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.playButton.setColorFilter(new PorterDuffColorFilter(getThemedColor("inappPlayerPlayPause"), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.playButton;
        PlayPauseDrawable playPauseDrawable = new PlayPauseDrawable(14);
        this.playPauseDrawable = playPauseDrawable;
        imageView2.setImageDrawable(playPauseDrawable);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            this.playButton.setBackground(Theme.createSelectorDrawable(getThemedColor("inappPlayerPlayPause") & 436207615, 1, AndroidUtilities.m36dp(14.0f)));
        }
        addView(this.playButton, LayoutHelper.createFrame(36, 36, 51));
        this.playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                FragmentContextView.this.lambda$new$0(view4);
            }
        });
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.importingImageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.importingImageView.setAutoRepeat(true);
        this.importingImageView.setAnimation(C1072R.raw.import_progress, 30, 30);
        this.importingImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.m36dp(22.0f), getThemedColor("inappPlayerPlayPause")));
        addView(this.importingImageView, LayoutHelper.createFrame(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = new AudioPlayerAlert.ClippingTextViewSwitcher(context) {
            @Override
            protected TextView createTextView() {
                TextView textView = new TextView(context);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(19);
                if (FragmentContextView.this.currentStyle != 0 && FragmentContextView.this.currentStyle != 2) {
                    if (FragmentContextView.this.currentStyle != 4) {
                        if (FragmentContextView.this.currentStyle == 1 || FragmentContextView.this.currentStyle == 3) {
                            textView.setGravity(19);
                            textView.setTextColor(FragmentContextView.this.getThemedColor("returnToCallText"));
                            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                            textView.setTextSize(1, 14.0f);
                        }
                    } else {
                        textView.setGravity(51);
                        textView.setTextColor(FragmentContextView.this.getThemedColor("inappPlayerPerformer"));
                        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        textView.setTextSize(1, 15.0f);
                    }
                } else {
                    textView.setGravity(19);
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setTextSize(1, 15.0f);
                }
                return textView;
            }
        };
        this.titleTextView = clippingTextViewSwitcher;
        addView(clippingTextViewSwitcher, LayoutHelper.createFrame(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher2 = new AudioPlayerAlert.ClippingTextViewSwitcher(context) {
            @Override
            protected TextView createTextView() {
                TextView textView = new TextView(context);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(FragmentContextView.this.getThemedColor("inappPlayerClose"));
                return textView;
            }
        };
        this.subtitleTextView = clippingTextViewSwitcher2;
        addView(clippingTextViewSwitcher2, LayoutHelper.createFrame(-1, 36.0f, 51, 35.0f, 10.0f, 36.0f, 0.0f));
        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable();
        this.joinButtonFlicker = cellFlickerDrawable;
        cellFlickerDrawable.setProgress(2.0f);
        this.joinButtonFlicker.repeatEnabled = false;
        TextView textView = new TextView(context) {
            @Override
            public void draw(Canvas canvas) {
                super.draw(canvas);
                int m36dp = AndroidUtilities.m36dp(1.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f2 = m36dp;
                rectF.set(f2, f2, getWidth() - m36dp, getHeight() - m36dp);
                FragmentContextView.this.joinButtonFlicker.draw(canvas, rectF, AndroidUtilities.m36dp(16.0f), this);
                if (FragmentContextView.this.joinButtonFlicker.getProgress() >= 1.0f || FragmentContextView.this.joinButtonFlicker.repeatEnabled) {
                    return;
                }
                invalidate();
            }

            @Override
            protected void onSizeChanged(int i3, int i4, int i5, int i6) {
                super.onSizeChanged(i3, i4, i5, i6);
                FragmentContextView.this.joinButtonFlicker.setParentWidth(getWidth());
            }
        };
        this.joinButton = textView;
        textView.setText(LocaleController.getString("VoipChatJoin", C1072R.string.VoipChatJoin));
        this.joinButton.setTextColor(getThemedColor("featuredStickers_buttonText"));
        this.joinButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m36dp(16.0f), getThemedColor("featuredStickers_addButton"), getThemedColor("featuredStickers_addButtonPressed")));
        this.joinButton.setTextSize(1, 14.0f);
        this.joinButton.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.joinButton.setGravity(17);
        this.joinButton.setPadding(AndroidUtilities.m36dp(14.0f), 0, AndroidUtilities.m36dp(14.0f), 0);
        addView(this.joinButton, LayoutHelper.createFrame(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                FragmentContextView.this.lambda$new$1(view4);
            }
        });
        this.silentButton = new FrameLayout(context);
        ImageView imageView3 = new ImageView(context);
        this.silentButtonImage = imageView3;
        imageView3.setImageResource(C1072R.C1073drawable.msg_mute);
        this.silentButtonImage.setColorFilter(new PorterDuffColorFilter(getThemedColor("inappPlayerClose"), PorterDuff.Mode.MULTIPLY));
        this.silentButton.addView(this.silentButtonImage, LayoutHelper.createFrame(20, 20, 17));
        if (i2 >= 21) {
            this.silentButton.setBackground(Theme.createSelectorDrawable(getThemedColor("inappPlayerClose") & 436207615, 1, AndroidUtilities.m36dp(14.0f)));
        }
        this.silentButton.setContentDescription(LocaleController.getString("Unmute", C1072R.string.Unmute));
        this.silentButton.setOnClickListener(FragmentContextView$$ExternalSyntheticLambda8.INSTANCE);
        this.silentButton.setVisibility(8);
        addView(this.silentButton, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (z) {
            i = 51;
            f = 14.0f;
        } else {
            i = 51;
            f = 14.0f;
            ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, (ActionBarMenu) null, 0, getThemedColor("dialogTextBlack"), resourcesProvider);
            this.playbackSpeedButton = actionBarMenuItem;
            actionBarMenuItem.setLongClickEnabled(false);
            this.playbackSpeedButton.setVisibility(8);
            this.playbackSpeedButton.setTag(null);
            this.playbackSpeedButton.setShowSubmenuByMove(false);
            this.playbackSpeedButton.setContentDescription(LocaleController.getString("AccDescrPlayerSpeed", C1072R.string.AccDescrPlayerSpeed));
            this.playbackSpeedButton.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
                @Override
                public final void onItemClick(int i3) {
                    FragmentContextView.this.lambda$new$3(i3);
                }
            });
            this.speedItems[0] = this.playbackSpeedButton.addSubItem(1, C1072R.C1073drawable.msg_speed_0_5, LocaleController.getString("SpeedSlow", C1072R.string.SpeedSlow));
            this.speedItems[1] = this.playbackSpeedButton.addSubItem(2, C1072R.C1073drawable.msg_speed_1, LocaleController.getString("SpeedNormal", C1072R.string.SpeedNormal));
            this.speedItems[2] = this.playbackSpeedButton.addSubItem(3, C1072R.C1073drawable.msg_speed_1_5, LocaleController.getString("SpeedFast", C1072R.string.SpeedFast));
            this.speedItems[3] = this.playbackSpeedButton.addSubItem(4, C1072R.C1073drawable.msg_speed_2, LocaleController.getString("SpeedVeryFast", C1072R.string.SpeedVeryFast));
            if (AndroidUtilities.density >= 3.0f) {
                this.playbackSpeedButton.setPadding(0, 1, 0, 0);
            }
            this.playbackSpeedButton.setAdditionalXOffset(AndroidUtilities.m36dp(8.0f));
            addView(this.playbackSpeedButton, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
            this.playbackSpeedButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view4) {
                    FragmentContextView.this.lambda$new$4(view4);
                }
            });
            this.playbackSpeedButton.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view4) {
                    boolean lambda$new$5;
                    lambda$new$5 = FragmentContextView.this.lambda$new$5(view4);
                    return lambda$new$5;
                }
            });
            updatePlaybackButton();
        }
        AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
        this.avatars = avatarsImageView;
        avatarsImageView.setAvatarsTextSize(AndroidUtilities.m36dp(21.0f));
        this.avatars.setDelegate(new Runnable() {
            @Override
            public final void run() {
                FragmentContextView.this.lambda$new$6();
            }
        });
        this.avatars.setVisibility(8);
        addView(this.avatars, LayoutHelper.createFrame(108, 36, i));
        int i3 = C1072R.raw.voice_muted;
        this.muteDrawable = new RLottieDrawable(i3, "" + i3, AndroidUtilities.m36dp(16.0f), AndroidUtilities.m36dp(20.0f), true, null);
        C23477 c23477 = new C23477(context);
        this.muteButton = c23477;
        c23477.setColorFilter(new PorterDuffColorFilter(getThemedColor("returnToCallText"), PorterDuff.Mode.MULTIPLY));
        if (i2 >= 21) {
            this.muteButton.setBackground(Theme.createSelectorDrawable(getThemedColor("inappPlayerClose") & 436207615, 1, AndroidUtilities.m36dp(f)));
        }
        this.muteButton.setAnimation(this.muteDrawable);
        this.muteButton.setScaleType(ImageView.ScaleType.CENTER);
        this.muteButton.setVisibility(8);
        addView(this.muteButton, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.muteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                FragmentContextView.this.lambda$new$7(view4);
            }
        });
        ImageView imageView4 = new ImageView(context);
        this.closeButton = imageView4;
        imageView4.setImageResource(C1072R.C1073drawable.miniplayer_close);
        this.closeButton.setColorFilter(new PorterDuffColorFilter(getThemedColor("inappPlayerClose"), PorterDuff.Mode.MULTIPLY));
        if (i2 >= 21) {
            this.closeButton.setBackground(Theme.createSelectorDrawable(getThemedColor("inappPlayerClose") & 436207615, 1, AndroidUtilities.m36dp(f)));
        }
        this.closeButton.setScaleType(ImageView.ScaleType.CENTER);
        addView(this.closeButton, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                FragmentContextView.this.lambda$new$9(resourcesProvider, view4);
            }
        });
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                FragmentContextView.this.lambda$new$11(resourcesProvider, baseFragment, view4);
            }
        });
    }

    public void lambda$new$0(View view) {
        if (this.currentStyle == 0) {
            if (MediaController.getInstance().isMessagePaused()) {
                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
            }
        }
    }

    public void lambda$new$1(View view) {
        callOnClick();
    }

    public static void lambda$new$2(View view) {
        MediaController.getInstance().updateSilent(false);
    }

    public void lambda$new$3(int i) {
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.isMusic);
        if (i == 1) {
            MediaController.getInstance().setPlaybackSpeed(this.isMusic, 0.5f);
        } else if (i == 2) {
            MediaController.getInstance().setPlaybackSpeed(this.isMusic, 1.0f);
        } else if (i == 3) {
            MediaController.getInstance().setPlaybackSpeed(this.isMusic, 1.5f);
        } else {
            MediaController.getInstance().setPlaybackSpeed(this.isMusic, 1.8f);
        }
        float playbackSpeed2 = MediaController.getInstance().getPlaybackSpeed(this.isMusic);
        if (playbackSpeed != playbackSpeed2) {
            playbackSpeedChanged(playbackSpeed2);
        }
        updatePlaybackButton();
    }

    public void lambda$new$4(View view) {
        float f = 1.0f;
        if (Math.abs(MediaController.getInstance().getPlaybackSpeed(this.isMusic) - 1.0f) > 0.001f) {
            MediaController.getInstance().setPlaybackSpeed(this.isMusic, 1.0f);
        } else {
            MediaController mediaController = MediaController.getInstance();
            boolean z = this.isMusic;
            float fastPlaybackSpeed = MediaController.getInstance().getFastPlaybackSpeed(this.isMusic);
            mediaController.setPlaybackSpeed(z, fastPlaybackSpeed);
            f = fastPlaybackSpeed;
        }
        playbackSpeedChanged(f);
    }

    public boolean lambda$new$5(View view) {
        this.playbackSpeedButton.toggleSubMenu();
        return true;
    }

    public void lambda$new$6() {
        updateAvatars(true);
    }

    public class C23477 extends RLottieImageView {
        private final Runnable pressRunnable;
        boolean pressed;
        boolean scheduled;
        private final Runnable toggleMicRunnable;

        C23477(Context context) {
            super(context);
            this.toggleMicRunnable = new Runnable() {
                @Override
                public final void run() {
                    FragmentContextView.C23477.this.lambda$$0();
                }
            };
            this.pressRunnable = new Runnable() {
                @Override
                public final void run() {
                    FragmentContextView.C23477.this.lambda$$1();
                }
            };
        }

        public void lambda$$0() {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            VoIPService.getSharedInstance().setMicMute(false, true, false);
            if (FragmentContextView.this.muteDrawable.setCustomEndFrame(FragmentContextView.this.isMuted ? 15 : 29)) {
                if (FragmentContextView.this.isMuted) {
                    FragmentContextView.this.muteDrawable.setCurrentFrame(0);
                } else {
                    FragmentContextView.this.muteDrawable.setCurrentFrame(14);
                }
            }
            FragmentContextView.this.muteButton.playAnimation();
            Theme.getFragmentContextViewWavesDrawable().updateState(true);
        }

        public void lambda$$1() {
            if (!this.scheduled || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.scheduled = false;
            this.pressed = true;
            FragmentContextView.this.isMuted = false;
            AndroidUtilities.runOnUIThread(this.toggleMicRunnable, 90L);
            FragmentContextView.this.muteButton.performHapticFeedback(3, 2);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (FragmentContextView.this.currentStyle == 3 || FragmentContextView.this.currentStyle == 1) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    AndroidUtilities.cancelRunOnUIThread(this.pressRunnable);
                    AndroidUtilities.cancelRunOnUIThread(this.toggleMicRunnable);
                    this.scheduled = false;
                    this.pressed = false;
                    return true;
                }
                if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
                    AndroidUtilities.runOnUIThread(this.pressRunnable, 300L);
                    this.scheduled = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(this.toggleMicRunnable);
                    if (this.scheduled) {
                        AndroidUtilities.cancelRunOnUIThread(this.pressRunnable);
                        this.scheduled = false;
                    } else if (this.pressed) {
                        FragmentContextView.this.isMuted = true;
                        if (FragmentContextView.this.muteDrawable.setCustomEndFrame(15)) {
                            if (FragmentContextView.this.isMuted) {
                                FragmentContextView.this.muteDrawable.setCurrentFrame(0);
                            } else {
                                FragmentContextView.this.muteDrawable.setCurrentFrame(14);
                            }
                        }
                        FragmentContextView.this.muteButton.playAnimation();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(true, true, false);
                            FragmentContextView.this.muteButton.performHapticFeedback(3, 2);
                        }
                        this.pressed = false;
                        Theme.getFragmentContextViewWavesDrawable().updateState(true);
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        super.onTouchEvent(obtain);
                        obtain.recycle();
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            String str;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Button.class.getName());
            if (FragmentContextView.this.isMuted) {
                i = C1072R.string.VoipUnmute;
                str = "VoipUnmute";
            } else {
                i = C1072R.string.VoipMute;
                str = "VoipMute";
            }
            accessibilityNodeInfo.setText(LocaleController.getString(str, i));
        }
    }

    public void lambda$new$7(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.groupCall != null) {
            AccountInstance.getInstance(sharedInstance.getAccount());
            ChatObject.Call call = sharedInstance.groupCall;
            TLRPC$Chat chat = sharedInstance.getChat();
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = call.participants.get(sharedInstance.getSelfId());
            if (tLRPC$TL_groupCallParticipant != null && !tLRPC$TL_groupCallParticipant.can_self_unmute && tLRPC$TL_groupCallParticipant.muted && !ChatObject.canManageCalls(chat)) {
                return;
            }
        }
        boolean z = !sharedInstance.isMicMute();
        this.isMuted = z;
        sharedInstance.setMicMute(z, false, true);
        if (this.muteDrawable.setCustomEndFrame(this.isMuted ? 15 : 29)) {
            if (this.isMuted) {
                this.muteDrawable.setCurrentFrame(0);
            } else {
                this.muteDrawable.setCurrentFrame(14);
            }
        }
        this.muteButton.playAnimation();
        Theme.getFragmentContextViewWavesDrawable().updateState(true);
        this.muteButton.performHapticFeedback(3, 2);
    }

    public void lambda$new$9(Theme.ResourcesProvider resourcesProvider, View view) {
        if (this.currentStyle == 2) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.fragment.getParentActivity(), resourcesProvider);
            builder.setTitle(LocaleController.getString("StopLiveLocationAlertToTitle", C1072R.string.StopLiveLocationAlertToTitle));
            if (this.fragment instanceof DialogsActivity) {
                builder.setMessage(LocaleController.getString("StopLiveLocationAlertAllText", C1072R.string.StopLiveLocationAlertAllText));
            } else {
                TLRPC$Chat currentChat = this.chatActivity.getCurrentChat();
                TLRPC$User currentUser = this.chatActivity.getCurrentUser();
                if (currentChat != null) {
                    builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", C1072R.string.StopLiveLocationAlertToGroupText, currentChat.title)));
                } else if (currentUser != null) {
                    builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", C1072R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(currentUser))));
                } else {
                    builder.setMessage(LocaleController.getString("AreYouSure", C1072R.string.AreYouSure));
                }
            }
            builder.setPositiveButton(LocaleController.getString("Stop", C1072R.string.Stop), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    FragmentContextView.this.lambda$new$8(dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", C1072R.string.Cancel), null);
            AlertDialog create = builder.create();
            builder.show();
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor("dialogTextRed2"));
                return;
            }
            return;
        }
        MediaController.getInstance().cleanupPlayer(true, true);
    }

    public void lambda$new$8(DialogInterface dialogInterface, int i) {
        BaseFragment baseFragment = this.fragment;
        if (!(baseFragment instanceof DialogsActivity)) {
            LocationController.getInstance(baseFragment.getCurrentAccount()).removeSharingLocation(this.chatActivity.getDialogId());
            return;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            LocationController.getInstance(i2).removeAllLocationSharings();
        }
    }

    public void lambda$new$11(Theme.ResourcesProvider resourcesProvider, BaseFragment baseFragment, View view) {
        ChatObject.Call groupCall;
        long j;
        int i = this.currentStyle;
        if (i == 0) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (this.fragment == null || playingMessageObject == null) {
                return;
            }
            if (playingMessageObject.isMusic()) {
                if (getContext() instanceof LaunchActivity) {
                    this.fragment.showDialog(new AudioPlayerAlert(getContext(), resourcesProvider));
                    return;
                }
                return;
            }
            ChatActivityInterface chatActivityInterface = this.chatActivity;
            if (playingMessageObject.getDialogId() == (chatActivityInterface != null ? chatActivityInterface.getDialogId() : 0L)) {
                this.chatActivity.scrollToMessageId(playingMessageObject.getId(), 0, false, 0, true, 0);
                return;
            }
            long dialogId = playingMessageObject.getDialogId();
            Bundle bundle = new Bundle();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
            } else if (DialogObject.isUserDialog(dialogId)) {
                bundle.putLong("user_id", dialogId);
            } else {
                bundle.putLong("chat_id", -dialogId);
            }
            bundle.putInt("message_id", playingMessageObject.getId());
            this.fragment.presentFragment(new ChatActivity(bundle), this.fragment instanceof ChatActivity);
            return;
        }
        boolean z = true;
        if (i == 1) {
            getContext().startActivity(new Intent(getContext(), LaunchActivity.class).setAction("voip"));
        } else if (i == 2) {
            int i2 = UserConfig.selectedAccount;
            ChatActivityInterface chatActivityInterface2 = this.chatActivity;
            if (chatActivityInterface2 != null) {
                j = chatActivityInterface2.getDialogId();
                i2 = this.fragment.getCurrentAccount();
            } else {
                if (LocationController.getLocationsCount() == 1) {
                    for (int i3 = 0; i3 < 4; i3++) {
                        if (!LocationController.getInstance(i3).sharingLocationsUI.isEmpty()) {
                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i3).sharingLocationsUI.get(0);
                            j = sharingLocationInfo.did;
                            i2 = sharingLocationInfo.messageObject.currentAccount;
                            break;
                        }
                    }
                }
                j = 0;
            }
            if (j != 0) {
                openSharingLocation(LocationController.getInstance(i2).getSharingLocationInfo(j));
            } else {
                this.fragment.showDialog(new SharingLocationsAlert(getContext(), new SharingLocationsAlert.SharingLocationsAlertDelegate() {
                    @Override
                    public final void didSelectLocation(LocationController.SharingLocationInfo sharingLocationInfo2) {
                        FragmentContextView.this.openSharingLocation(sharingLocationInfo2);
                    }
                }, resourcesProvider));
            }
        } else if (i == 3) {
            if (VoIPService.getSharedInstance() == null || !(getContext() instanceof LaunchActivity)) {
                return;
            }
            GroupCallActivity.create((LaunchActivity) getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
        } else if (i == 4) {
            if (this.fragment.getParentActivity() == null || (groupCall = this.chatActivity.getGroupCall()) == null) {
                return;
            }
            TLRPC$Chat chat = this.fragment.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
            TLRPC$GroupCall tLRPC$GroupCall = groupCall.call;
            Boolean valueOf = Boolean.valueOf((tLRPC$GroupCall == null || tLRPC$GroupCall.rtmp_stream) ? false : false);
            Activity parentActivity = this.fragment.getParentActivity();
            BaseFragment baseFragment2 = this.fragment;
            VoIPHelper.startCall(chat, null, null, false, valueOf, parentActivity, baseFragment2, baseFragment2.getAccountInstance());
        } else if (i == 5 && baseFragment.getSendMessagesHelper().getImportingHistory(((ChatActivity) baseFragment).getDialogId()) != null) {
            ImportingAlert importingAlert = new ImportingAlert(getContext(), null, (ChatActivity) this.fragment, resourcesProvider);
            importingAlert.setOnHideListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    FragmentContextView.this.lambda$new$10(dialogInterface);
                }
            });
            this.fragment.showDialog(importingAlert);
            checkImport(false);
        }
    }

    public void lambda$new$10(DialogInterface dialogInterface) {
        checkImport(false);
    }

    public void setSupportsCalls(boolean z) {
        this.supportsCalls = z;
    }

    public void setDelegate(FragmentContextViewDelegate fragmentContextViewDelegate) {
        this.delegate = fragmentContextViewDelegate;
    }

    private void updatePlaybackButton() {
        if (this.playbackSpeedButton == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.isMusic);
        float fastPlaybackSpeed = MediaController.getInstance().getFastPlaybackSpeed(this.isMusic);
        if (Math.abs(fastPlaybackSpeed - 1.8f) < 0.001f) {
            this.playbackSpeedButton.setIcon(C1072R.C1073drawable.voice_mini_2_0);
        } else if (Math.abs(fastPlaybackSpeed - 1.5f) < 0.001f) {
            this.playbackSpeedButton.setIcon(C1072R.C1073drawable.voice_mini_1_5);
        } else {
            this.playbackSpeedButton.setIcon(C1072R.C1073drawable.voice_mini_0_5);
        }
        updateColors();
        for (int i = 0; i < this.speedItems.length; i++) {
            if ((i == 0 && Math.abs(playbackSpeed - 0.5f) < 0.001f) || ((i == 1 && Math.abs(playbackSpeed - 1.0f) < 0.001f) || ((i == 2 && Math.abs(playbackSpeed - 1.5f) < 0.001f) || (i == 3 && Math.abs(playbackSpeed - 1.8f) < 0.001f)))) {
                this.speedItems[i].setColors(getThemedColor("inappPlayerPlayPause"), getThemedColor("inappPlayerPlayPause"));
            } else {
                this.speedItems[i].setColors(getThemedColor("actionBarDefaultSubmenuItem"), getThemedColor("actionBarDefaultSubmenuItemIcon"));
            }
        }
    }

    public void updateColors() {
        if (this.playbackSpeedButton != null) {
            String str = Math.abs(MediaController.getInstance().getPlaybackSpeed(this.isMusic) - 1.0f) > 0.001f ? "inappPlayerPlayPause" : "inappPlayerClose";
            this.playbackSpeedButton.setIconColor(getThemedColor(str));
            if (Build.VERSION.SDK_INT >= 21) {
                this.playbackSpeedButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(str) & 436207615, 1, AndroidUtilities.m36dp(14.0f)));
            }
        }
    }

    public void setAdditionalContextView(FragmentContextView fragmentContextView) {
        this.additionalContextView = fragmentContextView;
    }

    public void openSharingLocation(final LocationController.SharingLocationInfo sharingLocationInfo) {
        if (sharingLocationInfo == null || !(this.fragment.getParentActivity() instanceof LaunchActivity)) {
            return;
        }
        LaunchActivity launchActivity = (LaunchActivity) this.fragment.getParentActivity();
        launchActivity.switchToAccount(sharingLocationInfo.messageObject.currentAccount, true);
        LocationActivity locationActivity = new LocationActivity(2);
        locationActivity.setMessageObject(sharingLocationInfo.messageObject);
        final long dialogId = sharingLocationInfo.messageObject.getDialogId();
        locationActivity.setDelegate(new LocationActivity.LocationActivityDelegate() {
            @Override
            public final void didSelectLocation(TLRPC$MessageMedia tLRPC$MessageMedia, int i, boolean z, int i2) {
                FragmentContextView.lambda$openSharingLocation$12(LocationController.SharingLocationInfo.this, dialogId, tLRPC$MessageMedia, i, z, i2);
            }
        });
        launchActivity.lambda$runLinkRequest$71(locationActivity);
    }

    public static void lambda$openSharingLocation$12(LocationController.SharingLocationInfo sharingLocationInfo, long j, TLRPC$MessageMedia tLRPC$MessageMedia, int i, boolean z, int i2) {
        SendMessagesHelper.getInstance(sharingLocationInfo.messageObject.currentAccount).sendMessage(tLRPC$MessageMedia, j, (MessageObject) null, (MessageObject) null, (TLRPC$ReplyMarkup) null, (HashMap<String, String>) null, z, i2);
    }

    @Keep
    public float getTopPadding() {
        return this.topPadding;
    }

    private void checkVisibility() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.FragmentContextView.checkVisibility():void");
    }

    @Keep
    public void setTopPadding(float f) {
        this.topPadding = f;
        if (this.fragment == null || getParent() == null) {
            return;
        }
        View view = this.applyingView;
        if (view == null) {
            view = this.fragment.getFragmentView();
        }
        FragmentContextView fragmentContextView = this.additionalContextView;
        int m36dp = (fragmentContextView == null || fragmentContextView.getVisibility() != 0 || this.additionalContextView.getParent() == null) ? 0 : AndroidUtilities.m36dp(this.additionalContextView.getStyleHeight());
        if (view == null || getParent() == null) {
            return;
        }
        view.setPadding(0, ((int) (getVisibility() == 0 ? this.topPadding : 0.0f)) + m36dp, 0, 0);
    }

    private void updateStyle(int i) {
        int i2 = this.currentStyle;
        if (i2 == i) {
            return;
        }
        boolean z = true;
        if (i2 == 3 || i2 == 1) {
            Theme.getFragmentContextViewWavesDrawable().removeParent(this);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
        }
        this.currentStyle = i;
        this.frameLayout.setWillNotDraw(i != 4);
        if (i != 4) {
            this.timeLayout = null;
        }
        AvatarsImageView avatarsImageView = this.avatars;
        if (avatarsImageView != null) {
            avatarsImageView.setStyle(this.currentStyle);
            this.avatars.setLayoutParams(LayoutHelper.createFrame(108, getStyleHeight(), 51));
        }
        this.frameLayout.setLayoutParams(LayoutHelper.createFrame(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.shadow.setLayoutParams(LayoutHelper.createFrame(-1, 2.0f, 51, 0.0f, getStyleHeight(), 0.0f, 0.0f));
        float f = this.topPadding;
        if (f > 0.0f && f != AndroidUtilities.dp2(getStyleHeight())) {
            updatePaddings();
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (i == 5) {
            this.selector.setBackground(Theme.getSelectorDrawable(false));
            this.frameLayout.setBackgroundColor(getThemedColor("inappPlayerBackground"));
            this.frameLayout.setTag("inappPlayerBackground");
            int i3 = 0;
            while (i3 < 2) {
                AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.titleTextView;
                TextView textView = i3 == 0 ? clippingTextViewSwitcher.getTextView() : clippingTextViewSwitcher.getNextTextView();
                if (textView != null) {
                    textView.setGravity(19);
                    textView.setTextColor(getThemedColor("inappPlayerTitle"));
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setTextSize(1, 15.0f);
                }
                i3++;
            }
            this.titleTextView.setTag("inappPlayerTitle");
            this.subtitleTextView.setVisibility(8);
            this.joinButton.setVisibility(8);
            this.closeButton.setVisibility(8);
            this.playButton.setVisibility(8);
            this.muteButton.setVisibility(8);
            this.avatars.setVisibility(8);
            this.importingImageView.setVisibility(0);
            this.importingImageView.playAnimation();
            this.closeButton.setContentDescription(LocaleController.getString("AccDescrClosePlayer", C1072R.string.AccDescrClosePlayer));
            ActionBarMenuItem actionBarMenuItem = this.playbackSpeedButton;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
                this.playbackSpeedButton.setTag(null);
            }
            this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
        } else if (i == 0 || i == 2) {
            this.selector.setBackground(Theme.getSelectorDrawable(false));
            this.frameLayout.setBackgroundColor(getThemedColor("inappPlayerBackground"));
            this.frameLayout.setTag("inappPlayerBackground");
            this.subtitleTextView.setVisibility(8);
            this.joinButton.setVisibility(8);
            this.closeButton.setVisibility(0);
            this.playButton.setVisibility(0);
            this.muteButton.setVisibility(8);
            this.importingImageView.setVisibility(8);
            this.importingImageView.stopAnimation();
            this.avatars.setVisibility(8);
            int i4 = 0;
            while (i4 < 2) {
                AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher2 = this.titleTextView;
                TextView textView2 = i4 == 0 ? clippingTextViewSwitcher2.getTextView() : clippingTextViewSwitcher2.getNextTextView();
                if (textView2 != null) {
                    textView2.setGravity(19);
                    textView2.setTextColor(getThemedColor("inappPlayerTitle"));
                    textView2.setTypeface(Typeface.DEFAULT);
                    textView2.setTextSize(1, 15.0f);
                }
                i4++;
            }
            this.titleTextView.setTag("inappPlayerTitle");
            if (i == 0) {
                this.playButton.setLayoutParams(LayoutHelper.createFrame(36, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
                ActionBarMenuItem actionBarMenuItem2 = this.playbackSpeedButton;
                if (actionBarMenuItem2 != null) {
                    actionBarMenuItem2.setVisibility(0);
                    this.playbackSpeedButton.setTag(1);
                }
                this.closeButton.setContentDescription(LocaleController.getString("AccDescrClosePlayer", C1072R.string.AccDescrClosePlayer));
                return;
            }
            this.playButton.setLayoutParams(LayoutHelper.createFrame(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
            this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 36.0f, 51, 51.0f, 0.0f, 36.0f, 0.0f));
            this.closeButton.setContentDescription(LocaleController.getString("AccDescrStopLiveLocation", C1072R.string.AccDescrStopLiveLocation));
        } else if (i == 4) {
            this.selector.setBackground(Theme.getSelectorDrawable(false));
            this.frameLayout.setBackgroundColor(getThemedColor("inappPlayerBackground"));
            this.frameLayout.setTag("inappPlayerBackground");
            this.muteButton.setVisibility(8);
            this.subtitleTextView.setVisibility(0);
            int i5 = 0;
            while (i5 < 2) {
                AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher3 = this.titleTextView;
                TextView textView3 = i5 == 0 ? clippingTextViewSwitcher3.getTextView() : clippingTextViewSwitcher3.getNextTextView();
                if (textView3 != null) {
                    textView3.setGravity(51);
                    textView3.setTextColor(getThemedColor("inappPlayerPerformer"));
                    textView3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                    textView3.setTextSize(1, 15.0f);
                }
                i5++;
            }
            this.titleTextView.setTag("inappPlayerPerformer");
            this.titleTextView.setPadding(0, 0, 0, 0);
            this.importingImageView.setVisibility(8);
            this.importingImageView.stopAnimation();
            ChatActivityInterface chatActivityInterface = this.chatActivity;
            this.avatars.setVisibility(!((chatActivityInterface == null || chatActivityInterface.getGroupCall() == null || this.chatActivity.getGroupCall().call == null || !this.chatActivity.getGroupCall().call.rtmp_stream) ? false : false) ? 0 : 8);
            if (this.avatars.getVisibility() != 8) {
                updateAvatars(false);
            } else {
                this.titleTextView.setTranslationX(-AndroidUtilities.m36dp(36.0f));
                this.subtitleTextView.setTranslationX(-AndroidUtilities.m36dp(36.0f));
            }
            this.closeButton.setVisibility(8);
            this.playButton.setVisibility(8);
            ActionBarMenuItem actionBarMenuItem3 = this.playbackSpeedButton;
            if (actionBarMenuItem3 != null) {
                actionBarMenuItem3.setVisibility(8);
                this.playbackSpeedButton.setTag(null);
            }
        } else if (i == 1 || i == 3) {
            this.selector.setBackground(null);
            updateCallTitle();
            boolean hasRtmpStream = VoIPService.hasRtmpStream();
            this.avatars.setVisibility(!hasRtmpStream ? 0 : 8);
            if (i == 3 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (this.avatars.getVisibility() != 8) {
                updateAvatars(false);
            } else {
                this.titleTextView.setTranslationX(0.0f);
                this.subtitleTextView.setTranslationX(0.0f);
            }
            this.muteButton.setVisibility(!hasRtmpStream ? 0 : 8);
            boolean z2 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            this.isMuted = z2;
            this.muteDrawable.setCustomEndFrame(z2 ? 15 : 29);
            RLottieDrawable rLottieDrawable = this.muteDrawable;
            rLottieDrawable.setCurrentFrame(rLottieDrawable.getCustomEndFrame() - 1, false, true);
            this.muteButton.invalidate();
            this.frameLayout.setBackground(null);
            this.frameLayout.setBackgroundColor(0);
            this.importingImageView.setVisibility(8);
            this.importingImageView.stopAnimation();
            Theme.getFragmentContextViewWavesDrawable().addParent(this);
            invalidate();
            int i6 = 0;
            while (i6 < 2) {
                AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher4 = this.titleTextView;
                TextView textView4 = i6 == 0 ? clippingTextViewSwitcher4.getTextView() : clippingTextViewSwitcher4.getNextTextView();
                if (textView4 != null) {
                    textView4.setGravity(19);
                    textView4.setTextColor(getThemedColor("returnToCallText"));
                    textView4.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                    textView4.setTextSize(1, 14.0f);
                }
                i6++;
            }
            this.titleTextView.setTag("returnToCallText");
            this.closeButton.setVisibility(8);
            this.playButton.setVisibility(8);
            this.subtitleTextView.setVisibility(8);
            this.joinButton.setVisibility(8);
            this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 2.0f));
            this.titleTextView.setPadding(AndroidUtilities.m36dp(112.0f), 0, AndroidUtilities.m36dp(112.0f), 0);
            ActionBarMenuItem actionBarMenuItem4 = this.playbackSpeedButton;
            if (actionBarMenuItem4 != null) {
                actionBarMenuItem4.setVisibility(8);
                this.playbackSpeedButton.setTag(null);
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animatorSet = null;
        }
        if (this.scheduleRunnableScheduled) {
            AndroidUtilities.cancelRunOnUIThread(this.updateScheduleTimeRunnable);
            this.scheduleRunnableScheduled = false;
        }
        this.visible = false;
        NotificationCenter.getInstance(this.account).onAnimationFinish(this.animationIndex);
        this.topPadding = 0.0f;
        if (this.isLocation) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsCacheChanged);
        } else {
            for (int i = 0; i < 4; i++) {
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.historyImportProgressChanged);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.groupCallVisibilityChanged);
        }
        int i2 = this.currentStyle;
        if (i2 == 3 || i2 == 1) {
            Theme.getFragmentContextViewWavesDrawable().removeParent(this);
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.wasDraw = false;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isLocation) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsCacheChanged);
            FragmentContextView fragmentContextView = this.additionalContextView;
            if (fragmentContextView != null) {
                fragmentContextView.checkVisibility();
            }
            checkLiveLocation(true);
        } else {
            for (int i = 0; i < 4; i++) {
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.historyImportProgressChanged);
            }
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.groupCallVisibilityChanged);
            FragmentContextView fragmentContextView2 = this.additionalContextView;
            if (fragmentContextView2 != null) {
                fragmentContextView2.checkVisibility();
            }
            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !GroupCallPip.isShowing()) {
                checkCall(true);
            } else if (this.chatActivity != null && this.fragment.getSendMessagesHelper().getImportingHistory(this.chatActivity.getDialogId()) != null && !isPlayingVoice()) {
                checkImport(true);
            } else {
                ChatActivityInterface chatActivityInterface = this.chatActivity;
                if (chatActivityInterface != null && chatActivityInterface.getGroupCall() != null && this.chatActivity.getGroupCall().shouldShowPanel() && !GroupCallPip.isShowing() && !isPlayingVoice()) {
                    checkCall(true);
                } else {
                    checkCall(true);
                    checkPlayer(true);
                    updatePlaybackButton();
                }
            }
        }
        int i2 = this.currentStyle;
        if (i2 == 3 || i2 == 1) {
            Theme.getFragmentContextViewWavesDrawable().addParent(this);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.isMuted != z) {
                this.isMuted = z;
                this.muteDrawable.setCustomEndFrame(z ? 15 : 29);
                RLottieDrawable rLottieDrawable = this.muteDrawable;
                rLottieDrawable.setCurrentFrame(rLottieDrawable.getCustomEndFrame() - 1, false, true);
                this.muteButton.invalidate();
            }
        } else if (i2 == 4 && !this.scheduleRunnableScheduled) {
            this.scheduleRunnableScheduled = true;
            this.updateScheduleTimeRunnable.run();
        }
        if (this.visible && this.topPadding == 0.0f) {
            updatePaddings();
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.speakerAmplitude = 0.0f;
        this.micAmplitude = 0.0f;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, AndroidUtilities.dp2(getStyleHeight() + 2));
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant;
        if (i == NotificationCenter.liveLocationsChanged) {
            checkLiveLocation(false);
        } else if (i == NotificationCenter.liveLocationsCacheChanged) {
            if (this.chatActivity != null) {
                if (this.chatActivity.getDialogId() == ((Long) objArr[0]).longValue()) {
                    checkLocationString();
                }
            }
        } else if (i == NotificationCenter.messagePlayingDidStart || i == NotificationCenter.messagePlayingPlayStateChanged || i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.didEndCall) {
            int i3 = this.currentStyle;
            if (i3 == 1 || i3 == 3 || i3 == 4) {
                checkCall(false);
            }
            checkPlayer(false);
        } else {
            int i4 = NotificationCenter.didStartedCall;
            if (i == i4 || i == NotificationCenter.groupCallUpdated || i == NotificationCenter.groupCallVisibilityChanged) {
                checkCall(false);
                if (this.currentStyle != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
                    return;
                }
                if (i == i4) {
                    sharedInstance.registerStateListener(this);
                }
                int callState = sharedInstance.getCallState();
                if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || (tLRPC$TL_groupCallParticipant = sharedInstance.groupCall.participants.get(sharedInstance.getSelfId())) == null || tLRPC$TL_groupCallParticipant.can_self_unmute || !tLRPC$TL_groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                    return;
                }
                sharedInstance.setMicMute(true, false, false);
                long uptimeMillis = SystemClock.uptimeMillis();
                this.muteButton.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            } else if (i == NotificationCenter.groupCallTypingsUpdated) {
                if (this.visible && this.currentStyle == 4) {
                    ChatObject.Call groupCall = this.chatActivity.getGroupCall();
                    if (groupCall != null) {
                        if (groupCall.isScheduled()) {
                            this.subtitleTextView.setText(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                        } else {
                            TLRPC$GroupCall tLRPC$GroupCall = groupCall.call;
                            int i5 = tLRPC$GroupCall.participants_count;
                            if (i5 == 0) {
                                this.subtitleTextView.setText(LocaleController.getString(tLRPC$GroupCall.rtmp_stream ? C1072R.string.ViewersWatchingNobody : C1072R.string.MembersTalkingNobody), false);
                            } else {
                                this.subtitleTextView.setText(LocaleController.formatPluralString(tLRPC$GroupCall.rtmp_stream ? "ViewersWatching" : "Participants", i5, new Object[0]), false);
                            }
                        }
                    }
                    updateAvatars(true);
                }
            } else if (i == NotificationCenter.historyImportProgressChanged) {
                int i6 = this.currentStyle;
                if (i6 == 1 || i6 == 3 || i6 == 4) {
                    checkCall(false);
                }
                checkImport(false);
            } else if (i == NotificationCenter.messagePlayingSpeedChanged) {
                updatePlaybackButton();
            } else if (i == NotificationCenter.webRtcMicAmplitudeEvent) {
                if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                    this.micAmplitude = 0.0f;
                } else {
                    this.micAmplitude = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                }
                if (VoIPService.getSharedInstance() != null) {
                    Theme.getFragmentContextViewWavesDrawable().setAmplitude(Math.max(this.speakerAmplitude, this.micAmplitude));
                }
            } else if (i == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
                this.speakerAmplitude = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                    this.micAmplitude = 0.0f;
                }
                if (VoIPService.getSharedInstance() != null) {
                    Theme.getFragmentContextViewWavesDrawable().setAmplitude(Math.max(this.speakerAmplitude, this.micAmplitude));
                }
                this.avatars.invalidate();
            }
        }
    }

    public int getStyleHeight() {
        return this.currentStyle == 4 ? 48 : 36;
    }

    public boolean isCallTypeVisible() {
        int i = this.currentStyle;
        return (i == 1 || i == 3) && this.visible;
    }

    private void checkLiveLocation(boolean z) {
        boolean isSharingLocation;
        String formatPluralString;
        String string;
        View fragmentView = this.fragment.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z = true;
        }
        BaseFragment baseFragment = this.fragment;
        if (baseFragment instanceof DialogsActivity) {
            isSharingLocation = LocationController.getLocationsCount() != 0;
        } else {
            isSharingLocation = LocationController.getInstance(baseFragment.getCurrentAccount()).isSharingLocation(this.chatActivity.getDialogId());
        }
        if (!isSharingLocation) {
            this.lastLocationSharingCount = -1;
            AndroidUtilities.cancelRunOnUIThread(this.checkLocationRunnable);
            if (this.visible) {
                this.visible = false;
                if (z) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.animatorSet = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animatorSet = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.animatorSet.setDuration(200L);
                this.animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                            return;
                        }
                        FragmentContextView.this.setVisibility(8);
                        FragmentContextView.this.animatorSet = null;
                    }
                });
                this.animatorSet.start();
                return;
            }
            return;
        }
        updateStyle(2);
        this.playButton.setImageDrawable(new ShareLocationDrawable(getContext(), 1));
        if (z && this.topPadding == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.visible) {
            if (!z) {
                AnimatorSet animatorSet3 = this.animatorSet;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.animatorSet = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.animatorSet = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.animatorSet.setDuration(200L);
                this.animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                            return;
                        }
                        FragmentContextView.this.animatorSet = null;
                    }
                });
                this.animatorSet.start();
            }
            this.visible = true;
            setVisibility(0);
        }
        if (this.fragment instanceof DialogsActivity) {
            String string2 = LocaleController.getString("LiveLocationContext", C1072R.string.LiveLocationContext);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 4; i++) {
                arrayList.addAll(LocationController.getInstance(i).sharingLocationsUI);
            }
            if (arrayList.size() == 1) {
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) arrayList.get(0);
                long dialogId = sharingLocationInfo.messageObject.getDialogId();
                if (DialogObject.isUserDialog(dialogId)) {
                    formatPluralString = UserObject.getFirstName(MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getUser(Long.valueOf(dialogId)));
                    string = LocaleController.getString("AttachLiveLocationIsSharing", C1072R.string.AttachLiveLocationIsSharing);
                } else {
                    TLRPC$Chat chat = MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getChat(Long.valueOf(-dialogId));
                    formatPluralString = chat != null ? chat.title : "";
                    string = LocaleController.getString("AttachLiveLocationIsSharingChat", C1072R.string.AttachLiveLocationIsSharingChat);
                }
            } else {
                formatPluralString = LocaleController.formatPluralString("Chats", arrayList.size(), new Object[0]);
                string = LocaleController.getString("AttachLiveLocationIsSharingChats", C1072R.string.AttachLiveLocationIsSharingChats);
            }
            String format = String.format(string, string2, formatPluralString);
            int indexOf = format.indexOf(string2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
            int i2 = 0;
            while (i2 < 2) {
                AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.titleTextView;
                TextView textView = i2 == 0 ? clippingTextViewSwitcher.getTextView() : clippingTextViewSwitcher.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                }
                i2++;
            }
            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM), 0, getThemedColor("inappPlayerPerformer")), indexOf, string2.length() + indexOf, 18);
            this.titleTextView.setText(spannableStringBuilder, false);
            return;
        }
        this.checkLocationRunnable.run();
        checkLocationString();
    }

    public void checkLocationString() {
        int i;
        String format;
        ChatActivityInterface chatActivityInterface = this.chatActivity;
        if (chatActivityInterface == null || this.titleTextView == null) {
            return;
        }
        long dialogId = chatActivityInterface.getDialogId();
        int currentAccount = this.fragment.getCurrentAccount();
        ArrayList<TLRPC$Message> arrayList = LocationController.getInstance(currentAccount).locationsCache.get(dialogId);
        if (!this.firstLocationsLoaded) {
            LocationController.getInstance(currentAccount).loadLiveLocations(dialogId);
            this.firstLocationsLoaded = true;
        }
        TLRPC$User tLRPC$User = null;
        if (arrayList != null) {
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
            i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC$Message tLRPC$Message = arrayList.get(i2);
                TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
                if (tLRPC$MessageMedia != null && tLRPC$Message.date + tLRPC$MessageMedia.period > currentTime) {
                    long fromChatId = MessageObject.getFromChatId(tLRPC$Message);
                    if (tLRPC$User == null && fromChatId != clientUserId) {
                        tLRPC$User = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(fromChatId));
                    }
                    i++;
                }
            }
        } else {
            i = 0;
        }
        if (this.lastLocationSharingCount == i) {
            return;
        }
        this.lastLocationSharingCount = i;
        String string = LocaleController.getString("LiveLocationContext", C1072R.string.LiveLocationContext);
        if (i == 0) {
            format = string;
        } else {
            int i3 = i - 1;
            format = LocationController.getInstance(currentAccount).isSharingLocation(dialogId) ? i3 != 0 ? (i3 != 1 || tLRPC$User == null) ? String.format("%1$s - %2$s %3$s", string, LocaleController.getString("ChatYourSelfName", C1072R.string.ChatYourSelfName), LocaleController.formatPluralString("AndOther", i3, new Object[0])) : String.format("%1$s - %2$s", string, LocaleController.formatString("SharingYouAndOtherName", C1072R.string.SharingYouAndOtherName, UserObject.getFirstName(tLRPC$User))) : String.format("%1$s - %2$s", string, LocaleController.getString("ChatYourSelfName", C1072R.string.ChatYourSelfName)) : i3 != 0 ? String.format("%1$s - %2$s %3$s", string, UserObject.getFirstName(tLRPC$User), LocaleController.formatPluralString("AndOther", i3, new Object[0])) : String.format("%1$s - %2$s", string, UserObject.getFirstName(tLRPC$User));
        }
        if (format.equals(this.lastString)) {
            return;
        }
        this.lastString = format;
        int indexOf = format.indexOf(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i4 = 0;
        while (i4 < 2) {
            AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.titleTextView;
            TextView textView = i4 == 0 ? clippingTextViewSwitcher.getTextView() : clippingTextViewSwitcher.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i4++;
        }
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM), 0, getThemedColor("inappPlayerPerformer")), indexOf, string.length() + indexOf, 18);
        }
        this.titleTextView.setText(spannableStringBuilder, false);
    }

    public void checkPlayer(boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        boolean z2 = true;
        if (this.visible) {
            int i = this.currentStyle;
            if (i == 1 || i == 3) {
                return;
            }
            if ((i == 4 || i == 5) && !isPlayingVoice()) {
                return;
            }
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        View fragmentView = this.fragment.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z = true;
        }
        boolean z3 = this.visible;
        if (playingMessageObject == null || playingMessageObject.getId() == 0 || playingMessageObject.isVideo()) {
            this.lastMessageObject = null;
            boolean z4 = (!this.supportsCalls || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || GroupCallPip.isShowing()) ? false : true;
            if (!isPlayingVoice() && !z4 && this.chatActivity != null && !GroupCallPip.isShowing()) {
                ChatObject.Call groupCall = this.chatActivity.getGroupCall();
                z4 = groupCall != null && groupCall.shouldShowPanel();
            }
            if (z4) {
                checkCall(false);
                return;
            } else if (this.visible) {
                ActionBarMenuItem actionBarMenuItem = this.playbackSpeedButton;
                if (actionBarMenuItem != null && actionBarMenuItem.isSubMenuShowing()) {
                    this.playbackSpeedButton.toggleSubMenu();
                }
                this.visible = false;
                if (z) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.animatorSet = null;
                }
                this.animationIndex = NotificationCenter.getInstance(this.account).setAnimationInProgress(this.animationIndex, null);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animatorSet = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.animatorSet.setDuration(200L);
                FragmentContextViewDelegate fragmentContextViewDelegate = this.delegate;
                if (fragmentContextViewDelegate != null) {
                    fragmentContextViewDelegate.onAnimation(true, false);
                }
                this.animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        NotificationCenter.getInstance(FragmentContextView.this.account).onAnimationFinish(FragmentContextView.this.animationIndex);
                        if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                            return;
                        }
                        FragmentContextView.this.setVisibility(8);
                        if (FragmentContextView.this.delegate != null) {
                            FragmentContextView.this.delegate.onAnimation(false, false);
                        }
                        FragmentContextView.this.animatorSet = null;
                        if (!FragmentContextView.this.checkCallAfterAnimation) {
                            if (FragmentContextView.this.checkPlayerAfterAnimation) {
                                FragmentContextView.this.checkPlayer(false);
                            } else if (FragmentContextView.this.checkImportAfterAnimation) {
                                FragmentContextView.this.checkImport(false);
                            }
                        } else {
                            FragmentContextView.this.checkCall(false);
                        }
                        FragmentContextView.this.checkCallAfterAnimation = false;
                        FragmentContextView.this.checkPlayerAfterAnimation = false;
                        FragmentContextView.this.checkImportAfterAnimation = false;
                    }
                });
                this.animatorSet.start();
                return;
            } else {
                setVisibility(8);
                return;
            }
        }
        int i2 = this.currentStyle;
        if (i2 != 0 && this.animatorSet != null && !z) {
            this.checkPlayerAfterAnimation = true;
            return;
        }
        updateStyle(0);
        if (z && this.topPadding == 0.0f) {
            updatePaddings();
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            FragmentContextViewDelegate fragmentContextViewDelegate2 = this.delegate;
            if (fragmentContextViewDelegate2 != null) {
                fragmentContextViewDelegate2.onAnimation(true, true);
                this.delegate.onAnimation(false, true);
            }
        }
        if (!this.visible) {
            if (!z) {
                AnimatorSet animatorSet3 = this.animatorSet;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.animatorSet = null;
                }
                this.animationIndex = NotificationCenter.getInstance(this.account).setAnimationInProgress(this.animationIndex, null);
                this.animatorSet = new AnimatorSet();
                FragmentContextView fragmentContextView = this.additionalContextView;
                if (fragmentContextView != null && fragmentContextView.getVisibility() == 0) {
                    ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = -AndroidUtilities.m36dp(getStyleHeight() + this.additionalContextView.getStyleHeight());
                } else {
                    ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = -AndroidUtilities.m36dp(getStyleHeight());
                }
                FragmentContextViewDelegate fragmentContextViewDelegate3 = this.delegate;
                if (fragmentContextViewDelegate3 != null) {
                    fragmentContextViewDelegate3.onAnimation(true, true);
                }
                this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.animatorSet.setDuration(200L);
                this.animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        NotificationCenter.getInstance(FragmentContextView.this.account).onAnimationFinish(FragmentContextView.this.animationIndex);
                        if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                            return;
                        }
                        if (FragmentContextView.this.delegate != null) {
                            FragmentContextView.this.delegate.onAnimation(false, true);
                        }
                        FragmentContextView.this.animatorSet = null;
                        if (!FragmentContextView.this.checkCallAfterAnimation) {
                            if (FragmentContextView.this.checkPlayerAfterAnimation) {
                                FragmentContextView.this.checkPlayer(false);
                            } else if (FragmentContextView.this.checkImportAfterAnimation) {
                                FragmentContextView.this.checkImport(false);
                            }
                        } else {
                            FragmentContextView.this.checkCall(false);
                        }
                        FragmentContextView.this.checkCallAfterAnimation = false;
                        FragmentContextView.this.checkPlayerAfterAnimation = false;
                        FragmentContextView.this.checkImportAfterAnimation = false;
                    }
                });
                this.animatorSet.start();
            }
            this.visible = true;
            setVisibility(0);
        }
        if (MediaController.getInstance().isMessagePaused()) {
            this.playPauseDrawable.setPause(false, !z);
            this.playButton.setContentDescription(LocaleController.getString("AccActionPlay", C1072R.string.AccActionPlay));
        } else {
            this.playPauseDrawable.setPause(true, !z);
            this.playButton.setContentDescription(LocaleController.getString("AccActionPause", C1072R.string.AccActionPause));
        }
        if (this.lastMessageObject == playingMessageObject && i2 == 0) {
            return;
        }
        this.lastMessageObject = playingMessageObject;
        if (playingMessageObject.isVoice() || this.lastMessageObject.isRoundVideo()) {
            this.isMusic = false;
            ActionBarMenuItem actionBarMenuItem2 = this.playbackSpeedButton;
            if (actionBarMenuItem2 != null) {
                actionBarMenuItem2.setAlpha(1.0f);
                this.playbackSpeedButton.setEnabled(true);
            }
            this.titleTextView.setPadding(0, 0, AndroidUtilities.m36dp(44.0f), 0);
            spannableStringBuilder = new SpannableStringBuilder(String.format("%s %s", playingMessageObject.getMusicAuthor(), playingMessageObject.getMusicTitle()));
            int i3 = 0;
            while (i3 < 2) {
                AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.titleTextView;
                TextView textView = i3 == 0 ? clippingTextViewSwitcher.getTextView() : clippingTextViewSwitcher.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i3++;
            }
            updatePlaybackButton();
        } else {
            this.isMusic = true;
            if (this.playbackSpeedButton != null) {
                if (playingMessageObject.getDuration() >= 600) {
                    this.playbackSpeedButton.setAlpha(1.0f);
                    this.playbackSpeedButton.setEnabled(true);
                    this.titleTextView.setPadding(0, 0, AndroidUtilities.m36dp(44.0f), 0);
                    updatePlaybackButton();
                } else {
                    this.playbackSpeedButton.setAlpha(0.0f);
                    this.playbackSpeedButton.setEnabled(false);
                    this.titleTextView.setPadding(0, 0, 0, 0);
                }
            } else {
                this.titleTextView.setPadding(0, 0, 0, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(String.format("%s - %s", playingMessageObject.getMusicAuthor(), playingMessageObject.getMusicTitle()));
            int i4 = 0;
            while (i4 < 2) {
                AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher2 = this.titleTextView;
                TextView textView2 = i4 == 0 ? clippingTextViewSwitcher2.getTextView() : clippingTextViewSwitcher2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i4++;
            }
        }
        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM), 0, getThemedColor("inappPlayerPerformer")), 0, playingMessageObject.getMusicAuthor().length(), 18);
        this.titleTextView.setText(spannableStringBuilder, (!z && z3 && this.isMusic) ? false : false);
    }

    public void checkImport(boolean z) {
        int i;
        if (this.chatActivity != null) {
            if (this.visible && ((i = this.currentStyle) == 1 || i == 3)) {
                return;
            }
            SendMessagesHelper.ImportingHistory importingHistory = this.fragment.getSendMessagesHelper().getImportingHistory(this.chatActivity.getDialogId());
            View fragmentView = this.fragment.getFragmentView();
            if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z = true;
            }
            Dialog visibleDialog = this.fragment.getVisibleDialog();
            if ((isPlayingVoice() || this.chatActivity.shouldShowImport() || ((visibleDialog instanceof ImportingAlert) && !((ImportingAlert) visibleDialog).isDismissed())) && importingHistory != null) {
                importingHistory = null;
            }
            if (importingHistory == null) {
                if (this.visible && ((z && this.currentStyle == -1) || this.currentStyle == 5)) {
                    this.visible = false;
                    if (z) {
                        if (getVisibility() != 8) {
                            setVisibility(8);
                        }
                        setTopPadding(0.0f);
                        return;
                    }
                    AnimatorSet animatorSet = this.animatorSet;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.animatorSet = null;
                    }
                    final int i2 = this.account;
                    this.animationIndex = NotificationCenter.getInstance(i2).setAnimationInProgress(this.animationIndex, null);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.animatorSet = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.animatorSet.setDuration(220L);
                    this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    this.animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            NotificationCenter.getInstance(i2).onAnimationFinish(FragmentContextView.this.animationIndex);
                            if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                                return;
                            }
                            FragmentContextView.this.setVisibility(8);
                            FragmentContextView.this.animatorSet = null;
                            if (!FragmentContextView.this.checkCallAfterAnimation) {
                                if (FragmentContextView.this.checkPlayerAfterAnimation) {
                                    FragmentContextView.this.checkPlayer(false);
                                } else if (FragmentContextView.this.checkImportAfterAnimation) {
                                    FragmentContextView.this.checkImport(false);
                                }
                            } else {
                                FragmentContextView.this.checkCall(false);
                            }
                            FragmentContextView.this.checkCallAfterAnimation = false;
                            FragmentContextView.this.checkPlayerAfterAnimation = false;
                            FragmentContextView.this.checkImportAfterAnimation = false;
                        }
                    });
                    this.animatorSet.start();
                    return;
                }
                int i3 = this.currentStyle;
                if (i3 == -1 || i3 == 5) {
                    this.visible = false;
                    setVisibility(8);
                }
            } else if (this.currentStyle != 5 && this.animatorSet != null && !z) {
                this.checkImportAfterAnimation = true;
            } else {
                updateStyle(5);
                if (z && this.topPadding == 0.0f) {
                    updatePaddings();
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    FragmentContextViewDelegate fragmentContextViewDelegate = this.delegate;
                    if (fragmentContextViewDelegate != null) {
                        fragmentContextViewDelegate.onAnimation(true, true);
                        this.delegate.onAnimation(false, true);
                    }
                }
                if (!this.visible) {
                    if (!z) {
                        AnimatorSet animatorSet3 = this.animatorSet;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.animatorSet = null;
                        }
                        this.animationIndex = NotificationCenter.getInstance(this.account).setAnimationInProgress(this.animationIndex, null);
                        this.animatorSet = new AnimatorSet();
                        FragmentContextView fragmentContextView = this.additionalContextView;
                        if (fragmentContextView != null && fragmentContextView.getVisibility() == 0) {
                            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = -AndroidUtilities.m36dp(getStyleHeight() + this.additionalContextView.getStyleHeight());
                        } else {
                            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = -AndroidUtilities.m36dp(getStyleHeight());
                        }
                        FragmentContextViewDelegate fragmentContextViewDelegate2 = this.delegate;
                        if (fragmentContextViewDelegate2 != null) {
                            fragmentContextViewDelegate2.onAnimation(true, true);
                        }
                        this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                        this.animatorSet.setDuration(200L);
                        this.animatorSet.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                NotificationCenter.getInstance(FragmentContextView.this.account).onAnimationFinish(FragmentContextView.this.animationIndex);
                                if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                                    return;
                                }
                                if (FragmentContextView.this.delegate != null) {
                                    FragmentContextView.this.delegate.onAnimation(false, true);
                                }
                                FragmentContextView.this.animatorSet = null;
                                if (!FragmentContextView.this.checkCallAfterAnimation) {
                                    if (FragmentContextView.this.checkPlayerAfterAnimation) {
                                        FragmentContextView.this.checkPlayer(false);
                                    } else if (FragmentContextView.this.checkImportAfterAnimation) {
                                        FragmentContextView.this.checkImport(false);
                                    }
                                } else {
                                    FragmentContextView.this.checkCall(false);
                                }
                                FragmentContextView.this.checkCallAfterAnimation = false;
                                FragmentContextView.this.checkPlayerAfterAnimation = false;
                                FragmentContextView.this.checkImportAfterAnimation = false;
                            }
                        });
                        this.animatorSet.start();
                    }
                    this.visible = true;
                    setVisibility(0);
                }
                int i4 = this.currentProgress;
                int i5 = importingHistory.uploadProgress;
                if (i4 != i5) {
                    this.currentProgress = i5;
                    this.titleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ImportUploading", C1072R.string.ImportUploading, Integer.valueOf(i5))), false);
                }
            }
        }
    }

    private boolean isPlayingVoice() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        return playingMessageObject != null && playingMessageObject.isVoice();
    }

    public void checkCall(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.FragmentContextView.checkCall(boolean):void");
    }

    public void startJoinFlickerAnimation() {
        if (this.joinButtonFlicker.getProgress() > 1.0f) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    FragmentContextView.this.lambda$startJoinFlickerAnimation$13();
                }
            }, 150L);
        }
    }

    public void lambda$startJoinFlickerAnimation$13() {
        this.joinButtonFlicker.setProgress(0.0f);
        this.joinButton.invalidate();
    }

    private void updateAvatars(boolean z) {
        ChatObject.Call call;
        int i;
        TLRPC$User tLRPC$User;
        float f;
        int i2;
        ValueAnimator valueAnimator;
        if (!z && (valueAnimator = this.avatars.avatarsDrawable.transitionProgressAnimator) != null) {
            valueAnimator.cancel();
            this.avatars.avatarsDrawable.transitionProgressAnimator = null;
        }
        AvatarsImageView avatarsImageView = this.avatars;
        if (avatarsImageView.avatarsDrawable.transitionProgressAnimator == null) {
            if (this.currentStyle == 4) {
                ChatActivityInterface chatActivityInterface = this.chatActivity;
                if (chatActivityInterface != null) {
                    call = chatActivityInterface.getGroupCall();
                    i2 = this.fragment.getCurrentAccount();
                } else {
                    i2 = this.account;
                    call = null;
                }
                i = i2;
                tLRPC$User = null;
            } else if (VoIPService.getSharedInstance() != null) {
                call = VoIPService.getSharedInstance().groupCall;
                tLRPC$User = this.chatActivity != null ? null : VoIPService.getSharedInstance().getUser();
                i = VoIPService.getSharedInstance().getAccount();
            } else {
                call = null;
                i = this.account;
                tLRPC$User = null;
            }
            if (call != null) {
                int size = call.sortedParticipants.size();
                for (int i3 = 0; i3 < 3; i3++) {
                    if (i3 < size) {
                        this.avatars.setObject(i3, i, call.sortedParticipants.get(i3));
                    } else {
                        this.avatars.setObject(i3, i, null);
                    }
                }
            } else if (tLRPC$User != null) {
                this.avatars.setObject(0, i, tLRPC$User);
                for (int i4 = 1; i4 < 3; i4++) {
                    this.avatars.setObject(i4, i, null);
                }
            } else {
                for (int i5 = 0; i5 < 3; i5++) {
                    this.avatars.setObject(i5, i, null);
                }
            }
            this.avatars.commitTransition(z);
            if (this.currentStyle != 4 || call == null) {
                return;
            }
            int min = call.call.rtmp_stream ? 0 : Math.min(3, call.sortedParticipants.size());
            int i6 = min != 0 ? 10 + ((min - 1) * 24) + 10 + 32 : 10;
            if (z) {
                int i7 = ((FrameLayout.LayoutParams) this.titleTextView.getLayoutParams()).leftMargin;
                if (AndroidUtilities.m36dp(i6) != i7) {
                    float translationX = (this.titleTextView.getTranslationX() + i7) - AndroidUtilities.m36dp(f);
                    this.titleTextView.setTranslationX(translationX);
                    this.subtitleTextView.setTranslationX(translationX);
                    ViewPropertyAnimator duration = this.titleTextView.animate().translationX(0.0f).setDuration(220L);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                    duration.setInterpolator(cubicBezierInterpolator);
                    this.subtitleTextView.animate().translationX(0.0f).setDuration(220L).setInterpolator(cubicBezierInterpolator);
                }
            } else {
                this.titleTextView.animate().cancel();
                this.subtitleTextView.animate().cancel();
                this.titleTextView.setTranslationX(0.0f);
                this.subtitleTextView.setTranslationX(0.0f);
            }
            float f2 = i6;
            this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, 51, f2, 5.0f, call.isScheduled() ? 90.0f : 36.0f, 0.0f));
            this.subtitleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, 51, f2, 25.0f, call.isScheduled() ? 90.0f : 36.0f, 0.0f));
            return;
        }
        avatarsImageView.updateAfterTransitionEnd();
    }

    public void setCollapseTransition(boolean z, float f, float f2) {
        this.collapseTransition = z;
        this.extraHeight = f;
        this.collapseProgress = f2;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (!this.drawOverlay || getVisibility() == 0) {
            boolean z = false;
            int i = this.currentStyle;
            if (i == 3 || i == 1) {
                if (GroupCallActivity.groupCallInstance == null) {
                    Theme.getFragmentContextViewWavesDrawable().getState();
                }
                Theme.getFragmentContextViewWavesDrawable().updateState(this.wasDraw);
                float m36dp = this.topPadding / AndroidUtilities.m36dp(getStyleHeight());
                if (this.collapseTransition) {
                    Theme.getFragmentContextViewWavesDrawable().draw(0.0f, (AndroidUtilities.m36dp(getStyleHeight()) - this.topPadding) + this.extraHeight, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.m36dp(2.0f), canvas, null, Math.min(m36dp, 1.0f - this.collapseProgress));
                } else {
                    Theme.getFragmentContextViewWavesDrawable().draw(0.0f, AndroidUtilities.m36dp(getStyleHeight()) - this.topPadding, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.m36dp(2.0f), canvas, this, m36dp);
                }
                float m36dp2 = AndroidUtilities.m36dp(getStyleHeight()) - this.topPadding;
                if (this.collapseTransition) {
                    m36dp2 += this.extraHeight;
                }
                if (m36dp2 > getMeasuredHeight()) {
                    return;
                }
                canvas.save();
                canvas.clipRect(0.0f, m36dp2, getMeasuredWidth(), getMeasuredHeight());
                invalidate();
                z = true;
            }
            super.dispatchDraw(canvas);
            if (z) {
                canvas.restore();
            }
            this.wasDraw = true;
        }
    }

    public void setDrawOverlay(boolean z) {
        this.drawOverlay = z;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        int i = this.currentStyle;
        if ((i == 3 || i == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public boolean isCallStyle() {
        int i = this.currentStyle;
        return i == 3 || i == 1;
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        updatePaddings();
        setTopPadding(this.topPadding);
        if (i == 8) {
            this.wasDraw = false;
        }
    }

    private void updatePaddings() {
        int m36dp = getVisibility() == 0 ? 0 - AndroidUtilities.m36dp(getStyleHeight()) : 0;
        FragmentContextView fragmentContextView = this.additionalContextView;
        if (fragmentContextView != null && fragmentContextView.getVisibility() == 0) {
            int m36dp2 = m36dp - AndroidUtilities.m36dp(this.additionalContextView.getStyleHeight());
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = m36dp2;
            ((FrameLayout.LayoutParams) this.additionalContextView.getLayoutParams()).topMargin = m36dp2;
            return;
        }
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = m36dp;
    }

    @Override
    public void onStateChanged(int i) {
        updateCallTitle();
    }

    private void updateCallTitle() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i = this.currentStyle;
            if (i == 1 || i == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.titleTextView.setText(LocaleController.getString("VoipGroupConnecting", C1072R.string.VoipGroupConnecting), false);
                } else if (sharedInstance.getChat() != null) {
                    if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                        this.titleTextView.setText(sharedInstance.groupCall.call.title, false);
                        return;
                    }
                    ChatActivityInterface chatActivityInterface = this.chatActivity;
                    if (chatActivityInterface != null && chatActivityInterface.getCurrentChat() != null && this.chatActivity.getCurrentChat().f857id == sharedInstance.getChat().f857id) {
                        TLRPC$Chat currentChat = this.chatActivity.getCurrentChat();
                        if (VoIPService.hasRtmpStream()) {
                            this.titleTextView.setText(LocaleController.getString(C1072R.string.VoipChannelViewVoiceChat), false);
                            return;
                        } else if (ChatObject.isChannelOrGiga(currentChat)) {
                            this.titleTextView.setText(LocaleController.getString("VoipChannelViewVoiceChat", C1072R.string.VoipChannelViewVoiceChat), false);
                            return;
                        } else {
                            this.titleTextView.setText(LocaleController.getString("VoipGroupViewVoiceChat", C1072R.string.VoipGroupViewVoiceChat), false);
                            return;
                        }
                    }
                    this.titleTextView.setText(sharedInstance.getChat().title, false);
                } else if (sharedInstance.getUser() != null) {
                    TLRPC$User user = sharedInstance.getUser();
                    ChatActivityInterface chatActivityInterface2 = this.chatActivity;
                    if (chatActivityInterface2 != null && chatActivityInterface2.getCurrentUser() != null && this.chatActivity.getCurrentUser().f995id == user.f995id) {
                        this.titleTextView.setText(LocaleController.getString("ReturnToCall", C1072R.string.ReturnToCall));
                    } else {
                        this.titleTextView.setText(ContactsController.formatName(user.first_name, user.last_name));
                    }
                }
            }
        }
    }

    private int getTitleTextColor() {
        int i = this.currentStyle;
        if (i == 4) {
            return getThemedColor("inappPlayerPerformer");
        }
        if (i == 1 || i == 3) {
            return getThemedColor("returnToCallText");
        }
        return getThemedColor("inappPlayerTitle");
    }

    public int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
