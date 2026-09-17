package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class k50 {
    public final ByteBuffer[] f27694a = new ByteBuffer[10];
    public final long[] f27695b = new long[10];
    public final int[] f27696c = new int[10];
    public int d;
    public int f27697e;
    public boolean f27698f;

    public k50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f27694a[i10] = ByteBuffer.allocateDirect(2048);
            this.f27694a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
