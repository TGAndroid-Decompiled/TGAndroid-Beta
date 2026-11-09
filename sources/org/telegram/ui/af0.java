package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class af0 extends org.telegram.ui.Components.no0 {
    public final bf0 R2;

    public af0(bf0 bf0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.R2 = bf0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String a02;
        ef0 ef0Var = this.R2.K;
        if (!z9) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f26960id;
            if (j3 != 0 && j3 != ef0Var.getUserConfig().e()) {
                a02 = org.telegram.messenger.id.a0(null, null, 2131749184, ef0Var.getMessagesController().B1(j3, true));
            } else {
                a02 = org.telegram.messenger.id.M0(2131749185, null);
            }
        } else {
            a02 = org.telegram.messenger.id.a0(null, null, 2131749187, org.telegram.messenger.id.G(i7, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.cc Q = org.telegram.ui.Components.hc.a0(ef0Var).Q(2131624028, 36, org.telegram.messenger.g0.X2(a02));
        Q.f32635r = false;
        Q.k(true);
    }
}
