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
public final class gb0 {
    public static final float[] f35490k = new float[4];
    public static final Matrix f35491l = new Matrix();
    public final eb0 d;
    public int f35495e;
    public int f35496f;
    public int f35497g;
    public int h;
    public final h6.m f35492a = new h6.m(new l2(24));
    public final a8.xa f35493b = new a8.xa(17, (byte) 0);
    public final ci.b1 f35494c = new ci.b1(3);
    public final Matrix f35498i = new Matrix();
    public final RectF f35499j = new RectF();

    public gb0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new eb0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f35491l;
        matrix.invert(matrix2);
        float[] fArr2 = f35490k;
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
        RectF rectF2 = this.f35499j;
        rectF2.set(0.0f, 0.0f, this.f35495e, this.f35496f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f35498i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        ci.b1 b1Var = this.f35494c;
        fb0 fb0Var = (fb0) b1Var.f5616c;
        fb0Var.f35195b.set(matrix);
        BitmapShader bitmapShader = fb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        fb0 fb0Var2 = (fb0) b1Var.d;
        fb0Var2.f35195b.set(matrix);
        BitmapShader bitmapShader2 = fb0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        eb0 eb0Var = this.d;
        if (eb0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = eb0Var.f34724g;
            a(matrix, fArr);
            eb0Var.f34722e.a(fArr);
            eb0Var.f34723f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        ci.b1 b1Var = this.f35494c;
        float[] fArr = (float[]) b1Var.h;
        a(matrix, fArr);
        fb0 fb0Var = (fb0) b1Var.f5617e;
        fb0Var.f35195b.set(matrix);
        BitmapShader bitmapShader = fb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        fb0Var.a(z10);
        eb0 eb0Var = this.d;
        if (eb0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = eb0Var.f34724g;
            a(matrix, fArr2);
            fb0 fb0Var2 = eb0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            fb0Var2.a(z11);
            eb0Var.f34722e.b(fArr2);
            eb0Var.f34723f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i7, int i10, int i11, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f35492a.r(bitmap2);
        if (i11 >= 0) {
            int o4 = i0.a.o(i7, ((Color.alpha(i7) * i10) * i11) / 25500);
            a8.xa xaVar = this.f35493b;
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
        this.f35495e = bitmap.getWidth();
        this.f35496f = bitmap.getHeight();
        this.f35497g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        eb0 eb0Var = this.d;
        if (eb0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return eb0Var.a(bitmap, bitmap4, bitmap6, i10, i11);
        }
        ci.b1 b1Var = this.f35494c;
        cn cnVar = (cn) b1Var.f5618f;
        cn cnVar2 = (cn) b1Var.f5619g;
        fb0 fb0Var = (fb0) b1Var.d;
        Paint paint = (Paint) b1Var.f5615b;
        fb0 fb0Var2 = (fb0) b1Var.f5616c;
        boolean b10 = fb0Var2.b(bitmap);
        fb0 fb0Var3 = (fb0) b1Var.f5617e;
        boolean b11 = b10 | fb0Var3.b(bitmap4);
        if (i11 >= 0) {
            if ((fb0Var.b(bitmap6) | b11) || b1Var.f5614a != 1) {
                b1Var.f5614a = 1;
                paint.setShader(new ComposeShader(fb0Var2.d, new ComposeShader(fb0Var.d, fb0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((cnVar2.R(i0.a.o(-1, ((-i11) * i10) / 100)) | b11 | cnVar.R(-16777216)) || b1Var.f5614a != 2) {
            b1Var.f5614a = 2;
            paint.setShader(new ComposeShader((bg.l) cnVar.f34226b, new ComposeShader(new ComposeShader(fb0Var2.d, fb0Var3.d, PorterDuff.Mode.DST_IN), (bg.l) cnVar2.f34226b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
