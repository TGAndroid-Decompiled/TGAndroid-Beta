package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class g60 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.m5 f45992a;
    public final org.telegram.ui.Components.y8 f45993b;
    public boolean f45994c;
    public int d;
    public final h60 f45995e;

    public g60(h60 h60Var, Context context) {
        super(context);
        this.f45995e = h60Var;
        int i7 = org.telegram.ui.ActionBar.m6.f27982i6;
        this.d = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f45992a = m5Var;
        m5Var.setTextSize(16);
        m5Var.setEllipsizeByGradient(true);
        m5Var.setRightPadding(org.telegram.messenger.g0.L(68.0f));
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.f27998j5, null);
        addView(m5Var, c8.ha.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(context, false);
        this.f45993b = y8Var;
        y8Var.f40530a.f40231a = true;
        y8Var.setStyle(11);
        y8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(y8Var, c8.ha.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.x0(null, i7, false), 0, 4));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        this.f45994c = true;
        org.telegram.ui.ActionBar.m5 m5Var = this.f45992a;
        m5Var.setVisibility(8);
        super.onMeasure(i7, i10);
        m5Var.setVisibility(0);
        m5Var.getLayoutParams().width = getMeasuredWidth();
        this.f45994c = false;
        this.f45995e.g();
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f45994c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27982i6, false);
            if (x02 != this.d) {
                this.d = x02;
                org.telegram.ui.ActionBar.m6.H1(getBackground(), x02, true);
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
