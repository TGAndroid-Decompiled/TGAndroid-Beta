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
public final class zc0 {
    public static final float[] f35297k = new float[4];
    public static final Matrix f35298l = new Matrix();
    public final xc0 d;
    public int e;
    public int f35302f;
    public int f35303g;
    public int h;
    public final a8.h0 f35299a = new a8.h0(new f2(27));
    public final a8.ng f35300b = new a8.ng(16, (byte) 0);
    public final ai.v1 f35301c = new ai.v1(2);
    public final Matrix f35304i = new Matrix();
    public final RectF f35305j = new RectF();

    public zc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new xc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f35298l;
        matrix.invert(matrix2);
        float[] fArr2 = f35297k;
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
        RectF rectF2 = this.f35305j;
        rectF2.set(0.0f, 0.0f, this.e, this.f35302f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f35304i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        ai.v1 v1Var = this.f35301c;
        yc0 yc0Var = (yc0) v1Var.e;
        yc0Var.f35026b.set(matrix);
        BitmapShader bitmapShader = yc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        yc0 yc0Var2 = (yc0) v1Var.f1958f;
        yc0Var2.f35026b.set(matrix);
        BitmapShader bitmapShader2 = yc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        xc0 xc0Var = this.d;
        if (xc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = xc0Var.f34696g;
            a(matrix, fArr);
            xc0Var.e.a(fArr);
            xc0Var.f34695f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        ai.v1 v1Var = this.f35301c;
        float[] fArr = (float[]) v1Var.h;
        a(matrix, fArr);
        yc0 yc0Var = (yc0) v1Var.f1959g;
        yc0Var.f35026b.set(matrix);
        BitmapShader bitmapShader = yc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        yc0Var.a(z10);
        xc0 xc0Var = this.d;
        if (xc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = xc0Var.f34696g;
            a(matrix, fArr2);
            yc0 yc0Var2 = xc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            yc0Var2.a(z11);
            xc0Var.e.b(fArr2);
            xc0Var.f34695f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f35299a.o(bitmap2);
        if (i12 >= 0) {
            int o10 = i0.a.o(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a8.ng ngVar = this.f35300b;
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
        this.f35302f = bitmap.getHeight();
        this.f35303g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        xc0 xc0Var = this.d;
        if (xc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return xc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        ai.v1 v1Var = this.f35301c;
        rt rtVar = (rt) v1Var.f1955a;
        rt rtVar2 = (rt) v1Var.f1956b;
        yc0 yc0Var = (yc0) v1Var.f1958f;
        Paint paint = (Paint) v1Var.d;
        yc0 yc0Var2 = (yc0) v1Var.e;
        boolean b10 = yc0Var2.b(bitmap);
        yc0 yc0Var3 = (yc0) v1Var.f1959g;
        boolean b11 = b10 | yc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((yc0Var.b(bitmap6) | b11) || v1Var.f1957c != 1) {
                v1Var.f1957c = 1;
                paint.setShader(new ComposeShader(yc0Var2.d, new ComposeShader(yc0Var.d, yc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((rtVar2.a(i0.a.o(-1, ((-i12) * i11) / 100)) | b11 | rtVar.a(-16777216)) || v1Var.f1957c != 2) {
            v1Var.f1957c = 2;
            paint.setShader(new ComposeShader((ag.o) rtVar.f32324b, new ComposeShader(new ComposeShader(yc0Var2.d, yc0Var3.d, PorterDuff.Mode.DST_IN), (ag.o) rtVar2.f32324b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
