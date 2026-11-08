package org.telegram.ui.Components.voip;

import java.util.Random;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.r9;
public final class c3 extends r9 {
    public final void g(float f10, float f11) {
        if (sc.e(this.f37588r)) {
            int i7 = 0;
            while (true) {
                float f12 = i7;
                float f13 = this.f37584n;
                if (f12 < f13) {
                    float[] fArr = this.f37579i;
                    float f14 = fArr[i7];
                    float[] fArr2 = this.f37580j;
                    float f15 = fArr2[i7];
                    float f16 = (f15 * f10 * 8.2f * 1.0f) + (0.8f * f15) + f14;
                    fArr[i7] = f16;
                    if (f16 >= 1.0f) {
                        fArr[i7] = 0.0f;
                        float[] fArr3 = this.f37578g;
                        this.f37576e[i7] = fArr3[i7];
                        float[] fArr4 = this.h;
                        this.f37577f[i7] = fArr4[i7];
                        if (f11 < 1.0f) {
                            float f17 = 360.0f / f13;
                            float f18 = this.f37574b;
                            float f19 = this.f37573a;
                            Random random = this.f37583m;
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
