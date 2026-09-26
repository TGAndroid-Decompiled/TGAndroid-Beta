package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class l50 {
    public final ByteBuffer[] f25969a = new ByteBuffer[10];
    public final long[] f25970b = new long[10];
    public final int[] f25971c = new int[10];
    public int d;
    public int e;
    public boolean f25972f;

    public l50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f25969a[i10] = ByteBuffer.allocateDirect(2048);
            this.f25969a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
