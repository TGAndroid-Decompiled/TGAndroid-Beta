package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline1;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;

public final class TimerParticles {
    public boolean big;
    public final ArrayList freeParticles;
    public boolean hasLast;
    public long lastAnimationTime;
    public float lastCx;
    public float lastCy;
    public final ArrayList particles;
    public final int particlesCount;

    public final class Particle {
        public float alpha;
        public float currentTime;
        public float lifeTime;
        public float velocity;
        public float vx;
        public float vy;
        public float x;
        public float y;
    }

    public TimerParticles() {
        this(40);
    }

    public final void draw(float f, float f2, Canvas canvas, Paint paint, RectF rectF) {
        Particle particle;
        ArrayList arrayList = this.particles;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Particle particle2 = (Particle) arrayList.get(i2);
            paint.setAlpha((int) (particle2.alpha * 255.0f * f2));
            canvas.drawPoint(particle2.x, particle2.y, paint);
        }
        double d = ((double) (f - 90.0f)) * 0.017453292519943295d;
        double dSin = Math.sin(d);
        double d2 = -Math.cos(d);
        double dWidth = rectF.width() / 2.0f;
        float fCenterX = (float) (((-d2) * dWidth) + ((double) rectF.centerX()));
        float fCenterY = (float) ((dWidth * dSin) + ((double) rectF.centerY()));
        ArrayList arrayList2 = this.freeParticles;
        int iClamp = Utilities.clamp(arrayList2.size() / 12, 3, 1);
        int i3 = 0;
        while (i3 < iClamp) {
            if (arrayList2.isEmpty()) {
                particle = new Particle();
            } else {
                particle = (Particle) arrayList2.get(i);
                arrayList2.remove(i);
            }
            if (this.big && this.hasLast) {
                float f3 = (i3 + 1) / iClamp;
                particle.x = AndroidUtilities.lerp(this.lastCx, fCenterX, f3);
                particle.y = AndroidUtilities.lerp(this.lastCy, fCenterY, f3);
            } else {
                particle.x = fCenterX;
                particle.y = fCenterY;
            }
            double d3 = dSin;
            double dNextInt = ((double) (Utilities.random.nextInt(140) - 70)) * 0.017453292519943295d;
            if (dNextInt < 0.0d) {
                dNextInt += 6.283185307179586d;
            }
            particle.vx = (float) ((Math.cos(dNextInt) * d3) - (Math.sin(dNextInt) * d2));
            double dSin2 = Math.sin(dNextInt) * d3;
            double d4 = dNextInt;
            Particle particle3 = particle;
            particle3.vy = (float) AndroidUtilities$$ExternalSyntheticOutline1.m(d4, d2, dSin2);
            particle3.alpha = 1.0f;
            particle3.currentTime = 0.0f;
            if (this.big) {
                particle3.lifeTime = Utilities.random.nextInt(200) + 600;
                particle3.velocity = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                particle3.lifeTime = Utilities.random.nextInt(100) + 400;
                particle3.velocity = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(particle3);
            i3++;
            dSin = d3;
            i = 0;
        }
        this.hasLast = true;
        this.lastCx = fCenterX;
        this.lastCy = fCenterY;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMin = Math.min(20L, jElapsedRealtime - this.lastAnimationTime);
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Particle particle4 = (Particle) arrayList.get(i4);
            float f4 = particle4.currentTime;
            float f5 = particle4.lifeTime;
            if (f4 >= f5) {
                if (arrayList2.size() < this.particlesCount) {
                    arrayList2.add(particle4);
                }
                arrayList.remove(i4);
                i4--;
                size2--;
            } else {
                particle4.alpha = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f4 / f5);
                float f6 = particle4.x;
                float f7 = particle4.vx;
                float f8 = particle4.velocity;
                float f9 = jMin;
                particle4.x = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(f7 * f8, f9, 200.0f, f6);
                particle4.y = (((particle4.vy * f8) * f9) / 200.0f) + particle4.y;
                particle4.currentTime += f9;
            }
            i4++;
        }
        this.lastAnimationTime = jElapsedRealtime;
    }

    public TimerParticles(int i) {
        this.particles = new ArrayList();
        this.freeParticles = new ArrayList();
        this.particlesCount = i;
        for (int i2 = 0; i2 < i; i2++) {
            this.freeParticles.add(new Particle());
        }
    }
}
