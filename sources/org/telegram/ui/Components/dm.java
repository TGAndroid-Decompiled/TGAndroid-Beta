package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class dm implements tk, org.telegram.ui.ActionBar.p1 {
    public final org.telegram.messenger.u10 f33163a;

    public dm(org.telegram.messenger.u10 u10Var) {
        this.f33163a = u10Var;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        this.f33163a.a(new uh.f(messageMedia));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        org.telegram.messenger.u10 u10Var = this.f33163a;
        if (u10Var != null) {
            u10Var.a(Boolean.FALSE);
        }
    }
}
