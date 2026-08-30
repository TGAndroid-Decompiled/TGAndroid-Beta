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
public final class mz extends FrameLayout {
    public static final int h = 0;
    public final org.telegram.ui.ActionBar.f6 f27140a;
    public final TextView f27141b;
    public final View f27142c;
    public final jj0 d;
    public boolean e;
    public int f27143f;

    public mz(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f27140a = f6Var;
        View radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, k7.b6.c(-2.0f, -2));
        this.f27142c = radialProgressView;
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
        linearLayout.addView((View) imageView, k7.b6.t(150, 150, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.f27141b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19889c7, f6Var));
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.NoResult));
        linearLayout.addView(textView, k7.b6.q(-2, -2, 17));
        addView(linearLayout, k7.b6.c(-2.0f, -2));
        AndroidUtilities.updateViewVisibilityAnimated(textView, false, 2.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(radialProgressView, false, 1.0f, false);
        setOnTouchListener(new oh.d(18));
    }

    public final void a(int i10, int i11, int i12) {
        int i13;
        if (i10 != 0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        jj0 jj0Var = this.d;
        jj0Var.setVisibility(i13);
        if (i10 != 0) {
            jj0Var.f(i10, i11, i12, null);
            jj0Var.d();
        }
    }

    public final void b() {
        AndroidUtilities.updateViewVisibilityAnimated(this.f27141b, false, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.f27142c, true, 1.0f, true);
    }

    public final void c() {
        AndroidUtilities.updateViewVisibilityAnimated(this.f27141b, true, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.f27142c, false, 1.0f, true);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int paddingTop;
        this.e = true;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = (i14 - childAt.getMeasuredWidth()) / 2;
                View view = this.f27142c;
                if (childAt == view && (view instanceof t00)) {
                    measuredHeight = (i15 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    int i17 = this.f27143f;
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
        this.e = false;
    }

    @Override
    public final void requestLayout() {
        if (!this.e) {
            super.requestLayout();
        }
    }

    public void setProgressBarColor(int i10) {
        View view = this.f27142c;
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        }
    }

    public void setShowAtCenter(boolean z4) {
        this.f27143f = z4 ? 1 : 0;
    }

    public void setShowAtTop(boolean z4) {
        int i10;
        if (z4) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f27143f = i10;
    }

    public void setText(String str) {
        this.f27141b.setText(str);
    }

    public void setTextColor(int i10) {
        this.f27141b.setTextColor(i10);
    }

    public void setTextSize(int i10) {
        this.f27141b.setTextSize(1, i10);
    }

    public void setTopImage(int i10) {
        TextView textView = this.f27141b;
        if (i10 == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        if (mutate != null) {
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19889c7, this.f27140a), PorterDuff.Mode.MULTIPLY));
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(1.0f));
    }
}
