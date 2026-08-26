package org.telegram.ui.Stars;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.credentials.Credential;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline0;

public final class SuperRipple extends Credential {
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

    public final class Effect {
        public final float cx;
        public final float cy;
        public final float intensity;
        public float t;

        public Effect(float f, float f2, float f3) {
            this.cx = f;
            this.cy = f2;
            this.intensity = f3;
        }
    }

    public SuperRipple(View view) {
        super(view);
        this.effects = new ArrayList();
        this.t = new float[7];
        this.centerX = new float[7];
        this.centerY = new float[7];
        this.intensity = new float[7];
        RuntimeShader runtimeShaderM = Theme$$ExternalSyntheticApiModelOutline0.m(AndroidUtilities.readRes(R.raw.superripple_effect));
        this.shader = runtimeShaderM;
        setupSizeUniforms(true);
        this.effect = RenderEffect.createRuntimeShaderEffect(runtimeShaderM, "img");
    }

    public final void setupSizeUniforms(boolean z) {
        View view = (View) this.data;
        if (z || this.width != view.getWidth() || this.height != view.getHeight() || Math.abs(this.density - AndroidUtilities.density) > 0.01f) {
            RuntimeShader runtimeShader = this.shader;
            int width = view.getWidth();
            this.width = width;
            int height = view.getHeight();
            this.height = height;
            runtimeShader.setFloatUniform("size", width, height);
            RuntimeShader runtimeShader2 = this.shader;
            float f = AndroidUtilities.density;
            this.density = f;
            runtimeShader2.setFloatUniform("density", f);
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            RoundedCorner roundedCorner = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(0);
            RoundedCorner roundedCorner2 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(1);
            RoundedCorner roundedCorner3 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner4 = rootWindowInsets != null ? rootWindowInsets.getRoundedCorner(2) : null;
            this.shader.setFloatUniform("radius", (roundedCorner4 == null || (view != view.getRootView() && AndroidUtilities.navigationBarHeight > 0)) ? 0.0f : roundedCorner4.getRadius(), roundedCorner2 == null ? 0.0f : roundedCorner2.getRadius(), (roundedCorner3 == null || (view != view.getRootView() && AndroidUtilities.navigationBarHeight > 0)) ? 0.0f : roundedCorner3.getRadius(), roundedCorner != null ? roundedCorner.getRadius() : 0.0f);
        }
    }

    public final void updateProperties() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        ArrayList arrayList = this.effects;
        boolean zIsEmpty = arrayList.isEmpty();
        View view = (View) this.data;
        boolean z = false;
        if (!zIsEmpty) {
            boolean z2 = true;
            boolean z3 = this.count != Math.min(7, arrayList.size());
            this.count = Math.min(7, arrayList.size());
            int i = 0;
            while (true) {
                int i2 = this.count;
                fArr = this.intensity;
                fArr2 = this.centerY;
                fArr3 = this.centerX;
                fArr4 = this.t;
                if (i >= i2) {
                    break;
                }
                Effect effect = (Effect) arrayList.get(i);
                boolean z4 = z3 || Math.abs(fArr4[i] - effect.t) > 0.001f;
                fArr4[i] = effect.t;
                float f = effect.cx;
                boolean z5 = z4 || Math.abs(fArr3[i] - f) > 0.001f;
                fArr3[i] = f;
                float f2 = effect.cy;
                boolean z6 = z5 || Math.abs(fArr2[i] - f2) > 0.001f;
                fArr2[i] = f2;
                float f3 = effect.intensity;
                z3 = z6 || Math.abs(fArr[i] - f3) > 0.001f;
                fArr[i] = f3;
                i++;
            }
            if (!z3 && this.width == view.getWidth() && this.height == view.getHeight() && Math.abs(this.density - AndroidUtilities.density) <= 0.01f) {
                z2 = false;
            }
            if (z2) {
                this.shader.setIntUniform("count", this.count);
                this.shader.setFloatUniform("t", fArr4);
                this.shader.setFloatUniform("centerX", fArr3);
                this.shader.setFloatUniform("centerY", fArr2);
                this.shader.setFloatUniform("intensity", fArr);
                setupSizeUniforms(false);
                this.effect = RenderEffect.createRuntimeShaderEffect(this.shader, "img");
            }
            z = z2;
        }
        view.setRenderEffect(arrayList.isEmpty() ? null : this.effect);
        if (z) {
            view.invalidate();
        }
    }
}
