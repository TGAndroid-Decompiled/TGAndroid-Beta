package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import org.telegram.messenger.MediaDataController;

public class RenderNodeWithHash {
    private final HashBuilder hashBuilder = new HashBuilder();
    private long lastHash = 0;
    private int lastHeight;
    private int lastWidth;
    public final RenderNode renderNode;
    private final Renderer renderer;

    public interface Renderer {
        void renderNodeCalculateHash(HashBuilder hashBuilder);

        void renderNodeUpdateDisplayList(Canvas canvas);
    }

    public RenderNodeWithHash(RenderNode renderNode, Renderer renderer) {
        this.renderNode = renderNode;
        this.renderer = renderer;
    }

    public void updateDisplayListIfNeeded() {
        int width = this.renderNode.getWidth();
        int height = this.renderNode.getHeight();
        this.hashBuilder.reset();
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

    public static class HashBuilder {
        private long hash;

        public void reset() {
            this.hash = 0L;
        }

        public long get() {
            return this.hash;
        }

        public void add(long j) {
            this.hash = MediaDataController.calcHash(this.hash, j);
        }

        public void addF(float f) {
            this.hash = MediaDataController.calcHash(this.hash, Float.floatToIntBits(f));
        }

        public void add(boolean z) {
            this.hash = MediaDataController.calcHash(this.hash, z ? 1L : 0L);
        }

        public void unsupported() {
            this.hash = -1L;
        }
    }
}
