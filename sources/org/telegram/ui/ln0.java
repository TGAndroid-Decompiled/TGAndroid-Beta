package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class ln0 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.p80 f39323a;
    public final org.telegram.ui.Components.p80 f39324b;
    public final nn0 f39325c;

    public ln0(nn0 nn0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.p6 p6Var;
        int i10;
        org.telegram.ui.ActionBar.p6 p6Var2;
        this.f39325c = nn0Var;
        setOrientation(1);
        int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
        tn0 tn0Var = nn0Var.f40001p0;
        org.telegram.ui.ActionBar.a7.i(i11, this, tn0Var.getResourceProvider());
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getContext());
        g9Var.setImageDrawable(new org.telegram.ui.Components.bi0(2131624316, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f)));
        addView(g9Var, w7.b6.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i12 = org.telegram.ui.ActionBar.t6.f21311y6;
        p6Var = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
        org.telegram.ui.Components.p80 a2 = w7.g6.a(context2, 14.0f, i12, false, p6Var);
        this.f39323a = a2;
        a2.setGravity(17);
        if (nn0Var.m0 == 0) {
            i10 = 2131750092;
        } else {
            i10 = 2131750091;
        }
        a2.setText(org.telegram.messenger.cd.L0(i10, null));
        addView(a2, w7.b6.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i13 = org.telegram.ui.ActionBar.t6.Uc;
        p6Var2 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
        org.telegram.ui.Components.p80 a10 = w7.g6.a(context3, 14.0f, i13, false, p6Var2);
        this.f39324b = a10;
        a10.setGravity(17);
        a10.setText(org.telegram.messenger.i0.I2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131750093, null), new mg0(this, 14)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.33f), 1.0f, 2131232240));
        addView(a10, w7.b6.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        tn0 tn0Var = this.f39325c.f40001p0;
        setBackgroundColor(tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
        this.f39323a.setTextColor(tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f21311y6));
        int i10 = org.telegram.ui.ActionBar.t6.Uc;
        int themedColor = tn0Var.getThemedColor(i10);
        org.telegram.ui.Components.p80 p80Var = this.f39324b;
        p80Var.setTextColor(themedColor);
        p80Var.setLinkTextColor(tn0Var.getThemedColor(i10));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
