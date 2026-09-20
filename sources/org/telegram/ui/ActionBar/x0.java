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
    public final int f19889a;
    public final Object f19890b;

    public x0(Object obj, int i10) {
        this.f19889a = i10;
        this.f19890b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19889a) {
            case 0:
                c1 c1Var = (c1) this.f19890b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = c1Var.F;
                c1Var.U = false;
                c1Var.f18754f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                c1Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = c1Var.f18755n;
                if (matrix == null) {
                    c1Var.f18755n = new Matrix();
                } else {
                    matrix.reset();
                }
                c1Var.f18755n.postScale(8.0f, 8.0f);
                Matrix matrix2 = c1Var.f18755n;
                int[] iArr = c1Var.f18756r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                c1Var.h.setLocalMatrix(c1Var.f18755n);
                paint.setShader(c1Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                c1Var.invalidate();
                return;
            default:
                b2 b2Var = (b2) this.f19890b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    b2Var.getClass();
                    return;
                }
                if (b2Var.F0 == null) {
                    b2Var.F0 = new Paint(1);
                }
                b2Var.C0 = bitmap2;
                Bitmap bitmap3 = b2Var.C0;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                b2Var.E0 = bitmapShader;
                b2Var.F0.setShader(bitmapShader);
                Matrix matrix3 = new Matrix();
                b2Var.D0 = matrix3;
                matrix3.postScale(8.0f, 8.0f);
                Matrix matrix4 = b2Var.D0;
                int[] iArr2 = b2Var.f18711x0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                b2Var.E0.setLocalMatrix(b2Var.D0);
                b2Var.f18680a1.invalidate();
                return;
        }
    }
}
