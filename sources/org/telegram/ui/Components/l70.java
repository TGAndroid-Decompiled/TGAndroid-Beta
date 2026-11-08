package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class l70 extends mo0 {
    public final q70 R2;

    public l70(q70 q70Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.R2 = q70Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String a02;
        if (!z9) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f26960id;
            if (j3 != 0 && j3 != org.telegram.messenger.p10.i(this.f28616a).e()) {
                a02 = org.telegram.messenger.id.a0(null, null, 2131749185, org.telegram.messenger.qp.s1(this.f28616a).B1(j3, true));
            } else {
                a02 = org.telegram.messenger.id.M0(2131749186, null);
            }
        } else {
            a02 = org.telegram.messenger.id.a0(null, null, 2131749188, org.telegram.messenger.id.G(i7, "Chats", new Object[0]));
        }
        this.R2.e(org.telegram.messenger.g0.X2(a02));
    }
}
