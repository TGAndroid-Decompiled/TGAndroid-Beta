package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class o50 {
    public final ByteBuffer[] f29666a = new ByteBuffer[10];
    public final long[] f29667b = new long[10];
    public final int[] f29668c = new int[10];
    public int d;
    public int f29669e;
    public boolean f29670f;

    public o50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f29666a[i10] = ByteBuffer.allocateDirect(2048);
            this.f29666a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
