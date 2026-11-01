package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class eg0 extends org.telegram.ui.Components.pp0 {
    public final fg0 R2;

    public eg0(fg0 fg0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = fg0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        ig0 ig0Var = this.R2.K;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f19798id;
            if (j10 != 0 && j10 != ig0Var.getUserConfig().e()) {
                a02 = org.telegram.messenger.dd.a0(null, null, 2131749194, ig0Var.getMessagesController().A1(j10, true));
            } else {
                a02 = org.telegram.messenger.dd.L0(2131749195, null);
            }
        } else {
            a02 = org.telegram.messenger.dd.a0(null, null, 2131749197, org.telegram.messenger.dd.G(i10, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.wb Q = org.telegram.ui.Components.cc.a0(ig0Var).Q(2131624027, 36, org.telegram.messenger.i0.W2(a02));
        Q.f32209r = false;
        Q.k(true);
    }
}
