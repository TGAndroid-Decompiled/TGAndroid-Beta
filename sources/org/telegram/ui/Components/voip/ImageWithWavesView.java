package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;

public final class ImageWithWavesView extends FrameLayout {
    public final boolean allowAnimations;
    public AnimatorSet animatorSet;
    public final AvatarWavesDrawable avatarWavesDrawable;
    public final BackupImageView backupImageView;
    public boolean isConnectedCalled;
    public boolean isMuted;

    public final class AvatarWavesDrawable {
        public float amplitude;
        public float animateAmplitudeDiff;
        public float animateToAmplitude;
        public ValueAnimator animator;
        public final VoipBlobDrawable blobDrawable;
        public final VoipBlobDrawable blobDrawable2;
        public int muteToStaticInvalidationCount;
        public boolean showWaves;
        public float wavesEnter = 0.0f;
        public boolean muteToStatic = false;
        public float muteToStaticProgress = 1.0f;

        public AvatarWavesDrawable(int i, int i2, int i3, int i4) {
            VoipBlobDrawable voipBlobDrawable = new VoipBlobDrawable(i4 - 1);
            this.blobDrawable = voipBlobDrawable;
            VoipBlobDrawable voipBlobDrawable2 = new VoipBlobDrawable(i4);
            this.blobDrawable2 = voipBlobDrawable2;
            voipBlobDrawable.minRadius = i;
            voipBlobDrawable.maxRadius = i2;
            voipBlobDrawable2.minRadius = i - i3;
            voipBlobDrawable2.maxRadius = i2 - i3;
            voipBlobDrawable.generateBlob();
            voipBlobDrawable2.generateBlob();
            voipBlobDrawable.paint.setColor(-1);
            voipBlobDrawable.paint.setAlpha(20);
            voipBlobDrawable2.paint.setColor(-1);
            voipBlobDrawable2.paint.setAlpha(36);
        }

        public final void draw(Canvas canvas, View view, float f, float f2) {
            float f3 = (this.amplitude * 0.4f) + 0.8f;
            if (this.showWaves || this.wavesEnter != 0.0f) {
                canvas.save();
                float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.wavesEnter) * f3;
                canvas.scale(interpolation, interpolation, f, f2);
                float f4 = this.amplitude;
                float f5 = this.muteToStaticProgress;
                VoipBlobDrawable voipBlobDrawable = this.blobDrawable;
                voipBlobDrawable.update$1(f4, f5);
                voipBlobDrawable.draw(f, f2, canvas, voipBlobDrawable.paint);
                float f6 = this.amplitude;
                float f7 = this.muteToStaticProgress;
                VoipBlobDrawable voipBlobDrawable2 = this.blobDrawable2;
                voipBlobDrawable2.update$1(f6, f7);
                voipBlobDrawable2.draw(f, f2, canvas, voipBlobDrawable.paint);
                canvas.restore();
            }
            if (this.muteToStatic && this.muteToStaticInvalidationCount == 0) {
                return;
            }
            int i = this.muteToStaticInvalidationCount;
            if (i != 0) {
                this.muteToStaticInvalidationCount = i - 1;
            }
            if (this.wavesEnter != 0.0f) {
                view.invalidate();
            }
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

    public ImageWithWavesView(Context context) {
        super(context);
        AvatarWavesDrawable avatarWavesDrawable = new AvatarWavesDrawable(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.avatarWavesDrawable = avatarWavesDrawable;
        avatarWavesDrawable.setAmplitude(3.0d);
        if (!avatarWavesDrawable.showWaves) {
            invalidate();
        }
        avatarWavesDrawable.showWaves = true;
        BackupImageView backupImageView = new BackupImageView(context);
        this.backupImageView = backupImageView;
        addView(backupImageView, LayoutHelper.createFrame(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.animatorSet = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ImageWithWavesView, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<ImageWithWavesView, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.animatorSet.setDuration(3000L);
        boolean zIsEnabled = LiteMode.isEnabled(512);
        this.allowAnimations = zIsEnabled;
        if (zIsEnabled) {
            this.animatorSet.start();
        }
        setClipChildren(false);
    }

    public final void onConnected() {
        if (this.isConnectedCalled) {
            return;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.isConnectedCalled = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.animatorSet = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<ImageWithWavesView, Float>) View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<ImageWithWavesView, Float>) View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.animatorSet.setDuration(400L);
        this.animatorSet.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.allowAnimations) {
            AvatarWavesDrawable avatarWavesDrawable = this.avatarWavesDrawable;
            avatarWavesDrawable.update();
            avatarWavesDrawable.draw(canvas, this, getWidth() / 2, getHeight() / 2);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.isMuted) {
            return;
        }
        AvatarWavesDrawable avatarWavesDrawable = this.avatarWavesDrawable;
        if (d > 1.5d) {
            avatarWavesDrawable.setAmplitude(d);
        } else {
            avatarWavesDrawable.setAmplitude(0.0d);
        }
    }

    public final void setMute(boolean z, boolean z2) {
        if (this.isMuted != z) {
            this.isMuted = z;
            AvatarWavesDrawable avatarWavesDrawable = this.avatarWavesDrawable;
            if (z) {
                avatarWavesDrawable.setAmplitude(3.0d);
            }
            if (avatarWavesDrawable.muteToStatic != z) {
                avatarWavesDrawable.muteToStatic = z;
                ValueAnimator valueAnimator = avatarWavesDrawable.animator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    avatarWavesDrawable.animator.cancel();
                }
                if (z) {
                    avatarWavesDrawable.animator = ValueAnimator.ofFloat(avatarWavesDrawable.muteToStaticProgress, 0.0f);
                    avatarWavesDrawable.muteToStaticInvalidationCount = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    avatarWavesDrawable.muteToStaticInvalidationCount = 0;
                    avatarWavesDrawable.animator = ValueAnimator.ofFloat(avatarWavesDrawable.muteToStaticProgress, 1.0f);
                }
                avatarWavesDrawable.animator.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(avatarWavesDrawable, 20));
                if (z2) {
                    avatarWavesDrawable.animator.setDuration(150L);
                } else {
                    avatarWavesDrawable.animator.setDuration(1000L);
                }
                avatarWavesDrawable.animator.start();
                invalidate();
            }
        }
    }

    public void setRoundRadius(int i) {
        this.backupImageView.setRoundRadius(i);
    }

    public void setShowWaves(boolean z) {
        AvatarWavesDrawable avatarWavesDrawable = this.avatarWavesDrawable;
        if (avatarWavesDrawable.showWaves != z) {
            invalidate();
        }
        avatarWavesDrawable.showWaves = z;
    }
}
