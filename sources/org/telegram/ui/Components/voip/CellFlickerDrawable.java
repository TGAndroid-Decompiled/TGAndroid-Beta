package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.VideoScreenPreview;

public final class CellFlickerDrawable {
    public float animationSpeedScale;
    public boolean drawFrame;
    public boolean frameInside;
    public LinearGradient gradientShader;
    public LinearGradient gradientShader2;
    public long lastUpdateTime;
    public final Matrix matrix;
    public PasscodeView$9$$ExternalSyntheticLambda0 onRestartCallback;
    public final Paint paint;
    public final Paint paintOutline;
    public VideoScreenPreview parentView;
    public int parentWidth;
    public float progress;
    public boolean repeatEnabled;
    public float repeatProgress;
    public final int size;

    public final class DrawableInterface extends Drawable {
        public float radius;
        public final SvgHelper.SvgDrawable svgDrawable;

        public DrawableInterface(SvgHelper.SvgDrawable svgDrawable) {
            this.svgDrawable = svgDrawable;
        }

        @Override
        public final void draw(Canvas canvas) {
            int iWidth = getBounds().width();
            CellFlickerDrawable cellFlickerDrawable = CellFlickerDrawable.this;
            cellFlickerDrawable.parentWidth = iWidth;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            cellFlickerDrawable.draw(this.radius, canvas, rectF, null);
            SvgHelper.SvgDrawable svgDrawable = this.svgDrawable;
            if (svgDrawable != null) {
                svgDrawable.setPaint(cellFlickerDrawable.paint);
                int i = cellFlickerDrawable.parentWidth;
                int i2 = cellFlickerDrawable.size;
                float f = (((i2 * 2) + i) * cellFlickerDrawable.progress) - i2;
                float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
                cellFlickerDrawable.matrix.reset();
                cellFlickerDrawable.matrix.setScale(1.0f / scale, 0.0f, cellFlickerDrawable.size / 2.0f, 0.0f);
                cellFlickerDrawable.matrix.setTranslate((f - svgDrawable.getBounds().left) - (cellFlickerDrawable.size / scale), 0.0f);
                cellFlickerDrawable.gradientShader.setLocalMatrix(cellFlickerDrawable.matrix);
                int i3 = ((int) (i * 0.5f)) / 2;
                svgDrawable.setBounds(getBounds().centerX() - i3, getBounds().centerY() - i3, getBounds().centerX() + i3, getBounds().centerY() + i3);
                svgDrawable.draw(canvas);
            }
            cellFlickerDrawable.parentView.invalidate();
        }

        @Override
        public final int getOpacity() {
            return -3;
        }

        @Override
        public final void setAlpha(int i) {
            CellFlickerDrawable cellFlickerDrawable = CellFlickerDrawable.this;
            cellFlickerDrawable.paint.setAlpha(i);
            cellFlickerDrawable.paintOutline.setAlpha(i);
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public CellFlickerDrawable() {
        this(64, 204, 160);
    }

    public final void draw(float f, Canvas canvas, RectF rectF, View view) {
        update(view);
        canvas.drawRoundRect(rectF, f, f, this.paint);
        if (this.drawFrame) {
            boolean z = this.frameInside;
            Paint paint = this.paintOutline;
            if (z) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void setColors(int i, int i2) {
        float f = this.size;
        int[] iArr = {0, ColorUtils.setAlphaComponent(i, i2), 0};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.gradientShader = new LinearGradient(0.0f, 0.0f, f, 0.0f, iArr, (float[]) null, tileMode);
        this.gradientShader2 = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{0, ColorUtils.setAlphaComponent(i, 204), 0}, (float[]) null, tileMode);
        this.paint.setShader(this.gradientShader);
        this.paintOutline.setShader(this.gradientShader2);
    }

    public final void update(View view) {
        if (this.repeatEnabled || this.progress < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.lastUpdateTime;
            if (j != 0) {
                long j2 = jCurrentTimeMillis - j;
                if (j2 > 10) {
                    float f = ((j2 / 1200.0f) * this.animationSpeedScale) + this.progress;
                    this.progress = f;
                    if (f > this.repeatProgress) {
                        this.progress = 0.0f;
                        PasscodeView$9$$ExternalSyntheticLambda0 passcodeView$9$$ExternalSyntheticLambda0 = this.onRestartCallback;
                        if (passcodeView$9$$ExternalSyntheticLambda0 != null) {
                            passcodeView$9$$ExternalSyntheticLambda0.run();
                        }
                    }
                    this.lastUpdateTime = jCurrentTimeMillis;
                }
            } else {
                this.lastUpdateTime = jCurrentTimeMillis;
            }
        }
        int i = this.parentWidth;
        int i2 = this.size;
        float f2 = (((i2 * 2) + i) * this.progress) - i2;
        Matrix matrix = this.matrix;
        matrix.reset();
        matrix.setTranslate(f2, 0.0f);
        this.gradientShader.setLocalMatrix(matrix);
        this.gradientShader2.setLocalMatrix(matrix);
    }

    public CellFlickerDrawable(int i, int i2, int i3) {
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.paintOutline = paint2;
        this.matrix = new Matrix();
        this.repeatEnabled = true;
        this.drawFrame = true;
        this.frameInside = false;
        this.repeatProgress = 1.2f;
        this.animationSpeedScale = 1.0f;
        int iDp = AndroidUtilities.dp(i3);
        this.size = iDp;
        float f = iDp;
        int[] iArr = {0, ColorUtils.setAlphaComponent(-1, i), 0};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.gradientShader = new LinearGradient(0.0f, 0.0f, f, 0.0f, iArr, (float[]) null, tileMode);
        this.gradientShader2 = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{0, ColorUtils.setAlphaComponent(-1, i2), 0}, (float[]) null, tileMode);
        paint.setShader(this.gradientShader);
        paint2.setShader(this.gradientShader2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
