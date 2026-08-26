package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class LoadingDrawable extends Drawable {
    public boolean appearByGradient;
    public LinearGradient appearGradient;
    public int appearGradientWidth;
    public Matrix appearMatrix;
    public Paint appearPaint;
    public Integer color1;
    public Integer color2;
    public int colorKey1;
    public int colorKey2;
    public LinearGradient disappearGradient;
    public int disappearGradientWidth;
    public Matrix disappearMatrix;
    public Paint disappearPaint;
    public long disappearStart;
    public LinearGradient gradient;
    public int gradientColor1;
    public int gradientColor2;
    public int gradientStrokeColor1;
    public int gradientStrokeColor2;
    public int gradientWidth;
    public float gradientWidthScale;
    public Rect lastBounds;
    public final Matrix matrix;
    public final Paint paint;
    public final Path path;
    public final float[] radii;
    public final RectF rectF;
    public Theme.ResourcesProvider resourcesProvider;
    public float speed;
    public long start;
    public boolean stroke;
    public Integer strokeColor1;
    public Integer strokeColor2;
    public LinearGradient strokeGradient;
    public final Matrix strokeMatrix;
    public final Paint strokePaint;
    public Path usePath;

    public LoadingDrawable(Theme.ResourcesProvider resourcesProvider) {
        this();
        this.resourcesProvider = resourcesProvider;
    }

    public final void disappear() {
        if (isDisappeared() || isDisappearing()) {
            return;
        }
        this.disappearStart = SystemClock.elapsedRealtime();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z;
        float f;
        if (isDisappeared()) {
            return;
        }
        Rect bounds = getBounds();
        Paint paint = this.paint;
        if (paint.getAlpha() <= 0) {
            return;
        }
        int iWidth = bounds.width();
        if (iWidth <= 0) {
            iWidth = AndroidUtilities.dp(200.0f);
        }
        int iMin = (int) (Math.min(AndroidUtilities.dp(400.0f), iWidth) * this.gradientWidthScale);
        Integer num = this.color1;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(this.colorKey1, this.resourcesProvider);
        Integer num2 = this.color2;
        int iIntValue2 = num2 != null ? num2.intValue() : Theme.getColor(this.colorKey2, this.resourcesProvider);
        Integer num3 = this.strokeColor1;
        int iIntValue3 = num3 != null ? num3.intValue() : Theme.getColor(this.colorKey1, this.resourcesProvider);
        Integer num4 = this.strokeColor2;
        int iIntValue4 = num4 != null ? num4.intValue() : Theme.getColor(this.colorKey2, this.resourcesProvider);
        LinearGradient linearGradient = this.gradient;
        Matrix matrix = this.strokeMatrix;
        Matrix matrix2 = this.matrix;
        Paint paint2 = this.strokePaint;
        if (linearGradient == null || iMin != this.gradientWidth || iIntValue != this.gradientColor1 || iIntValue2 != this.gradientColor2 || iIntValue3 != this.gradientStrokeColor1 || iIntValue4 != this.gradientStrokeColor2) {
            this.gradientWidth = iMin;
            this.gradientColor1 = iIntValue;
            this.gradientColor2 = iIntValue2;
            float f2 = this.gradientWidth;
            int i = this.gradientColor1;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, f2, 0.0f, new int[]{i, this.gradientColor2, i}, new float[]{0.0f, 0.67f, 1.0f}, tileMode);
            this.gradient = linearGradient2;
            linearGradient2.setLocalMatrix(matrix2);
            paint.setShader(this.gradient);
            this.gradientStrokeColor1 = iIntValue3;
            this.gradientStrokeColor2 = iIntValue4;
            float f3 = this.gradientWidth;
            int i2 = this.gradientStrokeColor1;
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, f3, 0.0f, new int[]{i2, i2, this.gradientStrokeColor2, i2}, new float[]{0.0f, 0.4f, 0.67f, 1.0f}, tileMode);
            this.strokeGradient = linearGradient3;
            linearGradient3.setLocalMatrix(matrix);
            paint2.setShader(this.strokeGradient);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.start < 0) {
            this.start = jElapsedRealtime;
        }
        float fPow = ((float) Math.pow((((jElapsedRealtime - this.start) / 2000.0f) * this.speed) / 4.0f, 0.8500000238418579d)) * 4.0f * AndroidUtilities.density;
        float f4 = this.gradientWidth;
        float f5 = (fPow * f4) % f4;
        float f6 = (jElapsedRealtime - this.start) / 550.0f;
        long j = this.disappearStart;
        float interpolation = j > 0 ? 1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(Math.min(1.0f, (jElapsedRealtime - j) / 320.0f)) : 0.0f;
        boolean zIsDisappearing = isDisappearing();
        RectF rectF = this.rectF;
        boolean z2 = false;
        if (zIsDisappearing) {
            int iMax = Math.max(AndroidUtilities.dp(200.0f), bounds.width() / 3);
            if (interpolation < 1.0f) {
                if (this.disappearPaint == null) {
                    this.disappearPaint = new Paint(1);
                    this.disappearGradientWidth = iMax;
                    this.disappearGradient = new LinearGradient(0.0f, 0.0f, iMax, 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Matrix matrix3 = new Matrix();
                    this.disappearMatrix = matrix3;
                    this.disappearGradient.setLocalMatrix(matrix3);
                    this.disappearPaint.setShader(this.disappearGradient);
                    this.disappearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                } else if (this.disappearGradientWidth != iMax) {
                    this.disappearGradientWidth = iMax;
                    LinearGradient linearGradient4 = new LinearGradient(0.0f, 0.0f, iMax, 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.disappearGradient = linearGradient4;
                    linearGradient4.setLocalMatrix(this.disappearMatrix);
                    this.disappearPaint.setShader(this.disappearGradient);
                }
                rectF.set(bounds);
                rectF.inset(-paint2.getStrokeWidth(), -paint2.getStrokeWidth());
                canvas.saveLayerAlpha(rectF, 255, 31);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (this.appearByGradient) {
            int iMax2 = Math.max(AndroidUtilities.dp(200.0f), bounds.width() / 3);
            if (f6 < 1.0f) {
                if (this.appearPaint == null) {
                    this.appearPaint = new Paint(1);
                    this.appearGradientWidth = iMax2;
                    this.appearGradient = new LinearGradient(0.0f, 0.0f, iMax2, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Matrix matrix4 = new Matrix();
                    this.appearMatrix = matrix4;
                    this.appearGradient.setLocalMatrix(matrix4);
                    this.appearPaint.setShader(this.appearGradient);
                    this.appearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                } else if (this.appearGradientWidth != iMax2) {
                    this.appearGradientWidth = iMax2;
                    LinearGradient linearGradient5 = new LinearGradient(0.0f, 0.0f, iMax2, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.appearGradient = linearGradient5;
                    linearGradient5.setLocalMatrix(this.appearMatrix);
                    this.appearPaint.setShader(this.appearGradient);
                }
                rectF.set(bounds);
                rectF.inset(-paint2.getStrokeWidth(), -paint2.getStrokeWidth());
                canvas.saveLayerAlpha(rectF, 255, 31);
                z2 = true;
            }
        }
        matrix2.setTranslate(f5, 0.0f);
        this.gradient.setLocalMatrix(matrix2);
        matrix.setTranslate(f5, 0.0f);
        this.strokeGradient.setLocalMatrix(matrix);
        Path path = this.usePath;
        if (path == null) {
            Rect rect = this.lastBounds;
            Path path2 = this.path;
            if (rect == null || !rect.equals(bounds)) {
                path2.rewind();
                this.lastBounds = bounds;
                rectF.set(bounds);
                path2.addRoundRect(rectF, this.radii, Path.Direction.CW);
            }
            path = path2;
        }
        canvas.drawPath(path, paint);
        if (this.stroke) {
            canvas.drawPath(path, paint2);
        }
        if (z2) {
            canvas.save();
            int iWidth2 = bounds.width() + this.appearGradientWidth;
            int i3 = this.appearGradientWidth;
            this.appearMatrix.setTranslate(bounds.left + ((f6 * (iWidth2 + i3)) - i3), 0.0f);
            this.appearGradient.setLocalMatrix(this.appearMatrix);
            int strokeWidth = (int) paint2.getStrokeWidth();
            f = 0.0f;
            canvas.drawRect(bounds.left - strokeWidth, bounds.top - strokeWidth, bounds.right + strokeWidth, bounds.bottom + strokeWidth, this.appearPaint);
            canvas.restore();
            canvas.restore();
        } else {
            f = 0.0f;
        }
        if (z) {
            canvas.save();
            int iWidth3 = bounds.width() + this.disappearGradientWidth;
            int i4 = this.disappearGradientWidth;
            this.disappearMatrix.setTranslate(bounds.right - ((interpolation * (iWidth3 + i4)) - i4), f);
            this.disappearGradient.setLocalMatrix(this.disappearMatrix);
            int strokeWidth2 = (int) paint2.getStrokeWidth();
            canvas.drawRect(bounds.left - strokeWidth2, bounds.top - strokeWidth2, bounds.right + strokeWidth2, bounds.bottom + strokeWidth2, this.disappearPaint);
            canvas.restore();
            canvas.restore();
        }
        if (isDisappeared()) {
            return;
        }
        invalidateSelf();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean isDisappeared() {
        return this.disappearStart > 0 && ((float) (SystemClock.elapsedRealtime() - this.disappearStart)) >= 320.0f;
    }

    public final boolean isDisappearing() {
        return this.disappearStart > 0 && ((float) (SystemClock.elapsedRealtime() - this.disappearStart)) < 320.0f;
    }

    @Override
    public final void setAlpha(int i) {
        this.paint.setAlpha(i);
        this.strokePaint.setAlpha(i);
        if (i > 0) {
            invalidateSelf();
        }
    }

    public final void setBounds(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.lastBounds = null;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public final void setColors(int i, int i2) {
        this.color1 = Integer.valueOf(i);
        this.color2 = Integer.valueOf(i2);
        this.stroke = false;
    }

    public final void setGradientScale() {
        this.gradientWidthScale = 2.0f;
    }

    public final void setRadii(float f) {
        if (this.usePath != null) {
            this.paint.setPathEffect(new CornerPathEffect(f));
            this.strokePaint.setPathEffect(new CornerPathEffect(f));
            return;
        }
        float[] fArr = this.radii;
        boolean z = (fArr[0] == f && fArr[2] == f && fArr[4] == f && fArr[6] == f) ? false : true;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f;
        fArr[2] = f;
        fArr[5] = f;
        fArr[4] = f;
        fArr[7] = f;
        fArr[6] = f;
        if (this.lastBounds == null || !z) {
            return;
        }
        Path path = this.path;
        path.rewind();
        RectF rectF = this.rectF;
        rectF.set(this.lastBounds);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    public final void updateBounds() {
        Path path = this.usePath;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            setBounds(rectF);
        }
    }

    public LoadingDrawable() {
        this.start = -1L;
        this.disappearStart = -1L;
        this.matrix = new Matrix();
        this.strokeMatrix = new Matrix();
        this.colorKey1 = Theme.key_dialogBackground;
        this.colorKey2 = Theme.key_dialogBackgroundGray;
        this.gradientWidthScale = 1.0f;
        this.speed = 1.0f;
        this.paint = new Paint(1);
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        this.path = new Path();
        this.radii = new float[8];
        this.rectF = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }

    public final void setColors(int i, int i2, int i3, int i4) {
        this.color1 = Integer.valueOf(i);
        this.color2 = Integer.valueOf(i2);
        this.stroke = true;
        this.strokeColor1 = Integer.valueOf(i3);
        this.strokeColor2 = Integer.valueOf(i4);
    }

    public final void setRadii(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < 8; i++) {
            float[] fArr2 = this.radii;
            float f = fArr2[i];
            float f2 = fArr[i];
            if (f != f2) {
                fArr2[i] = f2;
                z = true;
            }
        }
        if (this.lastBounds == null || !z) {
            return;
        }
        Path path = this.path;
        path.rewind();
        RectF rectF = this.rectF;
        rectF.set(this.lastBounds);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }
}
