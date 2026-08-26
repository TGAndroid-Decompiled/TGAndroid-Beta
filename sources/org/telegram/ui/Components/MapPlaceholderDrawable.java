package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class MapPlaceholderDrawable extends Drawable {
    private Paint linePaint;
    private Paint paint;

    public MapPlaceholderDrawable(boolean z) {
        this.paint = new Paint();
        Paint paint = new Paint();
        this.linePaint = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (z) {
            this.paint.setColor(-14865331);
            this.linePaint.setColor(-15854042);
        } else {
            this.paint.setColor(-2172970);
            this.linePaint.setColor(-3752002);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRect(getBounds(), this.paint);
        int iDp = AndroidUtilities.dp(9.0f);
        int iWidth = getBounds().width() / iDp;
        int iHeight = getBounds().height() / iDp;
        int i = getBounds().left;
        int i2 = getBounds().top;
        int i3 = 0;
        int i4 = 0;
        while (i4 < iWidth) {
            int i5 = i4 + 1;
            float f = (iDp * i5) + i;
            canvas.drawLine(f, i2, f, getBounds().height() + i2, this.linePaint);
            i4 = i5;
        }
        while (i3 < iHeight) {
            i3++;
            float f2 = (iDp * i3) + i2;
            canvas.drawLine(i, f2, getBounds().width() + i, f2, this.linePaint);
        }
    }

    @Override
    public int getIntrinsicHeight() {
        return 0;
    }

    @Override
    public int getIntrinsicWidth() {
        return 0;
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public MapPlaceholderDrawable() {
        Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
        this((themeInfo == null ? Theme.defaultTheme : themeInfo).isDark());
    }
}
