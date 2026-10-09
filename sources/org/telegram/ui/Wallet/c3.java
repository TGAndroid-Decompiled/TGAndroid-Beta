package org.telegram.ui.Wallet;

import android.content.Context;
public final class c3 extends sg.s {
    public final d3 f34720x;

    public c3(d3 d3Var, Context context, z2 z2Var) {
        super(context, z2Var);
        this.f34720x = d3Var;
    }

    @Override
    public final void a() {
        d3 d3Var = this.f34720x;
        d3Var.f34798o = true;
        setPaused(true);
        setVisibility(8);
        d3Var.f34773a.invalidate();
    }
}
