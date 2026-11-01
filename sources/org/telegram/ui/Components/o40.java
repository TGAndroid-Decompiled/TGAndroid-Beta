package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class o40 {
    public final ByteBuffer[] f29022a = new ByteBuffer[10];
    public final long[] f29023b = new long[10];
    public final int[] f29024c = new int[10];
    public int d;
    public int e;
    public boolean f29025f;

    public o40() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f29022a[i10] = ByteBuffer.allocateDirect(2048);
            this.f29022a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
