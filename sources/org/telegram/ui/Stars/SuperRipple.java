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
import org.telegram.ui.Components.RLottieDrawable;
public class SuperRipple extends ISuperRipple {
    public final float[] centerX;
    public final float[] centerY;
    public int count;
    public RenderEffect effect;
    public final ArrayList<Effect> effects;
    public final float[] intensity;
    public final RuntimeShader shader;
    public final float[] t;

    public static class Effect {
        public final float cx;
        public final float cy;
        public final float intensity;
        public float t;

        private Effect(float f, float f2, float f3, ValueAnimator valueAnimator) {
            this.cx = f;
            this.cy = f2;
            this.intensity = f3;
        }
    }

    public SuperRipple(View view) {
        super(view);
        this.effects = new ArrayList<>();
        this.t = new float[10];
        this.centerX = new float[10];
        this.centerY = new float[10];
        this.intensity = new float[10];
        RuntimeShader runtimeShader = new RuntimeShader(RLottieDrawable.readRes(null, R.raw.superripple_effect));
        this.shader = runtimeShader;
        runtimeShader.setFloatUniform("size", view.getWidth(), view.getHeight());
        runtimeShader.setFloatUniform("density", AndroidUtilities.density);
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        RoundedCorner roundedCorner = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(0);
        RoundedCorner roundedCorner2 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(1);
        RoundedCorner roundedCorner3 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(3);
        RoundedCorner roundedCorner4 = rootWindowInsets != null ? rootWindowInsets.getRoundedCorner(2) : null;
        runtimeShader.setFloatUniform("radius", (roundedCorner4 == null || (view != view.getRootView() && AndroidUtilities.navigationBarHeight > 0)) ? 0.0f : roundedCorner4.getRadius(), roundedCorner2 == null ? 0.0f : roundedCorner2.getRadius(), (roundedCorner3 == null || (view != view.getRootView() && AndroidUtilities.navigationBarHeight > 0)) ? 0.0f : roundedCorner3.getRadius(), roundedCorner == null ? 0.0f : roundedCorner.getRadius());
        this.effect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
    }

    @Override
    public void animate(float f, float f2, float f3) {
        if (this.effects.size() >= 10) {
            return;
        }
        float max = (Math.max(Math.max(MathUtils.distance(0.0f, 0.0f, f, f2), MathUtils.distance(this.view.getWidth(), 0.0f, f, f2)), Math.max(MathUtils.distance(0.0f, this.view.getHeight(), f, f2), MathUtils.distance(this.view.getWidth(), this.view.getHeight(), f, f2))) * 2.0f) / (AndroidUtilities.density * 1200.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
        final Effect effect = new Effect(f, f2, f3, ofFloat);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SuperRipple.this.lambda$animate$0(effect, valueAnimator);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SuperRipple.this.effects.remove(effect);
                SuperRipple.this.updateProperties();
            }
        });
        ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        ofFloat.setDuration(max * 1000.0f);
        this.effects.add(effect);
        updateProperties();
        ofFloat.start();
    }

    public void lambda$animate$0(Effect effect, ValueAnimator valueAnimator) {
        effect.t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateProperties();
    }

    public void updateProperties() {
        int i;
        boolean z = false;
        if (!this.effects.isEmpty()) {
            boolean z2 = this.count != Math.min(10, this.effects.size());
            this.count = Math.min(10, this.effects.size());
            int i2 = 0;
            while (true) {
                i = this.count;
                if (i2 >= i) {
                    break;
                }
                Effect effect = this.effects.get(i2);
                boolean z3 = z2 || Math.abs(this.t[i2] - effect.t) > 0.001f;
                this.t[i2] = effect.t;
                boolean z4 = z3 || Math.abs(this.centerX[i2] - effect.cx) > 0.001f;
                this.centerX[i2] = effect.cx;
                boolean z5 = z4 || Math.abs(this.centerY[i2] - effect.cy) > 0.001f;
                this.centerY[i2] = effect.cy;
                z2 = z5 || Math.abs(this.intensity[i2] - effect.intensity) > 0.001f;
                this.intensity[i2] = effect.intensity;
                i2++;
            }
            if (z2) {
                this.shader.setIntUniform("count", i);
                this.shader.setFloatUniform("t", this.t);
                this.shader.setFloatUniform("centerX", this.centerX);
                this.shader.setFloatUniform("centerY", this.centerY);
                this.shader.setFloatUniform("intensity", this.intensity);
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
