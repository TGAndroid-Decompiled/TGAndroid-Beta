package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlobDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.iv.RichMediaCell;

public class GroupCallUserCell extends FrameLayout {
    private AccountInstance accountInstance;
    private AnimatorSet animatorSet;
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImageView;
    private RadialProgressView avatarProgressView;
    private AvatarWavesDrawable avatarWavesDrawable;
    private Runnable checkRaiseRunnable;
    private ChatObject.Call currentCall;
    private TLRPC.Chat currentChat;
    private boolean currentIconGray;
    private int currentStatus;
    private TLRPC.User currentUser;
    private Paint dividerPaint;
    private SimpleTextView fullAboutTextView;
    private int grayIconColor;
    private boolean hasAvatar;
    private boolean isSpeaking;
    private int lastMuteColor;
    private boolean lastMuted;
    private boolean lastRaisedHand;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable leftDrawable;
    private RLottieImageView muteButton;
    private RLottieDrawable muteDrawable;
    private SimpleTextView nameTextView;
    private boolean needDivider;
    private TLRPC.GroupCallParticipant participant;
    private Drawable premiumDrawable;
    private float progressToAvatarPreview;
    private Runnable raiseHandCallback;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable rightDrawable;
    private long selfId;
    private Runnable shakeHandCallback;
    private RLottieDrawable shakeHandDrawable;
    private Drawable speakingDrawable;
    private SimpleTextView[] statusTextView;
    private Runnable updateRunnable;
    private boolean updateRunnableScheduled;
    private Runnable updateVoiceRunnable;
    private boolean updateVoiceRunnableScheduled;
    private Drawable verifiedDrawable;

    public final class AnonymousClass3 extends AnimatedEmojiDrawable.WrapSizeDrawable {
        @Override
        public final void draw(Canvas canvas) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
            super.draw(canvas);
            canvas.restore();
        }
    }

    public final class AvatarWavesDrawable {
        public float amplitude;
        public float animateAmplitudeDiff;
        public float animateToAmplitude;
        public final BlobDrawable blobDrawable;
        public final BlobDrawable blobDrawable2;
        public boolean hasCustomColor;
        public int isMuted;
        public boolean showWaves;
        public float wavesEnter = 0.0f;
        public float progressToMuted = 0.0f;

        public AvatarWavesDrawable(int i, int i2) {
            BlobDrawable blobDrawable = new BlobDrawable(6);
            this.blobDrawable = blobDrawable;
            BlobDrawable blobDrawable2 = new BlobDrawable(8);
            this.blobDrawable2 = blobDrawable2;
            float f = i;
            blobDrawable.minRadius = f;
            float f2 = i2;
            blobDrawable.maxRadius = f2;
            blobDrawable2.minRadius = f;
            blobDrawable2.maxRadius = f2;
            blobDrawable.generateBlob();
            blobDrawable2.generateBlob();
            Paint paint = blobDrawable.paint;
            int i3 = Theme.key_voipgroup_speakingText;
            paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, i3, false), 38));
            blobDrawable2.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, i3, false), 38));
        }

        public final void draw(Canvas canvas, View view, float f, float f2) {
            float f3;
            float f4;
            if (LiteMode.isEnabled(512)) {
                float f5 = (this.amplitude * 0.4f) + 0.8f;
                if (this.showWaves || this.wavesEnter != 0.0f) {
                    canvas.save();
                    float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.wavesEnter) * f5;
                    canvas.scale(interpolation, interpolation, f, f2);
                    boolean z = this.hasCustomColor;
                    BlobDrawable blobDrawable = this.blobDrawable;
                    if (!z) {
                        int i = this.isMuted;
                        if (i != 1) {
                            float f6 = this.progressToMuted;
                            if (f6 != 1.0f) {
                                float f7 = f6 + 0.10666667f;
                                this.progressToMuted = f7;
                                if (f7 > 1.0f) {
                                    this.progressToMuted = 1.0f;
                                }
                            } else if (i == 1) {
                                f3 = this.progressToMuted;
                                if (f3 != 0.0f) {
                                    f4 = f3 - 0.10666667f;
                                    this.progressToMuted = f4;
                                    if (f4 < 0.0f) {
                                        this.progressToMuted = 0.0f;
                                    }
                                }
                            }
                        } else if (i == 1) {
                            f3 = this.progressToMuted;
                            if (f3 != 0.0f) {
                                f4 = f3 - 0.10666667f;
                                this.progressToMuted = f4;
                                if (f4 < 0.0f) {
                                    this.progressToMuted = 0.0f;
                                }
                            }
                        }
                        blobDrawable.paint.setColor(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(this.progressToMuted, Theme.getColor(null, Theme.key_voipgroup_speakingText, false), Theme.getColor(null, this.isMuted == 2 ? Theme.key_voipgroup_mutedByAdminIcon : Theme.key_voipgroup_listeningText, false)), 38));
                    }
                    blobDrawable.update(this.amplitude, 1.0f);
                    blobDrawable.draw(f, f2, canvas, blobDrawable.paint);
                    BlobDrawable blobDrawable2 = this.blobDrawable2;
                    blobDrawable2.update(this.amplitude, 1.0f);
                    blobDrawable2.draw(f, f2, canvas, blobDrawable.paint);
                    canvas.restore();
                }
                if (this.wavesEnter != 0.0f) {
                    view.invalidate();
                }
            }
        }

        public final float getAvatarScale() {
            float f = (this.amplitude * 0.2f) + 0.9f;
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.wavesEnter);
            return DiffUtil.m(1.0f, interpolation, 1.0f, f * interpolation);
        }

        public final void setAmplitude(double d) {
            float f = ((float) d) / 80.0f;
            float f2 = 0.0f;
            if (!this.showWaves) {
                f = 0.0f;
            }
            if (f > 1.0f) {
                f2 = 1.0f;
            } else if (f >= 0.0f) {
                f2 = f;
            }
            this.animateToAmplitude = f2;
            this.animateAmplitudeDiff = (f2 - this.amplitude) / 200.0f;
        }

        public final void setColor(int i) {
            this.hasCustomColor = true;
            this.blobDrawable.paint.setColor(i);
        }

        public final void setShowWaves(View view, boolean z) {
            if (this.showWaves != z) {
                view.invalidate();
            }
            this.showWaves = z;
        }

        public final void update() {
            float f = this.animateToAmplitude;
            float f2 = this.amplitude;
            if (f != f2) {
                float f3 = this.animateAmplitudeDiff;
                float f4 = (16.0f * f3) + f2;
                this.amplitude = f4;
                if (f3 > 0.0f) {
                    if (f4 > f) {
                        this.amplitude = f;
                    }
                } else if (f4 < f) {
                    this.amplitude = f;
                }
            }
            boolean z = this.showWaves;
            if (z) {
                float f5 = this.wavesEnter;
                if (f5 != 1.0f) {
                    float f6 = f5 + 0.045714285f;
                    this.wavesEnter = f6;
                    if (f6 > 1.0f) {
                        this.wavesEnter = 1.0f;
                        return;
                    }
                    return;
                }
            }
            if (z) {
                return;
            }
            float f7 = this.wavesEnter;
            if (f7 != 0.0f) {
                float f8 = f7 - 0.045714285f;
                this.wavesEnter = f8;
                if (f8 < 0.0f) {
                    this.wavesEnter = 0.0f;
                }
            }
        }
    }

    public final class VerifiedDrawable extends Drawable {
        public final Drawable[] drawables;

        public VerifiedDrawable(Context context) {
            this.drawables = new Drawable[]{drawableMutate, context.getResources().getDrawable(R.drawable.verified_check).mutate()};
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
        }

        @Override
        public final void draw(Canvas canvas) {
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.drawables;
                if (i >= drawableArr.length) {
                    return;
                }
                drawableArr[i].setBounds(getBounds());
                drawableArr[i].draw(canvas);
                i++;
            }
        }

        @Override
        public final int getIntrinsicHeight() {
            return this.drawables[0].getIntrinsicHeight();
        }

        @Override
        public final int getIntrinsicWidth() {
            return this.drawables[0].getIntrinsicWidth();
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
            int i2 = 0;
            while (true) {
                Drawable[] drawableArr = this.drawables;
                if (i2 >= drawableArr.length) {
                    return;
                }
                drawableArr[i2].setAlpha(i);
                i2++;
            }
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public GroupCallUserCell(Context context) {
        super(context);
        this.statusTextView = new SimpleTextView[5];
        final int i = 0;
        this.shakeHandCallback = new Runnable(this) {
            public final GroupCallUserCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.lambda$new$0();
                        break;
                    case 1:
                        this.f$0.lambda$new$1();
                        break;
                    case 2:
                        this.f$0.lambda$new$2();
                        break;
                    case 3:
                        this.f$0.lambda$new$3();
                        break;
                    default:
                        this.f$0.lambda$new$4();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.raiseHandCallback = new Runnable(this) {
            public final GroupCallUserCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$0();
                        break;
                    case 1:
                        this.f$0.lambda$new$1();
                        break;
                    case 2:
                        this.f$0.lambda$new$2();
                        break;
                    case 3:
                        this.f$0.lambda$new$3();
                        break;
                    default:
                        this.f$0.lambda$new$4();
                        break;
                }
            }
        };
        this.grayIconColor = Theme.key_voipgroup_mutedIcon;
        final int i3 = 2;
        this.checkRaiseRunnable = new Runnable(this) {
            public final GroupCallUserCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$new$0();
                        break;
                    case 1:
                        this.f$0.lambda$new$1();
                        break;
                    case 2:
                        this.f$0.lambda$new$2();
                        break;
                    case 3:
                        this.f$0.lambda$new$3();
                        break;
                    default:
                        this.f$0.lambda$new$4();
                        break;
                }
            }
        };
        final int i4 = 3;
        this.updateRunnable = new Runnable(this) {
            public final GroupCallUserCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$0();
                        break;
                    case 1:
                        this.f$0.lambda$new$1();
                        break;
                    case 2:
                        this.f$0.lambda$new$2();
                        break;
                    case 3:
                        this.f$0.lambda$new$3();
                        break;
                    default:
                        this.f$0.lambda$new$4();
                        break;
                }
            }
        };
        final int i5 = 4;
        this.updateVoiceRunnable = new Runnable(this) {
            public final GroupCallUserCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f$0.lambda$new$0();
                        break;
                    case 1:
                        this.f$0.lambda$new$1();
                        break;
                    case 2:
                        this.f$0.lambda$new$2();
                        break;
                    case 3:
                        this.f$0.lambda$new$3();
                        break;
                    default:
                        this.f$0.lambda$new$4();
                        break;
                }
            }
        };
        Paint paint = new Paint();
        this.dividerPaint = paint;
        paint.setColor(Theme.getColor(null, Theme.key_voipgroup_actionBar, false));
        this.avatarDrawable = new AvatarDrawable();
        setClipChildren(false);
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(24.0f));
        BackupImageView backupImageView2 = this.avatarImageView;
        boolean z = LocaleController.isRTL;
        addView(backupImageView2, LayoutHelper.createFrame(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11.0f, 6.0f, z ? 11.0f : 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context) {
            public final Paint paint;

            {
                Paint paint2 = new Paint(1);
                this.paint = paint2;
                paint2.setColor(1426063360);
            }

            @Override
            public final void onDraw(Canvas canvas) {
                GroupCallUserCell groupCallUserCell = GroupCallUserCell.this;
                if (groupCallUserCell.avatarImageView.getImageReceiver().hasNotThumb() && groupCallUserCell.avatarImageView.getAlpha() > 0.0f) {
                    Paint paint2 = this.paint;
                    paint2.setAlpha((int) (groupCallUserCell.avatarImageView.getAlpha() * groupCallUserCell.avatarImageView.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                groupCallUserCell.avatarProgressView.setProgressColor(ColorUtils.setAlphaComponent(-1, (int) (groupCallUserCell.avatarImageView.getAlpha() * groupCallUserCell.avatarImageView.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
            }
        };
        this.avatarProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(26.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(false);
        RadialProgressView radialProgressView2 = this.avatarProgressView;
        boolean z2 = LocaleController.isRTL;
        addView(radialProgressView2, LayoutHelper.createFrame(46, 46.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 11.0f, 6.0f, z2 ? 11.0f : 0.0f, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.avatarProgressView, false, 1.0f, false);
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.nameTextView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_nameText, false));
        this.nameTextView.setTypeface(AndroidUtilities.bold());
        this.nameTextView.setTextSize(16);
        this.nameTextView.setDrawablePadding(AndroidUtilities.dp(6.0f));
        this.nameTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        SimpleTextView simpleTextView2 = this.nameTextView;
        boolean z3 = LocaleController.isRTL;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 54.0f : 67.0f, 10.0f, z3 ? 67.0f : 54.0f, 0.0f));
        this.leftDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.nameTextView, AndroidUtilities.dp(20.0f), 9);
        this.rightDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.nameTextView, AndroidUtilities.dp(20.0f), 9);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.speakingDrawable = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_voipgroup_speakingText, false), PorterDuff.Mode.MULTIPLY));
        final int i6 = 0;
        while (true) {
            SimpleTextView[] simpleTextViewArr = this.statusTextView;
            if (i6 >= simpleTextViewArr.length) {
                break;
            }
            simpleTextViewArr[i6] = new SimpleTextView(context) {
                public float originalAlpha;

                @Override
                public final float getAlpha() {
                    return this.originalAlpha;
                }

                @Override
                public final void setAlpha(float f) {
                    this.originalAlpha = f;
                    GroupCallUserCell groupCallUserCell = GroupCallUserCell.this;
                    if (i6 != 4) {
                        super.setAlpha((1.0f - groupCallUserCell.statusTextView[4].getFullAlpha()) * f);
                        return;
                    }
                    float fullAlpha = groupCallUserCell.statusTextView[4].getFullAlpha();
                    if (groupCallUserCell.isSelfUser() && groupCallUserCell.progressToAvatarPreview > 0.0f) {
                        super.setAlpha(1.0f - groupCallUserCell.progressToAvatarPreview);
                    } else if (fullAlpha > 0.0f) {
                        super.setAlpha(Math.max(f, fullAlpha));
                    } else {
                        super.setAlpha(f);
                    }
                }

                @Override
                public final void setFullAlpha(float f) {
                    super.setFullAlpha(f);
                    int i7 = 0;
                    while (true) {
                        GroupCallUserCell groupCallUserCell = GroupCallUserCell.this;
                        if (i7 >= groupCallUserCell.statusTextView.length) {
                            return;
                        }
                        groupCallUserCell.statusTextView[i7].setAlpha(groupCallUserCell.statusTextView[i7].getAlpha());
                        i7++;
                    }
                }

                @Override
                public final void setTranslationY(float f) {
                    if (i6 == 4 && getFullAlpha() > 0.0f) {
                        f = 0.0f;
                    }
                    super.setTranslationY(f);
                }
            };
            this.statusTextView[i6].setTextSize(15);
            this.statusTextView[i6].setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            if (i6 == 4) {
                this.statusTextView[i6].setBuildFullLayout(true);
                this.statusTextView[i6].setTextColor(Theme.getColor(null, Theme.key_voipgroup_mutedIcon, false));
                SimpleTextView simpleTextView3 = this.statusTextView[i6];
                boolean z4 = LocaleController.isRTL;
                addView(simpleTextView3, LayoutHelper.createFrame(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 54.0f : 67.0f, 32.0f, z4 ? 67.0f : 54.0f, 0.0f));
            } else {
                if (i6 == 0) {
                    this.statusTextView[i6].setTextColor(Theme.getColor(null, Theme.key_voipgroup_listeningText, false));
                    this.statusTextView[i6].setText(LocaleController.getString(R.string.Listening));
                } else if (i6 == 1) {
                    this.statusTextView[i6].setTextColor(Theme.getColor(null, Theme.key_voipgroup_speakingText, false));
                    this.statusTextView[i6].setText(LocaleController.getString(R.string.Speaking));
                    this.statusTextView[i6].setDrawablePadding(AndroidUtilities.dp(2.0f));
                } else if (i6 == 2) {
                    this.statusTextView[i6].setTextColor(Theme.getColor(null, Theme.key_voipgroup_mutedByAdminIcon, false));
                    this.statusTextView[i6].setText(LocaleController.getString(R.string.VoipGroupMutedForMe));
                } else if (i6 == 3) {
                    this.statusTextView[i6].setTextColor(Theme.getColor(null, Theme.key_voipgroup_listeningText, false));
                    this.statusTextView[i6].setText(LocaleController.getString(R.string.WantsToSpeak));
                }
                SimpleTextView simpleTextView4 = this.statusTextView[i6];
                boolean z5 = LocaleController.isRTL;
                addView(simpleTextView4, LayoutHelper.createFrame(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 54.0f : 67.0f, 32.0f, z5 ? 67.0f : 54.0f, 0.0f));
            }
            i6++;
        }
        SimpleTextView simpleTextView5 = new SimpleTextView(context);
        this.fullAboutTextView = simpleTextView5;
        simpleTextView5.setMaxLines(3);
        this.fullAboutTextView.setTextSize(15);
        this.fullAboutTextView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_mutedIcon, false));
        this.fullAboutTextView.setVisibility(8);
        addView(this.fullAboutTextView, LayoutHelper.createFrame(-1, 60.0f, (LocaleController.isRTL ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        int i7 = R.raw.voice_outlined2;
        this.muteDrawable = new RLottieDrawable(i7, Fragment$$ExternalSyntheticOutline0.m(i7, ""), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        int i8 = R.raw.hand_1;
        this.shakeHandDrawable = new RLottieDrawable(i8, Fragment$$ExternalSyntheticOutline0.m(i8, ""), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.muteButton = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.muteButton.setAnimation(this.muteDrawable);
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable = Theme.createSelectorDrawable(Theme.getColor(null, this.grayIconColor, false) & 620756991, 1, -1);
        Theme.setRippleDrawableForceSoftware(rippleDrawableSafeCreateSelectorDrawable);
        this.muteButton.setBackground(rippleDrawableSafeCreateSelectorDrawable);
        this.muteButton.setImportantForAccessibility(2);
        addView(this.muteButton, LayoutHelper.createFrame(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        this.muteButton.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 12));
        this.avatarWavesDrawable = new AvatarWavesDrawable(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public void applyParticipantChanges(boolean z) {
        applyParticipantChanges(z, false);
    }

    public final void applyStatus(int i) {
        float fDp;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            SimpleTextView[] simpleTextViewArr = this.statusTextView;
            if (i3 >= simpleTextViewArr.length) {
                break;
            }
            simpleTextViewArr[i3].setImportantForAccessibility(i3 == i ? 1 : 2);
            i3++;
        }
        if (i == 0) {
            while (true) {
                SimpleTextView[] simpleTextViewArr2 = this.statusTextView;
                if (i2 >= simpleTextViewArr2.length) {
                    return;
                }
                simpleTextViewArr2[i2].setTranslationY(i2 == i ? 0.0f : AndroidUtilities.dp(-2.0f));
                this.statusTextView[i2].setAlpha(i2 == i ? 1.0f : 0.0f);
                i2++;
            }
        } else {
            while (true) {
                SimpleTextView[] simpleTextViewArr3 = this.statusTextView;
                if (i2 >= simpleTextViewArr3.length) {
                    return;
                }
                SimpleTextView simpleTextView = simpleTextViewArr3[i2];
                if (i2 == i) {
                    fDp = 0.0f;
                } else {
                    fDp = AndroidUtilities.dp(i2 == 0 ? 2.0f : -2.0f);
                }
                simpleTextView.setTranslationY(fDp);
                this.statusTextView[i2].setAlpha(i2 == i ? 1.0f : 0.0f);
                i2++;
            }
        }
    }

    public boolean clickMuteButton() {
        if (!this.muteButton.isEnabled()) {
            return false;
        }
        this.muteButton.callOnClick();
        return true;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.needDivider) {
            int alpha = this.dividerPaint.getAlpha();
            float f = this.progressToAvatarPreview;
            if (f != 0.0f) {
                this.dividerPaint.setAlpha((int) ((1.0f - f) * alpha));
            } else {
                this.dividerPaint.setAlpha((int) ((1.0f - this.statusTextView[4].getFullAlpha()) * alpha));
            }
            canvas2 = canvas;
            canvas2.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, this.dividerPaint);
            this.dividerPaint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        int measuredWidth = (this.avatarImageView.getMeasuredWidth() / 2) + this.avatarImageView.getLeft();
        int measuredHeight = (this.avatarImageView.getMeasuredHeight() / 2) + this.avatarImageView.getTop();
        this.avatarWavesDrawable.update();
        if (this.progressToAvatarPreview == 0.0f) {
            this.avatarWavesDrawable.draw(canvas2, this, measuredWidth, measuredHeight);
        }
        this.avatarImageView.setScaleX(this.avatarWavesDrawable.getAvatarScale());
        this.avatarImageView.setScaleY(this.avatarWavesDrawable.getAvatarScale());
        this.avatarProgressView.setScaleX(this.avatarWavesDrawable.getAvatarScale());
        this.avatarProgressView.setScaleY(this.avatarWavesDrawable.getAvatarScale());
        super.dispatchDraw(canvas2);
    }

    public BackupImageView getAvatarImageView() {
        return this.avatarImageView;
    }

    public void getAvatarPosition(int[] iArr) {
        this.avatarImageView.getLocationInWindow(iArr);
    }

    public AvatarWavesDrawable getAvatarWavesDrawable() {
        return this.avatarWavesDrawable;
    }

    public int getClipHeight() {
        SimpleTextView simpleTextView = (TextUtils.isEmpty(this.fullAboutTextView.getText()) || !this.hasAvatar) ? this.statusTextView[4] : this.fullAboutTextView;
        if (simpleTextView.getLineCount() > 1) {
            return AndroidUtilities.dp(8.0f) + simpleTextView.getTop() + simpleTextView.getTextHeight();
        }
        return getMeasuredHeight();
    }

    public CharSequence getName() {
        return this.nameTextView.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.participant;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.participant;
        if (groupCallParticipant == null) {
            return 0L;
        }
        return MessageObject.getPeerId(groupCallParticipant.peer);
    }

    public boolean hasAvatarSet() {
        return this.avatarImageView.getImageReceiver().hasNotThumb();
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean isHandRaised() {
        return this.lastRaisedHand;
    }

    public boolean isSelfUser() {
        long j = this.selfId;
        if (j > 0) {
            TLRPC.User user = this.currentUser;
            return user != null && user.id == j;
        }
        TLRPC.Chat chat = this.currentChat;
        return chat != null && chat.id == (-j);
    }

    public final void lambda$applyParticipantChanges$6(int i, int i2, ValueAnimator valueAnimator) {
        int offsetColor = AndroidUtilities.getOffsetColor(i, i2, valueAnimator.getAnimatedFraction(), 1.0f);
        this.muteButton.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
        Theme.setSelectorDrawableColor(this.muteButton.getDrawable(), offsetColor & 620756991, true);
    }

    public final void lambda$new$0() {
        this.shakeHandDrawable.setOnFinishCallback(null, 0);
        this.muteDrawable.setOnFinishCallback(null, 0);
        this.muteButton.setAnimation(this.muteDrawable);
    }

    public final void lambda$new$1() {
        int i;
        int iNextInt = Utilities.random.nextInt(100);
        int i2 = 120;
        if (iNextInt < 32) {
            i = 0;
        } else {
            i = 240;
            if (iNextInt < 64) {
                i2 = 240;
                i = 120;
            } else {
                i2 = 420;
                if (iNextInt >= 97) {
                    i = 540;
                    if (iNextInt == 98) {
                        i2 = 540;
                        i = 420;
                    } else {
                        i2 = 720;
                    }
                }
            }
        }
        this.shakeHandDrawable.setCustomEndFrame(i2);
        this.shakeHandDrawable.setOnFinishCallback(this.shakeHandCallback, i2 - 1);
        this.muteButton.setAnimation(this.shakeHandDrawable);
        this.shakeHandDrawable.setCurrentFrame(i);
        this.muteButton.playAnimation();
    }

    public final void lambda$new$2() {
        applyParticipantChanges(true, true);
    }

    public final void lambda$new$3() {
        this.isSpeaking = false;
        applyParticipantChanges(true, true);
        this.avatarWavesDrawable.setAmplitude(0.0d);
        this.updateRunnableScheduled = false;
    }

    public final void lambda$new$4() {
        applyParticipantChanges(true, true);
        this.updateVoiceRunnableScheduled = false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        applyParticipantChanges(false);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.rightDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.attach();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.leftDrawable;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.attach();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.updateRunnableScheduled) {
            AndroidUtilities.cancelRunOnUIThread(this.updateRunnable);
            this.updateRunnableScheduled = false;
        }
        if (this.updateVoiceRunnableScheduled) {
            AndroidUtilities.cancelRunOnUIThread(this.updateVoiceRunnable);
            this.updateVoiceRunnableScheduled = false;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.rightDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.detach();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.leftDrawable;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.detach();
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.participant;
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString((!groupCallParticipant.muted || groupCallParticipant.can_self_unmute) ? R.string.VoipMute : R.string.VoipUnmute)));
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }

    public void lambda$new$5(GroupCallUserCell groupCallUserCell) {
    }

    public void setAboutVisible(boolean z) {
        if (z) {
            this.statusTextView[4].setTranslationY(0.0f);
        } else {
            this.statusTextView[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAboutVisibleProgress(int i, float f) {
        if (TextUtils.isEmpty(this.statusTextView[4].getText())) {
            f = 0.0f;
        }
        this.statusTextView[4].setFullAlpha(f);
        this.statusTextView[4].setFullLayoutAdditionalWidth(0, 0);
        invalidate();
    }

    public void setAmplitude(double d) {
        if (d <= 1.5d) {
            this.avatarWavesDrawable.setAmplitude(0.0d);
            return;
        }
        if (this.updateRunnableScheduled) {
            AndroidUtilities.cancelRunOnUIThread(this.updateRunnable);
        }
        if (!this.isSpeaking) {
            this.isSpeaking = true;
            applyParticipantChanges(true);
        }
        this.avatarWavesDrawable.setAmplitude(d);
        AndroidUtilities.runOnUIThread(this.updateRunnable, 500L);
        this.updateRunnableScheduled = true;
    }

    public void setData(AccountInstance accountInstance, TLRPC.GroupCallParticipant groupCallParticipant, ChatObject.Call call, long j, TLRPC.FileLocation fileLocation, boolean z) {
        long botVerificationIcon;
        this.currentCall = call;
        this.accountInstance = accountInstance;
        this.selfId = j;
        this.participant = groupCallParticipant;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        if (peerId > 0) {
            this.currentUser = this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
            this.currentChat = null;
            this.avatarDrawable.setInfo(this.accountInstance.getCurrentAccount(), this.currentUser);
            this.nameTextView.setText(UserObject.getUserName(this.currentUser));
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.currentUser);
            TLRPC.User user = this.currentUser;
            if (user != null && user.verified) {
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.rightDrawable;
                Drawable verifiedDrawable = this.verifiedDrawable;
                if (verifiedDrawable == null) {
                    verifiedDrawable = new VerifiedDrawable(getContext());
                }
                this.verifiedDrawable = verifiedDrawable;
                swapAnimatedEmojiDrawable.set(verifiedDrawable, z);
            } else if (user == null || DialogObject.getEmojiStatusDocumentId(user.emoji_status) == 0) {
                TLRPC.User user2 = this.currentUser;
                if (user2 == null || !user2.premium) {
                    this.rightDrawable.set((Drawable) null, z);
                } else {
                    if (this.premiumDrawable == null) {
                        this.premiumDrawable = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.premiumDrawable = new AnonymousClass3(this.premiumDrawable, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                    }
                    this.rightDrawable.set(this.premiumDrawable, z);
                }
            } else {
                this.rightDrawable.set(DialogObject.getEmojiStatusDocumentId(this.currentUser.emoji_status), z);
            }
            this.rightDrawable.setColor(Integer.valueOf(Theme.getColor(null, Theme.key_premiumGradient1, false)));
            this.nameTextView.setRightDrawable(this.rightDrawable);
            this.avatarImageView.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
            if (fileLocation != null) {
                this.hasAvatar = true;
                this.avatarImageView.setImage(ImageLocation.getForLocal(fileLocation), "50_50", this.avatarDrawable, (Object) null);
            } else {
                ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), this.currentUser, 1);
                this.hasAvatar = forUser != null;
                this.avatarImageView.setImage(forUser, "50_50", this.avatarDrawable, this.currentUser);
            }
        } else {
            this.currentChat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            this.currentUser = null;
            this.avatarDrawable.setInfo(this.accountInstance.getCurrentAccount(), this.currentChat);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.currentChat);
            TLRPC.Chat chat = this.currentChat;
            if (chat != null) {
                this.nameTextView.setText(chat.title);
                TLRPC.Chat chat2 = this.currentChat;
                if (chat2.verified) {
                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.rightDrawable;
                    Drawable verifiedDrawable2 = this.verifiedDrawable;
                    if (verifiedDrawable2 == null) {
                        verifiedDrawable2 = new VerifiedDrawable(getContext());
                    }
                    this.verifiedDrawable = verifiedDrawable2;
                    swapAnimatedEmojiDrawable2.set(verifiedDrawable2, z);
                } else if (DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                    this.rightDrawable.set(DialogObject.getEmojiStatusDocumentId(this.currentChat.emoji_status), z);
                } else {
                    this.rightDrawable.set((Drawable) null, z);
                }
                this.avatarImageView.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
                if (fileLocation != null) {
                    this.hasAvatar = true;
                    this.avatarImageView.setImage(ImageLocation.getForLocal(fileLocation), "50_50", this.avatarDrawable, (Object) null);
                } else {
                    ImageLocation forChat = ImageLocation.getForChat(this.currentChat, 1);
                    this.hasAvatar = forChat != null;
                    this.avatarImageView.setImage(forChat, "50_50", this.avatarDrawable, this.currentChat);
                }
            }
        }
        if (botVerificationIcon != 0) {
            this.leftDrawable.set(botVerificationIcon, z);
            this.nameTextView.setLeftDrawable(this.leftDrawable);
            this.leftDrawable.setColor(Integer.valueOf(Theme.getColor(null, Theme.key_premiumGradient1, false)));
        } else {
            this.leftDrawable.set((Drawable) null, z);
            this.nameTextView.setLeftDrawable((Drawable) null);
        }
        applyParticipantChanges(z);
    }

    public void setDrawAvatar(boolean z) {
        if (this.avatarImageView.getImageReceiver().getVisible() != z) {
            this.avatarImageView.getImageReceiver().setVisible(z, true);
        }
    }

    public void setDrawDivider(boolean z) {
        this.needDivider = z;
        invalidate();
    }

    public void setGrayIconColor(int i, int i2) {
        if (this.grayIconColor != i) {
            if (this.currentIconGray) {
                this.lastMuteColor = Theme.getColor(null, i, false);
            }
            this.grayIconColor = i;
        }
        if (this.currentIconGray) {
            this.muteButton.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            Theme.setSelectorDrawableColor(this.muteButton.getDrawable(), i2 & 620756991, true);
        }
    }

    public void setProgressToAvatarPreview(float f) {
        this.progressToAvatarPreview = f;
        this.nameTextView.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f);
        if (!isSelfUser() || f <= 0.0f) {
            this.fullAboutTextView.setVisibility(8);
            int i = 0;
            while (true) {
                SimpleTextView[] simpleTextViewArr = this.statusTextView;
                if (i >= simpleTextViewArr.length) {
                    break;
                }
                if (TextUtils.isEmpty(simpleTextViewArr[4].getText()) || this.statusTextView[4].getLineCount() <= 1) {
                    this.statusTextView[i].setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f);
                    this.statusTextView[i].setFullLayoutAdditionalWidth(0, 0);
                } else {
                    this.statusTextView[i].setFullLayoutAdditionalWidth(AndroidUtilities.dp(92.0f), LocaleController.isRTL ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(53.0f));
                    this.statusTextView[i].setFullAlpha(f);
                    this.statusTextView[i].setTranslationX(0.0f);
                    this.statusTextView[i].invalidate();
                }
                i++;
            }
        } else {
            float f2 = 1.0f - f;
            this.fullAboutTextView.setTranslationX((LocaleController.isRTL ? -AndroidUtilities.dp(53.0f) : AndroidUtilities.dp(53.0f)) * f2);
            this.fullAboutTextView.setVisibility(0);
            this.fullAboutTextView.setAlpha(f);
            this.statusTextView[4].setAlpha(f2);
            SimpleTextView simpleTextView = this.statusTextView[4];
            boolean z = LocaleController.isRTL;
            int iDp = AndroidUtilities.dp(53.0f);
            if (!z) {
                iDp = -iDp;
            }
            simpleTextView.setTranslationX(iDp * f);
        }
        this.avatarImageView.setAlpha(f == 0.0f ? 1.0f : 0.0f);
        this.avatarWavesDrawable.setShowWaves(this, this.isSpeaking && f == 0.0f);
        float f3 = 1.0f - f;
        this.muteButton.setAlpha(f3);
        float f4 = (f3 * 0.4f) + 0.6f;
        this.muteButton.setScaleX(f4);
        this.muteButton.setScaleY(f4);
        invalidate();
    }

    public void setUploadProgress(float f, boolean z) {
        this.avatarProgressView.setProgress(f);
        if (f < 1.0f) {
            AndroidUtilities.updateViewVisibilityAnimated(this.avatarProgressView, true, 1.0f, z);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.avatarProgressView, false, 1.0f, z);
        }
    }

    public final void applyParticipantChanges(boolean z, boolean z2) {
        int color;
        int i;
        boolean z3;
        float f;
        ArrayList arrayList;
        Property property;
        Property property2;
        int i2;
        SimpleTextView[] simpleTextViewArr;
        float f2;
        float fDp;
        float f3;
        int i3;
        SimpleTextView[] simpleTextViewArr2;
        float fDp2;
        float f4;
        AvatarWavesDrawable avatarWavesDrawable;
        int i4;
        boolean customEndFrame;
        AnimatorSet animatorSet;
        float f5;
        int participantVolume;
        int i5;
        int color2;
        boolean z4 = false;
        int i6 = 1;
        if (this.currentCall == null) {
            return;
        }
        this.muteButton.setEnabled((isSelfUser() && this.participant.raise_hand_rating == 0) ? false : true);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant = this.participant;
        boolean z5 = jElapsedRealtime - groupCallParticipant.lastVoiceUpdateTime < 500 ? groupCallParticipant.hasVoiceDelayed : groupCallParticipant.hasVoice;
        if (!z2) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.participant.lastSpeakTime;
            boolean z6 = jUptimeMillis < 500;
            if (!this.isSpeaking || !z6 || z5) {
                this.isSpeaking = z6;
                if (this.updateRunnableScheduled) {
                    AndroidUtilities.cancelRunOnUIThread(this.updateRunnable);
                    this.updateRunnableScheduled = false;
                }
                if (this.isSpeaking) {
                    AndroidUtilities.runOnUIThread(this.updateRunnable, 500 - jUptimeMillis);
                    this.updateRunnableScheduled = true;
                }
            }
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.currentCall.participants.get(MessageObject.getPeerId(this.participant.peer));
        if (groupCallParticipant2 != null) {
            this.participant = groupCallParticipant2;
        }
        boolean z7 = this.participant.muted_by_you && !isSelfUser();
        boolean z8 = !isSelfUser() ? (!this.participant.muted || (this.isSpeaking && z5)) && !z7 : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.isSpeaking && z5);
        if (z8) {
            boolean z9 = this.participant.can_self_unmute;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.participant.about);
        this.currentIconGray = false;
        AndroidUtilities.cancelRunOnUIThread(this.checkRaiseRunnable);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.participant;
        if ((!groupCallParticipant3.muted || this.isSpeaking) && !z7) {
            if (this.isSpeaking && z5) {
                color = Theme.getColor(null, Theme.key_voipgroup_speakingText, false);
                i = 1;
            } else {
                color = Theme.getColor(null, this.grayIconColor, false);
                i = !zIsEmpty ? 4 : 0;
                this.currentIconGray = true;
            }
            z3 = false;
        } else {
            boolean z10 = groupCallParticipant3.can_self_unmute;
            if (!z10 || z7) {
                boolean z11 = (z10 || groupCallParticipant3.raise_hand_rating == 0) ? false : true;
                if (z11) {
                    color = Theme.getColor(null, Theme.key_voipgroup_listeningText, false);
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j = this.participant.lastRaiseHandDate;
                    long j2 = jElapsedRealtime2 - j;
                    if (j != 0 && j2 <= 5000) {
                        AndroidUtilities.runOnUIThread(this.checkRaiseRunnable, 5000 - j2);
                        z3 = z11;
                        i = 3;
                    } else if (z7) {
                        z3 = z11;
                        i = 2;
                    } else {
                        z3 = z11;
                        color2 = color;
                        if (zIsEmpty) {
                            color = color2;
                            i = 0;
                        } else {
                            color = color2;
                            i = 4;
                        }
                    }
                } else {
                    int color3 = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminIcon, false);
                    if (z7) {
                        color = color3;
                        z3 = z11;
                        i = 2;
                    } else {
                        z3 = z11;
                        color2 = color3;
                        if (zIsEmpty) {
                            color = color2;
                            i = 0;
                        } else {
                            color = color2;
                            i = 4;
                        }
                    }
                }
            } else {
                color2 = Theme.getColor(null, this.grayIconColor, false);
                this.currentIconGray = true;
                z3 = false;
                if (zIsEmpty) {
                    color = color2;
                    i = 0;
                } else {
                    color = color2;
                    i = 4;
                }
            }
        }
        if (!isSelfUser()) {
            this.statusTextView[4].setTextColor(Theme.getColor(null, this.grayIconColor, false));
        }
        if (isSelfUser()) {
            if (zIsEmpty && !this.hasAvatar) {
                if (this.currentUser != null) {
                    this.statusTextView[4].setText(LocaleController.getString(R.string.TapToAddPhotoOrBio));
                } else {
                    this.statusTextView[4].setText(LocaleController.getString(R.string.TapToAddPhotoOrDescription));
                }
                this.statusTextView[4].setTextColor(Theme.getColor(null, this.grayIconColor, false));
            } else if (zIsEmpty) {
                if (this.currentUser != null) {
                    this.statusTextView[4].setText(LocaleController.getString(R.string.TapToAddBio));
                } else {
                    this.statusTextView[4].setText(LocaleController.getString(R.string.TapToAddDescription));
                }
                this.statusTextView[4].setTextColor(Theme.getColor(null, this.grayIconColor, false));
            } else if (this.hasAvatar) {
                this.statusTextView[4].setText(LocaleController.getString(R.string.ThisIsYou));
                this.statusTextView[4].setTextColor(Theme.getColor(null, Theme.key_voipgroup_listeningText, false));
            } else {
                this.statusTextView[4].setText(LocaleController.getString(R.string.TapToAddPhoto));
                this.statusTextView[4].setTextColor(Theme.getColor(null, this.grayIconColor, false));
            }
            if (zIsEmpty) {
                this.fullAboutTextView.setText(this.statusTextView[i].getText());
                this.fullAboutTextView.setTextColor(this.statusTextView[i].getTextColor());
            } else {
                this.fullAboutTextView.setText(AndroidUtilities.replaceNewLines(this.participant.about));
                this.fullAboutTextView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_mutedIcon, false));
            }
        } else if (zIsEmpty) {
            this.statusTextView[4].setText("");
            this.fullAboutTextView.setText("");
        } else {
            this.statusTextView[4].setText(AndroidUtilities.replaceNewLines(this.participant.about));
            this.fullAboutTextView.setText("");
        }
        AnimatorSet animatorSet2 = this.animatorSet;
        boolean z12 = (animatorSet2 == null || (i == this.currentStatus && this.lastMuteColor == color)) ? false : true;
        if ((!z || z12) && animatorSet2 != null) {
            animatorSet2.cancel();
            this.animatorSet = null;
        }
        if (!z || this.lastMuteColor != color || z12) {
            if (z) {
                arrayList = new ArrayList();
                int i7 = this.lastMuteColor;
                this.lastMuteColor = color;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                f = 0.0f;
                valueAnimatorOfFloat.addUpdateListener(new GroupCallUserCell$$ExternalSyntheticLambda0(this, i7, color, 0));
                arrayList.add(valueAnimatorOfFloat);
            } else {
                f = 0.0f;
                RLottieImageView rLottieImageView = this.muteButton;
                this.lastMuteColor = color;
                rLottieImageView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                Theme.setSelectorDrawableColor(this.muteButton.getDrawable(), 620756991 & color, true);
            }
            if (i == 1) {
                participantVolume = ChatObject.getParticipantVolume(this.participant);
                i5 = participantVolume / 100;
                if (i5 != 100) {
                    this.statusTextView[1].setLeftDrawable(this.speakingDrawable);
                    SimpleTextView simpleTextView = this.statusTextView[1];
                    int i8 = R.string.SpeakingWithVolume;
                    if (participantVolume < 100) {
                        i5 = 1;
                    }
                    simpleTextView.setText(LocaleController.formatString("SpeakingWithVolume", i8, Integer.valueOf(i5)));
                } else {
                    this.statusTextView[1].setLeftDrawable((Drawable) null);
                    this.statusTextView[1].setText(LocaleController.getString(R.string.Speaking));
                }
            }
            if (isSelfUser()) {
                applyStatus(4);
            } else if (z || i != this.currentStatus || z12) {
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    property = View.ALPHA;
                    property2 = View.TRANSLATION_Y;
                    if (i != 0) {
                        i2 = 0;
                        while (true) {
                            simpleTextViewArr = this.statusTextView;
                            if (i2 >= simpleTextViewArr.length) {
                                break;
                            }
                            SimpleTextView simpleTextView2 = simpleTextViewArr[i2];
                            if (i2 == i) {
                                fDp = 0.0f;
                            } else {
                                if (i2 == 0) {
                                    f2 = 2.0f;
                                } else {
                                    f2 = -2.0f;
                                }
                                fDp = AndroidUtilities.dp(f2);
                            }
                            arrayList.add(ObjectAnimator.ofFloat(simpleTextView2, (Property<SimpleTextView, Float>) property2, fDp));
                            SimpleTextView simpleTextView3 = this.statusTextView[i2];
                            if (i2 == i) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            arrayList.add(ObjectAnimator.ofFloat(simpleTextView3, (Property<SimpleTextView, Float>) property, f3));
                            i2++;
                        }
                    } else {
                        i3 = 0;
                        while (true) {
                            simpleTextViewArr2 = this.statusTextView;
                            if (i3 >= simpleTextViewArr2.length) {
                                break;
                            }
                            SimpleTextView simpleTextView4 = simpleTextViewArr2[i3];
                            if (i3 == i) {
                                fDp2 = 0.0f;
                            } else {
                                fDp2 = AndroidUtilities.dp(-2.0f);
                            }
                            arrayList.add(ObjectAnimator.ofFloat(simpleTextView4, (Property<SimpleTextView, Float>) property2, fDp2));
                            SimpleTextView simpleTextView5 = this.statusTextView[i3];
                            if (i3 == i) {
                                f4 = 1.0f;
                            } else {
                                f4 = 0.0f;
                            }
                            arrayList.add(ObjectAnimator.ofFloat(simpleTextView5, (Property<SimpleTextView, Float>) property, f4));
                            i3++;
                        }
                    }
                } else {
                    applyStatus(i);
                }
                this.currentStatus = i;
            }
            avatarWavesDrawable = this.avatarWavesDrawable;
            avatarWavesDrawable.isMuted = i;
            if (!z) {
                if (i != 1) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                avatarWavesDrawable.progressToMuted = f5;
            }
            if (arrayList != null) {
                animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.animatorSet = null;
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.animatorSet = animatorSet3;
                animatorSet3.addListener(new RichMediaCell.AnonymousClass3(this, i, i6));
                this.animatorSet.playTogether(arrayList);
                this.animatorSet.setDuration(180L);
                this.animatorSet.start();
            }
            if (z || this.lastMuted != z8 || this.lastRaisedHand != z3) {
                if (z3) {
                    customEndFrame = this.muteDrawable.setCustomEndFrame(84);
                    if (z) {
                        this.muteDrawable.setOnFinishCallback(this.raiseHandCallback, 83);
                    } else {
                        this.muteDrawable.setOnFinishCallback(null, 0);
                    }
                } else {
                    this.muteButton.setAnimation(this.muteDrawable);
                    this.muteDrawable.setOnFinishCallback(null, 0);
                    if (z8 || !this.lastRaisedHand) {
                        RLottieDrawable rLottieDrawable = this.muteDrawable;
                        if (z8) {
                            i4 = 64;
                        } else {
                            i4 = 42;
                        }
                        customEndFrame = rLottieDrawable.setCustomEndFrame(i4);
                    } else {
                        customEndFrame = this.muteDrawable.setCustomEndFrame(21);
                    }
                }
                if (z) {
                    if (customEndFrame) {
                        if (i == 3) {
                            this.muteDrawable.setCurrentFrame(63);
                        } else if (!z8 && this.lastRaisedHand && !z3) {
                            this.muteDrawable.setCurrentFrame(0);
                        } else if (z8) {
                            this.muteDrawable.setCurrentFrame(43);
                        } else {
                            this.muteDrawable.setCurrentFrame(21);
                        }
                    }
                    this.muteButton.playAnimation();
                } else {
                    RLottieDrawable rLottieDrawable2 = this.muteDrawable;
                    rLottieDrawable2.setCurrentFrame(rLottieDrawable2.getCustomEndFrame() - 1, false, true);
                    this.muteButton.invalidate();
                }
                this.lastMuted = z8;
                this.lastRaisedHand = z3;
            }
            if (!this.isSpeaking) {
                this.avatarWavesDrawable.setAmplitude(0.0d);
            }
            AvatarWavesDrawable avatarWavesDrawable2 = this.avatarWavesDrawable;
            if (this.isSpeaking && this.progressToAvatarPreview == f) {
                z4 = true;
            }
            avatarWavesDrawable2.setShowWaves(this, z4);
        }
        f = 0.0f;
        arrayList = null;
        if (i == 1) {
            participantVolume = ChatObject.getParticipantVolume(this.participant);
            i5 = participantVolume / 100;
            if (i5 != 100) {
                this.statusTextView[1].setLeftDrawable(this.speakingDrawable);
                SimpleTextView simpleTextView6 = this.statusTextView[1];
                int i9 = R.string.SpeakingWithVolume;
                if (participantVolume < 100) {
                    i5 = 1;
                }
                simpleTextView6.setText(LocaleController.formatString("SpeakingWithVolume", i9, Integer.valueOf(i5)));
            } else {
                this.statusTextView[1].setLeftDrawable((Drawable) null);
                this.statusTextView[1].setText(LocaleController.getString(R.string.Speaking));
            }
        }
        if (isSelfUser()) {
            applyStatus(4);
        } else if (z) {
            if (z) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                property = View.ALPHA;
                property2 = View.TRANSLATION_Y;
                if (i != 0) {
                    i2 = 0;
                    while (true) {
                        simpleTextViewArr = this.statusTextView;
                        if (i2 >= simpleTextViewArr.length) {
                            break;
                            break;
                        }
                        SimpleTextView simpleTextView7 = simpleTextViewArr[i2];
                        if (i2 == i) {
                            fDp = 0.0f;
                        } else {
                            if (i2 == 0) {
                                f2 = 2.0f;
                            } else {
                                f2 = -2.0f;
                            }
                            fDp = AndroidUtilities.dp(f2);
                        }
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView7, (Property<SimpleTextView, Float>) property2, fDp));
                        SimpleTextView simpleTextView8 = this.statusTextView[i2];
                        if (i2 == i) {
                            f3 = 1.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView8, (Property<SimpleTextView, Float>) property, f3));
                        i2++;
                    }
                } else {
                    i3 = 0;
                    while (true) {
                        simpleTextViewArr2 = this.statusTextView;
                        if (i3 >= simpleTextViewArr2.length) {
                            break;
                            break;
                        }
                        SimpleTextView simpleTextView9 = simpleTextViewArr2[i3];
                        if (i3 == i) {
                            fDp2 = 0.0f;
                        } else {
                            fDp2 = AndroidUtilities.dp(-2.0f);
                        }
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView9, (Property<SimpleTextView, Float>) property2, fDp2));
                        SimpleTextView simpleTextView10 = this.statusTextView[i3];
                        if (i3 == i) {
                            f4 = 1.0f;
                        } else {
                            f4 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView10, (Property<SimpleTextView, Float>) property, f4));
                        i3++;
                    }
                }
            } else {
                applyStatus(i);
            }
            this.currentStatus = i;
        } else {
            if (z) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                property = View.ALPHA;
                property2 = View.TRANSLATION_Y;
                if (i != 0) {
                    i2 = 0;
                    while (true) {
                        simpleTextViewArr = this.statusTextView;
                        if (i2 >= simpleTextViewArr.length) {
                            break;
                            break;
                        }
                        SimpleTextView simpleTextView11 = simpleTextViewArr[i2];
                        if (i2 == i) {
                            fDp = 0.0f;
                        } else {
                            if (i2 == 0) {
                                f2 = 2.0f;
                            } else {
                                f2 = -2.0f;
                            }
                            fDp = AndroidUtilities.dp(f2);
                        }
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView11, (Property<SimpleTextView, Float>) property2, fDp));
                        SimpleTextView simpleTextView12 = this.statusTextView[i2];
                        if (i2 == i) {
                            f3 = 1.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView12, (Property<SimpleTextView, Float>) property, f3));
                        i2++;
                    }
                } else {
                    i3 = 0;
                    while (true) {
                        simpleTextViewArr2 = this.statusTextView;
                        if (i3 >= simpleTextViewArr2.length) {
                            break;
                            break;
                        }
                        SimpleTextView simpleTextView13 = simpleTextViewArr2[i3];
                        if (i3 == i) {
                            fDp2 = 0.0f;
                        } else {
                            fDp2 = AndroidUtilities.dp(-2.0f);
                        }
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView13, (Property<SimpleTextView, Float>) property2, fDp2));
                        SimpleTextView simpleTextView14 = this.statusTextView[i3];
                        if (i3 == i) {
                            f4 = 1.0f;
                        } else {
                            f4 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView14, (Property<SimpleTextView, Float>) property, f4));
                        i3++;
                    }
                }
            } else {
                applyStatus(i);
            }
            this.currentStatus = i;
        }
        avatarWavesDrawable = this.avatarWavesDrawable;
        avatarWavesDrawable.isMuted = i;
        if (!z) {
            if (i != 1) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            avatarWavesDrawable.progressToMuted = f5;
        }
        if (arrayList != null) {
            animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.animatorSet = null;
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            this.animatorSet = animatorSet4;
            animatorSet4.addListener(new RichMediaCell.AnonymousClass3(this, i, i6));
            this.animatorSet.playTogether(arrayList);
            this.animatorSet.setDuration(180L);
            this.animatorSet.start();
        }
        if (z) {
            if (z3) {
                customEndFrame = this.muteDrawable.setCustomEndFrame(84);
                if (z) {
                    this.muteDrawable.setOnFinishCallback(this.raiseHandCallback, 83);
                } else {
                    this.muteDrawable.setOnFinishCallback(null, 0);
                }
            } else {
                this.muteButton.setAnimation(this.muteDrawable);
                this.muteDrawable.setOnFinishCallback(null, 0);
                if (z8) {
                    RLottieDrawable rLottieDrawable3 = this.muteDrawable;
                    if (z8) {
                        i4 = 64;
                    } else {
                        i4 = 42;
                    }
                    customEndFrame = rLottieDrawable3.setCustomEndFrame(i4);
                } else {
                    RLottieDrawable rLottieDrawable4 = this.muteDrawable;
                    if (z8) {
                        i4 = 64;
                    } else {
                        i4 = 42;
                    }
                    customEndFrame = rLottieDrawable4.setCustomEndFrame(i4);
                }
            }
            if (z) {
                if (customEndFrame) {
                    if (i == 3) {
                        this.muteDrawable.setCurrentFrame(63);
                    } else if (!z8) {
                        if (z8) {
                            this.muteDrawable.setCurrentFrame(43);
                        } else {
                            this.muteDrawable.setCurrentFrame(21);
                        }
                    } else if (z8) {
                        this.muteDrawable.setCurrentFrame(43);
                    } else {
                        this.muteDrawable.setCurrentFrame(21);
                    }
                }
                this.muteButton.playAnimation();
            } else {
                RLottieDrawable rLottieDrawable5 = this.muteDrawable;
                rLottieDrawable5.setCurrentFrame(rLottieDrawable5.getCustomEndFrame() - 1, false, true);
                this.muteButton.invalidate();
            }
            this.lastMuted = z8;
            this.lastRaisedHand = z3;
        } else {
            if (z3) {
                customEndFrame = this.muteDrawable.setCustomEndFrame(84);
                if (z) {
                    this.muteDrawable.setOnFinishCallback(this.raiseHandCallback, 83);
                } else {
                    this.muteDrawable.setOnFinishCallback(null, 0);
                }
            } else {
                this.muteButton.setAnimation(this.muteDrawable);
                this.muteDrawable.setOnFinishCallback(null, 0);
                if (z8) {
                    RLottieDrawable rLottieDrawable6 = this.muteDrawable;
                    if (z8) {
                        i4 = 64;
                    } else {
                        i4 = 42;
                    }
                    customEndFrame = rLottieDrawable6.setCustomEndFrame(i4);
                } else {
                    RLottieDrawable rLottieDrawable7 = this.muteDrawable;
                    if (z8) {
                        i4 = 64;
                    } else {
                        i4 = 42;
                    }
                    customEndFrame = rLottieDrawable7.setCustomEndFrame(i4);
                }
            }
            if (z) {
                if (customEndFrame) {
                    if (i == 3) {
                        this.muteDrawable.setCurrentFrame(63);
                    } else if (!z8) {
                        if (z8) {
                            this.muteDrawable.setCurrentFrame(43);
                        } else {
                            this.muteDrawable.setCurrentFrame(21);
                        }
                    } else if (z8) {
                        this.muteDrawable.setCurrentFrame(43);
                    } else {
                        this.muteDrawable.setCurrentFrame(21);
                    }
                }
                this.muteButton.playAnimation();
            } else {
                RLottieDrawable rLottieDrawable8 = this.muteDrawable;
                rLottieDrawable8.setCurrentFrame(rLottieDrawable8.getCustomEndFrame() - 1, false, true);
                this.muteButton.invalidate();
            }
            this.lastMuted = z8;
            this.lastRaisedHand = z3;
        }
        if (!this.isSpeaking) {
            this.avatarWavesDrawable.setAmplitude(0.0d);
        }
        AvatarWavesDrawable avatarWavesDrawable3 = this.avatarWavesDrawable;
        if (this.isSpeaking) {
            z4 = true;
        }
        avatarWavesDrawable3.setShowWaves(this, z4);
    }
}
