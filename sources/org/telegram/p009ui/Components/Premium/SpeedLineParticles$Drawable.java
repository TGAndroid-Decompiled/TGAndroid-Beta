package org.telegram.p009ui.Components.Premium;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.Theme;

public class SpeedLineParticles$Drawable {
    public final int count;
    private int lastColor;
    private float[] lines;
    public boolean paused;
    long pausedTime;
    public RectF rect = new RectF();
    public RectF screenRect = new RectF();
    private Paint paint = new Paint();
    ArrayList<Particle> particles = new ArrayList<>();
    public float speedScale = 1.0f;
    public long minLifeTime = 2000;
    private final float f1117dt = 1000.0f / AndroidUtilities.screenRefreshRate;

    public SpeedLineParticles$Drawable(int i) {
        this.count = i;
        this.lines = new float[i * 4];
    }

    public void init() {
        if (this.particles.isEmpty()) {
            for (int i = 0; i < this.count; i++) {
                this.particles.add(new Particle());
            }
        }
        updateColors();
    }

    public void updateColors() {
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor("premiumStartSmallStarsColor2"), 80);
        if (this.lastColor != alphaComponent) {
            this.lastColor = alphaComponent;
            this.paint.setColor(alphaComponent);
        }
    }

    public void resetPositions() {
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < this.particles.size(); i++) {
            this.particles.get(i).genPosition(currentTimeMillis, true);
        }
    }

    public void onDraw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < this.particles.size(); i++) {
            Particle particle = this.particles.get(i);
            if (this.paused) {
                particle.draw(canvas, i, this.pausedTime);
            } else {
                particle.draw(canvas, i, currentTimeMillis);
            }
            if (currentTimeMillis > particle.lifeTime || !this.screenRect.contains(particle.f1118x, particle.f1119y)) {
                particle.genPosition(currentTimeMillis, false);
            }
        }
        canvas.drawLines(this.lines, this.paint);
    }

    public class Particle {
        float inProgress;
        private long lifeTime;
        private float vecX;
        private float vecY;
        private float f1118x;
        private float f1119y;

        private Particle() {
            SpeedLineParticles$Drawable.this = r1;
        }

        public void draw(Canvas canvas, int i, long j) {
            int i2 = i * 4;
            SpeedLineParticles$Drawable.this.lines[i2] = this.f1118x;
            SpeedLineParticles$Drawable.this.lines[i2 + 1] = this.f1119y;
            SpeedLineParticles$Drawable.this.lines[i2 + 2] = this.f1118x + (AndroidUtilities.m35dp(30.0f) * this.vecX);
            SpeedLineParticles$Drawable.this.lines[i2 + 3] = this.f1119y + (AndroidUtilities.m35dp(30.0f) * this.vecY);
            if (SpeedLineParticles$Drawable.this.paused) {
                return;
            }
            float m35dp = AndroidUtilities.m35dp(4.0f) * (SpeedLineParticles$Drawable.this.f1117dt / 660.0f);
            SpeedLineParticles$Drawable speedLineParticles$Drawable = SpeedLineParticles$Drawable.this;
            float f = m35dp * speedLineParticles$Drawable.speedScale;
            this.f1118x += this.vecX * f;
            this.f1119y += this.vecY * f;
            float f2 = this.inProgress;
            if (f2 != 1.0f) {
                float f3 = f2 + (speedLineParticles$Drawable.f1117dt / 200.0f);
                this.inProgress = f3;
                if (f3 > 1.0f) {
                    this.inProgress = 1.0f;
                }
            }
        }

        public void genPosition(long j, boolean z) {
            this.lifeTime = j + SpeedLineParticles$Drawable.this.minLifeTime + Utilities.fastRandom.nextInt(1000);
            SpeedLineParticles$Drawable speedLineParticles$Drawable = SpeedLineParticles$Drawable.this;
            RectF rectF = z ? speedLineParticles$Drawable.screenRect : speedLineParticles$Drawable.rect;
            float abs = rectF.left + Math.abs(Utilities.fastRandom.nextInt() % rectF.width());
            this.f1118x = abs;
            this.f1119y = rectF.top + Math.abs(Utilities.fastRandom.nextInt() % rectF.height());
            double atan2 = Math.atan2(abs - SpeedLineParticles$Drawable.this.rect.centerX(), this.f1119y - SpeedLineParticles$Drawable.this.rect.centerY());
            this.vecX = (float) Math.sin(atan2);
            this.vecY = (float) Math.cos(atan2);
            Utilities.fastRandom.nextInt(50);
            this.inProgress = 0.0f;
        }
    }
}
