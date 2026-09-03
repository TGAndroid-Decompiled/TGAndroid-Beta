package org.telegram.ui.Components;

import android.content.Context;
public final class vh extends lg {
    public final li f29477i0;

    public vh(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, li liVar) {
        super(i10, context, f6Var, false);
        this.f29477i0 = liVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f29477i0.R0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f29477i0.getThemedColor(org.telegram.ui.ActionBar.j6.S5);
    }
}
