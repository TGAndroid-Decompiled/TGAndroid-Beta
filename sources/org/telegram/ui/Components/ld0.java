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
public final class ld0 {
    public static final float[] f28165k = new float[4];
    public static final Matrix f28166l = new Matrix();
    public final jd0 d;
    public int f28170e;
    public int f28171f;
    public int f28172g;
    public int h;
    public final aa.a f28167a = new aa.a(new f2(23));
    public final a5.a f28168b = new a5.a(14, (byte) 0);
    public final b20 f28169c = new b20();
    public final Matrix f28173i = new Matrix();
    public final RectF f28174j = new RectF();

    public ld0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new jd0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f28166l;
        matrix.invert(matrix2);
        float[] fArr2 = f28165k;
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
        RectF rectF2 = this.f28174j;
        rectF2.set(0.0f, 0.0f, this.f28170e, this.f28171f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f28173i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        b20 b20Var = this.f28169c;
        kd0 kd0Var = (kd0) b20Var.f24553c;
        kd0Var.f27843b.set(matrix);
        BitmapShader bitmapShader = kd0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        kd0 kd0Var2 = (kd0) b20Var.d;
        kd0Var2.f27843b.set(matrix);
        BitmapShader bitmapShader2 = kd0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        jd0 jd0Var = this.d;
        if (jd0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = jd0Var.f27478g;
            a(matrix, fArr);
            jd0Var.f27476e.a(fArr);
            jd0Var.f27477f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        b20 b20Var = this.f28169c;
        float[] fArr = (float[]) b20Var.h;
        a(matrix, fArr);
        kd0 kd0Var = (kd0) b20Var.f24554e;
        kd0Var.f27843b.set(matrix);
        BitmapShader bitmapShader = kd0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        kd0Var.a(z10);
        jd0 jd0Var = this.d;
        if (jd0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = jd0Var.f27478g;
            a(matrix, fArr2);
            kd0 kd0Var2 = jd0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            kd0Var2.a(z11);
            jd0Var.f27476e.b(fArr2);
            jd0Var.f27477f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f28167a.n(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f28168b;
            gh.a aVar2 = (gh.a) aVar.f300c;
            if (aVar2.a(bitmap) || k10 != aVar.f299b || ((Bitmap) aVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) aVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) aVar.d).getHeight() != bitmap.getHeight()) {
                    aVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) aVar.d, k10);
                aVar2.b(bitmap);
                aVar.f299b = k10;
            }
            bitmap3 = (Bitmap) aVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.f28170e = bitmap.getWidth();
        this.f28171f = bitmap.getHeight();
        this.f28172g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        jd0 jd0Var = this.d;
        if (jd0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return jd0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        b20 b20Var = this.f28169c;
        zt ztVar = (zt) b20Var.f24555f;
        zt ztVar2 = (zt) b20Var.f24556g;
        kd0 kd0Var = (kd0) b20Var.d;
        Paint paint = (Paint) b20Var.f24552b;
        kd0 kd0Var2 = (kd0) b20Var.f24553c;
        boolean b10 = kd0Var2.b(bitmap);
        kd0 kd0Var3 = (kd0) b20Var.f24554e;
        boolean b11 = b10 | kd0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((kd0Var.b(bitmap6) | b11) || b20Var.f24551a != 1) {
                b20Var.f24551a = 1;
                paint.setShader(new ComposeShader(kd0Var2.d, new ComposeShader(kd0Var.d, kd0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((ztVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | ztVar.a(-16777216)) || b20Var.f24551a != 2) {
            b20Var.f24551a = 2;
            paint.setShader(new ComposeShader((yf.i) ztVar.f33490b, new ComposeShader(new ComposeShader(kd0Var2.d, kd0Var3.d, PorterDuff.Mode.DST_IN), (yf.i) ztVar2.f33490b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
