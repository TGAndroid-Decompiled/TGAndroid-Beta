package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;

public class EmptyTextProgressView extends FrameLayout {
    private boolean inLayout;
    private RLottieImageView lottieImageView;
    private View progressView;
    private final Theme.ResourcesProvider resourcesProvider;
    private int showAtPos;
    private TextView textView;
    private LinearLayout textViewLayout;

    public static boolean lambda$new$0(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public EmptyTextProgressView(Context context) {
        this(context, null, null);
    }

    public EmptyTextProgressView(Context context, View view, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        View view2 = view;
        this.resourcesProvider = resourcesProvider;
        if (view2 == null) {
            view2 = new RadialProgressView(context);
            addView(view2, LayoutHelper.createFrame(-2, -2.0f));
        } else {
            addView(view2, LayoutHelper.createFrame(-1, -1.0f));
        }
        this.progressView = view2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.textViewLayout = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        this.textViewLayout.setGravity(1);
        this.textViewLayout.setClipChildren(false);
        this.textViewLayout.setClipToPadding(false);
        this.textViewLayout.setOrientation(1);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.lottieImageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.lottieImageView.setImportantForAccessibility(2);
        this.lottieImageView.setVisibility(8);
        this.textViewLayout.addView(this.lottieImageView, LayoutHelper.createLinear((int) ImageReceiver.DEFAULT_CROSSFADE_DURATION, (int) ImageReceiver.DEFAULT_CROSSFADE_DURATION, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 20.0f);
        this.textView.setTextColor(getThemedColor("emptyListPlaceholder"));
        this.textView.setGravity(1);
        this.textView.setText(LocaleController.getString("NoResult", R.string.NoResult));
        this.textViewLayout.addView(this.textView, LayoutHelper.createLinear(-2, -2, 17));
        addView(this.textViewLayout, LayoutHelper.createFrame(-2, -2.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.textView, false, 2.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(view2, false, 1.0f, false);
        setOnTouchListener(EmptyTextProgressView$$ExternalSyntheticLambda0.INSTANCE);
    }

    public void showProgress() {
        showProgress(true);
    }

    public void showProgress(boolean z) {
        AndroidUtilities.updateViewVisibilityAnimated(this.textView, false, 0.9f, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, true, 1.0f, z);
    }

    public void showTextView() {
        AndroidUtilities.updateViewVisibilityAnimated(this.textView, true, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 1.0f, true);
    }

    public void setText(String str) {
        this.textView.setText(str);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setLottie(int i, int i2, int i3) {
        this.lottieImageView.setVisibility(i != 0 ? 0 : 8);
        if (i != 0) {
            this.lottieImageView.setAnimation(i, i2, i3);
            this.lottieImageView.playAnimation();
        }
    }

    public void setProgressBarColor(int i) {
        View view = this.progressView;
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i);
        }
    }

    public void setTopImage(int i) {
        if (i == 0) {
            this.textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        if (mutate != null) {
            mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor("emptyListPlaceholder"), PorterDuff.Mode.MULTIPLY));
        }
        this.textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
        this.textView.setCompoundDrawablePadding(AndroidUtilities.dp(1.0f));
    }

    public void setTextSize(int i) {
        this.textView.setTextSize(1, i);
    }

    public void setShowAtCenter(boolean z) {
        this.showAtPos = z ? 1 : 0;
    }

    public void setShowAtTop(boolean z) {
        this.showAtPos = z ? 2 : 0;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        this.inLayout = true;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = (i7 - childAt.getMeasuredWidth()) / 2;
                View view = this.progressView;
                if (childAt != view || !(view instanceof FlickerLoadingView)) {
                    int i10 = this.showAtPos;
                    if (i10 == 2) {
                        i5 = (AndroidUtilities.dp(100.0f) - childAt.getMeasuredHeight()) / 2;
                        i6 = getPaddingTop();
                    } else if (i10 == 1) {
                        i5 = ((i8 / 2) - childAt.getMeasuredHeight()) / 2;
                        i6 = getPaddingTop();
                    } else {
                        i5 = (i8 - childAt.getMeasuredHeight()) / 2;
                        i6 = getPaddingTop();
                    }
                } else {
                    i5 = (i8 - childAt.getMeasuredHeight()) / 2;
                    i6 = getPaddingTop();
                }
                int i11 = i5 + i6;
                childAt.layout(measuredWidth, i11, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight() + i11);
            }
        }
        this.inLayout = false;
    }

    @Override
    public void requestLayout() {
        if (!this.inLayout) {
            super.requestLayout();
        }
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
