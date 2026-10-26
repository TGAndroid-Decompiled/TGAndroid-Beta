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
    public final int f23283a;
    public final Object f23284b;

    public y0(Object obj, int i10) {
        this.f23283a = i10;
        this.f23284b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f23283a) {
            case 0:
                d1 d1Var = (d1) this.f23284b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = d1Var.F;
                d1Var.W = false;
                d1Var.f22530f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                d1Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = d1Var.f22532n;
                if (matrix == null) {
                    d1Var.f22532n = new Matrix();
                } else {
                    matrix.reset();
                }
                d1Var.f22532n.postScale(8.0f, 8.0f);
                Matrix matrix2 = d1Var.f22532n;
                int[] iArr = d1Var.f22533r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                d1Var.h.setLocalMatrix(d1Var.f22532n);
                paint.setShader(d1Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                d1Var.invalidate();
                return;
            default:
                e2 e2Var = (e2) this.f23284b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    e2Var.getClass();
                    return;
                }
                if (e2Var.H0 == null) {
                    e2Var.H0 = new Paint(1);
                }
                e2Var.E0 = bitmap2;
                Bitmap bitmap3 = e2Var.E0;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                e2Var.G0 = bitmapShader;
                e2Var.H0.setShader(bitmapShader);
                Matrix matrix3 = new Matrix();
                e2Var.F0 = matrix3;
                matrix3.postScale(8.0f, 8.0f);
                Matrix matrix4 = e2Var.F0;
                int[] iArr2 = e2Var.f22600z0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                e2Var.G0.setLocalMatrix(e2Var.F0);
                e2Var.f22563c1.invalidate();
                return;
        }
    }
}
