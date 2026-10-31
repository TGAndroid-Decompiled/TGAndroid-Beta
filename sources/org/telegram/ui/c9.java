package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class c9 extends org.telegram.ui.Components.op0 {
    public final org.telegram.ui.ActionBar.z2 R2;

    public c9(Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.z2 z2Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = z2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        int m10;
        String a02;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f19797id;
            if (j10 != 0 && j10 != org.telegram.messenger.d20.i(this.f21583a).e()) {
                a02 = org.telegram.messenger.cd.a0(null, null, 2131749194, org.telegram.messenger.vp.r1(this.f21583a).A1(j10, true));
            } else {
                a02 = org.telegram.messenger.cd.L0(2131749195, null);
            }
        } else {
            if (hVar == null) {
                m10 = 1;
            } else {
                m10 = hVar.m();
            }
            a02 = org.telegram.messenger.cd.a0(null, null, 2131749197, org.telegram.messenger.cd.G(m10, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.wb Q = new org.telegram.ui.Components.cc(this.R2.E, this.I0).Q(2131624027, 36, org.telegram.messenger.i0.W2(a02));
        Q.f32143r = false;
        Q.j();
    }
}
