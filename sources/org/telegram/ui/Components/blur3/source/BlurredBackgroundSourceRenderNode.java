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
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableRenderNode;

public class BlurredBackgroundSourceRenderNode implements BlurredBackgroundSource {
    private final ReferenceList drawables = new ReferenceList();
    private final BlurredBackgroundSource fallbackSource;
    private boolean inRecording;
    private RecordingCanvas recordingCanvas;
    private final RenderNode renderNode;

    public BlurredBackgroundSourceRenderNode(BlurredBackgroundSource blurredBackgroundSource) {
        this.fallbackSource = blurredBackgroundSource;
        RenderNode m = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("BlurredBackgroundSourceRenderNode");
        this.renderNode = m;
        m.setClipToBounds(true);
    }

    public void setBlur(float f) {
        this.renderNode.setRenderEffect(f > 0.0f ? RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP) : null);
    }

    public boolean needUpdateDisplayList(int i, int i2) {
        boolean hasDisplayList;
        int width;
        int height;
        hasDisplayList = this.renderNode.hasDisplayList();
        if (hasDisplayList) {
            width = this.renderNode.getWidth();
            if (width == i) {
                height = this.renderNode.getHeight();
                if (height == i2) {
                    return false;
                }
            }
        }
        return true;
    }

    public RecordingCanvas beginRecording(int i, int i2) {
        RecordingCanvas beginRecording;
        if (this.inRecording) {
            throw new IllegalStateException();
        }
        this.inRecording = true;
        this.renderNode.setPosition(0, 0, i, i2);
        beginRecording = this.renderNode.beginRecording(i, i2);
        this.recordingCanvas = beginRecording;
        return beginRecording;
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
            this.fallbackSource.draw(canvas, f, f2, f3, f4);
        } else {
            if (this.inRecording) {
                throw new IllegalStateException();
            }
            canvas.save();
            canvas.clipRect(f, f2, f3, f4);
            canvas.drawRenderNode(this.renderNode);
            canvas.restore();
        }
    }

    public BlurredBackgroundSource getFallbackSource() {
        return this.fallbackSource;
    }

    public int getVisiblePositions(List list, int i, int i2) {
        RectF rectF;
        Iterator it = this.drawables.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            BlurredBackgroundDrawableRenderNode blurredBackgroundDrawableRenderNode = (BlurredBackgroundDrawableRenderNode) it.next();
            if (blurredBackgroundDrawableRenderNode.hasDisplayList() && blurredBackgroundDrawableRenderNode.getAlpha() > 0) {
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

    @Override
    public BlurredBackgroundDrawable createDrawable() {
        BlurredBackgroundDrawableRenderNode blurredBackgroundDrawableRenderNode = new BlurredBackgroundDrawableRenderNode(this);
        this.drawables.add(blurredBackgroundDrawableRenderNode);
        return blurredBackgroundDrawableRenderNode;
    }
}
