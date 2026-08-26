package org.telegram.ui.Components.blur3.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.LiquidGlassEffect;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticApiModelOutline3;

public final class BlurredBackgroundDrawableRenderNode extends BlurredBackgroundDrawable {
    public LiquidGlassEffect liquidGlassEffect;
    public final Outline outline = new Outline();
    public final Rect outlineRect = new Rect();
    public final Paint paintShadow;
    public final Paint paintStrokeBottom;
    public final Paint paintStrokeTop;
    public final RenderNode renderNode;
    public final RenderNode renderNodeFill;
    public boolean renderNodeInvalidated;
    public final BlurredBackgroundSource source;

    public BlurredBackgroundDrawableRenderNode(BlurredBackgroundSource blurredBackgroundSource) {
        Paint paint = new Paint(1);
        this.paintShadow = paint;
        Paint paint2 = new Paint(1);
        this.paintStrokeTop = paint2;
        Paint paint3 = new Paint(1);
        this.paintStrokeBottom = paint3;
        RenderNode renderNodeM1095m = PhotoViewer$$ExternalSyntheticApiModelOutline3.m1095m();
        this.renderNode = renderNodeM1095m;
        this.renderNodeFill = PhotoViewer$$ExternalSyntheticApiModelOutline3.m$1();
        renderNodeM1095m.setClipToOutline(true);
        renderNodeM1095m.setClipToBounds(true);
        this.source = blurredBackgroundSource;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    @Override
    public final void draw(Canvas canvas) {
        BlurredBackgroundDrawable.Props props = this.boundProps;
        if (props.boundsWithPadding.isEmpty()) {
            return;
        }
        boolean zIsHardwareAccelerated = canvas.isHardwareAccelerated();
        BlurredBackgroundSource blurredBackgroundSource = this.source;
        if (!zIsHardwareAccelerated) {
            drawSource(canvas, blurredBackgroundSource);
            return;
        }
        if (!this.renderNode.hasDisplayList()) {
            blurredBackgroundSource.dispatchOnDrawablesRelativePositionChange();
            updateDisplayList();
        } else if (this.renderNodeInvalidated) {
            updateDisplayList();
        }
        this.renderNodeInvalidated = false;
        int iMultAlpha = Theme.multAlpha(this.renderNode.getAlpha() * this.shadowAlpha, this.shadowColor);
        if (Color.alpha(iMultAlpha) != 0) {
            Paint paint = this.paintShadow;
            paint.setShadowLayer(this.shadowLayerRadius, 0.0f, this.shadowLayerDy, iMultAlpha);
            props.drawShadows(canvas, paint, this.inAppKeyboardOptimization);
        }
        canvas.save();
        Rect rect = props.boundsWithPadding;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.renderNode);
        canvas.restore();
    }

    @Override
    public final BlurredBackgroundSource getSource() {
        return this.source;
    }

    @Override
    public final void onBoundPropsChanged() {
        dispatchSourceRelativePositionChange();
        Paint paint = this.paintStrokeTop;
        BlurredBackgroundDrawable.Props props = this.boundProps;
        paint.setStrokeWidth(props.strokeWidthTop);
        this.paintStrokeBottom.setStrokeWidth(props.strokeWidthBottom);
        Rect rect = props.boundsWithPadding;
        int iWidth = rect.width();
        int iHeight = rect.height();
        Rect rect2 = this.outlineRect;
        rect2.set(0, 0, iWidth, iHeight);
        Outline outline = this.outline;
        BlurredBackgroundDrawable.getOutline(outline, rect2, props.radii);
        outline.setAlpha(1.0f);
        if (rect.isEmpty()) {
            return;
        }
        this.renderNodeFill.setPosition(0, 0, rect.width(), rect.height());
        this.renderNode.setPosition(0, 0, rect.width(), rect.height());
        this.renderNode.setOutline(outline);
        this.renderNodeInvalidated = true;
    }

    @Override
    public final void onSourceOffsetChange() {
        dispatchSourceRelativePositionChange();
        this.renderNodeInvalidated = true;
    }

    @Override
    public final void onSourceRelativePositionChanged() {
        this.source.dispatchOnDrawablesRelativePositionChange();
    }

    @Override
    public final void setAlpha(int i) {
        int i2 = this.alpha;
        this.alpha = i;
        this.renderNode.setAlpha(i / 255.0f);
        this.renderNodeInvalidated = true;
        if (i2 != 0 || i <= 0) {
            return;
        }
        this.source.dispatchOnDrawablesRelativePositionChange();
    }

    @Override
    public final BlurredBackgroundDrawable setClipToOutline() {
        this.renderNode.setClipToOutline(false);
        return this;
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        this.paintShadow.setShadowLayer(this.shadowLayerRadius, 0.0f, this.shadowLayerDy, this.shadowColor);
        this.paintStrokeTop.setColor(this.strokeColorTop);
        this.paintStrokeBottom.setColor(this.strokeColorBottom);
        this.renderNodeInvalidated = true;
    }

    public final void updateDisplayList() {
        Rect rect;
        BlurredBackgroundDrawable.Props props;
        RecordingCanvas recordingCanvas;
        float f;
        float f2;
        float f3;
        float f4;
        BlurredBackgroundDrawable.Props props2;
        float f5 = this.sourceOffsetX;
        float f6 = this.sourceOffsetY;
        BlurredBackgroundDrawable.Props props3 = this.boundProps;
        Rect rect2 = props3.boundsWithPadding;
        float f7 = rect2.left + f5;
        float f8 = rect2.top + f6;
        float f9 = rect2.right + f5;
        float f10 = rect2.bottom + f6;
        RecordingCanvas recordingCanvasBeginRecording = this.renderNodeFill.beginRecording();
        recordingCanvasBeginRecording.save();
        recordingCanvasBeginRecording.translate(-f7, -f8);
        LiquidGlassEffect liquidGlassEffect = this.liquidGlassEffect;
        Rect rect3 = props3.boundsWithPadding;
        if (liquidGlassEffect == null || Build.VERSION.SDK_INT < 33) {
            rect = rect3;
            props = props3;
            recordingCanvas = recordingCanvasBeginRecording;
            f = f7;
            f2 = f8;
            f3 = f9;
            f4 = f10;
        } else {
            int iDp = props3.liquidThickness;
            if (iDp <= 0) {
                iDp = AndroidUtilities.dp(11.0f);
            }
            int iMax = Math.max(Math.min(iDp, Math.min(rect3.width(), rect3.height()) / 5), 1);
            LiquidGlassEffect liquidGlassEffect2 = this.liquidGlassEffect;
            float fWidth = rect3.width();
            float fHeight = rect3.height();
            float[] fArr = props3.shaderRadii;
            float f11 = fArr[0];
            float f12 = fArr[2];
            float f13 = fArr[4];
            float f14 = fArr[6];
            float f15 = iMax;
            rect = rect3;
            float f16 = props3.liquidIntensity;
            int i = this.backgroundColor;
            float width = liquidGlassEffect2.node.getWidth();
            recordingCanvas = recordingCanvasBeginRecording;
            float height = liquidGlassEffect2.node.getHeight();
            f = f7;
            float f17 = (fWidth + 0.0f) / 2.0f;
            f2 = f8;
            float f18 = (fHeight + 0.0f) / 2.0f;
            float f19 = fHeight - 0.0f;
            f3 = f9;
            float f20 = (fWidth - 0.0f) / 2.0f;
            f4 = f10;
            float f21 = f19 / 2.0f;
            float f22 = f11 + f14;
            if (f22 > f19) {
                float f23 = f11 / f22;
                f14 = (1.0f - f23) * f19;
                f11 = f19 * f23;
            }
            float f24 = f12 + f13;
            if (f24 > f19) {
                float f25 = f12 / f24;
                f13 = (1.0f - f25) * f19;
                f12 = f19 * f25;
            }
            float fAbs = Math.abs(liquidGlassEffect2.resolutionX - width);
            float f26 = props3.liquidIndex;
            if (fAbs <= 0.1f) {
                props = props3;
                if (Math.abs(liquidGlassEffect2.resolutionY - height) > 0.1f || Math.abs(liquidGlassEffect2.centerX - f17) > 0.1f || Math.abs(liquidGlassEffect2.centerY - f18) > 0.1f || Math.abs(liquidGlassEffect2.sizeX - f20) > 0.1f || Math.abs(liquidGlassEffect2.sizeY - f21) > 0.1f || Math.abs(liquidGlassEffect2.radiusLeftTop - f11) > 0.1f || Math.abs(liquidGlassEffect2.radiusRightTop - f12) > 0.1f || Math.abs(liquidGlassEffect2.radiusRightBottom - f13) > 0.1f || Math.abs(liquidGlassEffect2.radiusLeftBottom - f14) > 0.1f || Math.abs(liquidGlassEffect2.thickness - f15) > 0.1f || Math.abs(liquidGlassEffect2.intensity - f16) > 0.1f || Math.abs(liquidGlassEffect2.index - f26) > 0.1f || liquidGlassEffect2.foregroundColor != i) {
                }
            } else {
                props = props3;
            }
            liquidGlassEffect2.foregroundColor = i;
            float fAlpha = Color.alpha(i) / 255.0f;
            float fRed = (Color.red(i) / 255.0f) * fAlpha;
            float fGreen = (Color.green(i) / 255.0f) * fAlpha;
            float fBlue = (Color.blue(i) / 255.0f) * fAlpha;
            RuntimeShader runtimeShader = liquidGlassEffect2.shader;
            liquidGlassEffect2.resolutionX = width;
            liquidGlassEffect2.resolutionY = height;
            runtimeShader.setFloatUniform("resolution", width, height);
            RuntimeShader runtimeShader2 = liquidGlassEffect2.shader;
            liquidGlassEffect2.centerX = f17;
            liquidGlassEffect2.centerY = f18;
            runtimeShader2.setFloatUniform("center", f17, f18);
            RuntimeShader runtimeShader3 = liquidGlassEffect2.shader;
            liquidGlassEffect2.sizeX = f20;
            liquidGlassEffect2.sizeY = f21;
            runtimeShader3.setFloatUniform("size", f20, f21);
            RuntimeShader runtimeShader4 = liquidGlassEffect2.shader;
            liquidGlassEffect2.radiusRightBottom = f13;
            liquidGlassEffect2.radiusRightTop = f12;
            liquidGlassEffect2.radiusLeftBottom = f14;
            liquidGlassEffect2.radiusLeftTop = f11;
            runtimeShader4.setFloatUniform("radius", f13, f12, f14, f11);
            RuntimeShader runtimeShader5 = liquidGlassEffect2.shader;
            liquidGlassEffect2.thickness = f15;
            runtimeShader5.setFloatUniform("thickness", f15);
            RuntimeShader runtimeShader6 = liquidGlassEffect2.shader;
            liquidGlassEffect2.intensity = f16;
            runtimeShader6.setFloatUniform("refract_intensity", f16);
            RuntimeShader runtimeShader7 = liquidGlassEffect2.shader;
            liquidGlassEffect2.index = f26;
            runtimeShader7.setFloatUniform("refract_index", f26);
            liquidGlassEffect2.shader.setFloatUniform("foreground_color_premultiplied", fRed, fGreen, fBlue, fAlpha);
            liquidGlassEffect2.node.setRenderEffect(RenderEffect.createRuntimeShaderEffect(liquidGlassEffect2.shader, "img"));
        }
        this.source.draw(recordingCanvas, f, f2, f3, f4);
        recordingCanvas.save();
        this.renderNodeFill.endRecording();
        RecordingCanvas recordingCanvasBeginRecording2 = this.renderNode.beginRecording();
        if (Color.alpha(this.backgroundColor) == 255) {
            recordingCanvasBeginRecording2.drawColor(this.backgroundColor);
        } else {
            recordingCanvasBeginRecording2.drawRenderNode(this.renderNodeFill);
            if (this.liquidGlassEffect == null && Color.alpha(this.backgroundColor) != 0) {
                recordingCanvasBeginRecording2.drawColor(this.backgroundColor);
            }
        }
        if (this.strokeColorTop != 0) {
            props2 = props;
            BlurredBackgroundDrawable.drawStroke(recordingCanvasBeginRecording2, rect.width(), rect.height(), props2.radii, props2.strokeWidthTop, true, this.paintStrokeTop);
        } else {
            props2 = props;
        }
        if (this.strokeColorBottom != 0) {
            BlurredBackgroundDrawable.drawStroke(recordingCanvasBeginRecording2, rect.width(), rect.height(), props2.radii, props2.strokeWidthBottom, false, this.paintStrokeBottom);
        }
        this.renderNode.endRecording();
    }
}
