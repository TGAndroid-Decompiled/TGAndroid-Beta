package org.telegram.ui.Components;

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
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
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
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import me.vkryl.core.lambda.Destroyable;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSlider;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CalendarActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

public class FragmentContextView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener {
    public static final int STYLE_ACTIVE_GROUP_CALL = 3;
    public static final int STYLE_AUDIO_PLAYER = 0;
    public static final int STYLE_CONNECTING_GROUP_CALL = 1;
    public static final int STYLE_IMPORTING_MESSAGES = 5;
    public static final int STYLE_INACTIVE_GROUP_CALL = 4;
    public static final int STYLE_LIVE_LOCATION = 2;
    public static final int STYLE_LIVE_STORY = 6;
    public static final int STYLE_NOT_SET = -1;
    private static final float[] speeds = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    private final int account;
    private AnimatorSet animatorSet;
    private View applyingView;
    private AvatarsImageView avatars;
    private final ReplaceAnimator callMessagesAnimator;
    private final CapsuleBlobDrawable capsuleBlobDrawable;
    private ChatActivityInterface chatActivity;
    private boolean checkCallAfterAnimation;
    private boolean checkImportAfterAnimation;
    private boolean checkLiveStoryAfterAnimation;
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
    private boolean flickOnAttach;
    private BaseFragment fragment;
    private FrameLayout frameLayout;
    private Paint gradientPaint;
    private TextPaint gradientTextPaint;
    private int gradientWidth;
    private int groupCallMessageCounter;
    private FrameLayout groupCallMessagesContainer;
    private RLottieImageView importingImageView;
    private boolean isLocation;
    private boolean isMusic;
    private boolean isMuted;
    private final boolean isSideMenued;
    private TextView joinButton;
    private CellFlickerDrawable joinButtonFlicker;
    private int joinButtonWidth;
    private int lastLocationSharingCount;
    private MessageObject lastMessageObject;
    private long lastPlaybackClick;
    private String lastString;
    private float leftMargin;
    private LinearGradient linearGradient;
    private Matrix matrix;
    float micAmplitude;
    private RLottieImageView muteButton;
    private RLottieDrawable muteDrawable;
    private AnimationNotificationsLocker notificationsLocker;
    private AnimationNotificationsLocker notificationsLocker2;
    private ButtonBounce notifyButtonBounce;
    private boolean notifyButtonEnabled;
    private final AnimatedTextView.AnimatedTextDrawable notifyText;
    private ImageView playButton;
    private PlayPauseDrawable playPauseDrawable;
    private ActionBarMenuItem playbackSpeedButton;
    private final Paint progressPaint;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean scheduleRunnableScheduled;
    private View selector;
    private View shadow;
    private FrameLayout silentButton;
    private ImageView silentButtonImage;
    private boolean slidingSpeed;
    float speakerAmplitude;
    private HintView speedHintView;
    private SpeedIconDrawable speedIcon;
    private ActionBarMenuItem.Item[] speedItems;
    private ActionBarMenuSlider.SpeedSlider speedSlider;
    private AudioPlayerAlert.ClippingTextViewSwitcher subtitleTextView;
    private boolean supportsCalls;
    private AudioPlayerAlert.ClippingTextViewSwitcher titleTextView;
    private int toggleGroupCallStartSubscriptionReqId;
    protected float topPadding;
    private final Runnable updateScheduleTimeRunnable;
    private boolean visible;
    boolean wasDraw;
    private boolean willBeNotified;

    public class AnonymousClass7 extends RLottieImageView {
        private final Runnable pressRunnable;
        boolean pressed;
        boolean scheduled;
        private final Runnable toggleMicRunnable;

        public AnonymousClass7(Context context) {
            super(context);
            final int i = 0;
            this.toggleMicRunnable = new Runnable(this) {
                public final FragmentContextView.AnonymousClass7 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$$0();
                            break;
                        default:
                            this.f$0.lambda$$1();
                            break;
                    }
                }
            };
            final int i2 = 1;
            this.pressRunnable = new Runnable(this) {
                public final FragmentContextView.AnonymousClass7 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$$0();
                            break;
                        default:
                            this.f$0.lambda$$1();
                            break;
                    }
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
            FragmentContextView.this.capsuleBlobDrawable.updateState(true);
        }

        public void lambda$$1() {
            if (!this.scheduled || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.scheduled = false;
            this.pressed = true;
            FragmentContextView.this.isMuted = false;
            AndroidUtilities.runOnUIThread(this.toggleMicRunnable, 90L);
            try {
                FragmentContextView.this.muteButton.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setText(LocaleController.getString(FragmentContextView.this.isMuted ? R.string.VoipUnmute : R.string.VoipMute));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (FragmentContextView.this.currentStyle != 3 && FragmentContextView.this.currentStyle != 1) {
                return super.onTouchEvent(motionEvent);
            }
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
                        try {
                            FragmentContextView.this.muteButton.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    this.pressed = false;
                    Theme.getFragmentContextViewWavesDrawable().updateState(true);
                    FragmentContextView.this.capsuleBlobDrawable.updateState(true);
                    MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    return true;
                }
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public static class CallMessageItem implements Destroyable {
        private final GroupCallMessageCell cell;
        private final ViewGroup parent;

        public CallMessageItem(ViewGroup viewGroup, GroupCallMessage groupCallMessage) {
            GroupCallMessageCell groupCallMessageCell = new GroupCallMessageCell(viewGroup.getContext());
            this.cell = groupCallMessageCell;
            groupCallMessageCell.setBackgroundColor(ColorUtils.setAlphaComponent(-16777216, 34));
            SpoilersTextView spoilersTextView = groupCallMessageCell.messageTextView;
            spoilersTextView.setMaxLines(1);
            spoilersTextView.setSingleLine(true);
            spoilersTextView.setEllipsize(TextUtils.TruncateAt.END);
            groupCallMessageCell.set(groupCallMessage);
            groupCallMessageCell.setAlpha(0.0f);
            this.parent = viewGroup;
            viewGroup.addView(groupCallMessageCell);
        }

        @Override
        public void performDestroy() {
            this.parent.removeView(this.cell);
        }
    }

    public interface FragmentContextViewDelegate {
        void onAnimation(boolean z, boolean z2);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Style {
    }

    public FragmentContextView(Context context, BaseFragment baseFragment, boolean z) {
        this(context, baseFragment, null, z, null);
    }

    private void checkCreateView() {
        if (this.frameLayout != null) {
            return;
        }
        final Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context) {
            private final RectF notifyButtonRect = new RectF();

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (FragmentContextView.this.currentStyle == 4 && FragmentContextView.this.notifyButtonEnabled) {
                    int iDp = AndroidUtilities.dp(24.0f) + ((int) Math.ceil(FragmentContextView.this.notifyText.getCurrentWidth()));
                    float f = 1.0f;
                    if (iDp != FragmentContextView.this.gradientWidth) {
                        FragmentContextView.this.linearGradient = new LinearGradient(0.0f, 0.0f, iDp, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        FragmentContextView.this.gradientPaint.setShader(FragmentContextView.this.linearGradient);
                        FragmentContextView.this.gradientWidth = iDp;
                    }
                    ChatObject.Call groupCall = FragmentContextView.this.chatActivity.getGroupCall();
                    if (FragmentContextView.this.fragment == null || groupCall == null || !groupCall.isScheduled()) {
                        f = 0.0f;
                    } else {
                        long currentTimeMillis = (((long) groupCall.call.schedule_date) * 1000) - FragmentContextView.this.fragment.getConnectionsManager().getCurrentTimeMillis();
                        if (currentTimeMillis >= 0) {
                            f = currentTimeMillis < 5000 ? 1.0f - (currentTimeMillis / 5000.0f) : 0.0f;
                        }
                        if (currentTimeMillis < 6000) {
                            invalidate();
                        }
                    }
                    FragmentContextView.this.matrix.reset();
                    FragmentContextView.this.matrix.postTranslate((-FragmentContextView.this.gradientWidth) * 0.7f * f, 0.0f);
                    FragmentContextView.this.linearGradient.setLocalMatrix(FragmentContextView.this.matrix);
                    int measuredWidth = (getMeasuredWidth() - iDp) - AndroidUtilities.dp(10.0f);
                    int iDp2 = AndroidUtilities.dp(10.0f);
                    float f2 = measuredWidth;
                    float f3 = iDp2;
                    this.notifyButtonRect.set(f2, f3, measuredWidth + iDp, AndroidUtilities.dp(28.0f) + iDp2);
                    canvas.save();
                    float scale = FragmentContextView.this.notifyButtonBounce.getScale(0.1f);
                    canvas.scale(scale, scale, this.notifyButtonRect.centerX(), this.notifyButtonRect.centerY());
                    canvas.translate(f2, f3);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, iDp, AndroidUtilities.dp(28.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), FragmentContextView.this.gradientPaint);
                    canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                    FragmentContextView.this.notifyText.setBounds(0, 0, AndroidUtilities.displaySize.x, AndroidUtilities.dp(16.0f));
                    FragmentContextView.this.notifyText.draw(canvas);
                    canvas.restore();
                }
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (FragmentContextView.this.currentStyle == 4 && FragmentContextView.this.notifyButtonEnabled && FragmentContextView.this.notifyButtonBounce != null) {
                    boolean zContains = this.notifyButtonRect.contains(motionEvent.getX(), motionEvent.getY());
                    if (motionEvent.getAction() == 0) {
                        FragmentContextView.this.notifyButtonBounce.setPressed(zContains);
                    } else if (motionEvent.getAction() == 2) {
                        if (!zContains) {
                            FragmentContextView.this.notifyButtonBounce.setPressed(false);
                        }
                    } else if (motionEvent.getAction() == 1) {
                        if (zContains) {
                            FragmentContextView.this.toggleScheduledNotify();
                        }
                        FragmentContextView.this.notifyButtonBounce.setPressed(false);
                    } else if (motionEvent.getAction() == 3) {
                        FragmentContextView.this.notifyButtonBounce.setPressed(false);
                    }
                } else if (FragmentContextView.this.notifyButtonBounce != null) {
                    FragmentContextView.this.notifyButtonBounce.setPressed(false);
                }
                return (FragmentContextView.this.notifyButtonBounce != null && FragmentContextView.this.notifyButtonBounce.isPressed()) || super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public void invalidate() {
                super.invalidate();
                if (FragmentContextView.this.avatars == null || FragmentContextView.this.avatars.getVisibility() != 0) {
                    return;
                }
                FragmentContextView.this.avatars.invalidate();
            }

            @Override
            public boolean verifyDrawable(Drawable drawable) {
                return drawable == FragmentContextView.this.notifyText || super.verifyDrawable(drawable);
            }
        };
        this.frameLayout = frameLayout;
        this.notifyButtonBounce = new ButtonBounce(frameLayout);
        this.notifyText.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        this.notifyText.setScaleProperty(0.4f);
        this.notifyText.setCallback(this.frameLayout);
        this.notifyText.setTextColor(-1);
        this.notifyText.setTextSize(AndroidUtilities.dp(14.0f));
        this.notifyText.setTypeface(AndroidUtilities.bold());
        addView(this.frameLayout, LayoutHelper.createFrame(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.selector = view;
        this.frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f));
        ImageView imageView = new ImageView(context);
        this.playButton = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.playButton;
        int i = Theme.key_inappPlayerPlayPause;
        int themedColor = getThemedColor(i);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ImageView imageView3 = this.playButton;
        PlayPauseDrawable playPauseDrawable = new PlayPauseDrawable(16);
        this.playPauseDrawable = playPauseDrawable;
        imageView3.setImageDrawable(playPauseDrawable);
        this.playButton.setBackground(Theme.createSelectorDrawable(getThemedColor(i) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.playButton, LayoutHelper.createFrame(36, 36, 51));
        final int i2 = 0;
        this.playButton.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$checkCreateView$0(view2);
                        break;
                    case 1:
                        this.f$0.lambda$checkCreateView$1(view2);
                        break;
                    case 2:
                        this.f$0.lambda$checkCreateView$4(view2);
                        break;
                    case 3:
                        this.f$0.lambda$checkCreateView$6(view2);
                        break;
                    default:
                        this.f$0.lambda$checkCreateView$8(view2);
                        break;
                }
            }
        });
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.importingImageView = rLottieImageView;
        rLottieImageView.setScaleType(scaleType);
        this.importingImageView.setAutoRepeat(true);
        this.importingImageView.setAnimation(R.raw.import_progress, 30, 30);
        this.importingImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i)));
        addView(this.importingImageView, LayoutHelper.createFrame(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = new AudioPlayerAlert.ClippingTextViewSwitcher(context) {
            @Override
            public TextView createTextView() {
                TextView textView = new TextView(context);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(19);
                if (FragmentContextView.this.currentStyle == 0 || FragmentContextView.this.currentStyle == 2) {
                    textView.setGravity(19);
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setTextSize(1, 15.0f);
                    return textView;
                }
                if (FragmentContextView.this.currentStyle == 4) {
                    textView.setGravity(51);
                    textView.setTextColor(FragmentContextView.this.getThemedColor(Theme.key_inappPlayerPerformer));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 15.0f);
                    return textView;
                }
                if (FragmentContextView.this.currentStyle != 1 && FragmentContextView.this.currentStyle != 3) {
                    return textView;
                }
                textView.setGravity(19);
                textView.setTextColor(FragmentContextView.this.getThemedColor(Theme.key_returnToCallText));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 14.0f);
                return textView;
            }
        };
        this.titleTextView = clippingTextViewSwitcher;
        addView(clippingTextViewSwitcher, LayoutHelper.createFrame(-1, 36.0f, 51, 35.0f, 0.0f, (this.isSideMenued ? 64 : 0) + 36, 0.0f));
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher2 = new AudioPlayerAlert.ClippingTextViewSwitcher(context) {
            @Override
            public TextView createTextView() {
                TextView textView = new TextView(context);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(FragmentContextView.this.getThemedColor(Theme.key_inappPlayerClose));
                return textView;
            }
        };
        this.subtitleTextView = clippingTextViewSwitcher2;
        addView(clippingTextViewSwitcher2, LayoutHelper.createFrame(-1, 36.0f, 51, 35.0f, 10.0f, (this.isSideMenued ? 64 : 0) + 36, 0.0f));
        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
        this.joinButtonFlicker = cellFlickerDrawable;
        cellFlickerDrawable.progress = 1.0f;
        cellFlickerDrawable.repeatEnabled = false;
        TextView textView = new TextView(context) {
            private void updateJoinButtonWidth(int i3) {
                if (FragmentContextView.this.joinButtonWidth != i3) {
                    FragmentContextView.this.titleTextView.setPadding(FragmentContextView.this.titleTextView.getPaddingLeft(), FragmentContextView.this.titleTextView.getPaddingTop(), (FragmentContextView.this.titleTextView.getPaddingRight() - FragmentContextView.this.joinButtonWidth) + i3, FragmentContextView.this.titleTextView.getPaddingBottom());
                    FragmentContextView.this.joinButtonWidth = i3;
                }
            }

            @Override
            public void draw(Canvas canvas) {
                super.draw(canvas);
                int iDp = AndroidUtilities.dp(1.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f = iDp;
                rectF.set(f, f, getWidth() - iDp, getHeight() - iDp);
                FragmentContextView.this.joinButtonFlicker.draw(this, canvas, rectF, AndroidUtilities.dp(16.0f));
            }

            @Override
            public void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
                updateJoinButtonWidth(getMeasuredWidth());
            }

            @Override
            public void onSizeChanged(int i3, int i4, int i5, int i6) {
                super.onSizeChanged(i3, i4, i5, i6);
                FragmentContextView.this.joinButtonFlicker.parentWidth = getWidth();
            }

            @Override
            public void setVisibility(int i3) {
                super.setVisibility(i3);
                if (i3 != 0) {
                    updateJoinButtonWidth(0);
                    FragmentContextView.this.joinButtonWidth = 0;
                }
            }
        };
        this.joinButton = textView;
        textView.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.joinButton.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        TextView textView2 = this.joinButton;
        int iDp = AndroidUtilities.dp(16.0f);
        int themedColor2 = getThemedColor(Theme.key_featuredStickers_addButton);
        int themedColor3 = getThemedColor(Theme.key_featuredStickers_addButtonPressed);
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, themedColor2, themedColor3, themedColor3));
        this.joinButton.setTextSize(1, 14.0f);
        this.joinButton.setTypeface(AndroidUtilities.bold());
        this.joinButton.setGravity(17);
        this.joinButton.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.joinButton, LayoutHelper.createFrame(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final int i3 = 1;
        this.joinButton.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$checkCreateView$0(view2);
                        break;
                    case 1:
                        this.f$0.lambda$checkCreateView$1(view2);
                        break;
                    case 2:
                        this.f$0.lambda$checkCreateView$4(view2);
                        break;
                    case 3:
                        this.f$0.lambda$checkCreateView$6(view2);
                        break;
                    default:
                        this.f$0.lambda$checkCreateView$8(view2);
                        break;
                }
            }
        });
        if (this.flickOnAttach) {
            startJoinFlickerAnimation();
        }
        this.silentButton = new FrameLayout(context);
        ImageView imageView4 = new ImageView(context);
        this.silentButtonImage = imageView4;
        imageView4.setImageResource(R.drawable.msg_mute);
        ImageView imageView5 = this.silentButtonImage;
        int i4 = Theme.key_inappPlayerClose;
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), mode));
        this.silentButton.addView(this.silentButtonImage, LayoutHelper.createFrame(20, 20, 17));
        this.silentButton.setBackground(Theme.createSelectorDrawable(getThemedColor(i4) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.silentButton.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.silentButton.setOnClickListener(new ColorPicker$$ExternalSyntheticLambda4(3));
        this.silentButton.setVisibility(8);
        addView(this.silentButton, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.isLocation) {
            createPlaybackSpeedButton();
        }
        AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
        this.avatars = avatarsImageView;
        avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.avatars.setDelegate(new FragmentContextView$$ExternalSyntheticLambda6(this, 1));
        this.avatars.setVisibility(8);
        addView(this.avatars, LayoutHelper.createFrame(108, 36, 51));
        int i5 = R.raw.voice_muted;
        this.muteDrawable = new RLottieDrawable(i5, Fragment$$ExternalSyntheticOutline0.m(i5, ""), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context);
        this.muteButton = anonymousClass7;
        anonymousClass7.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_returnToCallText), PorterDuff.Mode.SRC_IN));
        this.muteButton.setBackground(Theme.createSelectorDrawable(getThemedColor(i4) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.muteButton.setAnimation(this.muteDrawable);
        this.muteButton.setScaleType(scaleType);
        this.muteButton.setVisibility(8);
        addView(this.muteButton, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final int i6 = 2;
        this.muteButton.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        this.f$0.lambda$checkCreateView$0(view2);
                        break;
                    case 1:
                        this.f$0.lambda$checkCreateView$1(view2);
                        break;
                    case 2:
                        this.f$0.lambda$checkCreateView$4(view2);
                        break;
                    case 3:
                        this.f$0.lambda$checkCreateView$6(view2);
                        break;
                    default:
                        this.f$0.lambda$checkCreateView$8(view2);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.closeButton = imageView6;
        imageView6.setImageResource(R.drawable.miniplayer_close);
        this.closeButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), mode));
        this.closeButton.setBackground(Theme.createSelectorDrawable(getThemedColor(i4) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.closeButton.setScaleType(scaleType);
        addView(this.closeButton, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i7 = 3;
        this.closeButton.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        this.f$0.lambda$checkCreateView$0(view2);
                        break;
                    case 1:
                        this.f$0.lambda$checkCreateView$1(view2);
                        break;
                    case 2:
                        this.f$0.lambda$checkCreateView$4(view2);
                        break;
                    case 3:
                        this.f$0.lambda$checkCreateView$6(view2);
                        break;
                    default:
                        this.f$0.lambda$checkCreateView$8(view2);
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext()) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        };
        this.groupCallMessagesContainer = frameLayout2;
        addView(frameLayout2, LayoutHelper.createFrame(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        final int i8 = 4;
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i8) {
                    case 0:
                        this.f$0.lambda$checkCreateView$0(view2);
                        break;
                    case 1:
                        this.f$0.lambda$checkCreateView$1(view2);
                        break;
                    case 2:
                        this.f$0.lambda$checkCreateView$4(view2);
                        break;
                    case 3:
                        this.f$0.lambda$checkCreateView$6(view2);
                        break;
                    default:
                        this.f$0.lambda$checkCreateView$8(view2);
                        break;
                }
            }
        });
        setLeftMargin(this.leftMargin);
    }

    private void checkLiveLocation(boolean z) {
        String pluralString;
        String string;
        View fragmentView = this.fragment.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z = true;
        }
        BaseFragment baseFragment = this.fragment;
        if (!(baseFragment instanceof DialogsActivity ? LocationController.getLocationsCount() != 0 : LocationController.getInstance(baseFragment.getCurrentAccount()).isSharingLocation(this.chatActivity.getDialogId()))) {
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
        checkCreateView();
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
        if (!(this.fragment instanceof DialogsActivity)) {
            this.checkLocationRunnable.run();
            checkLocationString();
            return;
        }
        String string2 = LocaleController.getString(R.string.LiveLocationContext);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            arrayList.addAll(LocationController.getInstance(i).sharingLocationsUI);
        }
        if (arrayList.size() == 1) {
            LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) arrayList.get(0);
            long dialogId = sharingLocationInfo.messageObject.getDialogId();
            if (DialogObject.isUserDialog(dialogId)) {
                pluralString = UserObject.getFirstName(MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getUser(Long.valueOf(dialogId)));
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharing);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getChat(Long.valueOf(-dialogId));
                pluralString = chat != null ? chat.title : "";
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChat);
            }
        } else {
            pluralString = LocaleController.formatPluralString("Chats", arrayList.size(), new Object[0]);
            string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChats);
        }
        String str = String.format(string, string2, pluralString);
        int iIndexOf = str.indexOf(string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i2 = 0;
        while (i2 < 2) {
            TextView textView = i2 == 0 ? this.titleTextView.getTextView() : this.titleTextView.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i2++;
        }
        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), 0, getThemedColor(Theme.key_inappPlayerPerformer)), iIndexOf, string2.length() + iIndexOf, 18);
        this.titleTextView.setText(spannableStringBuilder, false);
    }

    public void checkLiveStory(boolean z) {
        View fragmentView = this.fragment.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z = true;
        }
        if (LivePlayer.recording != null) {
            checkCreateView();
            int i = this.currentStyle;
            if (6 != i && this.animatorSet != null && !z) {
                this.checkLiveStoryAfterAnimation = true;
                return;
            }
            if (6 != i && this.visible && !z) {
                AnimatorSet animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.animatorSet = null;
                }
                this.notificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animatorSet = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.animatorSet.setDuration(220L);
                this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        FragmentContextView.this.notificationsLocker.unlock();
                        if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                            return;
                        }
                        FragmentContextView.this.visible = false;
                        FragmentContextView.this.animatorSet = null;
                        FragmentContextView.this.checkLiveStory(false);
                    }
                });
                this.animatorSet.start();
                return;
            }
            updateStyle(6);
            if (this.visible) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                setVisibility(0);
            } else {
                if (z) {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    startJoinFlickerAnimation();
                } else {
                    AnimatorSet animatorSet3 = this.animatorSet;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.animatorSet = null;
                    }
                    this.animatorSet = new AnimatorSet();
                    this.notificationsLocker2.lock();
                    this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.animatorSet.setDuration(220L);
                    this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    this.animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            FragmentContextView.this.notificationsLocker2.unlock();
                            if (FragmentContextView.this.animatorSet != null && FragmentContextView.this.animatorSet.equals(animator)) {
                                FragmentContextView.this.animatorSet = null;
                            }
                            if (FragmentContextView.this.checkLiveStoryAfterAnimation) {
                                FragmentContextView.this.checkLiveStory(false);
                            } else if (FragmentContextView.this.checkCallAfterAnimation) {
                                FragmentContextView.this.checkCall(false);
                            } else if (FragmentContextView.this.checkPlayerAfterAnimation) {
                                FragmentContextView.this.checkPlayer(false);
                            } else if (FragmentContextView.this.checkImportAfterAnimation) {
                                FragmentContextView.this.checkImport(false);
                            }
                            FragmentContextView.this.checkLiveStoryAfterAnimation = false;
                            FragmentContextView.this.checkCallAfterAnimation = false;
                            FragmentContextView.this.checkPlayerAfterAnimation = false;
                            FragmentContextView.this.checkImportAfterAnimation = false;
                            FragmentContextView.this.startJoinFlickerAnimation();
                        }
                    });
                    this.animatorSet.start();
                }
                this.visible = true;
                setVisibility(0);
            }
        } else {
            boolean z2 = this.visible;
            if (z2 && ((z && this.currentStyle == -1) || this.currentStyle == 6)) {
                this.visible = false;
                if (z) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                } else {
                    AnimatorSet animatorSet4 = this.animatorSet;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.animatorSet = null;
                    }
                    this.notificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.animatorSet = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.animatorSet.setDuration(220L);
                    this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    this.animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            FragmentContextView.this.notificationsLocker.unlock();
                            if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                                return;
                            }
                            FragmentContextView.this.setVisibility(8);
                            FragmentContextView.this.animatorSet = null;
                            if (FragmentContextView.this.checkLiveStoryAfterAnimation) {
                                FragmentContextView.this.checkLiveStory(false);
                            } else if (FragmentContextView.this.checkCallAfterAnimation) {
                                FragmentContextView.this.checkCall(false);
                            } else if (FragmentContextView.this.checkPlayerAfterAnimation) {
                                FragmentContextView.this.checkPlayer(false);
                            } else if (FragmentContextView.this.checkImportAfterAnimation) {
                                FragmentContextView.this.checkImport(false);
                            }
                            FragmentContextView.this.checkLiveStoryAfterAnimation = false;
                            FragmentContextView.this.checkCallAfterAnimation = false;
                            FragmentContextView.this.checkPlayerAfterAnimation = false;
                            FragmentContextView.this.checkImportAfterAnimation = false;
                        }
                    });
                    this.animatorSet.start();
                }
            } else if (z2 && this.currentStyle == -1) {
                this.visible = false;
                setVisibility(8);
            }
        }
        LivePlayer livePlayer = LivePlayer.recording;
        if (livePlayer == null || this.currentStyle != 6) {
            return;
        }
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.titleTextView;
        TLRPC.GroupCall groupCall = livePlayer.call;
        clippingTextViewSwitcher.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public void checkLocationString() {
        int i;
        String str;
        boolean z;
        if (this.chatActivity == null || this.titleTextView == null) {
            return;
        }
        checkCreateView();
        long dialogId = this.chatActivity.getDialogId();
        int currentAccount = this.fragment.getCurrentAccount();
        ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.get(dialogId);
        if (!this.firstLocationsLoaded) {
            LocationController.getInstance(currentAccount).loadLiveLocations(dialogId);
            this.firstLocationsLoaded = true;
        }
        TLRPC.User user = null;
        if (arrayList != null) {
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
            i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i2);
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                    long fromChatId = MessageObject.getFromChatId(message);
                    if (user == null && fromChatId != clientUserId) {
                        user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(fromChatId));
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
        String string = LocaleController.getString(R.string.LiveLocationContext);
        if (i == 0) {
            str = string;
        } else {
            int i3 = i - 1;
            if (!LocationController.getInstance(currentAccount).isSharingLocation(dialogId)) {
                str = i3 != 0 ? String.format("%1$s - %2$s %3$s", string, UserObject.getFirstName(user), LocaleController.formatPluralString("AndOther", i3, new Object[0])) : String.format("%1$s - %2$s", string, UserObject.getFirstName(user));
            } else if (i3 != 0) {
                str = (i3 != 1 || user == null) ? String.format("%1$s - %2$s %3$s", string, LocaleController.getString(R.string.ChatYourSelfName), LocaleController.formatPluralString("AndOther", i3, new Object[0])) : String.format("%1$s - %2$s", string, LocaleController.formatString("SharingYouAndOtherName", R.string.SharingYouAndOtherName, UserObject.getFirstName(user)));
            } else {
                str = String.format("%1$s - %2$s", string, LocaleController.getString(R.string.ChatYourSelfName));
            }
        }
        if (str.equals(this.lastString)) {
            return;
        }
        this.lastString = str;
        int iIndexOf = str.indexOf(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i4 = 0;
        while (i4 < 2) {
            TextView textView = i4 == 0 ? this.titleTextView.getTextView() : this.titleTextView.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i4++;
        }
        if (iIndexOf >= 0) {
            z = false;
            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), 0, getThemedColor(Theme.key_inappPlayerPerformer)), iIndexOf, string.length() + iIndexOf, 18);
        } else {
            z = false;
        }
        this.titleTextView.setText(spannableStringBuilder, z);
    }

    public void checkPlayer(boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        boolean z2 = false;
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
            }
            if (!this.visible) {
                setVisibility(8);
                return;
            }
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
            this.notificationsLocker.lock();
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
                    FragmentContextView.this.notificationsLocker.unlock();
                    if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                        return;
                    }
                    FragmentContextView.this.setVisibility(8);
                    if (FragmentContextView.this.delegate != null) {
                        FragmentContextView.this.delegate.onAnimation(false, false);
                    }
                    FragmentContextView.this.animatorSet = null;
                    if (FragmentContextView.this.checkLiveStoryAfterAnimation) {
                        FragmentContextView.this.checkLiveStory(false);
                    } else if (FragmentContextView.this.checkCallAfterAnimation) {
                        FragmentContextView.this.checkCall(false);
                    } else if (FragmentContextView.this.checkPlayerAfterAnimation) {
                        FragmentContextView.this.checkPlayer(false);
                    } else if (FragmentContextView.this.checkImportAfterAnimation) {
                        FragmentContextView.this.checkImport(false);
                    }
                    FragmentContextView.this.checkLiveStoryAfterAnimation = false;
                    FragmentContextView.this.checkCallAfterAnimation = false;
                    FragmentContextView.this.checkPlayerAfterAnimation = false;
                    FragmentContextView.this.checkImportAfterAnimation = false;
                }
            });
            this.animatorSet.start();
            return;
        }
        checkCreateView();
        int i2 = this.currentStyle;
        if (i2 != 0 && this.animatorSet != null && !z) {
            this.checkPlayerAfterAnimation = true;
            return;
        }
        updateStyle(0);
        if (z && this.topPadding == 0.0f) {
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
                this.notificationsLocker.lock();
                this.animatorSet = new AnimatorSet();
                FragmentContextViewDelegate fragmentContextViewDelegate3 = this.delegate;
                if (fragmentContextViewDelegate3 != null) {
                    fragmentContextViewDelegate3.onAnimation(true, true);
                }
                this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.animatorSet.setDuration(200L);
                this.animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        FragmentContextView.this.notificationsLocker.unlock();
                        if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                            return;
                        }
                        if (FragmentContextView.this.delegate != null) {
                            FragmentContextView.this.delegate.onAnimation(false, true);
                        }
                        FragmentContextView.this.animatorSet = null;
                        if (FragmentContextView.this.checkLiveStoryAfterAnimation) {
                            FragmentContextView.this.checkLiveStory(false);
                        } else if (FragmentContextView.this.checkCallAfterAnimation) {
                            FragmentContextView.this.checkCall(false);
                        } else if (FragmentContextView.this.checkPlayerAfterAnimation) {
                            FragmentContextView.this.checkPlayer(false);
                        } else if (FragmentContextView.this.checkImportAfterAnimation) {
                            FragmentContextView.this.checkImport(false);
                        }
                        FragmentContextView.this.checkLiveStoryAfterAnimation = false;
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
            this.playButton.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            this.playPauseDrawable.setPause(true, !z);
            this.playButton.setContentDescription(LocaleController.getString(R.string.AccActionPause));
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
            this.titleTextView.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.joinButtonWidth, 0);
            spannableStringBuilder = new SpannableStringBuilder(zzjx.m(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
            int i3 = 0;
            while (i3 < 2) {
                TextView textView = i3 == 0 ? this.titleTextView.getTextView() : this.titleTextView.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i3++;
            }
            updatePlaybackButton(false);
        } else {
            this.isMusic = true;
            if (this.playbackSpeedButton == null) {
                this.titleTextView.setPadding(0, 0, this.joinButtonWidth, 0);
            } else if (playingMessageObject.getDuration() >= 600.0d) {
                this.playbackSpeedButton.setAlpha(1.0f);
                this.playbackSpeedButton.setEnabled(true);
                this.titleTextView.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.joinButtonWidth, 0);
                updatePlaybackButton(false);
            } else {
                this.playbackSpeedButton.setAlpha(0.0f);
                this.playbackSpeedButton.setEnabled(false);
                this.titleTextView.setPadding(0, 0, this.joinButtonWidth, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(zzjx.m(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
            int i4 = 0;
            while (i4 < 2) {
                TextView textView2 = i4 == 0 ? this.titleTextView.getTextView() : this.titleTextView.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i4++;
            }
        }
        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), 0, getThemedColor(Theme.key_inappPlayerPerformer)), 0, playingMessageObject.getMusicAuthor().length(), 18);
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.titleTextView;
        if (!z && z3 && this.isMusic) {
            z2 = true;
        }
        clippingTextViewSwitcher.setText(spannableStringBuilder, z2);
    }

    private void checkSpeedHint() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastPlaybackClick > 300) {
            int i = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i > 2) {
                i = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i).apply();
            if (i >= 0) {
                showSpeedHint();
            }
        }
        this.lastPlaybackClick = jCurrentTimeMillis;
    }

    private void checkVisibility() {
        boolean zIsSharingLocation = true;
        if (this.isLocation) {
            BaseFragment baseFragment = this.fragment;
            if (!(baseFragment instanceof DialogsActivity)) {
                zIsSharingLocation = LocationController.getInstance(baseFragment.getCurrentAccount()).isSharingLocation(this.chatActivity.getDialogId());
            } else if (LocationController.getLocationsCount() == 0) {
                zIsSharingLocation = false;
            }
        } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15) {
            startJoinFlickerAnimation();
        } else if (this.chatActivity == null || this.fragment.getSendMessagesHelper().getImportingHistory(this.chatActivity.getDialogId()) == null || isPlayingVoice()) {
            ChatActivityInterface chatActivityInterface = this.chatActivity;
            if (chatActivityInterface == null || chatActivityInterface.getGroupCall() == null || !this.chatActivity.getGroupCall().shouldShowPanel() || GroupCallPip.isShowing() || isPlayingVoice()) {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject == null || playingMessageObject.getId() == 0) {
                    zIsSharingLocation = false;
                }
            } else {
                startJoinFlickerAnimation();
            }
        }
        if (zIsSharingLocation) {
            checkCreateView();
        }
        setVisibility(zIsSharingLocation ? 0 : 8);
    }

    private void createPlaybackSpeedButton() {
        int i = 1;
        if (this.playbackSpeedButton != null) {
            return;
        }
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(getContext(), null, 0, getThemedColor(Theme.key_dialogTextBlack), false, this.resourcesProvider);
        this.playbackSpeedButton = actionBarMenuItem;
        actionBarMenuItem.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        this.playbackSpeedButton.setLongClickEnabled(false);
        this.playbackSpeedButton.setVisibility(8);
        this.playbackSpeedButton.setTag(null);
        this.playbackSpeedButton.setShowSubmenuByMove(false);
        this.playbackSpeedButton.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.playbackSpeedButton.setDelegate(new FragmentContextView$$ExternalSyntheticLambda1(this));
        ActionBarMenuItem actionBarMenuItem2 = this.playbackSpeedButton;
        SpeedIconDrawable speedIconDrawable = new SpeedIconDrawable(true);
        this.speedIcon = speedIconDrawable;
        actionBarMenuItem2.setIcon(speedIconDrawable);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        ActionBarMenuSlider.SpeedSlider speedSlider = new ActionBarMenuSlider.SpeedSlider(getContext(), this.resourcesProvider);
        this.speedSlider = speedSlider;
        speedSlider.setRoundRadiusDp(6.0f);
        this.speedSlider.setDrawShadow(true);
        this.speedSlider.setOnValueChange(new EmojiView$$ExternalSyntheticLambda18(this, 13));
        this.speedItems[0] = this.playbackSpeedButton.lazilyAddSubItem(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        this.speedItems[1] = this.playbackSpeedButton.lazilyAddSubItem(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        this.speedItems[2] = this.playbackSpeedButton.lazilyAddSubItem(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        this.speedItems[3] = this.playbackSpeedButton.lazilyAddSubItem(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        this.speedItems[4] = this.playbackSpeedButton.lazilyAddSubItem(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        this.speedItems[5] = this.playbackSpeedButton.lazilyAddSubItem(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.playbackSpeedButton.setPadding(0, 1, 0, 0);
        }
        this.playbackSpeedButton.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.playbackSpeedButton, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.playbackSpeedButton.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(27, this, fArr));
        this.playbackSpeedButton.setOnLongClickListener(new ShareAlert$$ExternalSyntheticLambda21(this, i));
        updatePlaybackButton(false);
    }

    private boolean equals(float f, float f2) {
        return Math.abs(f - f2) < 0.05f;
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private int getTitleTextColor() {
        int i = this.currentStyle;
        if (i == 4) {
            return getThemedColor(Theme.key_inappPlayerPerformer);
        }
        return (i == 1 || i == 3) ? getThemedColor(Theme.key_returnToCallText) : getThemedColor(Theme.key_inappPlayerTitle);
    }

    private boolean isPlayingVoice() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        return playingMessageObject != null && playingMessageObject.isVoice();
    }

    public void lambda$checkCreateView$0(View view) {
        if (this.currentStyle == 0) {
            if (MediaController.getInstance().isMessagePaused()) {
                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
            }
        }
    }

    public void lambda$checkCreateView$1(View view) {
        callOnClick();
    }

    public static void lambda$checkCreateView$2(View view) {
        MediaController.getInstance().updateSilent(false);
    }

    public void lambda$checkCreateView$3() {
        updateAvatars(true);
    }

    public void lambda$checkCreateView$4(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.groupCall != null) {
            AccountInstance.getInstance(sharedInstance.getAccount());
            ChatObject.Call call = sharedInstance.groupCall;
            TLRPC.Chat chat = sharedInstance.getChat();
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(sharedInstance.getSelfId());
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat)) {
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
        this.capsuleBlobDrawable.updateState(true);
        try {
            this.muteButton.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public void lambda$checkCreateView$5(AlertDialog alertDialog, int i) {
        BaseFragment baseFragment = this.fragment;
        if (!(baseFragment instanceof DialogsActivity)) {
            LocationController.getInstance(baseFragment.getCurrentAccount()).removeSharingLocation(this.chatActivity.getDialogId());
            return;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            LocationController.getInstance(i2).removeAllLocationSharings();
        }
    }

    public void lambda$checkCreateView$6(View view) {
        if (this.currentStyle != 2) {
            MediaController.getInstance().cleanupPlayer(true, true);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.fragment.getParentActivity(), 0, this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.StopLiveLocationAlertToTitle));
        if (this.fragment instanceof DialogsActivity) {
            builder.setMessage(LocaleController.getString(R.string.StopLiveLocationAlertAllText));
        } else {
            TLRPC.Chat currentChat = this.chatActivity.getCurrentChat();
            TLRPC.User currentUser = this.chatActivity.getCurrentUser();
            if (currentChat != null) {
                SendMessagesHelper$$ExternalSyntheticOutline0.m("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, new Object[]{currentChat.title}, builder);
            } else if (currentUser != null) {
                SendMessagesHelper$$ExternalSyntheticOutline0.m("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, new Object[]{UserObject.getFirstName(currentUser)}, builder);
            } else {
                builder.setMessage(LocaleController.getString(R.string.AreYouSure));
            }
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Stop), new FragmentContextView$$ExternalSyntheticLambda1(this));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        builder.show();
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(Theme.key_text_RedBold));
        }
    }

    public void lambda$checkCreateView$7(DialogInterface dialogInterface) {
        checkImport(false);
    }

    public void lambda$checkCreateView$8(View view) {
        ChatObject.Call groupCall;
        long dialogId;
        int i = this.currentStyle;
        if (i == 6) {
            LivePlayer livePlayer = LivePlayer.recording;
            if (livePlayer == null) {
                return;
            }
            int i2 = UserConfig.selectedAccount;
            int i3 = livePlayer.currentAccount;
            if (i3 != i2) {
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity == null) {
                    return;
                } else {
                    launchActivity.switchToAccount(i3, true);
                }
            }
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null) {
                return;
            }
            StoriesController storiesController = MessagesController.getInstance(i3).getStoriesController();
            int i4 = livePlayer.storyId;
            long j = livePlayer.dialogId;
            TL_stories.StoryItem storyItemFindStory = storiesController.findStory(i4, j);
            if (storyItemFindStory != null) {
                storyItemFindStory.dialogId = j;
                safeLastFragment.getOrCreateStoryViewer(i3).open(i3, getContext(), storyItemFindStory, (StoriesListPlaceProvider) null);
                return;
            }
            return;
        }
        if (i == 0) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (this.fragment == null || playingMessageObject == null) {
                return;
            }
            if (playingMessageObject.isMusic()) {
                Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
                if (activityFindActivity instanceof LaunchActivity) {
                    new AudioPlayerAlert(activityFindActivity, this.resourcesProvider).show();
                    return;
                } else {
                    if (AndroidUtilities.isContextSafe(LaunchActivity.instance)) {
                        new AudioPlayerAlert(LaunchActivity.instance, this.resourcesProvider).show();
                        return;
                    }
                    return;
                }
            }
            ChatActivityInterface chatActivityInterface = this.chatActivity;
            if (playingMessageObject.getDialogId() == (chatActivityInterface != null ? chatActivityInterface.getDialogId() : 0L)) {
                this.chatActivity.scrollToMessageId(playingMessageObject.getId(), 0, false, 0, true, 0);
                return;
            }
            long dialogId2 = playingMessageObject.getDialogId();
            Bundle bundle = new Bundle();
            if (DialogObject.isEncryptedDialog(dialogId2)) {
                bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId2));
            } else if (DialogObject.isUserDialog(dialogId2)) {
                bundle.putLong("user_id", dialogId2);
            } else {
                bundle.putLong("chat_id", -dialogId2);
            }
            bundle.putInt("message_id", playingMessageObject.getId());
            this.fragment.presentFragment(new ChatActivity(bundle), this.fragment instanceof ChatActivity);
            return;
        }
        if (i == 1) {
            getContext().startActivity(new Intent(getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
            return;
        }
        if (i == 2) {
            int currentAccount = UserConfig.selectedAccount;
            ChatActivityInterface chatActivityInterface2 = this.chatActivity;
            if (chatActivityInterface2 == null) {
                if (LocationController.getLocationsCount() != 1) {
                    dialogId = 0;
                    break;
                }
                int i5 = 0;
                while (true) {
                    if (i5 >= 4) {
                        dialogId = 0;
                        break;
                    } else {
                        if (!LocationController.getInstance(i5).sharingLocationsUI.isEmpty()) {
                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i5).sharingLocationsUI.get(0);
                            dialogId = sharingLocationInfo.did;
                            currentAccount = sharingLocationInfo.messageObject.currentAccount;
                            break;
                        }
                        i5++;
                    }
                }
            } else {
                dialogId = chatActivityInterface2.getDialogId();
                currentAccount = this.fragment.getCurrentAccount();
            }
            if (dialogId != 0) {
                openSharingLocation(LocationController.getInstance(currentAccount).getSharingLocationInfo(dialogId));
                return;
            } else {
                this.fragment.showDialog(new SharingLocationsAlert(getContext(), new FragmentContextView$$ExternalSyntheticLambda1(this), this.resourcesProvider));
                return;
            }
        }
        if (i == 3) {
            if (VoIPService.getSharedInstance() == null || !(getContext() instanceof LaunchActivity)) {
                return;
            }
            GroupCallActivity.create((LaunchActivity) getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
            return;
        }
        if (i != 4) {
            if (i != 5 || this.fragment.getSendMessagesHelper().getImportingHistory(((ChatActivity) this.fragment).getDialogId()) == null) {
                return;
            }
            ImportingAlert importingAlert = new ImportingAlert(getContext(), null, (ChatActivity) this.fragment, this.resourcesProvider);
            importingAlert.setOnHideListener(new SearchTagsList$$ExternalSyntheticLambda5(this, 5));
            this.fragment.showDialog(importingAlert);
            checkImport(false);
            return;
        }
        if (this.fragment.getParentActivity() == null || (groupCall = this.chatActivity.getGroupCall()) == null) {
            return;
        }
        TLRPC.Chat chat = this.fragment.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
        TLRPC.GroupCall groupCall2 = groupCall.call;
        Boolean boolValueOf = Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true);
        Activity parentActivity = this.fragment.getParentActivity();
        BaseFragment baseFragment = this.fragment;
        VoIPHelper.startCall(chat, null, false, boolValueOf, parentActivity, baseFragment, baseFragment.getAccountInstance());
    }

    public void lambda$createPlaybackSpeedButton$10(Float f, Boolean bool) {
        this.slidingSpeed = !bool.booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z = this.isMusic;
        ActionBarMenuSlider.SpeedSlider speedSlider = this.speedSlider;
        float fFloatValue = f.floatValue();
        speedSlider.getClass();
        mediaController.setPlaybackSpeed(z, (fFloatValue * 2.8f) + 0.2f);
    }

    public void lambda$createPlaybackSpeedButton$11(float[] fArr, View view) {
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.isMusic);
        int i = 0;
        while (true) {
            if (i >= fArr.length) {
                i = -1;
                break;
            } else if (playbackSpeed - 0.1f <= fArr[i]) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        float f = fArr[i2 < fArr.length ? i2 : 0];
        MediaController.getInstance().setPlaybackSpeed(this.isMusic, f);
        playbackSpeedChanged(true, playbackSpeed, f);
        checkSpeedHint();
    }

    public void lambda$createPlaybackSpeedButton$12(float f, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        playbackSpeedChanged(false, f, MediaController.getInstance().getPlaybackSpeed(this.isMusic));
    }

    public boolean lambda$createPlaybackSpeedButton$13(View view) {
        final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.isMusic);
        this.speedSlider.setSpeed(playbackSpeed, false);
        ActionBarMenuSlider.SpeedSlider speedSlider = this.speedSlider;
        int i = Theme.key_actionBarDefaultSubmenuBackground;
        speedSlider.setBackgroundColor(Theme.getColor(i, this.resourcesProvider));
        ActionBarMenuSlider.SpeedSlider speedSlider2 = this.speedSlider;
        speedSlider2.blurIsInChat = this.fragment instanceof ChatActivity;
        speedSlider2.blurPaint.setShader(null);
        speedSlider2.blurBitmapShader = null;
        Bitmap bitmap = speedSlider2.blurBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            speedSlider2.blurBitmap = null;
        }
        this.playbackSpeedButton.redrawPopup(Theme.getColor(null, i, false));
        this.playbackSpeedButton.updateColor();
        updatePlaybackButton(false);
        this.playbackSpeedButton.setDimMenu(0.3f);
        this.playbackSpeedButton.toggleSubMenu(this.speedSlider, null);
        this.playbackSpeedButton.setOnMenuDismiss(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$createPlaybackSpeedButton$12(playbackSpeed, (Boolean) obj);
            }
        });
        MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
        return true;
    }

    public void lambda$createPlaybackSpeedButton$9(int i) {
        if (i >= 0) {
            float[] fArr = speeds;
            if (i >= fArr.length) {
                return;
            }
            float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.isMusic);
            float f = fArr[i];
            MediaController.getInstance().setPlaybackSpeed(this.isMusic, f);
            if (playbackSpeed != f) {
                playbackSpeedChanged(false, playbackSpeed, f);
            }
        }
    }

    public static void lambda$openSharingLocation$14(LocationController.SharingLocationInfo sharingLocationInfo, long j, TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j2) {
        SendMessagesHelper.getInstance(sharingLocationInfo.messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, j, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z, i2, 0));
    }

    public void lambda$startJoinFlickerAnimation$15() {
        this.joinButtonFlicker.progress = 0.0f;
        this.joinButton.invalidate();
    }

    public void onItemChanged(ReplaceAnimator replaceAnimator) {
        float f = 1.0f - this.callMessagesAnimator.list.metadata.totalVisibility.now;
        this.titleTextView.setAlpha(f);
        this.titleTextView.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f));
        this.titleTextView.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f));
        ArrayList arrayList = this.callMessagesAnimator.list.entries;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAnimator.Entry entry = (ListAnimator.Entry) obj;
            float fLerp = AndroidUtilities.lerp(0.7f, 1.0f, entry.getVisibility());
            Object obj2 = entry.item;
            ((CallMessageItem) obj2).cell.setAlpha(entry.getVisibility());
            ((CallMessageItem) obj2).cell.setScaleX(fLerp);
            ((CallMessageItem) obj2).cell.setScaleY(fLerp);
        }
    }

    public void openSharingLocation(LocationController.SharingLocationInfo sharingLocationInfo) {
        if (sharingLocationInfo == null || !(this.fragment.getParentActivity() instanceof LaunchActivity)) {
            return;
        }
        LaunchActivity launchActivity = (LaunchActivity) this.fragment.getParentActivity();
        launchActivity.switchToAccount(sharingLocationInfo.messageObject.currentAccount, true);
        LocationActivity locationActivity = new LocationActivity(2);
        locationActivity.setMessageObject(sharingLocationInfo.messageObject);
        locationActivity.setDelegate(new VideoPlayer$$ExternalSyntheticLambda2(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId()));
        launchActivity.lambda$runLinkRequest$100(locationActivity);
    }

    private void playbackSpeedChanged(boolean z, float f, float f2) {
        String string;
        int i;
        if (equals(f, f2)) {
            return;
        }
        if (Math.abs(f2 - 1.0f) < 0.05f) {
            if (f < f2) {
                return;
            }
            string = LocaleController.getString(R.string.AudioSpeedNormal);
            if (Math.abs(f - 2.0f) < 0.05f) {
                i = R.raw.speed_2to1;
            } else {
                i = f2 < f ? R.raw.speed_slow : R.raw.speed_fast;
            }
        } else if (z && equals(f2, 1.5f) && equals(f, 1.0f)) {
            string = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, SpeedIconDrawable.formatNumber(f2));
            i = R.raw.speed_1to15;
        } else if (z && equals(f2, 2.0f) && equals(f, 1.5f)) {
            string = LocaleController.getString(R.string.AudioSpeedFast);
            i = R.raw.speed_15to2;
        } else {
            string = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, SpeedIconDrawable.formatNumber(f2));
            i = f2 < 1.0f ? R.raw.speed_slow : R.raw.speed_fast;
        }
        BulletinFactory.of(this.fragment).createSimpleBulletin(i, string).show();
    }

    private void showSpeedHint() {
        if (this.fragment == null || !(getParent() instanceof ViewGroup)) {
            return;
        }
        HintView hintView = new HintView(getContext(), 6, true) {
            @Override
            public void setVisibility(int i) {
                super.setVisibility(i);
                if (i != 0) {
                    try {
                        ((ViewGroup) getParent()).removeView(this);
                    } catch (Exception unused) {
                    }
                }
            }
        };
        this.speedHintView = hintView;
        hintView.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
        this.speedHintView.setText(LocaleController.getString(R.string.SpeedHint));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
        ((ViewGroup) getParent()).addView(this.speedHintView, marginLayoutParams);
        this.speedHintView.showForView(this.playbackSpeedButton, true);
    }

    public void startJoinFlickerAnimation() {
        CellFlickerDrawable cellFlickerDrawable = this.joinButtonFlicker;
        if (cellFlickerDrawable == null || cellFlickerDrawable.progress < 1.0f) {
            this.flickOnAttach = true;
        } else {
            this.flickOnAttach = false;
            AndroidUtilities.runOnUIThread(new FragmentContextView$$ExternalSyntheticLambda6(this, 0), 150L);
        }
    }

    private void updateAvatars(boolean z) {
        ChatObject.Call groupCall;
        int account;
        TLRPC.User user;
        int currentAccount;
        ValueAnimator valueAnimator;
        checkCreateView();
        if (!z && (valueAnimator = this.avatars.avatarsDrawable.transitionProgressAnimator) != null) {
            valueAnimator.cancel();
            this.avatars.avatarsDrawable.transitionProgressAnimator = null;
        }
        AvatarsImageView avatarsImageView = this.avatars;
        if (avatarsImageView.avatarsDrawable.transitionProgressAnimator != null) {
            avatarsImageView.updateAfterTransitionEnd();
            return;
        }
        if (this.currentStyle == 4) {
            ChatActivityInterface chatActivityInterface = this.chatActivity;
            if (chatActivityInterface != null) {
                groupCall = chatActivityInterface.getGroupCall();
                currentAccount = this.fragment.getCurrentAccount();
            } else {
                currentAccount = this.account;
                groupCall = null;
            }
            account = currentAccount;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            groupCall = VoIPService.getSharedInstance().groupCall;
            user = this.chatActivity != null ? null : VoIPService.getSharedInstance().getUser();
            account = VoIPService.getSharedInstance().getAccount();
        } else {
            groupCall = null;
            account = this.account;
            user = null;
        }
        if (groupCall != null) {
            int size = groupCall.sortedParticipants.size();
            for (int i = 0; i < 3; i++) {
                if (i < size) {
                    this.avatars.setObject(i, account, groupCall.sortedParticipants.get(i));
                } else {
                    this.avatars.setObject(i, account, null);
                }
            }
        } else if (user != null) {
            this.avatars.setObject(0, account, user);
            for (int i2 = 1; i2 < 3; i2++) {
                this.avatars.setObject(i2, account, null);
            }
        } else {
            for (int i3 = 0; i3 < 3; i3++) {
                this.avatars.setObject(i3, account, null);
            }
        }
        this.avatars.commitTransition(z);
        if (this.currentStyle != 4 || groupCall == null) {
            return;
        }
        int iMin = groupCall.call.rtmp_stream ? 0 : Math.min(3, groupCall.sortedParticipants.size());
        int iM = (iMin == 0 ? 10 : CalendarActivity$$ExternalSyntheticOutline0.m(iMin, 1, 24, 52)) + 3;
        if (z) {
            int i4 = ((FrameLayout.LayoutParams) this.titleTextView.getLayoutParams()).leftMargin;
            float f = iM;
            if (AndroidUtilities.dp(f) != i4) {
                float translationX = (this.titleTextView.getTranslationX() + i4) - AndroidUtilities.dp(f);
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
        float f2 = iM;
        this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, 51, f2, 5.0f, (this.isSideMenued ? 64 : 0) + (groupCall.isScheduled() ? 90 : 36), 0.0f));
        this.subtitleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, 51, f2, 25.0f, (this.isSideMenued ? 64 : 0) + (groupCall.isScheduled() ? 90 : 36), 0.0f));
    }

    private void updateCallTitle() {
        ChatObject.Call call;
        checkCreateView();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i = this.currentStyle;
            if (i == 1 || i == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupConnecting), false);
                    return;
                }
                if (sharedInstance.isConference() && (call = sharedInstance.groupCall) != null) {
                    if (call.sortedParticipants.size() <= 1) {
                        this.titleTextView.setText(LocaleController.getString(R.string.ConferenceChat), false);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i2++) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(DialogObject.getShortName(sharedInstance.getAccount(), DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i2).peer)));
                    }
                    if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                        sb.append(" ");
                        sb.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                    }
                    this.titleTextView.setText(sb.toString(), false);
                    return;
                }
                if (sharedInstance.getChat() == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        ChatActivityInterface chatActivityInterface = this.chatActivity;
                        if (chatActivityInterface == null || chatActivityInterface.getCurrentUser() == null || this.chatActivity.getCurrentUser().id != user.id) {
                            this.titleTextView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            return;
                        } else {
                            this.titleTextView.setText(LocaleController.getString(R.string.ReturnToCall));
                            return;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                    this.titleTextView.setText(sharedInstance.groupCall.call.title, false);
                    return;
                }
                ChatActivityInterface chatActivityInterface2 = this.chatActivity;
                if (chatActivityInterface2 == null || chatActivityInterface2.getCurrentChat() == null || this.chatActivity.getCurrentChat().id != sharedInstance.getChat().id) {
                    this.titleTextView.setText(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat currentChat = this.chatActivity.getCurrentChat();
                if (VoIPService.hasRtmpStream()) {
                    this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                } else if (ChatObject.isChannelOrGiga(currentChat)) {
                    this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                } else {
                    this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupViewVoiceChat), false);
                }
            }
        }
    }

    private void updatePlaybackButton(boolean z) {
        if (this.speedIcon == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.isMusic);
        this.speedIcon.setValue(playbackSpeed, z);
        updateColors();
        boolean z2 = this.slidingSpeed;
        this.slidingSpeed = false;
        for (int i = 0; i < this.speedItems.length; i++) {
            if (z2 || Math.abs(playbackSpeed - speeds[i]) >= 0.05f) {
                ActionBarMenuItem.Item item = this.speedItems[i];
                int i2 = Theme.key_actionBarDefaultSubmenuItem;
                item.setColors(getThemedColor(i2), getThemedColor(i2));
            } else {
                ActionBarMenuItem.Item item2 = this.speedItems[i];
                int i3 = Theme.key_featuredStickers_addButtonPressed;
                item2.setColors(getThemedColor(i3), getThemedColor(i3));
            }
        }
        this.speedSlider.setSpeed(playbackSpeed, z);
    }

    private void updateSilent() {
        if (this.currentStyle != 0) {
            AndroidUtilities.updateViewShow(this.silentButton, false, true, false);
            AndroidUtilities.updateViewShow(this.playbackSpeedButton, false, true, false);
        } else {
            boolean z = MediaController.getInstance().isSilent;
            AndroidUtilities.updateViewShow(this.silentButton, z);
            AndroidUtilities.updateViewShow(this.playbackSpeedButton, !z);
        }
    }

    private void updateStyle(int i) {
        updateStyle(i, false);
    }

    public void checkCall(boolean z) {
        boolean z2;
        ChatActivityInterface chatActivityInterface;
        ChatObject.Call groupCall;
        boolean z3;
        ChatObject.Call call;
        float f;
        int i;
        int i2;
        boolean z4;
        AnimatorSet animatorSet;
        boolean z5;
        ChatObject.Call groupCall2;
        TLRPC.Chat currentChat;
        TLRPC.GroupCall groupCall3;
        int i3;
        String str;
        int i4;
        boolean z6;
        TLRPC.GroupCall groupCall4;
        boolean z7;
        boolean z8;
        int i5;
        ChatActivityInterface chatActivityInterface2;
        int i6;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.visible && this.currentStyle == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        View fragmentView = this.fragment.getFragmentView();
        boolean z9 = (z || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z : true;
        if (!GroupCallPip.isShowing()) {
            z2 = (GroupCallActivity.groupCallUiVisible || !this.supportsCalls || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (call = sharedInstance.groupCall) != null && (call.call instanceof TLRPC.TL_groupCallDiscarded)) {
                z2 = false;
            }
            if (!isPlayingVoice() && !GroupCallActivity.groupCallUiVisible && this.supportsCalls && !z2 && (chatActivityInterface = this.chatActivity) != null && (groupCall = chatActivityInterface.getGroupCall()) != null && groupCall.shouldShowPanel()) {
                z2 = true;
                z3 = true;
            }
            if (!z2) {
                z8 = this.visible;
                if (!z8 && ((z9 && this.currentStyle == -1) || (i6 = this.currentStyle) == 4 || i6 == 3 || i6 == 1)) {
                    this.visible = false;
                    if (z9) {
                        if (getVisibility() != 8) {
                            setVisibility(8);
                        }
                        setTopPadding(0.0f);
                    } else {
                        AnimatorSet animatorSet2 = this.animatorSet;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                            this.animatorSet = null;
                        }
                        this.notificationsLocker.lock();
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.animatorSet = animatorSet3;
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.animatorSet.setDuration(220L);
                        this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        this.animatorSet.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                FragmentContextView.this.notificationsLocker.unlock();
                                if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                                    return;
                                }
                                FragmentContextView.this.setVisibility(8);
                                FragmentContextView.this.animatorSet = null;
                                if (FragmentContextView.this.checkLiveStoryAfterAnimation) {
                                    FragmentContextView.this.checkLiveStory(false);
                                } else if (FragmentContextView.this.checkCallAfterAnimation) {
                                    FragmentContextView.this.checkCall(false);
                                } else if (FragmentContextView.this.checkPlayerAfterAnimation) {
                                    FragmentContextView.this.checkPlayer(false);
                                } else if (FragmentContextView.this.checkImportAfterAnimation) {
                                    FragmentContextView.this.checkImport(false);
                                }
                                FragmentContextView.this.checkLiveStoryAfterAnimation = false;
                                FragmentContextView.this.checkCallAfterAnimation = false;
                                FragmentContextView.this.checkPlayerAfterAnimation = false;
                                FragmentContextView.this.checkImportAfterAnimation = false;
                            }
                        });
                        this.animatorSet.start();
                    }
                } else if (z8 && ((i5 = this.currentStyle) == -1 || i5 == 4 || i5 == 3 || i5 == 1)) {
                    this.visible = false;
                    setVisibility(8);
                }
                if (z9 || (chatActivityInterface2 = this.chatActivity) == null || !chatActivityInterface2.openedWithLivestream() || GroupCallPip.isShowing()) {
                    return;
                }
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.InviteExpired, BulletinFactory.of(this.fragment), R.raw.linkbroken);
                return;
            }
            checkCreateView();
            if (z3) {
                f = 0.0f;
                i = 4;
            } else {
                f = 0.0f;
                if (sharedInstance.groupCall != null) {
                    i = 3;
                } else {
                    i = 1;
                }
            }
            i2 = this.currentStyle;
            if (i == i2 && this.animatorSet != null && !z9) {
                this.checkCallAfterAnimation = true;
                return;
            }
            if (i == i2 && this.visible && !z9) {
                AnimatorSet animatorSet4 = this.animatorSet;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                    this.animatorSet = null;
                }
                this.notificationsLocker.lock();
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.animatorSet = animatorSet5;
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", f));
                this.animatorSet.setDuration(220L);
                this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        FragmentContextView.this.notificationsLocker.unlock();
                        if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                            return;
                        }
                        FragmentContextView.this.visible = false;
                        FragmentContextView.this.animatorSet = null;
                        FragmentContextView.this.checkCall(false);
                    }
                });
                this.animatorSet.start();
                return;
            }
            if (z3) {
                if (i2 == 4 || !this.visible) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                updateStyle(4);
                groupCall2 = this.chatActivity.getGroupCall();
                currentChat = this.chatActivity.getCurrentChat();
                if (groupCall2.isScheduled()) {
                    if (this.gradientPaint == null) {
                        TextPaint textPaint = new TextPaint(1);
                        this.gradientTextPaint = textPaint;
                        textPaint.setColor(-1);
                        this.gradientTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        this.gradientTextPaint.setTypeface(AndroidUtilities.bold());
                        Paint paint = new Paint(1);
                        this.gradientPaint = paint;
                        paint.setColor(-1);
                        this.matrix = new Matrix();
                    }
                    this.notifyButtonEnabled = true;
                    LocaleController.getString(R.string.VoipChatNotify);
                    groupCall4 = groupCall2.call;
                    if (groupCall4 == null && groupCall4.schedule_start_subscribed) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    this.willBeNotified = z7;
                    this.joinButton.setVisibility(8);
                    if (!TextUtils.isEmpty(groupCall2.call.title)) {
                        this.titleTextView.setText(groupCall2.call.title, false);
                    } else if (ChatObject.isChannelOrGiga(currentChat)) {
                        this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelScheduledVoiceChat), false);
                    } else {
                        this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupScheduledVoiceChat), false);
                    }
                    this.subtitleTextView.setText(LocaleController.formatStartsTime(groupCall2.call.schedule_date, 4), false);
                    if (!this.scheduleRunnableScheduled) {
                        this.scheduleRunnableScheduled = true;
                        this.updateScheduleTimeRunnable.run();
                    }
                } else {
                    this.notifyButtonEnabled = false;
                    this.joinButton.setVisibility(0);
                    this.joinButton.setText(LocaleController.getString(R.string.VoipChatJoin));
                    if (!TextUtils.isEmpty(groupCall2.call.title)) {
                        this.titleTextView.setText(groupCall2.call.title, false);
                    } else if (groupCall2.call.rtmp_stream && !ChatObject.isChannelOrGiga(currentChat)) {
                        this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupVoiceChat), false);
                    } else {
                        this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelVoiceChat), false);
                    }
                    groupCall3 = groupCall2.call;
                    i3 = groupCall3.participants_count;
                    if (i3 == 0) {
                        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.subtitleTextView;
                        if (groupCall3.rtmp_stream) {
                            i4 = R.string.ViewersWatchingNobody;
                        } else {
                            i4 = R.string.MembersTalkingNobody;
                        }
                        clippingTextViewSwitcher.setText(LocaleController.getString(i4), false);
                    } else {
                        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher2 = this.subtitleTextView;
                        if (groupCall3.rtmp_stream) {
                            str = "ViewersWatching";
                        } else {
                            str = "Participants";
                        }
                        clippingTextViewSwitcher2.setText(LocaleController.formatPluralString(str, i3, new Object[0]), false);
                    }
                    this.frameLayout.invalidate();
                }
                if (this.avatars.avatarsDrawable.wasDraw || !z5) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                updateAvatars(z6);
            } else if (sharedInstance != null || sharedInstance.groupCall == null) {
                if (i2 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                updateAvatars(z4);
                updateStyle(1);
            } else {
                updateAvatars(i2 == 3);
                updateStyle(3);
            }
            if (this.visible) {
            }
            if (z9) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                startJoinFlickerAnimation();
            } else {
                animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.animatorSet = null;
                }
                this.animatorSet = new AnimatorSet();
                this.notificationsLocker2.lock();
                this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.animatorSet.setDuration(220L);
                this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        FragmentContextView.this.notificationsLocker2.unlock();
                        if (FragmentContextView.this.animatorSet != null && FragmentContextView.this.animatorSet.equals(animator)) {
                            FragmentContextView.this.animatorSet = null;
                        }
                        if (FragmentContextView.this.checkLiveStoryAfterAnimation) {
                            FragmentContextView.this.checkLiveStory(false);
                        } else if (FragmentContextView.this.checkCallAfterAnimation) {
                            FragmentContextView.this.checkCall(false);
                        } else if (FragmentContextView.this.checkPlayerAfterAnimation) {
                            FragmentContextView.this.checkPlayer(false);
                        } else if (FragmentContextView.this.checkImportAfterAnimation) {
                            FragmentContextView.this.checkImport(false);
                        }
                        FragmentContextView.this.checkLiveStoryAfterAnimation = false;
                        FragmentContextView.this.checkCallAfterAnimation = false;
                        FragmentContextView.this.checkPlayerAfterAnimation = false;
                        FragmentContextView.this.checkImportAfterAnimation = false;
                        FragmentContextView.this.startJoinFlickerAnimation();
                    }
                });
                this.animatorSet.start();
            }
            this.visible = true;
            setVisibility(0);
        }
        z2 = false;
        z3 = false;
        if (!z2) {
            z8 = this.visible;
            if (!z8) {
                if (z8) {
                    this.visible = false;
                    setVisibility(8);
                }
            } else if (z8) {
                this.visible = false;
                setVisibility(8);
            }
            if (z9) {
                return;
            } else {
                return;
            }
        }
        checkCreateView();
        if (z3) {
            f = 0.0f;
            i = 4;
        } else {
            f = 0.0f;
            if (sharedInstance.groupCall != null) {
                i = 3;
            } else {
                i = 1;
            }
        }
        i2 = this.currentStyle;
        if (i == i2) {
        }
        if (i == i2) {
        }
        if (z3) {
            if (i2 == 4) {
                z5 = false;
            } else {
                z5 = false;
            }
            updateStyle(4);
            groupCall2 = this.chatActivity.getGroupCall();
            currentChat = this.chatActivity.getCurrentChat();
            if (groupCall2.isScheduled()) {
                if (this.gradientPaint == null) {
                    TextPaint textPaint2 = new TextPaint(1);
                    this.gradientTextPaint = textPaint2;
                    textPaint2.setColor(-1);
                    this.gradientTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.gradientTextPaint.setTypeface(AndroidUtilities.bold());
                    Paint paint2 = new Paint(1);
                    this.gradientPaint = paint2;
                    paint2.setColor(-1);
                    this.matrix = new Matrix();
                }
                this.notifyButtonEnabled = true;
                LocaleController.getString(R.string.VoipChatNotify);
                groupCall4 = groupCall2.call;
                if (groupCall4 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                this.willBeNotified = z7;
                this.joinButton.setVisibility(8);
                if (!TextUtils.isEmpty(groupCall2.call.title)) {
                    this.titleTextView.setText(groupCall2.call.title, false);
                } else if (ChatObject.isChannelOrGiga(currentChat)) {
                    this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelScheduledVoiceChat), false);
                } else {
                    this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupScheduledVoiceChat), false);
                }
                this.subtitleTextView.setText(LocaleController.formatStartsTime(groupCall2.call.schedule_date, 4), false);
                if (!this.scheduleRunnableScheduled) {
                    this.scheduleRunnableScheduled = true;
                    this.updateScheduleTimeRunnable.run();
                }
            } else {
                this.notifyButtonEnabled = false;
                this.joinButton.setVisibility(0);
                this.joinButton.setText(LocaleController.getString(R.string.VoipChatJoin));
                if (!TextUtils.isEmpty(groupCall2.call.title)) {
                    this.titleTextView.setText(groupCall2.call.title, false);
                } else if (groupCall2.call.rtmp_stream) {
                    this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelVoiceChat), false);
                } else {
                    this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupVoiceChat), false);
                }
                groupCall3 = groupCall2.call;
                i3 = groupCall3.participants_count;
                if (i3 == 0) {
                    AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher3 = this.subtitleTextView;
                    if (groupCall3.rtmp_stream) {
                        i4 = R.string.ViewersWatchingNobody;
                    } else {
                        i4 = R.string.MembersTalkingNobody;
                    }
                    clippingTextViewSwitcher3.setText(LocaleController.getString(i4), false);
                } else {
                    AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher4 = this.subtitleTextView;
                    if (groupCall3.rtmp_stream) {
                        str = "ViewersWatching";
                    } else {
                        str = "Participants";
                    }
                    clippingTextViewSwitcher4.setText(LocaleController.formatPluralString(str, i3, new Object[0]), false);
                }
                this.frameLayout.invalidate();
            }
            if (this.avatars.avatarsDrawable.wasDraw) {
                z6 = false;
            } else {
                z6 = false;
            }
            updateAvatars(z6);
        } else if (sharedInstance != null) {
            if (i2 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            updateAvatars(z4);
            updateStyle(1);
        } else {
            if (i2 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            updateAvatars(z4);
            updateStyle(1);
        }
        if (this.visible) {
            if (z9) {
                animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.animatorSet = null;
                }
                this.animatorSet = new AnimatorSet();
                this.notificationsLocker2.lock();
                this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.animatorSet.setDuration(220L);
                this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        FragmentContextView.this.notificationsLocker2.unlock();
                        if (FragmentContextView.this.animatorSet != null && FragmentContextView.this.animatorSet.equals(animator)) {
                            FragmentContextView.this.animatorSet = null;
                        }
                        if (FragmentContextView.this.checkLiveStoryAfterAnimation) {
                            FragmentContextView.this.checkLiveStory(false);
                        } else if (FragmentContextView.this.checkCallAfterAnimation) {
                            FragmentContextView.this.checkCall(false);
                        } else if (FragmentContextView.this.checkPlayerAfterAnimation) {
                            FragmentContextView.this.checkPlayer(false);
                        } else if (FragmentContextView.this.checkImportAfterAnimation) {
                            FragmentContextView.this.checkImport(false);
                        }
                        FragmentContextView.this.checkLiveStoryAfterAnimation = false;
                        FragmentContextView.this.checkCallAfterAnimation = false;
                        FragmentContextView.this.checkPlayerAfterAnimation = false;
                        FragmentContextView.this.checkImportAfterAnimation = false;
                        FragmentContextView.this.startJoinFlickerAnimation();
                    }
                });
                this.animatorSet.start();
            } else {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                startJoinFlickerAnimation();
            }
            this.visible = true;
            setVisibility(0);
        }
    }

    public void checkImport(boolean z) {
        int i;
        if (this.chatActivity != null) {
            if (this.visible && ((i = this.currentStyle) == 1 || i == 3)) {
                return;
            }
            checkCreateView();
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
                if (!this.visible || ((!z || this.currentStyle != -1) && this.currentStyle != 5)) {
                    int i2 = this.currentStyle;
                    if (i2 == -1 || i2 == 5) {
                        this.visible = false;
                        setVisibility(8);
                        return;
                    }
                    return;
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
                this.notificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animatorSet = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.animatorSet.setDuration(220L);
                this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        FragmentContextView.this.notificationsLocker.unlock();
                        if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                            return;
                        }
                        FragmentContextView.this.setVisibility(8);
                        FragmentContextView.this.animatorSet = null;
                        if (FragmentContextView.this.checkLiveStoryAfterAnimation) {
                            FragmentContextView.this.checkLiveStory(false);
                        } else if (FragmentContextView.this.checkCallAfterAnimation) {
                            FragmentContextView.this.checkCall(false);
                        } else if (FragmentContextView.this.checkPlayerAfterAnimation) {
                            FragmentContextView.this.checkPlayer(false);
                        } else if (FragmentContextView.this.checkImportAfterAnimation) {
                            FragmentContextView.this.checkImport(false);
                        }
                        FragmentContextView.this.checkLiveStoryAfterAnimation = false;
                        FragmentContextView.this.checkCallAfterAnimation = false;
                        FragmentContextView.this.checkPlayerAfterAnimation = false;
                        FragmentContextView.this.checkImportAfterAnimation = false;
                    }
                });
                this.animatorSet.start();
                return;
            }
            if (this.currentStyle != 5 && this.animatorSet != null && !z) {
                this.checkImportAfterAnimation = true;
                return;
            }
            updateStyle(5);
            if (z && this.topPadding == 0.0f) {
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
                    this.notificationsLocker.lock();
                    this.animatorSet = new AnimatorSet();
                    FragmentContextViewDelegate fragmentContextViewDelegate2 = this.delegate;
                    if (fragmentContextViewDelegate2 != null) {
                        fragmentContextViewDelegate2.onAnimation(true, true);
                    }
                    this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.animatorSet.setDuration(200L);
                    this.animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            FragmentContextView.this.notificationsLocker.unlock();
                            if (FragmentContextView.this.animatorSet == null || !FragmentContextView.this.animatorSet.equals(animator)) {
                                return;
                            }
                            if (FragmentContextView.this.delegate != null) {
                                FragmentContextView.this.delegate.onAnimation(false, true);
                            }
                            FragmentContextView.this.animatorSet = null;
                            if (FragmentContextView.this.checkLiveStoryAfterAnimation) {
                                FragmentContextView.this.checkLiveStory(false);
                            } else if (FragmentContextView.this.checkCallAfterAnimation) {
                                FragmentContextView.this.checkCall(false);
                            } else if (FragmentContextView.this.checkPlayerAfterAnimation) {
                                FragmentContextView.this.checkPlayer(false);
                            } else if (FragmentContextView.this.checkImportAfterAnimation) {
                                FragmentContextView.this.checkImport(false);
                            }
                            FragmentContextView.this.checkLiveStoryAfterAnimation = false;
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
            int i3 = this.currentProgress;
            int i4 = importingHistory.uploadProgress;
            if (i3 != i4) {
                this.currentProgress = i4;
                this.titleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ImportUploading", R.string.ImportUploading, Integer.valueOf(i4))), false);
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (i == NotificationCenter.liveLocationsChanged) {
            checkLiveLocation(false);
            return;
        }
        if (i == NotificationCenter.liveStoryUpdated) {
            checkLiveStory(false);
            return;
        }
        if (i == NotificationCenter.liveLocationsCacheChanged) {
            if (this.chatActivity != null) {
                if (this.chatActivity.getDialogId() == ((Long) objArr[0]).longValue()) {
                    checkLocationString();
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingDidStart || i == NotificationCenter.messagePlayingPlayStateChanged || i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.didEndCall) {
            int i3 = this.currentStyle;
            if (i3 == 1 || i3 == 3 || i3 == 4) {
                checkCall(false);
            }
            checkPlayer(false);
            return;
        }
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
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || this.muteButton == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.get(sharedInstance.getSelfId())) == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                return;
            }
            sharedInstance.setMicMute(true, false, false);
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.muteButton.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            return;
        }
        if (i == NotificationCenter.groupCallTypingsUpdated) {
            checkCreateView();
            if (this.visible && this.currentStyle == 4) {
                ChatObject.Call groupCall = this.chatActivity.getGroupCall();
                if (groupCall != null && this.subtitleTextView != null) {
                    if (groupCall.isScheduled()) {
                        this.subtitleTextView.setText(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                    } else {
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        int i5 = groupCall2.participants_count;
                        if (i5 == 0) {
                            this.subtitleTextView.setText(LocaleController.getString(groupCall2.rtmp_stream ? R.string.ViewersWatchingNobody : R.string.MembersTalkingNobody), false);
                        } else {
                            this.subtitleTextView.setText(LocaleController.formatPluralString(groupCall2.rtmp_stream ? "ViewersWatching" : "Participants", i5, new Object[0]), false);
                        }
                    }
                }
                updateAvatars(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.historyImportProgressChanged) {
            int i6 = this.currentStyle;
            if (i6 == 1 || i6 == 3 || i6 == 4) {
                checkCall(false);
            }
            checkImport(false);
            return;
        }
        if (i == NotificationCenter.messagePlayingSpeedChanged) {
            updatePlaybackButton(true);
            return;
        }
        if (i == NotificationCenter.webRtcMicAmplitudeEvent) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.micAmplitude = 0.0f;
            } else {
                this.micAmplitude = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                Theme.getFragmentContextViewWavesDrawable().setAmplitude(Math.max(this.speakerAmplitude, this.micAmplitude));
                this.capsuleBlobDrawable.setAmplitude(Math.max(this.speakerAmplitude, this.micAmplitude));
                return;
            }
            return;
        }
        if (i != NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            if (i == NotificationCenter.messagePlayingProgressDidChanged && this.currentStyle == 0) {
                invalidate();
                return;
            }
            return;
        }
        checkCreateView();
        this.speakerAmplitude = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            this.micAmplitude = 0.0f;
        }
        if (VoIPService.getSharedInstance() != null) {
            Theme.getFragmentContextViewWavesDrawable().setAmplitude(Math.max(this.speakerAmplitude, this.micAmplitude));
            this.capsuleBlobDrawable.setAmplitude(Math.max(this.speakerAmplitude, this.micAmplitude));
        }
        this.avatars.invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        FragmentContextView fragmentContextView;
        MessageObject playingMessageObject;
        if (this.frameLayout == null) {
            return;
        }
        if (!this.drawOverlay || getVisibility() == 0) {
            int i = this.currentStyle;
            if (i == 3 || i == 1) {
                Theme.getFragmentContextViewWavesDrawable().updateState(this.wasDraw);
                this.capsuleBlobDrawable.updateState(this.wasDraw);
                float fDp = this.topPadding / AndroidUtilities.dp(getStyleHeight());
                if (this.collapseTransition) {
                    Theme.getFragmentContextViewWavesDrawable().draw(0.0f, this.extraHeight + 0.0f, getMeasuredWidth(), getMeasuredHeight(), canvas, null, Math.min(fDp, 1.0f - this.collapseProgress));
                } else {
                    Theme.getFragmentContextViewWavesDrawable().draw(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), canvas, this, fDp);
                }
                fragmentContextView = this;
                fragmentContextView.invalidate();
            } else {
                fragmentContextView = this;
            }
            super.dispatchDraw(canvas);
            if (fragmentContextView.currentStyle == 0 && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                float f = -AndroidUtilities.dpf2(1.0f);
                float fLerp = AndroidUtilities.lerp(f, AndroidUtilities.dpf2(1.0f) + fragmentContextView.getMeasuredWidth(), playingMessageObject.audioProgress);
                float measuredHeight = fragmentContextView.getMeasuredHeight();
                float fDpf2 = measuredHeight - AndroidUtilities.dpf2(2.0f);
                fragmentContextView.progressPaint.setColor(fragmentContextView.getThemedColor(Theme.key_telegram_color));
                canvas.drawRoundRect(f, fDpf2, fLerp, measuredHeight, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), fragmentContextView.progressPaint);
            }
            fragmentContextView.wasDraw = true;
        }
    }

    public boolean drawOverlayed() {
        return this.currentStyle == 3;
    }

    public CapsuleBlobDrawable getCapsuleBlobDrawable() {
        return this.capsuleBlobDrawable;
    }

    public int getCurrentStyle() {
        return this.currentStyle;
    }

    public int getStyleHeight() {
        return this.currentStyle == 4 ? 48 : 36;
    }

    public float getTopPadding() {
        return this.topPadding;
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

    public boolean isCallTypeVisible() {
        int i = this.currentStyle;
        return (i == 1 || i == 3) && this.visible;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isLocation) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsCacheChanged);
            checkLiveLocation(true);
        } else {
            for (int i = 0; i < 4; i++) {
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.historyImportProgressChanged);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i).subscribeToCallMessages(0L, this);
            }
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.groupCallVisibilityChanged);
            if (LivePlayer.recording != null) {
                checkLiveStory(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !GroupCallPip.isShowing()) {
                checkCall(true);
            } else if (this.chatActivity == null || this.fragment.getSendMessagesHelper().getImportingHistory(this.chatActivity.getDialogId()) == null || isPlayingVoice()) {
                ChatActivityInterface chatActivityInterface = this.chatActivity;
                if (chatActivityInterface == null || chatActivityInterface.getGroupCall() == null || !this.chatActivity.getGroupCall().shouldShowPanel() || GroupCallPip.isShowing() || isPlayingVoice()) {
                    checkCall(true);
                    checkPlayer(true);
                    updatePlaybackButton(false);
                } else {
                    checkCall(true);
                }
            } else {
                checkImport(true);
            }
        }
        int i2 = this.currentStyle;
        if (i2 == 3 || i2 == 1) {
            Theme.getFragmentContextViewWavesDrawable().addParent(this);
            this.capsuleBlobDrawable.start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.isMuted != z && this.muteButton != null) {
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
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.speakerAmplitude = 0.0f;
        this.micAmplitude = 0.0f;
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
            this.capsuleBlobDrawable.updateState(this.visible);
        }
        if (this.isMuted) {
            this.micAmplitude = 0.0f;
            Theme.getFragmentContextViewWavesDrawable().setAmplitude(0.0f);
            this.capsuleBlobDrawable.setAmplitude(0.0f, false);
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        VoIPService.StateListener.CC.$default$onCameraSwitch(this, z);
    }

    @Override
    public void onDetachedFromWindow() {
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
        this.notificationsLocker.unlock();
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
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i).unsubscribeFromCallMessages(0L, this);
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
            this.capsuleBlobDrawable.stop();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.wasDraw = false;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, AndroidUtilities.dp2(getStyleHeight()));
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        VoIPService.StateListener.CC.$default$onMediaStateUpdated(this, i, i2);
    }

    @Override
    public void onNewGroupCallMessage(long j, GroupCallMessage groupCallMessage) {
        if (this.groupCallMessagesContainer == null) {
            return;
        }
        int i = this.currentStyle;
        if ((i == 1 || i == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j) {
            this.groupCallMessageCounter++;
            if (groupCallMessage.isOut()) {
                return;
            }
            this.callMessagesAnimator.replace(new CallMessageItem(this.groupCallMessagesContainer, groupCallMessage), true);
        }
    }

    public void onPanTranslationUpdate(float f) {
        HintView hintView = this.speedHintView;
        if (hintView != null) {
            hintView.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f);
        }
    }

    @Override
    public void onPopGroupCallMessage() {
        int i = this.groupCallMessageCounter;
        if (i > 0) {
            int i2 = i - 1;
            this.groupCallMessageCounter = i2;
            if (i2 == 0) {
                this.callMessagesAnimator.replace(null, true);
            }
        }
    }

    @Override
    public final void onScreenOnChange(boolean z) {
        VoIPService.StateListener.CC.$default$onScreenOnChange(this, z);
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
        VoIPService.StateListener.CC.$default$onSignalBarsCountChanged(this, i);
    }

    @Override
    public void onStateChanged(int i) {
        updateCallTitle();
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    public void setCollapseTransition(boolean z, float f, float f2) {
        this.collapseTransition = z;
        this.extraHeight = f;
        this.collapseProgress = f2;
    }

    public void setDelegate(FragmentContextViewDelegate fragmentContextViewDelegate) {
        this.delegate = fragmentContextViewDelegate;
    }

    public void setDrawOverlay(boolean z) {
        this.drawOverlay = z;
    }

    public void setLeftMargin(float f) {
        if (this.frameLayout == null) {
            this.leftMargin = f;
            return;
        }
        ImageView imageView = this.playButton;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
        RLottieImageView rLottieImageView = this.importingImageView;
        if (rLottieImageView != null) {
            rLottieImageView.setTranslationX(f);
        }
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.titleTextView;
        if (clippingTextViewSwitcher != null) {
            clippingTextViewSwitcher.setTranslationX(f);
        }
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher2 = this.subtitleTextView;
        if (clippingTextViewSwitcher2 != null) {
            clippingTextViewSwitcher2.setTranslationX(f);
        }
        AvatarsImageView avatarsImageView = this.avatars;
        if (avatarsImageView != null) {
            avatarsImageView.setTranslationX(f);
        }
    }

    public void setSupportsCalls(boolean z) {
        this.supportsCalls = z;
    }

    public void setTopPadding(float f) {
        this.topPadding = f;
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        setTopPadding(this.topPadding);
        if (i == 8) {
            this.wasDraw = false;
        }
    }

    public void toggleScheduledNotify() {
        ChatActivityInterface chatActivityInterface;
        ChatObject.Call groupCall;
        if (this.fragment == null || (chatActivityInterface = this.chatActivity) == null || (groupCall = chatActivityInterface.getGroupCall()) == null || groupCall.call == null) {
            return;
        }
        if (this.toggleGroupCallStartSubscriptionReqId != 0) {
            this.fragment.getConnectionsManager().cancelRequest(this.toggleGroupCallStartSubscriptionReqId, true);
            this.toggleGroupCallStartSubscriptionReqId = 0;
        }
        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
        togglegroupcallstartsubscription.call = groupCall.getInputGroupCall();
        TLRPC.GroupCall groupCall2 = groupCall.call;
        boolean z = true ^ this.willBeNotified;
        this.willBeNotified = z;
        groupCall2.schedule_start_subscribed = z;
        togglegroupcallstartsubscription.subscribed = z;
        this.toggleGroupCallStartSubscriptionReqId = this.fragment.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
        if (this.scheduleRunnableScheduled) {
            AndroidUtilities.cancelRunOnUIThread(this.updateScheduleTimeRunnable);
            this.scheduleRunnableScheduled = false;
        }
        this.updateScheduleTimeRunnable.run();
        BulletinFactory bulletinFactoryOf = BulletinFactory.of(this.fragment);
        boolean z2 = this.willBeNotified;
        FactCheckController$$ExternalSyntheticOutline0.m(z2 ? R.string.LiveStreamWillNotify : R.string.LiveStreamWillNotNotify, bulletinFactoryOf, z2 ? R.raw.silent_unmute : R.raw.silent_mute);
    }

    public void updateColors() {
        TypefaceSpan[] typefaceSpanArr;
        int themedColor = getThemedColor(!equals(MediaController.getInstance().getPlaybackSpeed(this.isMusic), 1.0f) ? Theme.key_featuredStickers_addButtonPressed : Theme.key_inappPlayerClose);
        SpeedIconDrawable speedIconDrawable = this.speedIcon;
        if (speedIconDrawable != null) {
            speedIconDrawable.setColor(themedColor);
        }
        ActionBarMenuItem actionBarMenuItem = this.playbackSpeedButton;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setBackground(Theme.createSelectorDrawable(themedColor & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.playButton;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_inappPlayerPlayPause), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.closeButton;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_inappPlayerClose), PorterDuff.Mode.MULTIPLY));
        }
        if (this.subtitleTextView != null) {
            int i = 0;
            while (i < 2) {
                TextView textView = i == 0 ? this.subtitleTextView.getTextView() : this.subtitleTextView.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(getThemedColor(Theme.key_inappPlayerClose));
                }
                i++;
            }
        }
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.titleTextView;
        if (clippingTextViewSwitcher != null) {
            Object tag = clippingTextViewSwitcher.getTag();
            if (tag instanceof Integer) {
                int iIntValue = ((Integer) tag).intValue();
                int i2 = 0;
                while (i2 < 2) {
                    TextView textView2 = i2 == 0 ? this.titleTextView.getTextView() : this.titleTextView.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(getThemedColor(iIntValue));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (typefaceSpanArr = (TypefaceSpan[]) ((Spanned) text).getSpans(0, text.length(), TypefaceSpan.class)) != null) {
                            for (TypefaceSpan typefaceSpan : typefaceSpanArr) {
                                typefaceSpan.setColor(getThemedColor(Theme.key_inappPlayerPerformer));
                            }
                        }
                    }
                    i2++;
                }
            }
        }
    }

    public FragmentContextView(Context context, BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this(context, baseFragment, null, z, resourcesProvider);
    }

    private void updateStyle(int i, boolean z) {
        if (this.currentStyle != i || z) {
            checkCreateView();
            int i2 = this.currentStyle;
            if (i2 == 3 || i2 == 1) {
                Theme.getFragmentContextViewWavesDrawable().removeParent(this);
                this.capsuleBlobDrawable.stop();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                ReplaceAnimator replaceAnimator = this.callMessagesAnimator;
                if (replaceAnimator != null) {
                    replaceAnimator.replace(null, true);
                }
            }
            this.currentStyle = i;
            this.frameLayout.setWillNotDraw(i != 4);
            if (i != 4) {
                this.notifyButtonEnabled = false;
            }
            AvatarsImageView avatarsImageView = this.avatars;
            if (avatarsImageView != null) {
                avatarsImageView.setStyle(this.currentStyle);
                this.avatars.setLayoutParams(LayoutHelper.createFrame(108, getStyleHeight(), 51));
            }
            this.frameLayout.setLayoutParams(LayoutHelper.createFrame(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f = this.topPadding;
            if (f > 0.0f && f != AndroidUtilities.dp2(getStyleHeight())) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            }
            if (i == 6) {
                this.selector.setBackground(Theme.getSelectorDrawable(false));
                this.frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(Theme.key_stories_circle_live1), getThemedColor(Theme.key_stories_circle_live2)}));
                this.frameLayout.setTag(null);
                this.subtitleTextView.setVisibility(8);
                this.joinButton.setVisibility(8);
                this.closeButton.setVisibility(8);
                this.playButton.setVisibility(8);
                this.muteButton.setVisibility(8);
                this.importingImageView.setVisibility(8);
                this.importingImageView.stopAnimation();
                this.avatars.setVisibility(8);
                this.titleTextView.setTag(Integer.valueOf(Theme.key_returnToCallText));
                int i3 = 0;
                while (i3 < 2) {
                    TextView textView = i3 == 0 ? this.titleTextView.getTextView() : this.titleTextView.getNextTextView();
                    if (textView != null) {
                        textView.setGravity(19);
                        textView.setTextColor(getThemedColor(Theme.key_returnToCallText));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                    }
                    i3++;
                }
                this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, -1.0f, this.isSideMenued ? 64 : 0, 0.0f));
                return;
            }
            if (i == 5) {
                this.selector.setBackground(Theme.getSelectorDrawable(false));
                this.frameLayout.setBackgroundColor(0);
                this.frameLayout.setTag(Integer.valueOf(Theme.key_inappPlayerBackground));
                int i4 = 0;
                while (i4 < 2) {
                    TextView textView2 = i4 == 0 ? this.titleTextView.getTextView() : this.titleTextView.getNextTextView();
                    if (textView2 != null) {
                        textView2.setGravity(19);
                        textView2.setTextColor(getThemedColor(Theme.key_inappPlayerTitle));
                        textView2.setTypeface(Typeface.DEFAULT);
                        textView2.setTextSize(1, 15.0f);
                    }
                    i4++;
                }
                this.titleTextView.setTag(Integer.valueOf(Theme.key_inappPlayerTitle));
                this.subtitleTextView.setVisibility(8);
                this.joinButton.setVisibility(8);
                this.closeButton.setVisibility(8);
                this.playButton.setVisibility(8);
                this.muteButton.setVisibility(8);
                this.avatars.setVisibility(8);
                this.importingImageView.setVisibility(0);
                this.importingImageView.playAnimation();
                this.closeButton.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                ActionBarMenuItem actionBarMenuItem = this.playbackSpeedButton;
                if (actionBarMenuItem != null) {
                    actionBarMenuItem.setVisibility(8);
                    this.playbackSpeedButton.setTag(null);
                }
                this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 36.0f, 51, 35.0f, 0.0f, (this.isSideMenued ? 64 : 0) + 36, 0.0f));
                return;
            }
            if (i == 0 || i == 2) {
                this.selector.setBackground(Theme.getSelectorDrawable(false));
                this.frameLayout.setBackgroundColor(0);
                this.frameLayout.setTag(Integer.valueOf(Theme.key_inappPlayerBackground));
                this.subtitleTextView.setVisibility(8);
                this.joinButton.setVisibility(8);
                this.closeButton.setVisibility(0);
                this.playButton.setVisibility(0);
                this.muteButton.setVisibility(8);
                this.importingImageView.setVisibility(8);
                this.importingImageView.stopAnimation();
                this.avatars.setVisibility(8);
                int i5 = 0;
                while (i5 < 2) {
                    TextView textView3 = i5 == 0 ? this.titleTextView.getTextView() : this.titleTextView.getNextTextView();
                    if (textView3 != null) {
                        textView3.setGravity(19);
                        textView3.setTextColor(getThemedColor(Theme.key_inappPlayerTitle));
                        textView3.setTypeface(Typeface.DEFAULT);
                        textView3.setTextSize(1, 15.0f);
                    }
                    i5++;
                }
                this.titleTextView.setTag(Integer.valueOf(Theme.key_inappPlayerTitle));
                if (i == 6) {
                    this.playButton.setLayoutParams(LayoutHelper.createFrame(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 36.0f, 51, 51.0f, 0.0f, (this.isSideMenued ? 64 : 0) + 36, 0.0f));
                    this.closeButton.setVisibility(8);
                    return;
                } else {
                    if (i != 0) {
                        this.playButton.setLayoutParams(LayoutHelper.createFrame(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                        this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 36.0f, 51, 51.0f, 0.0f, (this.isSideMenued ? 64 : 0) + 36, 0.0f));
                        this.closeButton.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                        return;
                    }
                    this.playButton.setLayoutParams(LayoutHelper.createFrame(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 36.0f, 51, 37.0f, 0.0f, (this.isSideMenued ? 64 : 0) + 36, 0.0f));
                    createPlaybackSpeedButton();
                    ActionBarMenuItem actionBarMenuItem2 = this.playbackSpeedButton;
                    if (actionBarMenuItem2 != null) {
                        actionBarMenuItem2.setVisibility(0);
                        this.playbackSpeedButton.setTag(1);
                    }
                    this.closeButton.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                    return;
                }
            }
            if (i == 4) {
                this.selector.setBackground(Theme.getSelectorDrawable(false));
                this.frameLayout.setBackgroundColor(0);
                this.frameLayout.setTag(Integer.valueOf(Theme.key_inappPlayerBackground));
                this.muteButton.setVisibility(8);
                this.subtitleTextView.setVisibility(0);
                int i6 = 0;
                while (i6 < 2) {
                    TextView textView4 = i6 == 0 ? this.titleTextView.getTextView() : this.titleTextView.getNextTextView();
                    if (textView4 != null) {
                        textView4.setGravity(51);
                        textView4.setTextColor(getThemedColor(Theme.key_inappPlayerPerformer));
                        textView4.setTypeface(AndroidUtilities.bold());
                        textView4.setTextSize(1, 15.0f);
                    }
                    i6++;
                }
                this.titleTextView.setTag(Integer.valueOf(Theme.key_inappPlayerPerformer));
                this.titleTextView.setPadding(0, 0, this.joinButtonWidth, 0);
                this.importingImageView.setVisibility(8);
                this.importingImageView.stopAnimation();
                ChatActivityInterface chatActivityInterface = this.chatActivity;
                this.avatars.setVisibility(!((chatActivityInterface == null || chatActivityInterface.getGroupCall() == null || this.chatActivity.getGroupCall().call == null || !this.chatActivity.getGroupCall().call.rtmp_stream) ? false : true) ? 0 : 8);
                if (this.avatars.getVisibility() != 8) {
                    updateAvatars(false);
                } else {
                    this.titleTextView.setTranslationX(-AndroidUtilities.dp(36.0f));
                    this.subtitleTextView.setTranslationX(-AndroidUtilities.dp(36.0f));
                }
                this.closeButton.setVisibility(8);
                this.playButton.setVisibility(8);
                ActionBarMenuItem actionBarMenuItem3 = this.playbackSpeedButton;
                if (actionBarMenuItem3 != null) {
                    actionBarMenuItem3.setVisibility(8);
                    this.playbackSpeedButton.setTag(null);
                    return;
                }
                return;
            }
            if (i == 1 || i == 3) {
                this.selector.setBackground(null);
                updateCallTitle();
                boolean zHasRtmpStream = VoIPService.hasRtmpStream();
                this.avatars.setVisibility(!zHasRtmpStream ? 0 : 8);
                if (i == 3 && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().registerStateListener(this);
                }
                if (this.avatars.getVisibility() != 8) {
                    updateAvatars(false);
                } else {
                    this.titleTextView.setTranslationX(0.0f);
                    this.subtitleTextView.setTranslationX(0.0f);
                }
                this.muteButton.setVisibility(!zHasRtmpStream ? 0 : 8);
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
                this.capsuleBlobDrawable.start();
                invalidate();
                int i7 = 0;
                while (i7 < 2) {
                    TextView textView5 = i7 == 0 ? this.titleTextView.getTextView() : this.titleTextView.getNextTextView();
                    if (textView5 != null) {
                        textView5.setGravity(19);
                        textView5.setTextColor(getThemedColor(Theme.key_returnToCallText));
                        textView5.setTypeface(AndroidUtilities.bold());
                        textView5.setTextSize(1, 14.0f);
                    }
                    i7++;
                }
                this.titleTextView.setTag(Integer.valueOf(Theme.key_returnToCallText));
                this.closeButton.setVisibility(8);
                this.playButton.setVisibility(8);
                this.subtitleTextView.setVisibility(8);
                this.joinButton.setVisibility(8);
                this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, this.isSideMenued ? 64 : 0, 0.0f));
                this.titleTextView.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.joinButtonWidth, 0);
                ActionBarMenuItem actionBarMenuItem4 = this.playbackSpeedButton;
                if (actionBarMenuItem4 != null) {
                    actionBarMenuItem4.setVisibility(8);
                    this.playbackSpeedButton.setTag(null);
                }
            }
        }
    }

    public FragmentContextView(Context context, BaseFragment baseFragment, View view, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this(context, baseFragment, view, z, resourcesProvider, false);
    }

    public FragmentContextView(Context context, BaseFragment baseFragment, View view, boolean z, Theme.ResourcesProvider resourcesProvider, boolean z2) {
        super(context);
        this.capsuleBlobDrawable = new CapsuleBlobDrawable();
        this.speedItems = new ActionBarMenuItem.Item[6];
        this.currentProgress = -1;
        this.currentStyle = -1;
        this.supportsCalls = true;
        this.notifyText = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.updateScheduleTimeRunnable = new Runnable() {
            @Override
            public void run() {
                if (FragmentContextView.this.gradientTextPaint == null || !(FragmentContextView.this.fragment instanceof ChatActivity)) {
                    FragmentContextView.this.scheduleRunnableScheduled = false;
                    return;
                }
                ChatObject.Call groupCall = FragmentContextView.this.chatActivity.getGroupCall();
                if (groupCall == null || !groupCall.isScheduled()) {
                    FragmentContextView.this.notifyButtonEnabled = false;
                    FragmentContextView.this.scheduleRunnableScheduled = false;
                    return;
                }
                int currentTime = groupCall.call.schedule_date - FragmentContextView.this.fragment.getConnectionsManager().getCurrentTime();
                String pluralString = currentTime >= 86400 ? LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]) : AndroidUtilities.formatFullDuration(currentTime);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = FragmentContextView.this.notifyText;
                if (!FragmentContextView.this.willBeNotified) {
                    pluralString = LocaleController.getString(R.string.VoipChatNotify);
                }
                animatedTextDrawable.setText(pluralString, true);
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
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.notificationsLocker2 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.progressPaint = new Paint(1);
        this.toggleGroupCallStartSubscriptionReqId = 0;
        this.callMessagesAnimator = new ReplaceAnimator(new EmojiView$$ExternalSyntheticLambda11(this, 4), CubicBezierInterpolator.EASE_OUT_QUINT, 450L);
        this.groupCallMessageCounter = 0;
        this.resourcesProvider = resourcesProvider;
        this.isSideMenued = z2;
        this.fragment = baseFragment;
        if (baseFragment instanceof ChatActivityInterface) {
            this.chatActivity = (ChatActivityInterface) baseFragment;
        }
        this.applyingView = view;
        this.visible = true;
        this.isLocation = z;
        if (view == null) {
            ((ViewGroup) baseFragment.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
