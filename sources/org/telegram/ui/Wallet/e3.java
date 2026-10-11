package org.telegram.ui.Wallet;

import android.content.Context;
public final class e3 extends sg.s {
    public final f3 f34839x;

    public e3(f3 f3Var, Context context, b3 b3Var) {
        super(context, b3Var);
        this.f34839x = f3Var;
    }

    @Override
    public final void a() {
        f3 f3Var = this.f34839x;
        f3Var.f34921o = true;
        setPaused(true);
        setVisibility(8);
        f3Var.f34896a.invalidate();
    }
}
