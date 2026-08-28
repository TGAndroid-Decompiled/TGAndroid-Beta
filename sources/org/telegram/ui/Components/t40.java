package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class t40 {
    public final ByteBuffer[] f32621a = new ByteBuffer[10];
    public final long[] f32622b = new long[10];
    public final int[] f32623c = new int[10];
    public int d;
    public int f32624e;
    public boolean f32625f;

    public t40() {
        for (int i9 = 0; i9 < 10; i9++) {
            this.f32621a[i9] = ByteBuffer.allocateDirect(2048);
            this.f32621a[i9].order(ByteOrder.nativeOrder());
        }
    }
}
