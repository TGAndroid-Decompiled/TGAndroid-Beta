package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class af0 extends org.telegram.ui.Components.zo0 {
    public final bf0 V2;

    public af0(bf0 bf0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = bf0Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        ef0 ef0Var = this.V2.L;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f28496id;
            if (j3 != 0 && j3 != ef0Var.getUserConfig().e()) {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131748991, ef0Var.getMessagesController().D1(j3, true));
            } else {
                a02 = org.telegram.messenger.gd.N0(2131748992, null);
            }
        } else {
            a02 = org.telegram.messenger.gd.a0(null, null, 2131748994, org.telegram.messenger.gd.G(i7, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.fc Q = org.telegram.ui.Components.kc.b0(ef0Var).Q(2131624029, 36, org.telegram.messenger.g0.W2(a02));
        Q.f35099r = false;
        Q.k(true);
    }
}
