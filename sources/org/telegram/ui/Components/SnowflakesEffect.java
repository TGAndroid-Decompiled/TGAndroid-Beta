package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline1;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;

public class SnowflakesEffect {
    private static final int TEXTURE_SIZE_DP = 10;
    private final BatchParticlesDrawHelper.BatchParticlesBuffer batchParticlesBuffer;
    private final Paint batchParticlesPaint;
    private int color;
    private int forcedColor;
    private long lastAnimationTime;
    private final int maxCount;
    Bitmap particleBitmap;
    private final Paint particlePaint;
    private final Paint particleThinPaint;
    private final int viewType;
    private final Paint bitmapPaint = new Paint();
    private int colorKey = Theme.key_actionBarDefaultTitle;
    private final ArrayList<Particle> particles = new ArrayList<>();
    private final ArrayList<Particle> freeParticles = new ArrayList<>();

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
                snowflakesEffect.particleBitmap = SnowflakesEffect.createParticlesBitmap(false);
            }
            SnowflakesEffect.this.bitmapPaint.setAlpha((int) (this.alpha * 255.0f));
            canvas.save();
            float f = this.scale;
            canvas.scale(f, f, this.x, this.y);
            SnowflakesEffect snowflakesEffect2 = SnowflakesEffect.this;
            canvas.drawBitmap(snowflakesEffect2.particleBitmap, this.x, this.y, snowflakesEffect2.bitmapPaint);
            canvas.restore();
        }
    }

    public SnowflakesEffect(int i) {
        this.viewType = i;
        int i2 = i == 0 ? 100 : 300;
        this.maxCount = i2;
        Paint paint = new Paint(1);
        this.particlePaint = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.particleThinPaint = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(0.5f));
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        if (BatchParticlesDrawHelper.isAvailable()) {
            this.batchParticlesBuffer = new BatchParticlesDrawHelper.BatchParticlesBuffer(i2);
            this.batchParticlesPaint = BatchParticlesDrawHelper.createBatchParticlesPaint(createParticlesBitmap(true));
        } else {
            this.batchParticlesBuffer = null;
            this.batchParticlesPaint = null;
        }
        updateColors();
        for (int i3 = 0; i3 < 20; i3++) {
            this.freeParticles.add(new Particle());
        }
    }

    public static Bitmap createParticlesBitmap(boolean z) {
        Paint paint = new Paint(1);
        paint.setStrokeWidth(AndroidUtilities.dp(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(z ? AndroidUtilities.dp(20.0f) : AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float fDpf2 = AndroidUtilities.dpf2(2.0f) * 2.0f;
        float f = (-AndroidUtilities.dpf2(0.57f)) * 2.0f;
        float fDpf3 = AndroidUtilities.dpf2(1.55f) * 2.0f;
        float fDp = AndroidUtilities.dp(5.0f);
        float fDp2 = AndroidUtilities.dp(5.0f);
        float f2 = -1.5707964f;
        int i = 0;
        while (i < 6) {
            double d = f2;
            float f3 = f2;
            float fCos = ((float) Math.cos(d)) * fDpf2;
            Bitmap bitmap = bitmapCreateBitmap;
            float fSin = ((float) Math.sin(d)) * fDpf2;
            float f4 = fCos * 0.66f;
            float f5 = 0.66f * fSin;
            canvas.drawLine(fDp, fDp2, fCos + fDp, fSin + fDp2, paint);
            float f6 = fDp;
            float f7 = fDp2;
            double d2 = (float) (d - 1.5707963267948966d);
            double d3 = f;
            double d4 = fDpf3;
            float f8 = f6 + f4;
            float f9 = f7 + f5;
            canvas.drawLine(f8, f9, f6 + ((float) ((Math.cos(d2) * d3) - (Math.sin(d2) * d4))), ((float) AndroidUtilities$$ExternalSyntheticOutline1.m(d2, d4, Math.sin(d2) * d3)) + f7, paint);
            canvas.drawLine(f8, f9, f6 + ((float) (((-Math.cos(d2)) * d3) - (Math.sin(d2) * d4))), ((float) AndroidUtilities$$ExternalSyntheticOutline1.m(d2, d4, (-Math.sin(d2)) * d3)) + f7, paint);
            f2 = f3 + 1.0471976f;
            i++;
            fDp2 = f7;
            bitmapCreateBitmap = bitmap;
            fDp = f6;
        }
        Bitmap bitmap2 = bitmapCreateBitmap;
        if (z) {
            Paint paint2 = new Paint(1);
            paint2.setStrokeWidth(AndroidUtilities.dp(1.5f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            canvas.drawPoint(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(5.0f), paint2);
        }
        return bitmap2;
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
                float f7 = j;
                particle.x = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(f5 * f6, f7, 500.0f, f4);
                particle.y = (((particle.vy * f6) * f7) / 500.0f) + particle.y;
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
        if (this.batchParticlesBuffer != null) {
            int iMin = Math.min(this.maxCount, this.particles.size());
            int iDp = AndroidUtilities.dp(10.0f);
            for (int i = 0; i < iMin; i++) {
                Particle particle2 = this.particles.get(i);
                float f = particle2.x;
                float f2 = particle2.y;
                int i2 = particle2.type;
                float f3 = iDp / 2.0f;
                if (i2 != 0) {
                    f3 *= particle2.scale;
                }
                float f4 = i2 == 0 ? iDp : 0.0f;
                this.batchParticlesBuffer.setParticleColor(i, ColorUtils.setAlphaComponent(this.color, (int) (particle2.alpha * 255.0f)));
                this.batchParticlesBuffer.setParticleVertexCords(i, f - f3, f2 - f3, f + f3, f2 + f3);
                float f5 = iDp;
                this.batchParticlesBuffer.setParticleTextureCords(i, f4, 0.0f, f4 + f5, f5);
            }
            BatchParticlesDrawHelper.draw(canvas, this.batchParticlesBuffer, iMin, this.batchParticlesPaint);
        } else {
            int size = this.particles.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.particles.get(i3).draw(canvas);
            }
        }
        int i4 = this.viewType == 0 ? 1 : 10;
        if (this.particles.size() < this.maxCount) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (this.particles.size() < this.maxCount && Utilities.random.nextFloat() > 0.7f) {
                    int i6 = AndroidUtilities.statusBarHeight;
                    float fNextFloat = Utilities.random.nextFloat() * view.getMeasuredWidth();
                    float fNextFloat2 = this.viewType == 0 ? (Utilities.random.nextFloat() * RichMessageLayout$$ExternalSyntheticOutline1.m(20.0f, view.getMeasuredHeight(), i6)) + i6 : Utilities.random.nextFloat() * view.getMeasuredHeight();
                    double dNextInt = ((double) (Utilities.random.nextInt(40) + 70)) * 0.017453292519943295d;
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
                    particle.vx = fCos;
                    particle.vy = fSin;
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
        long jCurrentTimeMillis = System.currentTimeMillis();
        updateParticles(Math.min(17L, jCurrentTimeMillis - this.lastAnimationTime));
        this.lastAnimationTime = jCurrentTimeMillis;
        view.invalidate();
    }

    public void setColorKey(int i) {
        this.colorKey = i;
        updateColors();
    }

    public void setForcedColor(int i) {
        this.forcedColor = i;
        updateColors();
    }

    public void updateColors() {
        int color = this.forcedColor;
        if (color == 0) {
            color = Theme.getColor(null, this.colorKey, false) & (-1644826);
        }
        if (this.color != color) {
            this.color = color;
            this.particlePaint.setColor(color);
            this.particleThinPaint.setColor(color);
        }
    }
}
