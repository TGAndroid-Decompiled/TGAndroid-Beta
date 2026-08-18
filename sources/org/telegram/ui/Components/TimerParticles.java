package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public class TimerParticles {
    public boolean big;
    private ArrayList freeParticles;
    private boolean hasLast;
    private long lastAnimationTime;
    private float lastCx;
    private float lastCy;
    private ArrayList particles;
    private final int particlesCount;

    private static class Particle {
        float alpha;
        float currentTime;
        float lifeTime;
        float velocity;
        float vx;
        float vy;
        float x;
        float y;

        private Particle() {
        }
    }

    public TimerParticles() {
        this(40);
    }

    public TimerParticles(int i) {
        this.particles = new ArrayList();
        this.freeParticles = new ArrayList();
        this.particlesCount = i;
        for (int i2 = 0; i2 < i; i2++) {
            this.freeParticles.add(new Particle());
        }
    }

    private void updateParticles(long j) {
        int size = this.particles.size();
        int i = 0;
        while (i < size) {
            Particle particle = (Particle) this.particles.get(i);
            float f = particle.currentTime;
            float f2 = particle.lifeTime;
            if (f >= f2) {
                if (this.freeParticles.size() < this.particlesCount) {
                    this.freeParticles.add(particle);
                }
                this.particles.remove(i);
                i--;
                size--;
            } else {
                particle.alpha = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f / f2);
                float f3 = particle.x;
                float f4 = particle.vx;
                float f5 = particle.velocity;
                float f6 = j;
                particle.x = f3 + (((f4 * f5) * f6) / 200.0f);
                particle.y += ((particle.vy * f5) * f6) / 200.0f;
                particle.currentTime += f6;
            }
            i++;
        }
    }

    public void draw(Canvas canvas, Paint paint, RectF rectF, float f, float f2) {
        Particle particle;
        int size = this.particles.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Particle particle2 = (Particle) this.particles.get(i2);
            paint.setAlpha((int) (particle2.alpha * 255.0f * f2));
            canvas.drawPoint(particle2.x, particle2.y, paint);
        }
        double d = 0.017453292519943295d;
        double d2 = ((double) (f - 90.0f)) * 0.017453292519943295d;
        double dSin = Math.sin(d2);
        double d3 = -Math.cos(d2);
        double dWidth = rectF.width() / 2.0f;
        float fCenterX = (float) (((-d3) * dWidth) + ((double) rectF.centerX()));
        float fCenterY = (float) ((dWidth * dSin) + ((double) rectF.centerY()));
        int iClamp = Utilities.clamp(this.freeParticles.size() / 12, 3, 1);
        int i3 = 0;
        while (i3 < iClamp) {
            if (!this.freeParticles.isEmpty()) {
                particle = (Particle) this.freeParticles.get(i);
                this.freeParticles.remove(i);
            } else {
                particle = new Particle();
            }
            if (this.big && this.hasLast) {
                float f3 = (i3 + 1) / iClamp;
                particle.x = AndroidUtilities.lerp(this.lastCx, fCenterX, f3);
                particle.y = AndroidUtilities.lerp(this.lastCy, fCenterY, f3);
            } else {
                particle.x = fCenterX;
                particle.y = fCenterY;
            }
            double dNextInt = ((double) (Utilities.random.nextInt(140) - 70)) * d;
            if (dNextInt < 0.0d) {
                dNextInt += 6.283185307179586d;
            }
            particle.vx = (float) ((Math.cos(dNextInt) * dSin) - (Math.sin(dNextInt) * d3));
            particle.vy = (float) ((Math.sin(dNextInt) * dSin) + (Math.cos(dNextInt) * d3));
            particle.alpha = 1.0f;
            particle.currentTime = 0.0f;
            if (this.big) {
                particle.lifeTime = Utilities.random.nextInt(200) + 600;
                particle.velocity = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                particle.lifeTime = Utilities.random.nextInt(100) + 400;
                particle.velocity = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            this.particles.add(particle);
            i3++;
            i = 0;
            d = 0.017453292519943295d;
        }
        this.hasLast = true;
        this.lastCx = fCenterX;
        this.lastCy = fCenterY;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        updateParticles(Math.min(20L, jElapsedRealtime - this.lastAnimationTime));
        this.lastAnimationTime = jElapsedRealtime;
    }
}
