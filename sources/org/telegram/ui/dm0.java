package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class dm0 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.m80 f47010a;
    public final org.telegram.ui.Components.m80 f47011b;
    public final fm0 f47012c;

    public dm0(fm0 fm0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.h6 h6Var;
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var2;
        this.f47012c = fm0Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.m6.f29381d6;
        lm0 lm0Var = fm0Var.f47786q0;
        org.telegram.ui.ActionBar.t6.h(i10, this, lm0Var.getResourceProvider());
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(getContext());
        q9Var.setImageDrawable(new org.telegram.ui.Components.oh0(2131624319, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(q9Var, c8.ma.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.m6.f29773y6;
        h6Var = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
        org.telegram.ui.Components.m80 a10 = c8.va.a(context2, 14.0f, i11, false, h6Var);
        this.f47010a = a10;
        a10.setGravity(17);
        if (fm0Var.f47783n0 == 0) {
            i7 = 2131750066;
        } else {
            i7 = 2131750065;
        }
        a10.setText(org.telegram.messenger.hd.N0(i7, null));
        addView(a10, c8.ma.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.m6.Xc;
        h6Var2 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
        org.telegram.ui.Components.m80 a11 = c8.va.a(context3, 14.0f, i12, false, h6Var2);
        this.f47011b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131750067, null), new hf0(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, 2131232243));
        addView(a11, c8.ma.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        lm0 lm0Var = this.f47012c.f47786q0;
        setBackgroundColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29381d6));
        this.f47010a.setTextColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29773y6));
        int i7 = org.telegram.ui.ActionBar.m6.Xc;
        int themedColor = lm0Var.getThemedColor(i7);
        org.telegram.ui.Components.m80 m80Var = this.f47011b;
        m80Var.setTextColor(themedColor);
        m80Var.setLinkTextColor(lm0Var.getThemedColor(i7));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
