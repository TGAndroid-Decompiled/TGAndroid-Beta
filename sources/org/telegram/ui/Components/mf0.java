package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
public final class mf0 {
    public float f29037a = 0.0f;
    public float f29038b = 25.0f;
    public float f29039c = 50.0f;
    public float d = 75.0f;
    public float f29040e = 100.0f;
    public float[] f29041f;

    public final float[] a() {
        float f10 = this.f29037a;
        float f11 = this.f29040e;
        int i10 = 5;
        float[] fArr = {-0.001f, f10 / 100.0f, 0.0f, f10 / 100.0f, 0.25f, this.f29038b / 100.0f, 0.5f, this.f29039c / 100.0f, 0.75f, this.d / 100.0f, 1.0f, f11 / 100.0f, 1.001f, f11 / 100.0f};
        int i11 = 100;
        ArrayList arrayList = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(100);
        arrayList2.add(Float.valueOf(fArr[0]));
        arrayList2.add(Float.valueOf(fArr[1]));
        int i12 = 1;
        while (i12 < i10) {
            int i13 = (i12 - 1) * 2;
            float f12 = fArr[i13];
            float f13 = fArr[i13 + 1];
            int i14 = i12 * 2;
            float f14 = fArr[i14];
            float f15 = fArr[i14 + 1];
            int i15 = i12 + 1;
            int i16 = i15 * 2;
            float f16 = fArr[i16];
            float f17 = fArr[i16 + 1];
            int i17 = (i12 + 2) * 2;
            float f18 = fArr[i17];
            float f19 = fArr[i17 + 1];
            int i18 = 1;
            while (i18 < i11) {
                float f20 = i18 * 0.01f;
                float f21 = f20 * f20;
                float f22 = f21 * f20;
                float w10 = ((((((f14 * 3.0f) - f12) - (f16 * 3.0f)) + f18) * f22) + ((((f16 * 4.0f) + ((f12 * 2.0f) - (f14 * 5.0f))) - f18) * f21) + e2.c.w(f16, f12, f20, f14 * 2.0f)) * 0.5f;
                float max = Math.max(0.0f, Math.min(1.0f, ((((((f15 * 3.0f) - f13) - (f17 * 3.0f)) + f19) * f22) + ((((4.0f * f17) + ((2.0f * f13) - (5.0f * f15))) - f19) * f21) + e2.c.w(f17, f13, f20, f15 * 2.0f)) * 0.5f));
                if (w10 > f12) {
                    arrayList2.add(Float.valueOf(w10));
                    arrayList2.add(Float.valueOf(max));
                }
                if ((i18 - 1) % 2 == 0) {
                    arrayList.add(Float.valueOf(max));
                }
                i18++;
                i11 = 100;
            }
            arrayList2.add(Float.valueOf(f16));
            arrayList2.add(Float.valueOf(f17));
            i12 = i15;
            i10 = 5;
            i11 = 100;
        }
        arrayList2.add(Float.valueOf(fArr[12]));
        arrayList2.add(Float.valueOf(fArr[13]));
        this.f29041f = new float[arrayList.size()];
        int i19 = 0;
        while (true) {
            float[] fArr2 = this.f29041f;
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
        if (Math.abs(this.f29037a - 0.0f) < 1.0E-5d && Math.abs(this.f29038b - 25.0f) < 1.0E-5d && Math.abs(this.f29039c - 50.0f) < 1.0E-5d && Math.abs(this.d - 75.0f) < 1.0E-5d && Math.abs(this.f29040e - 100.0f) < 1.0E-5d) {
            return true;
        }
        return false;
    }

    public final void c(InputSerializedData inputSerializedData, boolean z4) {
        this.f29037a = inputSerializedData.readFloat(z4);
        this.f29038b = inputSerializedData.readFloat(z4);
        this.f29039c = inputSerializedData.readFloat(z4);
        this.d = inputSerializedData.readFloat(z4);
        this.f29040e = inputSerializedData.readFloat(z4);
    }

    public final void d(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeFloat(this.f29037a);
        outputSerializedData.writeFloat(this.f29038b);
        outputSerializedData.writeFloat(this.f29039c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f29040e);
    }
}
