package org.telegram.ui.Components.blur3;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.MotionBackgroundPaint$RuntimeShaderState$$ExternalSyntheticApiModelOutline0;

public class LiquidGlassEffect {
    private float centerX;
    private float centerY;
    private RenderEffect effect;
    private int foregroundColor;
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
        this.node = renderNode;
        RuntimeShader runtimeShaderM = MotionBackgroundPaint$RuntimeShaderState$$ExternalSyntheticApiModelOutline0.m(AndroidUtilities.readRes(R.raw.liquid_glass_shader));
        this.shader = runtimeShaderM;
        RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShaderM, "img");
        this.effect = renderEffectCreateRuntimeShaderEffect;
        renderNode.setRenderEffect(renderEffectCreateRuntimeShaderEffect);
    }

    public void update(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i) {
        float f12;
        float f13;
        float f14;
        float f15;
        float width = this.node.getWidth();
        float height = this.node.getHeight();
        float f16 = (f + f3) / 2.0f;
        float f17 = (f2 + f4) / 2.0f;
        float f18 = f4 - f2;
        float f19 = (f3 - f) / 2.0f;
        float f20 = f18 / 2.0f;
        float f21 = f5 + f8;
        if (f21 > f18) {
            float f22 = f5 / f21;
            f12 = f18 * f22;
            f13 = (1.0f - f22) * f18;
        } else {
            f12 = f5;
            f13 = f8;
        }
        float f23 = f6 + f7;
        if (f23 > f18) {
            float f24 = f6 / f23;
            float f25 = f18 * f24;
            f15 = f18 * (1.0f - f24);
            f14 = f25;
        } else {
            f14 = f6;
            f15 = f7;
        }
        if (Math.abs(this.resolutionX - width) > 0.1f || Math.abs(this.resolutionY - height) > 0.1f || Math.abs(this.centerX - f16) > 0.1f || Math.abs(this.centerY - f17) > 0.1f || Math.abs(this.sizeX - f19) > 0.1f || Math.abs(this.sizeY - f20) > 0.1f || Math.abs(this.radiusLeftTop - f12) > 0.1f || Math.abs(this.radiusRightTop - f14) > 0.1f || Math.abs(this.radiusRightBottom - f15) > 0.1f || Math.abs(this.radiusLeftBottom - f13) > 0.1f || Math.abs(this.thickness - f9) > 0.1f || Math.abs(this.intensity - f10) > 0.1f || Math.abs(this.index - f11) > 0.1f || this.foregroundColor != i) {
            this.foregroundColor = i;
            float fAlpha = Color.alpha(i) / 255.0f;
            float fRed = (Color.red(i) / 255.0f) * fAlpha;
            float fGreen = (Color.green(i) / 255.0f) * fAlpha;
            float fBlue = (Color.blue(i) / 255.0f) * fAlpha;
            RuntimeShader runtimeShader = this.shader;
            this.resolutionX = width;
            this.resolutionY = height;
            runtimeShader.setFloatUniform("resolution", width, height);
            RuntimeShader runtimeShader2 = this.shader;
            this.centerX = f16;
            this.centerY = f17;
            runtimeShader2.setFloatUniform("center", f16, f17);
            RuntimeShader runtimeShader3 = this.shader;
            this.sizeX = f19;
            this.sizeY = f20;
            runtimeShader3.setFloatUniform("size", f19, f20);
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
            this.shader.setFloatUniform("foreground_color_premultiplied", fRed, fGreen, fBlue, fAlpha);
            RenderNode renderNode = this.node;
            RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(this.shader, "img");
            this.effect = renderEffectCreateRuntimeShaderEffect;
            renderNode.setRenderEffect(renderEffectCreateRuntimeShaderEffect);
        }
    }
}
