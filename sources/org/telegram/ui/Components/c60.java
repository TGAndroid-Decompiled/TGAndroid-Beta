package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class c60 {
    public final ByteBuffer[] f25129a = new ByteBuffer[10];
    public final long[] f25130b = new long[10];
    public final int[] f25131c = new int[10];
    public int d;
    public int f25132e;
    public boolean f25133f;

    public c60() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f25129a[i10] = ByteBuffer.allocateDirect(2048);
            this.f25129a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
