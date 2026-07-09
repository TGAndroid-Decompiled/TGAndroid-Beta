package org.telegram.ui.Components.Premium;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;

public class StarParticlesView extends View {
    private LinearGradient clipGradient;
    private Matrix clipGradientMatrix;
    private Paint clipGradientPaint;
    public boolean doNotFling;
    public Drawable drawable;
    private boolean isLiteModeParticlesAllowed;
    private Utilities.Callback powerSaverCallback;
    int size;

    public StarParticlesView(Context context) {
        int i;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            i = 200;
        } else {
            i = SharedConfig.getDevicePerformanceClass() == 1 ? 100 : 50;
        }
        this(context, i);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$onAttachedToWindow$0((Boolean) obj);
            }
        };
        this.powerSaverCallback = callback;
        LiteMode.addOnPowerSaverAppliedListener(callback);
        onApplyPowerSaverMode();
    }

    public void lambda$onAttachedToWindow$0(Boolean bool) {
        onApplyPowerSaverMode();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Utilities.Callback callback = this.powerSaverCallback;
        if (callback != null) {
            LiteMode.removeOnPowerSaverAppliedListener(callback);
        }
    }

    private void onApplyPowerSaverMode() {
        boolean zIsEnabled = LiteMode.isEnabled(131072);
        if (this.isLiteModeParticlesAllowed != zIsEnabled) {
            this.isLiteModeParticlesAllowed = zIsEnabled;
            invalidate();
        }
    }

    public StarParticlesView(Context context, int i) {
        super(context);
        this.isLiteModeParticlesAllowed = true;
        this.drawable = new Drawable(i);
        configure();
    }

    protected void configure() {
        Drawable drawable = this.drawable;
        drawable.type = 100;
        drawable.roundEffect = true;
        drawable.useRotate = true;
        drawable.useBlur = true;
        drawable.checkBounds = true;
        drawable.size1 = 4;
        drawable.k3 = 0.98f;
        drawable.k2 = 0.98f;
        drawable.k1 = 0.98f;
        drawable.init();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() << 16) + getMeasuredHeight();
        this.drawable.rect.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.drawable.rect.offset((getMeasuredWidth() - this.drawable.rect.width()) / 2.0f, (getMeasuredHeight() - this.drawable.rect.height()) / 2.0f);
        this.drawable.rect2.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), getMeasuredWidth() + AndroidUtilities.dp(15.0f), getMeasuredHeight() + AndroidUtilities.dp(15.0f));
        if (this.size != measuredWidth) {
            this.size = measuredWidth;
            this.drawable.resetPositions();
        }
    }

    protected int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    public void setClipWithGradient() {
        Paint paint = new Paint(1);
        this.clipGradientPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.clipGradient = linearGradient;
        this.clipGradientPaint.setShader(linearGradient);
        this.clipGradientMatrix = new Matrix();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.isLiteModeParticlesAllowed) {
            if (this.clipGradientPaint != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            this.drawable.onDraw(canvas);
            if (this.clipGradientPaint != null) {
                canvas.save();
                this.clipGradientMatrix.reset();
                this.clipGradientMatrix.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.clipGradient.setLocalMatrix(this.clipGradientMatrix);
                canvas.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.clipGradientPaint);
                this.clipGradientMatrix.reset();
                this.clipGradientMatrix.postRotate(180.0f);
                this.clipGradientMatrix.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.clipGradient.setLocalMatrix(this.clipGradientMatrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.clipGradientPaint);
                canvas.restore();
                canvas.restore();
            }
            if (this.drawable.paused) {
                return;
            }
            invalidate();
        }
    }

    public void flingParticles(float f) {
        if (this.doNotFling) {
            return;
        }
        float f2 = f < 60.0f ? 5.0f : f < 180.0f ? 9.0f : 15.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$flingParticles$1(valueAnimator);
            }
        };
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, f2);
        valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfFloat.setDuration(600L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f2, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfFloat2.setDuration(2000L);
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.start();
    }

    public void lambda$flingParticles$1(ValueAnimator valueAnimator) {
        this.drawable.speedScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static class Drawable {
        public final int count;
        public boolean distributionAlgorithm;
        public Utilities.CallbackReturn getPaint;
        private int lastColor;
        Matrix[] matrices;
        public Paint overridePaint;
        public boolean paused;
        public long pausedTime;
        float[][] points;
        int[] pointsCount;
        private long prevTime;
        public Theme.ResourcesProvider resourcesProvider;
        float[] rotationAngles;
        public boolean startFromCenter;
        public boolean useGradient;
        public boolean useRotate;
        public boolean useScale;
        public RectF rect = new RectF();
        public RectF rect2 = new RectF();
        public RectF excludeRect = new RectF();
        private Bitmap[] stars = new Bitmap[3];
        public boolean[] svg = new boolean[3];
        public boolean[] flip = new boolean[3];
        public Paint paint = new Paint();
        public float excludeRadius = 0.0f;
        public float centerOffsetX = 0.0f;
        public float centerOffsetY = 0.0f;
        public ArrayList particles = new ArrayList();
        public float speedScale = 1.0f;
        public int size1 = 14;
        public int size2 = 12;
        public int size3 = 10;
        public float k1 = 0.85f;
        public float k2 = 0.85f;
        public float k3 = 0.9f;
        public long minLifeTime = 2000;
        public int randLifeTime = 1000;
        private final float dt = 1000.0f / AndroidUtilities.screenRefreshRate;
        public boolean checkBounds = false;
        public boolean checkTime = true;
        public boolean isCircle = true;
        public boolean useBlur = false;
        public boolean forceMaxAlpha = false;
        public boolean roundEffect = true;
        public int type = -1;
        public int colorKey = Theme.key_premiumStartSmallStarsColor;
        private int lastParticleI = 0;

        static int access$208(Drawable drawable) {
            int i = drawable.lastParticleI;
            drawable.lastParticleI = i + 1;
            return i;
        }

        public Drawable(int i) {
            this.count = i;
            this.distributionAlgorithm = i < 50;
        }

        public void init() {
            generateBitmaps();
            if (this.useRotate) {
                initRotationArrays();
            }
            if (this.particles.isEmpty()) {
                for (int i = 0; i < this.count; i++) {
                    this.particles.add(new Particle());
                }
            }
        }

        private void initRotationArrays() {
            int length = this.stars.length;
            this.matrices = new Matrix[length];
            this.points = new float[length][];
            this.pointsCount = new int[length];
            this.rotationAngles = new float[length];
            for (int i = 0; i < length; i++) {
                this.matrices[i] = new Matrix();
                this.points[i] = new float[this.count * 2];
            }
        }

        public void updateColors() {
            int color = Theme.getColor(this.colorKey, this.resourcesProvider);
            if (this.lastColor != color) {
                this.lastColor = color;
                generateBitmaps();
            }
        }

        private void generateBitmaps() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.StarParticlesView.Drawable.generateBitmaps():void");
        }

        protected int getPathColor(int i) {
            if (this.type == 100) {
                return ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 200);
            }
            return Theme.getColor(this.colorKey, this.resourcesProvider);
        }

        public void resetPositions() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < this.particles.size(); i++) {
                ((Particle) this.particles.get(i)).genPosition(jCurrentTimeMillis);
            }
        }

        public void onDraw(Canvas canvas) {
            onDraw(canvas, 1.0f);
        }

        public void onDraw(Canvas canvas, float f) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jClamp = MathUtils.clamp(jCurrentTimeMillis - this.prevTime, 4L, 50L);
            if (this.useRotate) {
                float fCenterX = this.rect.centerX() + this.centerOffsetX;
                float fCenterY = this.rect.centerY() + this.centerOffsetY;
                int i = 0;
                while (true) {
                    Matrix[] matrixArr = this.matrices;
                    if (i >= matrixArr.length) {
                        break;
                    }
                    float[] fArr = this.rotationAngles;
                    float f2 = fArr[i] + ((jClamp / ((i * 10000.0f) + 40000.0f)) * 360.0f);
                    fArr[i] = f2;
                    matrixArr[i].setRotate(f2, fCenterX, fCenterY);
                    this.pointsCount[i] = 0;
                    i++;
                }
                for (int i2 = 0; i2 < this.particles.size(); i2++) {
                    ((Particle) this.particles.get(i2)).updatePoint();
                }
                int i3 = 0;
                while (true) {
                    Matrix[] matrixArr2 = this.matrices;
                    if (i3 >= matrixArr2.length) {
                        break;
                    }
                    Matrix matrix = matrixArr2[i3];
                    float[] fArr2 = this.points[i3];
                    matrix.mapPoints(fArr2, 0, fArr2, 0, this.pointsCount[i3]);
                    this.pointsCount[i3] = 0;
                    i3++;
                }
            }
            for (int i4 = 0; i4 < this.particles.size(); i4++) {
                Particle particle = (Particle) this.particles.get(i4);
                if (this.paused) {
                    particle.draw(canvas, this.pausedTime, f);
                } else {
                    particle.draw(canvas, jCurrentTimeMillis, f);
                }
                if (this.checkTime && jCurrentTimeMillis > particle.lifeTime) {
                    particle.genPosition(jCurrentTimeMillis);
                }
                if (this.checkBounds && !this.rect2.contains(particle.drawingX, particle.drawingY)) {
                    particle.genPosition(jCurrentTimeMillis);
                }
            }
            this.prevTime = jCurrentTimeMillis;
        }

        public class Particle {
            private int alpha;
            private float drawingX;
            private float drawingY;
            float flipProgress;
            private int i;
            float inProgress;
            public long lifeTime;
            private float randomRotate;
            private int starIndex;
            private float vecX;
            private float vecY;
            private float x;
            private float x2;
            private float y;
            private float y2;
            private float scale = 1.0f;
            private boolean first = true;

            public Particle() {
                this.i = Drawable.access$208(Drawable.this);
            }

            public void updatePoint() {
                Drawable drawable = Drawable.this;
                int[] iArr = drawable.pointsCount;
                int i = this.starIndex;
                int i2 = iArr[i];
                float[] fArr = drawable.points[i];
                int i3 = i2 * 2;
                fArr[i3] = this.x;
                fArr[i3 + 1] = this.y;
                iArr[i] = i2 + 1;
            }

            public void draw(android.graphics.Canvas r9, long r10, float r12) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.StarParticlesView.Drawable.Particle.draw(android.graphics.Canvas, long, float):void");
            }

            public void genPosition(long j) {
                float fDp;
                double dAtan2;
                int i;
                float f;
                float f2;
                if (Drawable.this.type != 28) {
                    this.starIndex = Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.stars.length);
                } else {
                    if (Utilities.fastRandom.nextFloat() >= 0.13f) {
                        this.starIndex = (int) Math.floor((r1 * (Drawable.this.stars.length - 2)) + 1.0f);
                    } else {
                        this.starIndex = 0;
                    }
                }
                Drawable drawable = Drawable.this;
                this.lifeTime = j + drawable.minLifeTime + Utilities.fastRandom.nextInt(drawable.randLifeTime * (drawable.flip[this.starIndex] ? 3 : 1));
                this.randomRotate = 0.0f;
                if (Drawable.this.useScale) {
                    this.scale = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
                }
                Drawable drawable2 = Drawable.this;
                if (drawable2.distributionAlgorithm) {
                    float fAbs = drawable2.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                    float fAbs2 = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                    float f3 = 0.0f;
                    for (int i2 = 0; i2 < 10; i2++) {
                        float fAbs3 = Drawable.this.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                        float fAbs4 = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                        float f4 = 2.1474836E9f;
                        for (int i3 = 0; i3 < Drawable.this.particles.size(); i3++) {
                            Drawable drawable3 = Drawable.this;
                            if (drawable3.startFromCenter) {
                                f = ((Particle) drawable3.particles.get(i3)).x2 - fAbs3;
                                f2 = ((Particle) Drawable.this.particles.get(i3)).y2;
                            } else {
                                f = ((Particle) drawable3.particles.get(i3)).x - fAbs3;
                                f2 = ((Particle) Drawable.this.particles.get(i3)).y;
                            }
                            float f5 = f2 - fAbs4;
                            float f6 = (f * f) + (f5 * f5);
                            if (f6 < f4) {
                                f4 = f6;
                            }
                        }
                        if (f4 > f3) {
                            fAbs = fAbs3;
                            fAbs2 = fAbs4;
                            f3 = f4;
                        }
                    }
                    this.x = fAbs;
                    this.y = fAbs2;
                } else if (drawable2.isCircle) {
                    float fWidth = Drawable.this.rect.width();
                    float f7 = Drawable.this.excludeRadius;
                    float fAbs5 = ((Math.abs(Utilities.fastRandom.nextInt() % 1000) / 1000.0f) * (fWidth - f7)) + f7;
                    float fAbs6 = Math.abs(Utilities.fastRandom.nextInt() % 360);
                    if (!Drawable.this.flip[this.starIndex] || this.first) {
                        fDp = 0.0f;
                    } else {
                        fAbs5 = Math.min(fAbs5, AndroidUtilities.dp(10.0f));
                        fDp = AndroidUtilities.dp(30.0f) + 0.0f;
                    }
                    double d = fAbs5;
                    double d2 = fAbs6;
                    this.x = Drawable.this.rect.centerX() + Drawable.this.centerOffsetX + ((float) (Math.sin(Math.toRadians(d2)) * d));
                    this.y = Drawable.this.rect.centerY() + fDp + Drawable.this.centerOffsetY + ((float) (d * Math.cos(Math.toRadians(d2))));
                } else {
                    this.x = drawable2.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                    this.y = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                }
                if (Drawable.this.flip[this.starIndex]) {
                    this.flipProgress = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
                }
                Drawable drawable4 = Drawable.this;
                if (drawable4.flip[this.starIndex]) {
                    dAtan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
                } else if (drawable4.startFromCenter) {
                    dAtan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
                } else {
                    float f8 = this.y;
                    float fCenterY = drawable4.rect.centerY();
                    Drawable drawable5 = Drawable.this;
                    dAtan2 = Math.atan2(f8 - (fCenterY + drawable5.centerOffsetY), this.x - (drawable5.rect.centerX() + Drawable.this.centerOffsetX));
                }
                this.vecX = (float) Math.cos(dAtan2);
                this.vecY = (float) Math.sin(dAtan2);
                if (Drawable.this.svg[this.starIndex]) {
                    this.alpha = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
                } else {
                    this.alpha = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
                }
                int i4 = Drawable.this.type;
                if ((i4 == 6 && ((i = this.starIndex) == 1 || i == 2)) || i4 == 9 || i4 == 3 || i4 == 7 || i4 == 24 || i4 == 11 || i4 == 22 || i4 == 4) {
                    this.randomRotate = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
                }
                Drawable drawable6 = Drawable.this;
                if (drawable6.type != 101) {
                    this.inProgress = 0.0f;
                }
                if (drawable6.startFromCenter) {
                    float fNextFloat = (((Utilities.fastRandom.nextFloat() * 1.2f) + 0.6f) * Math.min(Drawable.this.rect.width(), Drawable.this.rect.height())) / 2.0f;
                    float fCenterX = Drawable.this.rect.centerX() + Drawable.this.centerOffsetX + (((float) Math.cos(dAtan2)) * fNextFloat);
                    this.x = fCenterX;
                    this.x2 = fCenterX;
                    float fCenterY2 = Drawable.this.rect.centerY() + Drawable.this.centerOffsetY + (((float) Math.sin(dAtan2)) * fNextFloat);
                    this.y = fCenterY2;
                    this.y2 = fCenterY2;
                }
                this.first = false;
            }
        }
    }

    public void setPaused(boolean z) {
        Drawable drawable = this.drawable;
        if (z == drawable.paused) {
            return;
        }
        drawable.paused = z;
        if (z) {
            drawable.pausedTime = System.currentTimeMillis();
            return;
        }
        for (int i = 0; i < this.drawable.particles.size(); i++) {
            ((Drawable.Particle) this.drawable.particles.get(i)).lifeTime += System.currentTimeMillis() - this.drawable.pausedTime;
        }
        invalidate();
    }
}
