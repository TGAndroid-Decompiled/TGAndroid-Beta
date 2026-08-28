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
public final class ob0 {
    public static final float[] f31345k = new float[4];
    public static final Matrix f31346l = new Matrix();
    public final mb0 d;
    public int f31350e;
    public int f31351f;
    public int f31352g;
    public int h;
    public final j4.c f31347a = new j4.c(new g2(18));
    public final a6.a f31348b = new a6.a(18, (byte) 0);
    public final t00 f31349c = new t00();
    public final Matrix f31353i = new Matrix();
    public final RectF f31354j = new RectF();

    public ob0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new mb0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f31346l;
        matrix.invert(matrix2);
        float[] fArr2 = f31345k;
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
        RectF rectF2 = this.f31354j;
        rectF2.set(0.0f, 0.0f, this.f31350e, this.f31351f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f31353i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        t00 t00Var = this.f31349c;
        nb0 nb0Var = (nb0) t00Var.f32586c;
        nb0Var.f31061b.set(matrix);
        BitmapShader bitmapShader = nb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        nb0 nb0Var2 = (nb0) t00Var.d;
        nb0Var2.f31061b.set(matrix);
        BitmapShader bitmapShader2 = nb0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        mb0 mb0Var = this.d;
        if (mb0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = mb0Var.f30783g;
            a(matrix, fArr);
            mb0Var.f30781e.a(fArr);
            mb0Var.f30782f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        t00 t00Var = this.f31349c;
        float[] fArr = (float[]) t00Var.h;
        a(matrix, fArr);
        nb0 nb0Var = (nb0) t00Var.f32587e;
        nb0Var.f31061b.set(matrix);
        BitmapShader bitmapShader = nb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        nb0Var.a(z10);
        mb0 mb0Var = this.d;
        if (mb0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = mb0Var.f30783g;
            a(matrix, fArr2);
            nb0 nb0Var2 = mb0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            nb0Var2.a(z11);
            mb0Var.f30781e.b(fArr2);
            mb0Var.f30782f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i9, int i10, int i11, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f31347a.r(bitmap2);
        if (i11 >= 0) {
            int k10 = i0.a.k(i9, ((Color.alpha(i9) * i10) * i11) / 25500);
            a6.a aVar = this.f31348b;
            og.a aVar2 = (og.a) aVar.f101b;
            if (aVar2.a(bitmap) || k10 != aVar.f102c || ((Bitmap) aVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) aVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) aVar.d).getHeight() != bitmap.getHeight()) {
                    aVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) aVar.d, k10);
                aVar2.b(bitmap);
                aVar.f102c = k10;
            }
            bitmap3 = (Bitmap) aVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.f31350e = bitmap.getWidth();
        this.f31351f = bitmap.getHeight();
        this.f31352g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        mb0 mb0Var = this.d;
        if (mb0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return mb0Var.a(bitmap, bitmap4, bitmap6, i10, i11);
        }
        t00 t00Var = this.f31349c;
        us usVar = (us) t00Var.f32588f;
        us usVar2 = (us) t00Var.f32589g;
        nb0 nb0Var = (nb0) t00Var.d;
        Paint paint = (Paint) t00Var.f32585b;
        nb0 nb0Var2 = (nb0) t00Var.f32586c;
        boolean b10 = nb0Var2.b(bitmap);
        nb0 nb0Var3 = (nb0) t00Var.f32587e;
        boolean b11 = b10 | nb0Var3.b(bitmap4);
        if (i11 >= 0) {
            if ((nb0Var.b(bitmap6) | b11) || t00Var.f32584a != 1) {
                t00Var.f32584a = 1;
                paint.setShader(new ComposeShader(nb0Var2.d, new ComposeShader(nb0Var.d, nb0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((usVar2.a(i0.a.k(-1, ((-i11) * i10) / 100)) | b11 | usVar.a(-16777216)) || t00Var.f32584a != 2) {
            t00Var.f32584a = 2;
            paint.setShader(new ComposeShader((ff.l) usVar.f33117b, new ComposeShader(new ComposeShader(nb0Var2.d, nb0Var3.d, PorterDuff.Mode.DST_IN), (ff.l) usVar2.f33117b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
