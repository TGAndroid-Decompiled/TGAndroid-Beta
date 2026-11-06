package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class m41 extends org.telegram.ui.ActionBar.f2 {
    public fi.w3 f35844a;
    public kg.l1 f35845b;
    public int f35846c;
    public int d;

    public m41() {
        super(null);
        this.f35846c = -1;
    }

    public abstract void Z(ArrayList arrayList, k41 k41Var);

    public abstract CharSequence a0();

    public abstract void b0(w31 w31Var, View view);

    public abstract boolean c0(w31 w31Var, View view);

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
        this.f35845b = new kg.l1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27792a7, this.f35845b, null);
        }
        fi.w3 w3Var = new fi.w3(this, this, new d(this, 22), new l41(this), new l41(this));
        this.f35844a = w3Var;
        this.f35845b.addView(w3Var, c8.ha.c(-1.0f, -1));
        kg.l1 l1Var = this.f35845b;
        this.fragmentView = l1Var;
        return l1Var;
    }
}
