package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x30 {
    public final ByteBuffer[] f40168a = new ByteBuffer[10];
    public final long[] f40169b = new long[10];
    public final int[] f40170c = new int[10];
    public int d;
    public int f40171e;
    public boolean f40172f;

    public x30() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f40168a[i7] = ByteBuffer.allocateDirect(2048);
            this.f40168a[i7].order(ByteOrder.nativeOrder());
        }
    }
}
