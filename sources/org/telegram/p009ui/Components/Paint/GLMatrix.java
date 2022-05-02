package org.telegram.p009ui.Components.Paint;

import android.graphics.Matrix;

public class GLMatrix {
    public static float[] LoadOrtho(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 - f;
        float f8 = f4 - f3;
        float f9 = f6 - f5;
        return new float[]{2.0f / f7, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f / f8, 0.0f, 0.0f, 0.0f, 0.0f, (-2.0f) / f9, 0.0f, (-(f2 + f)) / f7, (-(f4 + f3)) / f8, (-(f6 + f5)) / f9, 1.0f};
    }

    public static float[] LoadGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[1], 0.0f, 0.0f, fArr[3], fArr[4], 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, 1.0f};
    }

    public static float[] MultiplyMat4f(float[] fArr, float[] fArr2) {
        return new float[]{(fArr[0] * fArr2[0]) + (fArr[4] * fArr2[1]) + (fArr[8] * fArr2[2]) + (fArr[12] * fArr2[3]), (fArr[1] * fArr2[0]) + (fArr[5] * fArr2[1]) + (fArr[9] * fArr2[2]) + (fArr[13] * fArr2[3]), (fArr[2] * fArr2[0]) + (fArr[6] * fArr2[1]) + (fArr[10] * fArr2[2]) + (fArr[14] * fArr2[3]), (fArr[3] * fArr2[0]) + (fArr[7] * fArr2[1]) + (fArr[11] * fArr2[2]) + (fArr[15] * fArr2[3]), (fArr[0] * fArr2[4]) + (fArr[4] * fArr2[5]) + (fArr[8] * fArr2[6]) + (fArr[12] * fArr2[7]), (fArr[1] * fArr2[4]) + (fArr[5] * fArr2[5]) + (fArr[9] * fArr2[6]) + (fArr[13] * fArr2[7]), (fArr[2] * fArr2[4]) + (fArr[6] * fArr2[5]) + (fArr[10] * fArr2[6]) + (fArr[14] * fArr2[7]), (fArr[3] * fArr2[4]) + (fArr[7] * fArr2[5]) + (fArr[11] * fArr2[6]) + (fArr[15] * fArr2[7]), (fArr[0] * fArr2[8]) + (fArr[4] * fArr2[9]) + (fArr[8] * fArr2[10]) + (fArr[12] * fArr2[11]), (fArr[1] * fArr2[8]) + (fArr[5] * fArr2[9]) + (fArr[9] * fArr2[10]) + (fArr[13] * fArr2[11]), (fArr[2] * fArr2[8]) + (fArr[6] * fArr2[9]) + (fArr[10] * fArr2[10]) + (fArr[14] * fArr2[11]), (fArr[3] * fArr2[8]) + (fArr[7] * fArr2[9]) + (fArr[11] * fArr2[10]) + (fArr[15] * fArr2[11]), (fArr[0] * fArr2[12]) + (fArr[4] * fArr2[13]) + (fArr[8] * fArr2[14]) + (fArr[12] * fArr2[15]), (fArr[1] * fArr2[12]) + (fArr[5] * fArr2[13]) + (fArr[9] * fArr2[14]) + (fArr[13] * fArr2[15]), (fArr[2] * fArr2[12]) + (fArr[6] * fArr2[13]) + (fArr[10] * fArr2[14]) + (fArr[14] * fArr2[15]), (fArr[3] * fArr2[12]) + (fArr[7] * fArr2[13]) + (fArr[11] * fArr2[14]) + (fArr[15] * fArr2[15])};
    }
}
