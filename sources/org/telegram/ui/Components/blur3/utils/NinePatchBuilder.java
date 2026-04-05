package org.telegram.ui.Components.blur3.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class NinePatchBuilder {
    public static android.graphics.drawable.NinePatchDrawable createNinePatch(android.graphics.Bitmap[] r29, int r30, float[] r31, float r32, int r33, float r34, float r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.blur3.utils.NinePatchBuilder.createNinePatch(android.graphics.Bitmap[], int, float[], float, int, float, float, int):android.graphics.drawable.NinePatchDrawable");
    }

    public static ByteBuffer createNinePatchChunk(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 9);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(i5);
        byteBufferOrder.putInt(i7);
        byteBufferOrder.putInt(i6);
        byteBufferOrder.putInt(i8);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(i);
        byteBufferOrder.putInt(i2);
        byteBufferOrder.putInt(i3);
        byteBufferOrder.putInt(i4);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(i9);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(1);
        return byteBufferOrder;
    }
}
