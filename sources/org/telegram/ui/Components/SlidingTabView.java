package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class SlidingTabView extends LinearLayout {
    private float animateTabXTo;
    private SlidingTabViewDelegate delegate;
    private DecelerateInterpolator interpolator;
    private Paint paint;
    private int selectedTab;
    private long startAnimationTime;
    private float startAnimationX;
    private int tabCount;
    private float tabWidth;
    private float tabX;
    private long totalAnimationDiff;

    public interface SlidingTabViewDelegate {
        void didSelectTab(int i);
    }

    public SlidingTabView(Context context) {
        super(context);
        this.selectedTab = 0;
        this.tabCount = 0;
        this.tabWidth = 0.0f;
        this.tabX = 0.0f;
        this.animateTabXTo = 0.0f;
        this.paint = new Paint();
        this.startAnimationTime = 0L;
        this.totalAnimationDiff = 0L;
        this.startAnimationX = 0.0f;
        setOrientation(0);
        setWeightSum(100.0f);
        this.paint.setColor(-1);
        setWillNotDraw(false);
        this.interpolator = new DecelerateInterpolator();
    }

    private void animateToTab(int i) {
        this.animateTabXTo = i * this.tabWidth;
        this.startAnimationX = this.tabX;
        this.totalAnimationDiff = 0L;
        this.startAnimationTime = System.currentTimeMillis();
        invalidate();
    }

    public void didSelectTab(int i) {
        if (this.selectedTab == i) {
            return;
        }
        this.selectedTab = i;
        animateToTab(i);
        SlidingTabViewDelegate slidingTabViewDelegate = this.delegate;
        if (slidingTabViewDelegate != null) {
            slidingTabViewDelegate.didSelectTab(i);
        }
    }

    public void addTextTab(final int i, String str) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setFocusable(true);
        textView.setGravity(17);
        textView.setSingleLine();
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setBackgroundDrawable(Theme.createSelectorDrawable(-12763843, 0, -1));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SlidingTabView.this.didSelectTab(i);
            }
        });
        addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = 0;
        layoutParams.weight = 50.0f;
        textView.setLayoutParams(layoutParams);
        this.tabCount++;
    }

    public int getSeletedTab() {
        return this.selectedTab;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.tabX != this.animateTabXTo) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.startAnimationTime;
            this.startAnimationTime = System.currentTimeMillis();
            long j = this.totalAnimationDiff + jCurrentTimeMillis;
            this.totalAnimationDiff = j;
            if (j > 200) {
                this.totalAnimationDiff = 200L;
                this.tabX = this.animateTabXTo;
            } else {
                this.tabX = DiffUtil.m(this.animateTabXTo, this.startAnimationX, this.interpolator.getInterpolation(j / 200.0f), this.startAnimationX);
                invalidate();
            }
        }
        canvas.drawRect(this.tabX, getHeight() - AndroidUtilities.dp(2.0f), this.tabX + this.tabWidth, getHeight(), this.paint);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float f = (i3 - i) / this.tabCount;
        this.tabWidth = f;
        float f2 = f * this.selectedTab;
        this.tabX = f2;
        this.animateTabXTo = f2;
    }

    public void setDelegate(SlidingTabViewDelegate slidingTabViewDelegate) {
        this.delegate = slidingTabViewDelegate;
    }
}
