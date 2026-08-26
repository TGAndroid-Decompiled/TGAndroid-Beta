package org.telegram.ui.Components.blur3;

import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline0;

public final class LiquidGlassEffect {
    public float centerX;
    public float centerY;
    public int foregroundColor;
    public float index;
    public float intensity;
    public final RenderNode node;
    public float radiusLeftBottom;
    public float radiusLeftTop;
    public float radiusRightBottom;
    public float radiusRightTop;
    public float resolutionX;
    public float resolutionY;
    public final RuntimeShader shader;
    public float sizeX;
    public float sizeY;
    public float thickness;

    public LiquidGlassEffect(RenderNode renderNode) {
        this.node = renderNode;
        RuntimeShader runtimeShaderM = Theme$$ExternalSyntheticApiModelOutline0.m(AndroidUtilities.readRes(R.raw.liquid_glass_shader));
        this.shader = runtimeShaderM;
        renderNode.setRenderEffect(RenderEffect.createRuntimeShaderEffect(runtimeShaderM, "img"));
    }
}
