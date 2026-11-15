package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class o70 extends po0 {
    public final t70 V2;

    public o70(t70 t70Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.V2 = t70Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
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
            a02 = org.telegram.messenger.hd.a0(null, null, 2131749187, org.telegram.messenger.hd.G(i7, "Chats", new Object[0]));
        }
        this.V2.e(org.telegram.messenger.g0.X2(a02));
    }
}
