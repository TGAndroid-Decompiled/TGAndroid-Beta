package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class du0 extends nr0 {
    public final org.telegram.ui.ActionBar.r2 f27549a1;

    public du0(Context context, String str, String str2, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null, str, false, str2, false, u6Var);
        this.f27549a1 = r2Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.g4(this.f27549a1, hVar, i10, 18), 100L);
    }
}
