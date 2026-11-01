package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class mm implements wk, org.telegram.ui.ActionBar.u1 {
    public final org.telegram.messenger.r20 f28515a;

    public mm(org.telegram.messenger.r20 r20Var) {
        this.f28515a = r20Var;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        this.f28515a.a(new jh.h(messageMedia));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        org.telegram.messenger.r20 r20Var = this.f28515a;
        if (r20Var != null) {
            r20Var.a(Boolean.FALSE);
        }
    }
}
