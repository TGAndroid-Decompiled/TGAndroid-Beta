package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class h70 extends oo0 {
    public final m70 S2;

    public h70(m70 m70Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.S2 = m70Var;
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f27005id;
            if (j10 != 0 && j10 != org.telegram.messenger.h10.i(this.f28583a).e()) {
                a02 = org.telegram.messenger.bd.a0(null, null, 2131749192, org.telegram.messenger.hp.s1(this.f28583a).B1(j10, true));
            } else {
                a02 = org.telegram.messenger.bd.M0(2131749193, null);
            }
        } else {
            a02 = org.telegram.messenger.bd.a0(null, null, 2131749195, org.telegram.messenger.bd.G(i3, "Chats", new Object[0]));
        }
        this.S2.e(org.telegram.messenger.g0.X2(a02));
    }
}
