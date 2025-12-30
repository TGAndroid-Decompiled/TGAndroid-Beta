package org.telegram.ui.Components.Paint;

import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;

public abstract class Utils {
    public static void HasGLError() {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.d("Paint", GLUtils.getEGLErrorString(iGlGetError));
        }
    }

    public static void RectFIntegral(RectF rectF) {
        rectF.left = (int) Math.floor(rectF.left);
        rectF.top = (int) Math.floor(rectF.top);
        rectF.right = (int) Math.ceil(rectF.right);
        rectF.bottom = (int) Math.ceil(rectF.bottom);
    }
}
