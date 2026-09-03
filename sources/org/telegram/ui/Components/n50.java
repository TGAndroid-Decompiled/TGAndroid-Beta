package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class n50 {
    public final ByteBuffer[] f27191a = new ByteBuffer[10];
    public final long[] f27192b = new long[10];
    public final int[] f27193c = new int[10];
    public int d;
    public int e;
    public boolean f27194f;

    public n50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f27191a[i10] = ByteBuffer.allocateDirect(2048);
            this.f27191a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
