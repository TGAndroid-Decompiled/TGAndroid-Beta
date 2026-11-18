package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class z70 extends yo0 {
    public final e80 V2;

    public z70(e80 e80Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = e80Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f28407id;
            if (j3 != 0 && j3 != org.telegram.messenger.j10.i(this.f30187a).e()) {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131748992, org.telegram.messenger.mp.u1(this.f30187a).D1(j3, true));
            } else {
                a02 = org.telegram.messenger.gd.M0(2131748993, null);
            }
        } else {
            a02 = org.telegram.messenger.gd.a0(null, null, 2131748995, org.telegram.messenger.gd.G(i7, "Chats", new Object[0]));
        }
        this.V2.e(org.telegram.messenger.g0.W2(a02));
    }
}
