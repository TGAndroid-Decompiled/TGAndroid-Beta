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
public final class oz extends FrameLayout {
    public static final int h = 0;
    public final org.telegram.ui.ActionBar.g6 f29919a;
    public final TextView f29920b;
    public final View f29921c;
    public final kj0 d;
    public boolean f29922e;
    public int f29923f;

    public oz(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f29919a = g6Var;
        View radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, k7.c6.c(-2.0f, -2));
        this.f29921c = radialProgressView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        linearLayout.setGravity(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImportantForAccessibility(2);
        imageView.setVisibility(8);
        linearLayout.addView((View) imageView, k7.c6.t(150, 150, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.f29920b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21644c7, g6Var));
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.NoResult));
        linearLayout.addView(textView, k7.c6.q(-2, -2, 17));
        addView(linearLayout, k7.c6.c(-2.0f, -2));
        AndroidUtilities.updateViewVisibilityAnimated(textView, false, 2.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(radialProgressView, false, 1.0f, false);
        setOnTouchListener(new org.telegram.ui.ActionBar.s2(17));
    }

    public final void a(int i10, int i11, int i12) {
        int i13;
        if (i10 != 0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        kj0 kj0Var = this.d;
        kj0Var.setVisibility(i13);
        if (i10 != 0) {
            kj0Var.f(i10, i11, i12, null);
            kj0Var.d();
        }
    }

    public final void b() {
        AndroidUtilities.updateViewVisibilityAnimated(this.f29920b, false, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.f29921c, true, 1.0f, true);
    }

    public final void c() {
        AndroidUtilities.updateViewVisibilityAnimated(this.f29920b, true, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.f29921c, false, 1.0f, true);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int paddingTop;
        this.f29922e = true;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = (i14 - childAt.getMeasuredWidth()) / 2;
                View view = this.f29921c;
                if (childAt == view && (view instanceof u00)) {
                    measuredHeight = (i15 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    int i17 = this.f29923f;
                    if (i17 == 2) {
                        measuredHeight = (AndroidUtilities.dp(100.0f) - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    } else if (i17 == 1) {
                        measuredHeight = ((i15 / 2) - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    } else {
                        measuredHeight = (i15 - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    }
                }
                int i18 = paddingTop + measuredHeight;
                childAt.layout(measuredWidth, i18, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight() + i18);
            }
        }
        this.f29922e = false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f29922e) {
            super.requestLayout();
        }
    }

    public void setProgressBarColor(int i10) {
        View view = this.f29921c;
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        }
    }

    public void setShowAtCenter(boolean z4) {
        this.f29923f = z4 ? 1 : 0;
    }

    public void setShowAtTop(boolean z4) {
        int i10;
        if (z4) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f29923f = i10;
    }

    public void setText(String str) {
        this.f29920b.setText(str);
    }

    public void setTextColor(int i10) {
        this.f29920b.setTextColor(i10);
    }

    public void setTextSize(int i10) {
        this.f29920b.setTextSize(1, i10);
    }

    public void setTopImage(int i10) {
        TextView textView = this.f29920b;
        if (i10 == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        if (mutate != null) {
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21644c7, this.f29919a), PorterDuff.Mode.MULTIPLY));
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(1.0f));
    }
}
