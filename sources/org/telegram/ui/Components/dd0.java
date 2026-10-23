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
public final class dd0 {
    public static final float[] f25605k = new float[4];
    public static final Matrix f25606l = new Matrix();
    public final bd0 d;
    public int e;
    public int f25610f;
    public int f25611g;
    public int h;
    public final androidx.biometric.e f25607a = new androidx.biometric.e(new e2(24));
    public final a5.a f25608b = new a5.a(14, (byte) 0);
    public final q10 f25609c = new q10(1);
    public final Matrix f25612i = new Matrix();
    public final RectF f25613j = new RectF();

    public dd0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new bd0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f25606l;
        matrix.invert(matrix2);
        float[] fArr2 = f25605k;
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
        RectF rectF2 = this.f25613j;
        rectF2.set(0.0f, 0.0f, this.e, this.f25610f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f25612i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        q10 q10Var = this.f25609c;
        cd0 cd0Var = (cd0) q10Var.f29751c;
        cd0Var.f25311b.set(matrix);
        BitmapShader bitmapShader = cd0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        cd0 cd0Var2 = (cd0) q10Var.d;
        cd0Var2.f25311b.set(matrix);
        BitmapShader bitmapShader2 = cd0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        bd0 bd0Var = this.d;
        if (bd0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = bd0Var.f25063g;
            a(matrix, fArr);
            bd0Var.e.a(fArr);
            bd0Var.f25062f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        q10 q10Var = this.f25609c;
        float[] fArr = (float[]) q10Var.h;
        a(matrix, fArr);
        cd0 cd0Var = (cd0) q10Var.e;
        cd0Var.f25311b.set(matrix);
        BitmapShader bitmapShader = cd0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        cd0Var.a(z10);
        bd0 bd0Var = this.d;
        if (bd0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = bd0Var.f25063g;
            a(matrix, fArr2);
            cd0 cd0Var2 = bd0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            cd0Var2.a(z11);
            bd0Var.e.b(fArr2);
            bd0Var.f25062f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f25607a.m(bitmap2);
        if (i12 >= 0) {
            int o10 = i0.a.o(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f25608b;
            hh.a aVar2 = (hh.a) aVar.f282c;
            if (aVar2.a(bitmap) || o10 != aVar.f281b || ((Bitmap) aVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) aVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) aVar.d).getHeight() != bitmap.getHeight()) {
                    aVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) aVar.d, o10);
                aVar2.b(bitmap);
                aVar.f281b = o10;
            }
            bitmap3 = (Bitmap) aVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f25610f = bitmap.getHeight();
        this.f25611g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        bd0 bd0Var = this.d;
        if (bd0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return bd0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        q10 q10Var = this.f25609c;
        pt ptVar = (pt) q10Var.f29752f;
        pt ptVar2 = (pt) q10Var.f29753g;
        cd0 cd0Var = (cd0) q10Var.d;
        Paint paint = (Paint) q10Var.f29750b;
        cd0 cd0Var2 = (cd0) q10Var.f29751c;
        boolean b10 = cd0Var2.b(bitmap);
        cd0 cd0Var3 = (cd0) q10Var.e;
        boolean b11 = b10 | cd0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((cd0Var.b(bitmap6) | b11) || q10Var.f29749a != 1) {
                q10Var.f29749a = 1;
                paint.setShader(new ComposeShader(cd0Var2.d, new ComposeShader(cd0Var.d, cd0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((ptVar2.a(i0.a.o(-1, ((-i12) * i11) / 100)) | b11 | ptVar.a(-16777216)) || q10Var.f29749a != 2) {
            q10Var.f29749a = 2;
            paint.setShader(new ComposeShader((zf.i) ptVar.f29669b, new ComposeShader(new ComposeShader(cd0Var2.d, cd0Var3.d, PorterDuff.Mode.DST_IN), (zf.i) ptVar2.f29669b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
