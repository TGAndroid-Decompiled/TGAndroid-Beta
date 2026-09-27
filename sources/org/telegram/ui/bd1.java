package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class bd1 extends org.telegram.ui.Components.vq0 {
    public final dd1 X0;

    public bd1(dd1 dd1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.X0 = dd1Var;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        dd1 dd1Var = this.X0;
        if (m10 == 1) {
            dd1Var.f32940a.f36425l0.m(((TLRPC.Dialog) iVar.n(0)).f18333id, Integer.valueOf(i10), 61);
        } else {
            dd1Var.f32940a.f36425l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
