package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;

public class FireworksEffect {
    private long lastAnimationTime;
    private Paint particlePaint;
    final float angleDiff = 1.0471976f;
    private ArrayList<Particle> particles = new ArrayList<>();
    private ArrayList<Particle> freeParticles = new ArrayList<>();

    public class Particle {
        float alpha;
        int color;
        float currentTime;
        float lifeTime;
        float scale;
        int type;
        float velocity;
        float vx;
        float vy;
        float x;
        float y;

        private Particle() {
        }

        public void draw(Canvas canvas) {
            if (this.type != 0) {
                return;
            }
            FireworksEffect.this.particlePaint.setColor(this.color);
            FireworksEffect.this.particlePaint.setStrokeWidth(AndroidUtilities.dp(1.5f) * this.scale);
            FireworksEffect.this.particlePaint.setAlpha((int) (this.alpha * 255.0f));
            canvas.drawPoint(this.x, this.y, FireworksEffect.this.particlePaint);
        }
    }

    public FireworksEffect() {
        Paint paint = new Paint(1);
        this.particlePaint = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.particlePaint.setColor(Theme.getColor(null, Theme.key_actionBarDefaultTitle, false) & (-1644826));
        this.particlePaint.setStrokeCap(Paint.Cap.ROUND);
        this.particlePaint.setStyle(Paint.Style.STROKE);
        for (int i = 0; i < 20; i++) {
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
                float f3 = particle.x;
                float f4 = particle.vx;
                float f5 = particle.velocity;
                float f6 = j;
                particle.x = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(f4 * f5, f6, 500.0f, f3);
                float f7 = particle.y;
                float f8 = particle.vy;
                particle.y = (((f5 * f8) * f6) / 500.0f) + f7;
                particle.vy = (f6 / 100.0f) + f8;
                particle.currentTime += f6;
            }
            i++;
        }
    }

    public void onDraw(View view, Canvas canvas) {
        int i;
        Particle particle;
        if (view == null || canvas == null) {
            return;
        }
        int size = this.particles.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.particles.get(i2).draw(canvas);
        }
        if (Utilities.random.nextBoolean() && this.particles.size() + 8 < 150) {
            int i3 = AndroidUtilities.statusBarHeight;
            float fNextFloat = Utilities.random.nextFloat() * view.getMeasuredWidth();
            float fNextFloat2 = (Utilities.random.nextFloat() * RichMessageLayout$$ExternalSyntheticOutline1.m(20.0f, view.getMeasuredHeight(), i3)) + i3;
            int iNextInt = Utilities.random.nextInt(4);
            if (iNextInt == 0) {
                i = -13357350;
            } else if (iNextInt == 1) {
                i = -843755;
            } else if (iNextInt != 2) {
                i = iNextInt != 3 ? -5752 : -15088582;
            } else {
                i = -207021;
            }
            for (int i4 = 0; i4 < 8; i4++) {
                double dNextInt = ((double) (Utilities.random.nextInt(270) - 225)) * 0.017453292519943295d;
                float fCos = (float) Math.cos(dNextInt);
                float fSin = (float) Math.sin(dNextInt);
                if (this.freeParticles.isEmpty()) {
                    particle = new Particle();
                } else {
                    particle = this.freeParticles.get(0);
                    this.freeParticles.remove(0);
                }
                particle.x = fNextFloat;
                particle.y = fNextFloat2;
                particle.vx = fCos * 1.5f;
                particle.vy = fSin;
                particle.color = i;
                particle.alpha = 1.0f;
                particle.currentTime = 0.0f;
                particle.scale = Math.max(1.0f, Utilities.random.nextFloat() * 1.5f);
                particle.type = 0;
                particle.lifeTime = Utilities.random.nextInt(1000) + 1000;
                particle.velocity = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                this.particles.add(particle);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        updateParticles(Math.min(17L, jCurrentTimeMillis - this.lastAnimationTime));
        this.lastAnimationTime = jCurrentTimeMillis;
        view.invalidate();
    }
}
