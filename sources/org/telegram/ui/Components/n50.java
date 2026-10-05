package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class n50 {
    public final ByteBuffer[] f28971a = new ByteBuffer[10];
    public final long[] f28972b = new long[10];
    public final int[] f28973c = new int[10];
    public int d;
    public int f28974e;
    public boolean f28975f;

    public n50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f28971a[i10] = ByteBuffer.allocateDirect(2048);
            this.f28971a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
