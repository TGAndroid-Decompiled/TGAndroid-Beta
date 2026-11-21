package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class vm implements ll, org.telegram.ui.ActionBar.q1 {
    public final org.telegram.messenger.x10 f40871a;

    public vm(org.telegram.messenger.x10 x10Var) {
        this.f40871a = x10Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        this.f40871a.a(new th.f(messageMedia));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.messenger.x10 x10Var = this.f40871a;
        if (x10Var != null) {
            x10Var.a(Boolean.FALSE);
        }
    }
}
