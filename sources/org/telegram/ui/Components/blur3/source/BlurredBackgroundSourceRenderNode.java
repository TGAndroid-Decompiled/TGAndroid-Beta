package org.telegram.ui.Components.blur3.source;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import java.util.Iterator;
import java.util.List;
import me.vkryl.core.reference.ReferenceList;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.ui.Components.blur3.RenderNodeWithHash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableRenderNode;

public class BlurredBackgroundSourceRenderNode implements BlurredBackgroundSource {
    private final ReferenceList drawables = new ReferenceList();
    private final BlurredBackgroundSource fallbackSource;
    private boolean inRecording;
    private Runnable onDrawablesRelativePositionChangeListener;
    private RecordingCanvas recordingCanvas;
    private final RenderNode renderNode;
    private RenderNodeWithHash renderNodeWithHash;

    public BlurredBackgroundSourceRenderNode(BlurredBackgroundSource blurredBackgroundSource) {
        this.fallbackSource = blurredBackgroundSource;
        RenderNode renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
        this.renderNode = renderNodeM;
        renderNodeM.setClipToBounds(true);
    }

    public void setupRenderer(RenderNodeWithHash.Renderer renderer) {
        if (this.renderNodeWithHash == null) {
            this.renderNodeWithHash = new RenderNodeWithHash(this.renderNode, renderer);
        }
    }

    public void updateDisplayListIfNeeded() {
        this.renderNodeWithHash.updateDisplayListIfNeeded();
    }

    public void setSize(int i, int i2) {
        this.renderNode.setPosition(0, 0, i, i2);
    }

    public void setBlur(float f) {
        this.renderNode.setRenderEffect(f > 0.0f ? RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP) : null);
    }

    public boolean needUpdateDisplayList(int i, int i2) {
        return (this.renderNode.hasDisplayList() && this.renderNode.getWidth() == i && this.renderNode.getHeight() == i2) ? false : true;
    }

    public RecordingCanvas beginRecording(int i, int i2) {
        if (this.inRecording) {
            throw new IllegalStateException();
        }
        this.inRecording = true;
        this.renderNode.setPosition(0, 0, i, i2);
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording(i, i2);
        this.recordingCanvas = recordingCanvasBeginRecording;
        return recordingCanvasBeginRecording;
    }

    public void endRecording() {
        if (!this.inRecording) {
            throw new IllegalStateException();
        }
        this.renderNode.endRecording();
        this.inRecording = false;
        this.recordingCanvas = null;
    }

    public boolean isRecordingCanvas(Canvas canvas) {
        return canvas != null && canvas == this.recordingCanvas;
    }

    public boolean inRecording() {
        return this.inRecording;
    }

    @Override
    public void draw(Canvas canvas, float f, float f2, float f3, float f4) {
        if (!canvas.isHardwareAccelerated()) {
            BlurredBackgroundSource blurredBackgroundSource = this.fallbackSource;
            if (blurredBackgroundSource != null) {
                blurredBackgroundSource.draw(canvas, f, f2, f3, f4);
                return;
            }
            return;
        }
        if (this.inRecording) {
            throw new IllegalStateException();
        }
        canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        canvas.drawRenderNode(this.renderNode);
        canvas.restore();
    }

    public BlurredBackgroundSource getFallbackSource() {
        return this.fallbackSource;
    }

    public int getVisiblePositions(List list, int i, int i2) throws InterruptedException {
        RectF rectF;
        Iterator it = this.drawables.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            BlurredBackgroundDrawableRenderNode blurredBackgroundDrawableRenderNode = (BlurredBackgroundDrawableRenderNode) it.next();
            if (blurredBackgroundDrawableRenderNode.hasDisplayList() && blurredBackgroundDrawableRenderNode.getAlpha() > 0 && !blurredBackgroundDrawableRenderNode.getPaddedBounds().isEmpty()) {
                if (i < list.size()) {
                    rectF = (RectF) list.get(i);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                blurredBackgroundDrawableRenderNode.getPositionRelativeSource(rectF);
                float f = -i2;
                rectF.inset(f, f);
                i++;
                i3++;
            }
        }
        return i3;
    }

    public void setOnDrawablesRelativePositionChangeListener(Runnable runnable) {
        this.onDrawablesRelativePositionChangeListener = runnable;
    }

    public void dispatchOnDrawablesRelativePositionChange() {
        Runnable runnable = this.onDrawablesRelativePositionChangeListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public BlurredBackgroundDrawable createDrawable() {
        BlurredBackgroundDrawableRenderNode blurredBackgroundDrawableRenderNode = new BlurredBackgroundDrawableRenderNode(this);
        this.drawables.add(blurredBackgroundDrawableRenderNode);
        return blurredBackgroundDrawableRenderNode;
    }
}
