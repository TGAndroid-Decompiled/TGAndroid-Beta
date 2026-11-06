package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class br0 extends mo0 {
    public final org.telegram.ui.ActionBar.f2 R2;

    public br0(Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.R2 = f2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        org.telegram.messenger.g0.i3(new org.telegram.ui.q8(this.R2, hVar, i7, 17), 100L);
    }
}
