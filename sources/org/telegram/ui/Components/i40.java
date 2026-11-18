package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class i40 {
    public final ByteBuffer[] f36041a = new ByteBuffer[10];
    public final long[] f36042b = new long[10];
    public final int[] f36043c = new int[10];
    public int d;
    public int f36044e;
    public boolean f36045f;

    public i40() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f36041a[i7] = ByteBuffer.allocateDirect(2048);
            this.f36041a[i7].order(ByteOrder.nativeOrder());
        }
    }
}
