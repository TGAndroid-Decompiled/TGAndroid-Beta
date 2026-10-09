package org.telegram.ui.Wallet;

import android.content.Context;
public final class b3 extends sg.s {
    public final c3 f34649x;

    public b3(c3 c3Var, Context context, m mVar) {
        super(context, mVar);
        this.f34649x = c3Var;
    }

    @Override
    public final void a() {
        c3 c3Var = this.f34649x;
        c3Var.f34733o = true;
        setPaused(true);
        setVisibility(8);
        c3Var.f34708a.invalidate();
    }
}
