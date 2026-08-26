package org.telegram.ui.Components.voip;

import java.util.Random;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.BlobDrawable;

public final class VoipBlobDrawable extends BlobDrawable {
    public VoipBlobDrawable(int i) {
        super(i, 512);
    }

    public final void update$1(float f, float f2) {
        if (!LiteMode.isEnabled(this.liteFlag)) {
            return;
        }
        int i = 0;
        while (true) {
            float f3 = i;
            float f4 = this.N;
            if (f3 >= f4) {
                return;
            }
            float[] fArr = this.progress;
            float f5 = fArr[i];
            float[] fArr2 = this.speed;
            float f6 = fArr2[i];
            float f7 = (f6 * f * 8.2f * 1.0f) + (0.8f * f6) + f5;
            fArr[i] = f7;
            if (f7 >= 1.0f) {
                fArr[i] = 0.0f;
                float[] fArr3 = this.radiusNext;
                this.radius[i] = fArr3[i];
                float[] fArr4 = this.angleNext;
                this.angle[i] = fArr4[i];
                if (f2 < 1.0f) {
                    float f8 = 360.0f / f4;
                    float f9 = this.maxRadius;
                    float f10 = this.minRadius;
                    Random random = this.random;
                    fArr3[i] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f9 - f10) * f2) + f10;
                    fArr4[i] = ((((random.nextInt() * f2) % 100.0f) / 100.0f) * 0.05f * f8) + (f8 * f3);
                    fArr2[i] = (float) ((((double) (Math.abs(random.nextInt() % 100.0f) / 100.0f)) * 0.003d) + 0.017d);
                } else {
                    generateBlob(fArr3, fArr4, i);
                }
            }
            i++;
        }
    }
}
