package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class y0 implements Utilities.Callback {
    public final int f22465a;
    public final Object f22466b;

    public y0(Object obj, int i10) {
        this.f22465a = i10;
        this.f22466b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22465a) {
            case 0:
                d1 d1Var = (d1) this.f22466b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = d1Var.C;
                d1Var.R = false;
                d1Var.f21230f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                d1Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = d1Var.f21231n;
                if (matrix == null) {
                    d1Var.f21231n = new Matrix();
                } else {
                    matrix.reset();
                }
                d1Var.f21231n.postScale(8.0f, 8.0f);
                Matrix matrix2 = d1Var.f21231n;
                int[] iArr = d1Var.f21232r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                d1Var.h.setLocalMatrix(d1Var.f21231n);
                paint.setShader(d1Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                d1Var.invalidate();
                return;
            default:
                d2 d2Var = (d2) this.f22466b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    d2Var.getClass();
                    return;
                }
                if (d2Var.C0 == null) {
                    d2Var.C0 = new Paint(1);
                }
                d2Var.f21272z0 = bitmap2;
                Bitmap bitmap3 = d2Var.f21272z0;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                d2Var.B0 = bitmapShader;
                d2Var.C0.setShader(bitmapShader);
                Matrix matrix3 = new Matrix();
                d2Var.A0 = matrix3;
                matrix3.postScale(8.0f, 8.0f);
                Matrix matrix4 = d2Var.A0;
                int[] iArr2 = d2Var.f21264u0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                d2Var.B0.setLocalMatrix(d2Var.A0);
                d2Var.X0.invalidate();
                return;
        }
    }
}
