package org.telegram.ui.Wallet;

import android.content.Context;
public final class d3 extends sg.s {
    public final e3 f34809x;

    public d3(e3 e3Var, Context context, a3 a3Var) {
        super(context, a3Var);
        this.f34809x = e3Var;
    }

    @Override
    public final void a() {
        e3 e3Var = this.f34809x;
        e3Var.f34889o = true;
        setPaused(true);
        setVisibility(8);
        e3Var.f34864a.invalidate();
    }
}
