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

public final class x0 implements Utilities.Callback {

    public final int f23940a;

    public final Object f23941b;

    public x0(Object obj, int i10) {
        this.f23940a = i10;
        this.f23941b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f23940a) {
            case 0:
                c1 c1Var = (c1) this.f23941b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = c1Var.B;
                c1Var.Q = false;
                c1Var.f22798f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                c1Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = c1Var.f22799n;
                if (matrix == null) {
                    c1Var.f22799n = new Matrix();
                } else {
                    matrix.reset();
                }
                c1Var.f22799n.postScale(8.0f, 8.0f);
                Matrix matrix2 = c1Var.f22799n;
                int[] iArr = c1Var.f22800r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                c1Var.h.setLocalMatrix(c1Var.f22799n);
                paint.setShader(c1Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                c1Var.invalidate();
                break;
            default:
                b2 b2Var = (b2) this.f23941b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    if (b2Var.B0 == null) {
                        b2Var.B0 = new Paint(1);
                    }
                    b2Var.f22776y0 = bitmap2;
                    Bitmap bitmap3 = b2Var.f22776y0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    b2Var.A0 = bitmapShader;
                    b2Var.B0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    b2Var.f22777z0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = b2Var.f22777z0;
                    int[] iArr2 = b2Var.f22768t0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    b2Var.A0.setLocalMatrix(b2Var.f22777z0);
                    b2Var.W0.invalidate();
                } else {
                    b2Var.getClass();
                }
                break;
        }
    }
}
