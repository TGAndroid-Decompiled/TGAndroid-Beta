package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class o40 {
    public final ByteBuffer[] f28968a = new ByteBuffer[10];
    public final long[] f28969b = new long[10];
    public final int[] f28970c = new int[10];
    public int d;
    public int e;
    public boolean f28971f;

    public o40() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f28968a[i10] = ByteBuffer.allocateDirect(2048);
            this.f28968a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
