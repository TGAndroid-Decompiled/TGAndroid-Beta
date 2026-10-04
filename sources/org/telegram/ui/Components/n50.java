package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class n50 {
    public final ByteBuffer[] f28864a = new ByteBuffer[10];
    public final long[] f28865b = new long[10];
    public final int[] f28866c = new int[10];
    public int d;
    public int f28867e;
    public boolean f28868f;

    public n50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f28864a[i10] = ByteBuffer.allocateDirect(2048);
            this.f28864a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
