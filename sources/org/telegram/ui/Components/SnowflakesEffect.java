package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;

public class SnowflakesEffect {
    private int color;
    private long lastAnimationTime;
    Bitmap particleBitmap;
    private Paint particlePaint;
    private Paint particleThinPaint;
    private int viewType;
    private Paint bitmapPaint = new Paint();
    private int colorKey = Theme.key_actionBarDefaultTitle;
    final float angleDiff = 1.0471976f;
    private ArrayList particles = new ArrayList();
    private ArrayList freeParticles = new ArrayList();

    public class Particle {
        float alpha;
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
            if (this.type == 0) {
                SnowflakesEffect.this.particlePaint.setAlpha((int) (this.alpha * 255.0f));
                canvas.drawPoint(this.x, this.y, SnowflakesEffect.this.particlePaint);
                return;
            }
            SnowflakesEffect snowflakesEffect = SnowflakesEffect.this;
            if (snowflakesEffect.particleBitmap == null) {
                snowflakesEffect.particleThinPaint.setAlpha(255);
                SnowflakesEffect.this.particleBitmap = Bitmap.createBitmap(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(SnowflakesEffect.this.particleBitmap);
                float dpf2 = AndroidUtilities.dpf2(2.0f) * 2.0f;
                float f = (-AndroidUtilities.dpf2(0.57f)) * 2.0f;
                float dpf22 = 2.0f * AndroidUtilities.dpf2(1.55f);
                float f2 = -1.5707964f;
                int i = 0;
                while (i < 6) {
                    float dp = AndroidUtilities.dp(8.0f);
                    float dp2 = AndroidUtilities.dp(8.0f);
                    double d = f2;
                    float cos = ((float) Math.cos(d)) * dpf2;
                    float sin = ((float) Math.sin(d)) * dpf2;
                    canvas2.drawLine(dp, dp2, dp + cos, dp2 + sin, SnowflakesEffect.this.particleThinPaint);
                    double d2 = (float) (d - 1.5707963267948966d);
                    double d3 = f;
                    float f3 = dpf2;
                    double d4 = dpf22;
                    float f4 = dpf22;
                    float f5 = dp + (cos * 0.66f);
                    float f6 = dp2 + (sin * 0.66f);
                    canvas2.drawLine(f5, f6, dp + ((float) ((Math.cos(d2) * d3) - (Math.sin(d2) * d4))), dp2 + ((float) ((Math.sin(d2) * d3) + (Math.cos(d2) * d4))), SnowflakesEffect.this.particleThinPaint);
                    canvas2.drawLine(f5, f6, dp + ((float) (((-Math.cos(d2)) * d3) - (Math.sin(d2) * d4))), dp2 + ((float) (((-Math.sin(d2)) * d3) + (Math.cos(d2) * d4))), SnowflakesEffect.this.particleThinPaint);
                    f2 += 1.0471976f;
                    i++;
                    dpf2 = f3;
                    f = f;
                    dpf22 = f4;
                }
            }
            SnowflakesEffect.this.bitmapPaint.setAlpha((int) (this.alpha * 255.0f));
            canvas.save();
            float f7 = this.scale;
            canvas.scale(f7, f7, this.x, this.y);
            SnowflakesEffect snowflakesEffect2 = SnowflakesEffect.this;
            canvas.drawBitmap(snowflakesEffect2.particleBitmap, this.x, this.y, snowflakesEffect2.bitmapPaint);
            canvas.restore();
        }
    }

    public SnowflakesEffect(int i) {
        this.viewType = i;
        Paint paint = new Paint(1);
        this.particlePaint = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        Paint paint2 = this.particlePaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        Paint paint3 = this.particlePaint;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint(1);
        this.particleThinPaint = paint4;
        paint4.setStrokeWidth(AndroidUtilities.dp(0.5f));
        this.particleThinPaint.setStrokeCap(cap);
        this.particleThinPaint.setStyle(style);
        updateColors();
        for (int i2 = 0; i2 < 20; i2++) {
            this.freeParticles.add(new Particle());
        }
    }

    public void setColorKey(int i) {
        this.colorKey = i;
        updateColors();
    }

    public void updateColors() {
        int color = Theme.getColor(this.colorKey) & (-1644826);
        if (this.color != color) {
            this.color = color;
            this.particlePaint.setColor(color);
            this.particleThinPaint.setColor(color);
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
                if (this.freeParticles.size() < 40) {
                    this.freeParticles.add(particle);
                }
                this.particles.remove(i);
                i--;
                size--;
            } else {
                if (this.viewType == 0) {
                    if (f < 200.0f) {
                        particle.alpha = AndroidUtilities.accelerateInterpolator.getInterpolation(f / 200.0f);
                    } else {
                        particle.alpha = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f - 200.0f) / (f2 - 200.0f));
                    }
                } else if (f < 200.0f) {
                    particle.alpha = AndroidUtilities.accelerateInterpolator.getInterpolation(f / 200.0f);
                } else {
                    float f3 = f2 - f;
                    if (f3 < 2000.0f) {
                        particle.alpha = AndroidUtilities.decelerateInterpolator.getInterpolation(f3 / 2000.0f);
                    }
                }
                float f4 = particle.x;
                float f5 = particle.vx;
                float f6 = particle.velocity;
                float f7 = (float) j;
                particle.x = f4 + (((f5 * f6) * f7) / 500.0f);
                particle.y += ((particle.vy * f6) * f7) / 500.0f;
                particle.currentTime += f7;
            }
            i++;
        }
    }

    public void onDraw(View view, Canvas canvas) {
        Particle particle;
        if (view == null || canvas == null || !LiteMode.isEnabled(32)) {
            return;
        }
        int size = this.particles.size();
        for (int i = 0; i < size; i++) {
            ((Particle) this.particles.get(i)).draw(canvas);
        }
        int i2 = this.viewType;
        int i3 = i2 == 0 ? 100 : 300;
        int i4 = i2 == 0 ? 1 : 10;
        if (this.particles.size() < i3) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (this.particles.size() < i3 && Utilities.random.nextFloat() > 0.7f) {
                    int i6 = AndroidUtilities.statusBarHeight;
                    float nextFloat = Utilities.random.nextFloat() * view.getMeasuredWidth();
                    float nextFloat2 = i6 + (Utilities.random.nextFloat() * ((view.getMeasuredHeight() - AndroidUtilities.dp(20.0f)) - i6));
                    double nextInt = (Utilities.random.nextInt(40) + 70) * 0.017453292519943295d;
                    float cos = (float) Math.cos(nextInt);
                    float sin = (float) Math.sin(nextInt);
                    if (!this.freeParticles.isEmpty()) {
                        particle = (Particle) this.freeParticles.get(0);
                        this.freeParticles.remove(0);
                    } else {
                        particle = new Particle();
                    }
                    particle.x = nextFloat;
                    particle.y = nextFloat2;
                    particle.vx = cos;
                    particle.vy = sin;
                    particle.alpha = 0.0f;
                    particle.currentTime = 0.0f;
                    particle.scale = Utilities.random.nextFloat() * 1.2f;
                    particle.type = Utilities.random.nextInt(2);
                    if (this.viewType == 0) {
                        particle.lifeTime = Utilities.random.nextInt(100) + 2000;
                    } else {
                        particle.lifeTime = Utilities.random.nextInt(2000) + 3000;
                    }
                    particle.velocity = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                    this.particles.add(particle);
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        updateParticles(Math.min(17L, currentTimeMillis - this.lastAnimationTime));
        this.lastAnimationTime = currentTimeMillis;
        view.invalidate();
    }
}
