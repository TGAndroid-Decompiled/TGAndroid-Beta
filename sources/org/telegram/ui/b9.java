package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class b9 extends org.telegram.ui.Components.mo0 {
    public final org.telegram.ui.ActionBar.w2 U2;

    public b9(Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.w2 w2Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.U2 = w2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        int m10;
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
            if (hVar == null) {
                m10 = 1;
            } else {
                m10 = hVar.m();
            }
            a02 = org.telegram.messenger.id.a0(null, null, 2131749187, org.telegram.messenger.id.G(m10, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.bc Q = new org.telegram.ui.Components.gc(this.U2.E, this.I0).Q(2131624028, 36, org.telegram.messenger.g0.X2(a02));
        Q.f32211r = false;
        Q.j();
    }
}
