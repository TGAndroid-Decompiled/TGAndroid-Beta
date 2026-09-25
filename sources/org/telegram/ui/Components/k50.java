package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class k50 {
    public final ByteBuffer[] f25661a = new ByteBuffer[10];
    public final long[] f25662b = new long[10];
    public final int[] f25663c = new int[10];
    public int d;
    public int e;
    public boolean f25664f;

    public k50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f25661a[i10] = ByteBuffer.allocateDirect(2048);
            this.f25661a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
