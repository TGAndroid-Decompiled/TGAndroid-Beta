package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import com.google.zxing.common.detector.MathUtils;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline1;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Components.Premium.StarParticlesView;

public abstract class CacheChart extends View {
    public static final int[] DEFAULT_COLORS;
    public static final int[] DEFAULT_PARTICLES;
    public static Long loadedStart;
    public static long particlesStart;
    public static Long start;
    public final AnimatedTextView.AnimatedTextDrawable bottomCompleteText;
    public final AnimatedTextView.AnimatedTextDrawable bottomText;
    public final RectF chartBounds;
    public final RectF chartInnerBounds;
    public final RectF chartMeasureBounds;
    public boolean complete;
    public StarParticlesView.Drawable completeDrawable;
    public final AnimatedFloat completeFloat;
    public final LinearGradient completeGradient;
    public final Matrix completeGradientMatrix;
    public final Paint completePaint;
    public final Paint completePaintStroke;
    public final Path completePath;
    public RectF completePathBounds;
    public final LinearGradient completeTextGradient;
    public final Matrix completeTextGradientMatrix;
    public boolean interceptTouch;
    public boolean isAttached;
    public boolean loading;
    public final Paint loadingBackgroundPaint;
    public final AnimatedFloat loadingFloat;
    public final int[] particles;
    public final RectF roundingRect;
    public final Sector[] sectors;
    public final float[] segmentsTmp;
    public int selectedIndex;
    public final boolean svgParticles;
    public float[] tempFloat;
    public int[] tempPercents;
    public final AnimatedTextView.AnimatedTextDrawable topCompleteText;
    public final AnimatedTextView.AnimatedTextDrawable topText;
    public final int type;

    public final class Sector {
        public float angleCenter;
        public final AnimatedFloat angleCenterAnimated;
        public float angleSize;
        public final AnimatedFloat angleSizeAnimated;
        public final Paint cut;
        public RadialGradient gradient;
        public Matrix gradientMatrix;
        public float lastAngleCenter;
        public float lastAngleSize;
        public float lastCx;
        public float lastCy;
        public float lastRounding;
        public float lastThickness;
        public float lastWidth;
        public final Paint paint;
        public Bitmap particle;
        public final Paint particlePaint;
        public float particlesAlpha;
        public final AnimatedFloat particlesAlphaAnimated;
        public final Path path;
        public final RectF pathBounds;
        public final RectF rectF;
        public boolean selected;
        public final AnimatedFloat selectedAnimated;
        public final AnimatedTextView.AnimatedTextDrawable text;
        public float textAlpha;
        public final AnimatedFloat textAlphaAnimated;
        public float textScale;
        public final AnimatedFloat textScaleAnimated;
        public final Paint uncut;

        public Sector() {
            Paint paint = new Paint(3);
            this.particlePaint = paint;
            paint.setColor(-1);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.angleCenterAnimated = new AnimatedFloat(650L, CacheChart.this, cubicBezierInterpolator);
            this.angleSizeAnimated = new AnimatedFloat(650L, CacheChart.this, cubicBezierInterpolator);
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT;
            this.textAlphaAnimated = new AnimatedFloat(CacheChart.this, 0L, 150L, cubicBezierInterpolator2);
            this.textScale = 1.0f;
            this.textScaleAnimated = new AnimatedFloat(CacheChart.this, 0L, 150L, cubicBezierInterpolator2);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
            this.text = animatedTextDrawable;
            this.particlesAlphaAnimated = new AnimatedFloat(CacheChart.this, 0L, 150L, cubicBezierInterpolator2);
            this.selectedAnimated = new AnimatedFloat(CacheChart.this, 0L, 200L, cubicBezierInterpolator);
            TextPaint textPaint = animatedTextDrawable.textPaint;
            textPaint.setColor(-1);
            animatedTextDrawable.alpha = Color.alpha(-1);
            animatedTextDrawable.moveAmplitude = 0.35f;
            animatedTextDrawable.animateDuration = 200L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            textPaint.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(15.0f));
            animatedTextDrawable.gravity = 17;
            this.path = new Path();
            Paint paint2 = new Paint(1);
            this.paint = paint2;
            this.pathBounds = new RectF();
            this.uncut = new Paint(1);
            Paint paint3 = new Paint(1);
            this.cut = paint3;
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            this.rectF = new RectF();
        }

        public final void drawParticles(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
            if (f10 <= 0.0f || !LiteMode.isEnabled(360928)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            float fSqrt = (float) Math.sqrt(2.0d);
            if (CacheChart.particlesStart < 0) {
                CacheChart.particlesStart = jCurrentTimeMillis;
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
                    float f14 = iFloor * f13;
                    float fSin = (float) (((((Math.sin(2000.0f * f14) + 1.0d) * 0.25d) + 1.0d) * ((double) (100.0f + f11))) % 1.0d);
                    float f15 = f12 * fSqrt;
                    float f16 = f11;
                    double dLerp = AndroidUtilities.lerp(f7 - f15, f8 + f15, fSin);
                    float fM = (float) AndroidUtilities$$ExternalSyntheticOutline1.m(CacheChart.access$100(f14), dLerp, f);
                    int i = width;
                    float fSin2 = (float) ((Math.sin(CacheChart.access$100(f14)) * dLerp) + ((double) f2));
                    float fAbs = (Math.abs(fSin - 0.5f) * (-1.75f)) + 1.0f;
                    double d = ((double) fSin) * 3.141592653589793d;
                    float fMax = Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(MathUtils.distance(fM, fSin2, f3, f4) / AndroidUtilities.dpf2(64.0f), 1.0f), f9) * AndroidUtilities$$ExternalSyntheticOutline0.m((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, fAbs * 0.65f * f10)));
                    Paint paint = this.particlePaint;
                    paint.setAlpha((int) (fMax * 255.0f));
                    float f17 = fDpf2;
                    float fSin3 = f17 * ((float) ((((Math.sin(f14) + 1.0d) * 0.25d) + 0.800000011920929d) * ((double) AndroidUtilities$$ExternalSyntheticOutline0.m((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f))));
                    canvas.save();
                    canvas.translate(fM, fSin2);
                    canvas.scale(fSin3, fSin3);
                    float f18 = -(i >> 1);
                    canvas.drawBitmap(this.particle, f18, f18, paint);
                    canvas.restore();
                    iFloor++;
                    fSqrt = fSqrt;
                    width = i;
                    f12 = f12;
                    fDpf2 = f17;
                    f11 = f16;
                    f13 = 7.0f;
                }
            }
        }
    }

    public class SegmentSize {
        public int index;
        public boolean selected;
        public long size;
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

    public CacheChart(Context context, int i, int[] iArr, int i2, int[] iArr2) {
        super(context);
        this.chartMeasureBounds = new RectF();
        this.chartBounds = new RectF();
        this.chartInnerBounds = new RectF();
        this.loading = true;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.loadingFloat = new AnimatedFloat(750L, this, cubicBezierInterpolator);
        this.complete = false;
        this.completeFloat = new AnimatedFloat(650L, this, cubicBezierInterpolator);
        this.segmentsTmp = new float[2];
        this.roundingRect = new RectF();
        Paint paint = new Paint(1);
        this.loadingBackgroundPaint = paint;
        this.completePath = new Path();
        Paint paint2 = new Paint(1);
        this.completePaintStroke = paint2;
        Paint paint3 = new Paint(1);
        this.completePaint = paint3;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.topText = animatedTextDrawable;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.bottomText = animatedTextDrawable2;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.topCompleteText = animatedTextDrawable3;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable4 = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.bottomCompleteText = animatedTextDrawable4;
        this.interceptTouch = true;
        this.selectedIndex = -1;
        setLayerType(2, null);
        this.particles = iArr2;
        this.type = i2;
        this.svgParticles = i2 == 0;
        this.sectors = new Sector[i];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(Theme.getColor(null, Theme.key_listSelector, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.completeGradient = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.completeTextGradient = linearGradient2;
        this.completeGradientMatrix = new Matrix();
        this.completeTextGradientMatrix = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        animatedTextDrawable.moveAmplitude = 0.2f;
        animatedTextDrawable.animateDuration = 450L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.scaleAmplitude = 0.6f;
        int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false);
        TextPaint textPaint = animatedTextDrawable.textPaint;
        textPaint.setColor(color);
        animatedTextDrawable.alpha = Color.alpha(color);
        textPaint.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(32.0f));
        animatedTextDrawable.gravity = 17;
        animatedTextDrawable2.moveAmplitude = 0.6f;
        animatedTextDrawable2.animateDuration = 450L;
        animatedTextDrawable2.animateWave = 1.0f;
        animatedTextDrawable2.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable2.scaleAmplitude = 0.6f;
        int color2 = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false);
        animatedTextDrawable2.textPaint.setColor(color2);
        animatedTextDrawable2.alpha = Color.alpha(color2);
        animatedTextDrawable2.setTextSize(AndroidUtilities.dp(12.0f));
        animatedTextDrawable2.gravity = 17;
        animatedTextDrawable3.moveAmplitude = 0.2f;
        animatedTextDrawable3.animateDuration = 450L;
        animatedTextDrawable3.animateWave = 1.0f;
        animatedTextDrawable3.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable3.scaleAmplitude = 0.6f;
        TextPaint textPaint2 = animatedTextDrawable3.textPaint;
        textPaint2.setShader(linearGradient2);
        textPaint2.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable3.setTextSize(AndroidUtilities.dp(32.0f));
        animatedTextDrawable3.gravity = 17;
        animatedTextDrawable4.moveAmplitude = 0.6f;
        animatedTextDrawable4.animateDuration = 450L;
        animatedTextDrawable4.animateWave = 1.0f;
        animatedTextDrawable4.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable4.scaleAmplitude = 0.6f;
        TextPaint textPaint3 = animatedTextDrawable4.textPaint;
        textPaint3.setShader(linearGradient2);
        textPaint3.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable4.setTextSize(AndroidUtilities.dp(12.0f));
        animatedTextDrawable4.gravity = 17;
        int i3 = 0;
        while (true) {
            Sector[] sectorArr = this.sectors;
            if (i3 >= sectorArr.length) {
                return;
            }
            Sector sector = new Sector();
            sectorArr[i3] = sector;
            int iBlendOver = Theme.blendOver(Theme.getColor(null, iArr[i3], false), 50331648);
            int iBlendOver2 = Theme.blendOver(Theme.getColor(null, iArr[i3], false), 822083583);
            AndroidUtilities.dp(50.0f);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{iBlendOver2, iBlendOver}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
            sector.gradient = radialGradient;
            Matrix matrix = new Matrix();
            sector.gradientMatrix = matrix;
            radialGradient.setLocalMatrix(matrix);
            sector.paint.setShader(sector.gradient);
            i3++;
        }
    }

    public static float access$100(float f) {
        return (float) (((double) (f / 180.0f)) * 3.141592653589793d);
    }

    public static boolean drawAnimatedText(Canvas canvas, AnimatedTextView.AnimatedTextDrawable animatedTextDrawable, float f, float f2, float f3, float f4) {
        if (f4 <= 0.0f) {
            return false;
        }
        animatedTextDrawable.alpha = (int) (f4 * 255.0f);
        animatedTextDrawable.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        animatedTextDrawable.draw(canvas);
        canvas.restore();
        return animatedTextDrawable.isAnimating();
    }

    public static void setCircleBounds(RectF rectF, float f, float f2, float f3) {
        rectF.set(f - f3, f2 - f3, f + f3, f2 + f3);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        char c;
        float f;
        float f2;
        char c2;
        boolean z;
        Paint paint;
        RectF rectF;
        Path path;
        float f3;
        RectF rectF2;
        float f4;
        RectF rectF3;
        float[] fArr;
        float f5;
        int i;
        float f6;
        CacheChart cacheChart;
        float f7;
        float f8;
        Sector sector;
        CacheChart cacheChart2 = this;
        Canvas canvas2 = canvas;
        float f9 = cacheChart2.loadingFloat.set(cacheChart2.loading ? 1.0f : 0.0f, false);
        float f10 = cacheChart2.completeFloat.set(cacheChart2.complete ? 1.0f : 0.0f, false);
        RectF rectF4 = cacheChart2.chartBounds;
        RectF rectF5 = cacheChart2.chartMeasureBounds;
        rectF4.set(rectF5);
        float fLerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(cacheChart2.padInsideDp()), f10);
        rectF4.inset(fLerp, fLerp);
        RectF rectF6 = cacheChart2.chartInnerBounds;
        rectF6.set(rectF4);
        float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dpf2(38.0f), AndroidUtilities.dpf2(10.0f), Math.max(f9, f10));
        rectF6.inset(fLerp2, fLerp2);
        float fLerp3 = AndroidUtilities.lerp(0, AndroidUtilities.dp(60.0f), f9);
        if (start == null) {
            start = Long.valueOf(System.currentTimeMillis());
        }
        boolean z2 = cacheChart2.loading;
        if (!z2 && loadedStart == null) {
            loadedStart = Long.valueOf(System.currentTimeMillis());
        } else if (z2 && loadedStart != null) {
            loadedStart = null;
        }
        Long l = loadedStart;
        float fCurrentTimeMillis = ((l == null ? System.currentTimeMillis() : l.longValue()) - start.longValue()) * 0.6f;
        float[] fArr2 = cacheChart2.segmentsTmp;
        CircularProgressDrawable.getSegments(fArr2, fCurrentTimeMillis % 5400.0f);
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        if (f9 > 0.0f) {
            c = 1;
            Paint paint2 = cacheChart2.loadingBackgroundPaint;
            paint2.setStrokeWidth(fLerp2);
            f = 1.0f;
            int alpha = paint2.getAlpha();
            f2 = 0.0f;
            paint2.setAlpha((int) (alpha * f9));
            c2 = 0;
            canvas2.drawCircle(rectF4.centerX(), rectF4.centerY(), (rectF4.width() - fLerp2) / 2.0f, paint2);
            paint2.setAlpha(alpha);
        } else {
            c = 1;
            f = 1.0f;
            f2 = 0.0f;
            c2 = 0;
        }
        boolean z3 = f9 > 0.0f || f10 > f2;
        int i2 = 0;
        while (true) {
            Sector[] sectorArr = cacheChart2.sectors;
            if (i2 >= sectorArr.length) {
                break;
            }
            Sector sector2 = sectorArr[i2];
            CircularProgressDrawable.getSegments(fArr2, (fCurrentTimeMillis + (i2 * 80)) % 5400.0f);
            float fMin = Math.min(Math.max(fArr2[c2], f11), f12);
            float fMin2 = Math.min(Math.max(fArr2[c], f11), f12);
            if (f9 < f || fMin < fMin2) {
                float fLerp4 = (fMin + fMin2) / 2.0f;
                float fAbs = Math.abs(fMin2 - fMin) / 2.0f;
                if (f9 <= f2) {
                    f3 = 360.0f;
                    float f13 = sector2.angleCenterAnimated.set(sector2.angleCenter, false);
                    fAbs = sector2.angleSizeAnimated.set(sector2.angleSize, false);
                    rectF2 = rectF6;
                    fLerp4 = f13;
                } else {
                    f3 = 360.0f;
                    rectF2 = rectF6;
                    if (f9 < f) {
                        fLerp4 = AndroidUtilities.lerp((((float) Math.floor(f12 / 360.0f)) * 360.0f) + sector2.angleCenterAnimated.set(sector2.angleCenter, false), fLerp4, f9);
                        fAbs = AndroidUtilities.lerp(sector2.angleSizeAnimated.set(sector2.angleSize, false), fAbs, f9);
                    }
                }
                boolean z4 = sector2.angleCenterAnimated.transition || sector2.angleSizeAnimated.transition || z3;
                float f14 = f - f10;
                float f15 = f - f9;
                float f16 = sector2.selectedAnimated.set(sector2.selected ? 1.0f : 0.0f, false);
                RectF rectF7 = sector2.rectF;
                rectF7.set(rectF4);
                rectF7.inset((-AndroidUtilities.dp(9.0f)) * f16, (-AndroidUtilities.dp(9.0f)) * f16);
                f4 = fLerp3;
                float fWidth = (float) (((((double) (rectF2.width() + rectF7.width())) * Math.cos(access$100(fLerp4))) / 4.0d) + ((double) rectF7.centerX()));
                float fWidth2 = (float) (((((double) (rectF2.width() + rectF7.width())) * Math.sin(access$100(fLerp4))) / 4.0d) + ((double) rectF7.centerY()));
                float f17 = sector2.textAlphaAnimated.set(sector2.textAlpha, false) * f14 * f15;
                rectF3 = rectF4;
                float f18 = sector2.particlesAlphaAnimated.set(sector2.particlesAlpha, false);
                Paint paint3 = sector2.paint;
                paint3.setAlpha((int) (f14 * 255.0f));
                float f19 = fAbs * 2.0f;
                Paint paint4 = sector2.uncut;
                CacheChart cacheChart3 = CacheChart.this;
                if (f19 >= 359.0f) {
                    canvas2.saveLayerAlpha(rectF7, 255, 31);
                    canvas2.drawCircle(rectF7.centerX(), rectF7.centerY(), rectF7.width() / 2.0f, paint4);
                    canvas2.drawRect(rectF7, paint3);
                    fArr = fArr2;
                    Canvas canvas3 = canvas2;
                    sector2.drawParticles(canvas3, rectF7.centerX(), rectF7.centerY(), fWidth, fWidth2, 0.0f, 359.0f, rectF2.width() / 2.0f, rectF7.width() / 2.0f, f17, Math.max(0.0f, (f15 / 0.75f) - 0.75f) * f18);
                    sector = sector2;
                    canvas2 = canvas3;
                    canvas2.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, sector.cut);
                    canvas2.restore();
                    f8 = fWidth;
                    f7 = fWidth2;
                    i = i2;
                    cacheChart = cacheChart3;
                    z4 = z4;
                } else {
                    RectF rectF8 = rectF2;
                    fArr = fArr2;
                    float fMin3 = Math.min(Math.min(f4, (rectF7.width() - rectF8.width()) / 4.0f), (float) (((double) (rectF8.width() / 2.0f)) * ((double) (fAbs / 180.0f)) * 3.141592653589793d));
                    float fWidth3 = (rectF7.width() - rectF8.width()) / 2.0f;
                    float f20 = sector2.lastAngleCenter;
                    Path path2 = sector2.path;
                    if (f20 == fLerp4 && sector2.lastAngleSize == fAbs && sector2.lastRounding == fMin3 && sector2.lastThickness == fWidth3 && sector2.lastWidth == rectF7.width() && sector2.lastCx == rectF7.centerX() && sector2.lastCy == rectF7.centerY()) {
                        f5 = fLerp4;
                        i = i2;
                        f6 = fAbs;
                    } else {
                        sector2.lastAngleCenter = fLerp4;
                        sector2.lastAngleSize = fAbs;
                        sector2.lastRounding = fMin3;
                        sector2.lastThickness = fWidth3;
                        sector2.lastWidth = rectF7.width();
                        sector2.lastCx = rectF7.centerX();
                        sector2.lastCy = rectF7.centerY();
                        float f21 = fLerp4 - fAbs;
                        float f22 = fLerp4 + fAbs;
                        boolean z5 = fMin3 > 0.0f;
                        float f23 = fMin3 * 2.0f;
                        f5 = fLerp4;
                        i = i2;
                        f6 = fAbs;
                        float fWidth4 = (fMin3 / ((float) (((double) (rectF7.width() - f23)) * 3.141592653589793d))) * f3;
                        float fWidth5 = ((f6 > 175.0f ? 0 : 1) * 0.5f) + ((fMin3 / ((float) (((double) (rectF8.width() + f23)) * 3.141592653589793d))) * f3);
                        float fWidth6 = (rectF7.width() / 2.0f) - fMin3;
                        float fWidth7 = (rectF8.width() / 2.0f) + fMin3;
                        path2.rewind();
                        float f24 = f22 - f21;
                        if (f24 >= 0.5f) {
                            if (z5) {
                                double d = fWidth6;
                                float f25 = f21 + fWidth4;
                                setCircleBounds(cacheChart3.roundingRect, (float) AndroidUtilities$$ExternalSyntheticOutline1.m(access$100(f25), d, rectF7.centerX()), (float) ((Math.sin(access$100(f25)) * d) + ((double) rectF7.centerY())), fMin3);
                                path2.arcTo(cacheChart3.roundingRect, f25 - 90.0f, 90.0f);
                            }
                            path2.arcTo(rectF7, f21 + fWidth4, f24 - (fWidth4 * 2.0f));
                            if (z5) {
                                double d2 = fWidth6;
                                float f26 = f22 - fWidth4;
                                setCircleBounds(cacheChart3.roundingRect, (float) AndroidUtilities$$ExternalSyntheticOutline1.m(access$100(f26), d2, rectF7.centerX()), (float) ((Math.sin(access$100(f26)) * d2) + ((double) rectF7.centerY())), fMin3);
                                RectF rectF9 = cacheChart3.roundingRect;
                                path2.arcTo(rectF9, f26, 90.0f);
                                double d3 = fWidth7;
                                float f27 = f22 - fWidth5;
                                setCircleBounds(rectF9, (float) AndroidUtilities$$ExternalSyntheticOutline1.m(access$100(f27), d3, rectF8.centerX()), (float) ((Math.sin(access$100(f27)) * d3) + ((double) rectF8.centerY())), fMin3);
                                path2.arcTo(rectF9, f27 + 90.0f, 90.0f);
                            }
                            path2.arcTo(rectF8, f22 - fWidth5, -(f24 - (fWidth5 * 2.0f)));
                            if (z5) {
                                double d4 = fWidth7;
                                float f28 = f21 + fWidth5;
                                setCircleBounds(cacheChart3.roundingRect, (float) AndroidUtilities$$ExternalSyntheticOutline1.m(access$100(f28), d4, rectF8.centerX()), (float) ((Math.sin(access$100(f28)) * d4) + ((double) rectF8.centerY())), fMin3);
                                path2.arcTo(cacheChart3.roundingRect, f28 + 180.0f, 90.0f);
                            }
                            path2.close();
                            path2.computeBounds(sector2.pathBounds, false);
                        }
                        float fCenterX = rectF7.centerX();
                        float fCenterY = rectF3.centerY();
                        rectF7.width();
                        sector2.gradientMatrix.reset();
                        sector2.gradientMatrix.setTranslate(fCenterX, fCenterY);
                        sector2.gradient.setLocalMatrix(sector2.gradientMatrix);
                        canvas.saveLayerAlpha(rectF7, 255, 31);
                        canvas.drawPath(path2, paint4);
                        canvas.drawRect(rectF7, paint3);
                        cacheChart = cacheChart3;
                        f7 = fWidth2;
                        f8 = fWidth;
                        f4 = f4;
                        rectF2 = rectF8;
                        sector2.drawParticles(canvas, rectF7.centerX(), rectF7.centerY(), f8, f7, f5 - f6, f5 + f6, rectF8.width() / 2.0f, rectF7.width() / 2.0f, f17, Math.max(0.0f, (f15 / 0.75f) - 0.75f) * f18);
                        sector = sector2;
                        canvas2 = canvas;
                        canvas2.restore();
                    }
                    z4 = z4;
                    rectF8 = rectF8;
                    float fCenterX2 = rectF7.centerX();
                    float fCenterY2 = rectF3.centerY();
                    rectF7.width();
                    sector2.gradientMatrix.reset();
                    sector2.gradientMatrix.setTranslate(fCenterX2, fCenterY2);
                    sector2.gradient.setLocalMatrix(sector2.gradientMatrix);
                    canvas.saveLayerAlpha(rectF7, 255, 31);
                    canvas.drawPath(path2, paint4);
                    canvas.drawRect(rectF7, paint3);
                    cacheChart = cacheChart3;
                    f7 = fWidth2;
                    f8 = fWidth;
                    f4 = f4;
                    rectF2 = rectF8;
                    sector2.drawParticles(canvas, rectF7.centerX(), rectF7.centerY(), f8, f7, f5 - f6, f5 + f6, rectF8.width() / 2.0f, rectF7.width() / 2.0f, f17, Math.max(0.0f, (f15 / 0.75f) - 0.75f) * f18);
                    sector = sector2;
                    canvas2 = canvas;
                    canvas2.restore();
                }
                float f29 = sector.textScaleAnimated.set(sector.textScale, false);
                setCircleBounds(cacheChart.roundingRect, f8, f7, 0.0f);
                RectF rectF10 = cacheChart.roundingRect;
                if (f29 != f) {
                    canvas2.save();
                    canvas2.scale(f29, f29, rectF10.centerX(), rectF10.centerY());
                }
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = sector.text;
                animatedTextDrawable.alpha = (int) (f17 * 255.0f);
                animatedTextDrawable.setBounds((int) rectF10.left, (int) rectF10.top, (int) rectF10.right, (int) rectF10.bottom);
                animatedTextDrawable.draw(canvas2);
                if (f29 != f) {
                    canvas2.restore();
                }
                z3 = z4;
            } else {
                rectF3 = rectF4;
                rectF2 = rectF6;
                fLerp2 = fLerp2;
                f4 = fLerp3;
                f11 = f11;
                fArr = fArr2;
                f12 = f12;
                i = i2;
                f10 = f10;
            }
            i2 = i + 1;
            c = 1;
            f2 = 0.0f;
            c2 = 0;
            f10 = f10;
            rectF4 = rectF3;
            rectF5 = rectF5;
            rectF6 = rectF2;
            f9 = f9;
            fLerp3 = f4;
            fArr2 = fArr;
            f11 = f11;
            f12 = f12;
            fLerp2 = fLerp2;
            cacheChart2 = this;
        }
        CacheChart cacheChart4 = cacheChart2;
        float f30 = f9;
        RectF rectF11 = rectF4;
        RectF rectF12 = rectF5;
        float f31 = fLerp2;
        float f32 = f10;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = cacheChart4.bottomText;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = cacheChart4.topText;
        int i3 = cacheChart4.type;
        if (i3 == 0) {
            float f33 = (f - f32) * (f - f30);
            drawAnimatedText(canvas2, animatedTextDrawable3, rectF11.centerX(), rectF11.centerY() - AndroidUtilities.dpf2(5.0f), 1.0f, f33);
            drawAnimatedText(canvas, animatedTextDrawable2, rectF11.centerX(), AndroidUtilities.dpf2(22.0f) + rectF11.centerY(), 1.0f, f33);
            z = true;
        } else {
            z = true;
            if (i3 == 1) {
                float f34 = f - f30;
                float fCenterX3 = rectF11.centerX() - AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(4.0f), f32);
                float fCenterY3 = rectF11.centerY() - AndroidUtilities.lerp(AndroidUtilities.dpf2(5.0f), 0.0f, f32);
                float fLerp5 = AndroidUtilities.lerp(1.0f, 2.25f, f32);
                float f35 = f34 * f32;
                boolean z6 = drawAnimatedText(canvas, cacheChart4.topCompleteText, fCenterX3, fCenterY3, fLerp5, f35) || z3;
                float f36 = (1.0f - f32) * f34;
                if (drawAnimatedText(canvas, animatedTextDrawable3, fCenterX3, fCenterY3, fLerp5, f36) || z6) {
                }
                float fLerp6 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(26.0f), f32) + rectF11.centerX();
                float fLerp7 = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), -AndroidUtilities.dpf2(18.0f), f32) + rectF11.centerY();
                float fLerp8 = AndroidUtilities.lerp(1.0f, 1.4f, f32);
                drawAnimatedText(canvas, cacheChart4.bottomCompleteText, fLerp6, fLerp7, fLerp8, f35);
                drawAnimatedText(canvas, animatedTextDrawable2, fLerp6, fLerp7, fLerp8, f36);
            }
        }
        if (f32 > 0.0f) {
            if (cacheChart4.completeDrawable == null) {
                StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(25);
                cacheChart4.completeDrawable = drawable;
                drawable.type = 100;
                drawable.roundEffect = z;
                drawable.useRotate = z;
                drawable.useBlur = false;
                drawable.checkBounds = z;
                drawable.size1 = 18;
                drawable.distributionAlgorithm = false;
                drawable.excludeRadius = AndroidUtilities.dp(80.0f);
                StarParticlesView.Drawable drawable2 = cacheChart4.completeDrawable;
                drawable2.k3 = 0.85f;
                drawable2.k2 = 0.85f;
                drawable2.k1 = 0.85f;
                drawable2.init();
            } else {
                RectF rectF13 = cacheChart4.completePathBounds;
                if (rectF13 == null || !rectF13.equals(rectF12)) {
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, cacheChart4.getWidth(), cacheChart4.getHeight(), 255, 31);
                cacheChart4.completeDrawable.onDraw(canvas, f32);
                Paint paint5 = cacheChart4.completePaint;
                int i4 = (int) (f32 * 255.0f);
                paint5.setAlpha(i4);
                canvas.drawRect(0.0f, 0.0f, cacheChart4.getWidth(), cacheChart4.getHeight(), paint5);
                canvas.restore();
                paint = cacheChart4.completePaintStroke;
                paint.setStrokeWidth(f31);
                paint.setAlpha(i4);
                canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), (rectF11.width() - f31) / 2.0f, paint);
                rectF = cacheChart4.completePathBounds;
                path = cacheChart4.completePath;
                if (rectF != null || !rectF.equals(rectF12)) {
                    if (cacheChart4.completePathBounds == null) {
                        cacheChart4.completePathBounds = new RectF();
                    }
                    cacheChart4.completePathBounds.set(rectF12);
                    path.rewind();
                    if (i3 == 0) {
                        path.moveTo(rectF11.width() * 0.348f, rectF11.height() * 0.538f);
                        path.lineTo(rectF11.width() * 0.447f, rectF11.height() * 0.636f);
                        path.lineTo(rectF11.width() * 0.678f, rectF11.height() * 0.402f);
                    } else if (i3 == z) {
                        path.moveTo(rectF11.width() * 0.2929f, rectF11.height() * 0.4369f);
                        path.lineTo(rectF11.width() * 0.381f, rectF11.height() * 0.35f);
                        path.lineTo(rectF11.width() * 0.4691f, rectF11.height() * 0.4369f);
                        path.moveTo(rectF11.width() * 0.381f, rectF11.height() * 0.35f);
                        path.lineTo(rectF11.width() * 0.381f, rectF11.height() * 0.6548f);
                        path.moveTo(rectF11.width() * 0.5214f, rectF11.height() * 0.5821f);
                        path.lineTo(rectF11.width() * 0.6095f, rectF11.height() * 0.669f);
                        path.lineTo(rectF11.width() * 0.6976f, rectF11.height() * 0.5821f);
                        path.moveTo(rectF11.width() * 0.6095f, rectF11.height() * 0.669f);
                        path.lineTo(rectF11.width() * 0.6095f, rectF11.height() * 0.3643f);
                    }
                    path.offset(rectF11.left, rectF11.top);
                }
                if (i3 == 0) {
                    paint.setStrokeWidth(AndroidUtilities.dpf2(10.0f));
                    canvas.drawPath(path, paint);
                }
            }
            float fMin4 = Math.min(cacheChart4.getMeasuredHeight(), Math.min(cacheChart4.getMeasuredWidth(), AndroidUtilities.dp(150.0f)));
            cacheChart4.completeDrawable.rect.set(0.0f, 0.0f, fMin4, fMin4);
            cacheChart4.completeDrawable.rect.offset((cacheChart4.getMeasuredWidth() - cacheChart4.completeDrawable.rect.width()) / 2.0f, (cacheChart4.getMeasuredHeight() - cacheChart4.completeDrawable.rect.height()) / 2.0f);
            cacheChart4.completeDrawable.rect2.set(0.0f, 0.0f, cacheChart4.getMeasuredWidth(), cacheChart4.getMeasuredHeight());
            cacheChart4.completeDrawable.resetPositions();
            canvas.saveLayerAlpha(0.0f, 0.0f, cacheChart4.getWidth(), cacheChart4.getHeight(), 255, 31);
            cacheChart4.completeDrawable.onDraw(canvas, f32);
            Paint paint6 = cacheChart4.completePaint;
            int i5 = (int) (f32 * 255.0f);
            paint6.setAlpha(i5);
            canvas.drawRect(0.0f, 0.0f, cacheChart4.getWidth(), cacheChart4.getHeight(), paint6);
            canvas.restore();
            paint = cacheChart4.completePaintStroke;
            paint.setStrokeWidth(f31);
            paint.setAlpha(i5);
            canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), (rectF11.width() - f31) / 2.0f, paint);
            rectF = cacheChart4.completePathBounds;
            path = cacheChart4.completePath;
            if (rectF != null) {
                if (cacheChart4.completePathBounds == null) {
                    cacheChart4.completePathBounds = new RectF();
                }
                cacheChart4.completePathBounds.set(rectF12);
                path.rewind();
                if (i3 == 0) {
                    path.moveTo(rectF11.width() * 0.348f, rectF11.height() * 0.538f);
                    path.lineTo(rectF11.width() * 0.447f, rectF11.height() * 0.636f);
                    path.lineTo(rectF11.width() * 0.678f, rectF11.height() * 0.402f);
                } else if (i3 == z) {
                    path.moveTo(rectF11.width() * 0.2929f, rectF11.height() * 0.4369f);
                    path.lineTo(rectF11.width() * 0.381f, rectF11.height() * 0.35f);
                    path.lineTo(rectF11.width() * 0.4691f, rectF11.height() * 0.4369f);
                    path.moveTo(rectF11.width() * 0.381f, rectF11.height() * 0.35f);
                    path.lineTo(rectF11.width() * 0.381f, rectF11.height() * 0.6548f);
                    path.moveTo(rectF11.width() * 0.5214f, rectF11.height() * 0.5821f);
                    path.lineTo(rectF11.width() * 0.6095f, rectF11.height() * 0.669f);
                    path.lineTo(rectF11.width() * 0.6976f, rectF11.height() * 0.5821f);
                    path.moveTo(rectF11.width() * 0.6095f, rectF11.height() * 0.669f);
                    path.lineTo(rectF11.width() * 0.6095f, rectF11.height() * 0.3643f);
                }
                path.offset(rectF11.left, rectF11.top);
            } else {
                if (cacheChart4.completePathBounds == null) {
                    cacheChart4.completePathBounds = new RectF();
                }
                cacheChart4.completePathBounds.set(rectF12);
                path.rewind();
                if (i3 == 0) {
                    path.moveTo(rectF11.width() * 0.348f, rectF11.height() * 0.538f);
                    path.lineTo(rectF11.width() * 0.447f, rectF11.height() * 0.636f);
                    path.lineTo(rectF11.width() * 0.678f, rectF11.height() * 0.402f);
                } else if (i3 == z) {
                    path.moveTo(rectF11.width() * 0.2929f, rectF11.height() * 0.4369f);
                    path.lineTo(rectF11.width() * 0.381f, rectF11.height() * 0.35f);
                    path.lineTo(rectF11.width() * 0.4691f, rectF11.height() * 0.4369f);
                    path.moveTo(rectF11.width() * 0.381f, rectF11.height() * 0.35f);
                    path.lineTo(rectF11.width() * 0.381f, rectF11.height() * 0.6548f);
                    path.moveTo(rectF11.width() * 0.5214f, rectF11.height() * 0.5821f);
                    path.lineTo(rectF11.width() * 0.6095f, rectF11.height() * 0.669f);
                    path.lineTo(rectF11.width() * 0.6976f, rectF11.height() * 0.5821f);
                    path.moveTo(rectF11.width() * 0.6095f, rectF11.height() * 0.669f);
                    path.lineTo(rectF11.width() * 0.6095f, rectF11.height() * 0.3643f);
                }
                path.offset(rectF11.left, rectF11.top);
            }
            if (i3 == 0) {
                paint.setStrokeWidth(AndroidUtilities.dpf2(10.0f));
                canvas.drawPath(path, paint);
            }
        }
        if (cacheChart4.isAttached) {
            cacheChart4.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RectF rectF = this.chartBounds;
        float fDistance = MathUtils.distance(rectF.centerX(), rectF.centerY(), x, y);
        float fAtan2 = (float) ((Math.atan2(y - rectF.centerY(), x - rectF.centerX()) / 3.141592653589793d) * 180.0d);
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        }
        if (fDistance > this.chartInnerBounds.width() / 2.0f && fDistance < (rectF.width() / 2.0f) + AndroidUtilities.dp(14.0f)) {
            i = 0;
            while (true) {
                Sector[] sectorArr = this.sectors;
                if (i >= sectorArr.length) {
                    i = -1;
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
            break;
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
            boolean z = i != -1;
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

    public int heightDp() {
        return 200;
    }

    @Override
    public final void onAttachedToWindow() {
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
                boolean z = this.svgParticles;
                int[] iArr = this.particles;
                if (z) {
                    sector.particle = SvgHelper.getBitmap(iArr[i], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                } else {
                    sector.particle = BitmapFactory.decodeResource(getContext().getResources(), iArr[i]);
                }
            }
            i++;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override
    public final void onDetachedFromWindow() {
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
                sectorArr[i].particle = null;
            }
            i++;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iDp = AndroidUtilities.dp(heightDp());
        int iDp2 = AndroidUtilities.dp(172.0f);
        RectF rectF = this.chartMeasureBounds;
        rectF.set((size - iDp2) / 2.0f, (iDp - iDp2) / 2.0f, (size + iDp2) / 2.0f, (iDp2 + iDp) / 2.0f);
        Matrix matrix = this.completeGradientMatrix;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.completeGradient.setLocalMatrix(matrix);
        Matrix matrix2 = this.completeTextGradientMatrix;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.completeTextGradient.setLocalMatrix(matrix2);
        StarParticlesView.Drawable drawable = this.completeDrawable;
        if (drawable != null) {
            drawable.rect.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.completeDrawable.rect.offset((getMeasuredWidth() - this.completeDrawable.rect.width()) / 2.0f, (getMeasuredHeight() - this.completeDrawable.rect.height()) / 2.0f);
            this.completeDrawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.completeDrawable.resetPositions();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
    }

    public abstract void onSectionDown(int i, boolean z);

    public int padInsideDp() {
        return 0;
    }

    public void setInterceptTouch(boolean z) {
        this.interceptTouch = z;
    }

    public final void setSegments(long j, boolean z, SegmentSize... segmentSizeArr) {
        ?? r11;
        float f;
        float f2;
        boolean z2;
        Sector sector;
        float f3;
        float f4;
        float f5;
        int i;
        Sector sector2;
        Sector[] sectorArr;
        float f6;
        long j2;
        float f7;
        float f8;
        ?? r12;
        SegmentSize[] segmentSizeArr2 = segmentSizeArr;
        ?? r3 = this.bottomCompleteText;
        ?? r4 = this.topCompleteText;
        ?? r5 = this.bottomText;
        ?? r6 = this.topText;
        AnimatedFloat animatedFloat = this.loadingFloat;
        AnimatedFloat animatedFloat2 = this.completeFloat;
        Sector[] sectorArr2 = this.sectors;
        float f9 = 1.0f;
        if (segmentSizeArr2 == null || segmentSizeArr2.length == 0) {
            this.loading = false;
            this.complete = j == 0;
            if (z) {
                r11 = 1;
            } else {
                r11 = 1;
                animatedFloat.set(0.0f, true);
                animatedFloat2.set(this.complete ? 1.0f : 0.0f, true);
            }
            r4.setText(r6.currentText, false, r11);
            r6.setText("0", z, r11);
            r4.setText("0", z, r11);
            r3.setText(r5.currentText, false, r11);
            r5.setText("KB", z, r11);
            r3.setText("KB", z, r11);
            for (int i2 = 0; i2 < sectorArr2.length; i2 += r11) {
                Sector sector3 = sectorArr2[i2];
                sector3.textAlpha = 0.0f;
                if (!z) {
                    sector3.textAlphaAnimated.set(0.0f, r11);
                }
            }
            invalidate();
            return;
        }
        this.loading = false;
        if (!z) {
            animatedFloat.set(0.0f, true);
        }
        SpannableString spannableString = new SpannableString("%");
        int length = segmentSizeArr2.length;
        SpannableString spannableString2 = spannableString;
        long j3 = 0;
        int i3 = 0;
        while (i3 < segmentSizeArr2.length) {
            if (segmentSizeArr2[i3] == null) {
                SegmentSize segmentSize = new SegmentSize();
                segmentSizeArr2[i3] = segmentSize;
                segmentSize.size = 0L;
            }
            SegmentSize segmentSize2 = segmentSizeArr2[i3];
            segmentSize2.index = i3;
            boolean z3 = segmentSize2.selected;
            if (z3) {
                j3 += segmentSize2.size;
            }
            if (segmentSize2.size <= 0 || !z3) {
                length--;
            }
            i3++;
            j3 = j3;
        }
        long j4 = j3;
        if (j4 <= 0) {
            this.loading = false;
            this.complete = j <= 0;
            if (z) {
                r12 = 1;
            } else {
                r12 = 1;
                animatedFloat.set(0.0f, true);
                animatedFloat2.set(this.complete ? 1.0f : 0.0f, true);
            }
            r4.setText(r6.currentText, false, r12);
            r6.setText("0", z, r12);
            r4.setText("0", z, r12);
            r3.setText(r5.currentText, false, r12);
            r5.setText("KB", z, r12);
            r3.setText("KB", z, r12);
            for (int i4 = 0; i4 < sectorArr2.length; i4 += r12) {
                Sector sector4 = sectorArr2[i4];
                sector4.textAlpha = 0.0f;
                if (!z) {
                    sector4.textAlphaAnimated.set(0.0f, r12);
                }
            }
            invalidate();
            return;
        }
        Sector[] sectorArr3 = sectorArr2;
        int i5 = 0;
        int i6 = 0;
        float f10 = 0.0f;
        while (i5 < segmentSizeArr2.length) {
            SegmentSize segmentSize3 = segmentSizeArr2[i5];
            if (segmentSize3 == null || !segmentSize3.selected) {
                j2 = j4;
                f7 = 0.02f;
                f8 = 0.0f;
            } else {
                f7 = 0.02f;
                j2 = j4;
                f8 = segmentSize3.size / j2;
            }
            if (f8 > 0.0f && f8 < f7) {
                i6++;
                f10 += f8;
            }
            i5++;
            j4 = j2;
        }
        long j5 = j4;
        Math.min(segmentSizeArr2.length, sectorArr3.length);
        int[] iArr = this.tempPercents;
        if (iArr == null || iArr.length != segmentSizeArr2.length) {
            this.tempPercents = new int[segmentSizeArr2.length];
        }
        float[] fArr = this.tempFloat;
        if (fArr == null || fArr.length != segmentSizeArr2.length) {
            this.tempFloat = new float[segmentSizeArr2.length];
        }
        int i7 = 0;
        while (i7 < segmentSizeArr2.length) {
            float[] fArr2 = this.tempFloat;
            int i8 = i7;
            SegmentSize segmentSize4 = segmentSizeArr2[i8];
            float f11 = f10;
            if (segmentSize4 != null) {
                sectorArr = sectorArr3;
                if (segmentSize4.selected) {
                    f6 = segmentSize4.size / j5;
                }
                fArr2[i8] = f6;
                i7 = i8 + 1;
                f10 = f11;
                sectorArr3 = sectorArr;
            } else {
                sectorArr = sectorArr3;
            }
            f6 = 0.0f;
            fArr2[i8] = f6;
            i7 = i8 + 1;
            f10 = f11;
            sectorArr3 = sectorArr;
        }
        float f12 = f10;
        Sector[] sectorArr4 = sectorArr3;
        AndroidUtilities.roundPercents(this.tempFloat, this.tempPercents);
        if (this.type == 0) {
            Arrays.sort(segmentSizeArr2, new ChatActivity$$ExternalSyntheticLambda18(12));
            for (int i9 = 0; i9 <= segmentSizeArr2.length; i9++) {
                SegmentSize segmentSize5 = segmentSizeArr2[i9];
                if (segmentSize5.index == segmentSizeArr2.length - 1) {
                    SegmentSize segmentSize6 = segmentSizeArr2[0];
                    segmentSizeArr2[0] = segmentSize5;
                    segmentSizeArr2[i9] = segmentSize6;
                    break;
                }
            }
        }
        if (length < 2) {
            length = 0;
        }
        float f13 = 360.0f - (length * 2.0f);
        int i10 = 0;
        int i11 = 0;
        float f14 = 0.0f;
        ?? r7 = r3;
        while (i10 < segmentSizeArr2.length) {
            SegmentSize segmentSize7 = segmentSizeArr2[i10];
            int i12 = segmentSize7.index;
            ?? r24 = r7;
            float f15 = !segmentSize7.selected ? 0.0f : segmentSize7.size / j5;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i13 = i10;
            spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.tempPercents[i12])));
            SpannableString spannableString3 = spannableString2;
            spannableStringBuilder.append((CharSequence) spannableString3);
            Sector sector5 = sectorArr4[i12];
            AnimatedFloat animatedFloat3 = animatedFloat2;
            float f16 = f13;
            float f17 = (((double) f15) <= 0.05d || f15 >= f9) ? 0.0f : 1.0f;
            sector5.textAlpha = f17;
            if (f15 >= 0.08f) {
                f = f15;
                if (this.tempPercents[i12] < 100) {
                    f2 = 1.0f;
                }
                sector5.textScale = f2;
                sector5.particlesAlpha = 1.0f;
                if (z) {
                    z2 = true;
                } else {
                    z2 = true;
                    sector5.textAlphaAnimated.set(f17, true);
                    Sector sector6 = sectorArr4[i12];
                    sector6.textScaleAnimated.set(sector6.textScale, true);
                    Sector sector7 = sectorArr4[i12];
                    sector7.particlesAlphaAnimated.set(sector7.particlesAlpha, true);
                }
                sector = sectorArr4[i12];
                if (sector.textAlpha > 0.0f) {
                    sector.text.setText(spannableStringBuilder, z, z2);
                }
                if (f < 0.02f || f <= 0.0f) {
                    f9 = 1.0f;
                    f3 = (1.0f - ((i6 * 0.02f) - f12)) * f;
                } else {
                    f3 = 0.02f;
                    f9 = 1.0f;
                }
                f4 = (i11 * 2.0f) + (f14 * f16);
                f5 = (f3 * f16) + f4;
                if (f3 <= 0.0f) {
                    Sector sector8 = sectorArr4[i12];
                    sector8.angleCenter = (f4 + f5) / 2.0f;
                    sector8.angleSize = Math.abs(f5 - f4) / 2.0f;
                    sector2 = sectorArr4[i12];
                    sector2.textAlpha = 0.0f;
                    if (!z) {
                        sector2.angleCenterAnimated.set(sector2.angleCenter, true);
                        Sector sector9 = sectorArr4[i12];
                        sector9.angleSizeAnimated.set(sector9.angleSize, true);
                        Sector sector10 = sectorArr4[i12];
                        sector10.textAlphaAnimated.set(sector10.textAlpha, true);
                    }
                } else {
                    Sector sector11 = sectorArr4[i12];
                    sector11.angleCenter = (f4 + f5) / 2.0f;
                    sector11.angleSize = Math.abs(f5 - f4) / 2.0f;
                    if (z) {
                        i = 1;
                    } else {
                        Sector sector12 = sectorArr4[i12];
                        i = 1;
                        sector12.angleCenterAnimated.set(sector12.angleCenter, true);
                        Sector sector13 = sectorArr4[i12];
                        sector13.angleSizeAnimated.set(sector13.angleSize, true);
                    }
                    f14 += f3;
                    i11 += i;
                }
                animatedFloat2 = animatedFloat3;
                r7 = r24;
                f13 = f16;
                spannableString2 = spannableString3;
                i10 = i13 + 1;
                segmentSizeArr2 = segmentSizeArr;
            } else {
                f = f15;
            }
            f2 = 0.85f;
            sector5.textScale = f2;
            sector5.particlesAlpha = 1.0f;
            if (z) {
                z2 = true;
                sector5.textAlphaAnimated.set(f17, true);
                Sector sector14 = sectorArr4[i12];
                sector14.textScaleAnimated.set(sector14.textScale, true);
                Sector sector15 = sectorArr4[i12];
                sector15.particlesAlphaAnimated.set(sector15.particlesAlpha, true);
            } else {
                z2 = true;
            }
            sector = sectorArr4[i12];
            if (sector.textAlpha > 0.0f) {
                sector.text.setText(spannableStringBuilder, z, z2);
            }
            if (f < 0.02f) {
                f9 = 1.0f;
                f3 = (1.0f - ((i6 * 0.02f) - f12)) * f;
            } else {
                f9 = 1.0f;
                f3 = (1.0f - ((i6 * 0.02f) - f12)) * f;
            }
            f4 = (i11 * 2.0f) + (f14 * f16);
            f5 = (f3 * f16) + f4;
            if (f3 <= 0.0f) {
                Sector sector16 = sectorArr4[i12];
                sector16.angleCenter = (f4 + f5) / 2.0f;
                sector16.angleSize = Math.abs(f5 - f4) / 2.0f;
                sector2 = sectorArr4[i12];
                sector2.textAlpha = 0.0f;
                if (!z) {
                    sector2.angleCenterAnimated.set(sector2.angleCenter, true);
                    Sector sector17 = sectorArr4[i12];
                    sector17.angleSizeAnimated.set(sector17.angleSize, true);
                    Sector sector18 = sectorArr4[i12];
                    sector18.textAlphaAnimated.set(sector18.textAlpha, true);
                }
            } else {
                Sector sector19 = sectorArr4[i12];
                sector19.angleCenter = (f4 + f5) / 2.0f;
                sector19.angleSize = Math.abs(f5 - f4) / 2.0f;
                if (z) {
                    Sector sector110 = sectorArr4[i12];
                    i = 1;
                    sector110.angleCenterAnimated.set(sector110.angleCenter, true);
                    Sector sector111 = sectorArr4[i12];
                    sector111.angleSizeAnimated.set(sector111.angleSize, true);
                } else {
                    i = 1;
                }
                f14 += f3;
                i11 += i;
            }
            animatedFloat2 = animatedFloat3;
            r7 = r24;
            f13 = f16;
            spannableString2 = spannableString3;
            i10 = i13 + 1;
            segmentSizeArr2 = segmentSizeArr;
        }
        ?? r25 = r7;
        AnimatedFloat animatedFloat4 = animatedFloat2;
        String[] strArrSplit = AndroidUtilities.formatFileSize(j5, true, true).split(" ");
        String str = strArrSplit.length > 0 ? strArrSplit[0] : "";
        if (str.length() >= 4 && j5 < 1073741824) {
            str = str.split("\\.")[0];
        }
        r6.setText(str, z, true);
        r5.setText(strArrSplit.length > 1 ? strArrSplit[1] : "", z, true);
        if (animatedFloat4.value > 0.0f) {
            r4.setText(r6.currentText, z, true);
            r25.setText(r5.currentText, z, true);
        }
        this.complete = false;
        if (!z) {
            animatedFloat4.set(0.0f, true);
        }
        invalidate();
    }

    public void setSelected(int i) {
        if (i == this.selectedIndex) {
            return;
        }
        int i2 = 0;
        while (true) {
            Sector[] sectorArr = this.sectors;
            if (i2 >= sectorArr.length) {
                this.selectedIndex = i;
                invalidate();
                return;
            }
            if (i == i2 && sectorArr[i2].angleSize <= 0.0f) {
                i = -1;
            }
            sectorArr[i2].selected = i == i2;
            i2++;
        }
    }
}
