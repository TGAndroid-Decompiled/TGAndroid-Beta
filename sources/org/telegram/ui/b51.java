package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class b51 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f35948a;
    public final org.telegram.ui.Components.p80 f35949b;
    public final org.telegram.ui.Components.p80 f35950c;
    public final vh.d d;
    public final vh.d e;

    public b51(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f35948a = p6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.Components.p80 a2 = w7.g6.a(context, 15.0f, i10, true, p6Var);
        this.f35949b = a2;
        a2.setGravity(17);
        addView(a2, w7.b6.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.p80 a10 = w7.g6.a(context, 13.0f, i10, false, p6Var);
        this.f35950c = a10;
        a10.setGravity(17);
        addView(a10, w7.b6.s(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        vh.d i11 = org.telegram.messenger.a30.i(24, context, p6Var, true);
        this.d = i11;
        vh.d i12 = org.telegram.messenger.a30.i(24, context, p6Var, true);
        this.e = i12;
        linearLayout.addView(i11, w7.b6.q(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(i12, w7.b6.q(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.b6.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f35948a;
        this.f35949b.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.f35950c.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
    }
}
