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
public final class tc0 {
    public static final float[] f31011k = new float[4];
    public static final Matrix f31012l = new Matrix();
    public final rc0 d;
    public int f31016e;
    public int f31017f;
    public int f31018g;
    public int h;
    public final aa.a f31013a = new aa.a(new ru(3));
    public final a5.a f31014b = new a5.a(13, (byte) 0);
    public final l10 f31015c = new l10();
    public final Matrix f31019i = new Matrix();
    public final RectF f31020j = new RectF();

    public tc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new rc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f31012l;
        matrix.invert(matrix2);
        float[] fArr2 = f31011k;
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
        RectF rectF2 = this.f31020j;
        rectF2.set(0.0f, 0.0f, this.f31016e, this.f31017f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f31019i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        l10 l10Var = this.f31015c;
        sc0 sc0Var = (sc0) l10Var.f28249c;
        sc0Var.f30682b.set(matrix);
        BitmapShader bitmapShader = sc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        sc0 sc0Var2 = (sc0) l10Var.d;
        sc0Var2.f30682b.set(matrix);
        BitmapShader bitmapShader2 = sc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        rc0 rc0Var = this.d;
        if (rc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = rc0Var.f30355g;
            a(matrix, fArr);
            rc0Var.f30353e.a(fArr);
            rc0Var.f30354f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        l10 l10Var = this.f31015c;
        float[] fArr = (float[]) l10Var.h;
        a(matrix, fArr);
        sc0 sc0Var = (sc0) l10Var.f28250e;
        sc0Var.f30682b.set(matrix);
        BitmapShader bitmapShader = sc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc0Var.a(z10);
        rc0 rc0Var = this.d;
        if (rc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = rc0Var.f30355g;
            a(matrix, fArr2);
            sc0 sc0Var2 = rc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            sc0Var2.a(z11);
            rc0Var.f30353e.b(fArr2);
            rc0Var.f30354f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f31013a.l(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f31014b;
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
        this.f31016e = bitmap.getWidth();
        this.f31017f = bitmap.getHeight();
        this.f31018g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        rc0 rc0Var = this.d;
        if (rc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return rc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        l10 l10Var = this.f31015c;
        kt ktVar = (kt) l10Var.f28251f;
        kt ktVar2 = (kt) l10Var.f28252g;
        sc0 sc0Var = (sc0) l10Var.d;
        Paint paint = (Paint) l10Var.f28248b;
        sc0 sc0Var2 = (sc0) l10Var.f28249c;
        boolean b10 = sc0Var2.b(bitmap);
        sc0 sc0Var3 = (sc0) l10Var.f28250e;
        boolean b11 = b10 | sc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((sc0Var.b(bitmap6) | b11) || l10Var.f28247a != 1) {
                l10Var.f28247a = 1;
                paint.setShader(new ComposeShader(sc0Var2.d, new ComposeShader(sc0Var.d, sc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((ktVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | ktVar.a(-16777216)) || l10Var.f28247a != 2) {
            l10Var.f28247a = 2;
            paint.setShader(new ComposeShader((yf.i) ktVar.f28193b, new ComposeShader(new ComposeShader(sc0Var2.d, sc0Var3.d, PorterDuff.Mode.DST_IN), (yf.i) ktVar2.f28193b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
