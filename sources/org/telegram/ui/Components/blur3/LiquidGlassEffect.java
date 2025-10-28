package org.telegram.ui.Components.blur3;

import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public class LiquidGlassEffect {
    private float centerX;
    private float centerY;
    private RenderEffect effect;
    private float index;
    private float intensity;
    private final RenderNode node;
    private float radiusLeftBottom;
    private float radiusLeftTop;
    private float radiusRightBottom;
    private float radiusRightTop;
    private float resolutionX;
    private float resolutionY;
    private final RuntimeShader shader;
    private float sizeX;
    private float sizeY;
    private float thickness;

    public LiquidGlassEffect(RenderNode renderNode) {
        RenderEffect createRuntimeShaderEffect;
        this.node = renderNode;
        RuntimeShader m = LiquidGlassEffect$$ExternalSyntheticApiModelOutline0.m(AndroidUtilities.readRes(R.raw.liquid_glass_shader));
        this.shader = m;
        createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(m, "img");
        this.effect = createRuntimeShaderEffect;
        renderNode.setRenderEffect(createRuntimeShaderEffect);
    }

    public void update(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        int width;
        int height;
        float f12;
        float f13;
        float f14;
        float f15;
        RenderEffect createRuntimeShaderEffect;
        width = this.node.getWidth();
        float f16 = width;
        height = this.node.getHeight();
        float f17 = height;
        float f18 = (f + f3) / 2.0f;
        float f19 = (f2 + f4) / 2.0f;
        float f20 = f4 - f2;
        float f21 = (f3 - f) / 2.0f;
        float f22 = f20 / 2.0f;
        float f23 = f5 + f8;
        if (f23 > f20) {
            float f24 = f5 / f23;
            f12 = f20 * f24;
            f13 = (1.0f - f24) * f20;
        } else {
            f12 = f5;
            f13 = f8;
        }
        float f25 = f6 + f7;
        if (f25 > f20) {
            float f26 = f6 / f25;
            f14 = f20 * f26;
            f15 = f20 * (1.0f - f26);
        } else {
            f14 = f6;
            f15 = f7;
        }
        if (Math.abs(this.resolutionX - f16) > 0.1f || Math.abs(this.resolutionY - f17) > 0.1f || Math.abs(this.centerX - f18) > 0.1f || Math.abs(this.centerY - f19) > 0.1f || Math.abs(this.sizeX - f21) > 0.1f || Math.abs(this.sizeY - f22) > 0.1f || Math.abs(this.radiusLeftTop - f12) > 0.1f || Math.abs(this.radiusRightTop - f14) > 0.1f || Math.abs(this.radiusRightBottom - f15) > 0.1f || Math.abs(this.radiusLeftBottom - f13) > 0.1f || Math.abs(this.thickness - f9) > 0.1f || Math.abs(this.intensity - f10) > 0.1f || Math.abs(this.index - f11) > 0.1f) {
            RuntimeShader runtimeShader = this.shader;
            this.resolutionX = f16;
            this.resolutionY = f17;
            runtimeShader.setFloatUniform("resolution", f16, f17);
            RuntimeShader runtimeShader2 = this.shader;
            this.centerX = f18;
            this.centerY = f19;
            runtimeShader2.setFloatUniform("center", f18, f19);
            RuntimeShader runtimeShader3 = this.shader;
            this.sizeX = f21;
            this.sizeY = f22;
            runtimeShader3.setFloatUniform("size", f21, f22);
            RuntimeShader runtimeShader4 = this.shader;
            this.radiusRightBottom = f15;
            this.radiusRightTop = f14;
            this.radiusLeftBottom = f13;
            this.radiusLeftTop = f12;
            runtimeShader4.setFloatUniform("radius", f15, f14, f13, f12);
            RuntimeShader runtimeShader5 = this.shader;
            this.thickness = f9;
            runtimeShader5.setFloatUniform("thickness", f9);
            RuntimeShader runtimeShader6 = this.shader;
            this.intensity = f10;
            runtimeShader6.setFloatUniform("refract_intensity", f10);
            RuntimeShader runtimeShader7 = this.shader;
            this.index = f11;
            runtimeShader7.setFloatUniform("refract_index", f11);
            RenderNode renderNode = this.node;
            createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(this.shader, "img");
            this.effect = createRuntimeShaderEffect;
            renderNode.setRenderEffect(createRuntimeShaderEffect);
        }
    }
}
