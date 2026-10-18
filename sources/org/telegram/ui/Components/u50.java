package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class u50 {
    public final ByteBuffer[] f30896a = new ByteBuffer[10];
    public final long[] f30897b = new long[10];
    public final int[] f30898c = new int[10];
    public int d;
    public int e;
    public boolean f30899f;

    public u50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f30896a[i10] = ByteBuffer.allocateDirect(2048);
            this.f30896a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
