package org.telegram.p009ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.Theme;

public class AnimatedAvatarContainer extends FrameLayout {
    private int leftPadding;
    boolean occupyStatusBar;
    AnimatedTextView subtitleTextView;
    AnimatedTextView titleTextView;

    public AnimatedAvatarContainer(Context context) {
        super(context);
        this.occupyStatusBar = true;
        this.leftPadding = AndroidUtilities.m35dp(8.0f);
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
        this.titleTextView = animatedTextView;
        animatedTextView.setTextColor(Theme.getColor("actionBarDefaultTitle"));
        this.titleTextView.setTextSize(AndroidUtilities.m35dp(18.0f));
        this.titleTextView.setGravity(3);
        this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.titleTextView.setPadding(0, AndroidUtilities.m35dp(6.0f), 0, AndroidUtilities.m35dp(12.0f));
        addView(this.titleTextView);
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context, true, true, true);
        this.subtitleTextView = animatedTextView2;
        animatedTextView2.setTag("actionBarDefaultSubtitle");
        this.subtitleTextView.setTextColor(Theme.getColor("actionBarDefaultTitle"));
        this.subtitleTextView.setTextSize(AndroidUtilities.m35dp(14.0f));
        this.subtitleTextView.setGravity(3);
        this.subtitleTextView.setPadding(0, 0, AndroidUtilities.m35dp(10.0f), 0);
        addView(this.subtitleTextView);
        this.titleTextView.getDrawable().setAllowCancel(true);
        this.subtitleTextView.getDrawable().setAllowCancel(true);
        AnimatedTextView animatedTextView3 = this.titleTextView;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        animatedTextView3.setAnimationProperties(1.0f, 0L, 150L, cubicBezierInterpolator);
        this.subtitleTextView.setAnimationProperties(1.0f, 0L, 150L, cubicBezierInterpolator);
        setClipChildren(false);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) + this.titleTextView.getPaddingRight();
        int m35dp = size - AndroidUtilities.m35dp(16.0f);
        this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(32.0f) + this.titleTextView.getPaddingRight(), Integer.MIN_VALUE));
        this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int currentActionBarHeight = ((C1133ActionBar.getCurrentActionBarHeight() - AndroidUtilities.m35dp(42.0f)) / 2) + ((Build.VERSION.SDK_INT < 21 || !this.occupyStatusBar) ? 0 : AndroidUtilities.statusBarHeight);
        int i5 = this.leftPadding;
        if (this.subtitleTextView.getVisibility() != 8) {
            this.titleTextView.layout(i5, (AndroidUtilities.m35dp(1.0f) + currentActionBarHeight) - this.titleTextView.getPaddingTop(), this.titleTextView.getMeasuredWidth() + i5, (((this.titleTextView.getTextHeight() + currentActionBarHeight) + AndroidUtilities.m35dp(1.3f)) - this.titleTextView.getPaddingTop()) + this.titleTextView.getPaddingBottom());
        } else {
            this.titleTextView.layout(i5, (AndroidUtilities.m35dp(11.0f) + currentActionBarHeight) - this.titleTextView.getPaddingTop(), this.titleTextView.getMeasuredWidth() + i5, (((this.titleTextView.getTextHeight() + currentActionBarHeight) + AndroidUtilities.m35dp(11.0f)) - this.titleTextView.getPaddingTop()) + this.titleTextView.getPaddingBottom());
        }
        this.subtitleTextView.layout(i5, AndroidUtilities.m35dp(20.0f) + currentActionBarHeight, this.subtitleTextView.getMeasuredWidth() + i5, currentActionBarHeight + this.subtitleTextView.getTextHeight() + AndroidUtilities.m35dp(24.0f));
    }

    public AnimatedTextView getTitle() {
        return this.titleTextView;
    }

    public AnimatedTextView getSubtitleTextView() {
        return this.subtitleTextView;
    }
}
