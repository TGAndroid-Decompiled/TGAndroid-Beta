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
public final class nb0 {
    public static final float[] f28763k = new float[4];
    public static final Matrix f28764l = new Matrix();
    public final lb0 d;
    public int e;
    public int f28768f;
    public int f28769g;
    public int h;
    public final q5.d f28765a = new q5.d(new au(2));
    public final a5.a f28766b = new a5.a(15, (byte) 0);
    public final org.telegram.messenger.l9 f28767c = new org.telegram.messenger.l9(2);
    public final Matrix f28770i = new Matrix();
    public final RectF f28771j = new RectF();

    public nb0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new lb0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f28764l;
        matrix.invert(matrix2);
        float[] fArr2 = f28763k;
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
        RectF rectF2 = this.f28771j;
        rectF2.set(0.0f, 0.0f, this.e, this.f28768f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f28770i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        org.telegram.messenger.l9 l9Var = this.f28767c;
        mb0 mb0Var = (mb0) l9Var.d;
        mb0Var.f28447b.set(matrix);
        BitmapShader bitmapShader = mb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        mb0 mb0Var2 = (mb0) l9Var.e;
        mb0Var2.f28447b.set(matrix);
        BitmapShader bitmapShader2 = mb0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        lb0 lb0Var = this.d;
        if (lb0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = lb0Var.f28108g;
            a(matrix, fArr);
            lb0Var.e.a(fArr);
            lb0Var.f28107f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        org.telegram.messenger.l9 l9Var = this.f28767c;
        float[] fArr = (float[]) l9Var.f16917b;
        a(matrix, fArr);
        mb0 mb0Var = (mb0) l9Var.f16919f;
        mb0Var.f28447b.set(matrix);
        BitmapShader bitmapShader = mb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        mb0Var.a(z10);
        lb0 lb0Var = this.d;
        if (lb0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = lb0Var.f28108g;
            a(matrix, fArr2);
            mb0 mb0Var2 = lb0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            mb0Var2.a(z11);
            lb0Var.e.b(fArr2);
            lb0Var.f28107f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f28765a.k(bitmap2);
        if (i12 >= 0) {
            int o10 = i0.b.o(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f28766b;
            yg.a aVar2 = (yg.a) aVar.f282c;
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
        this.f28768f = bitmap.getHeight();
        this.f28769g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        lb0 lb0Var = this.d;
        if (lb0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return lb0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        org.telegram.messenger.l9 l9Var = this.f28767c;
        tm tmVar = (tm) l9Var.f16920g;
        tm tmVar2 = (tm) l9Var.h;
        mb0 mb0Var = (mb0) l9Var.e;
        Paint paint = (Paint) l9Var.f16918c;
        mb0 mb0Var2 = (mb0) l9Var.d;
        boolean b10 = mb0Var2.b(bitmap);
        mb0 mb0Var3 = (mb0) l9Var.f16919f;
        boolean b11 = b10 | mb0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((mb0Var.b(bitmap6) | b11) || l9Var.f16916a != 1) {
                l9Var.f16916a = 1;
                paint.setShader(new ComposeShader(mb0Var2.d, new ComposeShader(mb0Var.d, mb0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((tmVar2.R(i0.b.o(-1, ((-i12) * i11) / 100)) | b11 | tmVar.R(-16777216)) || l9Var.f16916a != 2) {
            l9Var.f16916a = 2;
            paint.setShader(new ComposeShader((rf.h) tmVar.f30679b, new ComposeShader(new ComposeShader(mb0Var2.d, mb0Var3.d, PorterDuff.Mode.DST_IN), (rf.h) tmVar2.f30679b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
