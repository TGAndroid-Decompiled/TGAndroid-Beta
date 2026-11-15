package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class a40 {
    public final ByteBuffer[] f32844a = new ByteBuffer[10];
    public final long[] f32845b = new long[10];
    public final int[] f32846c = new int[10];
    public int d;
    public int f32847e;
    public boolean f32848f;

    public a40() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f32844a[i7] = ByteBuffer.allocateDirect(2048);
            this.f32844a[i7].order(ByteOrder.nativeOrder());
        }
    }
}
