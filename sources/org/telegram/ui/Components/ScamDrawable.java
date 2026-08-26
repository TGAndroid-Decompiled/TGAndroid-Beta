package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ScamDrawable extends Drawable {
    public final int alpha;
    public int colorAlpha;
    public final int currentType;
    public final Paint paint;
    public final RectF rect = new RectF();
    public String text;
    public final TextPaint textPaint;
    public int textWidth;

    public ScamDrawable(int i) {
        Paint paint = new Paint(1);
        this.paint = paint;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.colorAlpha = 255;
        this.alpha = 255;
        this.currentType = i;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i == 0) {
            this.text = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.text = LocaleController.getString(R.string.FakeMessage);
        }
        this.textWidth = (int) Math.ceil(textPaint.measureText(this.text));
    }

    public final void checkText() {
        String string = this.currentType == 0 ? LocaleController.getString(R.string.ScamMessage) : LocaleController.getString(R.string.FakeMessage);
        if (string.equals(this.text)) {
            return;
        }
        this.text = string;
        this.textWidth = (int) Math.ceil(this.textPaint.measureText(string));
    }

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = this.rect;
        rectF.set(getBounds());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint);
        canvas.drawText(this.text, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.textPaint);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(16.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(10.0f) + this.textWidth;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        if (this.alpha != i) {
            int i2 = (int) ((i / 255.0f) * this.colorAlpha);
            this.paint.setAlpha(i2);
            this.textPaint.setAlpha(i2);
        }
    }

    public final void setColor(int i) {
        this.textPaint.setColor(i);
        this.paint.setColor(i);
        this.colorAlpha = Color.alpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
