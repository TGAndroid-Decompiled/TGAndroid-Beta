package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class bm0 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.x70 f44070a;
    public final org.telegram.ui.Components.x70 f44071b;
    public final dm0 f44072c;

    public bm0(dm0 dm0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        int i7;
        org.telegram.ui.ActionBar.g6 g6Var2;
        this.f44072c = dm0Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.l6.f27865d6;
        jm0 jm0Var = dm0Var.f45078p0;
        org.telegram.ui.ActionBar.s6.h(i10, this, jm0Var.getResourceProvider());
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getContext());
        l9Var.setImageDrawable(new org.telegram.ui.Components.ah0(2131624318, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(l9Var, c8.ha.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.l6.f28257y6;
        g6Var = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
        org.telegram.ui.Components.x70 a10 = c8.qa.a(context2, 14.0f, i11, false, g6Var);
        this.f44070a = a10;
        a10.setGravity(17);
        if (dm0Var.m0 == 0) {
            i7 = 2131750083;
        } else {
            i7 = 2131750082;
        }
        a10.setText(org.telegram.messenger.id.M0(i7, null));
        addView(a10, c8.ha.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.l6.Uc;
        g6Var2 = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
        org.telegram.ui.Components.x70 a11 = c8.qa.a(context3, 14.0f, i12, false, g6Var2);
        this.f44071b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750084, null), new gf0(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, 2131232241));
        addView(a11, c8.ha.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        jm0 jm0Var = this.f44072c.f45078p0;
        setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
        this.f44070a.setTextColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f28257y6));
        int i7 = org.telegram.ui.ActionBar.l6.Uc;
        int themedColor = jm0Var.getThemedColor(i7);
        org.telegram.ui.Components.x70 x70Var = this.f44071b;
        x70Var.setTextColor(themedColor);
        x70Var.setLinkTextColor(jm0Var.getThemedColor(i7));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
