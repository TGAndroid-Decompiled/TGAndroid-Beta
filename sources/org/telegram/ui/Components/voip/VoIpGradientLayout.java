package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.MotionBackgroundDrawable;

public class VoIpGradientLayout extends FrameLayout {
    private boolean allowAnimations;
    private int alphaBlueGreen;
    private int alphaBlueViolet;
    private int alphaGreen;
    private int alphaOrangeRed;
    private final VoIPBackgroundProvider backgroundProvider;
    private ValueAnimator badConnectionAnimator;
    private final MotionBackgroundDrawable bgBlueGreen;
    private final MotionBackgroundDrawable bgBlueGreenDark;
    private final MotionBackgroundDrawable bgBlueGreenLight;
    private final MotionBackgroundDrawable bgBlueViolet;
    private final MotionBackgroundDrawable bgBlueVioletDark;
    private final MotionBackgroundDrawable bgBlueVioletLight;
    private final MotionBackgroundDrawable bgGreen;
    private final MotionBackgroundDrawable bgGreenDark;
    private final MotionBackgroundDrawable bgGreenDarkReveal;
    private final MotionBackgroundDrawable bgGreenLight;
    private final MotionBackgroundDrawable bgGreenLightReveal;
    private final MotionBackgroundDrawable bgOrangeRed;
    private final MotionBackgroundDrawable bgOrangeRedDark;
    private final MotionBackgroundDrawable bgOrangeRedLight;
    private ValueAnimator callingAnimator;
    private int clipCx;
    private int clipCy;
    private final Path clipPath;
    private float clipRadius;
    private AnimatorSet connectedAnimatorSet;
    private final AnimatorSet defaultAnimatorSet;
    private boolean isPaused;
    public volatile boolean lockDrawing;
    private boolean showClip;
    private GradientState state;

    public enum GradientState {
        CALLING,
        CONNECTED,
        BAD_CONNECTION
    }

    public VoIpGradientLayout(Context context, final VoIPBackgroundProvider voIPBackgroundProvider) {
        super(context);
        this.alphaBlueViolet = 0;
        this.alphaBlueGreen = 0;
        this.alphaGreen = 0;
        this.alphaOrangeRed = 0;
        this.clipRadius = 0.0f;
        this.showClip = false;
        this.clipPath = new Path();
        this.clipCx = 0;
        this.clipCy = 0;
        this.isPaused = false;
        this.lockDrawing = false;
        this.backgroundProvider = voIPBackgroundProvider;
        this.allowAnimations = LiteMode.isEnabled(512);
        this.bgBlueViolet = new MotionBackgroundDrawable(-4958504, -8304404, -14637865, -12612630, 0, false, true);
        this.bgBlueGreen = new MotionBackgroundDrawable(-12224791, -12879119, -16207709, -15226140, 0, false, true);
        this.bgGreen = new MotionBackgroundDrawable(-16275028, -16270749, -5649306, -10833593, 0, false, true);
        this.bgOrangeRed = new MotionBackgroundDrawable(-1545896, -1613425, -2387892, -2198984, 0, false, true);
        MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable(-5818672, -9819171, -15755831, -14124319, 0, false, true);
        this.bgBlueVioletDark = motionBackgroundDrawable;
        MotionBackgroundDrawable motionBackgroundDrawable2 = new MotionBackgroundDrawable(-13803306, -13866273, -16738923, -16608823, 0, false, true);
        this.bgBlueGreenDark = motionBackgroundDrawable2;
        MotionBackgroundDrawable motionBackgroundDrawable3 = new MotionBackgroundDrawable(-16741490, -16673972, -7357129, -13525721, 0, false, true);
        this.bgGreenDark = motionBackgroundDrawable3;
        MotionBackgroundDrawable motionBackgroundDrawable4 = new MotionBackgroundDrawable(-1949911, -1691537, -3705322, -2663914, 0, false, true);
        this.bgOrangeRedDark = motionBackgroundDrawable4;
        MotionBackgroundDrawable motionBackgroundDrawable5 = new MotionBackgroundDrawable(-2726657, -7186179, -13778695, -11034113, 0, false, true);
        this.bgBlueVioletLight = motionBackgroundDrawable5;
        MotionBackgroundDrawable motionBackgroundDrawable6 = new MotionBackgroundDrawable(-11170817, -10507265, -16458548, -14105857, 0, false, true);
        this.bgBlueGreenLight = motionBackgroundDrawable6;
        MotionBackgroundDrawable motionBackgroundDrawable7 = new MotionBackgroundDrawable(-16723243, -16129415, -3674272, -9578153, 0, false, true);
        this.bgGreenLight = motionBackgroundDrawable7;
        MotionBackgroundDrawable motionBackgroundDrawable8 = new MotionBackgroundDrawable(-34714, -32091, -85931, -29103, 0, false, true);
        this.bgOrangeRedLight = motionBackgroundDrawable8;
        this.bgGreenLightReveal = new MotionBackgroundDrawable(-16723243, -16129415, -3674272, -9578153, 0, false, true);
        this.bgGreenDarkReveal = new MotionBackgroundDrawable(-16741490, -16673972, -7357129, -13525721, 0, false, true);
        motionBackgroundDrawable.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable2.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable3.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable4.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable5.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable6.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable7.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable8.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.defaultAnimatorSet = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoIpGradientLayout.this.lambda$new$0(voIPBackgroundProvider, valueAnimator);
            }
        });
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofInt);
        animatorSet.setDuration(12000L);
        if (this.allowAnimations) {
            animatorSet.start();
        }
        switchToCalling();
    }

    public void lambda$hideBadConnection$6(ValueAnimator valueAnimator) {
        this.alphaOrangeRed = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
        this.backgroundProvider.invalidateViews();
    }

    public void lambda$new$0(VoIPBackgroundProvider voIPBackgroundProvider, ValueAnimator valueAnimator) {
        voIPBackgroundProvider.setDegree(((Integer) valueAnimator.getAnimatedValue()).intValue());
        int degree = voIPBackgroundProvider.getDegree();
        if (((degree < 0 || degree > 2) && (degree < 180 || degree > 182)) || !this.isPaused) {
            return;
        }
        this.defaultAnimatorSet.pause();
        AnimatorSet animatorSet = this.connectedAnimatorSet;
        if (animatorSet != null) {
            animatorSet.pause();
        }
    }

    public void lambda$showToBadConnection$5(ValueAnimator valueAnimator) {
        this.alphaOrangeRed = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
        this.backgroundProvider.invalidateViews();
    }

    public void lambda$switchToCallConnected$2(ValueAnimator valueAnimator) {
        this.clipRadius = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
        this.backgroundProvider.invalidateViews();
    }

    public void lambda$switchToCalling$1(ValueAnimator valueAnimator) {
        this.alphaBlueViolet = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    public void lambda$switchToConnectedAnimator$3(ValueAnimator valueAnimator) {
        this.alphaBlueGreen = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    public void lambda$switchToConnectedAnimator$4(ValueAnimator valueAnimator) {
        this.alphaBlueViolet = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    public void switchToConnectedAnimator() {
        if (this.connectedAnimatorSet != null) {
            return;
        }
        ValueAnimator valueAnimator = this.callingAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.callingAnimator.cancel();
            this.callingAnimator = null;
        }
        this.alphaGreen = 255;
        this.connectedAnimatorSet = new AnimatorSet();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255, 255, 0);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VoIpGradientLayout.this.lambda$switchToConnectedAnimator$3(valueAnimator2);
            }
        });
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VoIpGradientLayout.this.lambda$switchToConnectedAnimator$4(valueAnimator2);
            }
        });
        ofInt2.setRepeatCount(-1);
        ofInt2.setRepeatMode(1);
        this.connectedAnimatorSet.playTogether(ofInt2, ofInt);
        this.connectedAnimatorSet.setInterpolator(new LinearInterpolator());
        this.connectedAnimatorSet.setDuration(24000L);
        if (this.allowAnimations) {
            this.connectedAnimatorSet.start();
        } else {
            this.alphaBlueGreen = 0;
            this.alphaBlueViolet = 0;
        }
        invalidate();
    }

    public void hideBadConnection() {
        GradientState gradientState = this.state;
        GradientState gradientState2 = GradientState.CONNECTED;
        if (gradientState == gradientState2) {
            return;
        }
        this.state = gradientState2;
        switchToConnectedAnimator();
        ValueAnimator valueAnimator = this.badConnectionAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.badConnectionAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.alphaOrangeRed, 0);
        this.badConnectionAnimator = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VoIpGradientLayout.this.lambda$hideBadConnection$6(valueAnimator2);
            }
        });
        this.badConnectionAnimator.setDuration(500L);
        this.badConnectionAnimator.start();
    }

    public boolean isConnectedCalled() {
        GradientState gradientState = this.state;
        return gradientState == GradientState.CONNECTED || gradientState == GradientState.BAD_CONNECTION;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.defaultAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.connectedAnimatorSet;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.callingAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.lockDrawing) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.save();
        float sqrt = ((float) Math.sqrt((width * width) + (height * width))) / Math.min(height, width);
        canvas.scale(sqrt, sqrt, width, height);
        canvas.rotate(this.backgroundProvider.getDegree(), width, height);
        Canvas lightCanvas = this.backgroundProvider.getLightCanvas();
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        lightCanvas.drawColor(0, mode);
        this.backgroundProvider.getDarkCanvas().drawColor(0, mode);
        int i = this.alphaGreen;
        if (i != 0 && this.alphaOrangeRed != 255) {
            this.bgGreen.setAlpha(i);
            this.bgGreenLight.setAlpha(this.alphaGreen);
            this.bgGreenDark.setAlpha(this.alphaGreen);
            this.bgGreen.draw(canvas);
            this.bgGreenLight.draw(this.backgroundProvider.getLightCanvas());
            this.bgGreenDark.draw(this.backgroundProvider.getDarkCanvas());
        }
        int i2 = this.alphaBlueGreen;
        if (i2 != 0 && this.alphaOrangeRed != 255) {
            this.bgBlueGreen.setAlpha(i2);
            this.bgBlueGreenDark.setAlpha(this.alphaBlueGreen);
            this.bgBlueGreenLight.setAlpha(this.alphaBlueGreen);
            this.bgBlueGreen.draw(canvas);
            this.bgBlueGreenDark.draw(this.backgroundProvider.getDarkCanvas());
            this.bgBlueGreenLight.draw(this.backgroundProvider.getLightCanvas());
        }
        int i3 = this.alphaBlueViolet;
        if (i3 != 0 && this.alphaOrangeRed != 255) {
            this.bgBlueViolet.setAlpha(i3);
            this.bgBlueVioletDark.setAlpha(this.alphaBlueViolet);
            this.bgBlueVioletLight.setAlpha(this.alphaBlueViolet);
            this.bgBlueViolet.draw(canvas);
            this.bgBlueVioletDark.draw(this.backgroundProvider.getDarkCanvas());
            this.bgBlueVioletLight.draw(this.backgroundProvider.getLightCanvas());
        }
        int i4 = this.alphaOrangeRed;
        if (i4 != 0) {
            this.bgOrangeRed.setAlpha(i4);
            this.bgOrangeRedDark.setAlpha(this.alphaOrangeRed);
            this.bgOrangeRedLight.setAlpha(this.alphaOrangeRed);
            this.bgOrangeRed.draw(canvas);
            this.bgOrangeRedDark.draw(this.backgroundProvider.getDarkCanvas());
            this.bgOrangeRedLight.draw(this.backgroundProvider.getLightCanvas());
        }
        canvas.restore();
        if (this.showClip) {
            this.clipPath.rewind();
            Path path = this.clipPath;
            float f = this.clipCx;
            float f2 = this.clipCy;
            float f3 = this.clipRadius;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f, f2, f3, direction);
            canvas.clipPath(this.clipPath);
            Objects.requireNonNull(this.backgroundProvider);
            Objects.requireNonNull(this.backgroundProvider);
            canvas.scale(1.12f, 1.12f, width, height);
            this.bgGreen.setAlpha(255);
            this.bgGreen.draw(canvas);
            this.clipPath.rewind();
            this.clipPath.addCircle(this.clipCx / 4.0f, this.clipCy / 4.0f, this.clipRadius / 4.0f, direction);
            this.backgroundProvider.getRevealCanvas().drawColor(0, mode);
            this.backgroundProvider.getRevealCanvas().save();
            this.backgroundProvider.getRevealCanvas().clipPath(this.clipPath);
            this.bgGreenLightReveal.setAlpha(255);
            this.bgGreenLightReveal.draw(this.backgroundProvider.getRevealCanvas());
            this.backgroundProvider.getRevealCanvas().restore();
            this.backgroundProvider.getRevealDrakCanvas().drawColor(0, mode);
            this.backgroundProvider.getRevealDrakCanvas().save();
            this.backgroundProvider.getRevealDrakCanvas().clipPath(this.clipPath);
            this.bgGreenDarkReveal.setAlpha(255);
            this.bgGreenDarkReveal.draw(this.backgroundProvider.getRevealDrakCanvas());
            this.backgroundProvider.getRevealDrakCanvas().restore();
        }
        super.onDraw(canvas);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.bgGreen.setBounds(0, 0, getWidth(), getHeight());
        this.bgOrangeRed.setBounds(0, 0, getWidth(), getHeight());
        this.bgBlueGreen.setBounds(0, 0, getWidth(), getHeight());
        this.bgBlueViolet.setBounds(0, 0, getWidth(), getHeight());
        this.bgGreenLightReveal.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.bgGreenDarkReveal.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.backgroundProvider.setTotalSize(getWidth(), getHeight());
    }

    public void pause() {
        if (this.isPaused) {
            return;
        }
        this.isPaused = true;
    }

    public void resume() {
        if (this.isPaused) {
            this.isPaused = false;
            if (this.defaultAnimatorSet.isPaused()) {
                this.defaultAnimatorSet.resume();
            }
            AnimatorSet animatorSet = this.connectedAnimatorSet;
            if (animatorSet == null || !animatorSet.isPaused()) {
                return;
            }
            this.connectedAnimatorSet.resume();
        }
    }

    public void showToBadConnection() {
        GradientState gradientState = this.state;
        GradientState gradientState2 = GradientState.BAD_CONNECTION;
        if (gradientState == gradientState2) {
            return;
        }
        this.state = gradientState2;
        ValueAnimator ofInt = ValueAnimator.ofInt(this.alphaOrangeRed, 255);
        this.badConnectionAnimator = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoIpGradientLayout.this.lambda$showToBadConnection$5(valueAnimator);
            }
        });
        this.badConnectionAnimator.setDuration(500L);
        this.badConnectionAnimator.start();
    }

    public void switchToCallConnected(int i, int i2, boolean z) {
        GradientState gradientState = this.state;
        GradientState gradientState2 = GradientState.CONNECTED;
        if (gradientState == gradientState2 || gradientState == GradientState.BAD_CONNECTION) {
            return;
        }
        this.state = gradientState2;
        ValueAnimator valueAnimator = this.callingAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.callingAnimator.cancel();
            this.callingAnimator = null;
        }
        this.clipCx = i;
        this.clipCy = i2;
        Point point = AndroidUtilities.displaySize;
        int i3 = point.x - i;
        int i4 = i3 * i3;
        int i5 = ((point.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight) - i2;
        int i6 = i5 * i5;
        int i7 = i * i;
        int i8 = i2 * i2;
        double max = Math.max(Math.max(Math.max(Math.sqrt(i4 + i6), Math.sqrt(i6 + i7)), Math.sqrt(i7 + i8)), Math.sqrt(i4 + i8));
        this.showClip = true;
        this.backgroundProvider.setReveal(true);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VoIpGradientLayout.this.lambda$switchToCallConnected$2(valueAnimator2);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                VoIpGradientLayout.this.showClip = false;
                VoIpGradientLayout.this.backgroundProvider.setReveal(false);
                if (VoIpGradientLayout.this.allowAnimations && VoIpGradientLayout.this.defaultAnimatorSet != null) {
                    VoIpGradientLayout.this.defaultAnimatorSet.cancel();
                    VoIpGradientLayout.this.defaultAnimatorSet.start();
                }
                VoIpGradientLayout.this.switchToConnectedAnimator();
            }
        });
        ofFloat.setDuration(z ? 400L : 0L);
        ofFloat.start();
    }

    public void switchToCalling() {
        GradientState gradientState = this.state;
        GradientState gradientState2 = GradientState.CALLING;
        if (gradientState == gradientState2) {
            return;
        }
        this.state = gradientState2;
        this.alphaBlueGreen = 255;
        ValueAnimator ofInt = ValueAnimator.ofInt(255, 0, 255);
        this.callingAnimator = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoIpGradientLayout.this.lambda$switchToCalling$1(valueAnimator);
            }
        });
        this.callingAnimator.setRepeatCount(-1);
        this.callingAnimator.setRepeatMode(1);
        this.callingAnimator.setInterpolator(new LinearInterpolator());
        this.callingAnimator.setDuration(12000L);
        if (this.allowAnimations) {
            this.callingAnimator.start();
        }
    }
}
