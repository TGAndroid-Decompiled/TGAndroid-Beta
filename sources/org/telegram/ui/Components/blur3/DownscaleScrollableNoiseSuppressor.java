package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;

public class DownscaleScrollableNoiseSuppressor {
    private static Canvas recordingCanvas;
    private boolean inRecording;
    private boolean invalidateRestoredAfterRecording;
    private final RenderNode renderNodeOriginal;
    private final DownscaledRenderNode renderNodesForFrostedGlass;
    private final DownscaledRenderNode renderNodesForGlass;

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
        RenderEffect createBlurEffect;
        RenderEffect createColorFilterEffect;
        RenderEffect createBlurEffect2;
        RenderEffect createColorFilterEffect2;
        RenderNode m = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
        this.renderNodeOriginal = m;
        DownscaledRenderNode downscaledRenderNode = new DownscaledRenderNode(1);
        this.renderNodesForFrostedGlass = downscaledRenderNode;
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(2.0f);
        m.setClipToBounds(true);
        m.setUseCompositingLayer(true, null);
        int i = 4;
        if (LiteMode.isEnabled(262144)) {
            float downscaleRadius = downscaleRadius(AndroidUtilities.dpf2(1.66f), 2.0f);
            DownscaledRenderNode downscaledRenderNode2 = new DownscaledRenderNode(1);
            this.renderNodesForGlass = downscaledRenderNode2;
            downscaledRenderNode2.setScale(2, 2);
            downscaledRenderNode2.renderNodeDownsampled[0].setUseCompositingLayer(true, null);
            createBlurEffect2 = RenderEffect.createBlurEffect(downscaleRadius, downscaleRadius, Shader.TileMode.CLAMP);
            downscaledRenderNode2.setPrimaryEffect(createBlurEffect2);
            createColorFilterEffect2 = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            downscaledRenderNode2.setSecondaryEffect(0, createColorFilterEffect2);
        } else {
            this.renderNodesForGlass = null;
            int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
            if (devicePerformanceClass == 2) {
                i = 2;
            } else if (devicePerformanceClass != 1) {
                i = 6;
            }
        }
        float downscaleRadius2 = downscaleRadius(AndroidUtilities.dpf2(28.34f), i);
        downscaledRenderNode.setScale(i, i);
        downscaledRenderNode.renderNodeDownsampled[0].setUseCompositingLayer(true, null);
        createBlurEffect = RenderEffect.createBlurEffect(downscaleRadius2, downscaleRadius2, Shader.TileMode.CLAMP);
        downscaledRenderNode.setPrimaryEffect(createBlurEffect);
        createColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        downscaledRenderNode.setSecondaryEffect(0, createColorFilterEffect);
    }

    public void onScrolled(float f, float f2) {
        DownscaledRenderNode downscaledRenderNode = this.renderNodesForGlass;
        if (downscaledRenderNode != null) {
            downscaledRenderNode.onScrolled(f, f2);
        }
        this.renderNodesForFrostedGlass.onScrolled(f, f2);
    }

    public Canvas beginRecording(int i, int i2) {
        boolean hasDisplayList;
        RecordingCanvas beginRecording;
        int width;
        int height;
        if (inRecording()) {
            throw new IllegalStateException();
        }
        boolean z = true;
        this.inRecording = true;
        hasDisplayList = this.renderNodeOriginal.hasDisplayList();
        if (hasDisplayList) {
            width = this.renderNodeOriginal.getWidth();
            if (width == i) {
                height = this.renderNodeOriginal.getHeight();
                if (height == i2) {
                    z = false;
                }
            }
        }
        this.invalidateRestoredAfterRecording = z;
        this.renderNodeOriginal.setPosition(0, 0, i, i2);
        beginRecording = this.renderNodeOriginal.beginRecording(i, i2);
        recordingCanvas = beginRecording;
        return beginRecording;
    }

    public void endRecording() {
        if (!inRecording()) {
            throw new IllegalStateException();
        }
        this.renderNodeOriginal.endRecording();
        if (this.invalidateRestoredAfterRecording) {
            this.invalidateRestoredAfterRecording = false;
            invalidateInternalRenderNodes();
        }
        recordingCanvas = null;
        this.inRecording = false;
    }

    public boolean inRecording() {
        return this.inRecording;
    }

    public void draw(Canvas canvas, int i) {
        DownscaledRenderNode downscaledRenderNode;
        if (inRecording() || !canvas.isHardwareAccelerated()) {
            throw new IllegalStateException();
        }
        if (i == -1) {
            canvas.drawRenderNode(this.renderNodeOriginal);
            return;
        }
        if (i == -2) {
            if (!LiteMode.isEnabled(262144) || (downscaledRenderNode = this.renderNodesForGlass) == null) {
                canvas.drawRenderNode(this.renderNodesForFrostedGlass.renderNodeRestored[1]);
                return;
            } else {
                canvas.drawRenderNode(downscaledRenderNode.renderNodeRestored[1]);
                return;
            }
        }
        if (i == -4) {
            canvas.drawRenderNode(this.renderNodesForFrostedGlass.renderNodeRestored[0]);
        } else if (i == -3) {
            canvas.drawRenderNode(this.renderNodesForFrostedGlass.renderNodeRestored[1]);
        }
    }

    private void invalidateInternalRenderNodes() {
        DownscaledRenderNode downscaledRenderNode = this.renderNodesForGlass;
        if (downscaledRenderNode != null) {
            downscaledRenderNode.invalidateRenderNodes(this.renderNodeOriginal);
            this.renderNodesForFrostedGlass.invalidateRenderNodes(this.renderNodesForGlass.renderNodeRestored[0]);
        } else {
            this.renderNodesForFrostedGlass.invalidateRenderNodes(this.renderNodeOriginal);
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

        public void setSecondaryEffect(int i, RenderEffect renderEffect) {
            this.renderNodeDownsampled[i + 1].setRenderEffect(renderEffect);
        }

        public void invalidateRenderNodes(RenderNode renderNode) {
            int width;
            int height;
            RecordingCanvas beginRecording;
            RecordingCanvas beginRecording2;
            RecordingCanvas beginRecording3;
            RecordingCanvas beginRecording4;
            width = renderNode.getWidth();
            height = renderNode.getHeight();
            float f = width;
            int round = Math.round(f / this.scaleX);
            float f2 = height;
            int round2 = Math.round(f2 / this.scaleY);
            float f3 = round;
            float f4 = f3 / f;
            float f5 = round2;
            float f6 = f5 / f2;
            float f7 = f / f3;
            float f8 = f2 / f5;
            this.renderNodeOriginalWithOffset.setPosition(0, 0, width, height);
            beginRecording = this.renderNodeOriginalWithOffset.beginRecording(width, height);
            beginRecording.drawRenderNode(renderNode);
            this.renderNodeOriginalWithOffset.endRecording();
            this.renderNodeDownsampled[0].setPosition(0, 0, round, round2);
            beginRecording2 = this.renderNodeDownsampled[0].beginRecording(round, round2);
            beginRecording2.scale(f4, f6);
            beginRecording2.drawRenderNode(this.renderNodeOriginalWithOffset);
            this.renderNodeDownsampled[0].endRecording();
            int i = 0;
            while (true) {
                RenderNode[] renderNodeArr = this.renderNodeDownsampled;
                if (i >= renderNodeArr.length) {
                    return;
                }
                renderNodeArr[i].setPosition(0, 0, round, round2);
                beginRecording3 = this.renderNodeDownsampled[i].beginRecording(round, round2);
                if (i > 0) {
                    beginRecording3.drawRenderNode(this.renderNodeDownsampled[0]);
                } else {
                    beginRecording3.scale(f4, f6);
                    beginRecording3.drawRenderNode(this.renderNodeOriginalWithOffset);
                }
                this.renderNodeDownsampled[i].endRecording();
                this.renderNodeRestored[i].setPosition(0, 0, width, height);
                beginRecording4 = this.renderNodeRestored[i].beginRecording(width, height);
                beginRecording4.scale(f7, f8);
                beginRecording4.drawRenderNode(this.renderNodeDownsampled[i]);
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
        return convertSigmaToRadius(convertRadiusToSigma(f) / f2);
    }
}
