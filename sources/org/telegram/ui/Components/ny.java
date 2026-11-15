package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class ny extends FrameLayout {
    public static final int h = 0;
    public final org.telegram.ui.ActionBar.e6 f37737a;
    public final TextView f37738b;
    public final View f37739c;
    public final fh0 d;
    public boolean f37740e;
    public int f37741f;

    public ny(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f37737a = e6Var;
        View radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, c8.ja.c(-2.0f, -2));
        this.f37739c = radialProgressView;
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
        linearLayout.addView((View) imageView, c8.ja.t(150, 150, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.f37738b = textView;
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28832c7, e6Var);
        org.telegram.messenger.k5.l(textView, 1, null, 2131748167);
        linearLayout.addView(textView, c8.ja.r(-2, -2, 17));
        addView(linearLayout, c8.ja.c(-2.0f, -2));
        org.telegram.messenger.g0.Y3(textView, false, 2.0f, true, false);
        org.telegram.messenger.g0.Y3(radialProgressView, false, 1.0f, true, false);
        setOnTouchListener(new gi.a(19));
    }

    public final void a(int i7, int i10, int i11) {
        int i12;
        if (i7 != 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        fh0 fh0Var = this.d;
        fh0Var.setVisibility(i12);
        if (i7 != 0) {
            fh0Var.f(i7, i10, i11, null);
            fh0Var.d();
        }
    }

    public final void b() {
        org.telegram.messenger.g0.Y3(this.f37738b, false, 0.9f, true, true);
        org.telegram.messenger.g0.Y3(this.f37739c, true, 1.0f, true, true);
    }

    public final void c() {
        org.telegram.messenger.g0.Y3(this.f37738b, true, 0.9f, true, true);
        org.telegram.messenger.g0.Y3(this.f37739c, false, 1.0f, true, true);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int measuredHeight;
        int paddingTop;
        this.f37740e = true;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = (i13 - childAt.getMeasuredWidth()) / 2;
                View view = this.f37739c;
                if (childAt == view && (view instanceof pz)) {
                    measuredHeight = (i14 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    int i16 = this.f37741f;
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
        this.f37740e = false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f37740e) {
            super.requestLayout();
        }
    }

    public void setProgressBarColor(int i7) {
        View view = this.f37739c;
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i7);
        }
    }

    public void setShowAtCenter(boolean z10) {
        this.f37741f = z10 ? 1 : 0;
    }

    public void setShowAtTop(boolean z10) {
        int i7;
        if (z10) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        this.f37741f = i7;
    }

    public void setText(String str) {
        this.f37738b.setText(str);
    }

    public void setTextColor(int i7) {
        TextView textView = this.f37738b;
        org.telegram.ui.ActionBar.q6.q(textView);
        textView.setTextColor(i7);
    }

    public void setTextSize(int i7) {
        this.f37738b.setTextSize(1, i7);
    }

    public void setTopImage(int i7) {
        TextView textView = this.f37738b;
        if (i7 == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        if (mutate != null) {
            org.telegram.ui.ActionBar.q6.x(this, mutate, org.telegram.ui.ActionBar.j6.f28832c7, this.f37737a, PorterDuff.Mode.MULTIPLY);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(1.0f));
    }
}
