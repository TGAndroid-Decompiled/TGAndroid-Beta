package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class eu0 extends mr0 {
    public final org.telegram.ui.ActionBar.n2 f26170b1;

    public eu0(Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.f26170b1 = n2Var;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new zk(this.f26170b1, iVar, i10, 15), 100L);
    }
}
