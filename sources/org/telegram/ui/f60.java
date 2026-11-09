package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class f60 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.l5 f45599a;
    public final org.telegram.ui.Components.z8 f45600b;
    public boolean f45601c;
    public int d;
    public final g60 f45602e;

    public f60(g60 g60Var, Context context) {
        super(context);
        this.f45602e = g60Var;
        int i7 = org.telegram.ui.ActionBar.l6.f27957i6;
        this.d = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f45599a = l5Var;
        l5Var.setTextSize(16);
        l5Var.setEllipsizeByGradient(true);
        l5Var.setRightPadding(org.telegram.messenger.g0.L(68.0f));
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.f27973j5, null);
        addView(l5Var, c8.ha.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(context, false);
        this.f45600b = z8Var;
        z8Var.f40934a.f40644a = true;
        z8Var.setStyle(11);
        z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(z8Var, c8.ha.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.x0(null, i7, false), 0, 4));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        this.f45601c = true;
        org.telegram.ui.ActionBar.l5 l5Var = this.f45599a;
        l5Var.setVisibility(8);
        super.onMeasure(i7, i10);
        l5Var.setVisibility(0);
        l5Var.getLayoutParams().width = getMeasuredWidth();
        this.f45601c = false;
        this.f45602e.g();
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f45601c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27957i6, false);
            if (x02 != this.d) {
                this.d = x02;
                org.telegram.ui.ActionBar.l6.H1(getBackground(), x02, true);
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
