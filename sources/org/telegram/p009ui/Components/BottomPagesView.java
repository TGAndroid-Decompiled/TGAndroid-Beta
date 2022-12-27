package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.viewpager.widget.ViewPager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ActionBar.Theme;

public class BottomPagesView extends View {
    private String colorKey;
    private int currentPage;
    private int pagesCount;
    private Paint paint;
    private float progress;
    private RectF rect;
    private int scrollPosition;
    private String selectedColorKey;
    private ViewPager viewPager;

    public BottomPagesView(Context context, ViewPager viewPager, int i) {
        super(context);
        this.paint = new Paint(1);
        new DecelerateInterpolator();
        this.rect = new RectF();
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
        AndroidUtilities.m36dp(5.0f);
        String str = this.colorKey;
        if (str != null) {
            this.paint.setColor((Theme.getColor(str) & 16777215) | (-1275068416));
        } else {
            this.paint.setColor(Theme.getCurrentTheme().isDark() ? -11184811 : -4473925);
        }
        this.currentPage = this.viewPager.getCurrentItem();
        for (int i = 0; i < this.pagesCount; i++) {
            if (i != this.currentPage) {
                int m36dp = AndroidUtilities.m36dp(11.0f) * i;
                this.rect.set(m36dp, 0.0f, m36dp + AndroidUtilities.m36dp(5.0f), AndroidUtilities.m36dp(5.0f));
                canvas.drawRoundRect(this.rect, AndroidUtilities.m36dp(2.5f), AndroidUtilities.m36dp(2.5f), this.paint);
            }
        }
        String str2 = this.selectedColorKey;
        if (str2 != null) {
            this.paint.setColor(Theme.getColor(str2));
        } else {
            this.paint.setColor(-13851168);
        }
        int m36dp2 = this.currentPage * AndroidUtilities.m36dp(11.0f);
        if (this.progress != 0.0f) {
            if (this.scrollPosition >= this.currentPage) {
                this.rect.set(m36dp2, 0.0f, m36dp2 + AndroidUtilities.m36dp(5.0f) + (AndroidUtilities.m36dp(11.0f) * this.progress), AndroidUtilities.m36dp(5.0f));
            } else {
                this.rect.set(m36dp2 - (AndroidUtilities.m36dp(11.0f) * (1.0f - this.progress)), 0.0f, m36dp2 + AndroidUtilities.m36dp(5.0f), AndroidUtilities.m36dp(5.0f));
            }
        } else {
            this.rect.set(m36dp2, 0.0f, m36dp2 + AndroidUtilities.m36dp(5.0f), AndroidUtilities.m36dp(5.0f));
        }
        canvas.drawRoundRect(this.rect, AndroidUtilities.m36dp(2.5f), AndroidUtilities.m36dp(2.5f), this.paint);
    }
}
