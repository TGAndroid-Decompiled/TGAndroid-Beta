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
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.utils.FBool;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline3;
import org.telegram.ui.Components.TranslateAlert2$$ExternalSyntheticApiModelOutline0;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;

public final class DownscaleScrollableNoiseSuppressor {
    public final boolean allowNoiseSuppress;
    public final boolean isLiquidGlassEnabled;
    public final int k;
    public long lastHash;
    public int recordingIndex;
    public Rect recordingPos;
    public int rectRenderNodesCount;
    public final RenderNode[] resultRenderNodes;
    public final boolean simpleMode;
    public final RectF tmpRectF = new RectF();
    public final Blur3HashImpl builder = new Blur3HashImpl();
    public final ArrayList rectRenderNodes = new ArrayList();

    public final class DownscaledRenderNode {
        public long lastHash;
        public final RenderNode[] renderNodeDownsampled;
        public final RenderNode renderNodeOriginalWithOffset = TranslateAlert2$$ExternalSyntheticApiModelOutline0.m$1();
        public final RenderNode[] renderNodeRestored;
        public int scaleX;
        public int scaleY;
        public float scrollX;
        public float scrollY;
        public final boolean simpleMode;

        public DownscaledRenderNode(String str, int i, boolean z) {
            int i2 = i + 1;
            this.renderNodeDownsampled = new RenderNode[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                RenderNode[] renderNodeArr = this.renderNodeDownsampled;
                Theme$$ExternalSyntheticApiModelOutline3.m1061m();
                renderNodeArr[i3] = Theme$$ExternalSyntheticApiModelOutline3.m(str + "_down_" + i);
            }
            if (i > 0 || z) {
                this.renderNodeRestored = new RenderNode[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    this.renderNodeRestored[i4] = TranslateAlert2$$ExternalSyntheticApiModelOutline0.m$1();
                }
            } else {
                this.renderNodeRestored = this.renderNodeDownsampled;
            }
            this.simpleMode = this.renderNodeRestored == this.renderNodeDownsampled;
            this.scaleY = 1;
            this.scaleX = 1;
        }

        public final void invalidateRenderNodes(RenderNode renderNode) {
            boolean z;
            int width = renderNode.getWidth();
            int height = renderNode.getHeight();
            float f = width;
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor = DownscaleScrollableNoiseSuppressor.this;
            int iRound = Math.round((downscaleScrollableNoiseSuppressor.k * f) / this.scaleX);
            float f2 = height;
            int i = downscaleScrollableNoiseSuppressor.k;
            int iRound2 = Math.round((i * f2) / this.scaleY);
            float f3 = iRound;
            float f4 = f3 / f;
            float f5 = iRound2;
            float f6 = f5 / f2;
            float f7 = i;
            float f8 = (f * f7) / f3;
            float f9 = (f2 * f7) / f5;
            long jCalcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), iRound), iRound2), width), height);
            boolean z2 = (this.renderNodeOriginalWithOffset.hasDisplayList() && this.renderNodeDownsampled[0].hasDisplayList()) ? false : true;
            int i2 = 0;
            while (true) {
                RenderNode[] renderNodeArr = this.renderNodeDownsampled;
                int length = renderNodeArr.length;
                z = this.simpleMode;
                if (i2 >= length) {
                    break;
                }
                z2 |= !renderNodeArr[i2].hasDisplayList();
                if (!z) {
                    z2 |= !this.renderNodeRestored[i2].hasDisplayList();
                }
                i2++;
            }
            if (this.lastHash == jCalcHash && !z2) {
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
            int i3 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.renderNodeDownsampled;
                if (i3 >= renderNodeArr2.length) {
                    return;
                }
                renderNodeArr2[i3].setPosition(0, 0, iRound, iRound2);
                RecordingCanvas recordingCanvasBeginRecording2 = this.renderNodeDownsampled[i3].beginRecording(iRound, iRound2);
                if (i3 > 0) {
                    recordingCanvasBeginRecording2.drawRenderNode(this.renderNodeDownsampled[0]);
                } else {
                    recordingCanvasBeginRecording2.scale(f4, f6);
                    recordingCanvasBeginRecording2.drawRenderNode(this.renderNodeOriginalWithOffset);
                }
                this.renderNodeDownsampled[i3].endRecording();
                if (z) {
                    this.renderNodeDownsampled[i3].setScaleX(f8);
                    this.renderNodeDownsampled[i3].setScaleY(f9);
                    this.renderNodeDownsampled[i3].setPivotX(0.0f);
                    this.renderNodeDownsampled[i3].setPivotY(0.0f);
                } else {
                    this.renderNodeRestored[i3].setPosition(0, 0, width, height);
                    RecordingCanvas recordingCanvasBeginRecording3 = this.renderNodeRestored[i3].beginRecording(width, height);
                    recordingCanvasBeginRecording3.scale(f8, f9);
                    recordingCanvasBeginRecording3.drawRenderNode(this.renderNodeDownsampled[i3]);
                    this.renderNodeRestored[i3].endRecording();
                }
                i3++;
            }
        }

        public final void onScrolled(float f, float f2) {
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

    public final class SourcePart {
        public long lastHash;
        public final DownscaledRenderNode renderNodesForBlur;
        public final DownscaledRenderNode renderNodesForGlass;
        public final RenderNode renderNode = TranslateAlert2$$ExternalSyntheticApiModelOutline0.m$1();
        public final Rect position = new Rect();

        public SourcePart(DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor) {
            if (downscaleScrollableNoiseSuppressor.isLiquidGlassEnabled) {
                DownscaledRenderNode downscaledRenderNode = downscaleScrollableNoiseSuppressor.new DownscaledRenderNode("glass", 0, true);
                this.renderNodesForGlass = downscaledRenderNode;
                downscaledRenderNode.scaleX = 4;
                downscaledRenderNode.scaleY = 4;
                float fDpf2 = AndroidUtilities.dpf2(6.0f);
                RenderEffect saturationX3RenderEffect = FBool.getSaturationX3RenderEffect();
                float fDownscaleRadius = DownscaleScrollableNoiseSuppressor.downscaleRadius(fDpf2, downscaledRenderNode.scaleX);
                float fDownscaleRadius2 = DownscaleScrollableNoiseSuppressor.downscaleRadius(fDpf2, downscaledRenderNode.scaleY);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                downscaledRenderNode.renderNodeDownsampled[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(fDownscaleRadius, fDownscaleRadius2, Shader.TileMode.CLAMP), saturationX3RenderEffect));
                DownscaledRenderNode downscaledRenderNode2 = downscaleScrollableNoiseSuppressor.new DownscaledRenderNode("blur", 0, false);
                this.renderNodesForBlur = downscaledRenderNode2;
                downscaledRenderNode2.scaleX = 8;
                downscaledRenderNode2.scaleY = 8;
                float fDpf3 = AndroidUtilities.dpf2(38.34f);
                downscaledRenderNode2.renderNodeDownsampled[0].setRenderEffect(RenderEffect.createBlurEffect(DownscaleScrollableNoiseSuppressor.downscaleRadius(fDpf3, downscaledRenderNode2.scaleX), DownscaleScrollableNoiseSuppressor.downscaleRadius(fDpf3, downscaledRenderNode2.scaleY), Shader.TileMode.CLAMP));
                return;
            }
            if (!downscaleScrollableNoiseSuppressor.simpleMode) {
                DownscaledRenderNode downscaledRenderNode3 = downscaleScrollableNoiseSuppressor.new DownscaledRenderNode("blur", 1, false);
                this.renderNodesForBlur = downscaledRenderNode3;
                downscaledRenderNode3.scaleX = 8;
                downscaledRenderNode3.scaleY = 8;
                float fDpf4 = AndroidUtilities.dpf2(40.0f);
                float fDownscaleRadius3 = DownscaleScrollableNoiseSuppressor.downscaleRadius(fDpf4, downscaledRenderNode3.scaleX);
                float fDownscaleRadius4 = DownscaleScrollableNoiseSuppressor.downscaleRadius(fDpf4, downscaledRenderNode3.scaleY);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                downscaledRenderNode3.renderNodeDownsampled[0].setRenderEffect(RenderEffect.createBlurEffect(fDownscaleRadius3, fDownscaleRadius4, Shader.TileMode.CLAMP));
                downscaledRenderNode3.renderNodeDownsampled[1].setRenderEffect(FBool.getSaturationX3RenderEffect());
                this.renderNodesForGlass = null;
                return;
            }
            DownscaledRenderNode downscaledRenderNode4 = downscaleScrollableNoiseSuppressor.new DownscaledRenderNode("blur", 0, false);
            this.renderNodesForBlur = downscaledRenderNode4;
            boolean z = downscaleScrollableNoiseSuppressor.allowNoiseSuppress;
            int i = z ? 16 : 8;
            int i2 = z ? 16 : 8;
            downscaledRenderNode4.scaleX = i;
            downscaledRenderNode4.scaleY = i2;
            float fDpf5 = AndroidUtilities.dpf2(40.0f);
            RenderEffect saturationX3RenderEffect2 = FBool.getSaturationX3RenderEffect();
            float fDownscaleRadius5 = DownscaleScrollableNoiseSuppressor.downscaleRadius(fDpf5, downscaledRenderNode4.scaleX);
            float fDownscaleRadius6 = DownscaleScrollableNoiseSuppressor.downscaleRadius(fDpf5, downscaledRenderNode4.scaleY);
            Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
            downscaledRenderNode4.renderNodeDownsampled[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(fDownscaleRadius5, fDownscaleRadius6, Shader.TileMode.CLAMP), saturationX3RenderEffect2));
            this.renderNodesForGlass = null;
        }
    }

    public DownscaleScrollableNoiseSuppressor(boolean z) {
        boolean zIsEnabled = LiteMode.isEnabled(262144);
        this.isLiquidGlassEnabled = zIsEnabled;
        this.simpleMode = true;
        this.k = (zIsEnabled || z) ? 1 : 8;
        this.allowNoiseSuppress = z;
        this.resultRenderNodes = new RenderNode[zIsEnabled ? 2 : 1];
        int i = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.resultRenderNodes;
            if (i >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i] = TranslateAlert2$$ExternalSyntheticApiModelOutline0.m$1();
            i++;
        }
    }

    public static float downscaleRadius(float f, float f2) {
        float f3 = (f > 0.0f ? (f * 0.57735f) + 0.5f : 0.0f) / f2;
        return Math.max(1.0f, f3 > 0.5f ? (f3 - 0.5f) / 0.57735f : 0.0f);
    }

    public final void draw(Canvas canvas, int i) {
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

    public final RenderNode getRenderNode(int i, int i2) {
        DownscaledRenderNode downscaledRenderNode;
        SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i2);
        if (this.isLiquidGlassEnabled && (downscaledRenderNode = sourcePart.renderNodesForGlass) != null) {
            return i == 0 ? downscaledRenderNode.renderNodeRestored[0] : sourcePart.renderNodesForBlur.renderNodeRestored[0];
        }
        RenderNode[] renderNodeArr = sourcePart.renderNodesForBlur.renderNodeRestored;
        return renderNodeArr[Math.min(i, renderNodeArr.length - 1)];
    }

    public final boolean invalidateResultRenderNodes(IBlur3Capture iBlur3Capture, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.rectRenderNodesCount;
            ArrayList arrayList = this.rectRenderNodes;
            if (i3 >= i5) {
                if (i4 > 0) {
                    long jCalcHash = MediaDataController.calcHash(MediaDataController.calcHash(0L, i), i2);
                    int i6 = 0;
                    boolean z = false;
                    while (true) {
                        RenderNode[] renderNodeArr = this.resultRenderNodes;
                        if (i6 >= renderNodeArr.length) {
                            break;
                        }
                        RenderNode renderNode = renderNodeArr[i6];
                        jCalcHash = MediaDataController.calcHash(jCalcHash, renderNode.getUniqueId());
                        for (int i7 = 0; i7 < this.rectRenderNodesCount; i7++) {
                            SourcePart sourcePart = (SourcePart) arrayList.get(i7);
                            RenderNode renderNode2 = getRenderNode(i6, i7);
                            long jCalcHash2 = MediaDataController.calcHash(jCalcHash, sourcePart.position.left);
                            Rect rect = sourcePart.position;
                            jCalcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(jCalcHash2, rect.top), rect.right), rect.bottom), renderNode2.getUniqueId());
                        }
                        if (!renderNode.hasDisplayList()) {
                            z = true;
                        }
                        i6++;
                    }
                    if (jCalcHash != this.lastHash || z) {
                        this.lastHash = jCalcHash;
                        int i8 = 0;
                        while (true) {
                            RenderNode[] renderNodeArr2 = this.resultRenderNodes;
                            if (i8 >= renderNodeArr2.length) {
                                return true;
                            }
                            RenderNode renderNode3 = renderNodeArr2[i8];
                            renderNode3.setPosition(0, 0, i, i2);
                            RecordingCanvas recordingCanvasBeginRecording = renderNode3.beginRecording(i, i2);
                            for (int i9 = 0; i9 < this.rectRenderNodesCount; i9++) {
                                SourcePart sourcePart2 = (SourcePart) arrayList.get(i9);
                                recordingCanvasBeginRecording.save();
                                Rect rect2 = sourcePart2.position;
                                recordingCanvasBeginRecording.translate(rect2.left, rect2.top);
                                recordingCanvasBeginRecording.drawRenderNode(getRenderNode(i8, i9));
                                recordingCanvasBeginRecording.restore();
                            }
                            renderNode3.endRecording();
                            i8++;
                        }
                    }
                }
                return false;
            }
            SourcePart sourcePart3 = (SourcePart) arrayList.get(i3);
            Rect rect3 = sourcePart3.position;
            RectF rectF = this.tmpRectF;
            rectF.set(rect3);
            Blur3HashImpl blur3HashImpl = this.builder;
            blur3HashImpl.hash = 0L;
            blur3HashImpl.unsupported = false;
            iBlur3Capture.captureCalculateHash(blur3HashImpl, rectF);
            boolean z2 = blur3HashImpl.unsupported;
            long j = z2 ? -1L : blur3HashImpl.hash;
            if (z2 || sourcePart3.lastHash != j || !sourcePart3.renderNode.hasDisplayList()) {
                sourcePart3.lastHash = j;
                if (this.recordingPos != null) {
                    throw new IllegalStateException();
                }
                SourcePart sourcePart4 = (SourcePart) arrayList.get(i3);
                Rect rect4 = sourcePart4.position;
                this.recordingPos = rect4;
                this.recordingIndex = i3;
                int iWidth = rect4.width();
                int i10 = this.k;
                int i11 = iWidth / i10;
                int iHeight = rect4.height() / i10;
                sourcePart4.renderNode.setPosition(0, 0, i11, iHeight);
                RecordingCanvas recordingCanvasBeginRecording2 = sourcePart4.renderNode.beginRecording(i11, iHeight);
                float f = 1.0f / i10;
                recordingCanvasBeginRecording2.scale(f, f);
                recordingCanvasBeginRecording2.save();
                recordingCanvasBeginRecording2.translate(-rect3.left, -rect3.top);
                iBlur3Capture.capture(recordingCanvasBeginRecording2, rectF);
                recordingCanvasBeginRecording2.restore();
                if (this.recordingPos == null) {
                    throw new IllegalStateException();
                }
                SourcePart sourcePart5 = (SourcePart) arrayList.get(this.recordingIndex);
                sourcePart5.renderNode.endRecording();
                DownscaledRenderNode downscaledRenderNode = sourcePart5.renderNodesForBlur;
                DownscaledRenderNode downscaledRenderNode2 = sourcePart5.renderNodesForGlass;
                if (downscaledRenderNode2 != null) {
                    downscaledRenderNode2.invalidateRenderNodes(sourcePart5.renderNode);
                    downscaledRenderNode.invalidateRenderNodes(downscaledRenderNode2.renderNodeRestored[0]);
                } else {
                    downscaledRenderNode.invalidateRenderNodes(sourcePart5.renderNode);
                }
                this.recordingPos = null;
                i4++;
            }
            i3++;
        }
    }

    public final void onScrolled(float f, float f2) {
        for (int i = 0; i < this.rectRenderNodesCount; i++) {
            SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i);
            sourcePart.renderNodesForBlur.onScrolled(f, f2);
            DownscaledRenderNode downscaledRenderNode = sourcePart.renderNodesForGlass;
            if (downscaledRenderNode != null) {
                downscaledRenderNode.onScrolled(f, f2);
            }
        }
    }

    public final void setupRenderNodes(int i, List list) {
        ArrayList arrayList;
        this.rectRenderNodesCount = i;
        while (true) {
            int i2 = this.rectRenderNodesCount;
            arrayList = this.rectRenderNodes;
            if (i2 <= arrayList.size()) {
                break;
            } else {
                arrayList.add(new SourcePart(this));
            }
        }
        for (int i3 = 0; i3 < this.rectRenderNodesCount; i3++) {
            SourcePart sourcePart = (SourcePart) arrayList.get(i3);
            RectF rectF = (RectF) list.get(i3);
            Rect rect = sourcePart.position;
            float f = rectF.left;
            float f2 = 16;
            rect.left = Math.round(f - (f % f2));
            float f3 = rectF.top;
            int iRound = Math.round(f3 - (f3 % f2));
            Rect rect2 = sourcePart.position;
            rect2.top = iRound;
            float f4 = rectF.right;
            rect2.right = Math.round((f2 - (f4 % f2)) + f4);
            float f5 = rectF.bottom;
            rect2.bottom = Math.round((f2 - (f5 % f2)) + f5);
        }
    }
}
