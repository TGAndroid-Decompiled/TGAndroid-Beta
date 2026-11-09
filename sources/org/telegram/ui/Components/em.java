package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class em implements vk, org.telegram.ui.ActionBar.r1 {
    public final org.telegram.messenger.c20 f33448a;

    public em(org.telegram.messenger.c20 c20Var) {
        this.f33448a = c20Var;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        this.f33448a.a(new th.f(messageMedia));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.messenger.c20 c20Var = this.f33448a;
        if (c20Var != null) {
            c20Var.a(Boolean.FALSE);
        }
    }
}
