package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class i40 {
    public final ByteBuffer[] f35900a = new ByteBuffer[10];
    public final long[] f35901b = new long[10];
    public final int[] f35902c = new int[10];
    public int d;
    public int f35903e;
    public boolean f35904f;

    public i40() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f35900a[i7] = ByteBuffer.allocateDirect(2048);
            this.f35900a[i7].order(ByteOrder.nativeOrder());
        }
    }
}
