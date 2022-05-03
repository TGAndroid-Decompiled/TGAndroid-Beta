package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.viewpager.widget.ViewPager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class BottomPagesView extends View {
    private String colorKey;
    private int currentPage;
    private int pagesCount;
    private float progress;
    private int scrollPosition;
    private String selectedColorKey;
    private ViewPager viewPager;
    private Paint paint = new Paint(1);
    private RectF rect = new RectF();

    public BottomPagesView(Context context, ViewPager viewPager, int i) {
        super(context);
        new DecelerateInterpolator();
        this.viewPager = viewPager;
        this.pagesCount = i;
    }

    public void setPageOffset(int i, float f) {
        this.progress = f;
        this.scrollPosition = i;
        invalidate();
    }

    public void setCurrentPage(int i) {
        this.currentPage = i;
        invalidate();
    }

    public void setColor(String str, String str2) {
        this.colorKey = str;
        this.selectedColorKey = str2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        AndroidUtilities.dp(5.0f);
        String str = this.colorKey;
        if (str != null) {
            this.paint.setColor((Theme.getColor(str) & 16777215) | (-1275068416));
        } else {
            this.paint.setColor(Theme.getCurrentTheme().isDark() ? -11184811 : -4473925);
        }
        this.currentPage = this.viewPager.getCurrentItem();
        for (int i = 0; i < this.pagesCount; i++) {
            if (i != this.currentPage) {
                int dp = AndroidUtilities.dp(11.0f) * i;
                this.rect.set(dp, 0.0f, dp + AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), this.paint);
            }
        }
        String str2 = this.selectedColorKey;
        if (str2 != null) {
            this.paint.setColor(Theme.getColor(str2));
        } else {
            this.paint.setColor(-13851168);
        }
        int dp2 = this.currentPage * AndroidUtilities.dp(11.0f);
        if (this.progress == 0.0f) {
            this.rect.set(dp2, 0.0f, dp2 + AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
        } else if (this.scrollPosition >= this.currentPage) {
            this.rect.set(dp2, 0.0f, dp2 + AndroidUtilities.dp(5.0f) + (AndroidUtilities.dp(11.0f) * this.progress), AndroidUtilities.dp(5.0f));
        } else {
            this.rect.set(dp2 - (AndroidUtilities.dp(11.0f) * (1.0f - this.progress)), 0.0f, dp2 + AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
        }
        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), this.paint);
    }
}
