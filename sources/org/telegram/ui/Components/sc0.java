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
public final class sc0 {
    public static final float[] f28236k = new float[4];
    public static final Matrix f28237l = new Matrix();
    public final qc0 d;
    public int e;
    public int f28241f;
    public int f28242g;
    public int h;
    public final aa.a f28238a = new aa.a(new ga0(1));
    public final a5.a f28239b = new a5.a(13, (byte) 0);
    public final k10 f28240c = new k10();
    public final Matrix f28243i = new Matrix();
    public final RectF f28244j = new RectF();

    public sc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new qc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f28237l;
        matrix.invert(matrix2);
        float[] fArr2 = f28236k;
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
        RectF rectF2 = this.f28244j;
        rectF2.set(0.0f, 0.0f, this.e, this.f28241f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f28243i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        k10 k10Var = this.f28240c;
        rc0 rc0Var = (rc0) k10Var.f25593c;
        rc0Var.f27890b.set(matrix);
        BitmapShader bitmapShader = rc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        rc0 rc0Var2 = (rc0) k10Var.d;
        rc0Var2.f27890b.set(matrix);
        BitmapShader bitmapShader2 = rc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        qc0 qc0Var = this.d;
        if (qc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = qc0Var.f27651g;
            a(matrix, fArr);
            qc0Var.e.a(fArr);
            qc0Var.f27650f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        k10 k10Var = this.f28240c;
        float[] fArr = (float[]) k10Var.h;
        a(matrix, fArr);
        rc0 rc0Var = (rc0) k10Var.e;
        rc0Var.f27890b.set(matrix);
        BitmapShader bitmapShader = rc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        rc0Var.a(z10);
        qc0 qc0Var = this.d;
        if (qc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = qc0Var.f27651g;
            a(matrix, fArr2);
            rc0 rc0Var2 = qc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            rc0Var2.a(z11);
            qc0Var.e.b(fArr2);
            qc0Var.f27650f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f28238a.m(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f28239b;
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
        this.f28241f = bitmap.getHeight();
        this.f28242g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        qc0 qc0Var = this.d;
        if (qc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return qc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        k10 k10Var = this.f28240c;
        jt jtVar = (jt) k10Var.f25594f;
        jt jtVar2 = (jt) k10Var.f25595g;
        rc0 rc0Var = (rc0) k10Var.d;
        Paint paint = (Paint) k10Var.f25592b;
        rc0 rc0Var2 = (rc0) k10Var.f25593c;
        boolean b10 = rc0Var2.b(bitmap);
        rc0 rc0Var3 = (rc0) k10Var.e;
        boolean b11 = b10 | rc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((rc0Var.b(bitmap6) | b11) || k10Var.f25591a != 1) {
                k10Var.f25591a = 1;
                paint.setShader(new ComposeShader(rc0Var2.d, new ComposeShader(rc0Var.d, rc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((jtVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | jtVar.a(-16777216)) || k10Var.f25591a != 2) {
            k10Var.f25591a = 2;
            paint.setShader(new ComposeShader((yf.i) jtVar.f25523b, new ComposeShader(new ComposeShader(rc0Var2.d, rc0Var3.d, PorterDuff.Mode.DST_IN), (yf.i) jtVar2.f25523b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
