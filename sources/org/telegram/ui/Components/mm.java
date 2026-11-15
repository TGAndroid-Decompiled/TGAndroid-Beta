package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class mm implements cl, org.telegram.ui.ActionBar.q1 {
    public final org.telegram.messenger.z10 f37323a;

    public mm(org.telegram.messenger.z10 z10Var) {
        this.f37323a = z10Var;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        this.f37323a.a(new th.f(messageMedia));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.messenger.z10 z10Var = this.f37323a;
        if (z10Var != null) {
            z10Var.a(Boolean.FALSE);
        }
    }
}
