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
public final class id0 {
    public static final float[] f27290k = new float[4];
    public static final Matrix f27291l = new Matrix();
    public final gd0 d;
    public int f27295e;
    public int f27296f;
    public int f27297g;
    public int h;
    public final aa.a f27292a = new aa.a(new e2(25));
    public final a5.a f27293b = new a5.a(14, (byte) 0);
    public final z10 f27294c = new z10();
    public final Matrix f27298i = new Matrix();
    public final RectF f27299j = new RectF();

    public id0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new gd0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f27291l;
        matrix.invert(matrix2);
        float[] fArr2 = f27290k;
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
        RectF rectF2 = this.f27299j;
        rectF2.set(0.0f, 0.0f, this.f27295e, this.f27296f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f27298i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        z10 z10Var = this.f27294c;
        hd0 hd0Var = (hd0) z10Var.f33387c;
        hd0Var.f26976b.set(matrix);
        BitmapShader bitmapShader = hd0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        hd0 hd0Var2 = (hd0) z10Var.d;
        hd0Var2.f26976b.set(matrix);
        BitmapShader bitmapShader2 = hd0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        gd0 gd0Var = this.d;
        if (gd0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = gd0Var.f26695g;
            a(matrix, fArr);
            gd0Var.f26693e.a(fArr);
            gd0Var.f26694f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        z10 z10Var = this.f27294c;
        float[] fArr = (float[]) z10Var.h;
        a(matrix, fArr);
        hd0 hd0Var = (hd0) z10Var.f33388e;
        hd0Var.f26976b.set(matrix);
        BitmapShader bitmapShader = hd0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        hd0Var.a(z10);
        gd0 gd0Var = this.d;
        if (gd0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = gd0Var.f26695g;
            a(matrix, fArr2);
            hd0 hd0Var2 = gd0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            hd0Var2.a(z11);
            gd0Var.f26693e.b(fArr2);
            gd0Var.f26694f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f27292a.m(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f27293b;
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
        this.f27295e = bitmap.getWidth();
        this.f27296f = bitmap.getHeight();
        this.f27297g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        gd0 gd0Var = this.d;
        if (gd0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return gd0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        z10 z10Var = this.f27294c;
        yt ytVar = (yt) z10Var.f33389f;
        yt ytVar2 = (yt) z10Var.f33390g;
        hd0 hd0Var = (hd0) z10Var.d;
        Paint paint = (Paint) z10Var.f33386b;
        hd0 hd0Var2 = (hd0) z10Var.f33387c;
        boolean b10 = hd0Var2.b(bitmap);
        hd0 hd0Var3 = (hd0) z10Var.f33388e;
        boolean b11 = b10 | hd0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((hd0Var.b(bitmap6) | b11) || z10Var.f33385a != 1) {
                z10Var.f33385a = 1;
                paint.setShader(new ComposeShader(hd0Var2.d, new ComposeShader(hd0Var.d, hd0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((ytVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | ytVar.a(-16777216)) || z10Var.f33385a != 2) {
            z10Var.f33385a = 2;
            paint.setShader(new ComposeShader((yf.i) ytVar.f33331b, new ComposeShader(new ComposeShader(hd0Var2.d, hd0Var3.d, PorterDuff.Mode.DST_IN), (yf.i) ytVar2.f33331b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
