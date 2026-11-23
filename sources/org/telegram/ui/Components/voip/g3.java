package org.telegram.ui.Components.voip;

import java.util.Random;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.v9;
public final class g3 extends v9 {
    public final void g(float f10, float f11) {
        if (pc.e(this.f40610r)) {
            int i7 = 0;
            while (true) {
                float f12 = i7;
                float f13 = this.f40606n;
                if (f12 < f13) {
                    float[] fArr = this.f40601i;
                    float f14 = fArr[i7];
                    float[] fArr2 = this.f40602j;
                    float f15 = fArr2[i7];
                    float f16 = (f15 * f10 * 8.2f * 1.0f) + (0.8f * f15) + f14;
                    fArr[i7] = f16;
                    if (f16 >= 1.0f) {
                        fArr[i7] = 0.0f;
                        float[] fArr3 = this.f40600g;
                        this.f40598e[i7] = fArr3[i7];
                        float[] fArr4 = this.h;
                        this.f40599f[i7] = fArr4[i7];
                        if (f11 < 1.0f) {
                            float f17 = 360.0f / f13;
                            float f18 = this.f40596b;
                            float f19 = this.f40595a;
                            Random random = this.f40605m;
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
