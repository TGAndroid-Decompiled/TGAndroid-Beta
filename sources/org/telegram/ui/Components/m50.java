package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class m50 {
    public final ByteBuffer[] f26300a = new ByteBuffer[10];
    public final long[] f26301b = new long[10];
    public final int[] f26302c = new int[10];
    public int d;
    public int e;
    public boolean f26303f;

    public m50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f26300a[i10] = ByteBuffer.allocateDirect(2048);
            this.f26300a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
