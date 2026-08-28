package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
public final class ne0 {
    public float f31083a = 0.0f;
    public float f31084b = 25.0f;
    public float f31085c = 50.0f;
    public float d = 75.0f;
    public float f31086e = 100.0f;
    public float[] f31087f;

    public final float[] a() {
        float f10 = this.f31083a;
        float f11 = this.f31086e;
        int i9 = 5;
        float[] fArr = {-0.001f, f10 / 100.0f, 0.0f, f10 / 100.0f, 0.25f, this.f31084b / 100.0f, 0.5f, this.f31085c / 100.0f, 0.75f, this.d / 100.0f, 1.0f, f11 / 100.0f, 1.001f, f11 / 100.0f};
        int i10 = 100;
        ArrayList arrayList = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(100);
        arrayList2.add(Float.valueOf(fArr[0]));
        arrayList2.add(Float.valueOf(fArr[1]));
        int i11 = 1;
        while (i11 < i9) {
            int i12 = (i11 - 1) * 2;
            float f12 = fArr[i12];
            float f13 = fArr[i12 + 1];
            int i13 = i11 * 2;
            float f14 = fArr[i13];
            float f15 = fArr[i13 + 1];
            int i14 = i11 + 1;
            int i15 = i14 * 2;
            float f16 = fArr[i15];
            float f17 = fArr[i15 + 1];
            int i16 = (i11 + 2) * 2;
            float f18 = fArr[i16];
            float f19 = fArr[i16 + 1];
            int i17 = 1;
            while (i17 < i10) {
                float f20 = i17 * 0.01f;
                float f21 = f20 * f20;
                float f22 = f21 * f20;
                float z10 = ((((((f14 * 3.0f) - f12) - (f16 * 3.0f)) + f18) * f22) + ((((f16 * 4.0f) + ((f12 * 2.0f) - (f14 * 5.0f))) - f18) * f21) + e2.c.z(f16, f12, f20, f14 * 2.0f)) * 0.5f;
                float max = Math.max(0.0f, Math.min(1.0f, ((((((f15 * 3.0f) - f13) - (f17 * 3.0f)) + f19) * f22) + ((((4.0f * f17) + ((2.0f * f13) - (5.0f * f15))) - f19) * f21) + e2.c.z(f17, f13, f20, f15 * 2.0f)) * 0.5f));
                if (z10 > f12) {
                    arrayList2.add(Float.valueOf(z10));
                    arrayList2.add(Float.valueOf(max));
                }
                if ((i17 - 1) % 2 == 0) {
                    arrayList.add(Float.valueOf(max));
                }
                i17++;
                i10 = 100;
            }
            arrayList2.add(Float.valueOf(f16));
            arrayList2.add(Float.valueOf(f17));
            i11 = i14;
            i9 = 5;
            i10 = 100;
        }
        arrayList2.add(Float.valueOf(fArr[12]));
        arrayList2.add(Float.valueOf(fArr[13]));
        this.f31087f = new float[arrayList.size()];
        int i18 = 0;
        while (true) {
            float[] fArr2 = this.f31087f;
            if (i18 >= fArr2.length) {
                break;
            }
            fArr2[i18] = ((Float) arrayList.get(i18)).floatValue();
            i18++;
        }
        int size = arrayList2.size();
        float[] fArr3 = new float[size];
        for (int i19 = 0; i19 < size; i19++) {
            fArr3[i19] = ((Float) arrayList2.get(i19)).floatValue();
        }
        return fArr3;
    }

    public final boolean b() {
        if (Math.abs(this.f31083a - 0.0f) < 1.0E-5d && Math.abs(this.f31084b - 25.0f) < 1.0E-5d && Math.abs(this.f31085c - 50.0f) < 1.0E-5d && Math.abs(this.d - 75.0f) < 1.0E-5d && Math.abs(this.f31086e - 100.0f) < 1.0E-5d) {
            return true;
        }
        return false;
    }

    public final void c(InputSerializedData inputSerializedData, boolean z10) {
        this.f31083a = inputSerializedData.readFloat(z10);
        this.f31084b = inputSerializedData.readFloat(z10);
        this.f31085c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.f31086e = inputSerializedData.readFloat(z10);
    }

    public final void d(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeFloat(this.f31083a);
        outputSerializedData.writeFloat(this.f31084b);
        outputSerializedData.writeFloat(this.f31085c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f31086e);
    }
}
