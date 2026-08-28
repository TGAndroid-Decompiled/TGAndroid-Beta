package org.telegram.ui.Components;

import android.content.Context;
public final class vh extends lg {
    public final ki f33365h0;

    public vh(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar) {
        super(i9, context, b6Var, false);
        this.f33365h0 = kiVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f33365h0.Q0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f33365h0.getThemedColor(org.telegram.ui.ActionBar.f6.S5);
    }
}
