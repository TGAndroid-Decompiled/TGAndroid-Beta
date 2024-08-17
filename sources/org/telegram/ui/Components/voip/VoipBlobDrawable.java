package org.telegram.ui.Components.voip;

import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.BlobDrawable;

public class VoipBlobDrawable extends BlobDrawable {
    public VoipBlobDrawable(int i) {
        super(i);
    }

    protected void generateBlob(float[] fArr, float[] fArr2, int i, float f) {
        float f2 = (360.0f / this.N) * 0.05f;
        float f3 = this.maxRadius;
        float f4 = this.minRadius;
        fArr[i] = f4 + (Math.abs((this.random.nextInt() % 100.0f) / 100.0f) * (f3 - f4) * f);
        fArr2[i] = ((360.0f / this.N) * i) + ((((this.random.nextInt() * f) % 100.0f) / 100.0f) * f2);
        float[] fArr3 = this.speed;
        double abs = Math.abs(this.random.nextInt() % 100.0f) / 100.0f;
        Double.isNaN(abs);
        fArr3[i] = (float) ((abs * 0.003d) + 0.017d);
    }

    public void update(float f, float f2, float f3) {
        if (LiteMode.isEnabled(this.liteFlag)) {
            for (int i = 0; i < this.N; i++) {
                float[] fArr = this.progress;
                float f4 = fArr[i];
                float f5 = this.speed[i];
                float f6 = f4 + (BlobDrawable.MIN_SPEED * f5) + (f5 * f * BlobDrawable.MAX_SPEED * f2);
                fArr[i] = f6;
                if (f6 >= 1.0f) {
                    fArr[i] = 0.0f;
                    float[] fArr2 = this.radius;
                    float[] fArr3 = this.radiusNext;
                    fArr2[i] = fArr3[i];
                    float[] fArr4 = this.angle;
                    float[] fArr5 = this.angleNext;
                    fArr4[i] = fArr5[i];
                    if (f3 < 1.0f) {
                        generateBlob(fArr3, fArr5, i, f3);
                    } else {
                        generateBlob(fArr3, fArr5, i);
                    }
                }
            }
        }
    }
}
