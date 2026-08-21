package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import j$.util.Objects;
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
    private final Drawable bgBlueGreen;
    private final Drawable bgBlueGreenDark;
    private final Drawable bgBlueGreenLight;
    private final Drawable bgBlueViolet;
    private final Drawable bgBlueVioletDark;
    private final Drawable bgBlueVioletLight;
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

    private class PureColorDrawable extends Drawable {
        private final int color;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public PureColorDrawable(int i) {
            this.color = i;
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.drawColor(this.color);
        }
    }

    public VoIpGradientLayout(Context context, boolean z, final VoIPBackgroundProvider voIPBackgroundProvider) {
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
        this.bgBlueViolet = z ? new PureColorDrawable(-15130842) : new MotionBackgroundDrawable(-4958504, -8304404, -14637865, -12612630, 0, false, true);
        this.bgBlueGreen = z ? new PureColorDrawable(-15130842) : new MotionBackgroundDrawable(-12224791, -12879119, -16207709, -15226140, 0, false, true);
        this.bgGreen = new MotionBackgroundDrawable(-16275028, -16270749, -5649306, -10833593, 0, false, true);
        this.bgOrangeRed = new MotionBackgroundDrawable(-1545896, -1613425, -2387892, -2198984, 0, false, true);
        Drawable pureColorDrawable = z ? new PureColorDrawable(-15130842) : new MotionBackgroundDrawable(-5818672, -9819171, -15755831, -14124319, 0, false, true);
        this.bgBlueVioletDark = pureColorDrawable;
        Drawable pureColorDrawable2 = z ? new PureColorDrawable(-15130842) : new MotionBackgroundDrawable(-13803306, -13866273, -16738923, -16608823, 0, false, true);
        this.bgBlueGreenDark = pureColorDrawable2;
        MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable(-16741490, -16673972, -7357129, -13525721, 0, false, true);
        this.bgGreenDark = motionBackgroundDrawable;
        MotionBackgroundDrawable motionBackgroundDrawable2 = new MotionBackgroundDrawable(-1949911, -1691537, -3705322, -2663914, 0, false, true);
        this.bgOrangeRedDark = motionBackgroundDrawable2;
        Drawable pureColorDrawable3 = z ? new PureColorDrawable(-15130842) : new MotionBackgroundDrawable(-2726657, -7186179, -13778695, -11034113, 0, false, true);
        this.bgBlueVioletLight = pureColorDrawable3;
        Drawable pureColorDrawable4 = z ? new PureColorDrawable(-15130842) : new MotionBackgroundDrawable(-11170817, -10507265, -16458548, -14105857, 0, false, true);
        this.bgBlueGreenLight = pureColorDrawable4;
        MotionBackgroundDrawable motionBackgroundDrawable3 = new MotionBackgroundDrawable(-16723243, -16129415, -3674272, -9578153, 0, false, true);
        this.bgGreenLight = motionBackgroundDrawable3;
        MotionBackgroundDrawable motionBackgroundDrawable4 = new MotionBackgroundDrawable(-34714, -32091, -85931, -29103, 0, false, true);
        this.bgOrangeRedLight = motionBackgroundDrawable4;
        this.bgGreenLightReveal = new MotionBackgroundDrawable(-16723243, -16129415, -3674272, -9578153, 0, false, true);
        this.bgGreenDarkReveal = new MotionBackgroundDrawable(-16741490, -16673972, -7357129, -13525721, 0, false, true);
        pureColorDrawable.setBounds(0, 0, 80, 80);
        pureColorDrawable2.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable2.setBounds(0, 0, 80, 80);
        pureColorDrawable3.setBounds(0, 0, 80, 80);
        pureColorDrawable4.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable3.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable4.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.defaultAnimatorSet = animatorSet;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 360);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoIpGradientLayout.$r8$lambda$HQkk_DnxZ04zcOfBc3TAaWifPdM(this.f$0, voIPBackgroundProvider, valueAnimator);
            }
        });
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(valueAnimatorOfInt);
        animatorSet.setDuration(12000L);
        if (this.allowAnimations) {
            animatorSet.start();
        }
        switchToCalling();
    }

    public static void $r8$lambda$HQkk_DnxZ04zcOfBc3TAaWifPdM(VoIpGradientLayout voIpGradientLayout, VoIPBackgroundProvider voIPBackgroundProvider, ValueAnimator valueAnimator) {
        voIpGradientLayout.getClass();
        voIPBackgroundProvider.setDegree(((Integer) valueAnimator.getAnimatedValue()).intValue());
        int degree = voIPBackgroundProvider.getDegree();
        if (((degree < 0 || degree > 2) && (degree < 180 || degree > 182)) || !voIpGradientLayout.isPaused) {
            return;
        }
        voIpGradientLayout.defaultAnimatorSet.pause();
        AnimatorSet animatorSet = voIpGradientLayout.connectedAnimatorSet;
        if (animatorSet != null) {
            animatorSet.pause();
        }
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

    public void switchToCalling() {
        GradientState gradientState = this.state;
        GradientState gradientState2 = GradientState.CALLING;
        if (gradientState == gradientState2) {
            return;
        }
        this.state = gradientState2;
        this.alphaBlueGreen = 255;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0, 255);
        this.callingAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoIpGradientLayout.m3012$r8$lambda$NdAtpf0Wp0qwPG1r12koW7hMYs(this.f$0, valueAnimator);
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

    public static void m3012$r8$lambda$NdAtpf0Wp0qwPG1r12koW7hMYs(VoIpGradientLayout voIpGradientLayout, ValueAnimator valueAnimator) {
        voIpGradientLayout.getClass();
        voIpGradientLayout.alphaBlueViolet = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        voIpGradientLayout.invalidate();
    }

    public boolean isConnectedCalled() {
        GradientState gradientState = this.state;
        return gradientState == GradientState.CONNECTED || gradientState == GradientState.BAD_CONNECTION;
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
        double dMax = Math.max(Math.max(Math.max(Math.sqrt(i4 + i6), Math.sqrt(i6 + i7)), Math.sqrt(i7 + i8)), Math.sqrt(i4 + i8));
        this.showClip = true;
        this.backgroundProvider.setReveal(true);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (float) dMax);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VoIpGradientLayout.$r8$lambda$foitUgjB7vq3edwIu70VlbsCbkE(this.f$0, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
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
        valueAnimatorOfFloat.setDuration(z ? 400L : 0L);
        valueAnimatorOfFloat.start();
    }

    public static void $r8$lambda$foitUgjB7vq3edwIu70VlbsCbkE(VoIpGradientLayout voIpGradientLayout, ValueAnimator valueAnimator) {
        voIpGradientLayout.getClass();
        voIpGradientLayout.clipRadius = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        voIpGradientLayout.invalidate();
        voIpGradientLayout.backgroundProvider.invalidateViews();
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
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255, 255, 255, 0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VoIpGradientLayout.$r8$lambda$Lu6ZbXrhPf_0kjh3OVBIO1ARXco(this.f$0, valueAnimator2);
            }
        });
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(1);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VoIpGradientLayout.$r8$lambda$aA1m3nWKJtOaWmDC0ZePcZMDyb0(this.f$0, valueAnimator2);
            }
        });
        valueAnimatorOfInt2.setRepeatCount(-1);
        valueAnimatorOfInt2.setRepeatMode(1);
        this.connectedAnimatorSet.playTogether(valueAnimatorOfInt2, valueAnimatorOfInt);
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

    public static void $r8$lambda$Lu6ZbXrhPf_0kjh3OVBIO1ARXco(VoIpGradientLayout voIpGradientLayout, ValueAnimator valueAnimator) {
        voIpGradientLayout.getClass();
        voIpGradientLayout.alphaBlueGreen = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        voIpGradientLayout.invalidate();
    }

    public static void $r8$lambda$aA1m3nWKJtOaWmDC0ZePcZMDyb0(VoIpGradientLayout voIpGradientLayout, ValueAnimator valueAnimator) {
        voIpGradientLayout.getClass();
        voIpGradientLayout.alphaBlueViolet = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        voIpGradientLayout.invalidate();
    }

    public void showToBadConnection() {
        GradientState gradientState = this.state;
        GradientState gradientState2 = GradientState.BAD_CONNECTION;
        if (gradientState == gradientState2) {
            return;
        }
        this.state = gradientState2;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.alphaOrangeRed, 255);
        this.badConnectionAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoIpGradientLayout.$r8$lambda$kzDbnNgLrL54LmPLhYF2RfPahsg(this.f$0, valueAnimator);
            }
        });
        this.badConnectionAnimator.setDuration(500L);
        this.badConnectionAnimator.start();
    }

    public static void $r8$lambda$kzDbnNgLrL54LmPLhYF2RfPahsg(VoIpGradientLayout voIpGradientLayout, ValueAnimator valueAnimator) {
        voIpGradientLayout.getClass();
        voIpGradientLayout.alphaOrangeRed = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        voIpGradientLayout.invalidate();
        voIpGradientLayout.backgroundProvider.invalidateViews();
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
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.alphaOrangeRed, 0);
        this.badConnectionAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VoIpGradientLayout.$r8$lambda$qThKa9FOWGNYjCoHGarIUDPuE1k(this.f$0, valueAnimator2);
            }
        });
        this.badConnectionAnimator.setDuration(500L);
        this.badConnectionAnimator.start();
    }

    public static void $r8$lambda$qThKa9FOWGNYjCoHGarIUDPuE1k(VoIpGradientLayout voIpGradientLayout, ValueAnimator valueAnimator) {
        voIpGradientLayout.getClass();
        voIpGradientLayout.alphaOrangeRed = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        voIpGradientLayout.invalidate();
        voIpGradientLayout.backgroundProvider.invalidateViews();
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

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.lockDrawing) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.save();
        float fSqrt = ((float) Math.sqrt((width * width) + (height * width))) / Math.min(height, width);
        canvas.scale(fSqrt, fSqrt, width, height);
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
}
