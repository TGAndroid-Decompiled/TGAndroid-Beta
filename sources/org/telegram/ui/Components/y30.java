package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class y30 {
    public final ByteBuffer[] f40556a = new ByteBuffer[10];
    public final long[] f40557b = new long[10];
    public final int[] f40558c = new int[10];
    public int d;
    public int f40559e;
    public boolean f40560f;

    public y30() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f40556a[i7] = ByteBuffer.allocateDirect(2048);
            this.f40556a[i7].order(ByteOrder.nativeOrder());
        }
    }
}
