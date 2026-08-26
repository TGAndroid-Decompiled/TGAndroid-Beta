package org.telegram.ui.Components.voip;

import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.BlobDrawable;

public final class VoipBlobDrawable extends BlobDrawable {
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
            float f6 = this.speed[i];
            float f7 = (f6 * f * BlobDrawable.MAX_SPEED * 1.0f) + (BlobDrawable.MIN_SPEED * f6) + f5;
            fArr[i] = f7;
            if (f7 >= 1.0f) {
                fArr[i] = 0.0f;
                float[] fArr2 = this.radius;
                float[] fArr3 = this.radiusNext;
                fArr2[i] = fArr3[i];
                float[] fArr4 = this.angle;
                float[] fArr5 = this.angleNext;
                fArr4[i] = fArr5[i];
                if (f2 < 1.0f) {
                    float f8 = this.maxRadius;
                    float f9 = this.minRadius;
                    fArr3[i] = (Math.abs((this.random.nextInt() % 100.0f) / 100.0f) * (f8 - f9) * f2) + f9;
                    fArr5[i] = ((((this.random.nextInt() * f2) % 100.0f) / 100.0f) * (360.0f / f4) * 0.05f) + ((360.0f / this.N) * f3);
                    this.speed[i] = (float) ((((double) (Math.abs(this.random.nextInt() % 100.0f) / 100.0f)) * 0.003d) + 0.017d);
                } else {
                    generateBlob(fArr3, fArr5, i);
                }
            }
            i++;
        }
    }
}
