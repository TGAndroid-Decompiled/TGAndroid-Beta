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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.Theme;

public final class LoadingStickerDrawable extends Drawable {
    public final Bitmap bitmap;
    public int currentColor0;
    public int currentColor1;
    public float gradientWidth;
    public long lastUpdateTime;
    public final BackupImageView parentView;
    public LinearGradient placeholderGradient;
    public float totalTranslation;
    public final Paint placeholderPaint = new Paint(2);
    public final Matrix placeholderMatrix = new Matrix();

    public LoadingStickerDrawable(BackupImageView backupImageView, String str, int i, int i2) {
        this.bitmap = SvgHelper.getBitmapByPathOnly(str, 512, 512, i, i2);
        this.parentView = backupImageView;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return;
        }
        int i = Theme.key_dialogBackground;
        int i2 = Theme.key_dialogBackgroundGray;
        int color = Theme.getColor(null, i, false);
        int color2 = Theme.getColor(null, i2, false);
        int i3 = this.currentColor0;
        Matrix matrix = this.placeholderMatrix;
        Paint paint = this.placeholderPaint;
        if (i3 != color || this.currentColor1 != color2) {
            this.currentColor0 = color;
            this.currentColor1 = color2;
            int averageColor = AndroidUtilities.getAverageColor(color2, color);
            paint.setColor(color2);
            float fDp = AndroidUtilities.dp(500.0f);
            this.gradientWidth = fDp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, fDp, 0.0f, new int[]{color2, averageColor, color2}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.placeholderGradient = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.placeholderGradient, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jAbs = Math.abs(this.lastUpdateTime - jElapsedRealtime);
        if (jAbs > 17) {
            jAbs = 16;
        }
        this.lastUpdateTime = jElapsedRealtime;
        this.totalTranslation = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(jAbs, this.gradientWidth, 1800.0f, this.totalTranslation);
        while (true) {
            float f = this.totalTranslation;
            float f2 = this.gradientWidth * 2.0f;
            if (f < f2) {
                matrix.setTranslate(f, 0.0f);
                this.placeholderGradient.setLocalMatrix(matrix);
                this.parentView.invalidate();
                return;
            }
            this.totalTranslation = f - f2;
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
