package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class c70 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.u5 f36405a;
    public final org.telegram.ui.Components.u8 f36406b;
    public boolean f36407c;
    public int d;
    public final d70 e;

    public c70(d70 d70Var, Context context) {
        super(context);
        this.e = d70Var;
        int i10 = org.telegram.ui.ActionBar.t6.f21020i6;
        this.d = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f36405a = u5Var;
        u5Var.setTextSize(16);
        u5Var.setEllipsizeByGradient(true);
        u5Var.setRightPadding(org.telegram.messenger.i0.L(68.0f));
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.f21037j5, null);
        addView(u5Var, w7.b6.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false);
        this.f36406b = u8Var;
        u8Var.f30863a.f30479a = true;
        u8Var.setStyle(11);
        u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(22.0f));
        addView(u8Var, w7.b6.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 0, 4));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        this.f36407c = true;
        org.telegram.ui.ActionBar.u5 u5Var = this.f36405a;
        u5Var.setVisibility(8);
        super.onMeasure(i10, i11);
        u5Var.setVisibility(0);
        u5Var.getLayoutParams().width = getMeasuredWidth();
        this.f36407c = false;
        this.e.g();
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f36407c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21020i6, false);
            if (x02 != this.d) {
                this.d = x02;
                org.telegram.ui.ActionBar.t6.H1(getBackground(), x02, true);
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
