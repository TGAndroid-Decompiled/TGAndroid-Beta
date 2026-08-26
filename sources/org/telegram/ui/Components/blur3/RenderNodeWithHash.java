package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;

public final class RenderNodeWithHash {
    public final Blur3HashImpl hashBuilder = new Blur3HashImpl();
    public long lastHash = 0;
    public int lastHeight;
    public int lastWidth;
    public final RenderNode renderNode;
    public final Renderer renderer;

    public interface Renderer {
        void renderNodeCalculateHash(IBlur3Hash iBlur3Hash);

        void renderNodeUpdateDisplayList(Canvas canvas);
    }

    public RenderNodeWithHash(RenderNode renderNode, Renderer renderer) {
        this.renderNode = renderNode;
        this.renderer = renderer;
    }

    public final void updateDisplayListIfNeeded() {
        int width = this.renderNode.getWidth();
        int height = this.renderNode.getHeight();
        Blur3HashImpl blur3HashImpl = this.hashBuilder;
        blur3HashImpl.hash = 0L;
        blur3HashImpl.unsupported = false;
        Renderer renderer = this.renderer;
        renderer.renderNodeCalculateHash(blur3HashImpl);
        long j = blur3HashImpl.unsupported ? -1L : blur3HashImpl.hash;
        boolean z = (this.renderNode.hasDisplayList() && width == this.lastWidth && height == this.lastHeight && j == this.lastHash && j != -1) ? false : true;
        this.lastWidth = width;
        this.lastHeight = height;
        this.lastHash = j;
        if (z) {
            renderer.renderNodeUpdateDisplayList(this.renderNode.beginRecording());
            this.renderNode.endRecording();
        }
    }
}
