package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;

public final class se0 {

    public float f32408a = 0.0f;

    public float f32409b = 25.0f;

    public float f32410c = 50.0f;
    public float d = 75.0f;

    public float f32411e = 100.0f;

    public float[] f32412f;

    public final float[] a() {
        float f10 = this.f32408a;
        float f11 = this.f32409b / 100.0f;
        float f12 = this.f32410c / 100.0f;
        float f13 = this.d / 100.0f;
        float f14 = this.f32411e;
        int i10 = 5;
        float[] fArr = {-0.001f, f10 / 100.0f, 0.0f, f10 / 100.0f, 0.25f, f11, 0.5f, f12, 0.75f, f13, 1.0f, f14 / 100.0f, 1.001f, f14 / 100.0f};
        int i11 = 100;
        ArrayList arrayList = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(100);
        arrayList2.add(Float.valueOf(fArr[0]));
        arrayList2.add(Float.valueOf(fArr[1]));
        int i12 = 1;
        while (i12 < i10) {
            int i13 = (i12 - 1) * 2;
            float f15 = fArr[i13];
            float f16 = fArr[i13 + 1];
            int i14 = i12 * 2;
            float f17 = fArr[i14];
            float f18 = fArr[i14 + 1];
            int i15 = i12 + 1;
            int i16 = i15 * 2;
            float f19 = fArr[i16];
            float f20 = fArr[i16 + 1];
            int i17 = (i12 + 2) * 2;
            float f21 = fArr[i17];
            float f22 = fArr[i17 + 1];
            int i18 = 1;
            while (i18 < i11) {
                float f23 = i18 * 0.01f;
                float f24 = f23 * f23;
                float f25 = f24 * f23;
                float fZ = ((((((f17 * 3.0f) - f15) - (f19 * 3.0f)) + f21) * f25) + ((((f19 * 4.0f) + ((f15 * 2.0f) - (f17 * 5.0f))) - f21) * f24) + com.google.android.recaptcha.internal.a.z(f19, f15, f23, f17 * 2.0f)) * 0.5f;
                float fMax = Math.max(0.0f, Math.min(1.0f, ((((((f18 * 3.0f) - f16) - (f20 * 3.0f)) + f22) * f25) + ((((4.0f * f20) + ((2.0f * f16) - (5.0f * f18))) - f22) * f24) + com.google.android.recaptcha.internal.a.z(f20, f16, f23, f18 * 2.0f)) * 0.5f));
                if (fZ > f15) {
                    arrayList2.add(Float.valueOf(fZ));
                    arrayList2.add(Float.valueOf(fMax));
                }
                if ((i18 - 1) % 2 == 0) {
                    arrayList.add(Float.valueOf(fMax));
                }
                i18++;
                i11 = 100;
            }
            arrayList2.add(Float.valueOf(f19));
            arrayList2.add(Float.valueOf(f20));
            i12 = i15;
            i10 = 5;
            i11 = 100;
        }
        arrayList2.add(Float.valueOf(fArr[12]));
        arrayList2.add(Float.valueOf(fArr[13]));
        this.f32412f = new float[arrayList.size()];
        int i19 = 0;
        while (true) {
            float[] fArr2 = this.f32412f;
            if (i19 >= fArr2.length) {
                break;
            }
            fArr2[i19] = ((Float) arrayList.get(i19)).floatValue();
            i19++;
        }
        int size = arrayList2.size();
        float[] fArr3 = new float[size];
        for (int i20 = 0; i20 < size; i20++) {
            fArr3[i20] = ((Float) arrayList2.get(i20)).floatValue();
        }
        return fArr3;
    }

    public final boolean b() {
        return ((double) Math.abs(this.f32408a - 0.0f)) < 1.0E-5d && ((double) Math.abs(this.f32409b - 25.0f)) < 1.0E-5d && ((double) Math.abs(this.f32410c - 50.0f)) < 1.0E-5d && ((double) Math.abs(this.d - 75.0f)) < 1.0E-5d && ((double) Math.abs(this.f32411e - 100.0f)) < 1.0E-5d;
    }

    public final void c(InputSerializedData inputSerializedData, boolean z10) {
        this.f32408a = inputSerializedData.readFloat(z10);
        this.f32409b = inputSerializedData.readFloat(z10);
        this.f32410c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.f32411e = inputSerializedData.readFloat(z10);
    }

    public final void d(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeFloat(this.f32408a);
        outputSerializedData.writeFloat(this.f32409b);
        outputSerializedData.writeFloat(this.f32410c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f32411e);
    }
}
