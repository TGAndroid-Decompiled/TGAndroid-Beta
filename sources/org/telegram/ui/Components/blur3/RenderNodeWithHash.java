package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;

public class RenderNodeWithHash {
    private final Blur3HashImpl hashBuilder = new Blur3HashImpl();
    private long lastHash = 0;
    private int lastHeight;
    private int lastWidth;
    public final RenderNode renderNode;
    private final Renderer renderer;

    public interface Renderer {
        void renderNodeCalculateHash(IBlur3Hash iBlur3Hash);

        void renderNodeUpdateDisplayList(Canvas canvas);
    }

    public RenderNodeWithHash(RenderNode renderNode, Renderer renderer) {
        this.renderNode = renderNode;
        this.renderer = renderer;
    }

    public void updateDisplayListIfNeeded() {
        int width = this.renderNode.getWidth();
        int height = this.renderNode.getHeight();
        this.hashBuilder.start();
        this.renderer.renderNodeCalculateHash(this.hashBuilder);
        long j = this.hashBuilder.get();
        boolean z = (this.renderNode.hasDisplayList() && width == this.lastWidth && height == this.lastHeight && j == this.lastHash && j != -1) ? false : true;
        this.lastWidth = width;
        this.lastHeight = height;
        this.lastHash = j;
        if (z) {
            this.renderer.renderNodeUpdateDisplayList(this.renderNode.beginRecording());
            this.renderNode.endRecording();
        }
    }
}
