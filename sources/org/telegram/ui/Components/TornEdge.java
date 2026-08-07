package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

public abstract class TornEdge {
    private static int hash(int i, int i2) {
        int i3 = (i * 374761393) + (i2 * 668265263);
        int i4 = (i3 ^ (i3 >>> 13)) * 1274126177;
        return i4 ^ (i4 >>> 16);
    }

    public static final class Params {
        public int seed = 1337;
        public float stepDp = 2.5f;
        public float jitterDp = 1.9f;

        public float maxDeviationDp() {
            return this.jitterDp;
        }

        public int paddingPx() {
            return (int) Math.ceil(TornEdge.px(maxDeviationDp()));
        }
    }

    public static float px(float f) {
        return f * AndroidUtilities.density;
    }

    private static double rand01(int i, int i2) {
        return (hash(i, i2) >>> 8) / 1.6777216E7d;
    }

    public static float[] profile(Params params, int i, int i2) {
        float fMax = Math.max(1.0f, px(params.stepDp));
        float fPx = px(params.jitterDp);
        int iCeil = ((int) Math.ceil(i / fMax)) + 1;
        float[] fArr = new float[iCeil];
        for (int i3 = 0; i3 < iCeil; i3++) {
            fArr[i3] = (float) ((rand01(i3, 40503 ^ i2) - 0.5d) * 2.0d * fPx);
        }
        return fArr;
    }

    public static Path buildSlabPath(Params params, float f, float f2, float f3, float[] fArr, float[] fArr2) {
        float fMax = Math.max(1.0f, px(params.stepDp));
        Path path = new Path();
        if (fArr != null) {
            for (int i = 0; i < fArr.length; i++) {
                float fMin = Math.min(i * fMax, f);
                float f4 = fArr[i] + f2;
                if (i == 0) {
                    path.moveTo(fMin, f4);
                } else {
                    path.lineTo(fMin, f4);
                }
            }
        } else {
            path.moveTo(0.0f, f2);
            path.lineTo(f, f2);
        }
        if (fArr2 != null) {
            for (int length = fArr2.length - 1; length >= 0; length--) {
                path.lineTo(Math.min(length * fMax, f), fArr2[length] + f3);
            }
        } else {
            path.lineTo(f, f3);
            path.lineTo(0.0f, f3);
        }
        path.close();
        return path;
    }

    public static void draw(Canvas canvas, Params params, float f, float f2, float f3, int i, float f4, float[] fArr, float[] fArr2) {
        Path pathBuildSlabPath = buildSlabPath(params, f, f2, f3, fArr, fArr2);
        if (f4 > 0.0f) {
            Path path = new Path();
            RectF rectF = new RectF();
            pathBuildSlabPath.computeBounds(rectF, true);
            path.addRoundRect(new RectF(0.0f, rectF.top, f, rectF.bottom), f4, f4, Path.Direction.CW);
            pathBuildSlabPath.op(path, Path.Op.INTERSECT);
        }
        Paint paint = new Paint(1);
        paint.setColor(i);
        canvas.drawPath(pathBuildSlabPath, paint);
    }

    public static Bitmap createTearBitmap(Params params, int i, int i2) {
        int iPaddingPx = params.paddingPx();
        int iBitmapHeight = bitmapHeight(params);
        float[] fArrProfile = profile(params, i, i2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, iBitmapHeight, Bitmap.Config.ALPHA_8);
        draw(new Canvas(bitmapCreateBitmap), params, i, iPaddingPx, iBitmapHeight - iPaddingPx, -16777216, 0.0f, fArrProfile, fArrProfile);
        return bitmapCreateBitmap;
    }

    public static int fragmentHeight(Params params) {
        return (params.paddingPx() * 2) + solidGuardPx();
    }

    public static int bitmapHeight(Params params) {
        return fragmentHeight(params) * 2;
    }

    private static int solidGuardPx() {
        return Math.max(1, (int) Math.ceil(px(0.5f)));
    }

    public static void drawTopEdge(Canvas canvas, Bitmap bitmap, Params params, int i, float f, float f2, Paint paint) {
        int iFragmentHeight = fragmentHeight(params);
        stamp(canvas, bitmap, i, f, f2, iFragmentHeight, iFragmentHeight, paint);
    }

    public static void drawBottomEdge(Canvas canvas, Bitmap bitmap, Params params, int i, float f, float f2, Paint paint) {
        int iFragmentHeight = fragmentHeight(params);
        stamp(canvas, bitmap, i, f, f2 - iFragmentHeight, 0, iFragmentHeight, paint);
    }

    private static void stamp(Canvas canvas, Bitmap bitmap, int i, float f, float f2, int i2, int i3, Paint paint) {
        int iMin = Math.min(i, bitmap.getWidth());
        int i4 = (int) f;
        int i5 = (int) f2;
        canvas.drawBitmap(bitmap, new Rect(0, i2, iMin, i2 + i3), new Rect(i4, i5, iMin + i4, i3 + i5), paint);
    }
}
