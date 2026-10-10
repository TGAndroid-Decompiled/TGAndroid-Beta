package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class c60 {
    public final ByteBuffer[] f25206a = new ByteBuffer[10];
    public final long[] f25207b = new long[10];
    public final int[] f25208c = new int[10];
    public int d;
    public int f25209e;
    public boolean f25210f;

    public c60() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f25206a[i10] = ByteBuffer.allocateDirect(2048);
            this.f25206a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
