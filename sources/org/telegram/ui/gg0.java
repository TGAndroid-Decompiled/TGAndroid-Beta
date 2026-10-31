package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class gg0 extends org.telegram.ui.Components.op0 {
    public final hg0 R2;

    public gg0(hg0 hg0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = hg0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        kg0 kg0Var = this.R2.K;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f19797id;
            if (j10 != 0 && j10 != kg0Var.getUserConfig().e()) {
                a02 = org.telegram.messenger.cd.a0(null, null, 2131749194, kg0Var.getMessagesController().A1(j10, true));
            } else {
                a02 = org.telegram.messenger.cd.L0(2131749195, null);
            }
        } else {
            a02 = org.telegram.messenger.cd.a0(null, null, 2131749197, org.telegram.messenger.cd.G(i10, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.wb Q = org.telegram.ui.Components.cc.a0(kg0Var).Q(2131624027, 36, org.telegram.messenger.i0.W2(a02));
        Q.f32143r = false;
        Q.k(true);
    }
}
