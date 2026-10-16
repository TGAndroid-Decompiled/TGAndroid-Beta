package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class y50 {
    public final ByteBuffer[] f31159a = new ByteBuffer[10];
    public final long[] f31160b = new long[10];
    public final int[] f31161c = new int[10];
    public int d;
    public int e;
    public boolean f31162f;

    public y50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f31159a[i10] = ByteBuffer.allocateDirect(2048);
            this.f31159a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
