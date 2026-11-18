package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class dm0 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.k80 f46941a;
    public final org.telegram.ui.Components.k80 f46942b;
    public final fm0 f46943c;

    public dm0(fm0 fm0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.i6 i6Var;
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var2;
        this.f46943c = fm0Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.n6.f29394d6;
        lm0 lm0Var = fm0Var.f47715q0;
        org.telegram.ui.ActionBar.u6.h(i10, this, lm0Var.getResourceProvider());
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(getContext());
        q9Var.setImageDrawable(new org.telegram.ui.Components.mh0(2131624319, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(q9Var, c8.ma.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.n6.f29786y6;
        i6Var = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
        org.telegram.ui.Components.k80 a10 = c8.va.a(context2, 14.0f, i11, false, i6Var);
        this.f46941a = a10;
        a10.setGravity(17);
        if (fm0Var.f47712n0 == 0) {
            i7 = 2131750067;
        } else {
            i7 = 2131750066;
        }
        a10.setText(org.telegram.messenger.gd.M0(i7, null));
        addView(a10, c8.ma.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.n6.Xc;
        i6Var2 = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
        org.telegram.ui.Components.k80 a11 = c8.va.a(context3, 14.0f, i12, false, i6Var2);
        this.f46942b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131750068, null), new if0(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, 2131232243));
        addView(a11, c8.ma.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        lm0 lm0Var = this.f46943c.f47715q0;
        setBackgroundColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6));
        this.f46941a.setTextColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29786y6));
        int i7 = org.telegram.ui.ActionBar.n6.Xc;
        int themedColor = lm0Var.getThemedColor(i7);
        org.telegram.ui.Components.k80 k80Var = this.f46942b;
        k80Var.setTextColor(themedColor);
        k80Var.setLinkTextColor(lm0Var.getThemedColor(i7));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
