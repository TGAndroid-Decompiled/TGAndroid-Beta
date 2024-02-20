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
    private ArrayList<Particle> freeParticles;
    private boolean hasLast;
    private long lastAnimationTime;
    private float lastCx;
    private float lastCy;
    private ArrayList<Particle> particles;
    private final int particlesCount;

    public static class Particle {
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
        this.particles = new ArrayList<>();
        this.freeParticles = new ArrayList<>();
        this.particlesCount = i;
        for (int i2 = 0; i2 < i; i2++) {
            this.freeParticles.add(new Particle());
        }
    }

    private void updateParticles(long j) {
        int size = this.particles.size();
        int i = 0;
        while (i < size) {
            Particle particle = this.particles.get(i);
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
                float f6 = (float) j;
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
            Particle particle2 = this.particles.get(i2);
            paint.setAlpha((int) (particle2.alpha * 255.0f * f2));
            canvas.drawPoint(particle2.x, particle2.y, paint);
        }
        double d = f - 90.0f;
        double d2 = 0.017453292519943295d;
        Double.isNaN(d);
        double d3 = d * 0.017453292519943295d;
        double sin = Math.sin(d3);
        double d4 = -Math.cos(d3);
        double width = rectF.width() / 2.0f;
        Double.isNaN(width);
        double centerX = rectF.centerX();
        Double.isNaN(centerX);
        float f3 = (float) (((-d4) * width) + centerX);
        Double.isNaN(width);
        double centerY = rectF.centerY();
        Double.isNaN(centerY);
        float f4 = (float) ((width * sin) + centerY);
        int clamp = Utilities.clamp(this.freeParticles.size() / 12, 3, 1);
        int i3 = 0;
        while (i3 < clamp) {
            if (!this.freeParticles.isEmpty()) {
                particle = this.freeParticles.get(i);
                this.freeParticles.remove(i);
            } else {
                particle = new Particle();
            }
            if (this.big && this.hasLast) {
                float f5 = (i3 + 1) / clamp;
                particle.x = AndroidUtilities.lerp(this.lastCx, f3, f5);
                particle.y = AndroidUtilities.lerp(this.lastCy, f4, f5);
            } else {
                particle.x = f3;
                particle.y = f4;
            }
            double nextInt = Utilities.random.nextInt(140) - 70;
            Double.isNaN(nextInt);
            double d5 = nextInt * d2;
            if (d5 < 0.0d) {
                d5 += 6.283185307179586d;
            }
            particle.vx = (float) ((Math.cos(d5) * sin) - (Math.sin(d5) * d4));
            particle.vy = (float) ((Math.sin(d5) * sin) + (Math.cos(d5) * d4));
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
            d2 = 0.017453292519943295d;
        }
        this.hasLast = true;
        this.lastCx = f3;
        this.lastCy = f4;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        updateParticles(Math.min(20L, elapsedRealtime - this.lastAnimationTime));
        this.lastAnimationTime = elapsedRealtime;
    }
}
