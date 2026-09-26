package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ad1 extends org.telegram.ui.Components.uq0 {
    public final cd1 f32136b1;

    public ad1(cd1 cd1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f32136b1 = cd1Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        cd1 cd1Var = this.f32136b1;
        if (m10 == 1) {
            cd1Var.f32690a.f36187l0.m(((TLRPC.Dialog) iVar.n(0)).f18339id, Integer.valueOf(i10), 61);
        } else {
            cd1Var.f32690a.f36187l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
