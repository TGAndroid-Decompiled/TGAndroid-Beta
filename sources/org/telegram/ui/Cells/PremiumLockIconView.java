package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

public class PremiumLockIconView extends ImageView {
    int color1;
    int color2;
    ImageReceiver imageReceiver;
    Paint oldShaderPaint;
    boolean waitingImage;
    boolean wasDrawn;
    int currentColor = -1;
    Shader shader = null;
    float[] colorFloat = new float[3];
    Path path = new Path();
    Paint paint = new Paint(1);
    float shaderCrossfadeProgress = 1.0f;

    public PremiumLockIconView(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, Path.Direction.CW);
        rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(1.5f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dpf2(4.7f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
        this.path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Path.Direction.CW);
        this.path.close();
        updateGradient();
    }

    public void setColor(int i) {
        if (this.currentColor != i) {
            this.currentColor = i;
            updateGradient();
            invalidate();
        }
    }

    private void updateGradient() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            Color.colorToHSV(this.currentColor, this.colorFloat);
            float[] fArr = this.colorFloat;
            fArr[1] = fArr[1] * 2.0f;
            if (fArr[2] > 0.8f) {
                fArr[2] = 0.8f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int blendARGB = ColorUtils.blendARGB(HSVToColor, -1, 0.5f);
            if (this.shader == null || this.color1 != HSVToColor || this.color2 != blendARGB) {
                if (this.wasDrawn) {
                    Paint paint = this.paint;
                    this.oldShaderPaint = paint;
                    paint.setAlpha(255);
                    this.shaderCrossfadeProgress = 0.0f;
                }
                this.paint = new Paint(1);
                this.color1 = HSVToColor;
                this.color2 = blendARGB;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), getMeasuredWidth(), 0.0f, new int[]{HSVToColor, blendARGB}, (float[]) null, Shader.TileMode.CLAMP);
                this.shader = linearGradient;
                this.paint.setShader(linearGradient);
                invalidate();
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.waitingImage) {
            if (this.imageReceiver.getBitmap() != null) {
                this.waitingImage = false;
                setColor(getDominantColor(this.imageReceiver.getBitmap()));
            } else {
                invalidate();
            }
        }
        if (this.oldShaderPaint == null) {
            this.shaderCrossfadeProgress = 1.0f;
        }
        float f = this.shaderCrossfadeProgress;
        if (f != 1.0f) {
            this.paint.setAlpha((int) (f * 255.0f));
            canvas.drawPath(this.path, this.oldShaderPaint);
            canvas.drawPath(this.path, this.paint);
            float f2 = this.shaderCrossfadeProgress + 0.10666667f;
            this.shaderCrossfadeProgress = f2;
            if (f2 > 1.0f) {
                this.shaderCrossfadeProgress = 1.0f;
                this.oldShaderPaint = null;
            }
            invalidate();
            this.paint.setAlpha(255);
        } else {
            canvas.drawPath(this.path, this.paint);
        }
        super.onDraw(canvas);
        this.wasDrawn = true;
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.imageReceiver = imageReceiver;
    }

    public static int getDominantColor(Bitmap bitmap) {
        if (bitmap == null) {
            return -1;
        }
        float height = (bitmap.getHeight() - 1) / 10.0f;
        float width = (bitmap.getWidth() - 1) / 10.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < 10; i5++) {
            for (int i6 = 0; i6 < 10; i6++) {
                int pixel = bitmap.getPixel((int) (i5 * width), (int) (i6 * height));
                if (pixel != 0) {
                    i2 += Color.red(pixel);
                    i3 += Color.green(pixel);
                    i4 += Color.blue(pixel);
                    i++;
                }
            }
        }
        if (i == 0) {
            return 0;
        }
        return Color.argb(255, i2 / i, i3 / i, i4 / i);
    }

    public void setWaitingImage() {
        this.waitingImage = true;
        this.wasDrawn = false;
        invalidate();
    }
}
