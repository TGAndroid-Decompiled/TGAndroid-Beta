package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class b9 extends org.telegram.ui.Components.no0 {
    public final org.telegram.ui.ActionBar.v2 R2;

    public b9(Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.v2 v2Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.R2 = v2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        int m10;
        String a02;
        if (!z9) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f26960id;
            if (j3 != 0 && j3 != org.telegram.messenger.p10.i(this.f28621a).e()) {
                a02 = org.telegram.messenger.id.a0(null, null, 2131749184, org.telegram.messenger.qp.s1(this.f28621a).B1(j3, true));
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
        org.telegram.ui.Components.cc Q = new org.telegram.ui.Components.hc(this.R2.E, this.I0).Q(2131624028, 36, org.telegram.messenger.g0.X2(a02));
        Q.f32635r = false;
        Q.j();
    }
}
