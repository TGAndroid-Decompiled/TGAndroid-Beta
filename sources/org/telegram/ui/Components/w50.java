package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class w50 {
    public final ByteBuffer[] f34367a = new ByteBuffer[10];
    public final long[] f34368b = new long[10];
    public final int[] f34369c = new int[10];
    public int d;
    public int e;
    public boolean f34370f;

    public w50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f34367a[i10] = ByteBuffer.allocateDirect(2048);
            this.f34367a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
