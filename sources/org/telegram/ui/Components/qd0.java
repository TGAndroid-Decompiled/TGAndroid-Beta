package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.NativeByteBuffer;
public final class qd0 {
    public float f37268a = 0.0f;
    public float f37269b = 25.0f;
    public float f37270c = 50.0f;
    public float d = 75.0f;
    public float f37271e = 100.0f;
    public float[] f37272f;

    public final float[] a() {
        float f10 = this.f37268a;
        float f11 = this.f37271e;
        int i7 = 2;
        int i10 = 5;
        char c10 = '\f';
        char c11 = '\r';
        float[] fArr = {-0.001f, f10 / 100.0f, 0.0f, f10 / 100.0f, 0.25f, this.f37269b / 100.0f, 0.5f, this.f37270c / 100.0f, 0.75f, this.d / 100.0f, 1.0f, f11 / 100.0f, 1.001f, f11 / 100.0f};
        int i11 = 100;
        ArrayList arrayList = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(100);
        arrayList2.add(Float.valueOf(fArr[0]));
        arrayList2.add(Float.valueOf(fArr[1]));
        int i12 = 1;
        while (i12 < i10) {
            int i13 = (i12 - 1) * i7;
            float f12 = fArr[i13];
            float f13 = fArr[i13 + 1];
            int i14 = i12 * 2;
            float f14 = fArr[i14];
            float f15 = fArr[i14 + 1];
            int i15 = i12 + 1;
            int i16 = i15 * 2;
            int i17 = i7;
            float f16 = fArr[i16];
            char c12 = c10;
            float f17 = fArr[i16 + 1];
            int i18 = (i12 + 2) * 2;
            float f18 = fArr[i18];
            float f19 = fArr[i18 + 1];
            char c13 = c11;
            int i19 = 1;
            while (i19 < i11) {
                float f20 = i19 * 0.01f;
                float f21 = f20 * f20;
                float f22 = f21 * f20;
                float z9 = ((((((f14 * 3.0f) - f12) - (f16 * 3.0f)) + f18) * f22) + ((((f16 * 4.0f) + ((f12 * 2.0f) - (f14 * 5.0f))) - f18) * f21) + com.google.android.recaptcha.internal.a.z(f16, f12, f20, f14 * 2.0f)) * 0.5f;
                float max = Math.max(0.0f, Math.min(1.0f, ((((((f15 * 3.0f) - f13) - (f17 * 3.0f)) + f19) * f22) + ((((4.0f * f17) + ((2.0f * f13) - (5.0f * f15))) - f19) * f21) + com.google.android.recaptcha.internal.a.z(f17, f13, f20, f15 * 2.0f)) * 0.5f));
                if (z9 > f12) {
                    arrayList2.add(Float.valueOf(z9));
                    arrayList2.add(Float.valueOf(max));
                }
                if ((i19 - 1) % 2 == 0) {
                    arrayList.add(Float.valueOf(max));
                }
                i19++;
                i11 = 100;
            }
            arrayList2.add(Float.valueOf(f16));
            arrayList2.add(Float.valueOf(f17));
            i12 = i15;
            i7 = i17;
            c10 = c12;
            c11 = c13;
            i10 = 5;
            i11 = 100;
        }
        arrayList2.add(Float.valueOf(fArr[c10]));
        arrayList2.add(Float.valueOf(fArr[c11]));
        this.f37272f = new float[arrayList.size()];
        int i20 = 0;
        while (true) {
            float[] fArr2 = this.f37272f;
            if (i20 >= fArr2.length) {
                break;
            }
            fArr2[i20] = ((Float) arrayList.get(i20)).floatValue();
            i20++;
        }
        int size = arrayList2.size();
        float[] fArr3 = new float[size];
        for (int i21 = 0; i21 < size; i21++) {
            fArr3[i21] = ((Float) arrayList2.get(i21)).floatValue();
        }
        return fArr3;
    }

    public final boolean b() {
        if (Math.abs(this.f37268a - 0.0f) < 1.0E-5d && Math.abs(this.f37269b - 25.0f) < 1.0E-5d && Math.abs(this.f37270c - 50.0f) < 1.0E-5d && Math.abs(this.d - 75.0f) < 1.0E-5d && Math.abs(this.f37271e - 100.0f) < 1.0E-5d) {
            return true;
        }
        return false;
    }

    public final void c(NativeByteBuffer nativeByteBuffer) {
        this.f37268a = nativeByteBuffer.readFloat(true);
        this.f37269b = nativeByteBuffer.readFloat(true);
        this.f37270c = nativeByteBuffer.readFloat(true);
        this.d = nativeByteBuffer.readFloat(true);
        this.f37271e = nativeByteBuffer.readFloat(true);
    }

    public final void d(NativeByteBuffer nativeByteBuffer) {
        nativeByteBuffer.writeFloat(this.f37268a);
        nativeByteBuffer.writeFloat(this.f37269b);
        nativeByteBuffer.writeFloat(this.f37270c);
        nativeByteBuffer.writeFloat(this.d);
        nativeByteBuffer.writeFloat(this.f37271e);
    }
}
