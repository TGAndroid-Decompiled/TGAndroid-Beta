package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
public final class gf0 {
    public float f26399a = 0.0f;
    public float f26400b = 25.0f;
    public float f26401c = 50.0f;
    public float d = 75.0f;
    public float f26402e = 100.0f;
    public float[] f26403f;

    public final float[] a() {
        float f7 = this.f26399a;
        float f10 = this.f26402e;
        int i10 = 5;
        float[] fArr = {-0.001f, f7 / 100.0f, 0.0f, f7 / 100.0f, 0.25f, this.f26400b / 100.0f, 0.5f, this.f26401c / 100.0f, 0.75f, this.d / 100.0f, 1.0f, f10 / 100.0f, 1.001f, f10 / 100.0f};
        int i11 = 100;
        ArrayList arrayList = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(100);
        arrayList2.add(Float.valueOf(fArr[0]));
        arrayList2.add(Float.valueOf(fArr[1]));
        int i12 = 1;
        while (i12 < i10) {
            int i13 = (i12 - 1) * 2;
            float f11 = fArr[i13];
            float f12 = fArr[i13 + 1];
            int i14 = i12 * 2;
            float f13 = fArr[i14];
            float f14 = fArr[i14 + 1];
            int i15 = i12 + 1;
            int i16 = i15 * 2;
            float f15 = fArr[i16];
            float f16 = fArr[i16 + 1];
            int i17 = (i12 + 2) * 2;
            float f17 = fArr[i17];
            float f18 = fArr[i17 + 1];
            int i18 = 1;
            while (i18 < i11) {
                float f19 = i18 * 0.01f;
                float f20 = f19 * f19;
                float f21 = f20 * f19;
                float z10 = ((((((f13 * 3.0f) - f11) - (f15 * 3.0f)) + f17) * f21) + ((((f15 * 4.0f) + ((f11 * 2.0f) - (f13 * 5.0f))) - f17) * f20) + com.google.android.gms.internal.vision.e2.z(f15, f11, f19, f13 * 2.0f)) * 0.5f;
                float max = Math.max(0.0f, Math.min(1.0f, ((((((f14 * 3.0f) - f12) - (f16 * 3.0f)) + f18) * f21) + ((((4.0f * f16) + ((2.0f * f12) - (5.0f * f14))) - f18) * f20) + com.google.android.gms.internal.vision.e2.z(f16, f12, f19, f14 * 2.0f)) * 0.5f));
                if (z10 > f11) {
                    arrayList2.add(Float.valueOf(z10));
                    arrayList2.add(Float.valueOf(max));
                }
                if ((i18 - 1) % 2 == 0) {
                    arrayList.add(Float.valueOf(max));
                }
                i18++;
                i11 = 100;
            }
            arrayList2.add(Float.valueOf(f15));
            arrayList2.add(Float.valueOf(f16));
            i12 = i15;
            i10 = 5;
            i11 = 100;
        }
        arrayList2.add(Float.valueOf(fArr[12]));
        arrayList2.add(Float.valueOf(fArr[13]));
        this.f26403f = new float[arrayList.size()];
        int i19 = 0;
        while (true) {
            float[] fArr2 = this.f26403f;
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
        if (Math.abs(this.f26399a - 0.0f) < 1.0E-5d && Math.abs(this.f26400b - 25.0f) < 1.0E-5d && Math.abs(this.f26401c - 50.0f) < 1.0E-5d && Math.abs(this.d - 75.0f) < 1.0E-5d && Math.abs(this.f26402e - 100.0f) < 1.0E-5d) {
            return true;
        }
        return false;
    }

    public final void c(InputSerializedData inputSerializedData, boolean z10) {
        this.f26399a = inputSerializedData.readFloat(z10);
        this.f26400b = inputSerializedData.readFloat(z10);
        this.f26401c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.f26402e = inputSerializedData.readFloat(z10);
    }

    public final void d(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeFloat(this.f26399a);
        outputSerializedData.writeFloat(this.f26400b);
        outputSerializedData.writeFloat(this.f26401c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f26402e);
    }
}
