package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x30 {
    public final ByteBuffer[] f40145a = new ByteBuffer[10];
    public final long[] f40146b = new long[10];
    public final int[] f40147c = new int[10];
    public int d;
    public int f40148e;
    public boolean f40149f;

    public x30() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f40145a[i7] = ByteBuffer.allocateDirect(2048);
            this.f40145a[i7].order(ByteOrder.nativeOrder());
        }
    }
}
