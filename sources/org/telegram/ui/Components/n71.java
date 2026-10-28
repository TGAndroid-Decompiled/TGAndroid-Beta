package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class n71 extends org.telegram.ui.ActionBar.r2 {
    public m71 f30764a;
    public jg.r1 f30765b;
    public int f30766c;
    public int d;

    public n71() {
        super(null);
        this.f30766c = -1;
    }

    public abstract void V(ArrayList arrayList, k71 k71Var);

    public abstract CharSequence W();

    public abstract void X(u61 u61Var, View view);

    public abstract boolean Y(u61 u61Var, View view);

    @Override
    public View createView(Context context) {
        org.telegram.ui.ga gaVar = new org.telegram.ui.ga(this, 17);
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            r5Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
            this.simpleActionBar.setTitle(W());
            this.simpleActionBar.setActionBarMenuOnItemClick(gaVar);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(W());
            this.actionBar.setActionBarMenuOnItemClick(gaVar);
        }
        this.f30765b = new jg.r1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23300a7, this.f30765b, null);
        }
        m71 m71Var = new m71(this, this, new d(this, 22), new l71(this), new l71(this));
        this.f30764a = m71Var;
        this.f30765b.addView(m71Var, kb1.g(-1.0f, -1));
        jg.r1 r1Var = this.f30765b;
        this.fragmentView = r1Var;
        return r1Var;
    }
}
