package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class o50 {
    public final ByteBuffer[] f29672a = new ByteBuffer[10];
    public final long[] f29673b = new long[10];
    public final int[] f29674c = new int[10];
    public int d;
    public int f29675e;
    public boolean f29676f;

    public o50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f29672a[i10] = ByteBuffer.allocateDirect(2048);
            this.f29672a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
