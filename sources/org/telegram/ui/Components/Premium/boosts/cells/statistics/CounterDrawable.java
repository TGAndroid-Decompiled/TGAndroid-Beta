package org.telegram.ui.Components.Premium.boosts.cells.statistics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public class CounterDrawable extends Drawable {
    private final Paint bgPaint;
    private final RectF bgRoundRect;
    private final Drawable icon;
    private String text;
    private final TextPaint textPaint;
    private float textWith;

    @Override
    public int getOpacity() {
        return -1;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public CounterDrawable(Context context) {
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.bgPaint = textPaint2;
        this.bgRoundRect = new RectF();
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setColor(-6915073);
        this.icon = ContextCompat.getDrawable(context, R.drawable.mini_boost_badge);
    }

    public void setText(String str) {
        this.text = str;
        this.textWith = this.textPaint.measureText(str);
        invalidateSelf();
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.bgRoundRect.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        canvas.drawRoundRect(this.bgRoundRect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.bgPaint);
        this.icon.setBounds(bounds.left + AndroidUtilities.dp(2.0f), bounds.top + AndroidUtilities.dp(1.0f), bounds.left + AndroidUtilities.dp(2.0f) + this.icon.getIntrinsicWidth(), getBounds().top + AndroidUtilities.dp(1.0f) + this.icon.getIntrinsicHeight());
        this.icon.draw(canvas);
        String str = this.text;
        if (str != null) {
            canvas.drawText(str, AndroidUtilities.dp(17.0f) + bounds.left, bounds.top + AndroidUtilities.dp(14.0f), this.textPaint);
        }
    }

    @Override
    public int getIntrinsicWidth() {
        return (int) (AndroidUtilities.dp(23.0f) + this.textWith);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.0f);
    }
}
