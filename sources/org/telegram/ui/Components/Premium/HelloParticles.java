package org.telegram.ui.Components.Premium;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.FlickerLoadingView$$ExternalSyntheticOutline0;

public abstract class HelloParticles {
    public static final String[] hellos = {"Hello", "Привіт", "Привет", "Bonjour", "Hola", "Ciao", "Olá", "여보세요", "你好", "Salve", "Sveiki", "Halo", "გამარჯობა", "Hallå", "Salam", "Tere", "Dia dhuit", "こんにちは", "Сайн уу", "Bongu", "Ahoj", "γεια", "Zdravo", "नमस्ते", "Habari", "Hallo", "ជំរាបសួរ", "مرحبًا", "ನಮಸ್ಕಾರ", "Салам", "Silav li wir", "سڵاو", "Kif inti", "Talofa", "Thobela", "हॅलो", "ሰላም", "Здраво", "ഹലോ", "ہیلو", "ꯍꯦꯜꯂꯣ", "Alô", "வணக்கம்", "Mhoro", "Moni", "Alo", "สวัสดี", "Salom", "Բարեւ"};

    public final class Drawable {
        public final float bitmapScale;
        public final HashMap bitmaps;
        public final int count;
        public final float dt;
        public final Paint paint;
        public final ArrayList particles;
        public final RectF rect;
        public final RectF screenRect;
        public final TextPaint textPaint;

        public final class Particle {
            public int alpha;
            public Bitmap bitmap;
            public long duration;
            public int h;
            public float inProgress;
            public int l;
            public float scale;
            public boolean set;
            public StaticLayout staticLayout;
            public int w;
            public float x;
            public float y;

            public Particle() {
            }

            public final void genPosition(int i, boolean z) {
                RectF rectF;
                this.duration = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
                this.scale = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
                String str = HelloParticles.hellos[FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, 49)];
                if (str.length() > 7) {
                    this.scale *= 0.6f;
                } else if (str.length() > 5) {
                    this.scale *= 0.75f;
                }
                Drawable drawable = Drawable.this;
                StaticLayout staticLayout = new StaticLayout(str, drawable.textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.staticLayout = staticLayout;
                if (staticLayout.getLineCount() <= 0) {
                    this.h = 0;
                    this.w = 0;
                    this.l = 0;
                } else {
                    this.l = (int) this.staticLayout.getLineLeft(0);
                    this.w = (int) this.staticLayout.getLineWidth(0);
                    this.h = this.staticLayout.getHeight();
                }
                HashMap map = drawable.bitmaps;
                Bitmap bitmap = (Bitmap) map.get(str);
                this.bitmap = bitmap;
                if (bitmap == null) {
                    this.bitmap = Bitmap.createBitmap(Math.max(1, this.w - Math.max(0, this.l)), Math.max(1, this.h), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(this.bitmap);
                    canvas.translate(-this.l, 0.0f);
                    this.staticLayout.draw(canvas);
                    map.put(str, this.bitmap);
                }
                RectF rectF2 = drawable.rect;
                float f = rectF2.left;
                float f2 = this.w / 4.0f;
                float fCenterX = f + f2;
                float fCenterX2 = rectF2.right - f2;
                if (i % 2 == 0) {
                    fCenterX2 = rectF2.centerX() - (this.w / 2.0f);
                } else {
                    fCenterX = rectF2.centerX() + (this.w / 2.0f);
                }
                float f3 = fCenterX2 - fCenterX;
                float fAbs = Math.abs(Utilities.fastRandom.nextInt() % f3) + fCenterX;
                float fAbs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF2.height()) + rectF2.top;
                int i2 = 0;
                float f4 = 0.0f;
                while (i2 < 10) {
                    float fAbs3 = Math.abs(Utilities.fastRandom.nextInt() % f3) + fCenterX;
                    float fAbs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF2.height()) + rectF2.top;
                    float f5 = 2.1474836E9f;
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList = drawable.particles;
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        Particle particle = (Particle) arrayList.get(i3);
                        if (particle.set) {
                            rectF = rectF2;
                            float fMin = Math.min(Math.abs(((((this.scale / drawable.bitmapScale) * particle.w) * 1.1f) + particle.x) - fAbs3), Math.abs(particle.x - fAbs3));
                            float f6 = particle.y - fAbs4;
                            float f7 = (f6 * f6) + (fMin * fMin);
                            if (f7 < f5) {
                                f5 = f7;
                            }
                        } else {
                            rectF = rectF2;
                        }
                        i3++;
                        rectF2 = rectF;
                    }
                    RectF rectF3 = rectF2;
                    if (f5 > f4) {
                        fAbs = fAbs3;
                        f4 = f5;
                        fAbs2 = fAbs4;
                    }
                    i2++;
                    rectF2 = rectF3;
                }
                RectF rectF4 = rectF2;
                this.x = fAbs;
                this.y = fAbs2;
                double dAtan2 = Math.atan2(fAbs - rectF4.centerX(), this.y - rectF4.centerY());
                Math.sin(dAtan2);
                Math.cos(dAtan2);
                this.alpha = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
                this.inProgress = z ? Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f) : 0.0f;
                this.set = true;
            }
        }

        public Drawable() {
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            this.bitmapScale = 1.0f;
            this.bitmaps = new HashMap();
            this.rect = new RectF();
            this.screenRect = new RectF();
            Paint paint = new Paint();
            this.paint = paint;
            this.particles = new ArrayList();
            this.dt = 1000.0f / AndroidUtilities.screenRefreshRate;
            this.count = 25;
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(-1);
            int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
            if (devicePerformanceClass == 0) {
                this.bitmapScale = 0.25f;
            } else if (devicePerformanceClass != 1) {
                this.bitmapScale = 0.75f;
            } else {
                this.bitmapScale = 0.5f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(this.bitmapScale * 24.0f));
            paint.setColor(-1);
        }
    }
}
