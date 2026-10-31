package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class xy extends FrameLayout {
    public static final int h = 0;
    public final org.telegram.ui.ActionBar.p6 f32558a;
    public final TextView f32559b;
    public final View f32560c;
    public final ei0 d;
    public boolean e;
    public int f32561f;

    public xy(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f32558a = p6Var;
        View radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, w7.b6.c(-2.0f, -2));
        this.f32560c = radialProgressView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
        linearLayout.setGravity(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImportantForAccessibility(2);
        imageView.setVisibility(8);
        linearLayout.addView((View) imageView, w7.b6.t(150, 150, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.f32559b = textView;
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f20911c7, p6Var);
        org.telegram.messenger.m5.l(textView, 1, null, 2131748183);
        linearLayout.addView(textView, w7.b6.r(-2, -2, 17));
        addView(linearLayout, w7.b6.c(-2.0f, -2));
        org.telegram.messenger.i0.Y3(textView, false, 2.0f, true, false);
        org.telegram.messenger.i0.Y3(radialProgressView, false, 1.0f, true, false);
        setOnTouchListener(new org.telegram.ui.ActionBar.n2(17));
    }

    public final void a(int i10, int i11, int i12) {
        int i13;
        if (i10 != 0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        ei0 ei0Var = this.d;
        ei0Var.setVisibility(i13);
        if (i10 != 0) {
            ei0Var.f(i10, i11, i12, null);
            ei0Var.d();
        }
    }

    public final void b() {
        org.telegram.messenger.i0.Y3(this.f32559b, false, 0.9f, true, true);
        org.telegram.messenger.i0.Y3(this.f32560c, true, 1.0f, true, true);
    }

    public final void c() {
        org.telegram.messenger.i0.Y3(this.f32559b, true, 0.9f, true, true);
        org.telegram.messenger.i0.Y3(this.f32560c, false, 1.0f, true, true);
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
                View view = this.f32560c;
                if (childAt == view && (view instanceof zz)) {
                    measuredHeight = (i15 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    int i17 = this.f32561f;
                    if (i17 == 2) {
                        measuredHeight = (org.telegram.messenger.i0.L(100.0f) - childAt.getMeasuredHeight()) / 2;
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
        View view = this.f32560c;
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        }
    }

    public void setShowAtCenter(boolean z10) {
        this.f32561f = z10 ? 1 : 0;
    }

    public void setShowAtTop(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f32561f = i10;
    }

    public void setText(String str) {
        this.f32559b.setText(str);
    }

    public void setTextColor(int i10) {
        TextView textView = this.f32559b;
        org.telegram.ui.ActionBar.a7.r(textView);
        textView.setTextColor(i10);
    }

    public void setTextSize(int i10) {
        this.f32559b.setTextSize(1, i10);
    }

    public void setTopImage(int i10) {
        TextView textView = this.f32559b;
        if (i10 == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        if (mutate != null) {
            org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.f20911c7, this.f32558a, PorterDuff.Mode.MULTIPLY);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(org.telegram.messenger.i0.L(1.0f));
    }
}
