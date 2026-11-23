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
public final class db0 {
    public static final float[] f34256k = new float[4];
    public static final Matrix f34257l = new Matrix();
    public final bb0 d;
    public int f34261e;
    public int f34262f;
    public int f34263g;
    public int h;
    public final h6.m f34258a = new h6.m(new k2(24));
    public final a8.xa f34259b = new a8.xa(17, (byte) 0);
    public final ci.b1 f34260c = new ci.b1(3);
    public final Matrix f34264i = new Matrix();
    public final RectF f34265j = new RectF();

    public db0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new bb0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f34257l;
        matrix.invert(matrix2);
        float[] fArr2 = f34256k;
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
        RectF rectF2 = this.f34265j;
        rectF2.set(0.0f, 0.0f, this.f34261e, this.f34262f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f34264i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        ci.b1 b1Var = this.f34260c;
        cb0 cb0Var = (cb0) b1Var.f5582c;
        cb0Var.f34009b.set(matrix);
        BitmapShader bitmapShader = cb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        cb0 cb0Var2 = (cb0) b1Var.d;
        cb0Var2.f34009b.set(matrix);
        BitmapShader bitmapShader2 = cb0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        bb0 bb0Var = this.d;
        if (bb0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = bb0Var.f33731g;
            a(matrix, fArr);
            bb0Var.f33729e.a(fArr);
            bb0Var.f33730f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        ci.b1 b1Var = this.f34260c;
        float[] fArr = (float[]) b1Var.h;
        a(matrix, fArr);
        cb0 cb0Var = (cb0) b1Var.f5583e;
        cb0Var.f34009b.set(matrix);
        BitmapShader bitmapShader = cb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        cb0Var.a(z10);
        bb0 bb0Var = this.d;
        if (bb0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = bb0Var.f33731g;
            a(matrix, fArr2);
            cb0 cb0Var2 = bb0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            cb0Var2.a(z11);
            bb0Var.f33729e.b(fArr2);
            bb0Var.f33730f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i7, int i10, int i11, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f34258a.x(bitmap2);
        if (i11 >= 0) {
            int o4 = i0.a.o(i7, ((Color.alpha(i7) * i10) * i11) / 25500);
            a8.xa xaVar = this.f34259b;
            ih.a aVar = (ih.a) xaVar.f714c;
            if (aVar.a(bitmap) || o4 != xaVar.f713b || ((Bitmap) xaVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) xaVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) xaVar.d).getHeight() != bitmap.getHeight()) {
                    xaVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) xaVar.d, o4);
                aVar.b(bitmap);
                xaVar.f713b = o4;
            }
            bitmap3 = (Bitmap) xaVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.f34261e = bitmap.getWidth();
        this.f34262f = bitmap.getHeight();
        this.f34263g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        bb0 bb0Var = this.d;
        if (bb0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return bb0Var.a(bitmap, bitmap4, bitmap6, i10, i11);
        }
        ci.b1 b1Var = this.f34260c;
        an anVar = (an) b1Var.f5584f;
        an anVar2 = (an) b1Var.f5585g;
        cb0 cb0Var = (cb0) b1Var.d;
        Paint paint = (Paint) b1Var.f5581b;
        cb0 cb0Var2 = (cb0) b1Var.f5582c;
        boolean b10 = cb0Var2.b(bitmap);
        cb0 cb0Var3 = (cb0) b1Var.f5583e;
        boolean b11 = b10 | cb0Var3.b(bitmap4);
        if (i11 >= 0) {
            if ((cb0Var.b(bitmap6) | b11) || b1Var.f5580a != 1) {
                b1Var.f5580a = 1;
                paint.setShader(new ComposeShader(cb0Var2.d, new ComposeShader(cb0Var.d, cb0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((anVar2.R(i0.a.o(-1, ((-i11) * i10) / 100)) | b11 | anVar.R(-16777216)) || b1Var.f5580a != 2) {
            b1Var.f5580a = 2;
            paint.setShader(new ComposeShader((bg.l) anVar.f33498b, new ComposeShader(new ComposeShader(cb0Var2.d, cb0Var3.d, PorterDuff.Mode.DST_IN), (bg.l) anVar2.f33498b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
