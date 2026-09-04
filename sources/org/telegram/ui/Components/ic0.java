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
public final class ic0 {
    public static final float[] f27071k = new float[4];
    public static final Matrix f27072l = new Matrix();
    public final gc0 d;
    public int f27076e;
    public int f27077f;
    public int f27078g;
    public int h;
    public final aa.a f27073a = new aa.a(new p2(13));
    public final a5.a f27074b = new a5.a(13, (byte) 0);
    public final i10 f27075c = new i10();
    public final Matrix f27079i = new Matrix();
    public final RectF f27080j = new RectF();

    public ic0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new gc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f27072l;
        matrix.invert(matrix2);
        float[] fArr2 = f27071k;
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
        RectF rectF2 = this.f27080j;
        rectF2.set(0.0f, 0.0f, this.f27076e, this.f27077f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f27079i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        i10 i10Var = this.f27075c;
        hc0 hc0Var = (hc0) i10Var.f26926c;
        hc0Var.f26706b.set(matrix);
        BitmapShader bitmapShader = hc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        hc0 hc0Var2 = (hc0) i10Var.d;
        hc0Var2.f26706b.set(matrix);
        BitmapShader bitmapShader2 = hc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        gc0 gc0Var = this.d;
        if (gc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = gc0Var.f26344g;
            a(matrix, fArr);
            gc0Var.f26342e.a(fArr);
            gc0Var.f26343f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        i10 i10Var = this.f27075c;
        float[] fArr = (float[]) i10Var.h;
        a(matrix, fArr);
        hc0 hc0Var = (hc0) i10Var.f26927e;
        hc0Var.f26706b.set(matrix);
        BitmapShader bitmapShader = hc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        hc0Var.a(z10);
        gc0 gc0Var = this.d;
        if (gc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = gc0Var.f26344g;
            a(matrix, fArr2);
            hc0 hc0Var2 = gc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            hc0Var2.a(z11);
            gc0Var.f26342e.b(fArr2);
            gc0Var.f26343f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f27073a.p(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f27074b;
            hh.a aVar2 = (hh.a) aVar.f286c;
            if (aVar2.a(bitmap) || k10 != aVar.f285b || ((Bitmap) aVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) aVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) aVar.d).getHeight() != bitmap.getHeight()) {
                    aVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) aVar.d, k10);
                aVar2.b(bitmap);
                aVar.f285b = k10;
            }
            bitmap3 = (Bitmap) aVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.f27076e = bitmap.getWidth();
        this.f27077f = bitmap.getHeight();
        this.f27078g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        gc0 gc0Var = this.d;
        if (gc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return gc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        i10 i10Var = this.f27075c;
        ft ftVar = (ft) i10Var.f26928f;
        ft ftVar2 = (ft) i10Var.f26929g;
        hc0 hc0Var = (hc0) i10Var.d;
        Paint paint = (Paint) i10Var.f26925b;
        hc0 hc0Var2 = (hc0) i10Var.f26926c;
        boolean b10 = hc0Var2.b(bitmap);
        hc0 hc0Var3 = (hc0) i10Var.f26927e;
        boolean b11 = b10 | hc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((hc0Var.b(bitmap6) | b11) || i10Var.f26924a != 1) {
                i10Var.f26924a = 1;
                paint.setShader(new ComposeShader(hc0Var2.d, new ComposeShader(hc0Var.d, hc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((ftVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | ftVar.a(-16777216)) || i10Var.f26924a != 2) {
            i10Var.f26924a = 2;
            paint.setShader(new ComposeShader((yf.i) ftVar.f26182b, new ComposeShader(new ComposeShader(hc0Var2.d, hc0Var3.d, PorterDuff.Mode.DST_IN), (yf.i) ftVar2.f26182b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
