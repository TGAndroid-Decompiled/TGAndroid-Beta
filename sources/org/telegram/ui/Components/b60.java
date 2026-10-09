package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class b60 {
    public final ByteBuffer[] f24914a = new ByteBuffer[10];
    public final long[] f24915b = new long[10];
    public final int[] f24916c = new int[10];
    public int d;
    public int f24917e;
    public boolean f24918f;

    public b60() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f24914a[i10] = ByteBuffer.allocateDirect(2048);
            this.f24914a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
