package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class j50 {
    public final ByteBuffer[] f25174a = new ByteBuffer[10];
    public final long[] f25175b = new long[10];
    public final int[] f25176c = new int[10];
    public int d;
    public int e;
    public boolean f25177f;

    public j50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f25174a[i10] = ByteBuffer.allocateDirect(2048);
            this.f25174a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
