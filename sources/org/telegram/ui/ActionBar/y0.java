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
    public final int f19697a;
    public final Object f19698b;

    public y0(Object obj, int i10) {
        this.f19697a = i10;
        this.f19698b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19697a) {
            case 0:
                d1 d1Var = (d1) this.f19698b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = d1Var.F;
                d1Var.U = false;
                d1Var.f18563f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                d1Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = d1Var.f18564n;
                if (matrix == null) {
                    d1Var.f18564n = new Matrix();
                } else {
                    matrix.reset();
                }
                d1Var.f18564n.postScale(8.0f, 8.0f);
                Matrix matrix2 = d1Var.f18564n;
                int[] iArr = d1Var.f18565r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                d1Var.h.setLocalMatrix(d1Var.f18564n);
                paint.setShader(d1Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                d1Var.invalidate();
                return;
            default:
                c2 c2Var = (c2) this.f19698b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    c2Var.getClass();
                    return;
                }
                if (c2Var.F0 == null) {
                    c2Var.F0 = new Paint(1);
                }
                c2Var.C0 = bitmap2;
                Bitmap bitmap3 = c2Var.C0;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                c2Var.E0 = bitmapShader;
                c2Var.F0.setShader(bitmapShader);
                Matrix matrix3 = new Matrix();
                c2Var.D0 = matrix3;
                matrix3.postScale(8.0f, 8.0f);
                Matrix matrix4 = c2Var.D0;
                int[] iArr2 = c2Var.f18523x0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                c2Var.E0.setLocalMatrix(c2Var.D0);
                c2Var.f18492a1.invalidate();
                return;
        }
    }
}
