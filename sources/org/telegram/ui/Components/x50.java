package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x50 {
    public final ByteBuffer[] f31172a = new ByteBuffer[10];
    public final long[] f31173b = new long[10];
    public final int[] f31174c = new int[10];
    public int d;
    public int e;
    public boolean f31175f;

    public x50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f31172a[i10] = ByteBuffer.allocateDirect(2048);
            this.f31172a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
