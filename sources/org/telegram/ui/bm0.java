package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class bm0 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.z70 f45779a;
    public final org.telegram.ui.Components.z70 f45780b;
    public final dm0 f45781c;

    public bm0(dm0 dm0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        int i7;
        org.telegram.ui.ActionBar.e6 e6Var2;
        this.f45781c = dm0Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        jm0 jm0Var = dm0Var.f46419q0;
        org.telegram.ui.ActionBar.q6.h(i10, this, jm0Var.getResourceProvider());
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(getContext());
        i9Var.setImageDrawable(new org.telegram.ui.Components.ch0(2131624319, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(i9Var, c8.ja.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.j6.f29241y6;
        e6Var = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
        org.telegram.ui.Components.z70 a10 = c8.sa.a(context2, 14.0f, i11, false, e6Var);
        this.f45779a = a10;
        a10.setGravity(17);
        if (dm0Var.f46416n0 == 0) {
            i7 = 2131750083;
        } else {
            i7 = 2131750082;
        }
        a10.setText(org.telegram.messenger.hd.M0(i7, null));
        addView(a10, c8.ja.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.j6.Xc;
        e6Var2 = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
        org.telegram.ui.Components.z70 a11 = c8.sa.a(context3, 14.0f, i12, false, e6Var2);
        this.f45780b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131750084, null), new ef0(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, 2131232242));
        addView(a11, c8.ja.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        jm0 jm0Var = this.f45781c.f46419q0;
        setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
        this.f45779a.setTextColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f29241y6));
        int i7 = org.telegram.ui.ActionBar.j6.Xc;
        int themedColor = jm0Var.getThemedColor(i7);
        org.telegram.ui.Components.z70 z70Var = this.f45780b;
        z70Var.setTextColor(themedColor);
        z70Var.setLinkTextColor(jm0Var.getThemedColor(i7));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
