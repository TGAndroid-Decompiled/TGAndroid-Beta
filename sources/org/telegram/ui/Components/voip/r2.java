package org.telegram.ui.Components.voip;

import java.util.Random;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.q9;
public final class r2 extends q9 {
    public final void g(float f10, float f11) {
        if (lc.e(this.f37396r)) {
            int i3 = 0;
            while (true) {
                float f12 = i3;
                float f13 = this.f37392n;
                if (f12 < f13) {
                    float[] fArr = this.f37387i;
                    float f14 = fArr[i3];
                    float[] fArr2 = this.f37388j;
                    float f15 = fArr2[i3];
                    float f16 = (f15 * f10 * 8.2f * 1.0f) + (0.8f * f15) + f14;
                    fArr[i3] = f16;
                    if (f16 >= 1.0f) {
                        fArr[i3] = 0.0f;
                        float[] fArr3 = this.f37386g;
                        this.f37384e[i3] = fArr3[i3];
                        float[] fArr4 = this.h;
                        this.f37385f[i3] = fArr4[i3];
                        if (f11 < 1.0f) {
                            float f17 = 360.0f / f13;
                            float f18 = this.f37382b;
                            float f19 = this.f37381a;
                            Random random = this.f37391m;
                            fArr3[i3] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f18 - f19) * f11) + f19;
                            fArr4[i3] = ((((random.nextInt() * f11) % 100.0f) / 100.0f) * 0.05f * f17) + (f17 * f12);
                            fArr2[i3] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
                        } else {
                            c(fArr3, fArr4, i3);
                        }
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }
}
