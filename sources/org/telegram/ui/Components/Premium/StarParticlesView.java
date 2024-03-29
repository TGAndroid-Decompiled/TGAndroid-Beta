package org.telegram.ui.Components.Premium;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
public class StarParticlesView extends View {
    private LinearGradient clipGradient;
    private Matrix clipGradientMatrix;
    private Paint clipGradientPaint;
    public boolean doNotFling;
    public Drawable drawable;
    int size;

    public StarParticlesView(android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.StarParticlesView.<init>(android.content.Context):void");
    }

    public StarParticlesView(Context context, int i) {
        super(context);
        this.drawable = new Drawable(i);
        configure();
    }

    public void configure() {
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
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
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
        if (this.clipGradientPaint != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        }
        this.drawable.onDraw(canvas);
        if (this.clipGradientPaint != null) {
            canvas.save();
            this.clipGradientMatrix.reset();
            this.clipGradientMatrix.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
            this.clipGradient.setLocalMatrix(this.clipGradientMatrix);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.clipGradientPaint);
            canvas.restore();
            canvas.restore();
        }
        if (this.drawable.paused) {
            return;
        }
        invalidate();
    }

    public void flingParticles(float f) {
        if (this.doNotFling) {
            return;
        }
        float f2 = 15.0f;
        if (f < 60.0f) {
            f2 = 5.0f;
        } else if (f < 180.0f) {
            f2 = 9.0f;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StarParticlesView.this.lambda$flingParticles$0(valueAnimator);
            }
        };
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f2);
        ofFloat.addUpdateListener(animatorUpdateListener);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, 1.0f);
        ofFloat2.addUpdateListener(animatorUpdateListener);
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
        public boolean distributionAlgorithm;
        private int lastColor;
        public Paint overridePaint;
        public boolean paused;
        public long pausedTime;
        float[] points1;
        float[] points2;
        float[] points3;
        int pointsCount1;
        int pointsCount2;
        int pointsCount3;
        private long prevTime;
        public Theme.ResourcesProvider resourcesProvider;
        public boolean startFromCenter;
        public boolean useGradient;
        public boolean useRotate;
        public RectF rect = new RectF();
        public RectF rect2 = new RectF();
        public RectF excludeRect = new RectF();
        private final Bitmap[] stars = new Bitmap[3];
        public Paint paint = new Paint();
        public float excludeRadius = 0.0f;
        public float centerOffsetX = 0.0f;
        public float centerOffsetY = 0.0f;
        public ArrayList<Particle> particles = new ArrayList<>();
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
        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();
        Matrix matrix3 = new Matrix();
        public boolean checkBounds = false;
        public boolean checkTime = true;
        public boolean isCircle = true;
        public boolean useBlur = false;
        public boolean forceMaxAlpha = false;
        public boolean roundEffect = true;
        public int type = -1;
        public int colorKey = Theme.key_premiumStartSmallStarsColor;
        public final boolean[] svg = new boolean[3];
        public final boolean[] flip = new boolean[3];

        public Drawable(int i) {
            this.count = i;
            this.distributionAlgorithm = i < 50;
        }

        public void init() {
            if (this.useRotate) {
                int i = this.count;
                this.points1 = new float[i * 2];
                this.points2 = new float[i * 2];
                this.points3 = new float[i * 2];
            }
            generateBitmaps();
            if (this.particles.isEmpty()) {
                for (int i2 = 0; i2 < this.count; i2++) {
                    this.particles.add(new Particle());
                }
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
            int dp;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            for (int i7 = 0; i7 < 3; i7++) {
                float f = this.k1;
                if (i7 == 0) {
                    dp = AndroidUtilities.dp(this.size1);
                } else if (i7 == 1) {
                    f = this.k2;
                    dp = AndroidUtilities.dp(this.size2);
                } else {
                    f = this.k3;
                    dp = AndroidUtilities.dp(this.size3);
                }
                int i8 = dp;
                int i9 = this.type;
                if (i9 == 9) {
                    if (i7 == 0) {
                        i6 = R.raw.premium_object_folder;
                    } else if (i7 == 1) {
                        i6 = R.raw.premium_object_bubble;
                    } else {
                        i6 = R.raw.premium_object_settings;
                    }
                    this.stars[i7] = SvgHelper.getBitmap(i6, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 11 || i9 == 4) {
                    if (i7 == 0) {
                        i = R.raw.premium_object_smile1;
                    } else if (i7 == 1) {
                        i = R.raw.premium_object_smile2;
                    } else {
                        i = R.raw.premium_object_like;
                    }
                    this.stars[i7] = SvgHelper.getBitmap(i, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 22) {
                    if (i7 == 0) {
                        i5 = R.raw.premium_object_user;
                    } else if (i7 == 1) {
                        i5 = R.raw.cache_photos;
                    } else {
                        i5 = R.raw.cache_profile_photos;
                    }
                    this.stars[i7] = SvgHelper.getBitmap(i5, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 3) {
                    if (i7 == 0) {
                        i4 = R.raw.premium_object_adsbubble;
                    } else if (i7 == 1) {
                        i4 = R.raw.premium_object_like;
                    } else {
                        i4 = R.raw.premium_object_noads;
                    }
                    this.stars[i7] = SvgHelper.getBitmap(i4, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 7) {
                    if (i7 == 0) {
                        i3 = R.raw.premium_object_video2;
                    } else if (i7 == 1) {
                        i3 = R.raw.premium_object_video;
                    } else {
                        i3 = R.raw.premium_object_user;
                    }
                    this.stars[i7] = SvgHelper.getBitmap(i3, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 1001) {
                    this.stars[i7] = SvgHelper.getBitmap(R.raw.premium_object_fire, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 1002) {
                    this.stars[i7] = SvgHelper.getBitmap(R.raw.premium_object_star2, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 24) {
                    if (i7 == 0) {
                        i2 = R.raw.premium_object_tag;
                    } else if (i7 == 1) {
                        i2 = R.raw.premium_object_check;
                    } else {
                        i2 = R.raw.premium_object_star;
                    }
                    this.stars[i7] = SvgHelper.getBitmap(i2, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 28 && i7 == 0) {
                    this.stars[i7] = SvgHelper.getBitmap(R.raw.filled_premium_dollar, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 255));
                    this.flip[i7] = true;
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(i8, i8, Bitmap.Config.ARGB_8888);
                    this.stars[i7] = createBitmap;
                    Canvas canvas = new Canvas(createBitmap);
                    if (this.type == 6 && (i7 == 1 || i7 == 2)) {
                        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_premium_liststar);
                        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(this.colorKey, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        drawable.setBounds(0, 0, i8, i8);
                        drawable.draw(canvas);
                    } else {
                        Path path = new Path();
                        float f2 = i8 >> 1;
                        int i10 = (int) (f * f2);
                        path.moveTo(0.0f, f2);
                        float f3 = i10;
                        path.lineTo(f3, f3);
                        path.lineTo(f2, 0.0f);
                        float f4 = i8 - i10;
                        path.lineTo(f4, f3);
                        float f5 = i8;
                        path.lineTo(f5, f2);
                        path.lineTo(f4, f4);
                        path.lineTo(f2, f5);
                        path.lineTo(f3, f4);
                        path.lineTo(0.0f, f2);
                        path.close();
                        Paint paint = new Paint();
                        if (this.useGradient) {
                            if (i8 >= AndroidUtilities.dp(10.0f)) {
                                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, i8, i8, i8 * (-2), 0.0f);
                            } else {
                                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, i8, i8, i8 * (-4), 0.0f);
                            }
                            Paint mainGradientPaint = PremiumGradient.getInstance().getMainGradientPaint();
                            if (this.roundEffect) {
                                mainGradientPaint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                            }
                            if (this.forceMaxAlpha) {
                                mainGradientPaint.setAlpha(255);
                            } else if (this.useBlur) {
                                mainGradientPaint.setAlpha(60);
                            } else {
                                mainGradientPaint.setAlpha(120);
                            }
                            canvas.drawPath(path, mainGradientPaint);
                            mainGradientPaint.setPathEffect(null);
                            mainGradientPaint.setAlpha(255);
                        } else {
                            paint.setColor(getPathColor());
                            if (this.roundEffect) {
                                paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if (this.useBlur) {
                            Utilities.stackBlurBitmap(createBitmap, 2);
                        }
                    }
                }
            }
        }

        protected int getPathColor() {
            if (this.type == 100) {
                return ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 200);
            }
            return Theme.getColor(this.colorKey, this.resourcesProvider);
        }

        public void resetPositions() {
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < this.particles.size(); i++) {
                this.particles.get(i).genPosition(currentTimeMillis);
            }
        }

        public void onDraw(Canvas canvas) {
            onDraw(canvas, 1.0f);
        }

        public void onDraw(Canvas canvas, float f) {
            long currentTimeMillis = System.currentTimeMillis();
            long clamp = MathUtils.clamp(currentTimeMillis - this.prevTime, 4L, 50L);
            if (this.useRotate) {
                this.matrix.reset();
                float f2 = (float) clamp;
                float f3 = this.a + ((f2 / 40000.0f) * 360.0f);
                this.a = f3;
                this.a1 += (f2 / 50000.0f) * 360.0f;
                this.a2 += (f2 / 60000.0f) * 360.0f;
                this.matrix.setRotate(f3, this.rect.centerX() + this.centerOffsetX, this.rect.centerY() + this.centerOffsetY);
                this.matrix2.setRotate(this.a1, this.rect.centerX() + this.centerOffsetX, this.rect.centerY() + this.centerOffsetY);
                this.matrix3.setRotate(this.a2, this.rect.centerX() + this.centerOffsetX, this.rect.centerY() + this.centerOffsetY);
                this.pointsCount1 = 0;
                this.pointsCount2 = 0;
                this.pointsCount3 = 0;
                for (int i = 0; i < this.particles.size(); i++) {
                    this.particles.get(i).updatePoint();
                }
                Matrix matrix = this.matrix;
                float[] fArr = this.points1;
                matrix.mapPoints(fArr, 0, fArr, 0, this.pointsCount1);
                Matrix matrix2 = this.matrix2;
                float[] fArr2 = this.points2;
                matrix2.mapPoints(fArr2, 0, fArr2, 0, this.pointsCount2);
                Matrix matrix3 = this.matrix3;
                float[] fArr3 = this.points3;
                matrix3.mapPoints(fArr3, 0, fArr3, 0, this.pointsCount3);
                this.pointsCount1 = 0;
                this.pointsCount2 = 0;
                this.pointsCount3 = 0;
            }
            for (int i2 = 0; i2 < this.particles.size(); i2++) {
                Particle particle = this.particles.get(i2);
                if (this.paused) {
                    particle.draw(canvas, this.pausedTime, f);
                } else {
                    particle.draw(canvas, currentTimeMillis, f);
                }
                if (this.checkTime && currentTimeMillis > particle.lifeTime) {
                    particle.genPosition(currentTimeMillis);
                }
                if (this.checkBounds && !this.rect2.contains(particle.drawingX, particle.drawingY)) {
                    particle.genPosition(currentTimeMillis);
                }
            }
            this.prevTime = currentTimeMillis;
        }

        public class Particle {
            private int alpha;
            private float drawingX;
            private float drawingY;
            private boolean first = true;
            float flipProgress;
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

            public Particle() {
            }

            public void updatePoint() {
                int i = this.starIndex;
                if (i == 0) {
                    Drawable drawable = Drawable.this;
                    float[] fArr = drawable.points1;
                    int i2 = drawable.pointsCount1;
                    fArr[i2 * 2] = this.x;
                    fArr[(i2 * 2) + 1] = this.y;
                    drawable.pointsCount1 = i2 + 1;
                } else if (i == 1) {
                    Drawable drawable2 = Drawable.this;
                    float[] fArr2 = drawable2.points2;
                    int i3 = drawable2.pointsCount2;
                    fArr2[i3 * 2] = this.x;
                    fArr2[(i3 * 2) + 1] = this.y;
                    drawable2.pointsCount2 = i3 + 1;
                } else if (i == 2) {
                    Drawable drawable3 = Drawable.this;
                    float[] fArr3 = drawable3.points3;
                    int i4 = drawable3.pointsCount3;
                    fArr3[i4 * 2] = this.x;
                    fArr3[(i4 * 2) + 1] = this.y;
                    drawable3.pointsCount3 = i4 + 1;
                }
            }

            public void draw(android.graphics.Canvas r12, long r13, float r15) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.StarParticlesView.Drawable.Particle.draw(android.graphics.Canvas, long, float):void");
            }

            public void genPosition(long j) {
                float f;
                double atan2;
                int i;
                float f2;
                float f3;
                float nextFloat;
                if (Drawable.this.type != 28) {
                    this.starIndex = Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.stars.length);
                } else {
                    if (Utilities.fastRandom.nextFloat() >= 0.13f) {
                        this.starIndex = (int) Math.floor((nextFloat * (Drawable.this.stars.length - 1)) + 1.0f);
                    } else {
                        this.starIndex = 0;
                    }
                }
                Drawable drawable = Drawable.this;
                this.lifeTime = j + drawable.minLifeTime + Utilities.fastRandom.nextInt(drawable.randLifeTime * (drawable.flip[this.starIndex] ? 3 : 1));
                this.randomRotate = 0.0f;
                Drawable drawable2 = Drawable.this;
                if (drawable2.distributionAlgorithm) {
                    float abs = drawable2.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                    float abs2 = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                    float f4 = 0.0f;
                    for (int i2 = 0; i2 < 10; i2++) {
                        float abs3 = Drawable.this.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                        float abs4 = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                        float f5 = 2.14748365E9f;
                        for (int i3 = 0; i3 < Drawable.this.particles.size(); i3++) {
                            Drawable drawable3 = Drawable.this;
                            if (drawable3.startFromCenter) {
                                f2 = drawable3.particles.get(i3).x2 - abs3;
                                f3 = Drawable.this.particles.get(i3).y2;
                            } else {
                                f2 = drawable3.particles.get(i3).x - abs3;
                                f3 = Drawable.this.particles.get(i3).y;
                            }
                            float f6 = f3 - abs4;
                            float f7 = (f2 * f2) + (f6 * f6);
                            if (f7 < f5) {
                                f5 = f7;
                            }
                        }
                        if (f5 > f4) {
                            abs = abs3;
                            abs2 = abs4;
                            f4 = f5;
                        }
                    }
                    this.x = abs;
                    this.y = abs2;
                } else if (drawable2.isCircle) {
                    float width = Drawable.this.rect.width();
                    float f8 = Drawable.this.excludeRadius;
                    float abs5 = ((Math.abs(Utilities.fastRandom.nextInt() % 1000) / 1000.0f) * (width - f8)) + f8;
                    float abs6 = Math.abs(Utilities.fastRandom.nextInt() % 360);
                    if (!Drawable.this.flip[this.starIndex] || this.first) {
                        f = 0.0f;
                    } else {
                        abs5 = Math.min(abs5, AndroidUtilities.dp(10.0f));
                        f = AndroidUtilities.dp(30.0f) + 0.0f;
                    }
                    float centerX = Drawable.this.rect.centerX() + Drawable.this.centerOffsetX;
                    double d = abs5;
                    double d2 = abs6;
                    double sin = Math.sin(Math.toRadians(d2));
                    Double.isNaN(d);
                    this.x = centerX + ((float) (sin * d));
                    double cos = Math.cos(Math.toRadians(d2));
                    Double.isNaN(d);
                    this.y = Drawable.this.rect.centerY() + f + Drawable.this.centerOffsetY + ((float) (d * cos));
                } else {
                    this.x = drawable2.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                    this.y = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                }
                if (Drawable.this.flip[this.starIndex]) {
                    this.flipProgress = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
                }
                Drawable drawable4 = Drawable.this;
                if (drawable4.flip[this.starIndex]) {
                    atan2 = Math.toRadians(280.0f - (200.0f * Utilities.fastRandom.nextFloat()));
                } else {
                    float f9 = this.x;
                    float centerX2 = drawable4.rect.centerX();
                    Drawable drawable5 = Drawable.this;
                    atan2 = Math.atan2(f9 - (centerX2 + drawable5.centerOffsetX), this.y - (drawable5.rect.centerY() + Drawable.this.centerOffsetY));
                }
                this.vecX = (float) Math.sin(atan2);
                this.vecY = (float) Math.cos(atan2);
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
                    this.x2 = this.x;
                    this.y2 = this.y;
                    float centerX3 = drawable6.rect.centerX();
                    Drawable drawable7 = Drawable.this;
                    this.x = centerX3 + drawable7.centerOffsetX;
                    this.y = drawable7.rect.centerY() + Drawable.this.centerOffsetY;
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
            this.drawable.particles.get(i).lifeTime += System.currentTimeMillis() - this.drawable.pausedTime;
        }
        invalidate();
    }
}
