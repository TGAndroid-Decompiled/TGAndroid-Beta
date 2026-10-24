package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class s50 {
    public final ByteBuffer[] f30446a = new ByteBuffer[10];
    public final long[] f30447b = new long[10];
    public final int[] f30448c = new int[10];
    public int d;
    public int e;
    public boolean f30449f;

    public s50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f30446a[i10] = ByteBuffer.allocateDirect(2048);
            this.f30446a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
