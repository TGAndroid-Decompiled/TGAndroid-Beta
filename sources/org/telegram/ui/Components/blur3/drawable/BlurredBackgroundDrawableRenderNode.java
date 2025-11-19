package org.telegram.ui.Components.blur3.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.ui.Components.blur3.LiquidGlassEffect;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;

public class BlurredBackgroundDrawableRenderNode extends BlurredBackgroundDrawable {
    private LiquidGlassEffect liquidGlassEffect;
    private final Outline outline = new Outline();
    private final Rect outlineRect = new Rect();
    private final Paint paintFill;
    private final Paint paintShadow;
    private final Paint paintStrokeBottom;
    private final Paint paintStrokeTop;
    private final RenderNode renderNode;
    private final RenderNode renderNodeFill;
    private boolean renderNodeInvalidated;
    private final RenderNode renderNodeStroke;
    private final BlurredBackgroundSourceRenderNode source;

    public BlurredBackgroundDrawableRenderNode(BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode) {
        Paint paint = new Paint(1);
        this.paintShadow = paint;
        this.paintFill = new Paint(1);
        Paint paint2 = new Paint(1);
        this.paintStrokeTop = paint2;
        Paint paint3 = new Paint(1);
        this.paintStrokeBottom = paint3;
        RenderNode m = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("BlurredBackgroundDrawableRenderNode");
        this.renderNode = m;
        this.renderNodeFill = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("BlurredBackgroundDrawableRenderNode.Fill");
        this.renderNodeStroke = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("BlurredBackgroundDrawableRenderNode.Stroke");
        m.setClipToOutline(true);
        m.setClipToBounds(true);
        this.source = blurredBackgroundSourceRenderNode;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    public void setLiquidGlassEffectAllowed() {
        this.liquidGlassEffect = new LiquidGlassEffect(this.renderNodeFill);
    }

    @Override
    public BlurredBackgroundSource getSource() {
        return this.source;
    }

    @Override
    public void onBoundPropsChanged() {
        super.onBoundPropsChanged();
        this.paintStrokeTop.setStrokeWidth(this.boundProps.strokeWidthTop);
        this.paintStrokeBottom.setStrokeWidth(this.boundProps.strokeWidthBottom);
        this.outlineRect.set(0, 0, this.boundProps.boundsWithPadding.width(), this.boundProps.boundsWithPadding.height());
        BlurredBackgroundDrawable.getOutline(this.outline, this.outlineRect, this.boundProps.radii);
        this.outline.setAlpha(1.0f);
        if (this.boundProps.boundsWithPadding.isEmpty()) {
            return;
        }
        this.renderNodeFill.setPosition(0, 0, this.boundProps.boundsWithPadding.width(), this.boundProps.boundsWithPadding.height());
        this.renderNodeStroke.setPosition(0, 0, this.boundProps.boundsWithPadding.width(), this.boundProps.boundsWithPadding.height());
        this.renderNode.setPosition(0, 0, this.boundProps.boundsWithPadding.width(), this.boundProps.boundsWithPadding.height());
        this.renderNode.setOutline(this.outline);
        this.renderNodeInvalidated = true;
    }

    @Override
    public void onSourceOffsetChange(float f, float f2) {
        super.onSourceOffsetChange(f, f2);
        this.renderNodeInvalidated = true;
    }

    public boolean hasDisplayList() {
        boolean hasDisplayList;
        hasDisplayList = this.renderNode.hasDisplayList();
        return hasDisplayList;
    }

    private void updateDisplayList() {
        RecordingCanvas beginRecording;
        RecordingCanvas beginRecording2;
        RecordingCanvas beginRecording3;
        float f = this.sourceOffsetX;
        float f2 = this.sourceOffsetY;
        beginRecording = this.renderNodeFill.beginRecording();
        beginRecording.save();
        Rect rect = this.boundProps.boundsWithPadding;
        beginRecording.translate(-(rect.left + f), -(rect.top + f2));
        LiquidGlassEffect liquidGlassEffect = this.liquidGlassEffect;
        if (liquidGlassEffect != null && Build.VERSION.SDK_INT >= 33) {
            float width = this.boundProps.boundsWithPadding.width();
            float height = this.boundProps.boundsWithPadding.height();
            BlurredBackgroundDrawable.Props props = this.boundProps;
            float[] fArr = props.shaderRadii;
            float f3 = fArr[0];
            float f4 = fArr[2];
            float f5 = fArr[4];
            float f6 = fArr[6];
            int i = props.liquidThickness;
            if (i <= 0) {
                i = AndroidUtilities.dp(11.0f);
            }
            float f7 = i;
            BlurredBackgroundDrawable.Props props2 = this.boundProps;
            liquidGlassEffect.update(0.0f, 0.0f, width, height, f3, f4, f5, f6, f7, props2.liquidIntensity, props2.liquidIndex, this.backgroundColor);
        }
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = this.source;
        Rect rect2 = this.boundProps.boundsWithPadding;
        blurredBackgroundSourceRenderNode.draw(beginRecording, rect2.left + f, rect2.top + f2, rect2.right + f, rect2.bottom + f2);
        beginRecording.restore();
        this.renderNodeFill.endRecording();
        boolean z = (this.strokeColorTop == 0 && this.strokeColorBottom == 0) ? false : true;
        if (z) {
            beginRecording3 = this.renderNodeStroke.beginRecording();
            if (this.strokeColorTop != 0) {
                float width2 = this.boundProps.boundsWithPadding.width();
                float height2 = this.boundProps.boundsWithPadding.height();
                BlurredBackgroundDrawable.Props props3 = this.boundProps;
                BlurredBackgroundDrawable.drawStroke((Canvas) beginRecording3, 0.0f, 0.0f, width2, height2, props3.radii, props3.strokeWidthTop, true, this.paintStrokeTop);
            }
            if (this.strokeColorBottom != 0) {
                float width3 = this.boundProps.boundsWithPadding.width();
                float height3 = this.boundProps.boundsWithPadding.height();
                BlurredBackgroundDrawable.Props props4 = this.boundProps;
                BlurredBackgroundDrawable.drawStroke((Canvas) beginRecording3, 0.0f, 0.0f, width3, height3, props4.radii, props4.strokeWidthBottom, false, this.paintStrokeBottom);
            }
            this.renderNodeStroke.endRecording();
        }
        beginRecording2 = this.renderNode.beginRecording();
        beginRecording2.drawRenderNode(this.renderNodeFill);
        if (this.liquidGlassEffect == null && Color.alpha(this.backgroundColor) != 0) {
            beginRecording2.drawPaint(this.paintFill);
        }
        if (z) {
            beginRecording2.drawRenderNode(this.renderNodeStroke);
        }
        this.renderNode.endRecording();
    }

    @Override
    public void updateColors() {
        super.updateColors();
        this.paintShadow.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33333334f), this.shadowColor);
        this.paintFill.setColor(this.backgroundColor);
        this.paintStrokeTop.setColor(this.strokeColorTop);
        this.paintStrokeBottom.setColor(this.strokeColorBottom);
        this.renderNodeInvalidated = true;
    }

    @Override
    public void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableRenderNode.draw(android.graphics.Canvas):void");
    }

    @Override
    public void setAlpha(int i) {
        super.setAlpha(i);
        this.renderNode.setAlpha(i / 255.0f);
        this.renderNodeInvalidated = true;
    }
}
