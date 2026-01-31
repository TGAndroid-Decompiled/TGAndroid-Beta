package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import com.google.zxing.common.detector.MathUtils;
import java.util.Arrays;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CacheChart;
import org.telegram.ui.Components.Premium.StarParticlesView;

public abstract class CacheChart extends View {
    private static final int[] DEFAULT_COLORS;
    private static final int[] DEFAULT_PARTICLES;
    private static Long loadedStart;
    private static long particlesStart;
    private static Long start;
    private final AnimatedTextView.AnimatedTextDrawable bottomCompleteText;
    private final AnimatedTextView.AnimatedTextDrawable bottomText;
    private RectF chartBounds;
    private RectF chartInnerBounds;
    private RectF chartMeasureBounds;
    private final int[] colorKeys;
    private boolean complete;
    private StarParticlesView.Drawable completeDrawable;
    private AnimatedFloat completeFloat;
    private LinearGradient completeGradient;
    private Matrix completeGradientMatrix;
    private Paint completePaint;
    private Paint completePaintStroke;
    private Path completePath;
    private RectF completePathBounds;
    private LinearGradient completeTextGradient;
    private Matrix completeTextGradientMatrix;
    private boolean interceptTouch;
    private boolean isAttached;
    private boolean loading;
    private Paint loadingBackgroundPaint;
    public AnimatedFloat loadingFloat;
    private final int[] particles;
    private RectF roundingRect;
    private final int sectionsCount;
    private Sector[] sectors;
    private float[] segmentsTmp;
    private int selectedIndex;
    private final boolean svgParticles;
    private float[] tempFloat;
    private int[] tempPercents;
    private final AnimatedTextView.AnimatedTextDrawable topCompleteText;
    private final AnimatedTextView.AnimatedTextDrawable topText;
    private final int type;

    public static float toRad(float f) {
        return (float) ((f / 180.0f) * 3.141592653589793d);
    }

    protected int heightDp() {
        return 200;
    }

    protected void onSectionClick(int i) {
    }

    protected abstract void onSectionDown(int i, boolean z);

    protected int padInsideDp() {
        return 0;
    }

    static {
        int i = Theme.key_statisticChartLine_lightblue;
        int i2 = Theme.key_statisticChartLine_blue;
        int i3 = Theme.key_statisticChartLine_green;
        int i4 = Theme.key_statisticChartLine_purple;
        int i5 = Theme.key_statisticChartLine_lightgreen;
        int i6 = Theme.key_statisticChartLine_red;
        int i7 = Theme.key_statisticChartLine_orange;
        int i8 = Theme.key_statisticChartLine_cyan;
        int i9 = Theme.key_statisticChartLine_golden;
        DEFAULT_COLORS = new int[]{i, i2, i3, i4, i5, i6, i7, i8, i4, i9, i9};
        int i10 = R.raw.cache_photos;
        int i11 = R.raw.cache_videos;
        int i12 = R.raw.cache_documents;
        int i13 = R.raw.cache_music;
        int i14 = R.raw.cache_stickers;
        int i15 = R.raw.cache_profile_photos;
        int i16 = R.raw.cache_other;
        DEFAULT_PARTICLES = new int[]{i10, i11, i12, i13, i11, i13, i14, i15, i16, i16, i12};
        particlesStart = -1L;
    }

    class Sector {
        float angleCenter;
        AnimatedFloat angleCenterAnimated;
        float angleSize;
        AnimatedFloat angleSizeAnimated;
        Paint cut;
        RadialGradient gradient;
        Matrix gradientMatrix;
        int gradientWidth;
        private float lastAngleCenter;
        private float lastAngleSize;
        private float lastCx;
        private float lastCy;
        private float lastRounding;
        private float lastThickness;
        private float lastWidth;
        Paint paint;
        Bitmap particle;
        Paint particlePaint;
        float particlesAlpha;
        AnimatedFloat particlesAlphaAnimated;
        Path path;
        RectF pathBounds;
        RectF rectF;
        boolean selected;
        AnimatedFloat selectedAnimated;
        AnimatedTextView.AnimatedTextDrawable text;
        float textAlpha;
        AnimatedFloat textAlphaAnimated;
        float textScale;
        AnimatedFloat textScaleAnimated;
        Paint uncut;

        Sector() {
            Paint paint = new Paint(3);
            this.particlePaint = paint;
            paint.setColor(-1);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.angleCenterAnimated = new AnimatedFloat(CacheChart.this, 650L, cubicBezierInterpolator);
            this.angleSizeAnimated = new AnimatedFloat(CacheChart.this, 650L, cubicBezierInterpolator);
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT;
            this.textAlphaAnimated = new AnimatedFloat(CacheChart.this, 0L, 150L, cubicBezierInterpolator2);
            this.textScale = 1.0f;
            this.textScaleAnimated = new AnimatedFloat(CacheChart.this, 0L, 150L, cubicBezierInterpolator2);
            this.text = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
            this.particlesAlphaAnimated = new AnimatedFloat(CacheChart.this, 0L, 150L, cubicBezierInterpolator2);
            this.selectedAnimated = new AnimatedFloat(CacheChart.this, 0L, 200L, cubicBezierInterpolator);
            this.text.setTextColor(-1);
            this.text.setAnimationProperties(0.35f, 0L, 200L, cubicBezierInterpolator);
            this.text.setTypeface(AndroidUtilities.bold());
            this.text.setTextSize(AndroidUtilities.dp(15.0f));
            this.text.setGravity(17);
            this.path = new Path();
            this.paint = new Paint(1);
            this.pathBounds = new RectF();
            this.uncut = new Paint(1);
            Paint paint2 = new Paint(1);
            this.cut = paint2;
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            this.particlePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            this.rectF = new RectF();
        }

        private void setupPath(RectF rectF, RectF rectF2, float f, float f2, float f3) {
            float f4;
            float f5;
            float fMin = Math.min(Math.min(f3, (rectF.width() - rectF2.width()) / 4.0f), (float) ((f2 / 180.0f) * 3.141592653589793d * (rectF2.width() / 2.0f)));
            float fWidth = (rectF.width() - rectF2.width()) / 2.0f;
            if (this.lastAngleCenter == f && this.lastAngleSize == f2 && this.lastRounding == fMin && this.lastThickness == fWidth && this.lastWidth == rectF.width() && this.lastCx == rectF.centerX() && this.lastCy == rectF.centerY()) {
                return;
            }
            this.lastAngleCenter = f;
            this.lastAngleSize = f2;
            this.lastRounding = fMin;
            this.lastThickness = fWidth;
            this.lastWidth = rectF.width();
            this.lastCx = rectF.centerX();
            this.lastCy = rectF.centerY();
            float f6 = f - f2;
            float f7 = f + f2;
            boolean z = fMin > 0.0f;
            float f8 = fMin * 2.0f;
            float fWidth2 = (fMin / ((float) ((rectF.width() - f8) * 3.141592653589793d))) * 360.0f;
            float fWidth3 = ((fMin / ((float) ((rectF2.width() + f8) * 3.141592653589793d))) * 360.0f) + ((f2 > 175.0f ? 0 : 1) * 0.5f);
            float fWidth4 = (rectF.width() / 2.0f) - fMin;
            float fWidth5 = (rectF2.width() / 2.0f) + fMin;
            this.path.rewind();
            float f9 = f7 - f6;
            if (f9 < 0.5f) {
                return;
            }
            if (z) {
                double d = fWidth4;
                f4 = fWidth5;
                CacheChart.setCircleBounds(CacheChart.this.roundingRect, rectF.centerX() + (Math.cos(CacheChart.toRad(r19)) * d), (d * Math.sin(CacheChart.toRad(r19))) + rectF.centerY(), fMin);
                this.path.arcTo(CacheChart.this.roundingRect, (f6 + fWidth2) - 90.0f, 90.0f);
            } else {
                f4 = fWidth5;
            }
            this.path.arcTo(rectF, f6 + fWidth2, f9 - (fWidth2 * 2.0f));
            if (z) {
                double d2 = fWidth4;
                float f10 = f7 - fWidth2;
                f5 = f6;
                CacheChart.setCircleBounds(CacheChart.this.roundingRect, rectF.centerX() + (Math.cos(CacheChart.toRad(f10)) * d2), rectF.centerY() + (d2 * Math.sin(CacheChart.toRad(f10))), fMin);
                this.path.arcTo(CacheChart.this.roundingRect, f10, 90.0f);
                double d3 = f4;
                CacheChart.setCircleBounds(CacheChart.this.roundingRect, rectF2.centerX() + (Math.cos(CacheChart.toRad(r2)) * d3), rectF2.centerY() + (d3 * Math.sin(CacheChart.toRad(r2))), fMin);
                this.path.arcTo(CacheChart.this.roundingRect, (f7 - fWidth3) + 90.0f, 90.0f);
            } else {
                f5 = f6;
            }
            this.path.arcTo(rectF2, f7 - fWidth3, -(f9 - (fWidth3 * 2.0f)));
            if (z) {
                double d4 = f4;
                CacheChart.setCircleBounds(CacheChart.this.roundingRect, rectF2.centerX() + (Math.cos(CacheChart.toRad(r4)) * d4), rectF2.centerY() + (d4 * Math.sin(CacheChart.toRad(r4))), fMin);
                this.path.arcTo(CacheChart.this.roundingRect, f5 + fWidth3 + 180.0f, 90.0f);
            }
            this.path.close();
            this.path.computeBounds(this.pathBounds, false);
        }

        private void setGradientBounds(float f, float f2, float f3, float f4) {
            this.gradientMatrix.reset();
            this.gradientMatrix.setTranslate(f, f2);
            this.gradient.setLocalMatrix(this.gradientMatrix);
        }

        private void drawParticles(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
            if (f10 <= 0.0f || !LiteMode.isEnabled(360928)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            float fSqrt = (float) Math.sqrt(2.0d);
            if (CacheChart.particlesStart < 0) {
                long unused = CacheChart.particlesStart = jCurrentTimeMillis;
            }
            float f11 = (jCurrentTimeMillis - CacheChart.particlesStart) / 10000.0f;
            Bitmap bitmap = this.particle;
            if (bitmap != null) {
                int width = bitmap.getWidth();
                float f12 = width;
                float fDpf2 = AndroidUtilities.dpf2(15.0f) / f12;
                float f13 = 7.0f;
                int iFloor = (int) Math.floor((f5 % 360.0f) / 7.0f);
                int iCeil = (int) Math.ceil((f6 % 360.0f) / 7.0f);
                while (iFloor <= iCeil) {
                    float fSin = (float) (((100.0f + f11) * (((Math.sin(2000.0f * r11) + 1.0d) * 0.25d) + 1.0d)) % 1.0d);
                    float f14 = f12 * fSqrt;
                    float f15 = f12;
                    int i = iCeil;
                    double dLerp = AndroidUtilities.lerp(f7 - f14, f8 + f14, fSin);
                    float fCos = (float) (f + (Math.cos(CacheChart.toRad(r11)) * dLerp));
                    float fSin2 = (float) (f2 + (dLerp * Math.sin(CacheChart.toRad(r11))));
                    this.particlePaint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, 0.65f * f10 * ((Math.abs(fSin - 0.5f) * (-1.75f)) + 1.0f) * ((((float) (Math.sin(fSin * 3.141592653589793d) - 1.0d)) * 0.25f) + 1.0f) * AndroidUtilities.lerp(1.0f, Math.min(MathUtils.distance(fCos, fSin2, f3, f4) / AndroidUtilities.dpf2(64.0f), 1.0f), f9))) * 255.0f));
                    float fSin3 = ((float) (((((float) (Math.sin(r12) - 1.0d)) * 0.25f) + 1.0f) * 0.75f * (((Math.sin(iFloor * f13) + 1.0d) * 0.25d) + 0.800000011920929d))) * fDpf2;
                    canvas.save();
                    canvas.translate(fCos, fSin2);
                    canvas.scale(fSin3, fSin3);
                    float f16 = -(width >> 1);
                    canvas.drawBitmap(this.particle, f16, f16, this.particlePaint);
                    canvas.restore();
                    iFloor++;
                    iCeil = i;
                    f11 = f11;
                    f12 = f15;
                    f13 = 7.0f;
                }
            }
        }

        void draw(Canvas canvas, RectF rectF, RectF rectF2, float f, float f2, float f3, float f4, float f5) {
            float f6;
            float f7;
            float f8 = this.selectedAnimated.set(this.selected ? 1.0f : 0.0f);
            this.rectF.set(rectF);
            this.rectF.inset((-AndroidUtilities.dp(9.0f)) * f8, f8 * (-AndroidUtilities.dp(9.0f)));
            float fCenterX = (float) (this.rectF.centerX() + ((Math.cos(CacheChart.toRad(f)) * (this.rectF.width() + rectF2.width())) / 4.0d));
            float fCenterY = (float) (this.rectF.centerY() + ((Math.sin(CacheChart.toRad(f)) * (this.rectF.width() + rectF2.width())) / 4.0d));
            float f9 = f5 * this.textAlphaAnimated.set(this.textAlpha) * f4;
            float f10 = this.particlesAlphaAnimated.set(this.particlesAlpha);
            this.paint.setAlpha((int) (f4 * 255.0f));
            if (f2 * 2.0f >= 359.0f) {
                canvas.saveLayerAlpha(this.rectF, 255, 31);
                canvas.drawCircle(this.rectF.centerX(), this.rectF.centerY(), this.rectF.width() / 2.0f, this.uncut);
                canvas.drawRect(this.rectF, this.paint);
                f6 = fCenterY;
                f7 = fCenterX;
                drawParticles(canvas, this.rectF.centerX(), this.rectF.centerY(), fCenterX, fCenterY, 0.0f, 359.0f, rectF2.width() / 2.0f, this.rectF.width() / 2.0f, f9, Math.max(0.0f, (f5 / 0.75f) - 0.75f) * f10);
                canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, this.cut);
                canvas.restore();
            } else {
                f6 = fCenterY;
                f7 = fCenterX;
                setupPath(this.rectF, rectF2, f, f2, f3);
                setGradientBounds(this.rectF.centerX(), rectF.centerY(), this.rectF.width() / 2.0f, f);
                canvas.saveLayerAlpha(this.rectF, 255, 31);
                canvas.drawPath(this.path, this.uncut);
                canvas.drawRect(this.rectF, this.paint);
                drawParticles(canvas, this.rectF.centerX(), this.rectF.centerY(), f7, f6, f - f2, f + f2, rectF2.width() / 2.0f, this.rectF.width() / 2.0f, f9, Math.max(0.0f, (f5 / 0.75f) - 0.75f) * f10);
                canvas.restore();
            }
            float f11 = this.textScaleAnimated.set(this.textScale);
            CacheChart.setCircleBounds(CacheChart.this.roundingRect, f7, f6, 0.0f);
            if (f11 != 1.0f) {
                canvas.save();
                canvas.scale(f11, f11, CacheChart.this.roundingRect.centerX(), CacheChart.this.roundingRect.centerY());
            }
            this.text.setAlpha((int) (f9 * 255.0f));
            this.text.setBounds((int) CacheChart.this.roundingRect.left, (int) CacheChart.this.roundingRect.top, (int) CacheChart.this.roundingRect.right, (int) CacheChart.this.roundingRect.bottom);
            this.text.draw(canvas);
            if (f11 != 1.0f) {
                canvas.restore();
            }
        }
    }

    public CacheChart(Context context) {
        this(context, 11, DEFAULT_COLORS, 0, DEFAULT_PARTICLES);
    }

    public CacheChart(Context context, int i, int[] iArr, int i2, int[] iArr2) {
        super(context);
        this.chartMeasureBounds = new RectF();
        this.chartBounds = new RectF();
        this.chartInnerBounds = new RectF();
        this.loading = true;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.loadingFloat = new AnimatedFloat(this, 750L, cubicBezierInterpolator);
        this.complete = false;
        this.completeFloat = new AnimatedFloat(this, 650L, cubicBezierInterpolator);
        this.segmentsTmp = new float[2];
        this.roundingRect = new RectF();
        this.loadingBackgroundPaint = new Paint(1);
        this.completePath = new Path();
        this.completePaintStroke = new Paint(1);
        this.completePaint = new Paint(1);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.topText = animatedTextDrawable;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.bottomText = animatedTextDrawable2;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.topCompleteText = animatedTextDrawable3;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable4 = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.bottomCompleteText = animatedTextDrawable4;
        this.interceptTouch = true;
        this.selectedIndex = -1;
        setLayerType(2, null);
        this.sectionsCount = i;
        this.colorKeys = iArr;
        this.particles = iArr2;
        this.type = i2;
        this.svgParticles = i2 == 0;
        this.sectors = new Sector[i];
        Paint paint = this.loadingBackgroundPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.loadingBackgroundPaint.setColor(Theme.getColor(Theme.key_listSelector));
        this.completePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.completeGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.completeTextGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.completeGradientMatrix = new Matrix();
        this.completeTextGradientMatrix = new Matrix();
        this.completePaintStroke.setShader(this.completeGradient);
        this.completePaint.setShader(this.completeGradient);
        this.completePaintStroke.setStyle(style);
        this.completePaintStroke.setStrokeCap(Paint.Cap.ROUND);
        this.completePaintStroke.setStrokeJoin(Paint.Join.ROUND);
        animatedTextDrawable.setAnimationProperties(0.2f, 0L, 450L, cubicBezierInterpolator);
        animatedTextDrawable.setScaleProperty(0.6f);
        animatedTextDrawable.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(32.0f));
        animatedTextDrawable.setGravity(17);
        animatedTextDrawable2.setAnimationProperties(0.6f, 0L, 450L, cubicBezierInterpolator);
        animatedTextDrawable2.setScaleProperty(0.6f);
        animatedTextDrawable2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
        animatedTextDrawable2.setTextSize(AndroidUtilities.dp(12.0f));
        animatedTextDrawable2.setGravity(17);
        animatedTextDrawable3.setAnimationProperties(0.2f, 0L, 450L, cubicBezierInterpolator);
        animatedTextDrawable3.setScaleProperty(0.6f);
        animatedTextDrawable3.getPaint().setShader(this.completeTextGradient);
        animatedTextDrawable3.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable3.setTextSize(AndroidUtilities.dp(32.0f));
        animatedTextDrawable3.setGravity(17);
        animatedTextDrawable4.setAnimationProperties(0.6f, 0L, 450L, cubicBezierInterpolator);
        animatedTextDrawable4.setScaleProperty(0.6f);
        animatedTextDrawable4.getPaint().setShader(this.completeTextGradient);
        animatedTextDrawable4.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable4.setTextSize(AndroidUtilities.dp(12.0f));
        animatedTextDrawable4.setGravity(17);
        int i3 = 0;
        while (true) {
            Sector[] sectorArr = this.sectors;
            if (i3 >= sectorArr.length) {
                return;
            }
            Sector sector = new Sector();
            sectorArr[i3] = sector;
            int iBlendOver = Theme.blendOver(Theme.getColor(iArr[i3]), 50331648);
            int iBlendOver2 = Theme.blendOver(Theme.getColor(iArr[i3]), 822083583);
            sector.gradientWidth = AndroidUtilities.dp(50.0f);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{iBlendOver2, iBlendOver}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
            sector.gradient = radialGradient;
            Matrix matrix = new Matrix();
            sector.gradientMatrix = matrix;
            radialGradient.setLocalMatrix(matrix);
            sector.paint.setShader(sector.gradient);
            i3++;
        }
    }

    public void setInterceptTouch(boolean z) {
        this.interceptTouch = z;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttached = true;
        int i = 0;
        while (true) {
            Sector[] sectorArr = this.sectors;
            if (i >= sectorArr.length) {
                return;
            }
            Sector sector = sectorArr[i];
            if (sector.particle == null) {
                if (this.svgParticles) {
                    sector.particle = SvgHelper.getBitmap(this.particles[i], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                } else {
                    sector.particle = BitmapFactory.decodeResource(getContext().getResources(), this.particles[i]);
                }
            }
            i++;
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.isAttached = false;
        while (true) {
            Sector[] sectorArr = this.sectors;
            if (i >= sectorArr.length) {
                return;
            }
            Bitmap bitmap = sectorArr[i].particle;
            if (bitmap != null) {
                bitmap.recycle();
                this.sectors[i].particle = null;
            }
            i++;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        float fDistance = MathUtils.distance(this.chartBounds.centerX(), this.chartBounds.centerY(), motionEvent.getX(), motionEvent.getY());
        float fAtan2 = (float) ((Math.atan2(r1 - this.chartBounds.centerY(), r0 - this.chartBounds.centerX()) / 3.141592653589793d) * 180.0d);
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        }
        if (fDistance > this.chartInnerBounds.width() / 2.0f && fDistance < (this.chartBounds.width() / 2.0f) + AndroidUtilities.dp(14.0f)) {
            i = 0;
            while (true) {
                Sector[] sectorArr = this.sectors;
                if (i >= sectorArr.length) {
                    break;
                }
                Sector sector = sectorArr[i];
                float f = sector.angleCenter;
                float f2 = sector.angleSize;
                if (fAtan2 >= f - f2 && fAtan2 <= f + f2) {
                    break;
                }
                i++;
            }
        } else {
            i = -1;
        }
        if (motionEvent.getAction() == 0) {
            setSelected(i);
            if (i >= 0) {
                onSectionDown(i, i != -1);
                if (getParent() != null && this.interceptTouch) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            return true;
        }
        if (motionEvent.getAction() == 2) {
            onSectionDown(i, i != -1);
            setSelected(i);
            if (i != -1) {
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (i != -1) {
                onSectionClick(i);
                z = true;
            } else {
                z = false;
            }
            setSelected(-1);
            onSectionDown(i, false);
            if (z) {
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            setSelected(-1);
            onSectionDown(i, false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setSelected(int i) {
        if (i == this.selectedIndex) {
            return;
        }
        int i2 = 0;
        while (true) {
            Sector[] sectorArr = this.sectors;
            if (i2 < sectorArr.length) {
                if (i == i2 && sectorArr[i2].angleSize <= 0.0f) {
                    i = -1;
                }
                sectorArr[i2].selected = i == i2;
                i2++;
            } else {
                this.selectedIndex = i;
                invalidate();
                return;
            }
        }
    }

    public static class SegmentSize {
        int index;
        public boolean selected;
        public long size;

        public static SegmentSize of(long j, boolean z) {
            SegmentSize segmentSize = new SegmentSize();
            segmentSize.size = j;
            segmentSize.selected = z;
            return segmentSize;
        }
    }

    public void setSegments(long j, boolean z, SegmentSize... segmentSizeArr) {
        int i;
        char c;
        String str;
        float f;
        float f2;
        int i2;
        int i3;
        int i4;
        SegmentSize[] segmentSizeArr2 = segmentSizeArr;
        if (segmentSizeArr2 == null || segmentSizeArr2.length == 0) {
            this.loading = false;
            this.complete = j == 0;
            if (!z) {
                this.loadingFloat.set(0.0f, true);
                this.completeFloat.set(this.complete ? 1.0f : 0.0f, true);
            }
            this.topCompleteText.setText(this.topText.getText(), false);
            this.topText.setText("0", z);
            this.topCompleteText.setText("0", z);
            this.bottomCompleteText.setText(this.bottomText.getText(), false);
            this.bottomText.setText("KB", z);
            this.bottomCompleteText.setText("KB", z);
            int i5 = 0;
            while (true) {
                Sector[] sectorArr = this.sectors;
                if (i5 < sectorArr.length) {
                    Sector sector = sectorArr[i5];
                    sector.textAlpha = 0.0f;
                    if (z) {
                        i = 1;
                    } else {
                        i = 1;
                        sector.textAlphaAnimated.set(0.0f, true);
                    }
                    i5 += i;
                } else {
                    invalidate();
                    return;
                }
            }
        } else {
            this.loading = false;
            if (!z) {
                this.loadingFloat.set(0.0f, true);
            }
            SpannableString spannableString = new SpannableString("%");
            int length = segmentSizeArr2.length;
            long j2 = 0;
            for (int i6 = 0; i6 < segmentSizeArr2.length; i6++) {
                if (segmentSizeArr2[i6] == null) {
                    SegmentSize segmentSize = new SegmentSize();
                    segmentSizeArr2[i6] = segmentSize;
                    segmentSize.size = 0L;
                }
                SegmentSize segmentSize2 = segmentSizeArr2[i6];
                segmentSize2.index = i6;
                boolean z2 = segmentSize2.selected;
                if (z2) {
                    j2 += segmentSize2.size;
                }
                if (segmentSize2.size <= 0 || !z2) {
                    length--;
                }
            }
            if (j2 <= 0) {
                this.loading = false;
                this.complete = j <= 0;
                if (!z) {
                    this.loadingFloat.set(0.0f, true);
                    this.completeFloat.set(this.complete ? 1.0f : 0.0f, true);
                }
                this.topCompleteText.setText(this.topText.getText(), false);
                this.topText.setText("0", z);
                this.topCompleteText.setText("0", z);
                this.bottomCompleteText.setText(this.bottomText.getText(), false);
                this.bottomText.setText("KB", z);
                this.bottomCompleteText.setText("KB", z);
                int i7 = 0;
                while (true) {
                    Sector[] sectorArr2 = this.sectors;
                    if (i7 < sectorArr2.length) {
                        Sector sector2 = sectorArr2[i7];
                        sector2.textAlpha = 0.0f;
                        if (z) {
                            i4 = 1;
                        } else {
                            i4 = 1;
                            sector2.textAlphaAnimated.set(0.0f, true);
                        }
                        i7 += i4;
                    } else {
                        invalidate();
                        return;
                    }
                }
            } else {
                float f3 = 0.0f;
                int i8 = 0;
                int i9 = 0;
                while (i8 < segmentSizeArr2.length) {
                    SegmentSize segmentSize3 = segmentSizeArr2[i8];
                    float f4 = (segmentSize3 == null || !segmentSize3.selected) ? 0.0f : segmentSize3.size / j2;
                    if (f4 <= 0.0f || f4 >= 0.02f) {
                        i3 = 1;
                    } else {
                        i3 = 1;
                        i9++;
                        f3 += f4;
                    }
                    i8 += i3;
                }
                Math.min(segmentSizeArr2.length, this.sectors.length);
                int[] iArr = this.tempPercents;
                if (iArr == null || iArr.length != segmentSizeArr2.length) {
                    this.tempPercents = new int[segmentSizeArr2.length];
                }
                float[] fArr = this.tempFloat;
                if (fArr == null || fArr.length != segmentSizeArr2.length) {
                    this.tempFloat = new float[segmentSizeArr2.length];
                }
                for (int i10 = 0; i10 < segmentSizeArr2.length; i10++) {
                    float[] fArr2 = this.tempFloat;
                    SegmentSize segmentSize4 = segmentSizeArr2[i10];
                    fArr2[i10] = (segmentSize4 == null || !segmentSize4.selected) ? 0.0f : segmentSize4.size / j2;
                }
                AndroidUtilities.roundPercents(this.tempFloat, this.tempPercents);
                if (this.type == 0) {
                    Arrays.sort(segmentSizeArr2, new Comparator() {
                        @Override
                        public final int compare(Object obj, Object obj2) {
                            return CacheChart.lambda$setSegments$0((CacheChart.SegmentSize) obj, (CacheChart.SegmentSize) obj2);
                        }
                    });
                    int i11 = 0;
                    while (true) {
                        if (i11 > segmentSizeArr2.length) {
                            break;
                        }
                        SegmentSize segmentSize5 = segmentSizeArr2[i11];
                        if (segmentSize5.index == segmentSizeArr2.length - 1) {
                            SegmentSize segmentSize6 = segmentSizeArr2[0];
                            segmentSizeArr2[0] = segmentSize5;
                            segmentSizeArr2[i11] = segmentSize6;
                            break;
                        }
                        i11++;
                    }
                }
                if (length < 2) {
                    length = 0;
                }
                float f5 = 360.0f - (length * 2.0f);
                float f6 = 0.0f;
                int i12 = 0;
                int i13 = 0;
                while (i12 < segmentSizeArr2.length) {
                    SegmentSize segmentSize7 = segmentSizeArr2[i12];
                    int i14 = segmentSize7.index;
                    if (segmentSize7.selected) {
                        f = f5;
                        f2 = segmentSize7.size / j2;
                    } else {
                        f = f5;
                        f2 = 0.0f;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    long j3 = j2;
                    spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.tempPercents[i14])));
                    spannableStringBuilder.append((CharSequence) spannableString);
                    Sector sector3 = this.sectors[i14];
                    float f7 = (((double) f2) <= 0.05d || f2 >= 1.0f) ? 0.0f : 1.0f;
                    sector3.textAlpha = f7;
                    sector3.textScale = (f2 < 0.08f || this.tempPercents[i14] >= 100) ? 0.85f : 1.0f;
                    sector3.particlesAlpha = 1.0f;
                    if (!z) {
                        sector3.textAlphaAnimated.set(f7, true);
                        Sector sector4 = this.sectors[i14];
                        sector4.textScaleAnimated.set(sector4.textScale, true);
                        Sector sector5 = this.sectors[i14];
                        sector5.particlesAlphaAnimated.set(sector5.particlesAlpha, true);
                    }
                    Sector sector6 = this.sectors[i14];
                    if (sector6.textAlpha > 0.0f) {
                        sector6.text.setText(spannableStringBuilder, z);
                    }
                    float f8 = (f2 >= 0.02f || f2 <= 0.0f) ? f2 * (1.0f - ((i9 * 0.02f) - f3)) : 0.02f;
                    float f9 = (f6 * f) + (i13 * 2.0f);
                    float f10 = (f8 * f) + f9;
                    if (f8 <= 0.0f) {
                        Sector sector7 = this.sectors[i14];
                        sector7.angleCenter = (f9 + f10) / 2.0f;
                        sector7.angleSize = Math.abs(f10 - f9) / 2.0f;
                        Sector sector8 = this.sectors[i14];
                        sector8.textAlpha = 0.0f;
                        if (!z) {
                            sector8.angleCenterAnimated.set(sector8.angleCenter, true);
                            Sector sector9 = this.sectors[i14];
                            sector9.angleSizeAnimated.set(sector9.angleSize, true);
                            Sector sector10 = this.sectors[i14];
                            sector10.textAlphaAnimated.set(sector10.textAlpha, true);
                        }
                        i2 = 1;
                    } else {
                        Sector sector11 = this.sectors[i14];
                        sector11.angleCenter = (f9 + f10) / 2.0f;
                        sector11.angleSize = Math.abs(f10 - f9) / 2.0f;
                        if (z) {
                            i2 = 1;
                        } else {
                            Sector sector12 = this.sectors[i14];
                            i2 = 1;
                            sector12.angleCenterAnimated.set(sector12.angleCenter, true);
                            Sector sector13 = this.sectors[i14];
                            sector13.angleSizeAnimated.set(sector13.angleSize, true);
                        }
                        f6 += f8;
                        i13 += i2;
                    }
                    i12 += i2;
                    segmentSizeArr2 = segmentSizeArr;
                    f5 = f;
                    j2 = j3;
                }
                long j4 = j2;
                String[] strArrSplit = AndroidUtilities.formatFileSize(j4, true, true).split(" ");
                if (strArrSplit.length > 0) {
                    c = 0;
                    str = strArrSplit[0];
                } else {
                    c = 0;
                    str = "";
                }
                if (str.length() >= 4 && j4 < 1073741824) {
                    str = str.split("\\.")[c];
                }
                this.topText.setText(str, z);
                this.bottomText.setText(strArrSplit.length > 1 ? strArrSplit[1] : "", z);
                if (this.completeFloat.get() > 0.0f) {
                    this.topCompleteText.setText(this.topText.getText(), z);
                    this.bottomCompleteText.setText(this.bottomText.getText(), z);
                }
                this.complete = false;
                if (!z) {
                    this.completeFloat.set(0.0f, true);
                }
                invalidate();
            }
        }
    }

    public static int lambda$setSegments$0(SegmentSize segmentSize, SegmentSize segmentSize2) {
        return Long.compare(segmentSize.size, segmentSize2.size);
    }

    public static void setCircleBounds(RectF rectF, float f, float f2, float f3) {
        rectF.set(f - f3, f2 - f3, f + f3, f2 + f3);
    }

    public static void setCircleBounds(RectF rectF, double d, double d2, float f) {
        setCircleBounds(rectF, (float) d, (float) d2, f);
    }

    @Override
    protected void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CacheChart.dispatchDraw(android.graphics.Canvas):void");
    }

    private boolean drawAnimatedText(Canvas canvas, AnimatedTextView.AnimatedTextDrawable animatedTextDrawable, float f, float f2, float f3, float f4) {
        if (f4 <= 0.0f) {
            return false;
        }
        animatedTextDrawable.setAlpha((int) (f4 * 255.0f));
        animatedTextDrawable.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        animatedTextDrawable.draw(canvas);
        canvas.restore();
        return animatedTextDrawable.isAnimating();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iDp = AndroidUtilities.dp(heightDp());
        int iDp2 = AndroidUtilities.dp(172.0f);
        this.chartMeasureBounds.set((size - iDp2) / 2.0f, (iDp - iDp2) / 2.0f, (size + iDp2) / 2.0f, (iDp2 + iDp) / 2.0f);
        this.completeGradientMatrix.reset();
        this.completeGradientMatrix.setTranslate(this.chartMeasureBounds.left, 0.0f);
        this.completeGradient.setLocalMatrix(this.completeGradientMatrix);
        this.completeTextGradientMatrix.reset();
        Matrix matrix = this.completeTextGradientMatrix;
        RectF rectF = this.chartMeasureBounds;
        matrix.setTranslate(rectF.left, -rectF.centerY());
        this.completeTextGradient.setLocalMatrix(this.completeTextGradientMatrix);
        StarParticlesView.Drawable drawable = this.completeDrawable;
        if (drawable != null) {
            drawable.rect.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.completeDrawable.rect.offset((getMeasuredWidth() - this.completeDrawable.rect.width()) / 2.0f, (getMeasuredHeight() - this.completeDrawable.rect.height()) / 2.0f);
            this.completeDrawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.completeDrawable.resetPositions();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
    }

    @Override
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }
}
