package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class h71 extends org.telegram.ui.Components.zo0 {
    public final k71 V2;

    public h71(k71 k71Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.V2 = k71Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        k71 k71Var = this.V2;
        if (m10 == 1) {
            k71Var.f49361a.f52886n0.m(((TLRPC.Dialog) hVar.n(0)).f28496id, Integer.valueOf(i7), 61);
        } else {
            k71Var.f49361a.f52886n0.k(0L, 61, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
