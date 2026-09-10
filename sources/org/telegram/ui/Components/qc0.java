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
public final class qc0 {
    public static final float[] f26385k = new float[4];
    public static final Matrix f26386l = new Matrix();
    public final oc0 d;
    public int e;
    public int f26390f;
    public int f26391g;
    public int h;
    public final aa.a f26387a = new aa.a(new q2(14));
    public final a5.a f26388b = new a5.a(14, (byte) 0);
    public final q10 f26389c = new q10();
    public final Matrix f26392i = new Matrix();
    public final RectF f26393j = new RectF();

    public qc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new oc0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = f26386l;
        matrix.invert(matrix2);
        float[] fArr2 = f26385k;
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
        RectF rectF2 = this.f26393j;
        rectF2.set(0.0f, 0.0f, this.e, this.f26390f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.f26392i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        q10 q10Var = this.f26389c;
        pc0 pc0Var = (pc0) q10Var.f26303c;
        pc0Var.f26094b.set(matrix);
        BitmapShader bitmapShader = pc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        pc0 pc0Var2 = (pc0) q10Var.d;
        pc0Var2.f26094b.set(matrix);
        BitmapShader bitmapShader2 = pc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        oc0 oc0Var = this.d;
        if (oc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = oc0Var.f25764g;
            a(matrix, fArr);
            oc0Var.e.a(fArr);
            oc0Var.f25763f.a(fArr);
        }
    }

    public final void d(Matrix matrix) {
        boolean z10;
        q10 q10Var = this.f26389c;
        float[] fArr = (float[]) q10Var.h;
        a(matrix, fArr);
        pc0 pc0Var = (pc0) q10Var.e;
        pc0Var.f26094b.set(matrix);
        BitmapShader bitmapShader = pc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z11 = false;
        if (b(fArr[0]) && b(fArr[1])) {
            z10 = true;
        } else {
            z10 = false;
        }
        pc0Var.a(z10);
        oc0 oc0Var = this.d;
        if (oc0Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = oc0Var.f25764g;
            a(matrix, fArr2);
            pc0 pc0Var2 = oc0Var.d;
            if (b(fArr2[0]) && b(fArr2[1])) {
                z11 = true;
            }
            pc0Var2.a(z11);
            oc0Var.e.b(fArr2);
            oc0Var.f25763f.b(fArr2);
        }
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.f26387a.o(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.f26388b;
            fh.a aVar2 = (fh.a) aVar.f276c;
            if (aVar2.a(bitmap) || k10 != aVar.f275b || ((Bitmap) aVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) aVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) aVar.d).getHeight() != bitmap.getHeight()) {
                    aVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) aVar.d, k10);
                aVar2.b(bitmap);
                aVar.f275b = k10;
            }
            bitmap3 = (Bitmap) aVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f26390f = bitmap.getHeight();
        this.f26391g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        oc0 oc0Var = this.d;
        if (oc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return oc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        q10 q10Var = this.f26389c;
        mt mtVar = (mt) q10Var.f26304f;
        mt mtVar2 = (mt) q10Var.f26305g;
        pc0 pc0Var = (pc0) q10Var.d;
        Paint paint = (Paint) q10Var.f26302b;
        pc0 pc0Var2 = (pc0) q10Var.f26303c;
        boolean b10 = pc0Var2.b(bitmap);
        pc0 pc0Var3 = (pc0) q10Var.e;
        boolean b11 = b10 | pc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((pc0Var.b(bitmap6) | b11) || q10Var.f26301a != 1) {
                q10Var.f26301a = 1;
                paint.setShader(new ComposeShader(pc0Var2.d, new ComposeShader(pc0Var.d, pc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((mtVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | mtVar.a(-16777216)) || q10Var.f26301a != 2) {
            q10Var.f26301a = 2;
            paint.setShader(new ComposeShader((xf.i) mtVar.f25285b, new ComposeShader(new ComposeShader(pc0Var2.d, pc0Var3.d, PorterDuff.Mode.DST_IN), (xf.i) mtVar2.f25285b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
