package org.telegram.ui.Components.blur3.source;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableRenderNode;

public class BlurredBackgroundSourceRenderNode implements BlurredBackgroundSource {
    private final BlurredBackgroundSource fallbackSource;
    private boolean inRecording;
    private final RenderNode renderNode;

    public BlurredBackgroundSourceRenderNode(BlurredBackgroundSource blurredBackgroundSource) {
        this.fallbackSource = blurredBackgroundSource;
        RenderNode m = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("BlurredBackgroundSourceRenderNode");
        this.renderNode = m;
        m.setClipToBounds(true);
    }

    public Canvas beginRecording(int i, int i2) {
        RecordingCanvas beginRecording;
        if (this.inRecording) {
            throw new IllegalStateException();
        }
        this.inRecording = true;
        this.renderNode.setPosition(0, 0, i, i2);
        beginRecording = this.renderNode.beginRecording(i, i2);
        return beginRecording;
    }

    public void endRecording() {
        if (!this.inRecording) {
            throw new IllegalStateException();
        }
        this.renderNode.endRecording();
        this.inRecording = false;
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

    @Override
    public BlurredBackgroundDrawable createDrawable() {
        return new BlurredBackgroundDrawableRenderNode(this, this.fallbackSource.createDrawable());
    }
}
