package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class c60 {
    public final ByteBuffer[] f25244a = new ByteBuffer[10];
    public final long[] f25245b = new long[10];
    public final int[] f25246c = new int[10];
    public int d;
    public int f25247e;
    public boolean f25248f;

    public c60() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f25244a[i10] = ByteBuffer.allocateDirect(2048);
            this.f25244a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
