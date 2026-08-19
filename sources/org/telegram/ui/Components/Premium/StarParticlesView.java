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
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.GLIconSettingsView;

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
                this.f$0.onApplyPowerSaverMode();
            }
        };
        this.powerSaverCallback = callback;
        LiteMode.addOnPowerSaverAppliedListener(callback);
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

    public void onApplyPowerSaverMode() {
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
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.isLiteModeParticlesAllowed) {
            if (this.clipGradientPaint != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.drawable.onDraw(canvas2);
            if (this.clipGradientPaint != null) {
                canvas2.save();
                this.clipGradientMatrix.reset();
                this.clipGradientMatrix.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.clipGradient.setLocalMatrix(this.clipGradientMatrix);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.clipGradientPaint);
                this.clipGradientMatrix.reset();
                this.clipGradientMatrix.postRotate(180.0f);
                this.clipGradientMatrix.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.clipGradient.setLocalMatrix(this.clipGradientMatrix);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.clipGradientPaint);
                canvas2.restore();
                canvas2.restore();
            }
            if (this.drawable.paused) {
                return;
            }
            invalidate();
        }
    }

    public void flingParticles(float f) {
        float f2;
        if (this.doNotFling) {
            return;
        }
        if (f < 60.0f) {
            f2 = 5.0f;
        } else {
            f2 = f < 180.0f ? 9.0f : 15.0f;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.drawable.speedScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
            int i;
            int iDp;
            int i2;
            Bitmap bitmapCreateBitmap;
            Canvas canvas;
            Path path;
            Paint paint;
            Bitmap bitmap;
            int i3;
            Canvas canvas2;
            int i4;
            Paint mainGradientPaint;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12 = 6;
            int i13 = 3;
            int i14 = 43;
            if (this.type == 43) {
                if (this.stars.length != 6) {
                    this.stars = new Bitmap[6];
                }
                if (this.svg.length != 6) {
                    this.svg = new boolean[6];
                }
                if (this.flip.length != 6) {
                    this.flip = new boolean[6];
                }
                i = 6;
            } else {
                i = 3;
            }
            int i15 = 0;
            int i16 = 0;
            while (i16 < i) {
                float f = this.k1;
                if (i16 == 0) {
                    iDp = AndroidUtilities.dp(this.size1);
                } else if (i16 == 1) {
                    f = this.k2;
                    iDp = AndroidUtilities.dp(this.size2);
                } else {
                    f = this.k3;
                    iDp = AndroidUtilities.dp(this.size3);
                }
                int i17 = iDp;
                int i18 = this.type;
                if (i18 == 9) {
                    if (i16 == 0) {
                        i11 = R.raw.premium_object_folder;
                    } else if (i16 == 1) {
                        i11 = R.raw.premium_object_bubble;
                    } else {
                        i11 = R.raw.premium_object_settings;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i11, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 27) {
                    if (i16 == 0) {
                        i10 = R.raw.filled_messages_paid;
                    } else if (i16 == 1) {
                        i10 = R.raw.filled_crown_on;
                    } else {
                        i10 = R.raw.premium_object_star2;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i10, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 11 || i18 == 4) {
                    if (i16 == 0) {
                        i2 = R.raw.premium_object_smile1;
                    } else if (i16 == 1) {
                        i2 = R.raw.premium_object_smile2;
                    } else {
                        i2 = R.raw.premium_object_like;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i2, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 22) {
                    if (i16 == 0) {
                        i9 = R.raw.premium_object_user;
                    } else if (i16 == 1) {
                        i9 = R.raw.cache_photos;
                    } else {
                        i9 = R.raw.cache_profile_photos;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i9, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == i13) {
                    if (i16 == 0) {
                        i8 = R.raw.premium_object_adsbubble;
                    } else if (i16 == 1) {
                        i8 = R.raw.premium_object_like;
                    } else {
                        i8 = R.raw.premium_object_noads;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i8, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 7) {
                    if (i16 == 0) {
                        i7 = R.raw.premium_object_video2;
                    } else if (i16 == 1) {
                        i7 = R.raw.premium_object_video;
                    } else {
                        i7 = R.raw.premium_object_user;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i7, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == i14) {
                    if (i16 == 0) {
                        i6 = R.raw.premium_object_list;
                    } else if (i16 == 1) {
                        i6 = R.raw.premium_object_math;
                    } else if (i16 == 2) {
                        i6 = R.raw.premium_object_table;
                    } else if (i16 == i13) {
                        i6 = R.raw.premium_object_superscript;
                    } else if (i16 == 4) {
                        i6 = R.raw.premium_object_bold;
                    } else {
                        i6 = R.raw.premium_object_code;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i6, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 1001) {
                    this.stars[i16] = SvgHelper.getBitmap(R.raw.premium_object_fire, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 1002) {
                    this.stars[i16] = SvgHelper.getBitmap(R.raw.premium_object_star2, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 24) {
                    if (i16 == 0) {
                        i5 = R.raw.premium_object_tag;
                    } else if (i16 == 1) {
                        i5 = R.raw.premium_object_check;
                    } else {
                        i5 = R.raw.premium_object_star;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i5, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 28) {
                    if (i16 == 0) {
                        this.stars[i16] = SvgHelper.getBitmap(R.raw.filled_premium_dollar, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 255));
                        this.flip[i16] = true;
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap(i17, i17, Bitmap.Config.ARGB_8888);
                        this.stars[i16] = bitmapCreateBitmap;
                        canvas = new Canvas(bitmapCreateBitmap);
                        if (this.type != i12 && (i16 == 1 || i16 == 2)) {
                            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_premium_liststar);
                            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(this.colorKey, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                            drawable.setBounds(i15, i15, i17, i17);
                            drawable.draw(canvas);
                        } else {
                            path = new Path();
                            float f2 = i17 >> 1;
                            int i19 = (int) (f * f2);
                            path.moveTo(0.0f, f2);
                            float f3 = i19;
                            path.lineTo(f3, f3);
                            path.lineTo(f2, 0.0f);
                            float f4 = i17 - i19;
                            path.lineTo(f4, f3);
                            float f5 = i17;
                            path.lineTo(f5, f2);
                            path.lineTo(f4, f4);
                            path.lineTo(f2, f5);
                            path.lineTo(f3, f4);
                            path.lineTo(0.0f, f2);
                            path.close();
                            paint = new Paint();
                            if (this.useGradient) {
                                if (i17 >= AndroidUtilities.dp(10.0f)) {
                                    bitmap = bitmapCreateBitmap;
                                    canvas2 = canvas;
                                    i4 = 255;
                                    i3 = 2;
                                    PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, i17, i17, i17 * (-2), 0.0f);
                                } else {
                                    bitmap = bitmapCreateBitmap;
                                    canvas2 = canvas;
                                    i4 = 255;
                                    i3 = 2;
                                    PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, i17, i17, i17 * (-4), 0.0f);
                                }
                                mainGradientPaint = PremiumGradient.getInstance().getMainGradientPaint();
                                if (this.roundEffect) {
                                    mainGradientPaint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                                }
                                if (this.forceMaxAlpha) {
                                    mainGradientPaint.setAlpha(i4);
                                } else if (this.useBlur) {
                                    mainGradientPaint.setAlpha(60);
                                } else {
                                    mainGradientPaint.setAlpha(120);
                                }
                                canvas2.drawPath(path, mainGradientPaint);
                                mainGradientPaint.setPathEffect(null);
                                mainGradientPaint.setAlpha(i4);
                            } else {
                                bitmap = bitmapCreateBitmap;
                                i3 = 2;
                                paint.setColor(getPathColor(i16));
                                if (this.roundEffect) {
                                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                                }
                                canvas.drawPath(path, paint);
                            }
                            if (this.useBlur) {
                                Utilities.stackBlurBitmap(bitmap, i3);
                            }
                        }
                    }
                } else if (i18 == 105 && i16 == 0) {
                    this.stars[i16] = SvgHelper.getBitmap(R.raw.premium_object_star2, i17, i17, getPathColor(i16));
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(i17, i17, Bitmap.Config.ARGB_8888);
                    this.stars[i16] = bitmapCreateBitmap;
                    canvas = new Canvas(bitmapCreateBitmap);
                    if (this.type != i12) {
                        path = new Path();
                        float f6 = i17 >> 1;
                        int i110 = (int) (f * f6);
                        path.moveTo(0.0f, f6);
                        float f7 = i110;
                        path.lineTo(f7, f7);
                        path.lineTo(f6, 0.0f);
                        float f8 = i17 - i110;
                        path.lineTo(f8, f7);
                        float f9 = i17;
                        path.lineTo(f9, f6);
                        path.lineTo(f8, f8);
                        path.lineTo(f6, f9);
                        path.lineTo(f7, f8);
                        path.lineTo(0.0f, f6);
                        path.close();
                        paint = new Paint();
                        if (this.useGradient) {
                            if (i17 >= AndroidUtilities.dp(10.0f)) {
                                bitmap = bitmapCreateBitmap;
                                canvas2 = canvas;
                                i4 = 255;
                                i3 = 2;
                                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, i17, i17, i17 * (-2), 0.0f);
                            } else {
                                bitmap = bitmapCreateBitmap;
                                canvas2 = canvas;
                                i4 = 255;
                                i3 = 2;
                                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, i17, i17, i17 * (-4), 0.0f);
                            }
                            mainGradientPaint = PremiumGradient.getInstance().getMainGradientPaint();
                            if (this.roundEffect) {
                                mainGradientPaint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                            }
                            if (this.forceMaxAlpha) {
                                mainGradientPaint.setAlpha(i4);
                            } else if (this.useBlur) {
                                mainGradientPaint.setAlpha(60);
                            } else {
                                mainGradientPaint.setAlpha(120);
                            }
                            canvas2.drawPath(path, mainGradientPaint);
                            mainGradientPaint.setPathEffect(null);
                            mainGradientPaint.setAlpha(i4);
                        } else {
                            bitmap = bitmapCreateBitmap;
                            i3 = 2;
                            paint.setColor(getPathColor(i16));
                            if (this.roundEffect) {
                                paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if (this.useBlur) {
                            Utilities.stackBlurBitmap(bitmap, i3);
                        }
                    } else {
                        path = new Path();
                        float f10 = i17 >> 1;
                        int i111 = (int) (f * f10);
                        path.moveTo(0.0f, f10);
                        float f11 = i111;
                        path.lineTo(f11, f11);
                        path.lineTo(f10, 0.0f);
                        float f12 = i17 - i111;
                        path.lineTo(f12, f11);
                        float f13 = i17;
                        path.lineTo(f13, f10);
                        path.lineTo(f12, f12);
                        path.lineTo(f10, f13);
                        path.lineTo(f11, f12);
                        path.lineTo(0.0f, f10);
                        path.close();
                        paint = new Paint();
                        if (this.useGradient) {
                            if (i17 >= AndroidUtilities.dp(10.0f)) {
                                bitmap = bitmapCreateBitmap;
                                canvas2 = canvas;
                                i4 = 255;
                                i3 = 2;
                                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, i17, i17, i17 * (-2), 0.0f);
                            } else {
                                bitmap = bitmapCreateBitmap;
                                canvas2 = canvas;
                                i4 = 255;
                                i3 = 2;
                                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, i17, i17, i17 * (-4), 0.0f);
                            }
                            mainGradientPaint = PremiumGradient.getInstance().getMainGradientPaint();
                            if (this.roundEffect) {
                                mainGradientPaint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                            }
                            if (this.forceMaxAlpha) {
                                mainGradientPaint.setAlpha(i4);
                            } else if (this.useBlur) {
                                mainGradientPaint.setAlpha(60);
                            } else {
                                mainGradientPaint.setAlpha(120);
                            }
                            canvas2.drawPath(path, mainGradientPaint);
                            mainGradientPaint.setPathEffect(null);
                            mainGradientPaint.setAlpha(i4);
                        } else {
                            bitmap = bitmapCreateBitmap;
                            i3 = 2;
                            paint.setColor(getPathColor(i16));
                            if (this.roundEffect) {
                                paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if (this.useBlur) {
                            Utilities.stackBlurBitmap(bitmap, i3);
                        }
                    }
                }
                i16++;
                i12 = 6;
                i13 = 3;
                i14 = 43;
                i15 = 0;
            }
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

            public void draw(Canvas canvas, long j, float f) {
                float fClamp;
                float fMin;
                Drawable drawable = Drawable.this;
                if (drawable.useRotate) {
                    int[] iArr = drawable.pointsCount;
                    int i = this.starIndex;
                    int i2 = iArr[i];
                    float[] fArr = drawable.points[i];
                    int i3 = i2 * 2;
                    this.drawingX = fArr[i3];
                    this.drawingY = fArr[i3 + 1];
                    iArr[i] = i2 + 1;
                } else {
                    this.drawingX = this.x;
                    this.drawingY = this.y;
                }
                if (drawable.excludeRect.isEmpty() || !Drawable.this.excludeRect.contains(this.drawingX, this.drawingY)) {
                    canvas.save();
                    canvas.translate(this.drawingX, this.drawingY);
                    float f2 = this.randomRotate;
                    if (f2 != 0.0f) {
                        canvas.rotate(f2, Drawable.this.stars[this.starIndex].getWidth() / 2.0f, Drawable.this.stars[this.starIndex].getHeight() / 2.0f);
                    }
                    if (Drawable.this.checkTime) {
                        long j2 = this.lifeTime - j;
                        if (j2 < 200) {
                            fClamp = Utilities.clamp(1.0f - (j2 / 150.0f), 1.0f, 0.0f);
                        } else {
                            fClamp = 0.0f;
                        }
                    } else {
                        fClamp = 0.0f;
                    }
                    float f3 = this.inProgress;
                    if (f3 < 1.0f || GLIconSettingsView.smallStarsSize != 1.0f) {
                        float interpolation = AndroidUtilities.overshootInterpolator.getInterpolation(f3) * GLIconSettingsView.smallStarsSize;
                        canvas.scale(interpolation, interpolation, 0.0f, 0.0f);
                    }
                    Drawable drawable2 = Drawable.this;
                    if (drawable2.flip[this.starIndex]) {
                        float fMin2 = this.flipProgress + ((drawable2.dt / 1000.0f) * Math.min(Drawable.this.speedScale, 3.5f));
                        this.flipProgress = fMin2;
                        canvas.scale((float) Math.cos(((double) fMin2) * 3.141592653589793d), 1.0f, 0.0f, 0.0f);
                    }
                    Drawable drawable3 = Drawable.this;
                    Paint paint = drawable3.overridePaint;
                    if (paint == null) {
                        Utilities.CallbackReturn callbackReturn = drawable3.getPaint;
                        if (callbackReturn != null) {
                            paint = (Paint) callbackReturn.run(Integer.valueOf(this.i));
                        } else {
                            paint = drawable3.paint;
                        }
                    }
                    float f4 = 1.0f - fClamp;
                    paint.setAlpha((int) (this.alpha * f4 * f));
                    Bitmap bitmap = Drawable.this.stars[this.starIndex];
                    if (Drawable.this.useScale) {
                        float f5 = this.scale * f4 * f * this.inProgress;
                        canvas.scale(f5, f5);
                    }
                    canvas.drawBitmap(bitmap, -(bitmap.getWidth() >> 1), -(bitmap.getHeight() >> 1), paint);
                    canvas.restore();
                }
                if (Drawable.this.paused) {
                    return;
                }
                float fDp = AndroidUtilities.dp(4.0f) * (Drawable.this.dt / 660.0f);
                Drawable drawable4 = Drawable.this;
                if (drawable4.flip[this.starIndex]) {
                    fMin = fDp * Math.min(drawable4.speedScale, 3.5f) * 4.0f;
                } else {
                    fMin = fDp * drawable4.speedScale;
                }
                this.x += this.vecX * fMin;
                this.y += this.vecY * fMin;
                float f6 = this.inProgress;
                if (f6 != 1.0f) {
                    float f7 = f6 + (Drawable.this.dt / 200.0f);
                    this.inProgress = f7;
                    if (f7 > 1.0f) {
                        this.inProgress = 1.0f;
                    }
                }
            }

            public void genPosition(long j) {
                float f;
                float fDp;
                double dAtan2;
                int i;
                float f2;
                float f3;
                if (Drawable.this.type != 28) {
                    this.starIndex = Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.stars.length);
                } else {
                    float fNextFloat = Utilities.fastRandom.nextFloat();
                    if (fNextFloat >= 0.13f) {
                        this.starIndex = (int) Math.floor((fNextFloat * (Drawable.this.stars.length - 2)) + 1.0f);
                    } else {
                        this.starIndex = 0;
                    }
                }
                Drawable drawable = Drawable.this;
                this.lifeTime = j + drawable.minLifeTime + ((long) Utilities.fastRandom.nextInt(drawable.randLifeTime * (drawable.flip[this.starIndex] ? 3 : 1)));
                this.randomRotate = 0.0f;
                if (Drawable.this.useScale) {
                    this.scale = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
                }
                Drawable drawable2 = Drawable.this;
                if (drawable2.distributionAlgorithm) {
                    float fAbs = drawable2.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                    float fAbs2 = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                    float f4 = 0.0f;
                    for (int i2 = 0; i2 < 10; i2++) {
                        float fAbs3 = Drawable.this.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                        float fAbs4 = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                        float f5 = 2.1474836E9f;
                        for (int i3 = 0; i3 < Drawable.this.particles.size(); i3++) {
                            Drawable drawable3 = Drawable.this;
                            if (drawable3.startFromCenter) {
                                f2 = ((Particle) drawable3.particles.get(i3)).x2 - fAbs3;
                                f3 = ((Particle) Drawable.this.particles.get(i3)).y2;
                            } else {
                                f2 = ((Particle) drawable3.particles.get(i3)).x - fAbs3;
                                f3 = ((Particle) Drawable.this.particles.get(i3)).y;
                            }
                            float f6 = f3 - fAbs4;
                            float f7 = (f2 * f2) + (f6 * f6);
                            if (f7 < f5) {
                                f5 = f7;
                            }
                        }
                        if (f5 > f4) {
                            fAbs = fAbs3;
                            fAbs2 = fAbs4;
                            f4 = f5;
                        }
                    }
                    f = 0.6f;
                    this.x = fAbs;
                    this.y = fAbs2;
                } else {
                    f = 0.6f;
                    if (drawable2.isCircle) {
                        float fAbs5 = Math.abs(Utilities.fastRandom.nextInt() % 1000) / 1000.0f;
                        float fWidth = Drawable.this.rect.width();
                        float f8 = Drawable.this.excludeRadius;
                        float fMin = (fAbs5 * (fWidth - f8)) + f8;
                        float fAbs6 = Math.abs(Utilities.fastRandom.nextInt() % 360);
                        if (!Drawable.this.flip[this.starIndex] || this.first) {
                            fDp = 0.0f;
                        } else {
                            fMin = Math.min(fMin, AndroidUtilities.dp(10.0f));
                            fDp = AndroidUtilities.dp(30.0f) + 0.0f;
                        }
                        double d = fMin;
                        double d2 = fAbs6;
                        this.x = Drawable.this.rect.centerX() + Drawable.this.centerOffsetX + ((float) (Math.sin(Math.toRadians(d2)) * d));
                        this.y = Drawable.this.rect.centerY() + fDp + Drawable.this.centerOffsetY + ((float) (d * Math.cos(Math.toRadians(d2))));
                    } else {
                        this.x = drawable2.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                        this.y = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                    }
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
                    float f9 = this.y;
                    float fCenterY = drawable4.rect.centerY();
                    Drawable drawable5 = Drawable.this;
                    dAtan2 = Math.atan2(f9 - (fCenterY + drawable5.centerOffsetY), this.x - (drawable5.rect.centerX() + Drawable.this.centerOffsetX));
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
                    float fNextFloat2 = (((Utilities.fastRandom.nextFloat() * 1.2f) + f) * Math.min(Drawable.this.rect.width(), Drawable.this.rect.height())) / 2.0f;
                    float fCenterX = Drawable.this.rect.centerX() + Drawable.this.centerOffsetX + (((float) Math.cos(dAtan2)) * fNextFloat2);
                    this.x = fCenterX;
                    this.x2 = fCenterX;
                    float fCenterY2 = Drawable.this.rect.centerY() + Drawable.this.centerOffsetY + (((float) Math.sin(dAtan2)) * fNextFloat2);
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
