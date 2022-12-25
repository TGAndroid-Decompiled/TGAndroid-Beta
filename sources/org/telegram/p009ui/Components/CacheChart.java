package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.zxing.common.detector.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.SvgHelper;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AnimatedTextView;
import org.telegram.p009ui.Components.Premium.StarParticlesView;

public class CacheChart extends View {
    private static final String[] colorKeys = {"statisticChartLine_lightblue", "statisticChartLine_blue", "statisticChartLine_green", "statisticChartLine_red", "statisticChartLine_lightgreen", "statisticChartLine_orange", "statisticChartLine_cyan", "statisticChartLine_purple", "statisticChartLine_golden"};
    private static Long loadedStart;
    private static final int[] particles;
    private static Long start;
    private AnimatedTextView.AnimatedTextDrawable bottomText;
    private RectF chartBounds;
    private RectF chartInnerBounds;
    private boolean complete;
    private StarParticlesView.Drawable completeDrawable;
    private AnimatedFloat completeFloat;
    private LinearGradient completeGradient;
    private Matrix completeGradientMatrix;
    private Paint completePaint;
    private Paint completePaintStroke;
    private Path completePath;
    private RectF completePathBounds;
    private boolean loading;
    private Paint loadingBackgroundPaint;
    public AnimatedFloat loadingFloat;
    private RectF roundingRect;
    private Sector[] sectors;
    private float[] segmentsTmp;
    private float[] tempFloat;
    private int[] tempPercents;
    private AnimatedTextView.AnimatedTextDrawable topText;

    static {
        int i = C1072R.raw.cache_videos;
        int i2 = C1072R.raw.cache_other;
        particles = new int[]{C1072R.raw.cache_photos, i, C1072R.raw.cache_documents, C1072R.raw.cache_music, i, C1072R.raw.cache_stickers, C1072R.raw.cache_profile_photos, i2, i2};
    }

    public class Sector {
        float angleCenter;
        AnimatedFloat angleCenterAnimated;
        float angleSize;
        AnimatedFloat angleSizeAnimated;
        Paint cut;
        LinearGradient gradient;
        Matrix gradientMatrix;
        int gradientWidth;
        private float lastAngleCenter;
        private float lastAngleSize;
        private float lastRounding;
        private float lastThickness;
        private float lastWidth;
        Paint paint;
        Bitmap particle;
        Paint particlePaint = new Paint(3);
        Path path;
        RectF pathBounds;
        AnimatedTextView.AnimatedTextDrawable text;
        float textAlpha;
        AnimatedFloat textAlphaAnimated;
        float textScale;
        AnimatedFloat textScaleAnimated;
        Paint uncut;

        Sector() {
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.angleCenterAnimated = new AnimatedFloat(CacheChart.this, 650L, cubicBezierInterpolator);
            this.angleSizeAnimated = new AnimatedFloat(CacheChart.this, 650L, cubicBezierInterpolator);
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT;
            this.textAlphaAnimated = new AnimatedFloat(CacheChart.this, 0L, 150L, cubicBezierInterpolator2);
            this.textScale = 1.0f;
            this.textScaleAnimated = new AnimatedFloat(CacheChart.this, 0L, 150L, cubicBezierInterpolator2);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
            this.text = animatedTextDrawable;
            animatedTextDrawable.setTextColor(-1);
            this.text.setAnimationProperties(0.35f, 0L, 200L, cubicBezierInterpolator);
            this.text.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.text.setTextSize(AndroidUtilities.m35dp(15.0f));
            this.text.setGravity(17);
            this.path = new Path();
            this.paint = new Paint(1);
            this.pathBounds = new RectF();
            this.uncut = new Paint(1);
            Paint paint = new Paint(1);
            this.cut = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            this.particlePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        }

        private void setupPath(RectF rectF, RectF rectF2, float f, float f2, float f3) {
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float min = Math.min(f3, (rectF.width() - rectF2.width()) / 4.0f);
            double d = f2 / 180.0f;
            Double.isNaN(d);
            double width = rectF2.width() / 2.0f;
            Double.isNaN(width);
            float min2 = Math.min(min, (float) (d * 3.141592653589793d * width));
            float width2 = (rectF.width() - rectF2.width()) / 2.0f;
            if (this.lastAngleCenter == f && this.lastAngleSize == f2 && this.lastRounding == min2 && this.lastThickness == width2 && this.lastWidth == rectF.width()) {
                return;
            }
            this.lastAngleCenter = f;
            this.lastAngleSize = f2;
            this.lastRounding = min2;
            this.lastThickness = width2;
            this.lastWidth = rectF.width();
            float f9 = f - f2;
            float f10 = f + f2;
            boolean z = min2 > 0.0f;
            float f11 = min2 * 2.0f;
            double width3 = rectF.width() - f11;
            Double.isNaN(width3);
            float f12 = (min2 / ((float) (width3 * 3.141592653589793d))) * 360.0f;
            double width4 = rectF2.width() + f11;
            Double.isNaN(width4);
            float f13 = ((min2 / ((float) (width4 * 3.141592653589793d))) * 360.0f) + ((f2 > 175.0f ? 0 : 1) * 0.5f);
            float width5 = (rectF.width() / 2.0f) - min2;
            float width6 = (rectF2.width() / 2.0f) + min2;
            this.path.rewind();
            float f14 = f10 - f9;
            if (f14 < 0.5f) {
                return;
            }
            if (z) {
                RectF rectF3 = CacheChart.this.roundingRect;
                double centerX = rectF.centerX();
                double d2 = width5;
                f4 = width6;
                double cos = Math.cos(CacheChart.toRad(f8));
                Double.isNaN(d2);
                Double.isNaN(centerX);
                double d3 = centerX + (cos * d2);
                double centerY = rectF.centerY();
                double sin = Math.sin(CacheChart.toRad(f8));
                Double.isNaN(d2);
                Double.isNaN(centerY);
                CacheChart.setCircleBounds(rectF3, d3, (d2 * sin) + centerY, min2);
                this.path.arcTo(CacheChart.this.roundingRect, (f9 + f12) - 90.0f, 90.0f);
            } else {
                f4 = width6;
            }
            this.path.arcTo(rectF, f9 + f12, f14 - (f12 * 2.0f));
            if (z) {
                RectF rectF4 = CacheChart.this.roundingRect;
                double centerX2 = rectF.centerX();
                double d4 = width5;
                float f15 = f10 - f12;
                double cos2 = Math.cos(CacheChart.toRad(f15));
                Double.isNaN(d4);
                Double.isNaN(centerX2);
                double d5 = centerX2 + (cos2 * d4);
                double centerY2 = rectF.centerY();
                f5 = f9;
                double sin2 = Math.sin(CacheChart.toRad(f15));
                Double.isNaN(d4);
                Double.isNaN(centerY2);
                CacheChart.setCircleBounds(rectF4, d5, centerY2 + (d4 * sin2), min2);
                this.path.arcTo(CacheChart.this.roundingRect, f15, 90.0f);
                RectF rectF5 = CacheChart.this.roundingRect;
                double centerX3 = rectF2.centerX();
                double d6 = f4;
                double cos3 = Math.cos(CacheChart.toRad(f7));
                Double.isNaN(d6);
                Double.isNaN(centerX3);
                double d7 = centerX3 + (cos3 * d6);
                double centerY3 = rectF2.centerY();
                double sin3 = Math.sin(CacheChart.toRad(f7));
                Double.isNaN(d6);
                Double.isNaN(centerY3);
                CacheChart.setCircleBounds(rectF5, d7, centerY3 + (d6 * sin3), min2);
                this.path.arcTo(CacheChart.this.roundingRect, (f10 - f13) + 90.0f, 90.0f);
            } else {
                f5 = f9;
            }
            this.path.arcTo(rectF2, f10 - f13, -(f14 - (f13 * 2.0f)));
            if (z) {
                RectF rectF6 = CacheChart.this.roundingRect;
                double centerX4 = rectF2.centerX();
                double d8 = f4;
                double cos4 = Math.cos(CacheChart.toRad(f6));
                Double.isNaN(d8);
                Double.isNaN(centerX4);
                double d9 = centerX4 + (cos4 * d8);
                double centerY4 = rectF2.centerY();
                double sin4 = Math.sin(CacheChart.toRad(f6));
                Double.isNaN(d8);
                Double.isNaN(centerY4);
                CacheChart.setCircleBounds(rectF6, d9, centerY4 + (d8 * sin4), min2);
                this.path.arcTo(CacheChart.this.roundingRect, f5 + f13 + 180.0f, 90.0f);
            }
            this.path.close();
            this.path.computeBounds(this.pathBounds, false);
        }

        private void setGradientBounds(float f, float f2, float f3, float f4) {
            this.gradientMatrix.reset();
            Matrix matrix = this.gradientMatrix;
            double d = f4 / 180.0f;
            Double.isNaN(d);
            double d2 = d * 3.141592653589793d;
            matrix.setTranslate(f + (((float) Math.cos(d2)) * (f3 - this.gradientWidth)), f2 + (((float) Math.sin(d2)) * (f3 - this.gradientWidth)));
            this.gradientMatrix.preRotate(f4);
            this.gradient.setLocalMatrix(this.gradientMatrix);
        }

        private void drawParticles(Canvas canvas, float f, float f2, float f3, float f4) {
            float f5;
            if (f4 <= 0.0f) {
                return;
            }
            if (this.particle == null && this.pathBounds.isEmpty()) {
                return;
            }
            int width = this.particle.getWidth();
            float f6 = width * 1.75f;
            float floor = (float) Math.floor(this.pathBounds.left / f6);
            float ceil = (float) Math.ceil(this.pathBounds.right / f6);
            float floor2 = (float) Math.floor(this.pathBounds.top / f6);
            float ceil2 = (float) Math.ceil(this.pathBounds.bottom / f6);
            long currentTimeMillis = System.currentTimeMillis();
            float f7 = (-(((float) (currentTimeMillis % 20000)) / 20000.0f)) * f6;
            double d = (((float) (currentTimeMillis % 30000)) / 30000.0f) * 2.0f;
            Double.isNaN(d);
            float sin = (float) Math.sin(d * 3.141592653589793d);
            while (floor <= ceil) {
                float f8 = Math.floor((double) floor) % 2.0d < 0.5d ? 0.5f * f6 : 0.0f;
                float f9 = floor2;
                while (f9 <= ceil2) {
                    float f10 = floor * f6;
                    float f11 = (f9 * f6) + f8 + f7;
                    float f12 = f6;
                    float f13 = ceil;
                    double min = Math.min(0.25f, AndroidUtilities.lerp(2.0f, MathUtils.distance(f10, f11, f, f2) / AndroidUtilities.m35dp(48.0f), f3) * f4 * 0.2f);
                    Double.isNaN(min);
                    this.particlePaint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (float) (min * ((((Math.cos(((-sin) + f10 + f5 + f8 + f7) * 0.1f) * 0.5d) + 1.0d) * 0.5d) + 0.75d)))) * 255.0f));
                    float sin2 = (float) ((Math.sin((sin + f10 + f5 + f8 + f7) * 0.1f) * 0.15000000596046448d) + 0.8999999761581421d);
                    canvas.save();
                    canvas.translate(f10, f11);
                    canvas.scale(sin2, sin2);
                    float f14 = -(width >> 1);
                    canvas.drawBitmap(this.particle, f14, f14, this.particlePaint);
                    canvas.restore();
                    f9 += 1.0f;
                    ceil2 = ceil2;
                    floor2 = floor2;
                    ceil = f13;
                    f6 = f12;
                    floor = floor;
                }
                floor += 1.0f;
            }
        }

        void draw(Canvas canvas, RectF rectF, RectF rectF2, float f, float f2, float f3, float f4, float f5) {
            float f6;
            double centerX = rectF.centerX();
            double cos = Math.cos(CacheChart.toRad(f));
            double width = rectF.width() + rectF2.width();
            Double.isNaN(width);
            Double.isNaN(centerX);
            float f7 = (float) (centerX + ((cos * width) / 4.0d));
            double centerY = rectF.centerY();
            double sin = Math.sin(CacheChart.toRad(f));
            double width2 = rectF.width() + rectF2.width();
            Double.isNaN(width2);
            Double.isNaN(centerY);
            float f8 = (float) (centerY + ((sin * width2) / 4.0d));
            float f9 = f5 * this.textAlphaAnimated.set(this.textAlpha) * f4;
            this.paint.setAlpha((int) (f4 * 255.0f));
            if (f2 * 2.0f >= 359.0f) {
                canvas.saveLayerAlpha(rectF, 255, 31);
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.uncut);
                canvas.drawRect(rectF, this.paint);
                drawParticles(canvas, f7, f8, f9, Math.max(0.0f, (f5 / 0.75f) - 0.75f));
                canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, this.cut);
                canvas.restore();
                f6 = 0.0f;
            } else {
                f6 = 0.0f;
                setupPath(rectF, rectF2, f, f2, f3);
                setGradientBounds(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f);
                canvas.saveLayerAlpha(rectF, 255, 31);
                canvas.drawPath(this.path, this.uncut);
                canvas.drawRect(rectF, this.paint);
                drawParticles(canvas, f7, f8, f9, Math.max(0.0f, (f5 / 0.75f) - 0.75f));
                canvas.restore();
            }
            float f10 = this.textScaleAnimated.set(this.textScale);
            CacheChart.setCircleBounds(CacheChart.this.roundingRect, f7, f8, f6);
            if (f10 != 1.0f) {
                canvas.save();
                canvas.scale(f10, f10, CacheChart.this.roundingRect.centerX(), CacheChart.this.roundingRect.centerY());
            }
            this.text.setAlpha((int) (f9 * 255.0f));
            this.text.setBounds((int) CacheChart.this.roundingRect.left, (int) CacheChart.this.roundingRect.top, (int) CacheChart.this.roundingRect.right, (int) CacheChart.this.roundingRect.bottom);
            this.text.draw(canvas);
            if (f10 != 1.0f) {
                canvas.restore();
            }
        }
    }

    public CacheChart(Context context) {
        super(context);
        this.chartBounds = new RectF();
        this.chartInnerBounds = new RectF();
        this.loading = true;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.loadingFloat = new AnimatedFloat(this, 750L, cubicBezierInterpolator);
        this.complete = false;
        this.completeFloat = new AnimatedFloat(this, 750L, cubicBezierInterpolator);
        this.sectors = new Sector[9];
        this.segmentsTmp = new float[2];
        this.roundingRect = new RectF();
        this.loadingBackgroundPaint = new Paint(1);
        this.completePath = new Path();
        this.completePaintStroke = new Paint(1);
        this.completePaint = new Paint(1);
        this.topText = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.bottomText = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.loadingBackgroundPaint.setStyle(Paint.Style.STROKE);
        this.loadingBackgroundPaint.setColor(Theme.getColor("listSelectorSDK21"));
        this.completePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.completeGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.m35dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, Shader.TileMode.CLAMP);
        this.completeGradientMatrix = new Matrix();
        this.completePaintStroke.setShader(this.completeGradient);
        this.completePaint.setShader(this.completeGradient);
        this.completePaintStroke.setStyle(Paint.Style.STROKE);
        this.completePaintStroke.setStrokeCap(Paint.Cap.ROUND);
        this.completePaintStroke.setStrokeJoin(Paint.Join.ROUND);
        this.topText.setAnimationProperties(0.2f, 0L, 450L, cubicBezierInterpolator);
        this.topText.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.topText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.topText.setTextSize(AndroidUtilities.m35dp(32.0f));
        this.topText.setGravity(17);
        this.bottomText.setAnimationProperties(0.6f, 0L, 450L, cubicBezierInterpolator);
        this.bottomText.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
        this.bottomText.setTextSize(AndroidUtilities.m35dp(12.0f));
        this.bottomText.setGravity(17);
        for (int i = 0; i < 9; i++) {
            Sector[] sectorArr = this.sectors;
            Sector sector = new Sector();
            sectorArr[i] = sector;
            int color = Theme.getColor(colorKeys[i]);
            int blendOver = Theme.blendOver(color, 822083583);
            sector.gradientWidth = AndroidUtilities.m35dp(50.0f);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, sector.gradientWidth, 0.0f, new int[]{blendOver, color}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            sector.gradient = linearGradient;
            Matrix matrix = new Matrix();
            sector.gradientMatrix = matrix;
            linearGradient.setLocalMatrix(matrix);
            sector.paint.setShader(sector.gradient);
            sector.particle = SvgHelper.getBitmap(particles[i], AndroidUtilities.m35dp(16.0f), AndroidUtilities.m35dp(16.0f), -1);
        }
    }

    public void setSegments(long j, long... jArr) {
        int i;
        long[] jArr2 = jArr;
        int i2 = 0;
        if (jArr2 == null || jArr2.length == 0) {
            this.loading = true;
            this.complete = j == 0;
            this.topText.setText("");
            this.bottomText.setText("");
            int i3 = 0;
            while (true) {
                Sector[] sectorArr = this.sectors;
                if (i3 < sectorArr.length) {
                    sectorArr[i3].textAlpha = 0.0f;
                    i3++;
                } else {
                    invalidate();
                    return;
                }
            }
        } else {
            this.loading = false;
            SpannableString spannableString = new SpannableString("%");
            int length = jArr2.length;
            long j2 = 0;
            for (int i4 = 0; i4 < jArr2.length; i4++) {
                j2 += jArr2[i4];
                if (jArr2[i4] <= 0) {
                    length--;
                }
            }
            if (j2 <= 0) {
                this.loading = true;
                this.complete = j <= 0;
                this.topText.setText("");
                this.bottomText.setText("");
                while (true) {
                    Sector[] sectorArr2 = this.sectors;
                    if (i2 < sectorArr2.length) {
                        sectorArr2[i2].textAlpha = 0.0f;
                        i2++;
                    } else {
                        invalidate();
                        return;
                    }
                }
            } else {
                int i5 = 0;
                float f = 0.0f;
                for (long j3 : jArr2) {
                    float f2 = ((float) j3) / ((float) j2);
                    if (f2 > 0.0f && f2 < 0.02f) {
                        i5++;
                        f += f2;
                    }
                }
                int min = Math.min(jArr2.length, this.sectors.length);
                int[] iArr = this.tempPercents;
                if (iArr == null || iArr.length != jArr2.length) {
                    this.tempPercents = new int[jArr2.length];
                }
                float[] fArr = this.tempFloat;
                if (fArr == null || fArr.length != jArr2.length) {
                    this.tempFloat = new float[jArr2.length];
                }
                for (int i6 = 0; i6 < jArr2.length; i6++) {
                    this.tempFloat[i6] = ((float) jArr2[i6]) / ((float) j2);
                }
                AndroidUtilities.roundPercents(this.tempFloat, this.tempPercents);
                if (length < 2) {
                    length = 0;
                }
                float f3 = 360.0f - (length * 2.0f);
                int i7 = 0;
                int i8 = 0;
                float f4 = 0.0f;
                while (i7 < min) {
                    float f5 = f;
                    float f6 = ((float) jArr2[i7]) / ((float) j2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    i8 = i8;
                    spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.tempPercents[i7])));
                    spannableStringBuilder.append((CharSequence) spannableString);
                    Sector[] sectorArr3 = this.sectors;
                    int i9 = min;
                    sectorArr3[i7].textAlpha = (((double) f6) <= 0.05d || f6 >= 1.0f) ? 0.0f : 1.0f;
                    sectorArr3[i7].textScale = (f6 < 0.08f || this.tempPercents[i7] >= 100) ? 0.85f : 1.0f;
                    if (sectorArr3[i7].textAlpha > 0.0f) {
                        sectorArr3[i7].text.setText(spannableStringBuilder);
                    }
                    float f7 = (f6 >= 0.02f || f6 <= 0.0f) ? f6 * (1.0f - ((i5 * 0.02f) - f5)) : 0.02f;
                    float f8 = (f4 * f3) + (i8 * 2.0f);
                    float f9 = (f7 * f3) + f8;
                    if (f7 <= 0.0f) {
                        Sector[] sectorArr4 = this.sectors;
                        sectorArr4[i7].angleCenter = (f8 + f9) / 2.0f;
                        sectorArr4[i7].angleSize = Math.abs(f9 - f8) / 2.0f;
                        this.sectors[i7].textAlpha = 0.0f;
                        i = i5;
                    } else {
                        Sector[] sectorArr5 = this.sectors;
                        i = i5;
                        sectorArr5[i7].angleCenter = (f8 + f9) / 2.0f;
                        sectorArr5[i7].angleSize = Math.abs(f9 - f8) / 2.0f;
                        f4 += f7;
                        i8++;
                    }
                    i7++;
                    jArr2 = jArr;
                    f = f5;
                    min = i9;
                    i5 = i;
                }
                String[] split = AndroidUtilities.formatFileSize(j2).split(" ");
                String str = split.length > 0 ? split[0] : "";
                if (str.length() >= 4 && j2 < 1073741824) {
                    str = str.split("\\.")[0];
                }
                this.topText.setText(str);
                this.bottomText.setText(split.length > 1 ? split[1] : "");
                invalidate();
            }
        }
    }

    public static float toRad(float f) {
        double d = f / 180.0f;
        Double.isNaN(d);
        return (float) (d * 3.141592653589793d);
    }

    public static void setCircleBounds(RectF rectF, float f, float f2, float f3) {
        rectF.set(f - f3, f2 - f3, f + f3, f2 + f3);
    }

    public static void setCircleBounds(RectF rectF, double d, double d2, float f) {
        setCircleBounds(rectF, (float) d, (float) d2, f);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = 0.0f;
        float f8 = this.loadingFloat.set(this.loading ? 1.0f : 0.0f);
        float f9 = this.completeFloat.set(this.complete ? 1.0f : 0.0f);
        this.chartInnerBounds.set(this.chartBounds);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.m35dp(38.0f), AndroidUtilities.m35dp(10.0f), f8);
        this.chartInnerBounds.inset(lerp, lerp);
        char c = 0;
        float lerp2 = AndroidUtilities.lerp(0, AndroidUtilities.m35dp(60.0f), f8);
        if (start == null) {
            start = Long.valueOf(System.currentTimeMillis());
        }
        boolean z = this.loading;
        if (!z && loadedStart == null) {
            loadedStart = Long.valueOf(System.currentTimeMillis());
        } else if (z && loadedStart != null) {
            loadedStart = null;
        }
        Long l = loadedStart;
        float currentTimeMillis = ((float) ((l == null ? System.currentTimeMillis() : l.longValue()) - start.longValue())) * 0.6f;
        CircularProgressDrawable.getSegments(currentTimeMillis % 5400.0f, this.segmentsTmp);
        float[] fArr = this.segmentsTmp;
        float f10 = fArr[0];
        char c2 = 1;
        float f11 = fArr[1];
        if (f8 > 0.0f) {
            this.loadingBackgroundPaint.setStrokeWidth(lerp);
            int alpha = this.loadingBackgroundPaint.getAlpha();
            this.loadingBackgroundPaint.setAlpha((int) (alpha * f8));
            canvas.drawCircle(this.chartBounds.centerX(), this.chartBounds.centerY(), (this.chartBounds.width() - lerp) / 2.0f, this.loadingBackgroundPaint);
            this.loadingBackgroundPaint.setAlpha(alpha);
        }
        boolean z2 = f8 > 0.0f || f9 > 0.0f;
        int i = 0;
        while (i < 9) {
            Sector sector = this.sectors[i];
            CircularProgressDrawable.getSegments((currentTimeMillis + (i * 80)) % 5400.0f, this.segmentsTmp);
            float min = Math.min(Math.max(this.segmentsTmp[c], f10), f11);
            float min2 = Math.min(Math.max(this.segmentsTmp[c2], f10), f11);
            if (f8 < 1.0f || min < min2) {
                float f12 = (min + min2) / 2.0f;
                float abs = Math.abs(min2 - min) / 2.0f;
                if (f8 <= f7) {
                    float f13 = sector.angleCenterAnimated.set(sector.angleCenter);
                    f = f10;
                    f2 = lerp2;
                    f3 = sector.angleSizeAnimated.set(sector.angleSize);
                    f12 = f13;
                } else {
                    if (f8 < 1.0f) {
                        f = f10;
                        f2 = lerp2;
                        f12 = AndroidUtilities.lerp(sector.angleCenterAnimated.set(sector.angleCenter) + (((float) Math.floor(f11 / 360.0f)) * 360.0f), f12, f8);
                        abs = AndroidUtilities.lerp(sector.angleSizeAnimated.set(sector.angleSize), abs, f8);
                    } else {
                        f = f10;
                        f2 = lerp2;
                    }
                    f3 = abs;
                }
                boolean z3 = sector.angleCenterAnimated.isInProgress() || sector.angleSizeAnimated.isInProgress() || z2;
                f4 = f11;
                f5 = f;
                f6 = lerp;
                sector.draw(canvas, this.chartBounds, this.chartInnerBounds, f12, f3, f2, 1.0f - f9, 1.0f - f8);
                z2 = z3;
            } else {
                f4 = f11;
                f5 = f10;
                f2 = lerp2;
                f6 = lerp;
            }
            i++;
            f10 = f5;
            lerp2 = f2;
            f11 = f4;
            lerp = f6;
            c2 = 1;
            c = 0;
            f7 = 0.0f;
        }
        float f14 = lerp;
        int i2 = (int) ((1.0f - f8) * 255.0f * (1.0f - f9));
        this.topText.setAlpha(i2);
        this.topText.setBounds((int) this.chartBounds.centerX(), (int) (this.chartBounds.centerY() - AndroidUtilities.m35dp(5.0f)), (int) this.chartBounds.centerX(), (int) (this.chartBounds.centerY() - AndroidUtilities.m35dp(3.0f)));
        this.topText.draw(canvas);
        if (this.topText.isAnimating() || z2) {
        }
        this.bottomText.setAlpha(i2);
        this.bottomText.setBounds((int) this.chartBounds.centerX(), (int) (this.chartBounds.centerY() + AndroidUtilities.m35dp(22.0f)), (int) this.chartBounds.centerX(), (int) (this.chartBounds.centerY() + AndroidUtilities.m35dp(22.0f)));
        this.bottomText.draw(canvas);
        this.bottomText.isAnimating();
        if (f9 > 0.0f) {
            if (this.completeDrawable == null) {
                StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(25);
                this.completeDrawable = drawable;
                drawable.type = 100;
                drawable.roundEffect = false;
                drawable.useRotate = true;
                drawable.useBlur = false;
                drawable.checkBounds = true;
                drawable.size1 = 18;
                drawable.distributionAlgorithm = false;
                drawable.excludeRadius = AndroidUtilities.m35dp(80.0f);
                StarParticlesView.Drawable drawable2 = this.completeDrawable;
                drawable2.f1126k3 = 0.7f;
                drawable2.f1125k2 = 0.7f;
                drawable2.f1124k1 = 0.7f;
                drawable2.init();
                float min3 = Math.min(getMeasuredHeight(), Math.min(getMeasuredWidth(), AndroidUtilities.m35dp(150.0f)));
                this.completeDrawable.rect.set(0.0f, 0.0f, min3, min3);
                this.completeDrawable.rect.offset((getMeasuredWidth() - this.completeDrawable.rect.width()) / 2.0f, (getMeasuredHeight() - this.completeDrawable.rect.height()) / 2.0f);
                this.completeDrawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.completeDrawable.resetPositions();
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            this.completeDrawable.onDraw(canvas, f9);
            int i3 = (int) (f9 * 255.0f);
            this.completePaint.setAlpha(i3);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.completePaint);
            canvas.restore();
            this.completePaintStroke.setStrokeWidth(f14);
            this.completePaintStroke.setAlpha(i3);
            canvas.drawCircle(this.chartBounds.centerX(), this.chartBounds.centerY(), (this.chartBounds.width() - f14) / 2.0f, this.completePaintStroke);
            RectF rectF = this.completePathBounds;
            if (rectF == null || rectF.equals(this.chartBounds)) {
                if (this.completePathBounds == null) {
                    this.completePathBounds = new RectF();
                }
                this.completePathBounds.set(this.chartBounds);
                this.completePath.rewind();
                Path path = this.completePath;
                RectF rectF2 = this.chartBounds;
                float width = rectF2.left + (rectF2.width() * 0.348f);
                RectF rectF3 = this.chartBounds;
                path.moveTo(width, rectF3.top + (rectF3.height() * 0.538f));
                Path path2 = this.completePath;
                RectF rectF4 = this.chartBounds;
                float width2 = rectF4.left + (rectF4.width() * 0.447f);
                RectF rectF5 = this.chartBounds;
                path2.lineTo(width2, rectF5.top + (rectF5.height() * 0.636f));
                Path path3 = this.completePath;
                RectF rectF6 = this.chartBounds;
                float width3 = rectF6.left + (rectF6.width() * 0.678f);
                RectF rectF7 = this.chartBounds;
                path3.lineTo(width3, rectF7.top + (rectF7.height() * 0.402f));
            }
            this.completePaintStroke.setStrokeWidth(AndroidUtilities.m35dp(10.0f));
            canvas.drawPath(this.completePath, this.completePaintStroke);
        }
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int m35dp = AndroidUtilities.m35dp(200.0f);
        int m35dp2 = AndroidUtilities.m35dp(172.0f);
        this.chartBounds.set((size - m35dp2) / 2.0f, (m35dp - m35dp2) / 2.0f, (size + m35dp2) / 2.0f, (m35dp2 + m35dp) / 2.0f);
        this.completeGradientMatrix.reset();
        this.completeGradientMatrix.setTranslate(this.chartBounds.left, 0.0f);
        this.completeGradient.setLocalMatrix(this.completeGradientMatrix);
        StarParticlesView.Drawable drawable = this.completeDrawable;
        if (drawable != null) {
            drawable.rect.set(0.0f, 0.0f, AndroidUtilities.m35dp(140.0f), AndroidUtilities.m35dp(140.0f));
            this.completeDrawable.rect.offset((getMeasuredWidth() - this.completeDrawable.rect.width()) / 2.0f, (getMeasuredHeight() - this.completeDrawable.rect.height()) / 2.0f);
            this.completeDrawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.completeDrawable.resetPositions();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(m35dp, 1073741824));
    }
}
