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
import android.graphics.drawable.RippleDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
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
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda38;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlobDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.ProfileActivity;

public class GroupCallUserCell extends FrameLayout {
    public AccountInstance accountInstance;
    public AnimatorSet animatorSet;
    public final AvatarDrawable avatarDrawable;
    public final BackupImageView avatarImageView;
    public final ProfileActivity.AnonymousClass22 avatarProgressView;
    public final AvatarWavesDrawable avatarWavesDrawable;
    public final GroupCallUserCell$$ExternalSyntheticLambda1 checkRaiseRunnable;
    public ChatObject.Call currentCall;
    public TLRPC.Chat currentChat;
    public boolean currentIconGray;
    public int currentStatus;
    public TLRPC.User currentUser;
    public final Paint dividerPaint;
    public final SimpleTextView fullAboutTextView;
    public int grayIconColor;
    public boolean hasAvatar;
    public boolean isSpeaking;
    public int lastMuteColor;
    public boolean lastMuted;
    public boolean lastRaisedHand;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable leftDrawable;
    public final RLottieImageView muteButton;
    public final RLottieDrawable muteDrawable;
    public final SimpleTextView nameTextView;
    public boolean needDivider;
    public TLRPC.GroupCallParticipant participant;
    public Drawable premiumDrawable;
    public float progressToAvatarPreview;
    public final GroupCallUserCell$$ExternalSyntheticLambda1 raiseHandCallback;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable rightDrawable;
    public long selfId;
    public final GroupCallUserCell$$ExternalSyntheticLambda1 shakeHandCallback;
    public final RLottieDrawable shakeHandDrawable;
    public final Drawable speakingDrawable;
    public final SimpleTextView[] statusTextView;
    public final GroupCallUserCell$$ExternalSyntheticLambda1 updateRunnable;
    public boolean updateRunnableScheduled;
    public Drawable verifiedDrawable;

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
            BlobDrawable blobDrawable = new BlobDrawable(6, 512);
            this.blobDrawable = blobDrawable;
            BlobDrawable blobDrawable2 = new BlobDrawable(8, 512);
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

        public final void draw(Canvas canvas, float f, float f2, View view) {
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
                    Paint paint = blobDrawable.paint;
                    blobDrawable.draw(f, f2, canvas, paint);
                    BlobDrawable blobDrawable2 = this.blobDrawable2;
                    blobDrawable2.update(this.amplitude, 1.0f);
                    blobDrawable2.draw(f, f2, canvas, paint);
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
                int i2;
                switch (i) {
                    case 0:
                        GroupCallUserCell groupCallUserCell = this.f$0;
                        groupCallUserCell.shakeHandDrawable.setOnFinishCallback(0, null);
                        RLottieDrawable rLottieDrawable = groupCallUserCell.muteDrawable;
                        rLottieDrawable.setOnFinishCallback(0, null);
                        groupCallUserCell.muteButton.setAnimation(rLottieDrawable);
                        break;
                    case 1:
                        GroupCallUserCell groupCallUserCell2 = this.f$0;
                        groupCallUserCell2.getClass();
                        int iNextInt = Utilities.random.nextInt(100);
                        int i3 = 120;
                        if (iNextInt < 32) {
                            i2 = 0;
                        } else {
                            i2 = 240;
                            if (iNextInt < 64) {
                                i3 = 240;
                                i2 = 120;
                            } else {
                                i3 = 420;
                                if (iNextInt >= 97) {
                                    i2 = 540;
                                    if (iNextInt == 98) {
                                        i3 = 540;
                                        i2 = 420;
                                    } else {
                                        i3 = 720;
                                    }
                                }
                            }
                        }
                        RLottieDrawable rLottieDrawable2 = groupCallUserCell2.shakeHandDrawable;
                        rLottieDrawable2.setCustomEndFrame(i3);
                        rLottieDrawable2.setOnFinishCallback(i3 - 1, groupCallUserCell2.shakeHandCallback);
                        RLottieImageView rLottieImageView = groupCallUserCell2.muteButton;
                        rLottieImageView.setAnimation(rLottieDrawable2);
                        rLottieDrawable2.setCurrentFrame(i2, true, false);
                        rLottieImageView.playAnimation();
                        break;
                    case 2:
                        this.f$0.applyParticipantChanges(true, true);
                        break;
                    default:
                        GroupCallUserCell groupCallUserCell3 = this.f$0;
                        groupCallUserCell3.isSpeaking = false;
                        groupCallUserCell3.applyParticipantChanges(true, true);
                        groupCallUserCell3.avatarWavesDrawable.setAmplitude(0.0d);
                        groupCallUserCell3.updateRunnableScheduled = false;
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
                int i3;
                switch (i2) {
                    case 0:
                        GroupCallUserCell groupCallUserCell = this.f$0;
                        groupCallUserCell.shakeHandDrawable.setOnFinishCallback(0, null);
                        RLottieDrawable rLottieDrawable = groupCallUserCell.muteDrawable;
                        rLottieDrawable.setOnFinishCallback(0, null);
                        groupCallUserCell.muteButton.setAnimation(rLottieDrawable);
                        break;
                    case 1:
                        GroupCallUserCell groupCallUserCell2 = this.f$0;
                        groupCallUserCell2.getClass();
                        int iNextInt = Utilities.random.nextInt(100);
                        int i4 = 120;
                        if (iNextInt < 32) {
                            i3 = 0;
                        } else {
                            i3 = 240;
                            if (iNextInt < 64) {
                                i4 = 240;
                                i3 = 120;
                            } else {
                                i4 = 420;
                                if (iNextInt >= 97) {
                                    i3 = 540;
                                    if (iNextInt == 98) {
                                        i4 = 540;
                                        i3 = 420;
                                    } else {
                                        i4 = 720;
                                    }
                                }
                            }
                        }
                        RLottieDrawable rLottieDrawable2 = groupCallUserCell2.shakeHandDrawable;
                        rLottieDrawable2.setCustomEndFrame(i4);
                        rLottieDrawable2.setOnFinishCallback(i4 - 1, groupCallUserCell2.shakeHandCallback);
                        RLottieImageView rLottieImageView = groupCallUserCell2.muteButton;
                        rLottieImageView.setAnimation(rLottieDrawable2);
                        rLottieDrawable2.setCurrentFrame(i3, true, false);
                        rLottieImageView.playAnimation();
                        break;
                    case 2:
                        this.f$0.applyParticipantChanges(true, true);
                        break;
                    default:
                        GroupCallUserCell groupCallUserCell3 = this.f$0;
                        groupCallUserCell3.isSpeaking = false;
                        groupCallUserCell3.applyParticipantChanges(true, true);
                        groupCallUserCell3.avatarWavesDrawable.setAmplitude(0.0d);
                        groupCallUserCell3.updateRunnableScheduled = false;
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
                int i4;
                switch (i3) {
                    case 0:
                        GroupCallUserCell groupCallUserCell = this.f$0;
                        groupCallUserCell.shakeHandDrawable.setOnFinishCallback(0, null);
                        RLottieDrawable rLottieDrawable = groupCallUserCell.muteDrawable;
                        rLottieDrawable.setOnFinishCallback(0, null);
                        groupCallUserCell.muteButton.setAnimation(rLottieDrawable);
                        break;
                    case 1:
                        GroupCallUserCell groupCallUserCell2 = this.f$0;
                        groupCallUserCell2.getClass();
                        int iNextInt = Utilities.random.nextInt(100);
                        int i5 = 120;
                        if (iNextInt < 32) {
                            i4 = 0;
                        } else {
                            i4 = 240;
                            if (iNextInt < 64) {
                                i5 = 240;
                                i4 = 120;
                            } else {
                                i5 = 420;
                                if (iNextInt >= 97) {
                                    i4 = 540;
                                    if (iNextInt == 98) {
                                        i5 = 540;
                                        i4 = 420;
                                    } else {
                                        i5 = 720;
                                    }
                                }
                            }
                        }
                        RLottieDrawable rLottieDrawable2 = groupCallUserCell2.shakeHandDrawable;
                        rLottieDrawable2.setCustomEndFrame(i5);
                        rLottieDrawable2.setOnFinishCallback(i5 - 1, groupCallUserCell2.shakeHandCallback);
                        RLottieImageView rLottieImageView = groupCallUserCell2.muteButton;
                        rLottieImageView.setAnimation(rLottieDrawable2);
                        rLottieDrawable2.setCurrentFrame(i4, true, false);
                        rLottieImageView.playAnimation();
                        break;
                    case 2:
                        this.f$0.applyParticipantChanges(true, true);
                        break;
                    default:
                        GroupCallUserCell groupCallUserCell3 = this.f$0;
                        groupCallUserCell3.isSpeaking = false;
                        groupCallUserCell3.applyParticipantChanges(true, true);
                        groupCallUserCell3.avatarWavesDrawable.setAmplitude(0.0d);
                        groupCallUserCell3.updateRunnableScheduled = false;
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
                int i5;
                switch (i4) {
                    case 0:
                        GroupCallUserCell groupCallUserCell = this.f$0;
                        groupCallUserCell.shakeHandDrawable.setOnFinishCallback(0, null);
                        RLottieDrawable rLottieDrawable = groupCallUserCell.muteDrawable;
                        rLottieDrawable.setOnFinishCallback(0, null);
                        groupCallUserCell.muteButton.setAnimation(rLottieDrawable);
                        break;
                    case 1:
                        GroupCallUserCell groupCallUserCell2 = this.f$0;
                        groupCallUserCell2.getClass();
                        int iNextInt = Utilities.random.nextInt(100);
                        int i6 = 120;
                        if (iNextInt < 32) {
                            i5 = 0;
                        } else {
                            i5 = 240;
                            if (iNextInt < 64) {
                                i6 = 240;
                                i5 = 120;
                            } else {
                                i6 = 420;
                                if (iNextInt >= 97) {
                                    i5 = 540;
                                    if (iNextInt == 98) {
                                        i6 = 540;
                                        i5 = 420;
                                    } else {
                                        i6 = 720;
                                    }
                                }
                            }
                        }
                        RLottieDrawable rLottieDrawable2 = groupCallUserCell2.shakeHandDrawable;
                        rLottieDrawable2.setCustomEndFrame(i6);
                        rLottieDrawable2.setOnFinishCallback(i6 - 1, groupCallUserCell2.shakeHandCallback);
                        RLottieImageView rLottieImageView = groupCallUserCell2.muteButton;
                        rLottieImageView.setAnimation(rLottieDrawable2);
                        rLottieDrawable2.setCurrentFrame(i5, true, false);
                        rLottieImageView.playAnimation();
                        break;
                    case 2:
                        this.f$0.applyParticipantChanges(true, true);
                        break;
                    default:
                        GroupCallUserCell groupCallUserCell3 = this.f$0;
                        groupCallUserCell3.isSpeaking = false;
                        groupCallUserCell3.applyParticipantChanges(true, true);
                        groupCallUserCell3.avatarWavesDrawable.setAmplitude(0.0d);
                        groupCallUserCell3.updateRunnableScheduled = false;
                        break;
                }
            }
        };
        Paint paint = new Paint();
        this.dividerPaint = paint;
        paint.setColor(Theme.getColor(null, Theme.key_voipgroup_actionBar, false));
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        setClipChildren(false);
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z = LocaleController.isRTL;
        addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11.0f, 6.0f, z ? 11.0f : 0.0f, 0.0f));
        ProfileActivity.AnonymousClass22 anonymousClass22 = new ProfileActivity.AnonymousClass22(this, context);
        this.avatarProgressView = anonymousClass22;
        anonymousClass22.setSize(AndroidUtilities.dp(26.0f));
        anonymousClass22.setProgressColor(-1);
        anonymousClass22.setNoProgress(false);
        boolean z2 = LocaleController.isRTL;
        addView(anonymousClass22, LayoutHelper.createFrame(46, 46.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 11.0f, 6.0f, z2 ? 11.0f : 0.0f, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(anonymousClass22, false, 1.0f, false);
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.nameTextView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_nameText, false));
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setTextSize(16);
        simpleTextView.setDrawablePadding(AndroidUtilities.dp(6.0f));
        simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z3 = LocaleController.isRTL;
        addView(simpleTextView, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 54.0f : 67.0f, 10.0f, z3 ? 67.0f : 54.0f, 0.0f));
        this.leftDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(simpleTextView, false, AndroidUtilities.dp(20.0f), 9);
        this.rightDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(simpleTextView, false, AndroidUtilities.dp(20.0f), 9);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.speakingDrawable = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_voipgroup_speakingText, false), PorterDuff.Mode.MULTIPLY));
        final int i5 = 0;
        while (true) {
            SimpleTextView[] simpleTextViewArr = this.statusTextView;
            if (i5 >= simpleTextViewArr.length) {
                break;
            }
            simpleTextViewArr[i5] = new SimpleTextView(context) {
                public float originalAlpha;

                @Override
                public final float getAlpha() {
                    return this.originalAlpha;
                }

                @Override
                public final void setAlpha(float f) {
                    this.originalAlpha = f;
                    GroupCallUserCell groupCallUserCell = GroupCallUserCell.this;
                    if (i5 != 4) {
                        super.setAlpha((1.0f - groupCallUserCell.statusTextView[4].getFullAlpha()) * f);
                        return;
                    }
                    float fullAlpha = groupCallUserCell.statusTextView[4].getFullAlpha();
                    if (groupCallUserCell.isSelfUser()) {
                        float f2 = groupCallUserCell.progressToAvatarPreview;
                        if (f2 > 0.0f) {
                            super.setAlpha(1.0f - f2);
                            return;
                        }
                    }
                    if (fullAlpha > 0.0f) {
                        super.setAlpha(Math.max(f, fullAlpha));
                    } else {
                        super.setAlpha(f);
                    }
                }

                @Override
                public final void setFullAlpha(float f) {
                    super.setFullAlpha(f);
                    int i6 = 0;
                    while (true) {
                        SimpleTextView[] simpleTextViewArr2 = GroupCallUserCell.this.statusTextView;
                        if (i6 >= simpleTextViewArr2.length) {
                            return;
                        }
                        SimpleTextView simpleTextView2 = simpleTextViewArr2[i6];
                        simpleTextView2.setAlpha(simpleTextView2.getAlpha());
                        i6++;
                    }
                }

                @Override
                public final void setTranslationY(float f) {
                    if (i5 == 4 && getFullAlpha() > 0.0f) {
                        f = 0.0f;
                    }
                    super.setTranslationY(f);
                }
            };
            this.statusTextView[i5].setTextSize(15);
            this.statusTextView[i5].setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            if (i5 == 4) {
                this.statusTextView[i5].setBuildFullLayout(true);
                this.statusTextView[i5].setTextColor(Theme.getColor(null, Theme.key_voipgroup_mutedIcon, false));
                View view = this.statusTextView[i5];
                boolean z4 = LocaleController.isRTL;
                addView(view, LayoutHelper.createFrame(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 54.0f : 67.0f, 32.0f, z4 ? 67.0f : 54.0f, 0.0f));
            } else {
                if (i5 == 0) {
                    this.statusTextView[i5].setTextColor(Theme.getColor(null, Theme.key_voipgroup_listeningText, false));
                    this.statusTextView[i5].setText(LocaleController.getString(R.string.Listening));
                } else if (i5 == 1) {
                    this.statusTextView[i5].setTextColor(Theme.getColor(null, Theme.key_voipgroup_speakingText, false));
                    this.statusTextView[i5].setText(LocaleController.getString(R.string.Speaking));
                    this.statusTextView[i5].setDrawablePadding(AndroidUtilities.dp(2.0f));
                } else if (i5 == 2) {
                    this.statusTextView[i5].setTextColor(Theme.getColor(null, Theme.key_voipgroup_mutedByAdminIcon, false));
                    this.statusTextView[i5].setText(LocaleController.getString(R.string.VoipGroupMutedForMe));
                } else if (i5 == 3) {
                    this.statusTextView[i5].setTextColor(Theme.getColor(null, Theme.key_voipgroup_listeningText, false));
                    this.statusTextView[i5].setText(LocaleController.getString(R.string.WantsToSpeak));
                }
                View view2 = this.statusTextView[i5];
                boolean z5 = LocaleController.isRTL;
                addView(view2, LayoutHelper.createFrame(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 54.0f : 67.0f, 32.0f, z5 ? 67.0f : 54.0f, 0.0f));
            }
            i5++;
        }
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.fullAboutTextView = simpleTextView2;
        simpleTextView2.setMaxLines(3);
        simpleTextView2.setTextSize(15);
        simpleTextView2.setTextColor(Theme.getColor(null, Theme.key_voipgroup_mutedIcon, false));
        simpleTextView2.setVisibility(8);
        addView(simpleTextView2, LayoutHelper.createFrame(-1, 60.0f, (LocaleController.isRTL ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        int i6 = R.raw.voice_outlined2;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i6, SurfaceContainer$$ExternalSyntheticOutline0.m(i6, ""), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        this.muteDrawable = rLottieDrawable;
        int i7 = R.raw.hand_1;
        this.shakeHandDrawable = new RLottieDrawable(i7, SurfaceContainer$$ExternalSyntheticOutline0.m(i7, ""), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.muteButton = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setAnimation(rLottieDrawable);
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable = Theme.createSelectorDrawable(Theme.getColor(null, this.grayIconColor, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(rippleDrawableSafeCreateSelectorDrawable, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        rLottieImageView.setBackground(rippleDrawableSafeCreateSelectorDrawable);
        rLottieImageView.setImportantForAccessibility(2);
        addView(rLottieImageView, LayoutHelper.createFrame(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        rLottieImageView.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, 23));
        this.avatarWavesDrawable = new AvatarWavesDrawable(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void applyParticipantChanges(boolean z, boolean z2) {
        int color;
        int i;
        boolean z3;
        float f;
        ArrayList arrayList;
        char c;
        Property property;
        Property property2;
        int i2;
        float f2;
        float fDp;
        float f3;
        int i3;
        float fDp2;
        float f4;
        AvatarWavesDrawable avatarWavesDrawable;
        RLottieDrawable rLottieDrawable;
        int i4;
        boolean customEndFrame;
        boolean z4;
        AnimatorSet animatorSet;
        float f5;
        int participantVolume;
        int i5;
        int color2;
        boolean z5;
        int i6 = 0;
        int i7 = 1;
        if (this.currentCall == null) {
            return;
        }
        RLottieImageView rLottieImageView = this.muteButton;
        rLottieImageView.setEnabled((isSelfUser() && this.participant.raise_hand_rating == 0) ? false : true);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant = this.participant;
        boolean z6 = jElapsedRealtime - groupCallParticipant.lastVoiceUpdateTime < 500 ? groupCallParticipant.hasVoiceDelayed : groupCallParticipant.hasVoice;
        if (!z2) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.participant.lastSpeakTime;
            boolean z7 = jUptimeMillis < 500;
            if (!this.isSpeaking || !z7 || z6) {
                this.isSpeaking = z7;
                boolean z8 = this.updateRunnableScheduled;
                GroupCallUserCell$$ExternalSyntheticLambda1 groupCallUserCell$$ExternalSyntheticLambda1 = this.updateRunnable;
                if (z8) {
                    AndroidUtilities.cancelRunOnUIThread(groupCallUserCell$$ExternalSyntheticLambda1);
                    this.updateRunnableScheduled = false;
                }
                if (this.isSpeaking) {
                    AndroidUtilities.runOnUIThread(groupCallUserCell$$ExternalSyntheticLambda1, 500 - jUptimeMillis);
                    this.updateRunnableScheduled = true;
                }
            }
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.currentCall.participants.get(MessageObject.getPeerId(this.participant.peer));
        if (groupCallParticipant2 != null) {
            this.participant = groupCallParticipant2;
        }
        boolean z9 = this.participant.muted_by_you && !isSelfUser();
        boolean z10 = !isSelfUser() ? (!this.participant.muted || (this.isSpeaking && z6)) && !z9 : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.isSpeaking && z6);
        if (z10) {
            boolean z11 = this.participant.can_self_unmute;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.participant.about);
        this.currentIconGray = false;
        GroupCallUserCell$$ExternalSyntheticLambda1 groupCallUserCell$$ExternalSyntheticLambda2 = this.checkRaiseRunnable;
        AndroidUtilities.cancelRunOnUIThread(groupCallUserCell$$ExternalSyntheticLambda2);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.participant;
        if ((!groupCallParticipant3.muted || this.isSpeaking) && !z9) {
            if (this.isSpeaking && z6) {
                color = Theme.getColor(null, Theme.key_voipgroup_speakingText, false);
                i = 1;
            } else {
                color = Theme.getColor(null, this.grayIconColor, false);
                i = !zIsEmpty ? 4 : 0;
                this.currentIconGray = true;
            }
            z3 = false;
        } else {
            boolean z12 = groupCallParticipant3.can_self_unmute;
            if (!z12 || z9) {
                z3 = (z12 || groupCallParticipant3.raise_hand_rating == 0) ? false : true;
                if (z3) {
                    color = Theme.getColor(null, Theme.key_voipgroup_listeningText, false);
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j = this.participant.lastRaiseHandDate;
                    long j2 = jElapsedRealtime2 - j;
                    if (j != 0 && j2 <= 5000) {
                        AndroidUtilities.runOnUIThread(groupCallUserCell$$ExternalSyntheticLambda2, 5000 - j2);
                        i = 3;
                    } else if (z9) {
                        i = 2;
                    } else {
                        z5 = z3;
                        color2 = color;
                        if (zIsEmpty) {
                            color = color2;
                            z3 = z5;
                            i = 0;
                        } else {
                            color = color2;
                            z3 = z5;
                            i = 4;
                        }
                    }
                } else {
                    int color3 = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminIcon, false);
                    if (z9) {
                        color = color3;
                        i = 2;
                    } else {
                        boolean z13 = z3;
                        color2 = color3;
                        z5 = z13;
                        if (zIsEmpty) {
                            color = color2;
                            z3 = z5;
                            i = 0;
                        } else {
                            color = color2;
                            z3 = z5;
                            i = 4;
                        }
                    }
                }
            } else {
                color2 = Theme.getColor(null, this.grayIconColor, false);
                this.currentIconGray = true;
                z5 = false;
                if (zIsEmpty) {
                    color = color2;
                    z3 = z5;
                    i = 0;
                } else {
                    color = color2;
                    z3 = z5;
                    i = 4;
                }
            }
        }
        boolean zIsSelfUser = isSelfUser();
        SimpleTextView[] simpleTextViewArr = this.statusTextView;
        if (!zIsSelfUser) {
            simpleTextViewArr[4].setTextColor(Theme.getColor(null, this.grayIconColor, false));
        }
        boolean zIsSelfUser2 = isSelfUser();
        SimpleTextView simpleTextView = this.fullAboutTextView;
        if (zIsSelfUser2) {
            if (zIsEmpty && !this.hasAvatar) {
                if (this.currentUser != null) {
                    simpleTextViewArr[4].setText(LocaleController.getString(R.string.TapToAddPhotoOrBio));
                } else {
                    simpleTextViewArr[4].setText(LocaleController.getString(R.string.TapToAddPhotoOrDescription));
                }
                simpleTextViewArr[4].setTextColor(Theme.getColor(null, this.grayIconColor, false));
            } else if (zIsEmpty) {
                if (this.currentUser != null) {
                    simpleTextViewArr[4].setText(LocaleController.getString(R.string.TapToAddBio));
                } else {
                    simpleTextViewArr[4].setText(LocaleController.getString(R.string.TapToAddDescription));
                }
                simpleTextViewArr[4].setTextColor(Theme.getColor(null, this.grayIconColor, false));
            } else if (this.hasAvatar) {
                simpleTextViewArr[4].setText(LocaleController.getString(R.string.ThisIsYou));
                simpleTextViewArr[4].setTextColor(Theme.getColor(null, Theme.key_voipgroup_listeningText, false));
            } else {
                simpleTextViewArr[4].setText(LocaleController.getString(R.string.TapToAddPhoto));
                simpleTextViewArr[4].setTextColor(Theme.getColor(null, this.grayIconColor, false));
            }
            if (zIsEmpty) {
                simpleTextView.setText(simpleTextViewArr[i].getText(), false);
                simpleTextView.setTextColor(simpleTextViewArr[i].getTextColor());
            } else {
                simpleTextView.setText(AndroidUtilities.replaceNewLines(this.participant.about), false);
                simpleTextView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_mutedIcon, false));
            }
        } else if (zIsEmpty) {
            simpleTextViewArr[4].setText("");
            simpleTextView.setText("", false);
        } else {
            simpleTextViewArr[4].setText(AndroidUtilities.replaceNewLines(this.participant.about));
            simpleTextView.setText("", false);
        }
        AnimatorSet animatorSet2 = this.animatorSet;
        boolean z14 = (animatorSet2 == null || (i == this.currentStatus && this.lastMuteColor == color)) ? false : true;
        if ((!z || z14) && animatorSet2 != null) {
            animatorSet2.cancel();
            this.animatorSet = null;
        }
        if (!z || this.lastMuteColor != color || z14) {
            if (z) {
                arrayList = new ArrayList();
                int i8 = this.lastMuteColor;
                this.lastMuteColor = color;
                f = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new GroupCallUserCell$$ExternalSyntheticLambda0(this, i8, color, i6));
                arrayList.add(valueAnimatorOfFloat);
            } else {
                f = 0.0f;
                this.lastMuteColor = color;
                rLottieImageView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                Theme.setSelectorDrawableColor(rLottieImageView.getDrawable(), 620756991 & color, true);
            }
            if (i == 1) {
                participantVolume = ChatObject.getParticipantVolume(this.participant);
                i5 = participantVolume / 100;
                if (i5 != 100) {
                    c = 0;
                    simpleTextViewArr[1].setLeftDrawable(this.speakingDrawable);
                    SimpleTextView simpleTextView2 = simpleTextViewArr[1];
                    int i9 = R.string.SpeakingWithVolume;
                    if (participantVolume < 100) {
                        i5 = 1;
                    }
                    simpleTextView2.setText(LocaleController.formatString("SpeakingWithVolume", i9, Integer.valueOf(i5)));
                } else {
                    c = 0;
                    simpleTextViewArr[1].setLeftDrawable((Drawable) null);
                    simpleTextViewArr[1].setText(LocaleController.getString(R.string.Speaking));
                }
            } else {
                c = 0;
            }
            if (isSelfUser()) {
                applyStatus(4);
            } else if (z || i != this.currentStatus || z14) {
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    property = View.ALPHA;
                    property2 = View.TRANSLATION_Y;
                    if (i == 0) {
                        for (i3 = 0; i3 < simpleTextViewArr.length; i3++) {
                            SimpleTextView simpleTextView3 = simpleTextViewArr[i3];
                            if (i3 == i) {
                                fDp2 = 0.0f;
                            } else {
                                fDp2 = AndroidUtilities.dp(-2.0f);
                            }
                            float[] fArr = new float[1];
                            fArr[c] = fDp2;
                            arrayList.add(ObjectAnimator.ofFloat(simpleTextView3, (Property<SimpleTextView, Float>) property2, fArr));
                            SimpleTextView simpleTextView4 = simpleTextViewArr[i3];
                            if (i3 == i) {
                                f4 = 1.0f;
                            } else {
                                f4 = 0.0f;
                            }
                            float[] fArr2 = new float[1];
                            fArr2[c] = f4;
                            arrayList.add(ObjectAnimator.ofFloat(simpleTextView4, (Property<SimpleTextView, Float>) property, fArr2));
                        }
                    } else {
                        for (i2 = 0; i2 < simpleTextViewArr.length; i2++) {
                            SimpleTextView simpleTextView5 = simpleTextViewArr[i2];
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
                            float[] fArr3 = new float[1];
                            fArr3[c] = fDp;
                            arrayList.add(ObjectAnimator.ofFloat(simpleTextView5, (Property<SimpleTextView, Float>) property2, fArr3));
                            SimpleTextView simpleTextView6 = simpleTextViewArr[i2];
                            if (i2 == i) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            float[] fArr4 = new float[1];
                            fArr4[c] = f3;
                            arrayList.add(ObjectAnimator.ofFloat(simpleTextView6, (Property<SimpleTextView, Float>) property, fArr4));
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
                animatorSet3.addListener(new ArticleViewer.AnonymousClass3(this, i, i7));
                this.animatorSet.playTogether(arrayList);
                this.animatorSet.setDuration(180L);
                this.animatorSet.start();
            }
            if (z || this.lastMuted != z10 || this.lastRaisedHand != z3) {
                rLottieDrawable = this.muteDrawable;
                if (z3) {
                    customEndFrame = rLottieDrawable.setCustomEndFrame(84);
                    if (z) {
                        rLottieDrawable.setOnFinishCallback(83, this.raiseHandCallback);
                    } else {
                        rLottieDrawable.setOnFinishCallback(0, null);
                    }
                } else {
                    rLottieImageView.setAnimation(rLottieDrawable);
                    rLottieDrawable.setOnFinishCallback(0, null);
                    if (z10 || !this.lastRaisedHand) {
                        if (z10) {
                            i4 = 64;
                        } else {
                            i4 = 42;
                        }
                        customEndFrame = rLottieDrawable.setCustomEndFrame(i4);
                    } else {
                        customEndFrame = rLottieDrawable.setCustomEndFrame(21);
                    }
                }
                if (z) {
                    if (customEndFrame) {
                        if (i == 3) {
                            rLottieDrawable.setCurrentFrame(63, true, false);
                        } else if (!z10 && this.lastRaisedHand && !z3) {
                            rLottieDrawable.setCurrentFrame(0, true, false);
                        } else if (z10) {
                            rLottieDrawable.setCurrentFrame(43, true, false);
                        } else {
                            rLottieDrawable.setCurrentFrame(21, true, false);
                        }
                    }
                    rLottieImageView.playAnimation();
                } else {
                    rLottieDrawable.setCurrentFrame(rLottieDrawable.customEndFrame - 1, false, true);
                    rLottieImageView.invalidate();
                }
                this.lastMuted = z10;
                this.lastRaisedHand = z3;
            }
            if (!this.isSpeaking) {
                avatarWavesDrawable.setAmplitude(0.0d);
            }
            if (this.isSpeaking || this.progressToAvatarPreview != f) {
                z4 = false;
            } else {
                z4 = true;
            }
            avatarWavesDrawable.setShowWaves(this, z4);
        }
        f = 0.0f;
        arrayList = null;
        if (i == 1) {
            participantVolume = ChatObject.getParticipantVolume(this.participant);
            i5 = participantVolume / 100;
            if (i5 != 100) {
                c = 0;
                simpleTextViewArr[1].setLeftDrawable(this.speakingDrawable);
                SimpleTextView simpleTextView7 = simpleTextViewArr[1];
                int i10 = R.string.SpeakingWithVolume;
                if (participantVolume < 100) {
                    i5 = 1;
                }
                simpleTextView7.setText(LocaleController.formatString("SpeakingWithVolume", i10, Integer.valueOf(i5)));
            } else {
                c = 0;
                simpleTextViewArr[1].setLeftDrawable((Drawable) null);
                simpleTextViewArr[1].setText(LocaleController.getString(R.string.Speaking));
            }
        } else {
            c = 0;
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
                if (i == 0) {
                    while (i3 < simpleTextViewArr.length) {
                        SimpleTextView simpleTextView8 = simpleTextViewArr[i3];
                        if (i3 == i) {
                            fDp2 = 0.0f;
                        } else {
                            fDp2 = AndroidUtilities.dp(-2.0f);
                        }
                        float[] fArr5 = new float[1];
                        fArr5[c] = fDp2;
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView8, (Property<SimpleTextView, Float>) property2, fArr5));
                        SimpleTextView simpleTextView9 = simpleTextViewArr[i3];
                        if (i3 == i) {
                            f4 = 1.0f;
                        } else {
                            f4 = 0.0f;
                        }
                        float[] fArr6 = new float[1];
                        fArr6[c] = f4;
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView9, (Property<SimpleTextView, Float>) property, fArr6));
                    }
                } else {
                    while (i2 < simpleTextViewArr.length) {
                        SimpleTextView simpleTextView10 = simpleTextViewArr[i2];
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
                        float[] fArr7 = new float[1];
                        fArr7[c] = fDp;
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView10, (Property<SimpleTextView, Float>) property2, fArr7));
                        SimpleTextView simpleTextView11 = simpleTextViewArr[i2];
                        if (i2 == i) {
                            f3 = 1.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        float[] fArr8 = new float[1];
                        fArr8[c] = f3;
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView11, (Property<SimpleTextView, Float>) property, fArr8));
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
                if (i == 0) {
                    while (i3 < simpleTextViewArr.length) {
                        SimpleTextView simpleTextView12 = simpleTextViewArr[i3];
                        if (i3 == i) {
                            fDp2 = 0.0f;
                        } else {
                            fDp2 = AndroidUtilities.dp(-2.0f);
                        }
                        float[] fArr9 = new float[1];
                        fArr9[c] = fDp2;
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView12, (Property<SimpleTextView, Float>) property2, fArr9));
                        SimpleTextView simpleTextView13 = simpleTextViewArr[i3];
                        if (i3 == i) {
                            f4 = 1.0f;
                        } else {
                            f4 = 0.0f;
                        }
                        float[] fArr10 = new float[1];
                        fArr10[c] = f4;
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView13, (Property<SimpleTextView, Float>) property, fArr10));
                    }
                } else {
                    while (i2 < simpleTextViewArr.length) {
                        SimpleTextView simpleTextView14 = simpleTextViewArr[i2];
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
                        float[] fArr11 = new float[1];
                        fArr11[c] = fDp;
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView14, (Property<SimpleTextView, Float>) property2, fArr11));
                        SimpleTextView simpleTextView15 = simpleTextViewArr[i2];
                        if (i2 == i) {
                            f3 = 1.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        float[] fArr12 = new float[1];
                        fArr12[c] = f3;
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView15, (Property<SimpleTextView, Float>) property, fArr12));
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
            animatorSet4.addListener(new ArticleViewer.AnonymousClass3(this, i, i7));
            this.animatorSet.playTogether(arrayList);
            this.animatorSet.setDuration(180L);
            this.animatorSet.start();
        }
        if (z) {
            rLottieDrawable = this.muteDrawable;
            if (z3) {
                customEndFrame = rLottieDrawable.setCustomEndFrame(84);
                if (z) {
                    rLottieDrawable.setOnFinishCallback(83, this.raiseHandCallback);
                } else {
                    rLottieDrawable.setOnFinishCallback(0, null);
                }
            } else {
                rLottieImageView.setAnimation(rLottieDrawable);
                rLottieDrawable.setOnFinishCallback(0, null);
                if (z10) {
                    if (z10) {
                        i4 = 64;
                    } else {
                        i4 = 42;
                    }
                    customEndFrame = rLottieDrawable.setCustomEndFrame(i4);
                } else {
                    if (z10) {
                        i4 = 64;
                    } else {
                        i4 = 42;
                    }
                    customEndFrame = rLottieDrawable.setCustomEndFrame(i4);
                }
            }
            if (z) {
                if (customEndFrame) {
                    if (i == 3) {
                        rLottieDrawable.setCurrentFrame(63, true, false);
                    } else if (!z10) {
                        if (z10) {
                            rLottieDrawable.setCurrentFrame(43, true, false);
                        } else {
                            rLottieDrawable.setCurrentFrame(21, true, false);
                        }
                    } else if (z10) {
                        rLottieDrawable.setCurrentFrame(43, true, false);
                    } else {
                        rLottieDrawable.setCurrentFrame(21, true, false);
                    }
                }
                rLottieImageView.playAnimation();
            } else {
                rLottieDrawable.setCurrentFrame(rLottieDrawable.customEndFrame - 1, false, true);
                rLottieImageView.invalidate();
            }
            this.lastMuted = z10;
            this.lastRaisedHand = z3;
        } else {
            rLottieDrawable = this.muteDrawable;
            if (z3) {
                customEndFrame = rLottieDrawable.setCustomEndFrame(84);
                if (z) {
                    rLottieDrawable.setOnFinishCallback(83, this.raiseHandCallback);
                } else {
                    rLottieDrawable.setOnFinishCallback(0, null);
                }
            } else {
                rLottieImageView.setAnimation(rLottieDrawable);
                rLottieDrawable.setOnFinishCallback(0, null);
                if (z10) {
                    if (z10) {
                        i4 = 64;
                    } else {
                        i4 = 42;
                    }
                    customEndFrame = rLottieDrawable.setCustomEndFrame(i4);
                } else {
                    if (z10) {
                        i4 = 64;
                    } else {
                        i4 = 42;
                    }
                    customEndFrame = rLottieDrawable.setCustomEndFrame(i4);
                }
            }
            if (z) {
                if (customEndFrame) {
                    if (i == 3) {
                        rLottieDrawable.setCurrentFrame(63, true, false);
                    } else if (!z10) {
                        if (z10) {
                            rLottieDrawable.setCurrentFrame(43, true, false);
                        } else {
                            rLottieDrawable.setCurrentFrame(21, true, false);
                        }
                    } else if (z10) {
                        rLottieDrawable.setCurrentFrame(43, true, false);
                    } else {
                        rLottieDrawable.setCurrentFrame(21, true, false);
                    }
                }
                rLottieImageView.playAnimation();
            } else {
                rLottieDrawable.setCurrentFrame(rLottieDrawable.customEndFrame - 1, false, true);
                rLottieImageView.invalidate();
            }
            this.lastMuted = z10;
            this.lastRaisedHand = z3;
        }
        if (!this.isSpeaking) {
            avatarWavesDrawable.setAmplitude(0.0d);
        }
        if (this.isSpeaking) {
            z4 = false;
        } else {
            z4 = false;
        }
        avatarWavesDrawable.setShowWaves(this, z4);
    }

    public final void applyStatus(int i) {
        SimpleTextView[] simpleTextViewArr;
        float fDp;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            simpleTextViewArr = this.statusTextView;
            if (i3 >= simpleTextViewArr.length) {
                break;
            }
            simpleTextViewArr[i3].setImportantForAccessibility(i3 == i ? 1 : 2);
            i3++;
        }
        if (i == 0) {
            while (i2 < simpleTextViewArr.length) {
                simpleTextViewArr[i2].setTranslationY(i2 == i ? 0.0f : AndroidUtilities.dp(-2.0f));
                simpleTextViewArr[i2].setAlpha(i2 == i ? 1.0f : 0.0f);
                i2++;
            }
            return;
        }
        while (i2 < simpleTextViewArr.length) {
            SimpleTextView simpleTextView = simpleTextViewArr[i2];
            if (i2 == i) {
                fDp = 0.0f;
            } else {
                fDp = AndroidUtilities.dp(i2 == 0 ? 2.0f : -2.0f);
            }
            simpleTextView.setTranslationY(fDp);
            simpleTextViewArr[i2].setAlpha(i2 == i ? 1.0f : 0.0f);
            i2++;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.needDivider) {
            Paint paint = this.dividerPaint;
            int alpha = paint.getAlpha();
            float f = this.progressToAvatarPreview;
            if (f != 0.0f) {
                paint.setAlpha((int) ((1.0f - f) * alpha));
            } else {
                paint.setAlpha((int) ((1.0f - this.statusTextView[4].getFullAlpha()) * alpha));
            }
            float fDp = LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f);
            canvas2 = canvas;
            canvas2.drawLine(fDp, getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        BackupImageView backupImageView = this.avatarImageView;
        int measuredWidth = (backupImageView.getMeasuredWidth() / 2) + backupImageView.getLeft();
        int measuredHeight = (backupImageView.getMeasuredHeight() / 2) + backupImageView.getTop();
        AvatarWavesDrawable avatarWavesDrawable = this.avatarWavesDrawable;
        avatarWavesDrawable.update();
        if (this.progressToAvatarPreview == 0.0f) {
            avatarWavesDrawable.draw(canvas2, measuredWidth, measuredHeight, this);
        }
        backupImageView.setScaleX(avatarWavesDrawable.getAvatarScale());
        backupImageView.setScaleY(avatarWavesDrawable.getAvatarScale());
        float avatarScale = avatarWavesDrawable.getAvatarScale();
        ProfileActivity.AnonymousClass22 anonymousClass22 = this.avatarProgressView;
        anonymousClass22.setScaleX(avatarScale);
        anonymousClass22.setScaleY(avatarWavesDrawable.getAvatarScale());
        super.dispatchDraw(canvas2);
    }

    public BackupImageView getAvatarImageView() {
        return this.avatarImageView;
    }

    public AvatarWavesDrawable getAvatarWavesDrawable() {
        return this.avatarWavesDrawable;
    }

    public int getClipHeight() {
        SimpleTextView simpleTextView = this.fullAboutTextView;
        if (TextUtils.isEmpty(simpleTextView.getText()) || !this.hasAvatar) {
            simpleTextView = this.statusTextView[4];
        }
        if (simpleTextView.getLineCount() <= 1) {
            return getMeasuredHeight();
        }
        return AndroidUtilities.dp(8.0f) + simpleTextView.getTop() + simpleTextView.getTextHeight();
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

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean isSelfUser() {
        long j = this.selfId;
        if (j > 0) {
            TLRPC.User user = this.currentUser;
            return user != null && user.id == j;
        }
        TLRPC.Chat chat = this.currentChat;
        return chat != null && chat.id == (-j);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        applyParticipantChanges(false, false);
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
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.updateRunnableScheduled) {
            AndroidUtilities.cancelRunOnUIThread(this.updateRunnable);
            this.updateRunnableScheduled = false;
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
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
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

    public void onMuteClick(GroupCallUserCell groupCallUserCell) {
    }

    public void setAboutVisible(boolean z) {
        SimpleTextView[] simpleTextViewArr = this.statusTextView;
        if (z) {
            simpleTextViewArr[4].setTranslationY(0.0f);
        } else {
            simpleTextViewArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        AvatarWavesDrawable avatarWavesDrawable = this.avatarWavesDrawable;
        if (d <= 1.5d) {
            avatarWavesDrawable.setAmplitude(0.0d);
            return;
        }
        boolean z = this.updateRunnableScheduled;
        GroupCallUserCell$$ExternalSyntheticLambda1 groupCallUserCell$$ExternalSyntheticLambda1 = this.updateRunnable;
        if (z) {
            AndroidUtilities.cancelRunOnUIThread(groupCallUserCell$$ExternalSyntheticLambda1);
        }
        if (!this.isSpeaking) {
            this.isSpeaking = true;
            applyParticipantChanges(true, false);
        }
        avatarWavesDrawable.setAmplitude(d);
        AndroidUtilities.runOnUIThread(groupCallUserCell$$ExternalSyntheticLambda1, 500L);
        this.updateRunnableScheduled = true;
    }

    public final void setData(AccountInstance accountInstance, TLRPC.GroupCallParticipant groupCallParticipant, ChatObject.Call call, long j, TLRPC.FileLocation fileLocation, boolean z) {
        long j2;
        long botVerificationIcon;
        this.currentCall = call;
        this.accountInstance = accountInstance;
        this.selfId = j;
        this.participant = groupCallParticipant;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        SimpleTextView simpleTextView = this.nameTextView;
        BackupImageView backupImageView = this.avatarImageView;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.rightDrawable;
        if (peerId > 0) {
            this.currentUser = this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
            this.currentChat = null;
            avatarDrawable.setInfo(this.accountInstance.getCurrentAccount(), this.currentUser);
            simpleTextView.setText(UserObject.getUserName(this.currentUser), false);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.currentUser);
            TLRPC.User user = this.currentUser;
            j2 = 0;
            if (user != null && user.verified) {
                Drawable verifiedDrawable = this.verifiedDrawable;
                if (verifiedDrawable == null) {
                    verifiedDrawable = new VerifiedDrawable(getContext());
                }
                this.verifiedDrawable = verifiedDrawable;
                swapAnimatedEmojiDrawable.set(verifiedDrawable, z);
            } else if (user == null || DialogObject.getEmojiStatusDocumentId(user.emoji_status) == 0) {
                TLRPC.User user2 = this.currentUser;
                if (user2 == null || !user2.premium) {
                    swapAnimatedEmojiDrawable.set((Drawable) null, z);
                } else {
                    if (this.premiumDrawable == null) {
                        this.premiumDrawable = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.premiumDrawable = new AnonymousClass3(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.premiumDrawable);
                    }
                    swapAnimatedEmojiDrawable.set(this.premiumDrawable, z);
                }
            } else {
                swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(this.currentUser.emoji_status), z);
            }
            swapAnimatedEmojiDrawable.setColor(Integer.valueOf(Theme.getColor(null, Theme.key_premiumGradient1, false)));
            simpleTextView.setRightDrawable(swapAnimatedEmojiDrawable);
            backupImageView.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
            if (fileLocation != null) {
                this.hasAvatar = true;
                backupImageView.setImage(ImageLocation.getForLocal(fileLocation), "50_50", avatarDrawable, null);
            } else {
                ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), this.currentUser, 1);
                this.hasAvatar = forUser != null;
                backupImageView.setImage(forUser, "50_50", avatarDrawable, this.currentUser);
            }
        } else {
            j2 = 0;
            this.currentChat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            this.currentUser = null;
            avatarDrawable.setInfo(this.accountInstance.getCurrentAccount(), this.currentChat);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.currentChat);
            TLRPC.Chat chat = this.currentChat;
            if (chat != null) {
                simpleTextView.setText(chat.title, false);
                TLRPC.Chat chat2 = this.currentChat;
                if (chat2.verified) {
                    Drawable verifiedDrawable2 = this.verifiedDrawable;
                    if (verifiedDrawable2 == null) {
                        verifiedDrawable2 = new VerifiedDrawable(getContext());
                    }
                    this.verifiedDrawable = verifiedDrawable2;
                    swapAnimatedEmojiDrawable.set(verifiedDrawable2, z);
                } else if (DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                    swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(this.currentChat.emoji_status), z);
                } else {
                    swapAnimatedEmojiDrawable.set((Drawable) null, z);
                }
                backupImageView.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
                if (fileLocation != null) {
                    this.hasAvatar = true;
                    backupImageView.setImage(ImageLocation.getForLocal(fileLocation), "50_50", avatarDrawable, null);
                } else {
                    ImageLocation forChat = ImageLocation.getForChat(this.currentChat, 1);
                    this.hasAvatar = forChat != null;
                    backupImageView.setImage(forChat, "50_50", avatarDrawable, this.currentChat);
                }
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.leftDrawable;
        if (botVerificationIcon != j2) {
            swapAnimatedEmojiDrawable2.set(botVerificationIcon, z);
            simpleTextView.setLeftDrawable(swapAnimatedEmojiDrawable2);
            swapAnimatedEmojiDrawable2.setColor(Integer.valueOf(Theme.getColor(null, Theme.key_premiumGradient1, false)));
        } else {
            swapAnimatedEmojiDrawable2.set((Drawable) null, z);
            simpleTextView.setLeftDrawable((Drawable) null);
        }
        applyParticipantChanges(z, false);
    }

    public void setDrawAvatar(boolean z) {
        BackupImageView backupImageView = this.avatarImageView;
        if (backupImageView.getImageReceiver().getVisible() != z) {
            backupImageView.getImageReceiver().setVisible(z, true);
        }
    }

    public void setDrawDivider(boolean z) {
        this.needDivider = z;
        invalidate();
    }

    public final void setGrayIconColor(int i, int i2) {
        if (this.grayIconColor != i) {
            if (this.currentIconGray) {
                this.lastMuteColor = Theme.getColor(null, i, false);
            }
            this.grayIconColor = i;
        }
        if (this.currentIconGray) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
            RLottieImageView rLottieImageView = this.muteButton;
            rLottieImageView.setColorFilter(porterDuffColorFilter);
            Theme.setSelectorDrawableColor(rLottieImageView.getDrawable(), i2 & 620756991, true);
        }
    }

    public void setProgressToAvatarPreview(float f) {
        this.progressToAvatarPreview = f;
        this.nameTextView.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f);
        boolean zIsSelfUser = isSelfUser();
        SimpleTextView simpleTextView = this.fullAboutTextView;
        SimpleTextView[] simpleTextViewArr = this.statusTextView;
        if (!zIsSelfUser || f <= 0.0f) {
            simpleTextView.setVisibility(8);
            for (int i = 0; i < simpleTextViewArr.length; i++) {
                if (TextUtils.isEmpty(simpleTextViewArr[4].getText()) || simpleTextViewArr[4].getLineCount() <= 1) {
                    simpleTextViewArr[i].setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f);
                    simpleTextViewArr[i].setFullLayoutAdditionalWidth(0, 0);
                } else {
                    simpleTextViewArr[i].setFullLayoutAdditionalWidth(AndroidUtilities.dp(92.0f), LocaleController.isRTL ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(53.0f));
                    simpleTextViewArr[i].setFullAlpha(f);
                    simpleTextViewArr[i].setTranslationX(0.0f);
                    simpleTextViewArr[i].invalidate();
                }
            }
        } else {
            float f2 = 1.0f - f;
            simpleTextView.setTranslationX((LocaleController.isRTL ? -AndroidUtilities.dp(53.0f) : AndroidUtilities.dp(53.0f)) * f2);
            simpleTextView.setVisibility(0);
            simpleTextView.setAlpha(f);
            simpleTextViewArr[4].setAlpha(f2);
            SimpleTextView simpleTextView2 = simpleTextViewArr[4];
            boolean z = LocaleController.isRTL;
            int iDp = AndroidUtilities.dp(53.0f);
            if (!z) {
                iDp = -iDp;
            }
            simpleTextView2.setTranslationX(iDp * f);
        }
        this.avatarImageView.setAlpha(f == 0.0f ? 1.0f : 0.0f);
        this.avatarWavesDrawable.setShowWaves(this, this.isSpeaking && f == 0.0f);
        RLottieImageView rLottieImageView = this.muteButton;
        float f3 = 1.0f - f;
        rLottieImageView.setAlpha(f3);
        float f4 = (f3 * 0.4f) + 0.6f;
        rLottieImageView.setScaleX(f4);
        rLottieImageView.setScaleY(f4);
        invalidate();
    }
}
