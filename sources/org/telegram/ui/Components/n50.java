package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class n50 {
    public final ByteBuffer[] f26586a = new ByteBuffer[10];
    public final long[] f26587b = new long[10];
    public final int[] f26588c = new int[10];
    public int d;
    public int e;
    public boolean f26589f;

    public n50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f26586a[i10] = ByteBuffer.allocateDirect(2048);
            this.f26586a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
