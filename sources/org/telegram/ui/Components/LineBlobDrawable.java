package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;

public class LineBlobDrawable {
    private final float N;
    public float maxRadius;
    public float minRadius;
    public Path path = new Path();
    private float[] progress;
    private float[] radius;
    private float[] radiusNext;
    final Random random;
    private float[] speed;

    public LineBlobDrawable(int i) {
        new Paint(1);
        this.random = new Random();
        this.N = i;
        int i2 = i + 1;
        this.radius = new float[i2];
        this.radiusNext = new float[i2];
        this.progress = new float[i2];
        this.speed = new float[i2];
        for (int i3 = 0; i3 <= this.N; i3++) {
            generateBlob(this.radius, i3);
            generateBlob(this.radiusNext, i3);
            this.progress[i3] = 0.0f;
        }
    }

    private void generateBlob(float[] fArr, int i) {
        float f = this.maxRadius;
        float f2 = this.minRadius;
        fArr[i] = f2 + (Math.abs((this.random.nextInt() % 100.0f) / 100.0f) * (f - f2));
        float[] fArr2 = this.speed;
        double abs = Math.abs(this.random.nextInt() % 100.0f) / 100.0f;
        Double.isNaN(abs);
        fArr2[i] = (float) ((abs * 0.003d) + 0.017d);
    }

    public void update(float f, float f2) {
        for (int i = 0; i <= this.N; i++) {
            float[] fArr = this.progress;
            float f3 = fArr[i];
            float[] fArr2 = this.speed;
            fArr[i] = f3 + (fArr2[i] * BlobDrawable.MIN_SPEED) + (fArr2[i] * f * BlobDrawable.MAX_SPEED * f2);
            if (fArr[i] >= 1.0f) {
                fArr[i] = 0.0f;
                float[] fArr3 = this.radius;
                float[] fArr4 = this.radiusNext;
                fArr3[i] = fArr4[i];
                generateBlob(fArr4, i);
            }
        }
    }

    public void draw(float f, float f2, float f3, float f4, Canvas canvas, Paint paint, float f5, float f6) {
        if (!LiteMode.isEnabled(LiteMode.FLAG_CALLS_ANIMATIONS)) {
            canvas.drawRect(f, f2, f3, f4, paint);
            return;
        }
        this.path.reset();
        this.path.moveTo(f3, f4);
        this.path.lineTo(f, f4);
        int i = 0;
        while (true) {
            float f7 = i;
            float f8 = this.N;
            if (f7 > f8) {
                canvas.drawPath(this.path, paint);
                return;
            }
            if (i == 0) {
                float f9 = this.progress[i];
                this.path.lineTo(f, ((f2 - ((this.radius[i] * (1.0f - f9)) + (this.radiusNext[i] * f9))) * f6) + (f5 * (1.0f - f6)));
            } else {
                float[] fArr = this.progress;
                int i2 = i - 1;
                float f10 = fArr[i2];
                float[] fArr2 = this.radius;
                float f11 = fArr2[i2] * (1.0f - f10);
                float[] fArr3 = this.radiusNext;
                float f12 = f11 + (fArr3[i2] * f10);
                float f13 = fArr[i];
                float f14 = (fArr2[i] * (1.0f - f13)) + (fArr3[i] * f13);
                float f15 = f3 - f;
                float f16 = (f15 / f8) * i2;
                float f17 = (f15 / f8) * f7;
                float f18 = f16 + ((f17 - f16) / 2.0f);
                float f19 = (1.0f - f6) * f5;
                float f20 = ((f2 - f14) * f6) + f19;
                this.path.cubicTo(f18, ((f2 - f12) * f6) + f19, f18, f20, f17, f20);
                if (f7 == this.N) {
                    this.path.lineTo(f3, f4);
                }
            }
            i++;
        }
    }
}
