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

public class CellFlickerDrawable {
    public float animationSpeedScale;
    public boolean drawFrame;
    private Shader gradientShader;
    private Shader gradientShader2;
    long lastUpdateTime;
    Matrix matrix;
    private Paint paint;
    private Paint paintOutline;
    View parentView;
    int parentWidth;
    float progress;
    public boolean repeatEnabled;
    public float repeatProgress;
    int size;

    public CellFlickerDrawable() {
        this(64, 204);
    }

    public CellFlickerDrawable(int i, int i2) {
        this.paint = new Paint(1);
        this.paintOutline = new Paint(1);
        this.matrix = new Matrix();
        this.repeatEnabled = true;
        this.drawFrame = true;
        this.repeatProgress = 1.2f;
        this.animationSpeedScale = 1.0f;
        this.size = AndroidUtilities.dp(160.0f);
        this.gradientShader = new LinearGradient(0.0f, 0.0f, this.size, 0.0f, new int[]{0, ColorUtils.setAlphaComponent(-1, i), 0}, (float[]) null, Shader.TileMode.CLAMP);
        this.gradientShader2 = new LinearGradient(0.0f, 0.0f, this.size, 0.0f, new int[]{0, ColorUtils.setAlphaComponent(-1, i2), 0}, (float[]) null, Shader.TileMode.CLAMP);
        this.paint.setShader(this.gradientShader);
        this.paintOutline.setShader(this.gradientShader2);
        this.paintOutline.setStyle(Paint.Style.STROKE);
        this.paintOutline.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void setColors(int i, int i2, int i3) {
        this.gradientShader = new LinearGradient(0.0f, 0.0f, this.size, 0.0f, new int[]{0, ColorUtils.setAlphaComponent(i, i2), 0}, (float[]) null, Shader.TileMode.CLAMP);
        this.gradientShader2 = new LinearGradient(0.0f, 0.0f, this.size, 0.0f, new int[]{0, ColorUtils.setAlphaComponent(i, i3), 0}, (float[]) null, Shader.TileMode.CLAMP);
        this.paint.setShader(this.gradientShader);
        this.paintOutline.setShader(this.gradientShader2);
    }

    public float getProgress() {
        return this.progress;
    }

    public void setProgress(float f) {
        this.progress = f;
    }

    public void draw(Canvas canvas, RectF rectF, float f) {
        if (this.progress <= 1.0f || this.repeatEnabled) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.lastUpdateTime;
            if (j != 0) {
                long j2 = currentTimeMillis - j;
                if (j2 > 10) {
                    float f2 = this.progress + ((((float) j2) / 1200.0f) * this.animationSpeedScale);
                    this.progress = f2;
                    if (f2 > this.repeatProgress) {
                        this.progress = 0.0f;
                    }
                    this.lastUpdateTime = currentTimeMillis;
                }
            } else {
                this.lastUpdateTime = currentTimeMillis;
            }
            float f3 = this.progress;
            if (f3 <= 1.0f) {
                int i = this.parentWidth;
                int i2 = this.size;
                this.matrix.setTranslate(((i + (i2 * 2)) * f3) - i2, 0.0f);
                this.gradientShader.setLocalMatrix(this.matrix);
                this.gradientShader2.setLocalMatrix(this.matrix);
                canvas.drawRoundRect(rectF, f, f, this.paint);
                if (this.drawFrame) {
                    canvas.drawRoundRect(rectF, f, f, this.paintOutline);
                }
            }
        }
    }

    public void draw(Canvas canvas, GroupCallMiniTextureView groupCallMiniTextureView) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.lastUpdateTime;
        if (j != 0) {
            long j2 = currentTimeMillis - j;
            if (j2 > 10) {
                float f = this.progress + (((float) j2) / 500.0f);
                this.progress = f;
                if (f > 4.0f) {
                    this.progress = 0.0f;
                }
                this.lastUpdateTime = currentTimeMillis;
            }
        } else {
            this.lastUpdateTime = currentTimeMillis;
        }
        float f2 = this.progress;
        if (f2 <= 1.0f) {
            int i = this.parentWidth;
            int i2 = this.size;
            this.matrix.setTranslate((((i + (i2 * 2)) * f2) - i2) - groupCallMiniTextureView.getX(), 0.0f);
            this.gradientShader.setLocalMatrix(this.matrix);
            this.gradientShader2.setLocalMatrix(this.matrix);
            RectF rectF = AndroidUtilities.rectTmp;
            VoIPTextureView voIPTextureView = groupCallMiniTextureView.textureView;
            float f3 = voIPTextureView.currentClipHorizontal;
            float f4 = voIPTextureView.currentClipVertical;
            VoIPTextureView voIPTextureView2 = groupCallMiniTextureView.textureView;
            rectF.set(f3, f4, voIPTextureView.getMeasuredWidth() - voIPTextureView2.currentClipHorizontal, voIPTextureView2.getMeasuredHeight() - groupCallMiniTextureView.textureView.currentClipVertical);
            canvas.drawRect(rectF, this.paint);
            if (this.drawFrame) {
                float f5 = groupCallMiniTextureView.textureView.roundRadius;
                canvas.drawRoundRect(rectF, f5, f5, this.paintOutline);
            }
        }
    }

    public void setParentWidth(int i) {
        this.parentWidth = i;
    }

    public DrawableInterface getDrawableInterface(View view) {
        this.parentView = view;
        return new DrawableInterface();
    }

    public class DrawableInterface extends Drawable {
        public float radius;

        @Override
        public int getOpacity() {
            return -3;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public DrawableInterface() {
        }

        @Override
        public void draw(Canvas canvas) {
            CellFlickerDrawable.this.setParentWidth(getBounds().width());
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            CellFlickerDrawable.this.draw(canvas, rectF, this.radius);
            CellFlickerDrawable.this.parentView.invalidate();
        }

        @Override
        public void setAlpha(int i) {
            CellFlickerDrawable.this.paint.setAlpha(i);
            CellFlickerDrawable.this.paintOutline.setAlpha(i);
        }
    }
}
