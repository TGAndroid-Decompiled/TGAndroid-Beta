package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class y40 {

    public final ByteBuffer[] f34803a = new ByteBuffer[10];

    public final long[] f34804b = new long[10];

    public final int[] f34805c = new int[10];
    public int d;

    public int f34806e;

    public boolean f34807f;

    public y40() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f34803a[i10] = ByteBuffer.allocateDirect(2048);
            this.f34803a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
