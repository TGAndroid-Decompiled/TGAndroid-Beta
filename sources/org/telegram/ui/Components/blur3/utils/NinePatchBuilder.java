package org.telegram.ui.Components.blur3.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DiffUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.ApplicationLoader;

public abstract class NinePatchBuilder {

    public interface NinePathRenderer {
        void draw(Canvas canvas, RectF rectF, float[] fArr);
    }

    public static NinePatchDrawable createNinePatch(Bitmap[] bitmapArr, float[] fArr, float f, float f2, int i, NinePathRenderer ninePathRenderer) {
        boolean z;
        char c;
        Bitmap bitmapCreateBitmap;
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
        int iCeil2 = ((int) Math.ceil(Math.max(0.0f, -0.0f))) + iCeil;
        int iCeil3 = iCeil + ((int) Math.ceil(Math.max(0.0f, 0.0f)));
        int iCeil4 = ((int) Math.ceil(Math.max(0.0f, -f2))) + iCeil;
        int iCeil5 = iCeil + ((int) Math.ceil(Math.max(0.0f, f2)));
        float fMax9 = Math.max(fMax + fMax3, fMax7 + fMax5);
        float fMax10 = Math.max(fMax2 + fMax8, fMax4 + fMax6);
        int iCeil6 = ((int) Math.ceil(fMax9 + 2.0f)) + iCeil2;
        int i2 = iCeil6 + iCeil3;
        int iCeil7 = ((int) Math.ceil(fMax10 + 2.0f)) + iCeil4;
        int i3 = iCeil7 + iCeil5;
        boolean z2 = bitmapArr != null && bitmapArr.length == 1;
        if (z2) {
            c = 1;
            bitmapCreateBitmap = bitmapArr[0];
            if (bitmapCreateBitmap != null && !bitmapCreateBitmap.isRecycled() && bitmapCreateBitmap.isMutable() && bitmapCreateBitmap.getWidth() == i2 && bitmapCreateBitmap.getHeight() == i3) {
                z = z2;
                if (bitmapCreateBitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                    bitmapCreateBitmap.eraseColor(0);
                }
                if (bitmapCreateBitmap == null) {
                    bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                }
                if (z) {
                    bitmapArr[0] = bitmapCreateBitmap;
                }
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                RectF rectF = new RectF(iCeil2, iCeil4, iCeil6, iCeil7);
                float[] fArr2 = new float[8];
                fArr2[0] = fMax;
                fArr2[c] = fMax2;
                fArr2[2] = fMax3;
                fArr2[3] = fMax4;
                fArr2[4] = fMax5;
                fArr2[5] = fMax6;
                fArr2[6] = fMax7;
                fArr2[7] = fMax8;
                ninePathRenderer.draw(canvas, rectF, fArr2);
                float fMax11 = Math.max(fMax, fMax7);
                float fMax12 = Math.max(fMax3, fMax5);
                float fMax13 = Math.max(fMax2, fMax4);
                float fMax14 = Math.max(fMax8, fMax6);
                int iClamp = MathUtils.clamp(iCeil2 + ((int) Math.ceil(fMax11)), 1, i2 - 2);
                int iClamp2 = MathUtils.clamp((i2 - iCeil3) - ((int) Math.ceil(fMax12)), iClamp + 1, i2 - 1);
                int iClamp3 = MathUtils.clamp(((int) Math.ceil(fMax13)) + iCeil4, 1, i3 - 2);
                return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmapCreateBitmap, createNinePatchChunk(iClamp, iClamp2, iClamp3, MathUtils.clamp((i3 - iCeil5) - ((int) Math.ceil(fMax14)), iClamp3 + 1, i3 - 1), iCeil2, iCeil4, iCeil3, iCeil5, i).array(), new Rect(iCeil2, iCeil4, iCeil3, iCeil5), null);
            }
            z = z2;
        } else {
            z = z2;
            c = 1;
        }
        bitmapCreateBitmap = null;
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        }
        if (z) {
            bitmapArr[0] = bitmapCreateBitmap;
        }
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        RectF rectF2 = new RectF(iCeil2, iCeil4, iCeil6, iCeil7);
        float[] fArr3 = new float[8];
        fArr3[0] = fMax;
        fArr3[c] = fMax2;
        fArr3[2] = fMax3;
        fArr3[3] = fMax4;
        fArr3[4] = fMax5;
        fArr3[5] = fMax6;
        fArr3[6] = fMax7;
        fArr3[7] = fMax8;
        ninePathRenderer.draw(canvas2, rectF2, fArr3);
        float fMax15 = Math.max(fMax, fMax7);
        float fMax16 = Math.max(fMax3, fMax5);
        float fMax17 = Math.max(fMax2, fMax4);
        float fMax18 = Math.max(fMax8, fMax6);
        int iClamp4 = MathUtils.clamp(iCeil2 + ((int) Math.ceil(fMax15)), 1, i2 - 2);
        int iClamp5 = MathUtils.clamp((i2 - iCeil3) - ((int) Math.ceil(fMax16)), iClamp4 + 1, i2 - 1);
        int iClamp6 = MathUtils.clamp(((int) Math.ceil(fMax17)) + iCeil4, 1, i3 - 2);
        return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmapCreateBitmap, createNinePatchChunk(iClamp4, iClamp5, iClamp6, MathUtils.clamp((i3 - iCeil5) - ((int) Math.ceil(fMax18)), iClamp6 + 1, i3 - 1), iCeil2, iCeil4, iCeil3, iCeil5, i).array(), new Rect(iCeil2, iCeil4, iCeil3, iCeil5), null);
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

    public static NinePatchDrawable createNinePatch(Bitmap bitmap, Rect rect, int i, int i2) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                if (i >= 0 && i < bitmap.getWidth() && i2 >= 0 && i2 < bitmap.getHeight()) {
                    return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, createNinePatchChunk(i, i + 1, i2, i2 + 1, rect.left, rect.top, rect.right, rect.bottom, bitmap.getPixel(i, i2)).array(), rect, null);
                }
                StringBuilder sbM = DiffUtil.m("center pixel is outside bitmap: (", i, ", ", i2, ") for ");
                sbM.append(bitmap.getWidth());
                sbM.append("x");
                sbM.append(bitmap.getHeight());
                throw new IllegalArgumentException(sbM.toString());
            }
            throw new IllegalArgumentException("bitmap is recycled");
        }
        throw new IllegalArgumentException("bitmap == null");
    }
}
