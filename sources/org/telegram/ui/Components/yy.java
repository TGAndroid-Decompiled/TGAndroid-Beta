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
public final class yy extends FrameLayout {
    public static final int h = 0;
    public final org.telegram.ui.ActionBar.b6 f35099a;
    public final TextView f35100b;
    public final View f35101c;
    public final pi0 d;
    public boolean f35102e;
    public int f35103f;

    public yy(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f35099a = b6Var;
        View radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, g7.e6.c(-2.0f, -2));
        this.f35101c = radialProgressView;
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
        linearLayout.addView((View) imageView, g7.e6.t(150, 150, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.f35100b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22984c7, b6Var));
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.NoResult));
        linearLayout.addView(textView, g7.e6.q(-2, -2, 17));
        addView(linearLayout, g7.e6.c(-2.0f, -2));
        AndroidUtilities.updateViewVisibilityAnimated(textView, false, 2.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(radialProgressView, false, 1.0f, false);
        setOnTouchListener(new jh.d(18));
    }

    public final void a(int i9, int i10, int i11) {
        int i12;
        if (i9 != 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        pi0 pi0Var = this.d;
        pi0Var.setVisibility(i12);
        if (i9 != 0) {
            pi0Var.f(i9, i10, i11, null);
            pi0Var.d();
        }
    }

    public final void b() {
        AndroidUtilities.updateViewVisibilityAnimated(this.f35100b, false, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.f35101c, true, 1.0f, true);
    }

    public final void c() {
        AndroidUtilities.updateViewVisibilityAnimated(this.f35100b, true, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.f35101c, false, 1.0f, true);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int measuredHeight;
        int paddingTop;
        this.f35102e = true;
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = (i13 - childAt.getMeasuredWidth()) / 2;
                View view = this.f35101c;
                if (childAt == view && (view instanceof e00)) {
                    measuredHeight = (i14 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    int i16 = this.f35103f;
                    if (i16 == 2) {
                        measuredHeight = (AndroidUtilities.dp(100.0f) - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    } else if (i16 == 1) {
                        measuredHeight = ((i14 / 2) - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    } else {
                        measuredHeight = (i14 - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    }
                }
                int i17 = paddingTop + measuredHeight;
                childAt.layout(measuredWidth, i17, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight() + i17);
            }
        }
        this.f35102e = false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f35102e) {
            super.requestLayout();
        }
    }

    public void setProgressBarColor(int i9) {
        View view = this.f35101c;
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i9);
        }
    }

    public void setShowAtCenter(boolean z10) {
        this.f35103f = z10 ? 1 : 0;
    }

    public void setShowAtTop(boolean z10) {
        int i9;
        if (z10) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        this.f35103f = i9;
    }

    public void setText(String str) {
        this.f35100b.setText(str);
    }

    public void setTextColor(int i9) {
        this.f35100b.setTextColor(i9);
    }

    public void setTextSize(int i9) {
        this.f35100b.setTextSize(1, i9);
    }

    public void setTopImage(int i9) {
        TextView textView = this.f35100b;
        if (i9 == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(i9).mutate();
        if (mutate != null) {
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22984c7, this.f35099a), PorterDuff.Mode.MULTIPLY));
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(1.0f));
    }
}
