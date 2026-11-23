package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class e60 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.n5 f47455a;
    public final org.telegram.ui.Components.d9 f47456b;
    public boolean f47457c;
    public int d;
    public final f60 f47458e;

    public e60(f60 f60Var, Context context) {
        super(context);
        this.f47458e = f60Var;
        int i7 = org.telegram.ui.ActionBar.n6.f29543i6;
        this.d = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f47455a = n5Var;
        n5Var.setTextSize(16);
        n5Var.setEllipsizeByGradient(true);
        n5Var.setRightPadding(org.telegram.messenger.g0.L(68.0f));
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.f29559j5, null);
        addView(n5Var, c8.na.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(context, false);
        this.f47456b = d9Var;
        d9Var.f34245a.f33949a = true;
        d9Var.setStyle(11);
        d9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(d9Var, c8.na.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), 0, 4));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        this.f47457c = true;
        org.telegram.ui.ActionBar.n5 n5Var = this.f47455a;
        n5Var.setVisibility(8);
        super.onMeasure(i7, i10);
        n5Var.setVisibility(0);
        n5Var.getLayoutParams().width = getMeasuredWidth();
        this.f47457c = false;
        this.f47458e.g();
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f47457c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29543i6, false);
            if (x02 != this.d) {
                this.d = x02;
                org.telegram.ui.ActionBar.n6.H1(getBackground(), x02, true);
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
