package org.telegram.ui.Components.blur3.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public abstract class Blur3Utils {
    private static final Matrix matrixTmp = new Matrix();
    private static final RectF captureTmpRectF = new RectF();
    private static final RectF captureTmpChildPos = new RectF();

    public static boolean checkBitmapSourceMatrixScale(BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap, View view) {
        Bitmap bitmap;
        if (blurredBackgroundSourceBitmap == null || view == null || view.getWidth() == 0 || view.getHeight() == 0 || (bitmap = blurredBackgroundSourceBitmap.getBitmap()) == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return false;
        }
        Matrix matrix = matrixTmp;
        matrix.reset();
        matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
        blurredBackgroundSourceBitmap.setMatrix(matrix);
        return true;
    }

    public static void captureRelativeParent(IBlur3Capture iBlur3Capture, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup) {
        captureRelativeParent(iBlur3Capture, canvas, rectF, view, viewGroup, 255);
    }

    public static void captureRelativeParent(IBlur3Capture iBlur3Capture, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i) {
        if (i <= 0) {
            return;
        }
        RectF rectF2 = captureTmpChildPos;
        if (ViewPositionWatcher.computeRectInParent(view, viewGroup, rectF2)) {
            float f = rectF2.left;
            float f2 = rectF2.top;
            RectF rectF3 = captureTmpRectF;
            rectF3.set(rectF);
            rectF3.offset(-f, -f2);
            boolean z = (f == 0.0f && f2 == 0.0f) ? false : true;
            boolean z2 = i != 255;
            if (z) {
                canvas.save();
                canvas.translate(f, f2);
            }
            if (z2) {
                canvas.saveLayerAlpha(rectF3, i);
            }
            iBlur3Capture.capture(canvas, rectF3);
            if (z2) {
                canvas.restore();
            }
            if (z) {
                canvas.restore();
            }
        }
    }
}
