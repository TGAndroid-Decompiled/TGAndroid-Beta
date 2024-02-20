package org.telegram.ui.Components.voip;

import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.BlobDrawable;
public class VoipBlobDrawable extends BlobDrawable {
    public VoipBlobDrawable(int i) {
        super(i);
    }

    protected void generateBlob(float[] fArr, float[] fArr2, int i, float f) {
        float f2 = this.maxRadius;
        float f3 = this.minRadius;
        fArr[i] = f3 + (Math.abs((this.random.nextInt() % 100.0f) / 100.0f) * (f2 - f3) * f);
        fArr2[i] = ((360.0f / this.N) * i) + ((((this.random.nextInt() * f) % 100.0f) / 100.0f) * (360.0f / this.N) * 0.05f);
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
                float[] fArr2 = this.speed;
                fArr[i] = f4 + (fArr2[i] * BlobDrawable.MIN_SPEED) + (fArr2[i] * f * BlobDrawable.MAX_SPEED * f2);
                if (fArr[i] >= 1.0f) {
                    fArr[i] = 0.0f;
                    float[] fArr3 = this.radius;
                    float[] fArr4 = this.radiusNext;
                    fArr3[i] = fArr4[i];
                    float[] fArr5 = this.angle;
                    float[] fArr6 = this.angleNext;
                    fArr5[i] = fArr6[i];
                    if (f3 < 1.0f) {
                        generateBlob(fArr4, fArr6, i, f3);
                    } else {
                        generateBlob(fArr4, fArr6, i);
                    }
                }
            }
        }
    }
}
