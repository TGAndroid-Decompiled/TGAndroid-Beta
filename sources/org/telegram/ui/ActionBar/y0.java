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
    public final int f18770a;
    public final Object f18771b;

    public y0(Object obj, int i10) {
        this.f18770a = i10;
        this.f18771b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18770a) {
            case 0:
                d1 d1Var = (d1) this.f18771b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = d1Var.F;
                d1Var.U = false;
                d1Var.f17601f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                d1Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = d1Var.f17602n;
                if (matrix == null) {
                    d1Var.f17602n = new Matrix();
                } else {
                    matrix.reset();
                }
                d1Var.f17602n.postScale(8.0f, 8.0f);
                Matrix matrix2 = d1Var.f17602n;
                int[] iArr = d1Var.f17603r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                d1Var.h.setLocalMatrix(d1Var.f17602n);
                paint.setShader(d1Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                d1Var.invalidate();
                return;
            default:
                d2 d2Var = (d2) this.f18771b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    d2Var.getClass();
                    return;
                }
                if (d2Var.F0 == null) {
                    d2Var.F0 = new Paint(1);
                }
                d2Var.C0 = bitmap2;
                Bitmap bitmap3 = d2Var.C0;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                d2Var.E0 = bitmapShader;
                d2Var.F0.setShader(bitmapShader);
                Matrix matrix3 = new Matrix();
                d2Var.D0 = matrix3;
                matrix3.postScale(8.0f, 8.0f);
                Matrix matrix4 = d2Var.D0;
                int[] iArr2 = d2Var.f17642x0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                d2Var.E0.setLocalMatrix(d2Var.D0);
                d2Var.f17611a1.invalidate();
                return;
        }
    }
}
