package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class tm implements jl, org.telegram.ui.ActionBar.q1 {
    public final org.telegram.messenger.w10 f40078a;

    public tm(org.telegram.messenger.w10 w10Var) {
        this.f40078a = w10Var;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        this.f40078a.a(new th.f(messageMedia));
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.messenger.w10 w10Var = this.f40078a;
        if (w10Var != null) {
            w10Var.a(Boolean.FALSE);
        }
    }
}
