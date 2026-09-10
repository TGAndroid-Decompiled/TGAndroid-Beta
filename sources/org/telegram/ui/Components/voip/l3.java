package org.telegram.ui.Components.voip;

import java.util.Random;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.ba;
public final class l3 extends ba {
    public final void g(float f7, float f10) {
        if (LiteMode.isEnabled(this.f21782r)) {
            int i10 = 0;
            while (true) {
                float f11 = i10;
                float f12 = this.f21778n;
                if (f11 < f12) {
                    float[] fArr = this.f21773i;
                    float f13 = fArr[i10];
                    float[] fArr2 = this.f21774j;
                    float f14 = fArr2[i10];
                    float f15 = (f14 * f7 * 8.2f * 1.0f) + (0.8f * f14) + f13;
                    fArr[i10] = f15;
                    if (f15 >= 1.0f) {
                        fArr[i10] = 0.0f;
                        float[] fArr3 = this.f21772g;
                        this.e[i10] = fArr3[i10];
                        float[] fArr4 = this.h;
                        this.f21771f[i10] = fArr4[i10];
                        if (f10 < 1.0f) {
                            float f16 = 360.0f / f12;
                            float f17 = this.f21769b;
                            float f18 = this.f21768a;
                            Random random = this.f21777m;
                            fArr3[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f17 - f18) * f10) + f18;
                            fArr4[i10] = ((((random.nextInt() * f10) % 100.0f) / 100.0f) * 0.05f * f16) + (f16 * f11);
                            fArr2[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
                        } else {
                            c(fArr3, fArr4, i10);
                        }
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }
}
