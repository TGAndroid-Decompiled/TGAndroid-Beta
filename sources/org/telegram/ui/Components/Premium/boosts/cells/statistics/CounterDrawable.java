package org.telegram.ui.Components.Premium.boosts.cells.statistics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class CounterDrawable extends Drawable {
    public final TextPaint bgPaint;
    public final RectF bgRoundRect;
    public final Drawable icon;
    public String text;
    public final TextPaint textPaint;
    public float textWith;

    public CounterDrawable(Context context) {
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.bgPaint = textPaint2;
        this.bgRoundRect = new RectF();
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint2.setColor(-6915073);
        this.icon = context.getDrawable(R.drawable.mini_boost_badge);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.bgRoundRect;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.bgPaint);
        int iDp = AndroidUtilities.dp(2.0f) + bounds.left;
        int iDp2 = AndroidUtilities.dp(1.0f) + bounds.top;
        int iDp3 = AndroidUtilities.dp(2.0f) + bounds.left;
        Drawable drawable = this.icon;
        drawable.setBounds(iDp, iDp2, drawable.getIntrinsicWidth() + iDp3, drawable.getIntrinsicHeight() + AndroidUtilities.dp(1.0f) + getBounds().top);
        drawable.draw(canvas);
        String str = this.text;
        if (str != null) {
            canvas.drawText(str, AndroidUtilities.dp(16.5f) + bounds.left, AndroidUtilities.dp(13.0f) + bounds.top, this.textPaint);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (AndroidUtilities.dp(23.0f) + this.textWith);
    }

    @Override
    public final int getOpacity() {
        return -1;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
