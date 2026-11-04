package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.NativeByteBuffer;
public final class ld0 {
    public float f35707a = 0.0f;
    public float f35708b = 25.0f;
    public float f35709c = 50.0f;
    public float d = 75.0f;
    public float f35710e = 100.0f;
    public float[] f35711f;

    public final float[] a() {
        float f10 = this.f35707a;
        float f11 = this.f35710e;
        int i3 = 2;
        int i10 = 5;
        char c2 = '\f';
        char c10 = '\r';
        float[] fArr = {-0.001f, f10 / 100.0f, 0.0f, f10 / 100.0f, 0.25f, this.f35708b / 100.0f, 0.5f, this.f35709c / 100.0f, 0.75f, this.d / 100.0f, 1.0f, f11 / 100.0f, 1.001f, f11 / 100.0f};
        int i11 = 100;
        ArrayList arrayList = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(100);
        arrayList2.add(Float.valueOf(fArr[0]));
        arrayList2.add(Float.valueOf(fArr[1]));
        int i12 = 1;
        while (i12 < i10) {
            int i13 = (i12 - 1) * i3;
            float f12 = fArr[i13];
            float f13 = fArr[i13 + 1];
            int i14 = i12 * 2;
            float f14 = fArr[i14];
            float f15 = fArr[i14 + 1];
            int i15 = i12 + 1;
            int i16 = i15 * 2;
            int i17 = i3;
            float f16 = fArr[i16];
            char c11 = c2;
            float f17 = fArr[i16 + 1];
            int i18 = (i12 + 2) * 2;
            float f18 = fArr[i18];
            float f19 = fArr[i18 + 1];
            char c12 = c10;
            int i19 = 1;
            while (i19 < i11) {
                float f20 = i19 * 0.01f;
                float f21 = f20 * f20;
                float f22 = f21 * f20;
                float y9 = ((((((f14 * 3.0f) - f12) - (f16 * 3.0f)) + f18) * f22) + ((((f16 * 4.0f) + ((f12 * 2.0f) - (f14 * 5.0f))) - f18) * f21) + com.google.android.recaptcha.internal.a.y(f16, f12, f20, f14 * 2.0f)) * 0.5f;
                float max = Math.max(0.0f, Math.min(1.0f, ((((((f15 * 3.0f) - f13) - (f17 * 3.0f)) + f19) * f22) + ((((4.0f * f17) + ((2.0f * f13) - (5.0f * f15))) - f19) * f21) + com.google.android.recaptcha.internal.a.y(f17, f13, f20, f15 * 2.0f)) * 0.5f));
                if (y9 > f12) {
                    arrayList2.add(Float.valueOf(y9));
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
            i3 = i17;
            c2 = c11;
            c10 = c12;
            i10 = 5;
            i11 = 100;
        }
        arrayList2.add(Float.valueOf(fArr[c2]));
        arrayList2.add(Float.valueOf(fArr[c10]));
        this.f35711f = new float[arrayList.size()];
        int i20 = 0;
        while (true) {
            float[] fArr2 = this.f35711f;
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
        if (Math.abs(this.f35707a - 0.0f) < 1.0E-5d && Math.abs(this.f35708b - 25.0f) < 1.0E-5d && Math.abs(this.f35709c - 50.0f) < 1.0E-5d && Math.abs(this.d - 75.0f) < 1.0E-5d && Math.abs(this.f35710e - 100.0f) < 1.0E-5d) {
            return true;
        }
        return false;
    }

    public final void c(NativeByteBuffer nativeByteBuffer) {
        this.f35707a = nativeByteBuffer.readFloat(true);
        this.f35708b = nativeByteBuffer.readFloat(true);
        this.f35709c = nativeByteBuffer.readFloat(true);
        this.d = nativeByteBuffer.readFloat(true);
        this.f35710e = nativeByteBuffer.readFloat(true);
    }

    public final void d(NativeByteBuffer nativeByteBuffer) {
        nativeByteBuffer.writeFloat(this.f35707a);
        nativeByteBuffer.writeFloat(this.f35708b);
        nativeByteBuffer.writeFloat(this.f35709c);
        nativeByteBuffer.writeFloat(this.d);
        nativeByteBuffer.writeFloat(this.f35710e);
    }
}
