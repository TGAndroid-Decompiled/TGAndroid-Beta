package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ku0 extends sr0 {
    public final org.telegram.ui.ActionBar.m2 f27935b1;

    public ku0(Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.f27935b1 = m2Var;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new bl(this.f27935b1, iVar, i10, 15), 100L);
    }
}
