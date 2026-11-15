package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class r41 extends org.telegram.ui.ActionBar.e2 {
    public bi.v3 f38882a;
    public kg.m1 f38883b;
    public int f38884c;
    public int d;

    public r41() {
        super(null);
        this.f38884c = -1;
    }

    public abstract void Z(ArrayList arrayList, p41 p41Var);

    public abstract CharSequence a0();

    public abstract void b0(b41 b41Var, View view);

    public abstract boolean c0(b41 b41Var, View view);

    @Override
    public View createView(Context context) {
        org.telegram.ui.p9 p9Var = new org.telegram.ui.p9(this, 19);
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            w4Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
            this.simpleActionBar.setTitle(a0());
            this.simpleActionBar.setActionBarMenuOnItemClick(p9Var);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(a0());
            this.actionBar.setActionBarMenuOnItemClick(p9Var);
        }
        this.f38883b = new kg.m1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, this.f38883b, null);
        }
        bi.v3 v3Var = new bi.v3(this, this, new d(this, 22), new q41(this), new q41(this));
        this.f38882a = v3Var;
        this.f38883b.addView(v3Var, c8.ja.c(-1.0f, -1));
        kg.m1 m1Var = this.f38883b;
        this.fragmentView = m1Var;
        return m1Var;
    }
}
