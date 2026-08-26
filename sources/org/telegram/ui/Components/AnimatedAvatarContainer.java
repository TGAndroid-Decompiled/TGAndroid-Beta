package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public final class AnimatedAvatarContainer extends FrameLayout {
    public final int leftPadding;
    public final boolean occupyStatusBar;
    public final AnimatedTextView subtitleTextView;
    public final AnimatedTextView titleTextView;

    public AnimatedAvatarContainer(Activity activity) {
        super(activity);
        this.occupyStatusBar = true;
        this.leftPadding = AndroidUtilities.dp(8.0f);
        AnimatedTextView animatedTextView = new AnimatedTextView(activity, true, true, true);
        this.titleTextView = animatedTextView;
        int i = Theme.key_actionBarDefaultTitle;
        animatedTextView.setTextColor(Theme.getColor(null, i, false));
        animatedTextView.setTextSize(AndroidUtilities.dp(18.0f));
        animatedTextView.setGravity(3);
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
        addView(animatedTextView);
        AnimatedTextView animatedTextView2 = new AnimatedTextView(activity, true, true, true);
        this.subtitleTextView = animatedTextView2;
        animatedTextView2.setTag(Integer.valueOf(Theme.key_actionBarDefaultSubtitle));
        animatedTextView2.setTextColor(Theme.getColor(null, i, false));
        animatedTextView2.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView2.setGravity(3);
        animatedTextView2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        addView(animatedTextView2);
        animatedTextView.getDrawable().allowCancel = true;
        animatedTextView2.getDrawable().allowCancel = true;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView.drawable;
        animatedTextDrawable.moveAmplitude = 1.0f;
        animatedTextDrawable.animateDuration = 150L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = animatedTextView2.drawable;
        animatedTextDrawable2.moveAmplitude = 1.0f;
        animatedTextDrawable2.animateDuration = 150L;
        animatedTextDrawable2.animateWave = 1.0f;
        animatedTextDrawable2.animateInterpolator = cubicBezierInterpolator;
        setClipChildren(false);
    }

    public AnimatedTextView getSubtitleTextView() {
        return this.subtitleTextView;
    }

    public AnimatedTextView getTitle() {
        return this.titleTextView;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM$2 = OKLCH.m$2(42.0f, ActionBar.getCurrentActionBarHeight(), 2) + (this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0);
        AnimatedTextView animatedTextView = this.subtitleTextView;
        int visibility = animatedTextView.getVisibility();
        AnimatedTextView animatedTextView2 = this.titleTextView;
        int i5 = this.leftPadding;
        if (visibility != 8) {
            animatedTextView2.layout(i5, (AndroidUtilities.dp(1.0f) + iM$2) - animatedTextView2.getPaddingTop(), animatedTextView2.getMeasuredWidth() + i5, animatedTextView2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (animatedTextView2.getTextHeight() + iM$2)) - animatedTextView2.getPaddingTop()));
        } else {
            animatedTextView2.layout(i5, (AndroidUtilities.dp(11.0f) + iM$2) - animatedTextView2.getPaddingTop(), animatedTextView2.getMeasuredWidth() + i5, animatedTextView2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (animatedTextView2.getTextHeight() + iM$2)) - animatedTextView2.getPaddingTop()));
        }
        animatedTextView.layout(i5, AndroidUtilities.dp(20.0f) + iM$2, animatedTextView.getMeasuredWidth() + i5, AndroidUtilities.dp(24.0f) + animatedTextView.getTextHeight() + iM$2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        AnimatedTextView animatedTextView = this.titleTextView;
        int paddingRight = animatedTextView.getPaddingRight() + size;
        int iDp = paddingRight - AndroidUtilities.dp(16.0f);
        animatedTextView.measure(View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(animatedTextView.getPaddingRight() + AndroidUtilities.dp(32.0f), Integer.MIN_VALUE));
        this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i2));
    }
}
