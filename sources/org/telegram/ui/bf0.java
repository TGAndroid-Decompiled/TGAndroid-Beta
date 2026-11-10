package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class bf0 extends org.telegram.ui.Components.mo0 {
    public final cf0 U2;

    public bf0(cf0 cf0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.U2 = cf0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String a02;
        ff0 ff0Var = this.U2.K;
        if (!z9) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f26964id;
            if (j3 != 0 && j3 != ff0Var.getUserConfig().e()) {
                a02 = org.telegram.messenger.id.a0(null, null, 2131749184, ff0Var.getMessagesController().B1(j3, true));
            } else {
                a02 = org.telegram.messenger.id.M0(2131749185, null);
            }
        } else {
            a02 = org.telegram.messenger.id.a0(null, null, 2131749187, org.telegram.messenger.id.G(i7, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.bc Q = org.telegram.ui.Components.gc.a0(ff0Var).Q(2131624028, 36, org.telegram.messenger.g0.X2(a02));
        Q.f32211r = false;
        Q.k(true);
    }
}
