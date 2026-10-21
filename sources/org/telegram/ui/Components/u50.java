package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class u50 {
    public final ByteBuffer[] f30850a = new ByteBuffer[10];
    public final long[] f30851b = new long[10];
    public final int[] f30852c = new int[10];
    public int d;
    public int e;
    public boolean f30853f;

    public u50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f30850a[i10] = ByteBuffer.allocateDirect(2048);
            this.f30850a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
