package org.telegram.ui.Components.blur3.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import androidx.core.math.MathUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class NinePatchBuilder {
    public static NinePatchDrawable createNinePatch(int i, float[] fArr, float f, int i2, float f2, float f3) {
        if (fArr == null || fArr.length != 8) {
            throw new IllegalArgumentException("radii must have 8 values: TLx,TLy, TRx,TRy, BRx,BRy, BLx,BLy");
        }
        float fMax = Math.max(0.0f, fArr[0]);
        float fMax2 = Math.max(0.0f, fArr[1]);
        float fMax3 = Math.max(0.0f, fArr[2]);
        float fMax4 = Math.max(0.0f, fArr[3]);
        float fMax5 = Math.max(0.0f, fArr[4]);
        float fMax6 = Math.max(0.0f, fArr[5]);
        float fMax7 = Math.max(0.0f, fArr[6]);
        float fMax8 = Math.max(0.0f, fArr[7]);
        int iCeil = (int) Math.ceil(f * 2.0f);
        int iCeil2 = ((int) Math.ceil(Math.max(0.0f, -f2))) + iCeil;
        int iCeil3 = ((int) Math.ceil(Math.max(0.0f, f2))) + iCeil;
        int iCeil4 = ((int) Math.ceil(Math.max(0.0f, -f3))) + iCeil;
        int iCeil5 = iCeil + ((int) Math.ceil(Math.max(0.0f, f3)));
        float fMax9 = Math.max(fMax + fMax3, fMax7 + fMax5);
        float fMax10 = Math.max(fMax2 + fMax8, fMax4 + fMax6);
        int iCeil6 = ((int) Math.ceil(fMax9 + 2.0f)) + iCeil2;
        int i3 = iCeil6 + iCeil3;
        int iCeil7 = ((int) Math.ceil(fMax10 + 2.0f)) + iCeil4;
        int i4 = iCeil7 + iCeil5;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        if (f > 0.0f) {
            paint.setShadowLayer(f, f2, f3, i2);
        }
        RectF rectF = new RectF(iCeil2, iCeil4, iCeil6, iCeil7);
        Path path = new Path();
        path.addRoundRect(rectF, new float[]{fMax, fMax2, fMax3, fMax4, fMax5, fMax6, fMax7, fMax8}, Path.Direction.CW);
        canvas.drawPath(path, paint);
        if (f > 0.0f) {
            paint.clearShadowLayer();
            canvas.drawPath(path, paint);
        }
        float fMax11 = Math.max(fMax, fMax7);
        float fMax12 = Math.max(fMax3, fMax5);
        float fMax13 = Math.max(fMax2, fMax4);
        float fMax14 = Math.max(fMax8, fMax6);
        int iClamp = MathUtils.clamp(((int) Math.ceil(fMax11)) + iCeil2, 1, i3 - 2);
        int iClamp2 = MathUtils.clamp((i3 - iCeil3) - ((int) Math.ceil(fMax12)), iClamp + 1, i3 - 1);
        int iClamp3 = MathUtils.clamp(((int) Math.ceil(fMax13)) + iCeil4, 1, i4 - 2);
        return new NinePatchDrawable(bitmapCreateBitmap, createNinePatchChunk(iClamp, iClamp2, iClamp3, MathUtils.clamp((i4 - iCeil5) - ((int) Math.ceil(fMax14)), iClamp3 + 1, i4 - 1), iCeil2, iCeil4, iCeil3, iCeil5).array(), new Rect(iCeil2, iCeil4, iCeil3, iCeil5), null);
    }

    public static ByteBuffer createNinePatchChunk(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
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
        for (int i9 = 0; i9 < 9; i9++) {
            byteBufferOrder.putInt(1);
        }
        return byteBufferOrder;
    }
}
