package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class kt0 extends sq0 {
    public final org.telegram.ui.ActionBar.p2 f24811b1;

    public kt0(Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.f24811b1 = p2Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new my(this.f24811b1, iVar, i10, 12), 100L);
    }
}
