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

public final class AlertDialog$$ExternalSyntheticLambda9 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;

    public AlertDialog$$ExternalSyntheticLambda9(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        switch (this.$r8$classId) {
            case 0:
                AlertDialog alertDialog = (AlertDialog) this.f$0;
                if (bitmap != null) {
                    if (alertDialog.blurPaint == null) {
                        alertDialog.blurPaint = new Paint(1);
                    }
                    alertDialog.blurBitmap = bitmap;
                    Bitmap bitmap2 = alertDialog.blurBitmap;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    alertDialog.blurShader = bitmapShader;
                    alertDialog.blurPaint.setShader(bitmapShader);
                    Matrix matrix = new Matrix();
                    alertDialog.blurMatrix = matrix;
                    matrix.postScale(8.0f, 8.0f);
                    Matrix matrix2 = alertDialog.blurMatrix;
                    int[] iArr = alertDialog.containerViewLocation;
                    matrix2.postTranslate(-iArr[0], -iArr[1]);
                    alertDialog.blurShader.setLocalMatrix(alertDialog.blurMatrix);
                    alertDialog.containerView.invalidate();
                } else {
                    alertDialog.getClass();
                }
                break;
            default:
                ActionBarMenuSlider.SpeedSlider speedSlider = (ActionBarMenuSlider.SpeedSlider) this.f$0;
                speedSlider.preparingBlur = false;
                speedSlider.blurBitmap = bitmap;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                speedSlider.blurBitmapShader = new BitmapShader(bitmap, tileMode2, tileMode2);
                Matrix matrix3 = speedSlider.blurBitmapMatrix;
                if (matrix3 == null) {
                    speedSlider.blurBitmapMatrix = new Matrix();
                } else {
                    matrix3.reset();
                }
                speedSlider.blurBitmapMatrix.postScale(8.0f, 8.0f);
                Matrix matrix4 = speedSlider.blurBitmapMatrix;
                int[] iArr2 = speedSlider.location;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                speedSlider.blurBitmapShader.setLocalMatrix(speedSlider.blurBitmapMatrix);
                Paint paint = speedSlider.blurPaint;
                paint.setShader(speedSlider.blurBitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                speedSlider.invalidate();
                break;
        }
    }
}
