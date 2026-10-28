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
public final class ad0 {
    public static final float[] f26532k = new float[4];
    public static final Matrix f26533l = new Matrix();
    public final yc0 d;
    public int e;
    public int f26537f;
    public int f26538g;
    public int h;
    public final a8.h0 f26534a = new a8.h0(new f2(27));
    public final a8.ng f26535b = new a8.ng(16, (byte) 0);
    public final ai.v1 f26536c = new ai.v1(2);
    public final Matrix f26539i = new Matrix();
    public final RectF f26540j = new RectF();

    public ad0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new yc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f26533l;
        matrix.invert(matrix2);
        float[] fArr2 = f26532k;
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
        RectF rectF2 = this.f26540j;
        rectF2.set(0.0f, 0.0f, this.e, this.f26537f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f26539i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        ai.v1 v1Var = this.f26536c;
        zc0 zc0Var = (zc0) v1Var.e;
        zc0Var.f35317b.set(matrix);
        BitmapShader bitmapShader = zc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        zc0 zc0Var2 = (zc0) v1Var.f1958f;
        zc0Var2.f35317b.set(matrix);
        BitmapShader bitmapShader2 = zc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        yc0 yc0Var = this.d;
        if (yc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = yc0Var.f35037g;
            a(matrix, fArr);
            yc0Var.e.a(fArr);
            yc0Var.f35036f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        ai.v1 v1Var = this.f26536c;
        float[] fArr = (float[]) v1Var.h;
        a(matrix, fArr);
        zc0 zc0Var = (zc0) v1Var.f1959g;
        zc0Var.f35317b.set(matrix);
        BitmapShader bitmapShader = zc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        zc0Var.a(z10);
        yc0 yc0Var = this.d;
        if (yc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = yc0Var.f35037g;
            a(matrix, fArr2);
            zc0 zc0Var2 = yc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            zc0Var2.a(z11);
            yc0Var.e.b(fArr2);
            yc0Var.f35036f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f26534a.o(bitmap2);
        if (i12 >= 0) {
            int o10 = i0.a.o(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a8.ng ngVar = this.f26535b;
            ih.a aVar = (ih.a) ngVar.f640c;
            if (aVar.a(bitmap) || o10 != ngVar.f639b || ((Bitmap) ngVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) ngVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) ngVar.d).getHeight() != bitmap.getHeight()) {
                    ngVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) ngVar.d, o10);
                aVar.b(bitmap);
                ngVar.f639b = o10;
            }
            bitmap3 = (Bitmap) ngVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f26537f = bitmap.getHeight();
        this.f26538g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        yc0 yc0Var = this.d;
        if (yc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return yc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        ai.v1 v1Var = this.f26536c;
        rt rtVar = (rt) v1Var.f1955a;
        rt rtVar2 = (rt) v1Var.f1956b;
        zc0 zc0Var = (zc0) v1Var.f1958f;
        Paint paint = (Paint) v1Var.d;
        zc0 zc0Var2 = (zc0) v1Var.e;
        boolean b10 = zc0Var2.b(bitmap);
        zc0 zc0Var3 = (zc0) v1Var.f1959g;
        boolean b11 = b10 | zc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((zc0Var.b(bitmap6) | b11) || v1Var.f1957c != 1) {
                v1Var.f1957c = 1;
                paint.setShader(new ComposeShader(zc0Var2.d, new ComposeShader(zc0Var.d, zc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((rtVar2.a(i0.a.o(-1, ((-i12) * i11) / 100)) | b11 | rtVar.a(-16777216)) || v1Var.f1957c != 2) {
            v1Var.f1957c = 2;
            paint.setShader(new ComposeShader((ag.o) rtVar.f32363b, new ComposeShader(new ComposeShader(zc0Var2.d, zc0Var3.d, PorterDuff.Mode.DST_IN), (ag.o) rtVar2.f32363b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
