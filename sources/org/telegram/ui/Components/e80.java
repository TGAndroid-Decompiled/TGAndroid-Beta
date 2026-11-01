package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class e80 extends pp0 {
    public final j80 R2;

    public e80(j80 j80Var, Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = j80Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f19798id;
            if (j10 != 0 && j10 != org.telegram.messenger.e20.i(this.f21584a).e()) {
                a02 = org.telegram.messenger.dd.a0(null, null, 2131749194, org.telegram.messenger.wp.r1(this.f21584a).A1(j10, true));
            } else {
                a02 = org.telegram.messenger.dd.L0(2131749195, null);
            }
        } else {
            a02 = org.telegram.messenger.dd.a0(null, null, 2131749197, org.telegram.messenger.dd.G(i10, "Chats", new Object[0]));
        }
        this.R2.e(org.telegram.messenger.i0.W2(a02));
    }
}
