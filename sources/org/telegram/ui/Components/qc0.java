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
public final class qc0 {
    public static final float[] f27562k = new float[4];
    public static final Matrix f27563l = new Matrix();
    public final oc0 d;
    public int e;
    public int f27567f;
    public int f27568g;
    public int h;
    public final aa.a f27564a = new aa.a(new j2(18));
    public final a5.a f27565b = new a5.a(13, (byte) 0);
    public final i10 f27566c = new i10();
    public final Matrix f27569i = new Matrix();
    public final RectF f27570j = new RectF();

    public qc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new oc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f27563l;
        matrix.invert(matrix2);
        float[] fArr2 = f27562k;
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
        RectF rectF2 = this.f27570j;
        rectF2.set(0.0f, 0.0f, this.e, this.f27567f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f27569i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        i10 i10Var = this.f27566c;
        pc0 pc0Var = (pc0) i10Var.f24816c;
        pc0Var.f27186b.set(matrix);
        BitmapShader bitmapShader = pc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        pc0 pc0Var2 = (pc0) i10Var.d;
        pc0Var2.f27186b.set(matrix);
        BitmapShader bitmapShader2 = pc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        oc0 oc0Var = this.d;
        if (oc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = oc0Var.f26913g;
            a(matrix, fArr);
            oc0Var.e.a(fArr);
            oc0Var.f26912f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        i10 i10Var = this.f27566c;
        float[] fArr = (float[]) i10Var.h;
        a(matrix, fArr);
        pc0 pc0Var = (pc0) i10Var.e;
        pc0Var.f27186b.set(matrix);
        BitmapShader bitmapShader = pc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        pc0Var.a(z10);
        oc0 oc0Var = this.d;
        if (oc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = oc0Var.f26913g;
            a(matrix, fArr2);
            pc0 pc0Var2 = oc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            pc0Var2.a(z11);
            oc0Var.e.b(fArr2);
            oc0Var.f26912f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f27564a.n(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f27565b;
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
        this.f27567f = bitmap.getHeight();
        this.f27568g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        oc0 oc0Var = this.d;
        if (oc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return oc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        i10 i10Var = this.f27566c;
        gt gtVar = (gt) i10Var.f24817f;
        gt gtVar2 = (gt) i10Var.f24818g;
        pc0 pc0Var = (pc0) i10Var.d;
        Paint paint = (Paint) i10Var.f24815b;
        pc0 pc0Var2 = (pc0) i10Var.f24816c;
        boolean b10 = pc0Var2.b(bitmap);
        pc0 pc0Var3 = (pc0) i10Var.e;
        boolean b11 = b10 | pc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((pc0Var.b(bitmap6) | b11) || i10Var.f24814a != 1) {
                i10Var.f24814a = 1;
                paint.setShader(new ComposeShader(pc0Var2.d, new ComposeShader(pc0Var.d, pc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((gtVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | gtVar.a(-16777216)) || i10Var.f24814a != 2) {
            i10Var.f24814a = 2;
            paint.setShader(new ComposeShader((yf.i) gtVar.f24487b, new ComposeShader(new ComposeShader(pc0Var2.d, pc0Var3.d, PorterDuff.Mode.DST_IN), (yf.i) gtVar2.f24487b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
