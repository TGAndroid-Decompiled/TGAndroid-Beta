package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public class FireworksOverlay extends View {
    private static int[] colors;
    private static final int fallParticlesCount;
    private static int[] heartColors;
    private static Drawable[] heartDrawable;
    private static Paint[] paint;
    private static final int particlesCount;
    private int fallingDownCount;
    private boolean isFebruary14;
    private long lastUpdateTime;
    private boolean started;
    private boolean startedFall;
    private RectF rect = new RectF();
    private float speedCoef = 1.0f;
    private ArrayList<Particle> particles = new ArrayList<>(particlesCount + fallParticlesCount);

    static int access$408(FireworksOverlay fireworksOverlay) {
        int i = fireworksOverlay.fallingDownCount;
        fireworksOverlay.fallingDownCount = i + 1;
        return i;
    }

    static {
        particlesCount = SharedConfig.getDevicePerformanceClass() == 0 ? 50 : 60;
        fallParticlesCount = SharedConfig.getDevicePerformanceClass() == 0 ? 20 : 30;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        colors = iArr;
        heartColors = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        paint = new Paint[iArr.length];
        int i = 0;
        while (true) {
            Paint[] paintArr = paint;
            if (i < paintArr.length) {
                paintArr[i] = new Paint(1);
                paint[i].setColor(colors[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public class Particle {
        byte colorType;
        byte finishedStart;
        float moveX;
        float moveY;
        short rotation;
        byte side;
        byte type;
        byte typeSize;
        float f1044x;
        byte xFinished;
        float f1045y;

        private Particle() {
        }

        public void draw(Canvas canvas) {
            byte b = this.type;
            if (b == 0) {
                canvas.drawCircle(this.f1044x, this.f1045y, AndroidUtilities.m34dp(this.typeSize), FireworksOverlay.paint[this.colorType]);
            } else if (b == 1) {
                FireworksOverlay.this.rect.set(this.f1044x - AndroidUtilities.m34dp(this.typeSize), this.f1045y - AndroidUtilities.m34dp(2.0f), this.f1044x + AndroidUtilities.m34dp(this.typeSize), this.f1045y + AndroidUtilities.m34dp(2.0f));
                canvas.save();
                canvas.rotate(this.rotation, FireworksOverlay.this.rect.centerX(), FireworksOverlay.this.rect.centerY());
                canvas.drawRoundRect(FireworksOverlay.this.rect, AndroidUtilities.m34dp(2.0f), AndroidUtilities.m34dp(2.0f), FireworksOverlay.paint[this.colorType]);
                canvas.restore();
            } else if (b == 2) {
                Drawable drawable = FireworksOverlay.heartDrawable[this.colorType];
                int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                float f = this.f1044x;
                float f2 = this.f1045y;
                drawable.setBounds(((int) f) - intrinsicWidth, ((int) f2) - intrinsicHeight, ((int) f) + intrinsicWidth, ((int) f2) + intrinsicHeight);
                canvas.save();
                canvas.rotate(this.rotation, this.f1044x, this.f1045y);
                byte b2 = this.typeSize;
                canvas.scale(b2 / 6.0f, b2 / 6.0f, this.f1044x, this.f1045y);
                drawable.draw(canvas);
                canvas.restore();
            }
        }

        public boolean update(int i) {
            float f = i / 16.0f;
            float f2 = this.f1044x;
            float f3 = this.moveX;
            this.f1044x = f2 + (f3 * f);
            this.f1045y += this.moveY * f;
            if (this.xFinished != 0) {
                float dp = AndroidUtilities.m34dp(1.0f) * 0.5f;
                if (this.xFinished == 1) {
                    float f4 = this.moveX + (dp * f * 0.05f);
                    this.moveX = f4;
                    if (f4 >= dp) {
                        this.xFinished = (byte) 2;
                    }
                } else {
                    float f5 = this.moveX - ((dp * f) * 0.05f);
                    this.moveX = f5;
                    if (f5 <= (-dp)) {
                        this.xFinished = (byte) 1;
                    }
                }
            } else if (this.side == 0) {
                if (f3 > 0.0f) {
                    float f6 = f3 - (0.05f * f);
                    this.moveX = f6;
                    if (f6 <= 0.0f) {
                        this.moveX = 0.0f;
                        this.xFinished = this.finishedStart;
                    }
                }
            } else if (f3 < 0.0f) {
                float f7 = f3 + (0.05f * f);
                this.moveX = f7;
                if (f7 >= 0.0f) {
                    this.moveX = 0.0f;
                    this.xFinished = this.finishedStart;
                }
            }
            float f8 = (-AndroidUtilities.m34dp(1.0f)) / 2.0f;
            float f9 = this.moveY;
            boolean z = f9 < f8;
            if (f9 > f8) {
                this.moveY = f9 + ((AndroidUtilities.m34dp(1.0f) / 3.0f) * f * FireworksOverlay.this.speedCoef);
            } else {
                this.moveY = f9 + ((AndroidUtilities.m34dp(1.0f) / 3.0f) * f);
            }
            if (z && this.moveY > f8) {
                FireworksOverlay.access$408(FireworksOverlay.this);
            }
            byte b = this.type;
            if (b == 1 || b == 2) {
                short s = (short) (this.rotation + (f * 10.0f));
                this.rotation = s;
                if (s > 360) {
                    this.rotation = (short) (s - 360);
                }
            }
            return this.f1045y >= ((float) FireworksOverlay.this.getMeasuredHeight());
        }
    }

    public FireworksOverlay(Context context) {
        super(context);
    }

    private void loadHeartDrawables() {
        if (heartDrawable == null) {
            heartDrawable = new Drawable[heartColors.length];
            int i = 0;
            while (true) {
                Drawable[] drawableArr = heartDrawable;
                if (i < drawableArr.length) {
                    drawableArr[i] = ApplicationLoader.applicationContext.getResources().getDrawable(C0952R.C0953drawable.heart_confetti).mutate();
                    heartDrawable[i].setColorFilter(new PorterDuffColorFilter(heartColors[i], PorterDuff.Mode.MULTIPLY));
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private Particle createParticle(boolean z) {
        Particle particle = new Particle();
        byte nextInt = (byte) Utilities.random.nextInt(2);
        particle.type = nextInt;
        if (!this.isFebruary14 || nextInt != 0) {
            particle.colorType = (byte) Utilities.random.nextInt(colors.length);
        } else {
            particle.type = (byte) 2;
            particle.colorType = (byte) Utilities.random.nextInt(heartColors.length);
        }
        particle.side = (byte) Utilities.random.nextInt(2);
        int i = 1;
        particle.finishedStart = (byte) (Utilities.random.nextInt(2) + 1);
        byte b = particle.type;
        if (b == 0 || b == 2) {
            particle.typeSize = (byte) ((Utilities.random.nextFloat() * 2.0f) + 4.0f);
        } else {
            particle.typeSize = (byte) ((Utilities.random.nextFloat() * 4.0f) + 4.0f);
        }
        if (z) {
            particle.f1045y = (-Utilities.random.nextFloat()) * getMeasuredHeight() * 1.2f;
            particle.f1044x = AndroidUtilities.m34dp(5.0f) + Utilities.random.nextInt(getMeasuredWidth() - AndroidUtilities.m34dp(10.0f));
            particle.xFinished = particle.finishedStart;
        } else {
            int dp = AndroidUtilities.m34dp(Utilities.random.nextInt(10) + 4);
            int measuredHeight = getMeasuredHeight() / 4;
            if (particle.side == 0) {
                particle.f1044x = -dp;
            } else {
                particle.f1044x = getMeasuredWidth() + dp;
            }
            if (particle.side != 0) {
                i = -1;
            }
            particle.moveX = i * (AndroidUtilities.m34dp(1.2f) + (Utilities.random.nextFloat() * AndroidUtilities.m34dp(4.0f)));
            particle.moveY = -(AndroidUtilities.m34dp(4.0f) + (Utilities.random.nextFloat() * AndroidUtilities.m34dp(4.0f)));
            particle.f1045y = (measuredHeight / 2) + Utilities.random.nextInt(measuredHeight * 2);
        }
        return particle;
    }

    public boolean isStarted() {
        return this.started;
    }

    public void start() {
        this.particles.clear();
        if (Build.VERSION.SDK_INT >= 18) {
            setLayerType(2, null);
        }
        boolean z = true;
        this.started = true;
        this.startedFall = false;
        this.fallingDownCount = 0;
        this.speedCoef = 1.0f;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = calendar.get(5);
        if (calendar.get(2) != 1 || (!BuildVars.DEBUG_PRIVATE_VERSION && i != 14)) {
            z = false;
        }
        this.isFebruary14 = z;
        if (z) {
            loadHeartDrawables();
        }
        for (int i2 = 0; i2 < particlesCount; i2++) {
            this.particles.add(createParticle(false));
        }
        invalidate();
    }

    private void startFall() {
        if (!this.startedFall) {
            this.startedFall = true;
            for (int i = 0; i < fallParticlesCount; i++) {
                this.particles.add(createParticle(true));
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.lastUpdateTime);
        this.lastUpdateTime = elapsedRealtime;
        if (i > 18) {
            i = 16;
        }
        int size = this.particles.size();
        int i2 = 0;
        while (i2 < size) {
            Particle particle = this.particles.get(i2);
            particle.draw(canvas);
            if (particle.update(i)) {
                this.particles.remove(i2);
                i2--;
                size--;
            }
            i2++;
        }
        if (this.fallingDownCount >= particlesCount / 2 && this.speedCoef > 0.2f) {
            startFall();
            float f = this.speedCoef - ((i / 16.0f) * 0.15f);
            this.speedCoef = f;
            if (f < 0.2f) {
                this.speedCoef = 0.2f;
            }
        }
        if (!this.particles.isEmpty()) {
            invalidate();
            return;
        }
        this.started = false;
        if (Build.VERSION.SDK_INT >= 18) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    FireworksOverlay.this.lambda$onDraw$0();
                }
            });
        }
    }

    public void lambda$onDraw$0() {
        if (!this.started) {
            setLayerType(0, null);
        }
    }
}
