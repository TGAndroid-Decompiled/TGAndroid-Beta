package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;

public class FireworksOverlay extends View {
    public static final int[] colors;
    public static final int fallParticlesCount;
    public static final int[] heartColors;
    public static Drawable[] heartDrawable;
    public static final Paint[] paint;
    public static final int particlesCount;
    public static final int[] starsColors;
    public static Drawable[] starsDrawable;
    public int fallingDownCount;
    public boolean isFebruary14;
    public long lastUpdateTime;
    public final ArrayList particles;
    public final RectF rect;
    public float speedCoef;
    public boolean started;
    public boolean startedFall;
    public boolean withStars;

    public final class Particle {
        public byte colorType;
        public byte finishedStart;
        public float moveX;
        public float moveY;
        public short rotation;
        public byte side;
        public byte type;
        public byte typeSize;
        public float x;
        public byte xFinished;
        public float y;

        public Particle() {
        }
    }

    static {
        particlesCount = SharedConfig.getDevicePerformanceClass() == 0 ? 50 : 60;
        fallParticlesCount = SharedConfig.getDevicePerformanceClass() == 0 ? 20 : 30;
        colors = new int[]{-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        heartColors = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        starsColors = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        paint = new Paint[6];
        int i = 0;
        while (true) {
            Paint[] paintArr = paint;
            if (i >= paintArr.length) {
                return;
            }
            Paint paint2 = new Paint(1);
            paintArr[i] = paint2;
            paint2.setColor(colors[i]);
            i++;
        }
    }

    public FireworksOverlay(Context context) {
        super(context);
        this.rect = new RectF();
        this.speedCoef = 1.0f;
        this.particles = new ArrayList(particlesCount + fallParticlesCount);
    }

    private int getHeightForAnimation() {
        return getMeasuredHeight() == 0 ? ((View) getParent()).getHeight() : getMeasuredHeight();
    }

    private int getWidthForAnimation() {
        return getMeasuredWidth() == 0 ? ((View) getParent()).getWidth() : getMeasuredWidth();
    }

    public final Particle createParticle(boolean z) {
        Particle particle = new Particle();
        try {
            byte bNextInt = (byte) Utilities.random.nextInt(2);
            particle.type = bNextInt;
            if (this.isFebruary14 && bNextInt == 0) {
                particle.type = (byte) 2;
                particle.colorType = (byte) Utilities.random.nextInt(heartColors.length);
            } else if (this.withStars && Utilities.random.nextBoolean()) {
                particle.type = (byte) 2;
                particle.colorType = (byte) Utilities.random.nextInt(starsColors.length);
            } else {
                particle.colorType = (byte) Utilities.random.nextInt(colors.length);
            }
            particle.side = (byte) Utilities.random.nextInt(2);
            particle.finishedStart = (byte) (Utilities.random.nextInt(2) + 1);
            byte b = particle.type;
            if (b == 0 || b == 2) {
                particle.typeSize = (byte) ((Utilities.random.nextFloat() * 2.0f) + 4.0f);
            } else {
                particle.typeSize = (byte) ((Utilities.random.nextFloat() * 4.0f) + 4.0f);
            }
            if (z) {
                particle.y = (-Utilities.random.nextFloat()) * getHeightForAnimation() * 1.2f;
                particle.x = AndroidUtilities.dp(5.0f) + Utilities.random.nextInt(Math.max(1, getWidthForAnimation() - AndroidUtilities.dp(10.0f)));
                particle.xFinished = particle.finishedStart;
                return particle;
            }
            int iDp = AndroidUtilities.dp(Utilities.random.nextInt(10) + 4);
            int heightForAnimation = getHeightForAnimation() / 4;
            if (particle.side == 0) {
                particle.x = -iDp;
            } else {
                particle.x = getWidthForAnimation() + iDp;
            }
            particle.moveX = AndroidUtilities$$ExternalSyntheticOutline0.m(Utilities.random.nextFloat(), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.2f), particle.side == 0 ? 1 : -1);
            particle.moveY = -((Utilities.random.nextFloat() * AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f));
            particle.y = (heightForAnimation / 2) + Utilities.random.nextInt(Math.max(1, heightForAnimation * 2));
            return particle;
        } catch (Exception e) {
            FileLog.e(e);
            return particle;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        byte b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = (int) (jElapsedRealtime - this.lastUpdateTime);
        this.lastUpdateTime = jElapsedRealtime;
        if (i > 18) {
            i = 16;
        }
        ArrayList arrayList = this.particles;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Particle particle = (Particle) arrayList.get(i2);
            byte b2 = particle.type;
            Paint[] paintArr = paint;
            FireworksOverlay fireworksOverlay = FireworksOverlay.this;
            if (b2 == 0) {
                f = 2.0f;
                canvas.drawCircle(particle.x, particle.y, AndroidUtilities.dp(particle.typeSize), paintArr[particle.colorType]);
                f2 = 16.0f;
            } else {
                f = 2.0f;
                if (b2 == 1) {
                    f2 = 16.0f;
                    fireworksOverlay.rect.set(particle.x - AndroidUtilities.dp(particle.typeSize), particle.y - AndroidUtilities.dp(2.0f), particle.x + AndroidUtilities.dp(particle.typeSize), particle.y + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    float f3 = particle.rotation;
                    RectF rectF = fireworksOverlay.rect;
                    canvas.rotate(f3, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[particle.colorType]);
                    canvas.restore();
                } else {
                    f2 = 16.0f;
                    if (b2 == 2) {
                        Drawable[] drawableArr = starsDrawable;
                        Drawable drawable = drawableArr != null ? drawableArr[particle.colorType] : null;
                        Drawable[] drawableArr2 = heartDrawable;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[particle.colorType];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i3 = (int) particle.x;
                            int i4 = (int) particle.y;
                            drawable.setBounds(i3 - intrinsicWidth, i4 - intrinsicHeight, i3 + intrinsicWidth, i4 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(particle.rotation, particle.x, particle.y);
                            float f4 = particle.typeSize / 6.0f;
                            canvas.scale(f4, f4, particle.x, particle.y);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            float f5 = i / f2;
            float f6 = particle.x;
            float f7 = particle.moveX;
            particle.x = (f7 * f5) + f6;
            particle.y = (particle.moveY * f5) + particle.y;
            if (particle.xFinished != 0) {
                float fDp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (particle.xFinished == 1) {
                    float fM = SurfaceContainer$$ExternalSyntheticOutline0.m(fDp, f5, 0.05f, particle.moveX);
                    particle.moveX = fM;
                    if (fM >= fDp) {
                        particle.xFinished = (byte) 2;
                    }
                } else {
                    float f8 = particle.moveX - ((fDp * f5) * 0.05f);
                    particle.moveX = f8;
                    if (f8 <= (-fDp)) {
                        particle.xFinished = (byte) 1;
                    }
                }
            } else if (particle.side == 0) {
                if (f7 > 0.0f) {
                    float f9 = f7 - (0.05f * f5);
                    particle.moveX = f9;
                    if (f9 <= 0.0f) {
                        particle.moveX = 0.0f;
                        particle.xFinished = particle.finishedStart;
                    }
                }
            } else if (f7 < 0.0f) {
                float f10 = (0.05f * f5) + f7;
                particle.moveX = f10;
                if (f10 >= 0.0f) {
                    particle.moveX = 0.0f;
                    particle.xFinished = particle.finishedStart;
                }
            }
            float f11 = (-AndroidUtilities.dp(1.0f)) / f;
            float f12 = particle.moveY;
            boolean z = f12 < f11;
            if (f12 > f11) {
                particle.moveY = ((AndroidUtilities.dp(1.0f) / 3.0f) * f5 * fireworksOverlay.speedCoef) + f12;
            } else {
                particle.moveY = zzjd.m(AndroidUtilities.dp(1.0f), 3.0f, f5, f12);
            }
            if (!z || particle.moveY <= f11) {
                b = 1;
            } else {
                b = 1;
                fireworksOverlay.fallingDownCount++;
            }
            byte b3 = particle.type;
            if (b3 == b || b3 == 2) {
                short s = (short) ((f5 * 10.0f) + particle.rotation);
                particle.rotation = s;
                if (s > 360) {
                    particle.rotation = (short) (s - 360);
                }
            }
            if (particle.y >= fireworksOverlay.getHeightForAnimation()) {
                arrayList.remove(i2);
                i2--;
                size--;
            }
            i2++;
        }
        if (this.fallingDownCount >= particlesCount / 2 && this.speedCoef > 0.2f) {
            if (!this.startedFall) {
                this.startedFall = true;
                for (int i5 = 0; i5 < fallParticlesCount; i5++) {
                    arrayList.add(createParticle(true));
                }
            }
            float fM2 = TextureRenderer$$ExternalSyntheticOutline0.m(i, 16.0f, 0.15f, this.speedCoef);
            this.speedCoef = fM2;
            if (fM2 < 0.2f) {
                this.speedCoef = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.started = false;
        AndroidUtilities.runOnUIThread(new HintView$1$$ExternalSyntheticLambda0(this, 10));
        onStop();
    }

    public void onStop() {
    }

    public void start(boolean z) {
        this.withStars = z;
        setLayerType(2, null);
        boolean z2 = true;
        this.started = true;
        this.startedFall = false;
        this.fallingDownCount = 0;
        this.speedCoef = 1.0f;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = calendar.get(5);
        if (calendar.get(2) != 1 || (!BuildVars.DEBUG_PRIVATE_VERSION && i != 14)) {
            z2 = false;
        }
        this.isFebruary14 = z2;
        if (!z2) {
            if (z && starsDrawable == null) {
                starsDrawable = new Drawable[starsColors.length];
                int i2 = 0;
                while (true) {
                    Drawable[] drawableArr = starsDrawable;
                    if (i2 >= drawableArr.length) {
                        break;
                    }
                    drawableArr[i2] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                    starsDrawable[i2].setColorFilter(new PorterDuffColorFilter(starsColors[i2], PorterDuff.Mode.MULTIPLY));
                    i2++;
                }
            }
        } else if (heartDrawable == null) {
            heartDrawable = new Drawable[heartColors.length];
            int i3 = 0;
            while (true) {
                Drawable[] drawableArr2 = heartDrawable;
                if (i3 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i3] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.heart_confetti).mutate();
                heartDrawable[i3].setColorFilter(new PorterDuffColorFilter(heartColors[i3], PorterDuff.Mode.MULTIPLY));
                i3++;
            }
        }
        int i4 = particlesCount;
        int iClamp = Utilities.clamp(i4 - this.particles.size(), i4, i4 / 3);
        for (int i5 = 0; i5 < iClamp; i5++) {
            this.particles.add(createParticle(false));
        }
        invalidate();
    }
}
