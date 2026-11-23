package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class bf0 extends org.telegram.ui.Components.ap0 {
    public final cf0 V2;

    public bf0(cf0 cf0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.V2 = cf0Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        ff0 ff0Var = this.V2.L;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f28402id;
            if (j3 != 0 && j3 != ff0Var.getUserConfig().e()) {
                a02 = org.telegram.messenger.hd.a0(null, null, 2131748991, ff0Var.getMessagesController().D1(j3, true));
            } else {
                a02 = org.telegram.messenger.hd.N0(2131748992, null);
            }
        } else {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131748994, org.telegram.messenger.hd.G(i7, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.b0(ff0Var).Q(2131624029, 36, org.telegram.messenger.g0.W2(a02));
        Q.f35497r = false;
        Q.k(true);
    }
}
