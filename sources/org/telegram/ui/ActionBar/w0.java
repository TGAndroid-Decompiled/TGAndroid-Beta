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
    public final int f21826a;
    public final Object f21827b;

    public w0(Object obj, int i10) {
        this.f21826a = i10;
        this.f21827b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21826a) {
            case 0:
                b1 b1Var = (b1) this.f21827b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = b1Var.F;
                b1Var.U = false;
                b1Var.f20642f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                b1Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = b1Var.f20643n;
                if (matrix == null) {
                    b1Var.f20643n = new Matrix();
                } else {
                    matrix.reset();
                }
                b1Var.f20643n.postScale(8.0f, 8.0f);
                Matrix matrix2 = b1Var.f20643n;
                int[] iArr = b1Var.f20644r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                b1Var.h.setLocalMatrix(b1Var.f20643n);
                paint.setShader(b1Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                b1Var.invalidate();
                return;
            default:
                b2 b2Var = (b2) this.f21827b;
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
                int[] iArr2 = b2Var.f20683x0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                b2Var.E0.setLocalMatrix(b2Var.D0);
                b2Var.f20652a1.invalidate();
                return;
        }
    }
}
