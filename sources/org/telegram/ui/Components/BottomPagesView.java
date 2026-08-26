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

public class BottomPagesView extends View {
    private float animatedProgress;
    private int colorKey;
    private int currentPage;
    private DecelerateInterpolator decelerateInterpolator;
    private int pagesCount;
    private Paint paint;
    private float progress;
    private RectF rect;
    private int scrollPosition;
    private int selectedColorKey;
    private ViewPager viewPager;

    public BottomPagesView(Context context, ViewPager viewPager, int i) {
        super(context);
        this.paint = new Paint(1);
        this.decelerateInterpolator = new DecelerateInterpolator();
        this.rect = new RectF();
        this.colorKey = -1;
        this.selectedColorKey = -1;
        this.viewPager = viewPager;
        this.pagesCount = i;
    }

    @Override
    public void onDraw(Canvas canvas) {
        AndroidUtilities.dp(5.0f);
        int i = this.colorKey;
        if (i >= 0) {
            this.paint.setColor((Theme.getColor(null, i, false) & 16777215) | (-1275068416));
        } else {
            Paint paint = this.paint;
            Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
            if (themeInfo == null) {
                themeInfo = Theme.defaultTheme;
            }
            paint.setColor(themeInfo.isDark() ? -11184811 : -4473925);
        }
        this.currentPage = this.viewPager.getCurrentItem();
        for (int i2 = 0; i2 < this.pagesCount; i2++) {
            if (i2 != this.currentPage) {
                int iDp = AndroidUtilities.dp(11.0f) * i2;
                this.rect.set(iDp, 0.0f, AndroidUtilities.dp(5.0f) + iDp, AndroidUtilities.dp(5.0f));
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), this.paint);
            }
        }
        int i3 = this.selectedColorKey;
        if (i3 >= 0) {
            this.paint.setColor(Theme.getColor(null, i3, false));
        } else {
            this.paint.setColor(-14509328);
        }
        int iDp2 = AndroidUtilities.dp(11.0f) * this.currentPage;
        if (this.progress == 0.0f) {
            this.rect.set(iDp2, 0.0f, AndroidUtilities.dp(5.0f) + iDp2, AndroidUtilities.dp(5.0f));
        } else if (this.scrollPosition >= this.currentPage) {
            this.rect.set(iDp2, 0.0f, (AndroidUtilities.dp(11.0f) * this.progress) + AndroidUtilities.dp(5.0f) + iDp2, AndroidUtilities.dp(5.0f));
        } else {
            this.rect.set(BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.progress, AndroidUtilities.dp(11.0f), iDp2), 0.0f, AndroidUtilities.dp(5.0f) + iDp2, AndroidUtilities.dp(5.0f));
        }
        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), this.paint);
    }

    public void setColor(int i, int i2) {
        this.colorKey = i;
        this.selectedColorKey = i2;
    }

    public void setCurrentPage(int i) {
        this.currentPage = i;
        invalidate();
    }

    public void setPageOffset(int i, float f) {
        this.progress = f;
        this.scrollPosition = i;
        invalidate();
    }
}
