package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class l40 {
    public final ByteBuffer[] f37094a = new ByteBuffer[10];
    public final long[] f37095b = new long[10];
    public final int[] f37096c = new int[10];
    public int d;
    public int f37097e;
    public boolean f37098f;

    public l40() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f37094a[i7] = ByteBuffer.allocateDirect(2048);
            this.f37094a[i7].order(ByteOrder.nativeOrder());
        }
    }
}
