package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.Theme;

public class LoadingStickerDrawable extends Drawable {
    private Bitmap bitmap;
    int currentColor0;
    int currentColor1;
    private float gradientWidth;
    private long lastUpdateTime;
    private View parentView;
    private LinearGradient placeholderGradient;
    private float totalTranslation;
    private Paint placeholderPaint = new Paint(2);
    private Matrix placeholderMatrix = new Matrix();

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public LoadingStickerDrawable(View view, String str, int i, int i2) {
        this.bitmap = SvgHelper.getBitmapByPathOnly(str, 512, 512, i, i2);
        this.parentView = view;
    }

    public void setColors(String str, String str2) {
        int color = Theme.getColor(str);
        int color2 = Theme.getColor(str2);
        if (this.currentColor0 != color || this.currentColor1 != color2) {
            this.currentColor0 = color;
            this.currentColor1 = color2;
            int averageColor = AndroidUtilities.getAverageColor(color2, color);
            this.placeholderPaint.setColor(color2);
            float dp = AndroidUtilities.dp(500.0f);
            this.gradientWidth = dp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{color2, averageColor, color2}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.placeholderGradient = linearGradient;
            linearGradient.setLocalMatrix(this.placeholderMatrix);
            Bitmap bitmap = this.bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.placeholderPaint.setShader(new ComposeShader(this.placeholderGradient, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.bitmap != null) {
            setColors("dialogBackground", "dialogBackgroundGray");
            Rect bounds = getBounds();
            canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.placeholderPaint);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.lastUpdateTime - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.lastUpdateTime = elapsedRealtime;
            this.totalTranslation += (((float) abs) * this.gradientWidth) / 1800.0f;
            while (true) {
                float f = this.totalTranslation;
                float f2 = this.gradientWidth;
                if (f >= f2 * 2.0f) {
                    this.totalTranslation = f - (f2 * 2.0f);
                } else {
                    this.placeholderMatrix.setTranslate(f, 0.0f);
                    this.placeholderGradient.setLocalMatrix(this.placeholderMatrix);
                    this.parentView.invalidate();
                    return;
                }
            }
        }
    }
}
