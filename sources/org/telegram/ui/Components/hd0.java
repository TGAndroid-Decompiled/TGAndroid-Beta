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
    public static final float[] f25644k = new float[4];
    public static final Matrix f25645l = new Matrix();
    public final fd0 d;
    public int e;
    public int f25649f;
    public int f25650g;
    public int h;
    public final androidx.biometric.e f25646a = new androidx.biometric.e(new l2(18));
    public final a5.a f25647b = new a5.a(14, (byte) 0);
    public final u10 f25648c = new u10();
    public final Matrix f25651i = new Matrix();
    public final RectF f25652j = new RectF();

    public hd0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new fd0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f25645l;
        matrix.invert(matrix2);
        float[] fArr2 = f25644k;
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
        RectF rectF2 = this.f25652j;
        rectF2.set(0.0f, 0.0f, this.e, this.f25649f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f25651i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        u10 u10Var = this.f25648c;
        gd0 gd0Var = (gd0) u10Var.f29564c;
        gd0Var.f25251b.set(matrix);
        BitmapShader bitmapShader = gd0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        gd0 gd0Var2 = (gd0) u10Var.d;
        gd0Var2.f25251b.set(matrix);
        BitmapShader bitmapShader2 = gd0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        fd0 fd0Var = this.d;
        if (fd0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = fd0Var.f25015g;
            a(matrix, fArr);
            fd0Var.e.a(fArr);
            fd0Var.f25014f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        u10 u10Var = this.f25648c;
        float[] fArr = (float[]) u10Var.h;
        a(matrix, fArr);
        gd0 gd0Var = (gd0) u10Var.e;
        gd0Var.f25251b.set(matrix);
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
            float[] fArr2 = fd0Var.f25015g;
            a(matrix, fArr2);
            gd0 gd0Var2 = fd0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            gd0Var2.a(z11);
            fd0Var.e.b(fArr2);
            fd0Var.f25014f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f25646a.o(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f25647b;
            hh.a aVar2 = (hh.a) aVar.f280c;
            if (aVar2.a(bitmap) || k10 != aVar.f279b || ((Bitmap) aVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) aVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) aVar.d).getHeight() != bitmap.getHeight()) {
                    aVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) aVar.d, k10);
                aVar2.b(bitmap);
                aVar.f279b = k10;
            }
            bitmap3 = (Bitmap) aVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f25649f = bitmap.getHeight();
        this.f25650g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        fd0 fd0Var = this.d;
        if (fd0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return fd0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        u10 u10Var = this.f25648c;
        ut utVar = (ut) u10Var.f29565f;
        ut utVar2 = (ut) u10Var.f29566g;
        gd0 gd0Var = (gd0) u10Var.d;
        Paint paint = (Paint) u10Var.f29563b;
        gd0 gd0Var2 = (gd0) u10Var.f29564c;
        boolean b10 = gd0Var2.b(bitmap);
        gd0 gd0Var3 = (gd0) u10Var.e;
        boolean b11 = b10 | gd0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((gd0Var.b(bitmap6) | b11) || u10Var.f29562a != 1) {
                u10Var.f29562a = 1;
                paint.setShader(new ComposeShader(gd0Var2.d, new ComposeShader(gd0Var.d, gd0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((utVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | utVar.a(-16777216)) || u10Var.f29562a != 2) {
            u10Var.f29562a = 2;
            paint.setShader(new ComposeShader((zf.j) utVar.f29768b, new ComposeShader(new ComposeShader(gd0Var2.d, gd0Var3.d, PorterDuff.Mode.DST_IN), (zf.j) utVar2.f29768b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
