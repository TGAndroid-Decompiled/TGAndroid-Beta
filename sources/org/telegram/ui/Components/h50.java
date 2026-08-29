package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class h50 {
    public final ByteBuffer[] f29064a = new ByteBuffer[10];
    public final long[] f29065b = new long[10];
    public final int[] f29066c = new int[10];
    public int d;
    public int f29067e;
    public boolean f29068f;

    public h50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f29064a[i10] = ByteBuffer.allocateDirect(2048);
            this.f29064a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
