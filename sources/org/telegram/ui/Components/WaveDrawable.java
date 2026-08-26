package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;

public class WaveDrawable {
    private static final float ANIMATION_SPEED_CIRCLE = 0.45f;
    private static final float ANIMATION_SPEED_WAVE_HUGE = 0.65f;
    private static final float ANIMATION_SPEED_WAVE_SMALL = 0.45f;
    public static final float CIRCLE_ALPHA_1 = 0.3f;
    public static final float CIRCLE_ALPHA_2 = 0.15f;
    public static final float FLING_DISTANCE = 0.5f;
    private static final float IDLE_RADIUS = 0.56f;
    private static final float IDLE_ROTATE_DIF = 0.020000001f;
    private static final float IDLE_ROTATION_SPEED = 0.2f;
    private static final float IDLE_SCALE_SPEED = 0.3f;
    private static final float IDLE_WAVE_ANGLE = 0.5f;
    public static final float MAX_AMPLITUDE = 1800.0f;
    private static final float RANDOM_RADIUS_SIZE = 0.3f;
    private static final float ROTATION_SPEED = 0.036000002f;
    public static final float SINE_WAVE_SPEED = 0.81f;
    public static final float SMALL_WAVE_RADIUS = 0.55f;
    public static final float SMALL_WAVE_SCALE = 0.4f;
    public static final float SMALL_WAVE_SCALE_SPEED = 0.6f;
    private static final float WAVE_ANGLE = 0.03f;
    private static final float animationSpeed = 0.35000002f;
    public static final float animationSpeedCircle = 0.55f;
    private static final float animationSpeedTiny = 0.55f;
    private float amplitude;
    public float amplitudeRadius;
    public float amplitudeWaveDif;
    private float animateAmplitudeDiff;
    private float animateAmplitudeSlowDiff;
    private float animateToAmplitude;
    private ValueAnimator animator;
    private final CircleBezierDrawable circleBezierDrawable;
    private float circleRadius;
    private boolean expandIdleRadius;
    private boolean expandScale;
    public float fling;
    private Animator flingAnimator;
    private float flingRadius;
    float idleRotation;
    private boolean incRandomAdditionals;
    private boolean isBig;
    float lastRadius;
    private long lastUpdateTime;
    public float maxScale;
    private View parentView;
    float radiusDiff;
    public float rotation;
    private float scaleDif;
    private float scaleIdleDif;
    private float sineAngleMax;
    private float slowAmplitude;
    private WaveDrawable tinyWaveDrawable;
    boolean wasFling;
    double waveAngle;
    float waveDif;
    private Paint paintRecordWaveBig = new Paint();
    private Paint paintRecordWaveTin = new Paint();
    private Interpolator linearInterpolator = new LinearInterpolator();
    private float idleRadius = 0.0f;
    private float idleRadiusK = 0.075f;
    private boolean isIdle = true;
    public float scaleSpeed = 8.0E-5f;
    public float scaleSpeedIdle = 6.0000002E-5f;
    float randomAdditions = AndroidUtilities.dp(8.0f) * 0.3f;
    private final ValueAnimator.AnimatorUpdateListener flingUpdateListener = new WaveDrawable$$ExternalSyntheticLambda1(this, 0);
    private float idleGlobalRadius = AndroidUtilities.dp(10.0f) * 0.56f;

    public WaveDrawable(View view, int i, float f, float f2, WaveDrawable waveDrawable) {
        this.parentView = view;
        this.circleBezierDrawable = new CircleBezierDrawable(i);
        this.amplitudeRadius = f2;
        boolean z = waveDrawable != null;
        this.isBig = z;
        this.tinyWaveDrawable = waveDrawable;
        this.expandIdleRadius = z;
        this.radiusDiff = AndroidUtilities.dp(34.0f) * 0.0012f;
        if (Build.VERSION.SDK_INT >= 26) {
            this.paintRecordWaveBig.setAntiAlias(true);
            this.paintRecordWaveTin.setAntiAlias(true);
        }
    }

    public void lambda$new$0(ValueAnimator valueAnimator) {
        this.flingRadius = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public void lambda$setValue$1(float f, float f2, float f3, float f4, float f5, float f6, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.rotation = DiffUtil.m(f2, f, fFloatValue, f);
        WaveDrawable waveDrawable = this.tinyWaveDrawable;
        waveDrawable.rotation = DiffUtil.m(f4, f3, fFloatValue, f3);
        this.waveDif = DiffUtil.m(f5, 1.0f, fFloatValue, 1.0f);
        waveDrawable.waveDif = DiffUtil.m(f6, 1.0f, fFloatValue, 1.0f);
        this.waveAngle = (float) Math.acos(this.waveDif);
        WaveDrawable waveDrawable2 = this.tinyWaveDrawable;
        waveDrawable2.waveAngle = (float) Math.acos(-waveDrawable2.waveDif);
    }

    private void startFling(float f) {
        if (LiteMode.isEnabled(512)) {
            Animator animator = this.flingAnimator;
            if (animator != null) {
                animator.cancel();
            }
            float f2 = this.fling * 2.0f;
            float fM = MediaController$$ExternalSyntheticOutline0.m(f * this.amplitudeRadius, this.isBig ? 8 : 20, 16.0f, f2);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.flingRadius, fM);
            valueAnimatorOfFloat.addUpdateListener(this.flingUpdateListener);
            valueAnimatorOfFloat.setDuration((long) ((this.isBig ? 200 : 350) * f2));
            valueAnimatorOfFloat.setInterpolator(this.linearInterpolator);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fM, 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(this.flingUpdateListener);
            valueAnimatorOfFloat2.setInterpolator(this.linearInterpolator);
            valueAnimatorOfFloat2.setDuration((long) ((this.isBig ? 220 : 380) * f2));
            AnimatorSet animatorSet = new AnimatorSet();
            this.flingAnimator = animatorSet;
            animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.start();
        }
    }

    public void draw(float f, float f2, float f3, Canvas canvas) {
        if (LiteMode.isEnabled(512)) {
            float f4 = this.amplitude;
            float f5 = f4 < 0.3f ? f4 / 0.3f : 1.0f;
            float fDp = (AndroidUtilities.dp(50.0f) * 0.03f * this.animateToAmplitude) + AndroidUtilities.dp(10.0f);
            CircleBezierDrawable circleBezierDrawable = this.circleBezierDrawable;
            float f6 = 1.0f - f5;
            circleBezierDrawable.idleStateDiff = this.idleRadius * f6;
            float f7 = 0.35f * f5 * this.waveDif;
            circleBezierDrawable.radiusDiff = fDp * f7;
            circleBezierDrawable.cubicBezierK = (this.idleRadiusK * f6) + (Math.abs(f7) * f5) + 1.0f;
            CircleBezierDrawable circleBezierDrawable2 = this.circleBezierDrawable;
            float f8 = (this.flingRadius * f5) + (this.amplitudeRadius * this.amplitude) + this.lastRadius + this.idleGlobalRadius;
            circleBezierDrawable2.radius = f8;
            float f9 = circleBezierDrawable2.radiusDiff + f8;
            float f10 = this.circleRadius;
            if (f9 < f10) {
                circleBezierDrawable2.radiusDiff = f10 - f8;
            }
            if (this.isBig) {
                circleBezierDrawable2.globalRotate = this.rotation + this.idleRotation;
            } else {
                circleBezierDrawable2.globalRotate = (-this.rotation) + this.idleRotation;
            }
            canvas.save();
            float f11 = (this.scaleDif * f5) + (this.scaleIdleDif * f6) + f3;
            canvas.scale(f11, f11, f, f2);
            this.circleBezierDrawable.setRandomAdditions(f5 * this.waveDif * this.randomAdditions);
            this.circleBezierDrawable.draw(f, f2, canvas, this.isBig ? this.paintRecordWaveBig : this.paintRecordWaveTin);
            canvas.restore();
        }
    }

    public void setCircleRadius(float f) {
        this.circleRadius = f;
    }

    public void setColor(int i, int i2) {
        this.paintRecordWaveBig.setColor(i);
        this.paintRecordWaveTin.setColor(i);
        this.paintRecordWaveBig.setAlpha(i2);
        this.paintRecordWaveTin.setAlpha(i2);
    }

    public void setValue(float f) {
        WaveDrawable waveDrawable;
        ValueAnimator valueAnimator;
        this.animateToAmplitude = f;
        boolean z = this.isBig;
        if (z) {
            float f2 = this.amplitude;
            if (f > f2) {
                this.animateAmplitudeDiff = (f - f2) / 205.0f;
            } else {
                this.animateAmplitudeDiff = (f - f2) / 275.0f;
            }
            this.animateAmplitudeSlowDiff = (f - this.slowAmplitude) / 275.0f;
        } else {
            float f3 = this.amplitude;
            if (f > f3) {
                this.animateAmplitudeDiff = (f - f3) / 320.0f;
            } else {
                this.animateAmplitudeDiff = (f - f3) / 375.0f;
            }
            this.animateAmplitudeSlowDiff = (f - this.slowAmplitude) / 375.0f;
        }
        boolean z2 = f < 0.1f;
        if (this.isIdle != z2 && z2 && z) {
            float f4 = this.rotation;
            float f5 = 60;
            float fRound = (Math.round(f4 / f5) * 60) + 30;
            float f6 = this.tinyWaveDrawable.rotation;
            float fRound2 = Math.round(f6 / f5) * 60;
            float f7 = this.waveDif;
            float f8 = this.tinyWaveDrawable.waveDif;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.animator = valueAnimatorOfFloat;
            waveDrawable = this;
            valueAnimatorOfFloat.addUpdateListener(new WaveDrawable$$ExternalSyntheticLambda0(waveDrawable, fRound, f4, fRound2, f6, f7, f8, 0));
            waveDrawable.animator.setDuration(1200L);
            waveDrawable.animator.start();
        } else {
            waveDrawable = this;
        }
        waveDrawable.isIdle = z2;
        if (z2 || (valueAnimator = waveDrawable.animator) == null) {
            return;
        }
        valueAnimator.cancel();
        waveDrawable.animator = null;
    }

    public void tick(float f) {
        if (LiteMode.isEnabled(512)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.lastUpdateTime;
            this.lastUpdateTime = jElapsedRealtime;
            if (j > 20) {
                j = 17;
            }
            float f2 = this.animateToAmplitude;
            float f3 = this.amplitude;
            if (f2 != f3) {
                float f4 = this.animateAmplitudeDiff;
                float f5 = (j * f4) + f3;
                this.amplitude = f5;
                if (f4 > 0.0f) {
                    if (f5 > f2) {
                        this.amplitude = f2;
                    }
                } else if (f5 < f2) {
                    this.amplitude = f2;
                }
                if (Math.abs(this.amplitude - f2) * this.amplitudeRadius >= AndroidUtilities.dp(4.0f)) {
                    this.wasFling = false;
                } else if (!this.wasFling) {
                    startFling(this.animateAmplitudeDiff);
                    this.wasFling = true;
                }
            }
            float f6 = this.animateToAmplitude;
            float f7 = this.slowAmplitude;
            if (f6 != f7) {
                float f8 = (this.animateAmplitudeSlowDiff * j) + f7;
                this.slowAmplitude = f8;
                if (Math.abs(f8 - this.amplitude) > 0.2f) {
                    float f9 = this.amplitude;
                    this.slowAmplitude = f9 + (this.slowAmplitude <= f9 ? -0.2f : 0.2f);
                }
                if (this.animateAmplitudeSlowDiff > 0.0f) {
                    float f10 = this.slowAmplitude;
                    float f11 = this.animateToAmplitude;
                    if (f10 > f11) {
                        this.slowAmplitude = f11;
                    }
                } else {
                    float f12 = this.slowAmplitude;
                    float f13 = this.animateToAmplitude;
                    if (f12 < f13) {
                        this.slowAmplitude = f13;
                    }
                }
            }
            this.idleRadius = this.idleRadiusK * f;
            if (this.expandIdleRadius) {
                float f14 = (this.scaleSpeedIdle * j) + this.scaleIdleDif;
                this.scaleIdleDif = f14;
                if (f14 >= 0.05f) {
                    this.scaleIdleDif = 0.05f;
                    this.expandIdleRadius = false;
                }
            } else {
                float f15 = this.scaleIdleDif - (this.scaleSpeedIdle * j);
                this.scaleIdleDif = f15;
                if (f15 < 0.0f) {
                    this.scaleIdleDif = 0.0f;
                    this.expandIdleRadius = true;
                }
            }
            float f16 = this.maxScale;
            if (f16 > 0.0f) {
                if (this.expandScale) {
                    float f17 = (this.scaleSpeed * j) + this.scaleDif;
                    this.scaleDif = f17;
                    if (f17 >= f16) {
                        this.scaleDif = f16;
                        this.expandScale = false;
                    }
                } else {
                    float f18 = this.scaleDif - (this.scaleSpeed * j);
                    this.scaleDif = f18;
                    if (f18 < 0.0f) {
                        this.scaleDif = 0.0f;
                        this.expandScale = true;
                    }
                }
            }
            float f19 = this.sineAngleMax;
            float f20 = this.animateToAmplitude;
            if (f19 > f20) {
                float f21 = f19 - 0.25f;
                this.sineAngleMax = f21;
                if (f21 < f20) {
                    this.sineAngleMax = f20;
                }
            } else if (f19 < f20) {
                float f22 = f19 + 0.25f;
                this.sineAngleMax = f22;
                if (f22 > f20) {
                    this.sineAngleMax = f20;
                }
            }
            boolean z = this.isIdle;
            if (z) {
                float f23 = (j * 0.020000001f) + this.idleRotation;
                this.idleRotation = f23;
                if (f23 > 360.0f) {
                    this.idleRotation = f23 % 360.0f;
                }
            } else {
                float f24 = this.rotation;
                float f25 = this.amplitude;
                float f26 = ((((f25 > 0.5f ? 1.0f : f25 / 0.5f) * 0.14400001f) + 0.018000001f) * j) + f24;
                this.rotation = f26;
                if (f26 > 360.0f) {
                    this.rotation = f26 % 360.0f;
                }
            }
            float f27 = this.lastRadius;
            if (f27 < f) {
                this.lastRadius = f;
            } else {
                float f28 = f27 - (this.radiusDiff * j);
                this.lastRadius = f28;
                if (f28 < f) {
                    this.lastRadius = f;
                }
            }
            this.lastRadius = f;
            if (!z) {
                double d = this.waveAngle + ((double) (this.amplitudeWaveDif * this.sineAngleMax * j));
                this.waveAngle = d;
                if (this.isBig) {
                    this.waveDif = (float) Math.cos(d);
                } else {
                    this.waveDif = -((float) Math.cos(d));
                }
                float f29 = this.waveDif;
                if (f29 > 0.0f && this.incRandomAdditionals) {
                    this.circleBezierDrawable.calculateRandomAdditionals();
                    this.incRandomAdditionals = false;
                } else if (f29 < 0.0f && !this.incRandomAdditionals) {
                    this.circleBezierDrawable.calculateRandomAdditionals();
                    this.incRandomAdditionals = true;
                }
            }
            this.parentView.invalidate();
        }
    }
}
