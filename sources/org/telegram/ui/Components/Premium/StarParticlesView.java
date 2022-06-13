package org.telegram.ui.Components.Premium;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.GLIconSettingsView;

public class StarParticlesView extends View {
    public Drawable drawable;
    int size;

    public StarParticlesView(Context context) {
        super(context);
        Drawable drawable = new Drawable(20);
        this.drawable = drawable;
        drawable.init();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        if (this.size != measuredWidth) {
            this.size = measuredWidth;
            this.drawable.rect.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.drawable.rect.offset((getMeasuredWidth() - this.drawable.rect.width()) / 2.0f, (getMeasuredHeight() - this.drawable.rect.height()) / 2.0f);
            this.drawable.resetPositions();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.drawable.onDraw(canvas);
        if (!this.drawable.paused) {
            invalidate();
        }
    }

    public void flingParticles(float f) {
        float f2 = f < 60.0f ? 5.0f : f < 180.0f ? 9.0f : 15.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator.AnimatorUpdateListener starParticlesView$$ExternalSyntheticLambda0 = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StarParticlesView.this.lambda$flingParticles$0(valueAnimator);
            }
        };
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f2);
        ofFloat.addUpdateListener(starParticlesView$$ExternalSyntheticLambda0);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, 1.0f);
        ofFloat2.addUpdateListener(starParticlesView$$ExternalSyntheticLambda0);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public void lambda$flingParticles$0(ValueAnimator valueAnimator) {
        this.drawable.speedScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static class Drawable {
        float a;
        float a1;
        float a2;
        public final int count;
        private boolean distributionAlgorithm;
        private int lastColor;
        public boolean paused;
        long pausedTime;
        public boolean useGradient;
        public boolean useRotate;
        public RectF rect = new RectF();
        public RectF rect2 = new RectF();
        public RectF excludeRect = new RectF();
        private final Bitmap[] stars = new Bitmap[3];
        private Paint paint = new Paint();
        ArrayList<Particle> particles = new ArrayList<>();
        public float speedScale = 1.0f;
        public int size1 = 14;
        public int size2 = 12;
        public int size3 = 10;
        public float k1 = 0.85f;
        public float k2 = 0.85f;
        public float k3 = 0.9f;
        public long minLifeTime = 2000;
        private final float dt = 1000.0f / AndroidUtilities.screenRefreshRate;
        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();
        Matrix matrix3 = new Matrix();
        float[] points = new float[2];
        public boolean checkBounds = false;
        public boolean checkTime = true;
        public boolean isCircle = true;
        public boolean useBlur = false;
        public boolean roundEffect = true;
        public boolean useProfileBadge = false;

        public Drawable(int i) {
            boolean z = false;
            this.count = i;
            this.distributionAlgorithm = i < 50 ? true : z;
        }

        public void init() {
            generateBitmaps();
            if (this.particles.isEmpty()) {
                for (int i = 0; i < this.count; i++) {
                    this.particles.add(new Particle());
                }
            }
        }

        public void updateColors() {
            int color = Theme.getColor("premiumStartSmallStarsColor");
            if (this.lastColor != color) {
                this.lastColor = color;
                generateBitmaps();
            }
        }

        private void generateBitmaps() {
            int dp;
            for (int i = 0; i < 3; i++) {
                float f = this.k1;
                if (i == 0) {
                    dp = AndroidUtilities.dp(this.size1);
                } else if (i == 1) {
                    f = this.k2;
                    dp = AndroidUtilities.dp(this.size2);
                } else {
                    f = this.k3;
                    dp = AndroidUtilities.dp(this.size3);
                }
                int i2 = dp;
                Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                this.stars[i] = createBitmap;
                Canvas canvas = new Canvas(createBitmap);
                if (!this.useProfileBadge || !(i == 1 || i == 2)) {
                    Path path = new Path();
                    float f2 = i2 >> 1;
                    int i3 = (int) (f * f2);
                    path.moveTo(0.0f, f2);
                    float f3 = i3;
                    path.lineTo(f3, f3);
                    path.lineTo(f2, 0.0f);
                    float f4 = i2 - i3;
                    path.lineTo(f4, f3);
                    float f5 = i2;
                    path.lineTo(f5, f2);
                    path.lineTo(f4, f4);
                    path.lineTo(f2, f5);
                    path.lineTo(f3, f4);
                    path.lineTo(0.0f, f2);
                    path.close();
                    Paint paint = new Paint();
                    if (this.useGradient) {
                        if (i2 >= AndroidUtilities.dp(10.0f)) {
                            PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, i2, i2, i2 * (-2), 0.0f);
                        } else {
                            PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, i2, i2, i2 * (-4), 0.0f);
                        }
                        Paint mainGradientPaint = PremiumGradient.getInstance().getMainGradientPaint();
                        if (this.roundEffect) {
                            mainGradientPaint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                        }
                        mainGradientPaint.setAlpha(120);
                        canvas.drawPath(path, mainGradientPaint);
                        mainGradientPaint.setPathEffect(null);
                        mainGradientPaint.setAlpha(255);
                    } else {
                        paint.setColor(Theme.getColor("premiumStartSmallStarsColor"));
                        if (this.roundEffect) {
                            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                        }
                        canvas.drawPath(path, paint);
                    }
                    if (this.useBlur) {
                        Utilities.stackBlurBitmap(createBitmap, 2);
                    }
                } else {
                    android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_premium_liststar);
                    drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("premiumStartSmallStarsColor"), PorterDuff.Mode.MULTIPLY));
                    drawable.setBounds(0, 0, i2, i2);
                    drawable.draw(canvas);
                }
            }
        }

        public void resetPositions() {
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < this.particles.size(); i++) {
                this.particles.get(i).genPosition(currentTimeMillis);
            }
        }

        public void onDraw(Canvas canvas) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.useRotate) {
                this.matrix.reset();
                float f = this.a + 0.144f;
                this.a = f;
                this.a1 += 0.1152f;
                this.a2 += 0.096f;
                this.matrix.setRotate(f, this.rect.centerX(), this.rect.centerY());
                this.matrix2.setRotate(this.a1, this.rect.centerX(), this.rect.centerY());
                this.matrix3.setRotate(this.a2, this.rect.centerX(), this.rect.centerY());
            }
            for (int i = 0; i < this.particles.size(); i++) {
                Particle particle = this.particles.get(i);
                if (this.paused) {
                    particle.draw(canvas, this.pausedTime);
                } else {
                    particle.draw(canvas, currentTimeMillis);
                }
                if (this.checkTime && currentTimeMillis > particle.lifeTime) {
                    particle.genPosition(currentTimeMillis);
                }
                if (this.checkBounds && !this.rect2.contains(particle.drawingX, particle.drawingY)) {
                    particle.genPosition(currentTimeMillis);
                }
            }
        }

        public class Particle {
            private int alpha;
            private float drawingX;
            private float drawingY;
            float inProgress;
            private long lifeTime;
            private int starIndex;
            private float vecX;
            private float vecY;
            private float x;
            private float y;

            private Particle() {
            }

            static long access$114(Particle particle, long j) {
                long j2 = particle.lifeTime + j;
                particle.lifeTime = j2;
                return j2;
            }

            public void draw(Canvas canvas, long j) {
                float f;
                Drawable drawable = Drawable.this;
                boolean z = false;
                if (drawable.useRotate) {
                    float[] fArr = drawable.points;
                    fArr[0] = this.x;
                    fArr[1] = this.y;
                    int i = this.starIndex;
                    if (i == 0) {
                        drawable.matrix.mapPoints(fArr);
                    } else if (i == 1) {
                        drawable.matrix2.mapPoints(fArr);
                    } else {
                        drawable.matrix3.mapPoints(fArr);
                    }
                    float[] fArr2 = Drawable.this.points;
                    this.drawingX = fArr2[0];
                    this.drawingY = fArr2[1];
                } else {
                    this.drawingX = this.x;
                    this.drawingY = this.y;
                }
                if (!Drawable.this.excludeRect.isEmpty() && Drawable.this.excludeRect.contains(this.drawingX, this.drawingY)) {
                    z = true;
                }
                if (!z) {
                    canvas.save();
                    canvas.translate(this.drawingX, this.drawingY);
                    float f2 = this.inProgress;
                    if (f2 < 1.0f || GLIconSettingsView.smallStarsSize != 1.0f) {
                        float interpolation = AndroidUtilities.overshootInterpolator.getInterpolation(f2) * GLIconSettingsView.smallStarsSize;
                        canvas.scale(interpolation, interpolation, Drawable.this.stars[this.starIndex].getWidth() / 2.0f, Drawable.this.stars[this.starIndex].getHeight() / 2.0f);
                    }
                    if (Drawable.this.checkTime) {
                        long j2 = this.lifeTime;
                        if (j2 - j < 200) {
                            f = Utilities.clamp(1.0f - (((float) (j2 - j)) / 150.0f), 1.0f, 0.0f);
                            Drawable.this.paint.setAlpha((int) (this.alpha * (1.0f - f)));
                            canvas.drawBitmap(Drawable.this.stars[this.starIndex], 0.0f, 0.0f, Drawable.this.paint);
                            canvas.restore();
                        }
                    }
                    f = 0.0f;
                    Drawable.this.paint.setAlpha((int) (this.alpha * (1.0f - f)));
                    canvas.drawBitmap(Drawable.this.stars[this.starIndex], 0.0f, 0.0f, Drawable.this.paint);
                    canvas.restore();
                }
                if (!Drawable.this.paused) {
                    float dp = AndroidUtilities.dp(4.0f) * (Drawable.this.dt / 660.0f);
                    Drawable drawable2 = Drawable.this;
                    float f3 = dp * drawable2.speedScale;
                    this.x += this.vecX * f3;
                    this.y += this.vecY * f3;
                    float f4 = this.inProgress;
                    if (f4 != 1.0f) {
                        float f5 = f4 + (drawable2.dt / 200.0f);
                        this.inProgress = f5;
                        if (f5 > 1.0f) {
                            this.inProgress = 1.0f;
                        }
                    }
                }
            }

            public void genPosition(long j) {
                this.starIndex = Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.stars.length);
                this.lifeTime = j + Drawable.this.minLifeTime + Utilities.fastRandom.nextInt(1000);
                if (Drawable.this.distributionAlgorithm) {
                    float f = 0.0f;
                    float f2 = 0.0f;
                    float f3 = 0.0f;
                    for (int i = 0; i < 10; i++) {
                        float abs = Drawable.this.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                        float abs2 = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                        float f4 = 2.14748365E9f;
                        for (int i2 = 0; i2 < Drawable.this.particles.size(); i2++) {
                            float f5 = Drawable.this.particles.get(i2).x - abs;
                            float f6 = Drawable.this.particles.get(i2).y - abs2;
                            float f7 = (f5 * f5) + (f6 * f6);
                            if (f7 < f4) {
                                f4 = f7;
                            }
                        }
                        if (f4 > f3) {
                            f = abs;
                            f2 = abs2;
                            f3 = f4;
                        }
                    }
                    this.x = f;
                    this.y = f2;
                } else {
                    Drawable drawable = Drawable.this;
                    if (drawable.isCircle) {
                        float abs3 = (Math.abs(Utilities.fastRandom.nextInt() % 1000) / 1000.0f) * Drawable.this.rect.width();
                        float centerX = Drawable.this.rect.centerX();
                        double d = abs3;
                        double sin = Math.sin(Math.toRadians(r4));
                        Double.isNaN(d);
                        this.x = centerX + ((float) (sin * d));
                        float centerY = Drawable.this.rect.centerY();
                        double cos = Math.cos(Math.toRadians(r4));
                        Double.isNaN(d);
                        this.y = centerY + ((float) (d * cos));
                    } else {
                        this.x = drawable.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                        this.y = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                    }
                }
                double atan2 = Math.atan2(this.x - Drawable.this.rect.centerX(), this.y - Drawable.this.rect.centerY());
                this.vecX = (float) Math.sin(atan2);
                this.vecY = (float) Math.cos(atan2);
                this.alpha = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
                this.inProgress = 0.0f;
            }
        }
    }

    public void setPaused(boolean z) {
        Drawable drawable = this.drawable;
        if (z != drawable.paused) {
            drawable.paused = z;
            if (z) {
                drawable.pausedTime = System.currentTimeMillis();
                return;
            }
            for (int i = 0; i < this.drawable.particles.size(); i++) {
                Drawable.Particle.access$114(this.drawable.particles.get(i), System.currentTimeMillis() - this.drawable.pausedTime);
            }
            invalidate();
        }
    }
}