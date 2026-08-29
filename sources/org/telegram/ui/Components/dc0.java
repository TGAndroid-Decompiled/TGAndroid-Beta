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
public final class dc0 {
    public static final float[] f27734k = new float[4];
    public static final Matrix f27735l = new Matrix();
    public final bc0 d;
    public int f27739e;
    public int f27740f;
    public int f27741g;
    public int h;
    public final l3.g0 f27736a = new l3.g0(new r2(12));
    public final ag.j2 f27737b = new ag.j2(16, (byte) 0);
    public final e10 f27738c = new e10();
    public final Matrix f27742i = new Matrix();
    public final RectF f27743j = new RectF();

    public dc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new bc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f27735l;
        matrix.invert(matrix2);
        float[] fArr2 = f27734k;
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

    public static boolean b(float f9) {
        if (Math.abs(f9 - 1.0f) <= 1.0E-4f) {
            return true;
        }
        return false;
    }

    public final void c(RectF rectF) {
        RectF rectF2 = this.f27743j;
        rectF2.set(0.0f, 0.0f, this.f27739e, this.f27740f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f27742i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        e10 e10Var = this.f27738c;
        cc0 cc0Var = (cc0) e10Var.f27906c;
        cc0Var.f27433b.set(matrix);
        BitmapShader bitmapShader = cc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        cc0 cc0Var2 = (cc0) e10Var.d;
        cc0Var2.f27433b.set(matrix);
        BitmapShader bitmapShader2 = cc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        bc0 bc0Var = this.d;
        if (bc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = bc0Var.f27030g;
            a(matrix, fArr);
            bc0Var.f27028e.a(fArr);
            bc0Var.f27029f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        e10 e10Var = this.f27738c;
        float[] fArr = (float[]) e10Var.h;
        a(matrix, fArr);
        cc0 cc0Var = (cc0) e10Var.f27907e;
        cc0Var.f27433b.set(matrix);
        BitmapShader bitmapShader = cc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        cc0Var.a(z10);
        bc0 bc0Var = this.d;
        if (bc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = bc0Var.f27030g;
            a(matrix, fArr2);
            cc0 cc0Var2 = bc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            cc0Var2.a(z11);
            bc0Var.f27028e.b(fArr2);
            bc0Var.f27029f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f27736a.o(bitmap2);
        if (i12 >= 0) {
            int k9 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            ag.j2 j2Var = this.f27737b;
            rg.a aVar = (rg.a) j2Var.f559c;
            if (aVar.a(bitmap) || k9 != j2Var.f558b || ((Bitmap) j2Var.d) == null) {
                Bitmap bitmap5 = (Bitmap) j2Var.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) j2Var.d).getHeight() != bitmap.getHeight()) {
                    j2Var.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) j2Var.d, k9);
                aVar.b(bitmap);
                j2Var.f558b = k9;
            }
            bitmap3 = (Bitmap) j2Var.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.f27739e = bitmap.getWidth();
        this.f27740f = bitmap.getHeight();
        this.f27741g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        bc0 bc0Var = this.d;
        if (bc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return bc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        e10 e10Var = this.f27738c;
        zs zsVar = (zs) e10Var.f27908f;
        zs zsVar2 = (zs) e10Var.f27909g;
        cc0 cc0Var = (cc0) e10Var.d;
        Paint paint = (Paint) e10Var.f27905b;
        cc0 cc0Var2 = (cc0) e10Var.f27906c;
        boolean b10 = cc0Var2.b(bitmap);
        cc0 cc0Var3 = (cc0) e10Var.f27907e;
        boolean b11 = b10 | cc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((cc0Var.b(bitmap6) | b11) || e10Var.f27904a != 1) {
                e10Var.f27904a = 1;
                paint.setShader(new ComposeShader(cc0Var2.d, new ComposeShader(cc0Var.d, cc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((zsVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | zsVar.a(-16777216)) || e10Var.f27904a != 2) {
            e10Var.f27904a = 2;
            paint.setShader(new ComposeShader((jf.k) zsVar.f35410b, new ComposeShader(new ComposeShader(cc0Var2.d, cc0Var3.d, PorterDuff.Mode.DST_IN), (jf.k) zsVar2.f35410b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
