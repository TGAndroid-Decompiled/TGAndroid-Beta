package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class jy extends FrameLayout {
    public static final int h = 0;
    public final org.telegram.ui.ActionBar.g6 f35177a;
    public final TextView f35178b;
    public final View f35179c;
    public final dh0 d;
    public boolean f35180e;
    public int f35181f;

    public jy(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f35177a = g6Var;
        View radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, c8.ha.c(-2.0f, -2));
        this.f35179c = radialProgressView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        linearLayout.setGravity(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImportantForAccessibility(2);
        imageView.setVisibility(8);
        linearLayout.addView((View) imageView, c8.ha.t(150, 150, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.f35178b = textView;
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27848c7, g6Var);
        org.telegram.messenger.k5.m(textView, 1, null, 2131748167);
        linearLayout.addView(textView, c8.ha.r(-2, -2, 17));
        addView(linearLayout, c8.ha.c(-2.0f, -2));
        org.telegram.messenger.g0.Z3(textView, false, 2.0f, true, false);
        org.telegram.messenger.g0.Z3(radialProgressView, false, 1.0f, true, false);
        setOnTouchListener(new ei.b(18));
    }

    public final void a(int i7, int i10, int i11) {
        int i12;
        if (i7 != 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        dh0 dh0Var = this.d;
        dh0Var.setVisibility(i12);
        if (i7 != 0) {
            dh0Var.f(i7, i10, i11, null);
            dh0Var.d();
        }
    }

    public final void b() {
        org.telegram.messenger.g0.Z3(this.f35178b, false, 0.9f, true, true);
        org.telegram.messenger.g0.Z3(this.f35179c, true, 1.0f, true, true);
    }

    public final void c() {
        org.telegram.messenger.g0.Z3(this.f35178b, true, 0.9f, true, true);
        org.telegram.messenger.g0.Z3(this.f35179c, false, 1.0f, true, true);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int measuredHeight;
        int paddingTop;
        this.f35180e = true;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = (i13 - childAt.getMeasuredWidth()) / 2;
                View view = this.f35179c;
                if (childAt == view && (view instanceof mz)) {
                    measuredHeight = (i14 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    int i16 = this.f35181f;
                    if (i16 == 2) {
                        measuredHeight = (org.telegram.messenger.g0.L(100.0f) - childAt.getMeasuredHeight()) / 2;
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
        this.f35180e = false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f35180e) {
            super.requestLayout();
        }
    }

    public void setProgressBarColor(int i7) {
        View view = this.f35179c;
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i7);
        }
    }

    public void setShowAtCenter(boolean z9) {
        this.f35181f = z9 ? 1 : 0;
    }

    public void setShowAtTop(boolean z9) {
        int i7;
        if (z9) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        this.f35181f = i7;
    }

    public void setText(String str) {
        this.f35178b.setText(str);
    }

    public void setTextColor(int i7) {
        TextView textView = this.f35178b;
        org.telegram.ui.ActionBar.s6.q(textView);
        textView.setTextColor(i7);
    }

    public void setTextSize(int i7) {
        this.f35178b.setTextSize(1, i7);
    }

    public void setTopImage(int i7) {
        TextView textView = this.f35178b;
        if (i7 == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        if (mutate != null) {
            org.telegram.ui.ActionBar.s6.x(this, mutate, org.telegram.ui.ActionBar.l6.f27848c7, this.f35177a, PorterDuff.Mode.MULTIPLY);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(1.0f));
    }
}
