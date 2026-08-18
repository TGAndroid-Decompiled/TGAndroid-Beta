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
import org.telegram.messenger.ApplicationLoader;

public abstract class NinePatchBuilder {

    public interface NinePathRenderer {
        void draw(Canvas canvas, RectF rectF, float[] fArr);
    }

    public static NinePatchDrawable createNinePatch(Bitmap[] bitmapArr, final int i, float[] fArr, final float f, final int i2, final float f2, final float f3, int i3) {
        return createNinePatch(bitmapArr, fArr, f, f2, f3, i3, new NinePathRenderer() {
            @Override
            public final void draw(Canvas canvas, RectF rectF, float[] fArr2) {
                NinePatchBuilder.lambda$createNinePatch$0(i, f, f2, f3, i2, canvas, rectF, fArr2);
            }
        });
    }

    public static void lambda$createNinePatch$0(int i, float f, float f2, float f3, int i2, Canvas canvas, RectF rectF, float[] fArr) {
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        if (f > 0.0f) {
            paint.setShadowLayer(f, f2, f3, i2);
        }
        canvas.drawPath(path, paint);
        if (f > 0.0f) {
            paint.clearShadowLayer();
            canvas.drawPath(path, paint);
        }
    }

    public static NinePatchDrawable createNinePatch(Bitmap[] bitmapArr, float[] fArr, float f, float f2, float f3, int i, NinePathRenderer ninePathRenderer) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap;
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
        int i6 = iCeil6 + iCeil3;
        int iCeil7 = ((int) Math.ceil(fMax10 + 2.0f)) + iCeil4;
        int i7 = iCeil7 + iCeil5;
        if (bitmapArr != null) {
            i2 = i7;
            z = bitmapArr.length == 1;
            if (z) {
                bitmapCreateBitmap = bitmapArr[0];
                i3 = i2;
                if (bitmapCreateBitmap == null && !bitmapCreateBitmap.isRecycled() && bitmapCreateBitmap.isMutable()) {
                    i5 = iCeil5;
                    if (bitmapCreateBitmap.getWidth() == i6 && bitmapCreateBitmap.getHeight() == i3) {
                        i4 = iCeil3;
                        if (bitmapCreateBitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                            bitmapCreateBitmap.eraseColor(0);
                        }
                        if (bitmapCreateBitmap == null) {
                            bitmapCreateBitmap = Bitmap.createBitmap(i6, i3, Bitmap.Config.ARGB_8888);
                        }
                        bitmap = bitmapCreateBitmap;
                        if (z) {
                            bitmapArr[0] = bitmap;
                        }
                        ninePathRenderer.draw(new Canvas(bitmap), new RectF(iCeil2, iCeil4, iCeil6, iCeil7), new float[]{fMax, fMax2, fMax3, fMax4, fMax5, fMax6, fMax7, fMax8});
                        float fMax11 = Math.max(fMax, fMax7);
                        float fMax12 = Math.max(fMax3, fMax5);
                        float fMax13 = Math.max(fMax2, fMax4);
                        float fMax14 = Math.max(fMax8, fMax6);
                        int iClamp = MathUtils.clamp(((int) Math.ceil(fMax11)) + iCeil2, 1, i6 - 2);
                        int iClamp2 = MathUtils.clamp((i6 - i4) - ((int) Math.ceil(fMax12)), iClamp + 1, i6 - 1);
                        int iClamp3 = MathUtils.clamp(((int) Math.ceil(fMax13)) + iCeil4, 1, i3 - 2);
                        return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, createNinePatchChunk(iClamp, iClamp2, iClamp3, MathUtils.clamp((i3 - i5) - ((int) Math.ceil(fMax14)), iClamp3 + 1, i3 - 1), iCeil2, iCeil4, i4, i5, i).array(), new Rect(iCeil2, iCeil4, i4, i5), null);
                    }
                    i4 = iCeil3;
                }
                bitmapCreateBitmap = null;
                if (bitmapCreateBitmap == null) {
                    bitmapCreateBitmap = Bitmap.createBitmap(i6, i3, Bitmap.Config.ARGB_8888);
                }
                bitmap = bitmapCreateBitmap;
                if (z) {
                    bitmapArr[0] = bitmap;
                }
                ninePathRenderer.draw(new Canvas(bitmap), new RectF(iCeil2, iCeil4, iCeil6, iCeil7), new float[]{fMax, fMax2, fMax3, fMax4, fMax5, fMax6, fMax7, fMax8});
                float fMax15 = Math.max(fMax, fMax7);
                float fMax16 = Math.max(fMax3, fMax5);
                float fMax17 = Math.max(fMax2, fMax4);
                float fMax18 = Math.max(fMax8, fMax6);
                int iClamp4 = MathUtils.clamp(((int) Math.ceil(fMax15)) + iCeil2, 1, i6 - 2);
                int iClamp5 = MathUtils.clamp((i6 - i4) - ((int) Math.ceil(fMax16)), iClamp4 + 1, i6 - 1);
                int iClamp6 = MathUtils.clamp(((int) Math.ceil(fMax17)) + iCeil4, 1, i3 - 2);
                return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, createNinePatchChunk(iClamp4, iClamp5, iClamp6, MathUtils.clamp((i3 - i5) - ((int) Math.ceil(fMax18)), iClamp6 + 1, i3 - 1), iCeil2, iCeil4, i4, i5, i).array(), new Rect(iCeil2, iCeil4, i4, i5), null);
            }
            i3 = i2;
            i4 = iCeil3;
            i5 = iCeil5;
            bitmapCreateBitmap = null;
            if (bitmapCreateBitmap == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(i6, i3, Bitmap.Config.ARGB_8888);
            }
            bitmap = bitmapCreateBitmap;
            if (z) {
                bitmapArr[0] = bitmap;
            }
            ninePathRenderer.draw(new Canvas(bitmap), new RectF(iCeil2, iCeil4, iCeil6, iCeil7), new float[]{fMax, fMax2, fMax3, fMax4, fMax5, fMax6, fMax7, fMax8});
            float fMax19 = Math.max(fMax, fMax7);
            float fMax110 = Math.max(fMax3, fMax5);
            float fMax111 = Math.max(fMax2, fMax4);
            float fMax112 = Math.max(fMax8, fMax6);
            int iClamp7 = MathUtils.clamp(((int) Math.ceil(fMax19)) + iCeil2, 1, i6 - 2);
            int iClamp8 = MathUtils.clamp((i6 - i4) - ((int) Math.ceil(fMax110)), iClamp7 + 1, i6 - 1);
            int iClamp9 = MathUtils.clamp(((int) Math.ceil(fMax111)) + iCeil4, 1, i3 - 2);
            return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, createNinePatchChunk(iClamp7, iClamp8, iClamp9, MathUtils.clamp((i3 - i5) - ((int) Math.ceil(fMax112)), iClamp9 + 1, i3 - 1), iCeil2, iCeil4, i4, i5, i).array(), new Rect(iCeil2, iCeil4, i4, i5), null);
        }
        i2 = i7;
        if (z) {
            bitmapCreateBitmap = bitmapArr[0];
            i3 = i2;
            if (bitmapCreateBitmap == null) {
            }
            if (bitmapCreateBitmap == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(i6, i3, Bitmap.Config.ARGB_8888);
            }
            bitmap = bitmapCreateBitmap;
            if (z) {
                bitmapArr[0] = bitmap;
            }
            ninePathRenderer.draw(new Canvas(bitmap), new RectF(iCeil2, iCeil4, iCeil6, iCeil7), new float[]{fMax, fMax2, fMax3, fMax4, fMax5, fMax6, fMax7, fMax8});
            float fMax113 = Math.max(fMax, fMax7);
            float fMax114 = Math.max(fMax3, fMax5);
            float fMax115 = Math.max(fMax2, fMax4);
            float fMax116 = Math.max(fMax8, fMax6);
            int iClamp10 = MathUtils.clamp(((int) Math.ceil(fMax113)) + iCeil2, 1, i6 - 2);
            int iClamp11 = MathUtils.clamp((i6 - i4) - ((int) Math.ceil(fMax114)), iClamp10 + 1, i6 - 1);
            int iClamp12 = MathUtils.clamp(((int) Math.ceil(fMax115)) + iCeil4, 1, i3 - 2);
            return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, createNinePatchChunk(iClamp10, iClamp11, iClamp12, MathUtils.clamp((i3 - i5) - ((int) Math.ceil(fMax116)), iClamp12 + 1, i3 - 1), iCeil2, iCeil4, i4, i5, i).array(), new Rect(iCeil2, iCeil4, i4, i5), null);
        }
        i3 = i2;
        i4 = iCeil3;
        i5 = iCeil5;
        bitmapCreateBitmap = null;
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(i6, i3, Bitmap.Config.ARGB_8888);
        }
        bitmap = bitmapCreateBitmap;
        if (z) {
            bitmapArr[0] = bitmap;
        }
        ninePathRenderer.draw(new Canvas(bitmap), new RectF(iCeil2, iCeil4, iCeil6, iCeil7), new float[]{fMax, fMax2, fMax3, fMax4, fMax5, fMax6, fMax7, fMax8});
        float fMax117 = Math.max(fMax, fMax7);
        float fMax118 = Math.max(fMax3, fMax5);
        float fMax119 = Math.max(fMax2, fMax4);
        float fMax1110 = Math.max(fMax8, fMax6);
        int iClamp13 = MathUtils.clamp(((int) Math.ceil(fMax117)) + iCeil2, 1, i6 - 2);
        int iClamp14 = MathUtils.clamp((i6 - i4) - ((int) Math.ceil(fMax118)), iClamp13 + 1, i6 - 1);
        int iClamp15 = MathUtils.clamp(((int) Math.ceil(fMax119)) + iCeil4, 1, i3 - 2);
        return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, createNinePatchChunk(iClamp13, iClamp14, iClamp15, MathUtils.clamp((i3 - i5) - ((int) Math.ceil(fMax1110)), iClamp15 + 1, i3 - 1), iCeil2, iCeil4, i4, i5, i).array(), new Rect(iCeil2, iCeil4, i4, i5), null);
    }

    public static NinePatchDrawable createNinePatch(Bitmap bitmap, Rect rect, int i, int i2) {
        if (bitmap == null) {
            throw new IllegalArgumentException("bitmap == null");
        }
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("bitmap is recycled");
        }
        if (i < 0 || i >= bitmap.getWidth() || i2 < 0 || i2 >= bitmap.getHeight()) {
            throw new IllegalArgumentException("center pixel is outside bitmap: (" + i + ", " + i2 + ") for " + bitmap.getWidth() + "x" + bitmap.getHeight());
        }
        return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, createNinePatchChunk(i, i + 1, i2, i2 + 1, rect.left, rect.top, rect.right, rect.bottom, bitmap.getPixel(i, i2)).array(), rect, null);
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
