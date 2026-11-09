package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class o41 extends org.telegram.ui.ActionBar.f2 {
    public fi.w3 f36649a;
    public kg.l1 f36650b;
    public int f36651c;
    public int d;

    public o41() {
        super(null);
        this.f36651c = -1;
    }

    public abstract void Z(ArrayList arrayList, m41 m41Var);

    public abstract CharSequence a0();

    public abstract void b0(y31 y31Var, View view);

    public abstract boolean c0(y31 y31Var, View view);

    @Override
    public View createView(Context context) {
        org.telegram.ui.w9 w9Var = new org.telegram.ui.w9(this, 18);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
            this.simpleActionBar.setTitle(a0());
            this.simpleActionBar.setActionBarMenuOnItemClick(w9Var);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(a0());
            this.actionBar.setActionBarMenuOnItemClick(w9Var);
        }
        this.f36650b = new kg.l1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27809a7, this.f36650b, null);
        }
        fi.w3 w3Var = new fi.w3(this, this, new d(this, 22), new n41(this), new n41(this));
        this.f36649a = w3Var;
        this.f36650b.addView(w3Var, c8.ha.c(-1.0f, -1));
        kg.l1 l1Var = this.f36650b;
        this.fragmentView = l1Var;
        return l1Var;
    }
}
