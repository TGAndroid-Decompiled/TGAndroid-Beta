package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import androidx.core.app.NotificationCompatBuilder;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline1;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;

public final class SnowflakesEffect {
    public final NotificationCompatBuilder batchParticlesBuffer;
    public final Paint batchParticlesPaint;
    public final Paint bitmapPaint = new Paint();
    public int color;
    public int forcedColor;
    public final ArrayList freeParticles;
    public long lastAnimationTime;
    public final int maxCount;
    public Bitmap particleBitmap;
    public final Paint particlePaint;
    public final Paint particleThinPaint;
    public final ArrayList particles;
    public final int viewType;

    public final class Particle {
        public float alpha;
        public float currentTime;
        public float lifeTime;
        public float scale;
        public int type;
        public float velocity;
        public float vx;
        public float vy;
        public float x;
        public float y;

        public Particle() {
        }
    }

    public SnowflakesEffect(int i) {
        int i2 = Theme.key_actionBarDefaultTitle;
        this.particles = new ArrayList();
        this.freeParticles = new ArrayList();
        this.viewType = i;
        int i3 = i == 0 ? 100 : 300;
        this.maxCount = i3;
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
        if (Build.VERSION.SDK_INT >= 29) {
            this.batchParticlesBuffer = new NotificationCompatBuilder(i3);
            this.batchParticlesPaint = BatchParticlesDrawHelper.createBatchParticlesPaint(createParticlesBitmap(true));
        } else {
            this.batchParticlesBuffer = null;
            this.batchParticlesPaint = null;
        }
        int color = this.forcedColor;
        color = color == 0 ? Theme.getColor(null, i2, false) & (-1644826) : color;
        if (this.color != color) {
            this.color = color;
            paint.setColor(color);
            paint2.setColor(color);
        }
        for (int i4 = 0; i4 < 20; i4++) {
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

    public final void onDraw(Canvas canvas, View view) {
        int i;
        int i2;
        Particle particle;
        float[] fArr;
        float[] fArr2;
        int[] iArr;
        if (view == null || canvas == null || !LiteMode.isEnabled(32)) {
            return;
        }
        ArrayList arrayList = this.particles;
        int i3 = this.maxCount;
        NotificationCompatBuilder notificationCompatBuilder = this.batchParticlesBuffer;
        if (notificationCompatBuilder != null) {
            int iMin = Math.min(i3, arrayList.size());
            int iDp = AndroidUtilities.dp(10.0f);
            int i4 = 0;
            while (true) {
                fArr = (float[]) notificationCompatBuilder.mBuilder;
                fArr2 = (float[]) notificationCompatBuilder.mContext;
                iArr = (int[]) notificationCompatBuilder.mExtras;
                if (i4 >= iMin) {
                    break;
                }
                Particle particle2 = (Particle) arrayList.get(i4);
                float f = particle2.x;
                float f2 = particle2.y;
                int i5 = particle2.type;
                float f3 = iDp / 2.0f;
                if (i5 != 0) {
                    f3 *= particle2.scale;
                }
                float f4 = i5 == 0 ? iDp : 0.0f;
                int alphaComponent = ColorUtils.setAlphaComponent(this.color, (int) (particle2.alpha * 255.0f));
                int i6 = i4 * 4;
                iArr[i6] = alphaComponent;
                iArr[i6 + 1] = alphaComponent;
                iArr[i6 + 2] = alphaComponent;
                iArr[i6 + 3] = alphaComponent;
                NotificationCompatBuilder.bufferVertexSet(fArr2, i4, f - f3, f2 - f3, f + f3, f2 + f3);
                float f5 = iDp;
                NotificationCompatBuilder.bufferVertexSet(fArr, i4, f4, 0.0f, f4 + f5, f5);
                i4++;
            }
            i = i3;
            canvas.drawVertices(Canvas.VertexMode.TRIANGLES, iMin * 8, fArr2, 0, fArr, 0, iArr, 0, (short[]) notificationCompatBuilder.mBuilderCompat, 0, iMin * 6, this.batchParticlesPaint);
        } else {
            i = i3;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Particle particle3 = (Particle) arrayList.get(i7);
                int i8 = particle3.type;
                SnowflakesEffect snowflakesEffect = SnowflakesEffect.this;
                if (i8 != 0) {
                    if (snowflakesEffect.particleBitmap == null) {
                        snowflakesEffect.particleBitmap = createParticlesBitmap(false);
                    }
                    Paint paint = snowflakesEffect.bitmapPaint;
                    paint.setAlpha((int) (particle3.alpha * 255.0f));
                    canvas.save();
                    float f6 = particle3.scale;
                    canvas.scale(f6, f6, particle3.x, particle3.y);
                    canvas.drawBitmap(snowflakesEffect.particleBitmap, particle3.x, particle3.y, paint);
                    canvas.restore();
                } else {
                    snowflakesEffect.particlePaint.setAlpha((int) (particle3.alpha * 255.0f));
                    canvas.drawPoint(particle3.x, particle3.y, snowflakesEffect.particlePaint);
                }
            }
        }
        int i9 = this.viewType;
        int i10 = i9 == 0 ? 1 : 10;
        int size2 = arrayList.size();
        ArrayList arrayList2 = this.freeParticles;
        int i11 = 40;
        if (size2 < i) {
            int i12 = 0;
            while (i12 < i10) {
                if (arrayList.size() >= i || Utilities.random.nextFloat() <= 0.7f) {
                    i2 = i9;
                } else {
                    int i13 = AndroidUtilities.statusBarHeight;
                    float fNextFloat = Utilities.random.nextFloat() * view.getMeasuredWidth();
                    float fNextFloat2 = i9 == 0 ? (Utilities.random.nextFloat() * RichMessageLayout$$ExternalSyntheticOutline2.m(view.getMeasuredHeight(), 20.0f, i13)) + i13 : Utilities.random.nextFloat() * view.getMeasuredHeight();
                    double dNextInt = ((double) (Utilities.random.nextInt(40) + 70)) * 0.017453292519943295d;
                    i2 = i9;
                    float fCos = (float) Math.cos(dNextInt);
                    float fSin = (float) Math.sin(dNextInt);
                    if (arrayList2.isEmpty()) {
                        particle = new Particle();
                    } else {
                        particle = (Particle) arrayList2.get(0);
                        arrayList2.remove(0);
                    }
                    particle.x = fNextFloat;
                    particle.y = fNextFloat2;
                    particle.vx = fCos;
                    particle.vy = fSin;
                    particle.alpha = 0.0f;
                    particle.currentTime = 0.0f;
                    particle.scale = Utilities.random.nextFloat() * 1.2f;
                    particle.type = Utilities.random.nextInt(2);
                    if (i2 == 0) {
                        particle.lifeTime = Utilities.random.nextInt(100) + 2000;
                    } else {
                        particle.lifeTime = Utilities.random.nextInt(2000) + 3000;
                    }
                    particle.velocity = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                    arrayList.add(particle);
                }
                i12++;
                i9 = i2;
            }
        }
        int i14 = i9;
        int i15 = 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMin = Math.min(17L, jCurrentTimeMillis - this.lastAnimationTime);
        int size3 = arrayList.size();
        while (i15 < size3) {
            Particle particle4 = (Particle) arrayList.get(i15);
            float f7 = particle4.currentTime;
            float f8 = particle4.lifeTime;
            if (f7 >= f8) {
                if (arrayList2.size() < i11) {
                    arrayList2.add(particle4);
                }
                arrayList.remove(i15);
                i15--;
                size3--;
            } else {
                if (i14 == 0) {
                    if (f7 < 200.0f) {
                        particle4.alpha = AndroidUtilities.accelerateInterpolator.getInterpolation(f7 / 200.0f);
                    } else {
                        particle4.alpha = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f7 - 200.0f) / (f8 - 200.0f));
                    }
                } else if (f7 < 200.0f) {
                    particle4.alpha = AndroidUtilities.accelerateInterpolator.getInterpolation(f7 / 200.0f);
                } else {
                    float f9 = f8 - f7;
                    if (f9 < 2000.0f) {
                        particle4.alpha = AndroidUtilities.decelerateInterpolator.getInterpolation(f9 / 2000.0f);
                    }
                }
                float f10 = particle4.x;
                float f11 = particle4.vx;
                float f12 = particle4.velocity;
                float f13 = jMin;
                particle4.x = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(f11 * f12, f13, 500.0f, f10);
                particle4.y = (((particle4.vy * f12) * f13) / 500.0f) + particle4.y;
                particle4.currentTime += f13;
            }
            i15++;
            i11 = 40;
        }
        this.lastAnimationTime = jCurrentTimeMillis;
        view.invalidate();
    }
}
