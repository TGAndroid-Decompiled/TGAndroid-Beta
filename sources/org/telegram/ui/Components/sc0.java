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
    public static final float[] f28154k = new float[4];
    public static final Matrix f28155l = new Matrix();
    public final qc0 d;
    public int e;
    public int f28159f;
    public int f28160g;
    public int h;
    public final aa.a f28156a = new aa.a(new i2(20));
    public final a5.a f28157b = new a5.a(13, (byte) 0);
    public final i10 f28158c = new i10();
    public final Matrix f28161i = new Matrix();
    public final RectF f28162j = new RectF();

    public sc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new qc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f28155l;
        matrix.invert(matrix2);
        float[] fArr2 = f28154k;
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
        RectF rectF2 = this.f28162j;
        rectF2.set(0.0f, 0.0f, this.e, this.f28159f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f28161i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        i10 i10Var = this.f28158c;
        rc0 rc0Var = (rc0) i10Var.f24940c;
        rc0Var.f27924b.set(matrix);
        BitmapShader bitmapShader = rc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        rc0 rc0Var2 = (rc0) i10Var.d;
        rc0Var2.f27924b.set(matrix);
        BitmapShader bitmapShader2 = rc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        qc0 qc0Var = this.d;
        if (qc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = qc0Var.f27542g;
            a(matrix, fArr);
            qc0Var.e.a(fArr);
            qc0Var.f27541f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        i10 i10Var = this.f28158c;
        float[] fArr = (float[]) i10Var.h;
        a(matrix, fArr);
        rc0 rc0Var = (rc0) i10Var.e;
        rc0Var.f27924b.set(matrix);
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
            float[] fArr2 = qc0Var.f27542g;
            a(matrix, fArr2);
            rc0 rc0Var2 = qc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            rc0Var2.a(z11);
            qc0Var.e.b(fArr2);
            qc0Var.f27541f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f28156a.p(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f28157b;
            gh.a aVar2 = (gh.a) aVar.f277c;
            if (aVar2.a(bitmap) || k10 != aVar.f276b || ((Bitmap) aVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) aVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) aVar.d).getHeight() != bitmap.getHeight()) {
                    aVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) aVar.d, k10);
                aVar2.b(bitmap);
                aVar.f276b = k10;
            }
            bitmap3 = (Bitmap) aVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f28159f = bitmap.getHeight();
        this.f28160g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        qc0 qc0Var = this.d;
        if (qc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return qc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        i10 i10Var = this.f28158c;
        gt gtVar = (gt) i10Var.f24941f;
        gt gtVar2 = (gt) i10Var.f24942g;
        rc0 rc0Var = (rc0) i10Var.d;
        Paint paint = (Paint) i10Var.f24939b;
        rc0 rc0Var2 = (rc0) i10Var.f24940c;
        boolean b10 = rc0Var2.b(bitmap);
        rc0 rc0Var3 = (rc0) i10Var.e;
        boolean b11 = b10 | rc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((rc0Var.b(bitmap6) | b11) || i10Var.f24938a != 1) {
                i10Var.f24938a = 1;
                paint.setShader(new ComposeShader(rc0Var2.d, new ComposeShader(rc0Var.d, rc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((gtVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | gtVar.a(-16777216)) || i10Var.f24938a != 2) {
            i10Var.f24938a = 2;
            paint.setShader(new ComposeShader((yf.i) gtVar.f24618b, new ComposeShader(new ComposeShader(rc0Var2.d, rc0Var3.d, PorterDuff.Mode.DST_IN), (yf.i) gtVar2.f24618b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
