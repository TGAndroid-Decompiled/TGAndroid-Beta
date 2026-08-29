package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class p51 extends org.telegram.ui.ActionBar.o2 {
    public o51 f31601a;
    public int f31602b;
    public int f31603c;

    public p51() {
        super(null);
        this.f31602b = -1;
    }

    public abstract void U(ArrayList arrayList, k51 k51Var);

    public abstract CharSequence V();

    public abstract void W(w41 w41Var, View view);

    public abstract boolean X(w41 w41Var, View view);

    @Override
    public View createView(Context context) {
        org.telegram.ui.th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new m51(this, 0));
        n51 n51Var = new n51(context, null, 0);
        n51Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        o51 o51Var = new o51(this, this, new d(this, 22), new l51(this), new l51(this));
        this.f31601a = o51Var;
        n51Var.addView(o51Var, i7.f6.c(-1.0f, -1));
        this.fragmentView = n51Var;
        return n51Var;
    }
}
