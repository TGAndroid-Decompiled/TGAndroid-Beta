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
public final class va0 {
    public static final float[] f40361k = new float[4];
    public static final Matrix f40362l = new Matrix();
    public final ta0 d;
    public int f40366e;
    public int f40367f;
    public int f40368g;
    public int h;
    public final h6.m f40363a = new h6.m(new e2(23));
    public final a8.xa f40364b = new a8.xa(17, (byte) 0);
    public final ci.b1 f40365c = new ci.b1(3);
    public final Matrix f40369i = new Matrix();
    public final RectF f40370j = new RectF();

    public va0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new ta0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f40362l;
        matrix.invert(matrix2);
        float[] fArr2 = f40361k;
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
        RectF rectF2 = this.f40370j;
        rectF2.set(0.0f, 0.0f, this.f40366e, this.f40367f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f40369i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        ci.b1 b1Var = this.f40365c;
        ua0 ua0Var = (ua0) b1Var.f5305c;
        ua0Var.f39984b.set(matrix);
        BitmapShader bitmapShader = ua0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        ua0 ua0Var2 = (ua0) b1Var.d;
        ua0Var2.f39984b.set(matrix);
        BitmapShader bitmapShader2 = ua0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        ta0 ta0Var = this.d;
        if (ta0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = ta0Var.f39623g;
            a(matrix, fArr);
            ta0Var.f39621e.a(fArr);
            ta0Var.f39622f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        ci.b1 b1Var = this.f40365c;
        float[] fArr = (float[]) b1Var.h;
        a(matrix, fArr);
        ua0 ua0Var = (ua0) b1Var.f5306e;
        ua0Var.f39984b.set(matrix);
        BitmapShader bitmapShader = ua0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        ua0Var.a(z10);
        ta0 ta0Var = this.d;
        if (ta0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = ta0Var.f39623g;
            a(matrix, fArr2);
            ua0 ua0Var2 = ta0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            ua0Var2.a(z11);
            ta0Var.f39621e.b(fArr2);
            ta0Var.f39622f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i7, int i10, int i11, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f40363a.n(bitmap2);
        if (i11 >= 0) {
            int o4 = i0.a.o(i7, ((Color.alpha(i7) * i10) * i11) / 25500);
            a8.xa xaVar = this.f40364b;
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
        this.f40366e = bitmap.getWidth();
        this.f40367f = bitmap.getHeight();
        this.f40368g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        ta0 ta0Var = this.d;
        if (ta0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return ta0Var.a(bitmap, bitmap4, bitmap6, i10, i11);
        }
        ci.b1 b1Var = this.f40365c;
        tm tmVar = (tm) b1Var.f5307f;
        tm tmVar2 = (tm) b1Var.f5308g;
        ua0 ua0Var = (ua0) b1Var.d;
        Paint paint = (Paint) b1Var.f5304b;
        ua0 ua0Var2 = (ua0) b1Var.f5305c;
        boolean b10 = ua0Var2.b(bitmap);
        ua0 ua0Var3 = (ua0) b1Var.f5306e;
        boolean b11 = b10 | ua0Var3.b(bitmap4);
        if (i11 >= 0) {
            if ((ua0Var.b(bitmap6) | b11) || b1Var.f5303a != 1) {
                b1Var.f5303a = 1;
                paint.setShader(new ComposeShader(ua0Var2.d, new ComposeShader(ua0Var.d, ua0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((tmVar2.R(i0.a.o(-1, ((-i11) * i10) / 100)) | b11 | tmVar.R(-16777216)) || b1Var.f5303a != 2) {
            b1Var.f5303a = 2;
            paint.setShader(new ComposeShader((bg.l) tmVar.f39721b, new ComposeShader(new ComposeShader(ua0Var2.d, ua0Var3.d, PorterDuff.Mode.DST_IN), (bg.l) tmVar2.f39721b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
