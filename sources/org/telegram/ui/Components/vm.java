package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class vm implements ll, org.telegram.ui.ActionBar.q1 {
    public final org.telegram.messenger.y10 f40873a;

    public vm(org.telegram.messenger.y10 y10Var) {
        this.f40873a = y10Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        this.f40873a.a(new th.f(messageMedia));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.messenger.y10 y10Var = this.f40873a;
        if (y10Var != null) {
            y10Var.a(Boolean.FALSE);
        }
    }
}
