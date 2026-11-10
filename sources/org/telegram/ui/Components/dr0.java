package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class dr0 extends mo0 {
    public final org.telegram.ui.ActionBar.f2 U2;

    public dr0(Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.U2 = f2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        org.telegram.messenger.g0.i3(new org.telegram.ui.q8(this.U2, hVar, i7, 17), 100L);
    }
}
