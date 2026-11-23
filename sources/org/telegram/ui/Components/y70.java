package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class y70 extends zo0 {
    public final d80 V2;

    public y70(d80 d80Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = d80Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f28496id;
            if (j3 != 0 && j3 != org.telegram.messenger.i10.i(this.f30223a).e()) {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131748991, org.telegram.messenger.mp.u1(this.f30223a).D1(j3, true));
            } else {
                a02 = org.telegram.messenger.gd.N0(2131748992, null);
            }
        } else {
            a02 = org.telegram.messenger.gd.a0(null, null, 2131748994, org.telegram.messenger.gd.G(i7, "Chats", new Object[0]));
        }
        this.V2.e(org.telegram.messenger.g0.W2(a02));
    }
}
