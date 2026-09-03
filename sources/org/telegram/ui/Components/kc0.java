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
public final class kc0 {
    public static final float[] f28385k = new float[4];
    public static final Matrix f28386l = new Matrix();
    public final ic0 d;
    public int f28390e;
    public int f28391f;
    public int f28392g;
    public int h;
    public final s5.m f28387a = new s5.m(new k2(17));
    public final b4.e0 f28388b = new b4.e0(18, (byte) 0);
    public final j10 f28389c = new j10();
    public final Matrix f28393i = new Matrix();
    public final RectF f28394j = new RectF();

    public kc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new ic0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f28386l;
        matrix.invert(matrix2);
        float[] fArr2 = f28385k;
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

    public static boolean b(float f10) {
        if (Math.abs(f10 - 1.0f) <= 1.0E-4f) {
            return true;
        }
        return false;
    }

    public final void c(RectF rectF) {
        RectF rectF2 = this.f28394j;
        rectF2.set(0.0f, 0.0f, this.f28390e, this.f28391f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f28393i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        j10 j10Var = this.f28389c;
        jc0 jc0Var = (jc0) j10Var.f27958c;
        jc0Var.f28081b.set(matrix);
        BitmapShader bitmapShader = jc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        jc0 jc0Var2 = (jc0) j10Var.d;
        jc0Var2.f28081b.set(matrix);
        BitmapShader bitmapShader2 = jc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        ic0 ic0Var = this.d;
        if (ic0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = ic0Var.f27795g;
            a(matrix, fArr);
            ic0Var.f27793e.a(fArr);
            ic0Var.f27794f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z4;
        j10 j10Var = this.f28389c;
        float[] fArr = (float[]) j10Var.h;
        a(matrix, fArr);
        jc0 jc0Var = (jc0) j10Var.f27959e;
        jc0Var.f28081b.set(matrix);
        BitmapShader bitmapShader = jc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z10 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z4 = true;
        } else {
            z4 = false;
        }
        jc0Var.a(z4);
        ic0 ic0Var = this.d;
        if (ic0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = ic0Var.f27795g;
            a(matrix, fArr2);
            jc0 jc0Var2 = ic0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z10 = true;
            }
            jc0Var2.a(z10);
            ic0Var.f27793e.b(fArr2);
            ic0Var.f27794f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z4) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f28387a.i(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            b4.e0 e0Var = this.f28388b;
            ug.a aVar = (ug.a) e0Var.f1475c;
            if (aVar.a(bitmap) || k10 != e0Var.f1474b || ((Bitmap) e0Var.d) == null) {
                Bitmap bitmap5 = (Bitmap) e0Var.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) e0Var.d).getHeight() != bitmap.getHeight()) {
                    e0Var.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) e0Var.d, k10);
                aVar.b(bitmap);
                e0Var.f1474b = k10;
            }
            bitmap3 = (Bitmap) e0Var.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.f28390e = bitmap.getWidth();
        this.f28391f = bitmap.getHeight();
        this.f28392g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        ic0 ic0Var = this.d;
        if (ic0Var != null && z4 && Build.VERSION.SDK_INT >= 33) {
            return ic0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        j10 j10Var = this.f28389c;
        ft ftVar = (ft) j10Var.f27960f;
        ft ftVar2 = (ft) j10Var.f27961g;
        jc0 jc0Var = (jc0) j10Var.d;
        Paint paint = (Paint) j10Var.f27957b;
        jc0 jc0Var2 = (jc0) j10Var.f27958c;
        boolean b10 = jc0Var2.b(bitmap);
        jc0 jc0Var3 = (jc0) j10Var.f27959e;
        boolean b11 = b10 | jc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((jc0Var.b(bitmap6) | b11) || j10Var.f27956a != 1) {
                j10Var.f27956a = 1;
                paint.setShader(new ComposeShader(jc0Var2.d, new ComposeShader(jc0Var.d, jc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((ftVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | ftVar.a(-16777216)) || j10Var.f27956a != 2) {
            j10Var.f27956a = 2;
            paint.setShader(new ComposeShader((lf.k) ftVar.f26996b, new ComposeShader(new ComposeShader(jc0Var2.d, jc0Var3.d, PorterDuff.Mode.DST_IN), (lf.k) ftVar2.f26996b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
