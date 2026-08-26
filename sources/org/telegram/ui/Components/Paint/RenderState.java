package org.telegram.ui.Components.Paint;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class RenderState {
    public int allocatedCount;
    public float alpha;
    public float angle;
    public float baseWeight;
    public ByteBuffer buffer;
    public int count;
    public double remainder;
    public float scale;
    public float spacing;
    public float viewportScale;

    public final boolean addPoint(PointF pointF, float f, float f2, float f3, int i) {
        if ((i == -1 || i < this.allocatedCount) && this.buffer.position() != this.buffer.limit()) {
            if (i != -1) {
                this.buffer.position(i * 20);
            }
            this.buffer.putFloat(pointF.x);
            this.buffer.putFloat(pointF.y);
            this.buffer.putFloat(f);
            this.buffer.putFloat(f2);
            this.buffer.putFloat(f3);
            return true;
        }
        if (this.buffer != null) {
            this.buffer = null;
        }
        int iMax = Math.max(this.allocatedCount * 2, 256);
        this.allocatedCount = iMax;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iMax * 20);
        this.buffer = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.buffer.position(0);
        return false;
    }
}
