package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.viewpager.widget.ViewPager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;

public final class BottomPagesView extends View {
    public int colorKey;
    public int currentPage;
    public final int pagesCount;
    public final Paint paint;
    public float progress;
    public final RectF rect;
    public int scrollPosition;
    public int selectedColorKey;
    public final ViewPager viewPager;

    public BottomPagesView(Context context, ViewPager viewPager, int i) {
        super(context);
        this.paint = new Paint(1);
        new DecelerateInterpolator();
        this.rect = new RectF();
        this.colorKey = -1;
        this.selectedColorKey = -1;
        this.viewPager = viewPager;
        this.pagesCount = i;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        AndroidUtilities.dp(5.0f);
        int i = this.colorKey;
        Paint paint = this.paint;
        if (i >= 0) {
            paint.setColor((Theme.getColor(null, i, false) & 16777215) | (-1275068416));
        } else {
            Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
            if (themeInfo == null) {
                themeInfo = Theme.defaultTheme;
            }
            paint.setColor(themeInfo.isDark() ? -11184811 : -4473925);
        }
        this.currentPage = this.viewPager.getCurrentItem();
        int i2 = 0;
        while (true) {
            int i3 = this.pagesCount;
            rectF = this.rect;
            if (i2 >= i3) {
                break;
            }
            if (i2 != this.currentPage) {
                int iDp = AndroidUtilities.dp(11.0f) * i2;
                rectF.set(iDp, 0.0f, AndroidUtilities.dp(5.0f) + iDp, AndroidUtilities.dp(5.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), paint);
            }
            i2++;
        }
        int i4 = this.selectedColorKey;
        if (i4 >= 0) {
            paint.setColor(Theme.getColor(null, i4, false));
        } else {
            paint.setColor(-14509328);
        }
        int iDp2 = AndroidUtilities.dp(11.0f) * this.currentPage;
        if (this.progress == 0.0f) {
            rectF.set(iDp2, 0.0f, AndroidUtilities.dp(5.0f) + iDp2, AndroidUtilities.dp(5.0f));
        } else if (this.scrollPosition >= this.currentPage) {
            rectF.set(iDp2, 0.0f, (AndroidUtilities.dp(11.0f) * this.progress) + AndroidUtilities.dp(5.0f) + iDp2, AndroidUtilities.dp(5.0f));
        } else {
            rectF.set(BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.progress, AndroidUtilities.dp(11.0f), iDp2), 0.0f, AndroidUtilities.dp(5.0f) + iDp2, AndroidUtilities.dp(5.0f));
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), paint);
    }

    public void setCurrentPage(int i) {
        this.currentPage = i;
        invalidate();
    }
}
