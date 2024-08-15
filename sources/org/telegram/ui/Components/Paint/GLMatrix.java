package org.telegram.ui.Components.Paint;

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
        float f = fArr[4];
        float f2 = fArr2[1];
        float f3 = fArr[8];
        float f4 = fArr2[2];
        float f5 = fArr[12];
        float f6 = fArr2[3];
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[5];
        float f10 = fArr[9];
        float f11 = fArr[13];
        float f12 = fArr[6];
        float f13 = fArr2[1];
        float f14 = fArr[10];
        float f15 = fArr[14];
        float f16 = fArr[7];
        float f17 = fArr[11];
        float f18 = fArr[15];
        float f19 = fArr[0];
        float f20 = fArr2[5];
        float f21 = (fArr2[4] * f19) + (f * f20);
        float f22 = fArr2[6];
        float f23 = f21 + (f3 * f22);
        float f24 = fArr2[7];
        float f25 = fArr[1];
        float f26 = fArr2[4];
        float f27 = fArr[2];
        float f28 = fArr2[5];
        float f29 = fArr[3];
        float f30 = fArr[4];
        float f31 = fArr2[9];
        float f32 = (fArr2[8] * f19) + (f30 * f31);
        float f33 = fArr2[10];
        float f34 = f32 + (f3 * f33);
        float f35 = fArr2[11];
        float f36 = fArr2[8];
        float f37 = fArr[5];
        float f38 = fArr[6];
        float f39 = fArr2[9];
        float f40 = fArr[7];
        float f41 = f19 * fArr2[12];
        float f42 = fArr2[13];
        float f43 = f41 + (f30 * f42);
        float f44 = fArr[8];
        float f45 = fArr2[14];
        float f46 = f43 + (f44 * f45);
        float f47 = fArr2[15];
        float f48 = fArr2[12];
        float f49 = fArr2[13];
        return new float[]{(fArr[0] * fArr2[0]) + (f * f2) + (f3 * f4) + (f5 * f6), (f7 * f8) + (f2 * f9) + (f10 * f4) + (f11 * f6), (fArr[2] * f8) + (f12 * f13) + (f4 * f14) + (f15 * f6), (fArr[3] * f8) + (f13 * f16) + (fArr2[2] * f17) + (f6 * f18), f23 + (f5 * f24), (f25 * f26) + (f9 * f20) + (f10 * f22) + (f11 * f24), (f27 * f26) + (f12 * f28) + (f22 * f14) + (f15 * f24), (f26 * f29) + (f16 * f28) + (fArr2[6] * f17) + (f24 * f18), f34 + (f5 * f35), (f25 * f36) + (f31 * f37) + (f10 * f33) + (f11 * f35), (f27 * f36) + (f38 * f39) + (f14 * f33) + (f15 * f35), (f36 * f29) + (f39 * f40) + (f17 * fArr2[10]) + (f35 * f18), f46 + (f5 * f47), (f25 * f48) + (f37 * f42) + (fArr[9] * f45) + (f11 * f47), (f27 * f48) + (f38 * f49) + (fArr[10] * f45) + (f15 * f47), (f29 * f48) + (f40 * f49) + (fArr[11] * fArr2[14]) + (f18 * f47)};
    }
}
