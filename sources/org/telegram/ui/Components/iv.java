package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class iv extends xq0 {
    public final vv f25205b1;

    public iv(vv vvVar, Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, str, false, str2, false, d6Var);
        this.f25205b1 = vvVar;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new zm(this, iVar, i10, 1), 100L);
    }
}
