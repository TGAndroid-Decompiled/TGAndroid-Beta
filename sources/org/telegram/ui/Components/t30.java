package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class t30 {
    public final ByteBuffer[] f38235a = new ByteBuffer[10];
    public final long[] f38236b = new long[10];
    public final int[] f38237c = new int[10];
    public int d;
    public int f38238e;
    public boolean f38239f;

    public t30() {
        for (int i3 = 0; i3 < 10; i3++) {
            this.f38235a[i3] = ByteBuffer.allocateDirect(2048);
            this.f38235a[i3].order(ByteOrder.nativeOrder());
        }
    }
}
