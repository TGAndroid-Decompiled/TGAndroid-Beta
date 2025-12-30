package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;

public class DownscaleScrollableNoiseSuppressor {
    private int recordingIndex;
    private RectF recordingPos;
    private int rectRenderNodesCount;
    private final RenderEffect saturationUpEffect;
    private final RenderNode[] resultRenderNodes = {BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null), BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null)};
    private final ArrayList rectRenderNodes = new ArrayList();
    public final boolean isLiquidGlassEnabled = LiteMode.isEnabled(262144);

    public static float convertRadiusToSigma(float f) {
        if (f > 0.0f) {
            return 0.5f + (f * 0.57735f);
        }
        return 0.0f;
    }

    public static float convertSigmaToRadius(float f) {
        if (f > 0.5f) {
            return (f - 0.5f) / 0.57735f;
        }
        return 0.0f;
    }

    public DownscaleScrollableNoiseSuppressor() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(2.0f);
        this.saturationUpEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
    }

    public void draw(Canvas canvas, int i) {
        if (!canvas.isHardwareAccelerated()) {
            throw new IllegalStateException();
        }
        if (i == -2) {
            canvas.drawRenderNode(this.resultRenderNodes[!this.isLiquidGlassEnabled ? 1 : 0]);
        } else if (i == -4) {
            canvas.drawRenderNode(this.resultRenderNodes[0]);
        } else if (i == -3) {
            canvas.drawRenderNode(this.resultRenderNodes[1]);
        }
    }

    public static class DownscaledRenderNode {
        private final RenderNode[] renderNodeDownsampled;
        private final RenderNode renderNodeOriginalWithOffset = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
        private final RenderNode[] renderNodeRestored;
        private int scaleX;
        private int scaleY;
        private float scrollX;
        private float scrollY;

        public DownscaledRenderNode(int i) {
            int i2 = i + 1;
            this.renderNodeDownsampled = new RenderNode[i2];
            this.renderNodeRestored = new RenderNode[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.renderNodeDownsampled[i3] = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
                this.renderNodeDownsampled[i3].setClipToBounds(true);
                this.renderNodeRestored[i3] = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
                this.renderNodeRestored[i3].setClipToBounds(true);
            }
            this.scaleY = 1;
            this.scaleX = 1;
        }

        public void setPrimaryEffect(RenderEffect renderEffect) {
            this.renderNodeDownsampled[0].setRenderEffect(renderEffect);
        }

        public void setPrimaryEffectBlur(float f) {
            setPrimaryEffect(RenderEffect.createBlurEffect(DownscaleScrollableNoiseSuppressor.downscaleRadius(f, this.scaleX), DownscaleScrollableNoiseSuppressor.downscaleRadius(f, this.scaleY), Shader.TileMode.CLAMP));
        }

        public void setPrimaryEffectBlur(float f, RenderEffect renderEffect) {
            setPrimaryEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(DownscaleScrollableNoiseSuppressor.downscaleRadius(f, this.scaleX), DownscaleScrollableNoiseSuppressor.downscaleRadius(f, this.scaleY), Shader.TileMode.CLAMP), renderEffect));
        }

        public void setSecondaryEffect(int i, RenderEffect renderEffect) {
            this.renderNodeDownsampled[i + 1].setRenderEffect(renderEffect);
        }

        public void invalidateRenderNodes(RenderNode renderNode) {
            int width = renderNode.getWidth();
            int height = renderNode.getHeight();
            float f = width;
            int iRound = Math.round(f / this.scaleX);
            float f2 = height;
            int iRound2 = Math.round(f2 / this.scaleY);
            float f3 = iRound;
            float f4 = f3 / f;
            float f5 = iRound2;
            float f6 = f5 / f2;
            float f7 = f / f3;
            float f8 = f2 / f5;
            this.renderNodeOriginalWithOffset.setPosition(0, 0, width, height);
            this.renderNodeOriginalWithOffset.beginRecording(width, height).drawRenderNode(renderNode);
            this.renderNodeOriginalWithOffset.endRecording();
            this.renderNodeDownsampled[0].setPosition(0, 0, iRound, iRound2);
            RecordingCanvas recordingCanvasBeginRecording = this.renderNodeDownsampled[0].beginRecording(iRound, iRound2);
            recordingCanvasBeginRecording.scale(f4, f6);
            recordingCanvasBeginRecording.drawRenderNode(this.renderNodeOriginalWithOffset);
            this.renderNodeDownsampled[0].endRecording();
            int i = 0;
            while (true) {
                RenderNode[] renderNodeArr = this.renderNodeDownsampled;
                if (i >= renderNodeArr.length) {
                    return;
                }
                renderNodeArr[i].setPosition(0, 0, iRound, iRound2);
                RecordingCanvas recordingCanvasBeginRecording2 = this.renderNodeDownsampled[i].beginRecording(iRound, iRound2);
                if (i > 0) {
                    recordingCanvasBeginRecording2.drawRenderNode(this.renderNodeDownsampled[0]);
                } else {
                    recordingCanvasBeginRecording2.scale(f4, f6);
                    recordingCanvasBeginRecording2.drawRenderNode(this.renderNodeOriginalWithOffset);
                }
                this.renderNodeDownsampled[i].endRecording();
                this.renderNodeRestored[i].setPosition(0, 0, width, height);
                RecordingCanvas recordingCanvasBeginRecording3 = this.renderNodeRestored[i].beginRecording(width, height);
                recordingCanvasBeginRecording3.scale(f7, f8);
                recordingCanvasBeginRecording3.drawRenderNode(this.renderNodeDownsampled[i]);
                this.renderNodeRestored[i].endRecording();
                i++;
            }
        }

        public void setScale(int i, int i2) {
            this.scaleX = i;
            this.scaleY = i2;
        }

        public void onScrolled(float f, float f2) {
            int i = this.scaleX;
            float f3 = i >= 2 ? (this.scrollX + f) % i : 0.0f;
            this.scrollX = f3;
            int i2 = this.scaleY;
            this.scrollY = i2 >= 2 ? (this.scrollY + f2) % i2 : 0.0f;
            this.renderNodeOriginalWithOffset.setTranslationX(f3);
            this.renderNodeOriginalWithOffset.setTranslationY(this.scrollY);
            for (RenderNode renderNode : this.renderNodeRestored) {
                renderNode.setTranslationX(-this.scrollX);
                renderNode.setTranslationY(-this.scrollY);
            }
        }
    }

    public static float downscaleRadius(float f, float f2) {
        return Math.max(1.0f, convertSigmaToRadius(convertRadiusToSigma(f) / f2));
    }

    public void onScrolled(float f, float f2) {
        for (int i = 0; i < this.rectRenderNodesCount; i++) {
            SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i);
            sourcePart.renderNodesForBlur.onScrolled(f, f2);
            DownscaledRenderNode downscaledRenderNode = sourcePart.renderNodesForGlass;
            if (downscaledRenderNode != null) {
                downscaledRenderNode.onScrolled(f, f2);
            }
        }
    }

    private void invalidateResultRenderNodes(int i, int i2) {
        DownscaledRenderNode downscaledRenderNode;
        for (int i3 = 0; i3 < 2; i3++) {
            RenderNode renderNode = this.resultRenderNodes[i3];
            renderNode.setPosition(0, 0, i, i2);
            RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording(i, i2);
            for (int i4 = 0; i4 < this.rectRenderNodesCount; i4++) {
                SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i4);
                recordingCanvasBeginRecording.save();
                RectF rectF = sourcePart.position;
                recordingCanvasBeginRecording.translate(rectF.left, rectF.top);
                if (!this.isLiquidGlassEnabled || (downscaledRenderNode = sourcePart.renderNodesForGlass) == null) {
                    recordingCanvasBeginRecording.drawRenderNode(sourcePart.renderNodesForBlur.renderNodeRestored[Math.min(i3, sourcePart.renderNodesForBlur.renderNodeRestored.length)]);
                } else if (i3 == 0) {
                    recordingCanvasBeginRecording.drawRenderNode(downscaledRenderNode.renderNodeRestored[0]);
                } else {
                    recordingCanvasBeginRecording.drawRenderNode(sourcePart.renderNodesForBlur.renderNodeRestored[0]);
                }
                recordingCanvasBeginRecording.restore();
            }
            renderNode.endRecording();
        }
    }

    public void invalidateResultRenderNodes(IBlur3Capture iBlur3Capture, int i, int i2) {
        for (int i3 = 0; i3 < this.rectRenderNodesCount; i3++) {
            RectF position = getPosition(i3);
            RecordingCanvas recordingCanvasBeginRecordingRect = beginRecordingRect(i3);
            recordingCanvasBeginRecordingRect.save();
            recordingCanvasBeginRecordingRect.translate(-position.left, -position.top);
            iBlur3Capture.capture(recordingCanvasBeginRecordingRect, position);
            recordingCanvasBeginRecordingRect.restore();
            endRecordingRect();
        }
        invalidateResultRenderNodes(i, i2);
    }

    private class SourcePart {
        final RectF position;
        final RenderNode renderNode;
        final DownscaledRenderNode renderNodesForBlur;
        final DownscaledRenderNode renderNodesForGlass;

        private SourcePart() {
            RenderNode renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
            this.renderNode = renderNodeM;
            this.position = new RectF();
            renderNodeM.setClipToBounds(true);
            if (DownscaleScrollableNoiseSuppressor.this.isLiquidGlassEnabled) {
                DownscaledRenderNode downscaledRenderNode = new DownscaledRenderNode(0);
                this.renderNodesForGlass = downscaledRenderNode;
                downscaledRenderNode.renderNodeDownsampled[0].setUseCompositingLayer(true, null);
                downscaledRenderNode.setScale(4, 4);
                downscaledRenderNode.setPrimaryEffectBlur(AndroidUtilities.dpf2(1.66f), DownscaleScrollableNoiseSuppressor.this.saturationUpEffect);
                DownscaledRenderNode downscaledRenderNode2 = new DownscaledRenderNode(0);
                this.renderNodesForBlur = downscaledRenderNode2;
                downscaledRenderNode2.setScale(16, 16);
                downscaledRenderNode2.setPrimaryEffectBlur(AndroidUtilities.dpf2(28.34f));
            } else {
                DownscaledRenderNode downscaledRenderNode3 = new DownscaledRenderNode(1);
                this.renderNodesForBlur = downscaledRenderNode3;
                downscaledRenderNode3.setScale(16, 16);
                downscaledRenderNode3.setPrimaryEffectBlur(AndroidUtilities.dpf2(30.0f));
                downscaledRenderNode3.setSecondaryEffect(0, DownscaleScrollableNoiseSuppressor.this.saturationUpEffect);
                this.renderNodesForGlass = null;
            }
            this.renderNodesForBlur.renderNodeDownsampled[0].setUseCompositingLayer(true, null);
        }

        public void setPosition(RectF rectF) {
            RectF rectF2 = this.position;
            float f = rectF.left;
            rectF2.left = f - (f % 16.0f);
            float f2 = rectF.top;
            rectF2.top = f2 - (f2 % 16.0f);
            float f3 = rectF.right;
            rectF2.right = f3 + (16.0f - (f3 % 16.0f));
            float f4 = rectF.bottom;
            rectF2.bottom = f4 + (16.0f - (f4 % 16.0f));
        }

        public void invalidate() {
            DownscaledRenderNode downscaledRenderNode = this.renderNodesForGlass;
            if (downscaledRenderNode != null) {
                downscaledRenderNode.invalidateRenderNodes(this.renderNode);
                this.renderNodesForBlur.invalidateRenderNodes(this.renderNodesForGlass.renderNodeRestored[0]);
            } else {
                this.renderNodesForBlur.invalidateRenderNodes(this.renderNode);
            }
        }
    }

    public int getRenderNodesCount() {
        return this.rectRenderNodesCount;
    }

    public void setupRenderNodes(List list, int i) {
        this.rectRenderNodesCount = i;
        while (this.rectRenderNodesCount > this.rectRenderNodes.size()) {
            this.rectRenderNodes.add(new SourcePart());
        }
        for (int i2 = 0; i2 < this.rectRenderNodesCount; i2++) {
            ((SourcePart) this.rectRenderNodes.get(i2)).setPosition((RectF) list.get(i2));
        }
    }

    private RectF getPosition(int i) {
        return ((SourcePart) this.rectRenderNodes.get(i)).position;
    }

    private RecordingCanvas beginRecordingRect(int i) {
        if (this.recordingPos != null) {
            throw new IllegalStateException();
        }
        SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i);
        this.recordingPos = sourcePart.position;
        this.recordingIndex = i;
        int iCeil = (int) Math.ceil(r1.width());
        int iCeil2 = (int) Math.ceil(r1.height());
        sourcePart.renderNode.setPosition(0, 0, iCeil, iCeil2);
        return sourcePart.renderNode.beginRecording(iCeil, iCeil2);
    }

    private void endRecordingRect() {
        if (this.recordingPos == null) {
            throw new IllegalStateException();
        }
        SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(this.recordingIndex);
        sourcePart.renderNode.endRecording();
        sourcePart.invalidate();
        this.recordingPos = null;
    }
}
