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
public final class w0 implements Utilities.Callback {
    public final int f21934a;
    public final Object f21935b;

    public w0(Object obj, int i10) {
        this.f21934a = i10;
        this.f21935b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21934a) {
            case 0:
                b1 b1Var = (b1) this.f21935b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = b1Var.F;
                b1Var.W = false;
                b1Var.f20718f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                b1Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = b1Var.f20720n;
                if (matrix == null) {
                    b1Var.f20720n = new Matrix();
                } else {
                    matrix.reset();
                }
                b1Var.f20720n.postScale(8.0f, 8.0f);
                Matrix matrix2 = b1Var.f20720n;
                int[] iArr = b1Var.f20721r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                b1Var.h.setLocalMatrix(b1Var.f20720n);
                paint.setShader(b1Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                b1Var.invalidate();
                return;
            default:
                c2 c2Var = (c2) this.f21935b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    c2Var.getClass();
                    return;
                }
                if (c2Var.H0 == null) {
                    c2Var.H0 = new Paint(1);
                }
                c2Var.E0 = bitmap2;
                Bitmap bitmap3 = c2Var.E0;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                c2Var.G0 = bitmapShader;
                c2Var.H0.setShader(bitmapShader);
                Matrix matrix3 = new Matrix();
                c2Var.F0 = matrix3;
                matrix3.postScale(8.0f, 8.0f);
                Matrix matrix4 = c2Var.F0;
                int[] iArr2 = c2Var.f20788z0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                c2Var.G0.setLocalMatrix(c2Var.F0);
                c2Var.f20751c1.invalidate();
                return;
        }
    }
}
