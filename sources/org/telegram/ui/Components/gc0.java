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
public final class gc0 {
    public static final float[] f24255k = new float[4];
    public static final Matrix f24256l = new Matrix();
    public final ec0 d;
    public int e;
    public int f24260f;
    public int f24261g;
    public int h;
    public final aa.a f24257a = new aa.a(new x1(29));
    public final a5.a f24258b = new a5.a(13, (byte) 0);
    public final j10 f24259c = new j10();
    public final Matrix f24262i = new Matrix();
    public final RectF f24263j = new RectF();

    public gc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new ec0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f24256l;
        matrix.invert(matrix2);
        float[] fArr2 = f24255k;
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
        RectF rectF2 = this.f24263j;
        rectF2.set(0.0f, 0.0f, this.e, this.f24260f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f24262i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        j10 j10Var = this.f24259c;
        fc0 fc0Var = (fc0) j10Var.f25115c;
        fc0Var.f23937b.set(matrix);
        BitmapShader bitmapShader = fc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        fc0 fc0Var2 = (fc0) j10Var.d;
        fc0Var2.f23937b.set(matrix);
        BitmapShader bitmapShader2 = fc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        ec0 ec0Var = this.d;
        if (ec0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = ec0Var.f23644g;
            a(matrix, fArr);
            ec0Var.e.a(fArr);
            ec0Var.f23643f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        j10 j10Var = this.f24259c;
        float[] fArr = (float[]) j10Var.h;
        a(matrix, fArr);
        fc0 fc0Var = (fc0) j10Var.e;
        fc0Var.f23937b.set(matrix);
        BitmapShader bitmapShader = fc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        fc0Var.a(z10);
        ec0 ec0Var = this.d;
        if (ec0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = ec0Var.f23644g;
            a(matrix, fArr2);
            fc0 fc0Var2 = ec0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            fc0Var2.a(z11);
            ec0Var.e.b(fArr2);
            ec0Var.f23643f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f24257a.o(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f24258b;
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
        this.f24260f = bitmap.getHeight();
        this.f24261g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        ec0 ec0Var = this.d;
        if (ec0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return ec0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        j10 j10Var = this.f24259c;
        ht htVar = (ht) j10Var.f25116f;
        ht htVar2 = (ht) j10Var.f25117g;
        fc0 fc0Var = (fc0) j10Var.d;
        Paint paint = (Paint) j10Var.f25114b;
        fc0 fc0Var2 = (fc0) j10Var.f25115c;
        boolean b10 = fc0Var2.b(bitmap);
        fc0 fc0Var3 = (fc0) j10Var.e;
        boolean b11 = b10 | fc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((fc0Var.b(bitmap6) | b11) || j10Var.f25113a != 1) {
                j10Var.f25113a = 1;
                paint.setShader(new ComposeShader(fc0Var2.d, new ComposeShader(fc0Var.d, fc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((htVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | htVar.a(-16777216)) || j10Var.f25113a != 2) {
            j10Var.f25113a = 2;
            paint.setShader(new ComposeShader((yf.i) htVar.f24820b, new ComposeShader(new ComposeShader(fc0Var2.d, fc0Var3.d, PorterDuff.Mode.DST_IN), (yf.i) htVar2.f24820b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
