package org.telegram.ui.Stars;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.MotionBackgroundPaint$AgslImpl$RuntimeShaderState$$ExternalSyntheticApiModelOutline0;

public class SuperRipple extends ISuperRipple {
    public final int MAX_COUNT;
    public final float[] centerX;
    public final float[] centerY;
    public int count;
    public float density;
    public RenderEffect effect;
    public final ArrayList effects;
    public int height;
    public final float[] intensity;
    public final RuntimeShader shader;
    public final float[] t;
    public int width;

    public static class Effect {
        public final ValueAnimator animator;
        public final float cx;
        public final float cy;
        public final float intensity;
        public float t;

        private Effect(float f, float f2, float f3, ValueAnimator valueAnimator) {
            this.cx = f;
            this.cy = f2;
            this.intensity = f3;
            this.animator = valueAnimator;
        }
    }

    public SuperRipple(View view) {
        super(view);
        this.effects = new ArrayList();
        this.MAX_COUNT = 7;
        this.t = new float[7];
        this.centerX = new float[7];
        this.centerY = new float[7];
        this.intensity = new float[7];
        RuntimeShader runtimeShaderM = MotionBackgroundPaint$AgslImpl$RuntimeShaderState$$ExternalSyntheticApiModelOutline0.m(AndroidUtilities.readRes(R.raw.superripple_effect));
        this.shader = runtimeShaderM;
        setupSizeUniforms(true);
        this.effect = RenderEffect.createRuntimeShaderEffect(runtimeShaderM, "img");
    }

    private void setupSizeUniforms(boolean z) {
        float radius;
        float radius2;
        if (z || this.width != this.view.getWidth() || this.height != this.view.getHeight() || Math.abs(this.density - AndroidUtilities.density) > 0.01f) {
            RuntimeShader runtimeShader = this.shader;
            int width = this.view.getWidth();
            this.width = width;
            int height = this.view.getHeight();
            this.height = height;
            runtimeShader.setFloatUniform("size", width, height);
            RuntimeShader runtimeShader2 = this.shader;
            float f = AndroidUtilities.density;
            this.density = f;
            runtimeShader2.setFloatUniform("density", f);
            WindowInsets rootWindowInsets = this.view.getRootWindowInsets();
            RoundedCorner roundedCorner = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(0);
            RoundedCorner roundedCorner2 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(1);
            RoundedCorner roundedCorner3 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner4 = rootWindowInsets != null ? rootWindowInsets.getRoundedCorner(2) : null;
            RuntimeShader runtimeShader3 = this.shader;
            if (roundedCorner4 != null) {
                View view = this.view;
                if (view == view.getRootView() || AndroidUtilities.navigationBarHeight <= 0) {
                    radius = roundedCorner4.getRadius();
                } else {
                    radius = 0.0f;
                }
            } else {
                radius = 0.0f;
            }
            float radius3 = roundedCorner2 == null ? 0.0f : roundedCorner2.getRadius();
            if (roundedCorner3 != null) {
                View view2 = this.view;
                if (view2 == view2.getRootView() || AndroidUtilities.navigationBarHeight <= 0) {
                    radius2 = roundedCorner3.getRadius();
                } else {
                    radius2 = 0.0f;
                }
            } else {
                radius2 = 0.0f;
            }
            runtimeShader3.setFloatUniform("radius", radius, radius3, radius2, roundedCorner == null ? 0.0f : roundedCorner.getRadius());
        }
    }

    @Override
    public void animate(float f, float f2, float f3) {
        if (this.effects.size() >= 7) {
            return;
        }
        float fMax = (Math.max(Math.max(MathUtils.distance(0.0f, 0.0f, f, f2), MathUtils.distance(this.view.getWidth(), 0.0f, f, f2)), Math.max(MathUtils.distance(0.0f, this.view.getHeight(), f, f2), MathUtils.distance(this.view.getWidth(), this.view.getHeight(), f, f2))) * 2.0f) / (AndroidUtilities.density * 1200.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, fMax);
        final Effect effect = new Effect(f, f2, f3, valueAnimatorOfFloat);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SuperRipple.m4288$r8$lambda$eNVcrL0I2Sm2OIqbhzsSR7aUI8(this.f$0, effect, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SuperRipple.this.effects.remove(effect);
                SuperRipple.this.updateProperties();
            }
        });
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        valueAnimatorOfFloat.setDuration((long) (fMax * 1000.0f));
        this.effects.add(effect);
        updateProperties();
        valueAnimatorOfFloat.start();
    }

    public static void m4288$r8$lambda$eNVcrL0I2Sm2OIqbhzsSR7aUI8(SuperRipple superRipple, Effect effect, ValueAnimator valueAnimator) {
        superRipple.getClass();
        effect.t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        superRipple.updateProperties();
    }

    public void updateProperties() {
        boolean z = false;
        if (!this.effects.isEmpty()) {
            boolean z2 = true;
            boolean z3 = this.count != Math.min(7, this.effects.size());
            this.count = Math.min(7, this.effects.size());
            for (int i = 0; i < this.count; i++) {
                Effect effect = (Effect) this.effects.get(i);
                boolean z4 = z3 || Math.abs(this.t[i] - effect.t) > 0.001f;
                this.t[i] = effect.t;
                boolean z5 = z4 || Math.abs(this.centerX[i] - effect.cx) > 0.001f;
                this.centerX[i] = effect.cx;
                boolean z6 = z5 || Math.abs(this.centerY[i] - effect.cy) > 0.001f;
                this.centerY[i] = effect.cy;
                z3 = z6 || Math.abs(this.intensity[i] - effect.intensity) > 0.001f;
                this.intensity[i] = effect.intensity;
            }
            if (!z3 && this.width == this.view.getWidth() && this.height == this.view.getHeight() && Math.abs(this.density - AndroidUtilities.density) <= 0.01f) {
                z2 = false;
            }
            if (z2) {
                this.shader.setIntUniform("count", this.count);
                this.shader.setFloatUniform("t", this.t);
                this.shader.setFloatUniform("centerX", this.centerX);
                this.shader.setFloatUniform("centerY", this.centerY);
                this.shader.setFloatUniform("intensity", this.intensity);
                setupSizeUniforms(false);
                this.effect = RenderEffect.createRuntimeShaderEffect(this.shader, "img");
            }
            z = z2;
        }
        this.view.setRenderEffect(this.effects.isEmpty() ? null : this.effect);
        if (z) {
            this.view.invalidate();
        }
    }
}
