package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uz extends FrameLayout {
    public static final int h = 0;
    public final org.telegram.ui.ActionBar.u6 f33512a;
    public final TextView f33513b;
    public final View f33514c;
    public final ak0 d;
    public boolean e;
    public int f33515f;

    public uz(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f33512a = u6Var;
        View radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, gb1.g(-2.0f, -2));
        this.f33514c = radialProgressView;
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
        linearLayout.addView((View) imageView, gb1.x(150, 150, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.f33513b = textView;
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23338c7, u6Var);
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.NoResult));
        linearLayout.addView(textView, gb1.u(-2, -2, 17));
        addView(linearLayout, gb1.g(-2.0f, -2));
        AndroidUtilities.updateViewVisibilityAnimated(textView, false, 2.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(radialProgressView, false, 1.0f, false);
        setOnTouchListener(new ei.d(18));
    }

    public final void a(int i10, int i11, int i12) {
        int i13;
        if (i10 != 0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        ak0 ak0Var = this.d;
        ak0Var.setVisibility(i13);
        if (i10 != 0) {
            ak0Var.f(i10, i11, i12, null);
            ak0Var.d();
        }
    }

    public final void b() {
        AndroidUtilities.updateViewVisibilityAnimated(this.f33513b, false, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.f33514c, true, 1.0f, true);
    }

    public final void c() {
        AndroidUtilities.updateViewVisibilityAnimated(this.f33513b, true, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.f33514c, false, 1.0f, true);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
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
                View view = this.f33514c;
                if (childAt == view && (view instanceof c10)) {
                    measuredHeight = (i15 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    int i17 = this.f33515f;
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
        View view = this.f33514c;
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        }
    }

    public void setShowAtCenter(boolean z10) {
        this.f33515f = z10 ? 1 : 0;
    }

    public void setShowAtTop(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f33515f = i10;
    }

    public void setText(String str) {
        this.f33513b.setText(str);
    }

    public void setTextColor(int i10) {
        TextView textView = this.f33513b;
        org.telegram.ui.ActionBar.f7.r(textView);
        textView.setTextColor(i10);
    }

    public void setTextSize(int i10) {
        this.f33513b.setTextSize(1, i10);
    }

    public void setTopImage(int i10) {
        TextView textView = this.f33513b;
        if (i10 == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        if (mutate != null) {
            org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.f23338c7, this.f33512a, PorterDuff.Mode.MULTIPLY);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(1.0f));
    }
}
