package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class md1 extends org.telegram.ui.Components.sq0 {
    public final od1 f34920b1;

    public md1(od1 od1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f34920b1 = od1Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        od1 od1Var = this.f34920b1;
        if (m10 == 1) {
            od1Var.f35470a.f30949l0.m(((TLRPC.Dialog) iVar.n(0)).f17199id, Integer.valueOf(i10), 61);
        } else {
            od1Var.f35470a.f30949l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
