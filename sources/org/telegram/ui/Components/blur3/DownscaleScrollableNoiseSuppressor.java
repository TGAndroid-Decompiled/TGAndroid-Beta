package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;

public class DownscaleScrollableNoiseSuppressor {
    private static Canvas recordingCanvas;
    private boolean inRecording;
    private boolean invalidateRestoredAfterRecording;
    private final RenderNode renderNodeOriginal;
    private final RenderNode[] renderNodesDownsampled;
    private final RenderNode[] renderNodesRestored;
    private int scaleX;
    private int scaleY;
    private float scrollX;
    private float scrollY;

    public DownscaleScrollableNoiseSuppressor() {
        RenderEffect createColorFilterEffect;
        RenderNode m = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("ScrollViewBlurNoiseSuppressor.Original");
        this.renderNodeOriginal = m;
        this.renderNodesDownsampled = new RenderNode[3];
        this.renderNodesRestored = new RenderNode[3];
        m.setClipToBounds(true);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(2.0f);
        for (int i = 0; i < 3; i++) {
            this.renderNodesDownsampled[i] = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
            this.renderNodesDownsampled[i].setClipToBounds(true);
            this.renderNodesRestored[i] = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
            this.renderNodesRestored[i].setClipToBounds(true);
        }
        this.renderNodesDownsampled[0].setUseCompositingLayer(true, null);
        RenderNode renderNode = this.renderNodesDownsampled[1];
        createColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        renderNode.setRenderEffect(createColorFilterEffect);
        this.renderNodesDownsampled[2].setAlpha(0.25f);
    }

    public void setScale(int i, int i2) {
        this.scaleX = i;
        this.scaleY = i2;
    }

    public void onScrolled(float f, float f2) {
        float f3 = (this.scrollX + f) % this.scaleX;
        this.scrollX = f3;
        this.scrollY = (this.scrollY + f2) % this.scaleY;
        this.renderNodeOriginal.setTranslationX(f3);
        this.renderNodeOriginal.setTranslationY(this.scrollY);
        for (RenderNode renderNode : this.renderNodesRestored) {
            renderNode.setTranslationX(-this.scrollX);
            renderNode.setTranslationY(-this.scrollY);
        }
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

    public static boolean isRecordingCanvas(Canvas canvas) {
        return canvas != null && canvas == recordingCanvas;
    }

    public boolean inRecording() {
        return this.inRecording;
    }

    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderNodesDownsampled[0].setRenderEffect(renderEffect);
    }

    public void draw(Canvas canvas, int i) {
        if (inRecording() || !canvas.isHardwareAccelerated()) {
            throw new IllegalStateException();
        }
        canvas.drawRenderNode(this.renderNodesRestored[i]);
    }

    private void invalidateInternalRenderNodes() {
        int width;
        int height;
        RecordingCanvas beginRecording;
        int width2;
        int height2;
        int width3;
        int height3;
        int width4;
        int height4;
        RecordingCanvas beginRecording2;
        int width5;
        int height5;
        RecordingCanvas beginRecording3;
        width = this.renderNodeOriginal.getWidth();
        int round = Math.round(width / this.scaleX);
        height = this.renderNodeOriginal.getHeight();
        int round2 = Math.round(height / this.scaleY);
        this.renderNodesDownsampled[0].setPosition(0, 0, round, round2);
        beginRecording = this.renderNodesDownsampled[0].beginRecording(round, round2);
        float f = round;
        width2 = this.renderNodeOriginal.getWidth();
        float f2 = round2;
        height2 = this.renderNodeOriginal.getHeight();
        beginRecording.scale(f / width2, f2 / height2);
        beginRecording.drawRenderNode(this.renderNodeOriginal);
        this.renderNodesDownsampled[0].endRecording();
        int i = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.renderNodesDownsampled;
            if (i >= renderNodeArr.length) {
                return;
            }
            if (i > 0) {
                renderNodeArr[i].setPosition(0, 0, round, round2);
                beginRecording3 = this.renderNodesDownsampled[i].beginRecording(round, round2);
                beginRecording3.drawRenderNode(this.renderNodesDownsampled[0]);
                this.renderNodesDownsampled[i].endRecording();
            }
            RenderNode renderNode = this.renderNodesRestored[i];
            width3 = this.renderNodeOriginal.getWidth();
            height3 = this.renderNodeOriginal.getHeight();
            renderNode.setPosition(0, 0, width3, height3);
            RenderNode renderNode2 = this.renderNodesRestored[i];
            width4 = this.renderNodeOriginal.getWidth();
            height4 = this.renderNodeOriginal.getHeight();
            beginRecording2 = renderNode2.beginRecording(width4, height4);
            width5 = this.renderNodeOriginal.getWidth();
            height5 = this.renderNodeOriginal.getHeight();
            beginRecording2.scale(width5 / f, height5 / f2);
            beginRecording2.drawRenderNode(this.renderNodesDownsampled[i]);
            this.renderNodesRestored[i].endRecording();
            i++;
        }
    }
}
