package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class mm implements wk, org.telegram.ui.ActionBar.u1 {
    public final org.telegram.messenger.q20 f28556a;

    public mm(org.telegram.messenger.q20 q20Var) {
        this.f28556a = q20Var;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        this.f28556a.a(new jh.h(messageMedia));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        org.telegram.messenger.q20 q20Var = this.f28556a;
        if (q20Var != null) {
            q20Var.a(Boolean.FALSE);
        }
    }
}
