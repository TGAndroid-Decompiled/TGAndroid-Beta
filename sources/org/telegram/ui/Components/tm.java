package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class tm implements jl, org.telegram.ui.ActionBar.r1 {
    public final org.telegram.messenger.x10 f40045a;

    public tm(org.telegram.messenger.x10 x10Var) {
        this.f40045a = x10Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        this.f40045a.a(new th.f(messageMedia));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.messenger.x10 x10Var = this.f40045a;
        if (x10Var != null) {
            x10Var.a(Boolean.FALSE);
        }
    }
}
