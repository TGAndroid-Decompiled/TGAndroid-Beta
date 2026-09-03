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
public final class jc0 {
    public static final float[] f25935k = new float[4];
    public static final Matrix f25936l = new Matrix();
    public final hc0 d;
    public int e;
    public int f25940f;
    public int f25941g;
    public int h;
    public final s5.m f25937a = new s5.m(new k2(17));
    public final b4.e0 f25938b = new b4.e0(18, (byte) 0);
    public final j10 f25939c = new j10();
    public final Matrix f25942i = new Matrix();
    public final RectF f25943j = new RectF();

    public jc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new hc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f25936l;
        matrix.invert(matrix2);
        float[] fArr2 = f25935k;
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
        RectF rectF2 = this.f25943j;
        rectF2.set(0.0f, 0.0f, this.e, this.f25940f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f25942i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        j10 j10Var = this.f25939c;
        ic0 ic0Var = (ic0) j10Var.f25810c;
        ic0Var.f25684b.set(matrix);
        BitmapShader bitmapShader = ic0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        ic0 ic0Var2 = (ic0) j10Var.d;
        ic0Var2.f25684b.set(matrix);
        BitmapShader bitmapShader2 = ic0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        hc0 hc0Var = this.d;
        if (hc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = hc0Var.f25381g;
            a(matrix, fArr);
            hc0Var.e.a(fArr);
            hc0Var.f25380f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z4;
        j10 j10Var = this.f25939c;
        float[] fArr = (float[]) j10Var.h;
        a(matrix, fArr);
        ic0 ic0Var = (ic0) j10Var.e;
        ic0Var.f25684b.set(matrix);
        BitmapShader bitmapShader = ic0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z10 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z4 = true;
        } else {
            z4 = false;
        }
        ic0Var.a(z4);
        hc0 hc0Var = this.d;
        if (hc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = hc0Var.f25381g;
            a(matrix, fArr2);
            ic0 ic0Var2 = hc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z10 = true;
            }
            ic0Var2.a(z10);
            hc0Var.e.b(fArr2);
            hc0Var.f25380f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z4) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f25937a.i(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            b4.e0 e0Var = this.f25938b;
            tg.a aVar = (tg.a) e0Var.f1379c;
            if (aVar.a(bitmap) || k10 != e0Var.f1378b || ((Bitmap) e0Var.d) == null) {
                Bitmap bitmap5 = (Bitmap) e0Var.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) e0Var.d).getHeight() != bitmap.getHeight()) {
                    e0Var.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) e0Var.d, k10);
                aVar.b(bitmap);
                e0Var.f1378b = k10;
            }
            bitmap3 = (Bitmap) e0Var.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f25940f = bitmap.getHeight();
        this.f25941g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        hc0 hc0Var = this.d;
        if (hc0Var != null && z4 && Build.VERSION.SDK_INT >= 33) {
            return hc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        j10 j10Var = this.f25939c;
        ct ctVar = (ct) j10Var.f25811f;
        ct ctVar2 = (ct) j10Var.f25812g;
        ic0 ic0Var = (ic0) j10Var.d;
        Paint paint = (Paint) j10Var.f25809b;
        ic0 ic0Var2 = (ic0) j10Var.f25810c;
        boolean b10 = ic0Var2.b(bitmap);
        ic0 ic0Var3 = (ic0) j10Var.e;
        boolean b11 = b10 | ic0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((ic0Var.b(bitmap6) | b11) || j10Var.f25808a != 1) {
                j10Var.f25808a = 1;
                paint.setShader(new ComposeShader(ic0Var2.d, new ComposeShader(ic0Var.d, ic0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((ctVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | ctVar.a(-16777216)) || j10Var.f25808a != 2) {
            j10Var.f25808a = 2;
            paint.setShader(new ComposeShader((kf.k) ctVar.f24029b, new ComposeShader(new ComposeShader(ic0Var2.d, ic0Var3.d, PorterDuff.Mode.DST_IN), (kf.k) ctVar2.f24029b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
