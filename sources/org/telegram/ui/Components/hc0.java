package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.os.Build;
import org.telegram.messenger.Utilities;
public final class hc0 {
    public static final float[] f24633k = new float[4];
    public static final Matrix f24634l = new Matrix();
    public final fc0 d;
    public int e;
    public int f24638f;
    public int f24639g;
    public int h;
    public final aa.a f24635a = new aa.a(new l2(16));
    public final a5.a f24636b = new a5.a(13, (byte) 0);
    public final i10 f24637c = new i10();
    public final Matrix f24640i = new Matrix();
    public final RectF f24641j = new RectF();

    public hc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new fc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f24634l;
        matrix.invert(matrix2);
        float[] fArr2 = f24633k;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 1.0f;
        fArr2[3] = 1.0f;
        matrix2.mapPoints(fArr2);
        fArr[0] = fArr2[2] - fArr2[0];
        fArr[1] = fArr2[3] - fArr2[1];
        fArr[2] = fArr2[0];
        fArr[3] = fArr2[1];
    }

    public static boolean b(float f7) {
        if (Math.abs(f7 - 1.0f) <= 1.0E-4f) {
            return true;
        }
        return false;
    }

    public final void c(RectF rectF) {
        RectF rectF2 = this.f24641j;
        rectF2.set(0.0f, 0.0f, this.e, this.f24638f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f24640i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        i10 i10Var = this.f24637c;
        gc0 gc0Var = (gc0) i10Var.f24797c;
        gc0Var.f24171b.set(matrix);
        BitmapShader bitmapShader = gc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        gc0 gc0Var2 = (gc0) i10Var.d;
        gc0Var2.f24171b.set(matrix);
        BitmapShader bitmapShader2 = gc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        fc0 fc0Var = this.d;
        if (fc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = fc0Var.f23872g;
            a(matrix, fArr);
            fc0Var.e.a(fArr);
            fc0Var.f23871f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        i10 i10Var = this.f24637c;
        float[] fArr = (float[]) i10Var.h;
        a(matrix, fArr);
        gc0 gc0Var = (gc0) i10Var.e;
        gc0Var.f24171b.set(matrix);
        BitmapShader bitmapShader = gc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        gc0Var.a(z10);
        fc0 fc0Var = this.d;
        if (fc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = fc0Var.f23872g;
            a(matrix, fArr2);
            gc0 gc0Var2 = fc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            gc0Var2.a(z11);
            fc0Var.e.b(fArr2);
            fc0Var.f23871f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f24635a.o(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f24636b;
            gh.a aVar2 = (gh.a) aVar.f278c;
            if (aVar2.a(bitmap) || k10 != aVar.f277b || ((Bitmap) aVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) aVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) aVar.d).getHeight() != bitmap.getHeight()) {
                    aVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) aVar.d, k10);
                aVar2.b(bitmap);
                aVar.f277b = k10;
            }
            bitmap3 = (Bitmap) aVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f24638f = bitmap.getHeight();
        this.f24639g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        fc0 fc0Var = this.d;
        if (fc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return fc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        i10 i10Var = this.f24637c;
        gt gtVar = (gt) i10Var.f24798f;
        gt gtVar2 = (gt) i10Var.f24799g;
        gc0 gc0Var = (gc0) i10Var.d;
        Paint paint = (Paint) i10Var.f24796b;
        gc0 gc0Var2 = (gc0) i10Var.f24797c;
        boolean b10 = gc0Var2.b(bitmap);
        gc0 gc0Var3 = (gc0) i10Var.e;
        boolean b11 = b10 | gc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((gc0Var.b(bitmap6) | b11) || i10Var.f24795a != 1) {
                i10Var.f24795a = 1;
                paint.setShader(new ComposeShader(gc0Var2.d, new ComposeShader(gc0Var.d, gc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((gtVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | gtVar.a(-16777216)) || i10Var.f24795a != 2) {
            i10Var.f24795a = 2;
            paint.setShader(new ComposeShader((yf.i) gtVar.f24399b, new ComposeShader(new ComposeShader(gc0Var2.d, gc0Var3.d, PorterDuff.Mode.DST_IN), (yf.i) gtVar2.f24399b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
