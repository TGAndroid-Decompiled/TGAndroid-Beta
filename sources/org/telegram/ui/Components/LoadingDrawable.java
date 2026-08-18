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

public class LoadingDrawable extends Drawable {
    private boolean appearByGradient;
    private LinearGradient appearGradient;
    private int appearGradientWidth;
    private Matrix appearMatrix;
    private Paint appearPaint;
    public Paint backgroundPaint;
    public Integer color1;
    public Integer color2;
    public int colorKey1;
    public int colorKey2;
    private LinearGradient disappearGradient;
    private int disappearGradientWidth;
    private Matrix disappearMatrix;
    private Paint disappearPaint;
    private long disappearStart;
    private LinearGradient gradient;
    private int gradientColor1;
    private int gradientColor2;
    private int gradientStrokeColor1;
    private int gradientStrokeColor2;
    private int gradientWidth;
    private float gradientWidthScale;
    private Rect lastBounds;
    private Matrix matrix;
    public Paint paint;
    private Path path;
    private float[] radii;
    private RectF rectF;
    public Theme.ResourcesProvider resourcesProvider;
    private float speed;
    private long start;
    public boolean stroke;
    public Integer strokeColor1;
    public Integer strokeColor2;
    private LinearGradient strokeGradient;
    private Matrix strokeMatrix;
    public Paint strokePaint;
    private Path usePath;

    @Override
    public int getOpacity() {
        return -2;
    }

    public LoadingDrawable(Theme.ResourcesProvider resourcesProvider) {
        this();
        this.resourcesProvider = resourcesProvider;
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
        this.strokePaint = new Paint(1);
        this.path = new Path();
        this.radii = new float[8];
        this.rectF = new RectF();
        this.strokePaint.setStyle(Paint.Style.STROKE);
        this.strokePaint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }

    public void setColors(int i, int i2) {
        this.color1 = Integer.valueOf(i);
        this.color2 = Integer.valueOf(i2);
        this.stroke = false;
    }

    public void setColors(int i, int i2, int i3, int i4) {
        this.color1 = Integer.valueOf(i);
        this.color2 = Integer.valueOf(i2);
        this.stroke = true;
        this.strokeColor1 = Integer.valueOf(i3);
        this.strokeColor2 = Integer.valueOf(i4);
    }

    public boolean isDisappearing() {
        return this.disappearStart > 0 && ((float) (SystemClock.elapsedRealtime() - this.disappearStart)) < 320.0f;
    }

    public boolean isDisappeared() {
        return this.disappearStart > 0 && ((float) (SystemClock.elapsedRealtime() - this.disappearStart)) >= 320.0f;
    }

    public long timeToDisappear() {
        if (this.disappearStart > 0) {
            return 320 - (SystemClock.elapsedRealtime() - this.disappearStart);
        }
        return 0L;
    }

    public void usePath(Path path) {
        this.usePath = path;
    }

    public void setGradientScale(float f) {
        this.gradientWidthScale = f;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setAppearByGradient(boolean z) {
        this.appearByGradient = z;
    }

    public void setRadiiDp(float f) {
        setRadii(AndroidUtilities.dp(f));
    }

    public void setRadii(float f) {
        if (this.usePath != null) {
            this.paint.setPathEffect(new CornerPathEffect(f));
            this.strokePaint.setPathEffect(new CornerPathEffect(f));
        } else {
            setRadii(f, f, f, f);
        }
    }

    public void setRadii(float f, float f2, float f3, float f4) {
        float[] fArr = this.radii;
        boolean z = (fArr[0] == f && fArr[2] == f2 && fArr[4] == f3 && fArr[6] == f4) ? false : true;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
        if (this.lastBounds == null || !z) {
            return;
        }
        this.path.rewind();
        this.rectF.set(this.lastBounds);
        this.path.addRoundRect(this.rectF, this.radii, Path.Direction.CW);
    }

    public void setRadii(float[] fArr) {
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
        this.path.rewind();
        this.rectF.set(this.lastBounds);
        this.path.addRoundRect(this.rectF, fArr, Path.Direction.CW);
    }

    public void setBounds(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.lastBounds = null;
    }

    public void reset() {
        this.start = -1L;
    }

    public void disappear() {
        if (isDisappeared() || isDisappearing()) {
            return;
        }
        this.disappearStart = SystemClock.elapsedRealtime();
    }

    public void resetDisappear() {
        this.disappearStart = -1L;
    }

    @Override
    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (isDisappeared()) {
            return;
        }
        Rect bounds = getBounds();
        if (getPaintAlpha() <= 0) {
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
        if (this.gradient == null || iMin != this.gradientWidth || iIntValue != this.gradientColor1 || iIntValue2 != this.gradientColor2 || iIntValue3 != this.gradientStrokeColor1 || iIntValue4 != this.gradientStrokeColor2) {
            this.gradientWidth = iMin;
            this.gradientColor1 = iIntValue;
            this.gradientColor2 = iIntValue2;
            float f = this.gradientWidth;
            int i = this.gradientColor1;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{i, this.gradientColor2, i}, new float[]{0.0f, 0.67f, 1.0f}, tileMode);
            this.gradient = linearGradient;
            linearGradient.setLocalMatrix(this.matrix);
            this.paint.setShader(this.gradient);
            this.gradientStrokeColor1 = iIntValue3;
            this.gradientStrokeColor2 = iIntValue4;
            float f2 = this.gradientWidth;
            int i2 = this.gradientStrokeColor1;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, f2, 0.0f, new int[]{i2, i2, this.gradientStrokeColor2, i2}, new float[]{0.0f, 0.4f, 0.67f, 1.0f}, tileMode);
            this.strokeGradient = linearGradient2;
            linearGradient2.setLocalMatrix(this.strokeMatrix);
            this.strokePaint.setShader(this.strokeGradient);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.start < 0) {
            this.start = jElapsedRealtime;
        }
        float fPow = ((float) Math.pow((((jElapsedRealtime - this.start) / 2000.0f) * this.speed) / 4.0f, 0.8500000238418579d)) * 4.0f * AndroidUtilities.density;
        float f3 = this.gradientWidth;
        float f4 = (fPow * f3) % f3;
        float f5 = (jElapsedRealtime - this.start) / 550.0f;
        long j = this.disappearStart;
        float interpolation = j > 0 ? 1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(Math.min(1.0f, (jElapsedRealtime - j) / 320.0f)) : 0.0f;
        if (isDisappearing()) {
            int iMax = Math.max(AndroidUtilities.dp(200.0f), bounds.width() / 3);
            if (interpolation < 1.0f) {
                if (this.disappearPaint == null) {
                    this.disappearPaint = new Paint(1);
                    this.disappearGradientWidth = iMax;
                    this.disappearGradient = new LinearGradient(0.0f, 0.0f, iMax, 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Matrix matrix = new Matrix();
                    this.disappearMatrix = matrix;
                    this.disappearGradient.setLocalMatrix(matrix);
                    this.disappearPaint.setShader(this.disappearGradient);
                    this.disappearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                } else if (this.disappearGradientWidth != iMax) {
                    this.disappearGradientWidth = iMax;
                    LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, iMax, 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.disappearGradient = linearGradient3;
                    linearGradient3.setLocalMatrix(this.disappearMatrix);
                    this.disappearPaint.setShader(this.disappearGradient);
                }
                this.rectF.set(bounds);
                this.rectF.inset(-this.strokePaint.getStrokeWidth(), -this.strokePaint.getStrokeWidth());
                canvas.saveLayerAlpha(this.rectF, 255, 31);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (this.appearByGradient) {
            int iMax2 = Math.max(AndroidUtilities.dp(200.0f), bounds.width() / 3);
            if (f5 < 1.0f) {
                if (this.appearPaint == null) {
                    this.appearPaint = new Paint(1);
                    this.appearGradientWidth = iMax2;
                    this.appearGradient = new LinearGradient(0.0f, 0.0f, iMax2, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Matrix matrix2 = new Matrix();
                    this.appearMatrix = matrix2;
                    this.appearGradient.setLocalMatrix(matrix2);
                    this.appearPaint.setShader(this.appearGradient);
                    this.appearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                } else if (this.appearGradientWidth != iMax2) {
                    this.appearGradientWidth = iMax2;
                    LinearGradient linearGradient4 = new LinearGradient(0.0f, 0.0f, iMax2, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.appearGradient = linearGradient4;
                    linearGradient4.setLocalMatrix(this.appearMatrix);
                    this.appearPaint.setShader(this.appearGradient);
                }
                this.rectF.set(bounds);
                this.rectF.inset(-this.strokePaint.getStrokeWidth(), -this.strokePaint.getStrokeWidth());
                canvas.saveLayerAlpha(this.rectF, 255, 31);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.matrix.setTranslate(f4, 0.0f);
        this.gradient.setLocalMatrix(this.matrix);
        this.strokeMatrix.setTranslate(f4, 0.0f);
        this.strokeGradient.setLocalMatrix(this.strokeMatrix);
        Path path = this.usePath;
        if (path == null) {
            Rect rect = this.lastBounds;
            if (rect == null || !rect.equals(bounds)) {
                this.path.rewind();
                RectF rectF = this.rectF;
                this.lastBounds = bounds;
                rectF.set(bounds);
                this.path.addRoundRect(this.rectF, this.radii, Path.Direction.CW);
            }
            path = this.path;
        }
        Paint paint = this.backgroundPaint;
        if (paint != null) {
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, this.paint);
        if (this.stroke) {
            canvas.drawPath(path, this.strokePaint);
        }
        if (z2) {
            canvas.save();
            int iWidth2 = this.appearGradientWidth + bounds.width();
            int i3 = this.appearGradientWidth;
            this.appearMatrix.setTranslate(bounds.left + ((f5 * (iWidth2 + i3)) - i3), 0.0f);
            this.appearGradient.setLocalMatrix(this.appearMatrix);
            int strokeWidth = (int) this.strokePaint.getStrokeWidth();
            canvas.drawRect(bounds.left - strokeWidth, bounds.top - strokeWidth, bounds.right + strokeWidth, bounds.bottom + strokeWidth, this.appearPaint);
            canvas.restore();
            canvas.restore();
        }
        if (z) {
            canvas.save();
            int iWidth3 = this.disappearGradientWidth + bounds.width();
            int i4 = this.disappearGradientWidth;
            this.disappearMatrix.setTranslate(bounds.right - ((interpolation * (iWidth3 + i4)) - i4), 0.0f);
            this.disappearGradient.setLocalMatrix(this.disappearMatrix);
            int strokeWidth2 = (int) this.strokePaint.getStrokeWidth();
            canvas.drawRect(bounds.left - strokeWidth2, bounds.top - strokeWidth2, bounds.right + strokeWidth2, bounds.bottom + strokeWidth2, this.disappearPaint);
            canvas.restore();
            canvas.restore();
        }
        if (isDisappeared()) {
            return;
        }
        invalidateSelf();
    }

    public void updateBounds() {
        Path path = this.usePath;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            setBounds(rectF);
        }
    }

    public int getPaintAlpha() {
        return this.paint.getAlpha();
    }

    @Override
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
        this.strokePaint.setAlpha(i);
        if (i > 0) {
            invalidateSelf();
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }
}
