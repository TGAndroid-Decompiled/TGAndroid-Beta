package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class cm0 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.w70 f44405a;
    public final org.telegram.ui.Components.w70 f44406b;
    public final em0 f44407c;

    public cm0(em0 em0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.h6 h6Var;
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var2;
        this.f44407c = em0Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.m6.f27890d6;
        km0 km0Var = em0Var.f45401p0;
        org.telegram.ui.ActionBar.t6.h(i10, this, km0Var.getResourceProvider());
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getContext());
        k9Var.setImageDrawable(new org.telegram.ui.Components.zg0(2131624318, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(k9Var, c8.ha.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.m6.f28282y6;
        h6Var = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
        org.telegram.ui.Components.w70 a10 = c8.qa.a(context2, 14.0f, i11, false, h6Var);
        this.f44405a = a10;
        a10.setGravity(17);
        if (em0Var.m0 == 0) {
            i7 = 2131750083;
        } else {
            i7 = 2131750082;
        }
        a10.setText(org.telegram.messenger.id.M0(i7, null));
        addView(a10, c8.ha.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.m6.Uc;
        h6Var2 = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
        org.telegram.ui.Components.w70 a11 = c8.qa.a(context3, 14.0f, i12, false, h6Var2);
        this.f44406b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750084, null), new hf0(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, 2131232241));
        addView(a11, c8.ha.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        km0 km0Var = this.f44407c.f45401p0;
        setBackgroundColor(km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
        this.f44405a.setTextColor(km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f28282y6));
        int i7 = org.telegram.ui.ActionBar.m6.Uc;
        int themedColor = km0Var.getThemedColor(i7);
        org.telegram.ui.Components.w70 w70Var = this.f44406b;
        w70Var.setTextColor(themedColor);
        w70Var.setLinkTextColor(km0Var.getThemedColor(i7));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
