package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class l70 extends mo0 {
    public final q70 U2;

    public l70(q70 q70Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.U2 = q70Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String a02;
        if (!z9) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f26964id;
            if (j3 != 0 && j3 != org.telegram.messenger.p10.i(this.f28669a).e()) {
                a02 = org.telegram.messenger.id.a0(null, null, 2131749184, org.telegram.messenger.qp.s1(this.f28669a).B1(j3, true));
            } else {
                a02 = org.telegram.messenger.id.M0(2131749185, null);
            }
        } else {
            a02 = org.telegram.messenger.id.a0(null, null, 2131749187, org.telegram.messenger.id.G(i7, "Chats", new Object[0]));
        }
        this.U2.e(org.telegram.messenger.g0.X2(a02));
    }
}
