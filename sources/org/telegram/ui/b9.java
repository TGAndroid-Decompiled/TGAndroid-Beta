package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class b9 extends org.telegram.ui.Components.po0 {
    public final org.telegram.ui.ActionBar.u2 V2;

    public b9(Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.u2 u2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.V2 = u2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        int m10;
        String a02;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f28055id;
            if (j3 != 0 && j3 != org.telegram.messenger.m10.i(this.f29679a).e()) {
                a02 = org.telegram.messenger.hd.a0(null, null, 2131749184, org.telegram.messenger.np.s1(this.f29679a).B1(j3, true));
            } else {
                a02 = org.telegram.messenger.hd.M0(2131749185, null);
            }
        } else {
            if (hVar == null) {
                m10 = 1;
            } else {
                m10 = hVar.m();
            }
            a02 = org.telegram.messenger.hd.a0(null, null, 2131749187, org.telegram.messenger.hd.G(m10, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.xb Q = new org.telegram.ui.Components.cc(this.V2.F, this.J0).Q(2131624029, 36, org.telegram.messenger.g0.X2(a02));
        Q.f41651r = false;
        Q.j();
    }
}
