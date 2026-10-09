package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
public final class hg0 {
    public float f27064a = 0.0f;
    public float f27065b = 25.0f;
    public float f27066c = 50.0f;
    public float d = 75.0f;
    public float f27067e = 100.0f;
    public float[] f27068f;

    public final float[] a() {
        float f7 = this.f27064a;
        float f10 = this.f27067e;
        int i10 = 2;
        int i11 = 5;
        char c10 = '\f';
        char c11 = '\r';
        float[] fArr = {-0.001f, f7 / 100.0f, 0.0f, f7 / 100.0f, 0.25f, this.f27065b / 100.0f, 0.5f, this.f27066c / 100.0f, 0.75f, this.d / 100.0f, 1.0f, f10 / 100.0f, 1.001f, f10 / 100.0f};
        int i12 = 100;
        ArrayList arrayList = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(100);
        arrayList2.add(Float.valueOf(fArr[0]));
        arrayList2.add(Float.valueOf(fArr[1]));
        int i13 = 1;
        while (i13 < i11) {
            int i14 = (i13 - 1) * i10;
            float f11 = fArr[i14];
            float f12 = fArr[i14 + 1];
            int i15 = i13 * 2;
            float f13 = fArr[i15];
            float f14 = fArr[i15 + 1];
            int i16 = i13 + 1;
            int i17 = i16 * 2;
            int i18 = i10;
            float f15 = fArr[i17];
            char c12 = c10;
            float f16 = fArr[i17 + 1];
            int i19 = (i13 + 2) * 2;
            float f17 = fArr[i19];
            float f18 = fArr[i19 + 1];
            char c13 = c11;
            int i20 = 1;
            while (i20 < i12) {
                float f19 = i20 * 0.01f;
                float f20 = f19 * f19;
                float f21 = f20 * f19;
                float y3 = ((((((f13 * 3.0f) - f11) - (f15 * 3.0f)) + f17) * f21) + ((((f15 * 4.0f) + ((f11 * 2.0f) - (f13 * 5.0f))) - f17) * f20) + com.google.android.gms.internal.vision.e2.y(f15, f11, f19, f13 * 2.0f)) * 0.5f;
                float max = Math.max(0.0f, Math.min(1.0f, ((((((f14 * 3.0f) - f12) - (f16 * 3.0f)) + f18) * f21) + ((((4.0f * f16) + ((2.0f * f12) - (5.0f * f14))) - f18) * f20) + com.google.android.gms.internal.vision.e2.y(f16, f12, f19, f14 * 2.0f)) * 0.5f));
                if (y3 > f11) {
                    arrayList2.add(Float.valueOf(y3));
                    arrayList2.add(Float.valueOf(max));
                }
                if ((i20 - 1) % 2 == 0) {
                    arrayList.add(Float.valueOf(max));
                }
                i20++;
                i12 = 100;
            }
            arrayList2.add(Float.valueOf(f15));
            arrayList2.add(Float.valueOf(f16));
            i13 = i16;
            i10 = i18;
            c10 = c12;
            c11 = c13;
            i11 = 5;
            i12 = 100;
        }
        arrayList2.add(Float.valueOf(fArr[c10]));
        arrayList2.add(Float.valueOf(fArr[c11]));
        this.f27068f = new float[arrayList.size()];
        int i21 = 0;
        while (true) {
            float[] fArr2 = this.f27068f;
            if (i21 >= fArr2.length) {
                break;
            }
            fArr2[i21] = ((Float) arrayList.get(i21)).floatValue();
            i21++;
        }
        int size = arrayList2.size();
        float[] fArr3 = new float[size];
        for (int i22 = 0; i22 < size; i22++) {
            fArr3[i22] = ((Float) arrayList2.get(i22)).floatValue();
        }
        return fArr3;
    }

    public final boolean b() {
        if (Math.abs(this.f27064a - 0.0f) < 1.0E-5d && Math.abs(this.f27065b - 25.0f) < 1.0E-5d && Math.abs(this.f27066c - 50.0f) < 1.0E-5d && Math.abs(this.d - 75.0f) < 1.0E-5d && Math.abs(this.f27067e - 100.0f) < 1.0E-5d) {
            return true;
        }
        return false;
    }

    public final void c(InputSerializedData inputSerializedData, boolean z10) {
        this.f27064a = inputSerializedData.readFloat(z10);
        this.f27065b = inputSerializedData.readFloat(z10);
        this.f27066c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.f27067e = inputSerializedData.readFloat(z10);
    }

    public final void d(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeFloat(this.f27064a);
        outputSerializedData.writeFloat(this.f27065b);
        outputSerializedData.writeFloat(this.f27066c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f27067e);
    }
}
