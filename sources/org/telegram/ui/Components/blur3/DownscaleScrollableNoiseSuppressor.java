package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.pip.source.PipSourceSnapshot$$ExternalSyntheticApiModelOutline0;
import org.telegram.messenger.utils.RenderNodeEffects;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;

public class DownscaleScrollableNoiseSuppressor {
    public final boolean allowNoiseSuppress;
    private final Blur3HashImpl builder;
    public final boolean isLiquidGlassEnabled;
    private final int k;
    long lastHash;
    private int recordingIndex;
    private Rect recordingPos;
    private final ArrayList rectRenderNodes;
    private int rectRenderNodesCount;
    private final RenderNode[] resultRenderNodes;
    private final boolean simpleMode;
    private final RectF tmpRectF;

    public static float convertRadiusToSigma(float f) {
        if (f > 0.0f) {
            return (f * 0.57735f) + 0.5f;
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
        this(true, false);
    }

    public DownscaleScrollableNoiseSuppressor(boolean z, boolean z2) {
        this.tmpRectF = new RectF();
        this.builder = new Blur3HashImpl();
        this.rectRenderNodes = new ArrayList();
        boolean zIsEnabled = LiteMode.isEnabled(262144);
        this.isLiquidGlassEnabled = zIsEnabled;
        this.simpleMode = z;
        this.k = (zIsEnabled || z2) ? 1 : 8;
        this.allowNoiseSuppress = z2;
        this.resultRenderNodes = new RenderNode[(zIsEnabled || !z) ? 2 : 1];
        int i = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.resultRenderNodes;
            if (i >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i] = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
            i++;
        }
    }

    public void draw(Canvas canvas, int i) {
        if (!canvas.isHardwareAccelerated()) {
            throw new IllegalStateException();
        }
        boolean z = this.isLiquidGlassEnabled;
        if (!z && this.simpleMode) {
            canvas.drawRenderNode(this.resultRenderNodes[0]);
            return;
        }
        if (i == -2) {
            canvas.drawRenderNode(this.resultRenderNodes[!z ? 1 : 0]);
        } else if (i == -4) {
            canvas.drawRenderNode(this.resultRenderNodes[0]);
        } else if (i == -3) {
            canvas.drawRenderNode(this.resultRenderNodes[1]);
        }
    }

    public void drawInline(Canvas canvas, int i) {
        int i2;
        boolean z = this.isLiquidGlassEnabled;
        if (z || !this.simpleMode) {
            i2 = 1;
            if (i == -2) {
                i2 = 1 ^ (z ? 1 : 0);
            } else if (i == -4) {
                i2 = 0;
            } else if (i != -3) {
                return;
            }
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < this.rectRenderNodesCount; i3++) {
            SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i3);
            Rect rect = sourcePart.position;
            if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                canvas.save();
                Rect rect2 = sourcePart.position;
                canvas.translate(rect2.left, rect2.top);
                canvas.drawRenderNode(getRenderNode(i2, i3));
                canvas.restore();
            }
        }
    }

    public class DownscaledRenderNode {
        long lastHash;
        private final RenderNode[] renderNodeDownsampled;
        private final RenderNode renderNodeOriginalWithOffset;
        private final RenderNode[] renderNodeRestored;
        private int scaleX;
        private int scaleY;
        private float scrollX;
        private float scrollY;
        private final boolean simpleMode;

        public DownscaledRenderNode(DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor, String str, int i) {
            this(str, i, false);
        }

        public DownscaledRenderNode(String str, int i, boolean z) {
            this.renderNodeOriginalWithOffset = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
            int i2 = i + 1;
            this.renderNodeDownsampled = new RenderNode[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                RenderNode[] renderNodeArr = this.renderNodeDownsampled;
                PipSourceSnapshot$$ExternalSyntheticApiModelOutline0.m();
                renderNodeArr[i3] = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(str + "_down_" + i);
            }
            if (i > 0 || z) {
                this.renderNodeRestored = new RenderNode[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    this.renderNodeRestored[i4] = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
                }
            } else {
                this.renderNodeRestored = this.renderNodeDownsampled;
            }
            this.simpleMode = this.renderNodeRestored == this.renderNodeDownsampled;
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
            int iRound = Math.round((DownscaleScrollableNoiseSuppressor.this.k * f) / this.scaleX);
            float f2 = height;
            int iRound2 = Math.round((DownscaleScrollableNoiseSuppressor.this.k * f2) / this.scaleY);
            float f3 = iRound;
            float f4 = f3 / f;
            float f5 = iRound2;
            float f6 = f5 / f2;
            float f7 = (f * DownscaleScrollableNoiseSuppressor.this.k) / f3;
            float f8 = (f2 * DownscaleScrollableNoiseSuppressor.this.k) / f5;
            long jCalcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), iRound), iRound2), width), height);
            boolean z = (this.renderNodeOriginalWithOffset.hasDisplayList() && this.renderNodeDownsampled[0].hasDisplayList()) ? false : true;
            int i = 0;
            while (true) {
                RenderNode[] renderNodeArr = this.renderNodeDownsampled;
                if (i >= renderNodeArr.length) {
                    break;
                }
                z |= !renderNodeArr[i].hasDisplayList();
                if (!this.simpleMode) {
                    z |= !this.renderNodeRestored[i].hasDisplayList();
                }
                i++;
            }
            if (this.lastHash == jCalcHash && !z) {
                return;
            }
            this.lastHash = jCalcHash;
            this.renderNodeOriginalWithOffset.setPosition(0, 0, width, height);
            this.renderNodeOriginalWithOffset.beginRecording(width, height).drawRenderNode(renderNode);
            this.renderNodeOriginalWithOffset.endRecording();
            this.renderNodeDownsampled[0].setPosition(0, 0, iRound, iRound2);
            RecordingCanvas recordingCanvasBeginRecording = this.renderNodeDownsampled[0].beginRecording(iRound, iRound2);
            recordingCanvasBeginRecording.scale(f4, f6);
            recordingCanvasBeginRecording.drawRenderNode(this.renderNodeOriginalWithOffset);
            this.renderNodeDownsampled[0].endRecording();
            int i2 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.renderNodeDownsampled;
                if (i2 >= renderNodeArr2.length) {
                    return;
                }
                renderNodeArr2[i2].setPosition(0, 0, iRound, iRound2);
                RecordingCanvas recordingCanvasBeginRecording2 = this.renderNodeDownsampled[i2].beginRecording(iRound, iRound2);
                if (i2 > 0) {
                    recordingCanvasBeginRecording2.drawRenderNode(this.renderNodeDownsampled[0]);
                } else {
                    recordingCanvasBeginRecording2.scale(f4, f6);
                    recordingCanvasBeginRecording2.drawRenderNode(this.renderNodeOriginalWithOffset);
                }
                this.renderNodeDownsampled[i2].endRecording();
                if (this.simpleMode) {
                    this.renderNodeDownsampled[i2].setScaleX(f7);
                    this.renderNodeDownsampled[i2].setScaleY(f8);
                    this.renderNodeDownsampled[i2].setPivotX(0.0f);
                    this.renderNodeDownsampled[i2].setPivotY(0.0f);
                } else {
                    this.renderNodeRestored[i2].setPosition(0, 0, width, height);
                    RecordingCanvas recordingCanvasBeginRecording3 = this.renderNodeRestored[i2].beginRecording(width, height);
                    recordingCanvasBeginRecording3.scale(f7, f8);
                    recordingCanvasBeginRecording3.drawRenderNode(this.renderNodeDownsampled[i2]);
                    this.renderNodeRestored[i2].endRecording();
                }
                i2++;
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
            if (DownscaleScrollableNoiseSuppressor.this.allowNoiseSuppress) {
                this.renderNodeOriginalWithOffset.setTranslationX(f3);
                this.renderNodeOriginalWithOffset.setTranslationY(this.scrollY);
                for (RenderNode renderNode : this.renderNodeRestored) {
                    renderNode.setTranslationX(-this.scrollX);
                    renderNode.setTranslationY(-this.scrollY);
                }
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

    private boolean invalidateResultRenderNodes(int i, int i2) {
        long jCalcHash = MediaDataController.calcHash(MediaDataController.calcHash(0L, i), i2);
        int i3 = 0;
        boolean z = false;
        while (true) {
            RenderNode[] renderNodeArr = this.resultRenderNodes;
            if (i3 >= renderNodeArr.length) {
                break;
            }
            RenderNode renderNode = renderNodeArr[i3];
            jCalcHash = MediaDataController.calcHash(jCalcHash, renderNode.getUniqueId());
            for (int i4 = 0; i4 < this.rectRenderNodesCount; i4++) {
                SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i4);
                jCalcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(jCalcHash, sourcePart.position.left), sourcePart.position.top), sourcePart.position.right), sourcePart.position.bottom), getRenderNode(i3, i4).getUniqueId());
            }
            if (!renderNode.hasDisplayList()) {
                z = true;
            }
            i3++;
        }
        if (jCalcHash == this.lastHash && !z) {
            return false;
        }
        this.lastHash = jCalcHash;
        int i5 = 0;
        while (true) {
            RenderNode[] renderNodeArr2 = this.resultRenderNodes;
            if (i5 >= renderNodeArr2.length) {
                return true;
            }
            RenderNode renderNode2 = renderNodeArr2[i5];
            renderNode2.setPosition(0, 0, i, i2);
            RecordingCanvas recordingCanvasBeginRecording = renderNode2.beginRecording(i, i2);
            for (int i6 = 0; i6 < this.rectRenderNodesCount; i6++) {
                SourcePart sourcePart2 = (SourcePart) this.rectRenderNodes.get(i6);
                recordingCanvasBeginRecording.save();
                Rect rect = sourcePart2.position;
                recordingCanvasBeginRecording.translate(rect.left, rect.top);
                recordingCanvasBeginRecording.drawRenderNode(getRenderNode(i5, i6));
                recordingCanvasBeginRecording.restore();
            }
            renderNode2.endRecording();
            i5++;
        }
    }

    private RenderNode getRenderNode(int i, int i2) {
        DownscaledRenderNode downscaledRenderNode;
        SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i2);
        if (!this.isLiquidGlassEnabled || (downscaledRenderNode = sourcePart.renderNodesForGlass) == null) {
            return sourcePart.renderNodesForBlur.renderNodeRestored[Math.min(i, sourcePart.renderNodesForBlur.renderNodeRestored.length - 1)];
        }
        return i == 0 ? downscaledRenderNode.renderNodeRestored[0] : sourcePart.renderNodesForBlur.renderNodeRestored[0];
    }

    public boolean invalidateResultRenderNodes(IBlur3Capture iBlur3Capture, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < this.rectRenderNodesCount; i4++) {
            SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i4);
            Rect rect = sourcePart.position;
            this.tmpRectF.set(rect);
            this.builder.start();
            iBlur3Capture.captureCalculateHash(this.builder, this.tmpRectF);
            long j = this.builder.get();
            if (this.builder.isUnsupported() || sourcePart.lastHash != j || !sourcePart.renderNode.hasDisplayList()) {
                sourcePart.lastHash = j;
                RecordingCanvas recordingCanvasBeginRecordingRect = beginRecordingRect(i4);
                recordingCanvasBeginRecordingRect.save();
                recordingCanvasBeginRecordingRect.translate(-rect.left, -rect.top);
                iBlur3Capture.capture(recordingCanvasBeginRecordingRect, this.tmpRectF);
                recordingCanvasBeginRecordingRect.restore();
                endRecordingRect();
                i3++;
            }
        }
        if (i3 > 0) {
            return invalidateResultRenderNodes(i, i2);
        }
        return false;
    }

    private class SourcePart {
        long lastHash;
        final Rect position;
        final RenderNode renderNode;
        final DownscaledRenderNode renderNodesForBlur;
        final DownscaledRenderNode renderNodesForGlass;

        private SourcePart() {
            this.renderNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
            this.position = new Rect();
            if (!DownscaleScrollableNoiseSuppressor.this.isLiquidGlassEnabled) {
                if (DownscaleScrollableNoiseSuppressor.this.simpleMode) {
                    DownscaledRenderNode downscaledRenderNode = new DownscaledRenderNode(DownscaleScrollableNoiseSuppressor.this, "blur", 0);
                    this.renderNodesForBlur = downscaledRenderNode;
                    boolean z = DownscaleScrollableNoiseSuppressor.this.allowNoiseSuppress;
                    downscaledRenderNode.setScale(z ? 16 : 8, z ? 16 : 8);
                    downscaledRenderNode.setPrimaryEffectBlur(AndroidUtilities.dpf2(40.0f), RenderNodeEffects.getSaturationX3RenderEffect());
                    this.renderNodesForGlass = null;
                    return;
                }
                DownscaledRenderNode downscaledRenderNode2 = new DownscaledRenderNode(DownscaleScrollableNoiseSuppressor.this, "blur", 1);
                this.renderNodesForBlur = downscaledRenderNode2;
                downscaledRenderNode2.setScale(8, 8);
                downscaledRenderNode2.setPrimaryEffectBlur(AndroidUtilities.dpf2(40.0f));
                downscaledRenderNode2.setSecondaryEffect(0, RenderNodeEffects.getSaturationX3RenderEffect());
                this.renderNodesForGlass = null;
                return;
            }
            DownscaledRenderNode downscaledRenderNode3 = DownscaleScrollableNoiseSuppressor.this.new DownscaledRenderNode("glass", 0, true);
            this.renderNodesForGlass = downscaledRenderNode3;
            downscaledRenderNode3.setScale(4, 4);
            downscaledRenderNode3.setPrimaryEffectBlur(AndroidUtilities.dpf2(6.0f), RenderNodeEffects.getSaturationX3RenderEffect());
            DownscaledRenderNode downscaledRenderNode4 = new DownscaledRenderNode(DownscaleScrollableNoiseSuppressor.this, "blur", 0);
            this.renderNodesForBlur = downscaledRenderNode4;
            downscaledRenderNode4.setScale(8, 8);
            downscaledRenderNode4.setPrimaryEffectBlur(AndroidUtilities.dpf2(38.34f));
        }

        public void setPosition(RectF rectF) {
            this.position.left = DownscaleScrollableNoiseSuppressor.roundDown(rectF.left, 16);
            this.position.top = DownscaleScrollableNoiseSuppressor.roundDown(rectF.top, 16);
            this.position.right = DownscaleScrollableNoiseSuppressor.roundUp(rectF.right, 16);
            this.position.bottom = DownscaleScrollableNoiseSuppressor.roundUp(rectF.bottom, 16);
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

    public static int roundDown(float f, int i) {
        return Math.round(f - (f % i));
    }

    public static int roundUp(float f, int i) {
        float f2 = i;
        return Math.round(f + (f2 - (f % f2)));
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

    private RecordingCanvas beginRecordingRect(int i) {
        if (this.recordingPos != null) {
            throw new IllegalStateException();
        }
        SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i);
        Rect rect = sourcePart.position;
        this.recordingPos = rect;
        this.recordingIndex = i;
        int iWidth = rect.width() / this.k;
        int iHeight = rect.height() / this.k;
        sourcePart.renderNode.setPosition(0, 0, iWidth, iHeight);
        RecordingCanvas recordingCanvasBeginRecording = sourcePart.renderNode.beginRecording(iWidth, iHeight);
        float f = 1.0f / this.k;
        recordingCanvasBeginRecording.scale(f, f);
        return recordingCanvasBeginRecording;
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
