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
    public static final float[] f28528k = new float[4];
    public static final Matrix f28529l = new Matrix();
    public final rc0 d;
    public int e;
    public int f28533f;
    public int f28534g;
    public int h;
    public final aa.a f28530a = new aa.a(new ha0(1));
    public final a5.a f28531b = new a5.a(13, (byte) 0);
    public final k10 f28532c = new k10();
    public final Matrix f28535i = new Matrix();
    public final RectF f28536j = new RectF();

    public tc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new rc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f28529l;
        matrix.invert(matrix2);
        float[] fArr2 = f28528k;
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
        RectF rectF2 = this.f28536j;
        rectF2.set(0.0f, 0.0f, this.e, this.f28533f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f28535i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        k10 k10Var = this.f28532c;
        sc0 sc0Var = (sc0) k10Var.f25566c;
        sc0Var.f28193b.set(matrix);
        BitmapShader bitmapShader = sc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        sc0 sc0Var2 = (sc0) k10Var.d;
        sc0Var2.f28193b.set(matrix);
        BitmapShader bitmapShader2 = sc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        rc0 rc0Var = this.d;
        if (rc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = rc0Var.f27943g;
            a(matrix, fArr);
            rc0Var.e.a(fArr);
            rc0Var.f27942f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        k10 k10Var = this.f28532c;
        float[] fArr = (float[]) k10Var.h;
        a(matrix, fArr);
        sc0 sc0Var = (sc0) k10Var.e;
        sc0Var.f28193b.set(matrix);
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
            float[] fArr2 = rc0Var.f27943g;
            a(matrix, fArr2);
            sc0 sc0Var2 = rc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            sc0Var2.a(z11);
            rc0Var.e.b(fArr2);
            rc0Var.f27942f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f28530a.m(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f28531b;
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
        this.f28533f = bitmap.getHeight();
        this.f28534g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        rc0 rc0Var = this.d;
        if (rc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return rc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        k10 k10Var = this.f28532c;
        jt jtVar = (jt) k10Var.f25567f;
        jt jtVar2 = (jt) k10Var.f25568g;
        sc0 sc0Var = (sc0) k10Var.d;
        Paint paint = (Paint) k10Var.f25565b;
        sc0 sc0Var2 = (sc0) k10Var.f25566c;
        boolean b10 = sc0Var2.b(bitmap);
        sc0 sc0Var3 = (sc0) k10Var.e;
        boolean b11 = b10 | sc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((sc0Var.b(bitmap6) | b11) || k10Var.f25564a != 1) {
                k10Var.f25564a = 1;
                paint.setShader(new ComposeShader(sc0Var2.d, new ComposeShader(sc0Var.d, sc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((jtVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | jtVar.a(-16777216)) || k10Var.f25564a != 2) {
            k10Var.f25564a = 2;
            paint.setShader(new ComposeShader((yf.i) jtVar.f25516b, new ComposeShader(new ComposeShader(sc0Var2.d, sc0Var3.d, PorterDuff.Mode.DST_IN), (yf.i) jtVar2.f25516b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
