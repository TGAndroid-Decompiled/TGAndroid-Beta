package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class br0 extends oo0 {
    public final org.telegram.ui.ActionBar.d2 S2;

    public br0(Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.S2 = d2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.g0.i3(new org.telegram.ui.f4(this.S2, hVar, i3, 18), 100L);
    }
}
