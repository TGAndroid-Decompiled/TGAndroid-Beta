package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class a9 extends org.telegram.ui.Components.oo0 {
    public final org.telegram.ui.ActionBar.t2 S2;

    public a9(Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.t2 t2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.S2 = t2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        int m10;
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
            if (hVar == null) {
                m10 = 1;
            } else {
                m10 = hVar.m();
            }
            a02 = org.telegram.messenger.bd.a0(null, null, 2131749195, org.telegram.messenger.bd.G(m10, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.ac Q = new org.telegram.ui.Components.fc(this.S2.F, this.J0).Q(2131624028, 36, org.telegram.messenger.g0.X2(a02));
        Q.f31800r = false;
        Q.j();
    }
}
