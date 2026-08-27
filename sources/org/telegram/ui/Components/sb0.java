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

public final class sb0 {

    public static final float[] f32377k = new float[4];

    public static final Matrix f32378l = new Matrix();
    public final qb0 d;

    public int f32382e;

    public int f32383f;

    public int f32384g;
    public int h;

    public final j9.a f32379a = new j9.a(new c2(23));

    public final b6.a f32380b = new b6.a(17, (byte) 0);

    public final w00 f32381c = new w00();

    public final Matrix f32385i = new Matrix();

    public final RectF f32386j = new RectF();

    public sb0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new qb0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f32378l;
        matrix.invert(matrix2);
        float[] fArr2 = f32377k;
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
        return Math.abs(f10 - 1.0f) <= 1.0E-4f;
    }

    public final void c(RectF rectF) {
        float f10 = this.f32382e;
        float f11 = this.f32383f;
        RectF rectF2 = this.f32386j;
        rectF2.set(0.0f, 0.0f, f10, f11);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f32385i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        w00 w00Var = this.f32381c;
        rb0 rb0Var = (rb0) w00Var.f34083c;
        rb0Var.f32122b.set(matrix);
        BitmapShader bitmapShader = rb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        rb0 rb0Var2 = (rb0) w00Var.d;
        rb0Var2.f32122b.set(matrix);
        BitmapShader bitmapShader2 = rb0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        qb0 qb0Var = this.d;
        if (qb0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr = qb0Var.f31868g;
        a(matrix, fArr);
        qb0Var.f31866e.a(fArr);
        qb0Var.f31867f.a(fArr);
    }

    public final void d(Matrix matrix) {
        w00 w00Var = this.f32381c;
        float[] fArr = (float[]) w00Var.h;
        a(matrix, fArr);
        rb0 rb0Var = (rb0) w00Var.f34084e;
        rb0Var.f32122b.set(matrix);
        BitmapShader bitmapShader = rb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z10 = false;
        rb0Var.a(b(fArr[0]) && b(fArr[1]));
        qb0 qb0Var = this.d;
        if (qb0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr2 = qb0Var.f31868g;
        a(matrix, fArr2);
        rb0 rb0Var2 = qb0Var.d;
        if (b(fArr2[0]) && b(fArr2[1])) {
            z10 = true;
        }
        rb0Var2.a(z10);
        qb0Var.f31866e.b(fArr2);
        qb0Var.f31867f.b(fArr2);
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f32379a.w(bitmap2);
        if (i12 >= 0) {
            int iK = i0.b.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            b6.a aVar = this.f32380b;
            pg.a aVar2 = (pg.a) aVar.f2033b;
            if (aVar2.a(bitmap) || iK != aVar.f2034c || ((Bitmap) aVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) aVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) aVar.d).getHeight() != bitmap.getHeight()) {
                    aVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) aVar.d, iK);
                aVar2.b(bitmap);
                aVar.f2034c = iK;
            }
            bitmap3 = (Bitmap) aVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.f32382e = bitmap.getWidth();
        this.f32383f = bitmap.getHeight();
        this.f32384g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        qb0 qb0Var = this.d;
        if (qb0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return qb0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        w00 w00Var = this.f32381c;
        ts tsVar = (ts) w00Var.f34085f;
        ts tsVar2 = (ts) w00Var.f34086g;
        rb0 rb0Var = (rb0) w00Var.d;
        Paint paint = (Paint) w00Var.f34082b;
        rb0 rb0Var2 = (rb0) w00Var.f34083c;
        boolean zB = rb0Var2.b(bitmap);
        rb0 rb0Var3 = (rb0) w00Var.f34084e;
        boolean zB2 = zB | rb0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((rb0Var.b(bitmap6) | zB2) || w00Var.f34081a != 1) {
                w00Var.f34081a = 1;
                paint.setShader(new ComposeShader(rb0Var2.d, new ComposeShader(rb0Var.d, rb0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((tsVar2.a(i0.b.k(-1, ((-i12) * i11) / 100)) | zB2 | tsVar.a(-16777216)) || w00Var.f34081a != 2) {
            w00Var.f34081a = 2;
            paint.setShader(new ComposeShader((gf.l) tsVar.f32871b, new ComposeShader(new ComposeShader(rb0Var2.d, rb0Var3.d, PorterDuff.Mode.DST_IN), (gf.l) tsVar2.f32871b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
