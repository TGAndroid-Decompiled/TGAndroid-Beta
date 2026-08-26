package org.telegram.ui.Components.Paint;

public abstract class GLMatrix {
    public static float[] LoadOrtho(float f, float f2) {
        float f3 = f - 0.0f;
        float f4 = f2 - 0.0f;
        return new float[]{2.0f / f3, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f / f4, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, (-(f + 0.0f)) / f3, (-(f2 + 0.0f)) / f4, -0.0f, 1.0f};
    }

    public static float[] MultiplyMat4f(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[4];
        float f4 = fArr2[1];
        float f5 = fArr[8];
        float f6 = fArr2[2];
        float f7 = fArr[12];
        float f8 = fArr2[3];
        float f9 = f7 * f8;
        float f10 = f9 + (f5 * f6) + (f3 * f4) + (f * f2);
        float f11 = fArr[1];
        float f12 = fArr[5];
        float f13 = fArr[9];
        float f14 = fArr[13];
        float f15 = f14 * f8;
        float f16 = f15 + (f13 * f6) + (f12 * f4) + (f11 * f2);
        float f17 = fArr[2];
        float f18 = fArr[6];
        float f19 = fArr[10];
        float f20 = fArr[14];
        float f21 = f20 * f8;
        float f22 = f21 + (f19 * f6) + (f18 * f4) + (f17 * f2);
        float f23 = fArr[3];
        float f24 = fArr[7];
        float f25 = fArr[11];
        float f26 = fArr[15];
        float f27 = f8 * f26;
        float f28 = f27 + (f6 * f25) + (f4 * f24) + (f2 * f23);
        float f29 = fArr2[4];
        float f30 = fArr2[5];
        float f31 = fArr2[6];
        float f32 = fArr2[7];
        float f33 = (f7 * f32) + (f5 * f31) + (f3 * f30) + (f * f29);
        float f34 = (f14 * f32) + (f13 * f31) + (f12 * f30) + (f11 * f29);
        float f35 = (f20 * f32) + (f19 * f31) + (f18 * f30) + (f17 * f29);
        float f36 = f32 * f26;
        float f37 = f36 + (f31 * f25) + (f30 * f24) + (f29 * f23);
        float f38 = fArr2[8];
        float f39 = fArr2[9];
        float f40 = fArr2[10];
        float f41 = fArr2[11];
        float f42 = (f7 * f41) + (f5 * f40) + (f3 * f39) + (f * f38);
        float f43 = (f14 * f41) + (f13 * f40) + (f12 * f39) + (f11 * f38);
        float f44 = (f20 * f41) + (f19 * f40) + (f18 * f39) + (f17 * f38);
        float f45 = f41 * f26;
        float f46 = f45 + (f40 * f25) + (f39 * f24) + (f38 * f23);
        float f47 = fArr2[12];
        float f48 = fArr2[13];
        float f49 = (f3 * f48) + (f * f47);
        float f50 = fArr2[14];
        float f51 = (f5 * f50) + f49;
        float f52 = fArr2[15];
        return new float[]{f10, f16, f22, f28, f33, f34, f35, f37, f42, f43, f44, f46, (f7 * f52) + f51, (f14 * f52) + (f13 * f50) + (f12 * f48) + (f11 * f47), (f20 * f52) + (f19 * f50) + (f18 * f48) + (f17 * f47), (f26 * f52) + (f25 * f50) + (f24 * f48) + (f23 * f47)};
    }
}
