package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class cf0 extends org.telegram.ui.Components.yo0 {
    public final df0 V2;

    public cf0(df0 df0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = df0Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        gf0 gf0Var = this.V2.L;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f28407id;
            if (j3 != 0 && j3 != gf0Var.getUserConfig().e()) {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131748992, gf0Var.getMessagesController().D1(j3, true));
            } else {
                a02 = org.telegram.messenger.gd.M0(2131748993, null);
            }
        } else {
            a02 = org.telegram.messenger.gd.a0(null, null, 2131748995, org.telegram.messenger.gd.G(i7, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.b0(gf0Var).Q(2131624029, 36, org.telegram.messenger.g0.W2(a02));
        Q.f35469r = false;
        Q.k(true);
    }
}
