package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public class AnimatedAvatarContainer extends FrameLayout {
    private int leftPadding;
    boolean occupyStatusBar;
    AnimatedTextView subtitleTextView;
    AnimatedTextView titleTextView;

    public AnimatedAvatarContainer(Context context) {
        super(context);
        this.occupyStatusBar = true;
        this.leftPadding = AndroidUtilities.dp(8.0f);
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
        this.titleTextView = animatedTextView;
        int i = Theme.key_actionBarDefaultTitle;
        animatedTextView.setTextColor(Theme.getColor(null, i, false));
        this.titleTextView.setTextSize(AndroidUtilities.dp(18.0f));
        this.titleTextView.setGravity(3);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        this.titleTextView.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
        addView(this.titleTextView);
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context, true, true, true);
        this.subtitleTextView = animatedTextView2;
        animatedTextView2.setTag(Integer.valueOf(Theme.key_actionBarDefaultSubtitle));
        this.subtitleTextView.setTextColor(Theme.getColor(null, i, false));
        this.subtitleTextView.setTextSize(AndroidUtilities.dp(14.0f));
        this.subtitleTextView.setGravity(3);
        this.subtitleTextView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        addView(this.subtitleTextView);
        this.titleTextView.getDrawable().setAllowCancel(true);
        this.subtitleTextView.getDrawable().setAllowCancel(true);
        AnimatedTextView animatedTextView3 = this.titleTextView;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        animatedTextView3.setAnimationProperties(1.0f, 0L, 150L, cubicBezierInterpolator);
        this.subtitleTextView.setAnimationProperties(1.0f, 0L, 150L, cubicBezierInterpolator);
        setClipChildren(false);
    }

    public AnimatedTextView getSubtitleTextView() {
        return this.subtitleTextView;
    }

    public AnimatedTextView getTitle() {
        return this.titleTextView;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM$2 = OKLCH.m$2(42.0f, ActionBar.getCurrentActionBarHeight(), 2) + (this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0);
        int i5 = this.leftPadding;
        if (this.subtitleTextView.getVisibility() != 8) {
            this.titleTextView.layout(i5, (AndroidUtilities.dp(1.0f) + iM$2) - this.titleTextView.getPaddingTop(), this.titleTextView.getMeasuredWidth() + i5, this.titleTextView.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (this.titleTextView.getTextHeight() + iM$2)) - this.titleTextView.getPaddingTop()));
        } else {
            this.titleTextView.layout(i5, (AndroidUtilities.dp(11.0f) + iM$2) - this.titleTextView.getPaddingTop(), this.titleTextView.getMeasuredWidth() + i5, this.titleTextView.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (this.titleTextView.getTextHeight() + iM$2)) - this.titleTextView.getPaddingTop()));
        }
        this.subtitleTextView.layout(i5, AndroidUtilities.dp(20.0f) + iM$2, this.subtitleTextView.getMeasuredWidth() + i5, AndroidUtilities.dp(24.0f) + this.subtitleTextView.getTextHeight() + iM$2);
    }

    @Override
    public void onMeasure(int i, int i2) {
        int paddingRight = this.titleTextView.getPaddingRight() + View.MeasureSpec.getSize(i);
        int iDp = paddingRight - AndroidUtilities.dp(16.0f);
        this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.titleTextView.getPaddingRight() + AndroidUtilities.dp(32.0f), Integer.MIN_VALUE));
        this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i2));
    }
}
