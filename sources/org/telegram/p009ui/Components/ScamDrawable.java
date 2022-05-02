package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.LocaleController;

public class ScamDrawable extends Drawable {
    private int currentType;
    private String text;
    private TextPaint textPaint;
    private int textWidth;
    private RectF rect = new RectF();
    private Paint paint = new Paint(1);

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

    public ScamDrawable(int i, int i2) {
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.currentType = i2;
        textPaint.setTextSize(AndroidUtilities.m34dp(i));
        this.textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(AndroidUtilities.m34dp(1.0f));
        if (i2 == 0) {
            this.text = LocaleController.getString("ScamMessage", C0952R.string.ScamMessage);
        } else {
            this.text = LocaleController.getString("FakeMessage", C0952R.string.FakeMessage);
        }
        this.textWidth = (int) Math.ceil(this.textPaint.measureText(this.text));
    }

    public void checkText() {
        String str;
        if (this.currentType == 0) {
            str = LocaleController.getString("ScamMessage", C0952R.string.ScamMessage);
        } else {
            str = LocaleController.getString("FakeMessage", C0952R.string.FakeMessage);
        }
        if (!str.equals(this.text)) {
            this.text = str;
            this.textWidth = (int) Math.ceil(this.textPaint.measureText(str));
        }
    }

    public void setColor(int i) {
        this.textPaint.setColor(i);
        this.paint.setColor(i);
    }

    @Override
    public int getIntrinsicWidth() {
        return this.textWidth + AndroidUtilities.m34dp(10.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.m34dp(16.0f);
    }

    @Override
    public void draw(Canvas canvas) {
        this.rect.set(getBounds());
        canvas.drawRoundRect(this.rect, AndroidUtilities.m34dp(2.0f), AndroidUtilities.m34dp(2.0f), this.paint);
        canvas.drawText(this.text, this.rect.left + AndroidUtilities.m34dp(5.0f), this.rect.top + AndroidUtilities.m34dp(12.0f), this.textPaint);
    }
}
