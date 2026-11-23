package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class bm0 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.j80 f46105a;
    public final org.telegram.ui.Components.j80 f46106b;
    public final dm0 f46107c;

    public bm0(dm0 dm0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.i6 i6Var;
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var2;
        this.f46107c = dm0Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.n6.f29451d6;
        jm0 jm0Var = dm0Var.f47185q0;
        org.telegram.ui.ActionBar.u6.h(i10, this, jm0Var.getResourceProvider());
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getContext());
        p9Var.setImageDrawable(new org.telegram.ui.Components.nh0(2131624319, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(p9Var, c8.na.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.n6.f29843y6;
        i6Var = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
        org.telegram.ui.Components.j80 a10 = c8.wa.a(context2, 14.0f, i11, false, i6Var);
        this.f46105a = a10;
        a10.setGravity(17);
        if (dm0Var.f47182n0 == 0) {
            i7 = 2131750066;
        } else {
            i7 = 2131750065;
        }
        a10.setText(org.telegram.messenger.gd.N0(i7, null));
        addView(a10, c8.na.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.n6.Xc;
        i6Var2 = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
        org.telegram.ui.Components.j80 a11 = c8.wa.a(context3, 14.0f, i12, false, i6Var2);
        this.f46106b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131750067, null), new gf0(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, 2131232246));
        addView(a11, c8.na.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        jm0 jm0Var = this.f46107c.f47185q0;
        setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
        this.f46105a.setTextColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29843y6));
        int i7 = org.telegram.ui.ActionBar.n6.Xc;
        int themedColor = jm0Var.getThemedColor(i7);
        org.telegram.ui.Components.j80 j80Var = this.f46106b;
        j80Var.setTextColor(themedColor);
        j80Var.setLinkTextColor(jm0Var.getThemedColor(i7));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
