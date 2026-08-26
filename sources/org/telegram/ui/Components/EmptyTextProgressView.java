package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;

public final class EmptyTextProgressView extends FrameLayout {
    public static final int $r8$clinit = 0;
    public boolean inLayout;
    public final RLottieImageView lottieImageView;
    public final RadialProgressView progressView;
    public final Theme.ResourcesProvider resourcesProvider;
    public int showAtPos;
    public final TextView textView;

    public EmptyTextProgressView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, LayoutHelper.createFrame(-2.0f, -2));
        this.progressView = radialProgressView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        linearLayout.setGravity(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.lottieImageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        rLottieImageView.setImportantForAccessibility(2);
        rLottieImageView.setVisibility(8);
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(150, 150, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(Theme.getColor(Theme.key_emptyListPlaceholder, resourcesProvider));
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.NoResult));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 17));
        addView(linearLayout, LayoutHelper.createFrame(-2.0f, -2));
        AndroidUtilities.updateViewVisibilityAnimated(textView, false, 2.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(radialProgressView, false, 1.0f, false);
        setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(17));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int paddingTop;
        this.inLayout = true;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = (i5 - childAt.getMeasuredWidth()) / 2;
                RadialProgressView radialProgressView = this.progressView;
                int i8 = this.showAtPos;
                if (i8 == 2) {
                    measuredHeight = (AndroidUtilities.dp(100.0f) - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else if (i8 == 1) {
                    measuredHeight = ((i6 / 2) - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    measuredHeight = (i6 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                }
                int i9 = paddingTop + measuredHeight;
                childAt.layout(measuredWidth, i9, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight() + i9);
            }
        }
        this.inLayout = false;
    }

    @Override
    public final void requestLayout() {
        if (this.inLayout) {
            return;
        }
        super.requestLayout();
    }

    public final void setLottie(int i, int i2, int i3) {
        RLottieImageView rLottieImageView = this.lottieImageView;
        rLottieImageView.setVisibility(i != 0 ? 0 : 8);
        if (i != 0) {
            rLottieImageView.setAnimation(i, i2, i3, null);
            rLottieImageView.playAnimation();
        }
    }

    public void setProgressBarColor(int i) {
        RadialProgressView radialProgressView = this.progressView;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(i);
        }
    }

    public void setShowAtCenter(boolean z) {
        this.showAtPos = z ? 1 : 0;
    }

    public void setShowAtTop(boolean z) {
        this.showAtPos = z ? 2 : 0;
    }

    public void setText(String str) {
        this.textView.setText(str);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setTextSize(int i) {
        this.textView.setTextSize(1, i);
    }

    public void setTopImage(int i) {
        TextView textView = this.textView;
        if (i == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable drawableMutate = getContext().getResources().getDrawable(i).mutate();
        if (drawableMutate != null) {
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_emptyListPlaceholder, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableMutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(1.0f));
    }

    public final void showProgress() {
        AndroidUtilities.updateViewVisibilityAnimated(this.textView, false, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, true, 1.0f, true);
    }

    public final void showTextView() {
        AndroidUtilities.updateViewVisibilityAnimated(this.textView, true, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 1.0f, true);
    }
}
