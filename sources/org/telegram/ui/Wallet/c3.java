package org.telegram.ui.Wallet;

import android.content.Context;
public final class c3 extends tg.s {
    public final d3 f33006x;

    public c3(d3 d3Var, Context context, z2 z2Var) {
        super(context, z2Var);
        this.f33006x = d3Var;
    }

    @Override
    public final void a() {
        d3 d3Var = this.f33006x;
        d3Var.f33069o = true;
        setPaused(true);
        setVisibility(8);
        d3Var.f33045a.invalidate();
    }
}
