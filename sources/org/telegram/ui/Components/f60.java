package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class f60 {
    public final ByteBuffer[] f25936a = new ByteBuffer[10];
    public final long[] f25937b = new long[10];
    public final int[] f25938c = new int[10];
    public int d;
    public int f25939e;
    public boolean f25940f;

    public f60() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f25936a[i10] = ByteBuffer.allocateDirect(2048);
            this.f25936a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
