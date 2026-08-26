package org.telegram.ui.Components.Paint;

import android.graphics.Color;
import android.opengl.GLES20;
import java.util.HashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public final class Shader {
    public final HashMap uniformsMap = new HashMap();
    public int program = GLES20.glCreateProgram();

    public Shader(String str, String str2, String[] strArr, String[] strArr2) {
        int iGlCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0 && BuildVars.LOGS_ENABLED) {
            FileLog.e(GLES20.glGetShaderInfoLog(iGlCreateShader));
        }
        if (iArr[0] == 0) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Vertex shader compilation failed");
            }
            int i = this.program;
            if (iGlCreateShader != 0) {
                GLES20.glDeleteShader(iGlCreateShader);
            }
            if (i != 0) {
                GLES20.glDeleteProgram(iGlCreateShader);
                return;
            }
            return;
        }
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader2, str2);
        GLES20.glCompileShader(iGlCreateShader2);
        int[] iArr2 = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr2, 0);
        if (iArr2[0] == 0 && BuildVars.LOGS_ENABLED) {
            FileLog.e(GLES20.glGetShaderInfoLog(iGlCreateShader2));
        }
        if (iArr2[0] == 0) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Fragment shader compilation failed");
            }
            int i2 = this.program;
            if (iGlCreateShader != 0) {
                GLES20.glDeleteShader(iGlCreateShader);
            }
            if (iGlCreateShader2 != 0) {
                GLES20.glDeleteShader(iGlCreateShader2);
            }
            if (i2 != 0) {
                GLES20.glDeleteProgram(iGlCreateShader);
                return;
            }
            return;
        }
        GLES20.glAttachShader(this.program, iGlCreateShader);
        GLES20.glAttachShader(this.program, iGlCreateShader2);
        for (int i3 = 0; i3 < strArr.length; i3++) {
            GLES20.glBindAttribLocation(this.program, i3, strArr[i3]);
        }
        int i4 = this.program;
        GLES20.glLinkProgram(i4);
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(i4, 35714, iArr3, 0);
        if (iArr3[0] == 0 && BuildVars.LOGS_ENABLED) {
            FileLog.e(GLES20.glGetProgramInfoLog(i4));
        }
        if (iArr3[0] == 0) {
            int i5 = this.program;
            if (iGlCreateShader != 0) {
                GLES20.glDeleteShader(iGlCreateShader);
            }
            if (iGlCreateShader2 != 0) {
                GLES20.glDeleteShader(iGlCreateShader2);
            }
            if (i5 != 0) {
                GLES20.glDeleteProgram(iGlCreateShader);
                return;
            }
            return;
        }
        for (String str3 : strArr2) {
            this.uniformsMap.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(this.program, str3)));
        }
        if (iGlCreateShader != 0) {
            GLES20.glDeleteShader(iGlCreateShader);
        }
        if (iGlCreateShader2 != 0) {
            GLES20.glDeleteShader(iGlCreateShader2);
        }
    }

    public static void SetColorUniform(int i, int i2) {
        GLES20.glUniform4f(i, Color.red(i2) / 255.0f, Color.green(i2) / 255.0f, Color.blue(i2) / 255.0f, Color.alpha(i2) / 255.0f);
    }
}
