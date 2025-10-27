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
    private final RenderNode node;
    private float radius;
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

    public void update(float f, float f2, float f3, float f4, float f5, float f6) {
        int width;
        int height;
        RenderEffect createRuntimeShaderEffect;
        width = this.node.getWidth();
        float f7 = width;
        height = this.node.getHeight();
        float f8 = height;
        float f9 = (f + f3) / 2.0f;
        float f10 = (f2 + f4) / 2.0f;
        float f11 = f3 - f;
        float f12 = f4 - f2;
        if (Math.abs(this.resolutionX - f7) > 0.1f || Math.abs(this.resolutionY - f8) > 0.1f || Math.abs(this.centerX - f9) > 0.1f || Math.abs(this.centerY - f10) > 0.1f || Math.abs(this.sizeX - f11) > 0.1f || Math.abs(this.sizeY - f12) > 0.1f || Math.abs(this.radius - f5) > 0.1f || Math.abs(this.thickness - f6) > 0.1f) {
            RuntimeShader runtimeShader = this.shader;
            this.resolutionX = f7;
            this.resolutionY = f8;
            runtimeShader.setFloatUniform("resolution", f7, f8);
            RuntimeShader runtimeShader2 = this.shader;
            this.centerX = f9;
            this.centerY = f10;
            runtimeShader2.setFloatUniform("center", f9, f10);
            RuntimeShader runtimeShader3 = this.shader;
            this.sizeX = f11;
            this.sizeY = f12;
            runtimeShader3.setFloatUniform("size", f11, f12);
            RuntimeShader runtimeShader4 = this.shader;
            this.radius = f5;
            runtimeShader4.setFloatUniform("radius", f5);
            RuntimeShader runtimeShader5 = this.shader;
            this.thickness = f6;
            runtimeShader5.setFloatUniform("thickness", f6);
            RenderNode renderNode = this.node;
            createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(this.shader, "img");
            this.effect = createRuntimeShaderEffect;
            renderNode.setRenderEffect(createRuntimeShaderEffect);
        }
    }
}
