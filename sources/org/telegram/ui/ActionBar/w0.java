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
    public final int f19879a;
    public final Object f19880b;

    public w0(Object obj, int i10) {
        this.f19879a = i10;
        this.f19880b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19879a) {
            case 0:
                b1 b1Var = (b1) this.f19880b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = b1Var.F;
                b1Var.U = false;
                b1Var.f18731f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                b1Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = b1Var.f18732n;
                if (matrix == null) {
                    b1Var.f18732n = new Matrix();
                } else {
                    matrix.reset();
                }
                b1Var.f18732n.postScale(8.0f, 8.0f);
                Matrix matrix2 = b1Var.f18732n;
                int[] iArr = b1Var.f18733r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                b1Var.h.setLocalMatrix(b1Var.f18732n);
                paint.setShader(b1Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                b1Var.invalidate();
                return;
            default:
                a2 a2Var = (a2) this.f19880b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    a2Var.getClass();
                    return;
                }
                if (a2Var.F0 == null) {
                    a2Var.F0 = new Paint(1);
                }
                a2Var.C0 = bitmap2;
                Bitmap bitmap3 = a2Var.C0;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                a2Var.E0 = bitmapShader;
                a2Var.F0.setShader(bitmapShader);
                Matrix matrix3 = new Matrix();
                a2Var.D0 = matrix3;
                matrix3.postScale(8.0f, 8.0f);
                Matrix matrix4 = a2Var.D0;
                int[] iArr2 = a2Var.f18689x0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                a2Var.E0.setLocalMatrix(a2Var.D0);
                a2Var.f18658a1.invalidate();
                return;
        }
    }
}
