package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class c9 extends org.telegram.ui.Components.ap0 {
    public final org.telegram.ui.ActionBar.w2 V2;

    public c9(Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.w2 w2Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.V2 = w2Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        int m10;
        String a02;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f28435id;
            if (j3 != 0 && j3 != org.telegram.messenger.j10.i(this.f30170a).e()) {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131748991, org.telegram.messenger.mp.u1(this.f30170a).D1(j3, true));
            } else {
                a02 = org.telegram.messenger.gd.N0(2131748992, null);
            }
        } else {
            if (hVar == null) {
                m10 = 1;
            } else {
                m10 = hVar.m();
            }
            a02 = org.telegram.messenger.gd.a0(null, null, 2131748994, org.telegram.messenger.gd.G(m10, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.gc Q = new org.telegram.ui.Components.lc(this.V2.F, this.J0).Q(2131624029, 36, org.telegram.messenger.g0.W2(a02));
        Q.f35516r = false;
        Q.j();
    }
}
