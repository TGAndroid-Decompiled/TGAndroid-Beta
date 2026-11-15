package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class c60 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.j5 f46033a;
    public final org.telegram.ui.Components.w8 f46034b;
    public boolean f46035c;
    public int d;
    public final d60 f46036e;

    public c60(d60 d60Var, Context context) {
        super(context);
        this.f46036e = d60Var;
        int i7 = org.telegram.ui.ActionBar.j6.f28941i6;
        this.d = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f46033a = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.setRightPadding(org.telegram.messenger.g0.L(68.0f));
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.f28957j5, null);
        addView(j5Var, c8.ja.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(context, false);
        this.f46034b = w8Var;
        w8Var.f41311a.f40323a = true;
        w8Var.setStyle(11);
        w8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(w8Var, c8.ja.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.x0(null, i7, false), 0, 4));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        this.f46035c = true;
        org.telegram.ui.ActionBar.j5 j5Var = this.f46033a;
        j5Var.setVisibility(8);
        super.onMeasure(i7, i10);
        j5Var.setVisibility(0);
        j5Var.getLayoutParams().width = getMeasuredWidth();
        this.f46035c = false;
        this.f46036e.g();
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f46035c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28941i6, false);
            if (x02 != this.d) {
                this.d = x02;
                org.telegram.ui.ActionBar.j6.H1(getBackground(), x02, true);
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
