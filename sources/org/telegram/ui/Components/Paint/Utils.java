package org.telegram.ui.Components.Paint;

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
}
