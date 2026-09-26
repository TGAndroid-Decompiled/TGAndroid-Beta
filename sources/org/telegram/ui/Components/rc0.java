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
public final class rc0 {
    public static final float[] f27941k = new float[4];
    public static final Matrix f27942l = new Matrix();
    public final pc0 d;
    public int e;
    public int f27946f;
    public int f27947g;
    public int h;
    public final aa.a f27943a = new aa.a(new fa0(1));
    public final a5.a f27944b = new a5.a(13, (byte) 0);
    public final j10 f27945c = new j10();
    public final Matrix f27948i = new Matrix();
    public final RectF f27949j = new RectF();

    public rc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new pc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f27942l;
        matrix.invert(matrix2);
        float[] fArr2 = f27941k;
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
        RectF rectF2 = this.f27949j;
        rectF2.set(0.0f, 0.0f, this.e, this.f27946f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f27948i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        j10 j10Var = this.f27945c;
        qc0 qc0Var = (qc0) j10Var.f25236c;
        qc0Var.f27590b.set(matrix);
        BitmapShader bitmapShader = qc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        qc0 qc0Var2 = (qc0) j10Var.d;
        qc0Var2.f27590b.set(matrix);
        BitmapShader bitmapShader2 = qc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        pc0 pc0Var = this.d;
        if (pc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = pc0Var.f27320g;
            a(matrix, fArr);
            pc0Var.e.a(fArr);
            pc0Var.f27319f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        j10 j10Var = this.f27945c;
        float[] fArr = (float[]) j10Var.h;
        a(matrix, fArr);
        qc0 qc0Var = (qc0) j10Var.e;
        qc0Var.f27590b.set(matrix);
        BitmapShader bitmapShader = qc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        qc0Var.a(z10);
        pc0 pc0Var = this.d;
        if (pc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = pc0Var.f27320g;
            a(matrix, fArr2);
            qc0 qc0Var2 = pc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            qc0Var2.a(z11);
            pc0Var.e.b(fArr2);
            pc0Var.f27319f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f27943a.m(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f27944b;
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
        this.f27946f = bitmap.getHeight();
        this.f27947g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        pc0 pc0Var = this.d;
        if (pc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return pc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        j10 j10Var = this.f27945c;
        ht htVar = (ht) j10Var.f25237f;
        ht htVar2 = (ht) j10Var.f25238g;
        qc0 qc0Var = (qc0) j10Var.d;
        Paint paint = (Paint) j10Var.f25235b;
        qc0 qc0Var2 = (qc0) j10Var.f25236c;
        boolean b10 = qc0Var2.b(bitmap);
        qc0 qc0Var3 = (qc0) j10Var.e;
        boolean b11 = b10 | qc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((qc0Var.b(bitmap6) | b11) || j10Var.f25234a != 1) {
                j10Var.f25234a = 1;
                paint.setShader(new ComposeShader(qc0Var2.d, new ComposeShader(qc0Var.d, qc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((htVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | htVar.a(-16777216)) || j10Var.f25234a != 2) {
            j10Var.f25234a = 2;
            paint.setShader(new ComposeShader((yf.i) htVar.f24866b, new ComposeShader(new ComposeShader(qc0Var2.d, qc0Var3.d, PorterDuff.Mode.DST_IN), (yf.i) htVar2.f24866b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
