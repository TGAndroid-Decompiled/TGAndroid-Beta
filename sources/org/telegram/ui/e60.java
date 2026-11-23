package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class e60 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.m5 f47113a;
    public final org.telegram.ui.Components.e9 f47114b;
    public boolean f47115c;
    public int d;
    public final f60 f47116e;

    public e60(f60 f60Var, Context context) {
        super(context);
        this.f47116e = f60Var;
        int i7 = org.telegram.ui.ActionBar.m6.f29439i6;
        this.d = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f47113a = m5Var;
        m5Var.setTextSize(16);
        m5Var.setEllipsizeByGradient(true);
        m5Var.setRightPadding(org.telegram.messenger.g0.L(68.0f));
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.f29455j5, null);
        addView(m5Var, c8.na.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9(context, false);
        this.f47114b = e9Var;
        e9Var.f34690a.f34387a = true;
        e9Var.setStyle(11);
        e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(e9Var, c8.na.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.x0(null, i7, false), 0, 4));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        this.f47115c = true;
        org.telegram.ui.ActionBar.m5 m5Var = this.f47113a;
        m5Var.setVisibility(8);
        super.onMeasure(i7, i10);
        m5Var.setVisibility(0);
        m5Var.getLayoutParams().width = getMeasuredWidth();
        this.f47115c = false;
        this.f47116e.g();
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f47115c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29439i6, false);
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
