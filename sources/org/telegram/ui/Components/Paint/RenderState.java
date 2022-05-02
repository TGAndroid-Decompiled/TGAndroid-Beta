package org.telegram.ui.Components.Paint;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class RenderState {
    private int allocatedCount;
    public float alpha;
    public float angle;
    public float baseWeight;
    private ByteBuffer buffer;
    private int count;
    public double remainder;
    public float scale;
    public float spacing;
    public float viewportScale;

    public int getCount() {
        return this.count;
    }

    public void prepare() {
        this.count = 0;
        if (this.buffer == null) {
            this.allocatedCount = 256;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
            this.buffer = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
            this.buffer.position(0);
        }
    }

    public float read() {
        return this.buffer.getFloat();
    }

    public void setPosition(int i) {
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null && i >= 0 && i < this.allocatedCount) {
            byteBuffer.position(i * 5 * 4);
        }
    }

    public void appendValuesCount(int i) {
        int i2 = this.count + i;
        if (i2 > this.allocatedCount || this.buffer == null) {
            resizeBuffer();
        }
        this.count = i2;
    }

    public void resizeBuffer() {
        if (this.buffer != null) {
            this.buffer = null;
        }
        int max = Math.max(this.allocatedCount * 2, 256);
        this.allocatedCount = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 5 * 4);
        this.buffer = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.buffer.position(0);
    }

    public boolean addPoint(PointF pointF, float f, float f2, float f3, int i) {
        if ((i == -1 || i < this.allocatedCount) && this.buffer.position() != this.buffer.limit()) {
            if (i != -1) {
                this.buffer.position(i * 5 * 4);
            }
            this.buffer.putFloat(pointF.x);
            this.buffer.putFloat(pointF.y);
            this.buffer.putFloat(f);
            this.buffer.putFloat(f2);
            this.buffer.putFloat(f3);
            return true;
        }
        resizeBuffer();
        return false;
    }

    public void reset() {
        this.count = 0;
        this.remainder = 0.0d;
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
    }
}
