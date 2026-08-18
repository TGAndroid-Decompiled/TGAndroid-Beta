package org.telegram.ui.Components.Premium;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;

public class MatrixParticlesDrawable {
    MatrixTextParticle[][] matrixTextParticles;
    ArrayList[] particles;
    int size;
    RectF excludeRect = new RectF();
    Bitmap[] bitmaps = new Bitmap[16];
    Rect drawingRect = new Rect();
    Paint paint = new Paint();

    void init() {
        this.size = AndroidUtilities.dp(16.0f);
        TextPaint textPaint = new TextPaint(65);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(this.size);
        textPaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_premiumStartSmallStarsColor2), 30));
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i = 0;
        while (i < 16) {
            int i2 = i < 10 ? i + 48 : i + 55;
            Bitmap[] bitmapArr = this.bitmaps;
            int i3 = this.size;
            bitmapArr[i] = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.bitmaps[i]);
            String string = Character.toString((char) i2);
            int i4 = this.size;
            canvas.drawText(string, i4 >> 1, i4, textPaint);
            i++;
        }
    }

    void onDraw(Canvas canvas) {
        int iWidth = this.drawingRect.width() / this.size;
        int iHeight = this.drawingRect.height() / this.size;
        if (iWidth == 0 || iHeight == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList[] arrayListArr = this.particles;
        AnonymousClass1 anonymousClass1 = null;
        if (arrayListArr == null || arrayListArr.length != iWidth + 1) {
            this.particles = new ArrayList[iWidth + 1];
            for (int i = 0; i <= iWidth; i++) {
                this.particles[i] = new ArrayList();
                Particle particle = new Particle();
                particle.init(iHeight, jCurrentTimeMillis);
                this.particles[i].add(particle);
            }
        }
        MatrixTextParticle[][] matrixTextParticleArr = this.matrixTextParticles;
        if (matrixTextParticleArr == null || matrixTextParticleArr.length != iWidth + 1 || matrixTextParticleArr[0].length != iHeight + 1) {
            this.matrixTextParticles = new MatrixTextParticle[iWidth + 1][];
            for (int i2 = 0; i2 <= iWidth; i2++) {
                this.matrixTextParticles[i2] = new MatrixTextParticle[iHeight + 1];
                for (int i3 = 0; i3 <= iHeight; i3++) {
                    this.matrixTextParticles[i2][i3] = new MatrixTextParticle();
                    this.matrixTextParticles[i2][i3].init(jCurrentTimeMillis);
                }
            }
        }
        int i4 = 0;
        while (i4 <= iWidth) {
            ArrayList arrayList = this.particles[i4];
            int i5 = 0;
            while (i5 < arrayList.size()) {
                Particle particle2 = (Particle) arrayList.get(i5);
                int i6 = 1;
                if (jCurrentTimeMillis - particle2.time > 50) {
                    int i7 = particle2.y + 1;
                    particle2.y = i7;
                    particle2.time = jCurrentTimeMillis;
                    if (i7 - particle2.len >= iHeight) {
                        if (arrayList.size() == 1) {
                            particle2.reset(jCurrentTimeMillis);
                        } else {
                            arrayList.remove(particle2);
                            i5--;
                        }
                    }
                    if (particle2.y > particle2.len && i5 == arrayList.size() - 1 && Math.abs(Utilities.fastRandom.nextInt(4)) == 0) {
                        Particle particle3 = new Particle();
                        particle3.reset(jCurrentTimeMillis);
                        arrayList.add(particle3);
                    }
                }
                int i8 = i5;
                int iMin = Math.min(particle2.y, iHeight + 1);
                int iMax = Math.max(0, particle2.y - particle2.len);
                while (iMax < iMin) {
                    int i9 = this.size;
                    float f = i9 * i4;
                    float f2 = i9 * iMax;
                    if (!this.excludeRect.contains(f, f2)) {
                        this.matrixTextParticles[i4][iMax].draw(canvas, f, f2, jCurrentTimeMillis, Utilities.clamp(((1.0f - ((particle2.y - iMax) / (particle2.len - i6))) * 0.8f) + 0.2f, 1.0f, 0.0f));
                    }
                    iMax++;
                    iMin = iMin;
                    particle2 = particle2;
                    i6 = 1;
                }
                i5 = i8 + 1;
                anonymousClass1 = null;
            }
            i4++;
            anonymousClass1 = null;
        }
    }

    private class Particle {
        int len;
        long time;
        int y;

        private Particle() {
            this.len = 5;
        }

        public void init(int i, long j) {
            this.y = Math.abs(Utilities.fastRandom.nextInt() % i);
            this.time = j;
            this.len = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
        }

        public void reset(long j) {
            this.y = 0;
            this.time = j;
            this.len = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
        }
    }

    private class MatrixTextParticle {
        int index;
        long lastUpdateTime;
        int nextIndex;
        long nextUpdateTime;

        private MatrixTextParticle() {
        }

        public void init(long j) {
            this.index = Math.abs(Utilities.fastRandom.nextInt() % 16);
            this.nextIndex = Math.abs(Utilities.fastRandom.nextInt() % 16);
            this.lastUpdateTime = j;
            this.nextUpdateTime = j + ((long) Math.abs(Utilities.fastRandom.nextInt() % 300)) + 150;
        }

        public void draw(Canvas canvas, float f, float f2, long j, float f3) {
            long j2 = this.nextUpdateTime - j;
            if (j2 < 150) {
                float fClamp = Utilities.clamp(1.0f - (j2 / 150.0f), 1.0f, 0.0f);
                MatrixParticlesDrawable.this.paint.setAlpha((int) ((1.0f - fClamp) * f3 * 255.0f));
                MatrixParticlesDrawable matrixParticlesDrawable = MatrixParticlesDrawable.this;
                canvas.drawBitmap(matrixParticlesDrawable.bitmaps[this.index], f, f2, matrixParticlesDrawable.paint);
                MatrixParticlesDrawable.this.paint.setAlpha((int) (f3 * fClamp * 255.0f));
                MatrixParticlesDrawable matrixParticlesDrawable2 = MatrixParticlesDrawable.this;
                canvas.drawBitmap(matrixParticlesDrawable2.bitmaps[this.nextIndex], f, f2, matrixParticlesDrawable2.paint);
                MatrixParticlesDrawable.this.paint.setAlpha(255);
                if (fClamp >= 1.0f) {
                    this.index = this.nextIndex;
                    this.lastUpdateTime = j;
                    this.nextIndex = Math.abs(Utilities.fastRandom.nextInt() % 16);
                    this.nextUpdateTime = j + ((long) Math.abs(Utilities.fastRandom.nextInt() % 300)) + 150;
                    return;
                }
                return;
            }
            MatrixParticlesDrawable.this.paint.setAlpha((int) (f3 * 255.0f));
            MatrixParticlesDrawable matrixParticlesDrawable3 = MatrixParticlesDrawable.this;
            canvas.drawBitmap(matrixParticlesDrawable3.bitmaps[this.index], f, f2, matrixParticlesDrawable3.paint);
        }
    }
}
