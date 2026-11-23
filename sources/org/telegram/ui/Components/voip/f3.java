package org.telegram.ui.Components.voip;

import java.util.Random;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.w9;
public final class f3 extends w9 {
    public final void g(float f10, float f11) {
        if (qc.e(this.f41727r)) {
            int i7 = 0;
            while (true) {
                float f12 = i7;
                float f13 = this.f41723n;
                if (f12 < f13) {
                    float[] fArr = this.f41718i;
                    float f14 = fArr[i7];
                    float[] fArr2 = this.f41719j;
                    float f15 = fArr2[i7];
                    float f16 = (f15 * f10 * 8.2f * 1.0f) + (0.8f * f15) + f14;
                    fArr[i7] = f16;
                    if (f16 >= 1.0f) {
                        fArr[i7] = 0.0f;
                        float[] fArr3 = this.f41717g;
                        this.f41715e[i7] = fArr3[i7];
                        float[] fArr4 = this.h;
                        this.f41716f[i7] = fArr4[i7];
                        if (f11 < 1.0f) {
                            float f17 = 360.0f / f13;
                            float f18 = this.f41713b;
                            float f19 = this.f41712a;
                            Random random = this.f41722m;
                            fArr3[i7] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f18 - f19) * f11) + f19;
                            fArr4[i7] = ((((random.nextInt() * f11) % 100.0f) / 100.0f) * 0.05f * f17) + (f17 * f12);
                            fArr2[i7] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
                        } else {
                            c(fArr3, fArr4, i7);
                        }
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }
}
