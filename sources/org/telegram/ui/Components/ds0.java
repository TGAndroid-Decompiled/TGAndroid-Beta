package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ds0 extends pp0 {
    public final org.telegram.ui.ActionBar.k2 R2;

    public ds0(Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = k2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.i0.h3(new ki0(this.R2, hVar, i10, 4), 100L);
    }
}
