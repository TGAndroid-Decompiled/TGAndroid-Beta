package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class mt0 extends uq0 {
    public final org.telegram.ui.ActionBar.n2 f26493b1;

    public mt0(Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.f26493b1 = n2Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new wm(this.f26493b1, iVar, i10, 14), 100L);
    }
}
