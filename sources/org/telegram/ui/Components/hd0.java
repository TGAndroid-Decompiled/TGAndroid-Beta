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
public final class hd0 {
    public static final float[] f27040k = new float[4];
    public static final Matrix f27041l = new Matrix();
    public final fd0 d;
    public int f27045e;
    public int f27046f;
    public int f27047g;
    public int h;
    public final aa.a f27042a = new aa.a(new f2(23));
    public final a5.a f27043b = new a5.a(14, (byte) 0);
    public final y10 f27044c = new y10();
    public final Matrix f27048i = new Matrix();
    public final RectF f27049j = new RectF();

    public hd0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new fd0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f27041l;
        matrix.invert(matrix2);
        float[] fArr2 = f27040k;
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
        RectF rectF2 = this.f27049j;
        rectF2.set(0.0f, 0.0f, this.f27045e, this.f27046f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f27048i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        y10 y10Var = this.f27044c;
        gd0 gd0Var = (gd0) y10Var.f33095c;
        gd0Var.f26681b.set(matrix);
        BitmapShader bitmapShader = gd0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        gd0 gd0Var2 = (gd0) y10Var.d;
        gd0Var2.f26681b.set(matrix);
        BitmapShader bitmapShader2 = gd0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        fd0 fd0Var = this.d;
        if (fd0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = fd0Var.f26353g;
            a(matrix, fArr);
            fd0Var.f26351e.a(fArr);
            fd0Var.f26352f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        y10 y10Var = this.f27044c;
        float[] fArr = (float[]) y10Var.h;
        a(matrix, fArr);
        gd0 gd0Var = (gd0) y10Var.f33096e;
        gd0Var.f26681b.set(matrix);
        BitmapShader bitmapShader = gd0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        gd0Var.a(z10);
        fd0 fd0Var = this.d;
        if (fd0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = fd0Var.f26353g;
            a(matrix, fArr2);
            gd0 gd0Var2 = fd0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            gd0Var2.a(z11);
            fd0Var.f26351e.b(fArr2);
            fd0Var.f26352f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f27042a.m(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f27043b;
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
        this.f27045e = bitmap.getWidth();
        this.f27046f = bitmap.getHeight();
        this.f27047g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        fd0 fd0Var = this.d;
        if (fd0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return fd0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        y10 y10Var = this.f27044c;
        xt xtVar = (xt) y10Var.f33097f;
        xt xtVar2 = (xt) y10Var.f33098g;
        gd0 gd0Var = (gd0) y10Var.d;
        Paint paint = (Paint) y10Var.f33094b;
        gd0 gd0Var2 = (gd0) y10Var.f33095c;
        boolean b10 = gd0Var2.b(bitmap);
        gd0 gd0Var3 = (gd0) y10Var.f33096e;
        boolean b11 = b10 | gd0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((gd0Var.b(bitmap6) | b11) || y10Var.f33093a != 1) {
                y10Var.f33093a = 1;
                paint.setShader(new ComposeShader(gd0Var2.d, new ComposeShader(gd0Var.d, gd0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((xtVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | xtVar.a(-16777216)) || y10Var.f33093a != 2) {
            y10Var.f33093a = 2;
            paint.setShader(new ComposeShader((yf.i) xtVar.f33005b, new ComposeShader(new ComposeShader(gd0Var2.d, gd0Var3.d, PorterDuff.Mode.DST_IN), (yf.i) xtVar2.f33005b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
