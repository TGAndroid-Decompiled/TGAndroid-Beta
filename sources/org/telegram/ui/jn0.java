package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class jn0 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.p80 f38476a;
    public final org.telegram.ui.Components.p80 f38477b;
    public final ln0 f38478c;

    public jn0(ln0 ln0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.p6 p6Var;
        int i10;
        org.telegram.ui.ActionBar.p6 p6Var2;
        this.f38478c = ln0Var;
        setOrientation(1);
        int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
        rn0 rn0Var = ln0Var.f39334p0;
        org.telegram.ui.ActionBar.a7.i(i11, this, rn0Var.getResourceProvider());
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getContext());
        g9Var.setImageDrawable(new org.telegram.ui.Components.ci0(2131624316, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f)));
        addView(g9Var, w7.b6.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i12 = org.telegram.ui.ActionBar.t6.f21312y6;
        p6Var = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
        org.telegram.ui.Components.p80 a2 = w7.g6.a(context2, 14.0f, i12, false, p6Var);
        this.f38476a = a2;
        a2.setGravity(17);
        if (ln0Var.m0 == 0) {
            i10 = 2131750092;
        } else {
            i10 = 2131750091;
        }
        a2.setText(org.telegram.messenger.dd.L0(i10, null));
        addView(a2, w7.b6.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i13 = org.telegram.ui.ActionBar.t6.Uc;
        p6Var2 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
        org.telegram.ui.Components.p80 a10 = w7.g6.a(context3, 14.0f, i13, false, p6Var2);
        this.f38477b = a10;
        a10.setGravity(17);
        a10.setText(org.telegram.messenger.i0.I2(org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131750093, null), new kg0(this, 14)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.33f), 1.0f, 2131232240));
        addView(a10, w7.b6.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        rn0 rn0Var = this.f38478c.f39334p0;
        setBackgroundColor(rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
        this.f38476a.setTextColor(rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f21312y6));
        int i10 = org.telegram.ui.ActionBar.t6.Uc;
        int themedColor = rn0Var.getThemedColor(i10);
        org.telegram.ui.Components.p80 p80Var = this.f38477b;
        p80Var.setTextColor(themedColor);
        p80Var.setLinkTextColor(rn0Var.getThemedColor(i10));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
