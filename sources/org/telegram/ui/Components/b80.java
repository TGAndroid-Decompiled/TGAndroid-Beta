package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class b80 extends ap0 {
    public final g80 V2;

    public b80(g80 g80Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.V2 = g80Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f28402id;
            if (j3 != 0 && j3 != org.telegram.messenger.k10.i(this.f30139a).e()) {
                a02 = org.telegram.messenger.hd.a0(null, null, 2131748991, org.telegram.messenger.np.u1(this.f30139a).D1(j3, true));
            } else {
                a02 = org.telegram.messenger.hd.N0(2131748992, null);
            }
        } else {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131748994, org.telegram.messenger.hd.G(i7, "Chats", new Object[0]));
        }
        this.V2.e(org.telegram.messenger.g0.W2(a02));
    }
}
