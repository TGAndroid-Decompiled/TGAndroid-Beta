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
public final class bd0 {
    public static final float[] f24979k = new float[4];
    public static final Matrix f24980l = new Matrix();
    public final zc0 d;
    public int e;
    public int f24984f;
    public int f24985g;
    public int h;
    public final androidx.biometric.e f24981a = new androidx.biometric.e(new d2(24));
    public final a5.a f24982b = new a5.a(14, (byte) 0);
    public final o10 f24983c = new o10(1);
    public final Matrix f24986i = new Matrix();
    public final RectF f24987j = new RectF();

    public bd0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new zc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f24980l;
        matrix.invert(matrix2);
        float[] fArr2 = f24979k;
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
        RectF rectF2 = this.f24987j;
        rectF2.set(0.0f, 0.0f, this.e, this.f24984f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f24986i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        o10 o10Var = this.f24983c;
        ad0 ad0Var = (ad0) o10Var.f29121c;
        ad0Var.f24714b.set(matrix);
        BitmapShader bitmapShader = ad0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        ad0 ad0Var2 = (ad0) o10Var.d;
        ad0Var2.f24714b.set(matrix);
        BitmapShader bitmapShader2 = ad0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        zc0 zc0Var = this.d;
        if (zc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = zc0Var.f33246g;
            a(matrix, fArr);
            zc0Var.e.a(fArr);
            zc0Var.f33245f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        o10 o10Var = this.f24983c;
        float[] fArr = (float[]) o10Var.h;
        a(matrix, fArr);
        ad0 ad0Var = (ad0) o10Var.e;
        ad0Var.f24714b.set(matrix);
        BitmapShader bitmapShader = ad0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        ad0Var.a(z10);
        zc0 zc0Var = this.d;
        if (zc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = zc0Var.f33246g;
            a(matrix, fArr2);
            ad0 ad0Var2 = zc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            ad0Var2.a(z11);
            zc0Var.e.b(fArr2);
            zc0Var.f33245f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f24981a.m(bitmap2);
        if (i12 >= 0) {
            int o10 = i0.a.o(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f24982b;
            hh.a aVar2 = (hh.a) aVar.f282c;
            if (aVar2.a(bitmap) || o10 != aVar.f281b || ((Bitmap) aVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) aVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) aVar.d).getHeight() != bitmap.getHeight()) {
                    aVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) aVar.d, o10);
                aVar2.b(bitmap);
                aVar.f281b = o10;
            }
            bitmap3 = (Bitmap) aVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f24984f = bitmap.getHeight();
        this.f24985g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        zc0 zc0Var = this.d;
        if (zc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return zc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        o10 o10Var = this.f24983c;
        nt ntVar = (nt) o10Var.f29122f;
        nt ntVar2 = (nt) o10Var.f29123g;
        ad0 ad0Var = (ad0) o10Var.d;
        Paint paint = (Paint) o10Var.f29120b;
        ad0 ad0Var2 = (ad0) o10Var.f29121c;
        boolean b10 = ad0Var2.b(bitmap);
        ad0 ad0Var3 = (ad0) o10Var.e;
        boolean b11 = b10 | ad0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((ad0Var.b(bitmap6) | b11) || o10Var.f29119a != 1) {
                o10Var.f29119a = 1;
                paint.setShader(new ComposeShader(ad0Var2.d, new ComposeShader(ad0Var.d, ad0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((ntVar2.a(i0.a.o(-1, ((-i12) * i11) / 100)) | b11 | ntVar.a(-16777216)) || o10Var.f29119a != 2) {
            o10Var.f29119a = 2;
            paint.setShader(new ComposeShader((zf.i) ntVar.f29033b, new ComposeShader(new ComposeShader(ad0Var2.d, ad0Var3.d, PorterDuff.Mode.DST_IN), (zf.i) ntVar2.f29033b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
