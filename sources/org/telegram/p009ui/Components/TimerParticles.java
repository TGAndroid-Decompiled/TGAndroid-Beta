package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public class TimerParticles {
    private long lastAnimationTime;
    private ArrayList<Particle> particles = new ArrayList<>();
    private ArrayList<Particle> freeParticles = new ArrayList<>();

    public static class Particle {
        float alpha;
        float currentTime;
        float lifeTime;
        float velocity;
        float f1080vx;
        float f1081vy;
        float f1082x;
        float f1083y;

        private Particle() {
        }
    }

    public TimerParticles() {
        for (int i = 0; i < 40; i++) {
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
                if (this.freeParticles.size() < 40) {
                    this.freeParticles.add(particle);
                }
                this.particles.remove(i);
                i--;
                size--;
            } else {
                particle.alpha = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f / f2);
                float f3 = particle.f1082x;
                float f4 = particle.f1080vx;
                float f5 = particle.velocity;
                float f6 = (float) j;
                particle.f1082x = f3 + (((f4 * f5) * f6) / 500.0f);
                particle.f1083y += ((particle.f1081vy * f5) * f6) / 500.0f;
                particle.currentTime += f6;
            }
            i++;
        }
    }

    public void draw(Canvas canvas, Paint paint, RectF rectF, float f, float f2) {
        Particle particle;
        int size = this.particles.size();
        for (int i = 0; i < size; i++) {
            Particle particle2 = this.particles.get(i);
            paint.setAlpha((int) (particle2.alpha * 255.0f * f2));
            canvas.drawPoint(particle2.f1082x, particle2.f1083y, paint);
        }
        double d = f - 90.0f;
        Double.isNaN(d);
        double d2 = d * 0.017453292519943295d;
        double sin = Math.sin(d2);
        double d3 = -Math.cos(d2);
        double width = rectF.width() / 2.0f;
        Double.isNaN(width);
        double centerX = rectF.centerX();
        Double.isNaN(centerX);
        float f3 = (float) (((-d3) * width) + centerX);
        Double.isNaN(width);
        double centerY = rectF.centerY();
        Double.isNaN(centerY);
        float f4 = (float) ((width * sin) + centerY);
        for (int i2 = 0; i2 < 1; i2++) {
            if (!this.freeParticles.isEmpty()) {
                particle = this.freeParticles.get(0);
                this.freeParticles.remove(0);
            } else {
                particle = new Particle();
            }
            particle.f1082x = f3;
            particle.f1083y = f4;
            double nextInt = Utilities.random.nextInt(140) - 70;
            Double.isNaN(nextInt);
            double d4 = nextInt * 0.017453292519943295d;
            if (d4 < 0.0d) {
                d4 += 6.283185307179586d;
            }
            particle.f1080vx = (float) ((Math.cos(d4) * sin) - (Math.sin(d4) * d3));
            particle.f1081vy = (float) ((Math.sin(d4) * sin) + (Math.cos(d4) * d3));
            particle.alpha = 1.0f;
            particle.currentTime = 0.0f;
            particle.lifeTime = Utilities.random.nextInt(100) + 400;
            particle.velocity = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            this.particles.add(particle);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        updateParticles(Math.min(20L, elapsedRealtime - this.lastAnimationTime));
        this.lastAnimationTime = elapsedRealtime;
    }
}
