package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class er0 extends po0 {
    public final org.telegram.ui.ActionBar.e2 V2;

    public er0(Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.e2 e2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.V2 = e2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.g0.i3(new org.telegram.ui.f0(this.V2, hVar, i7, 20), 100L);
    }
}
