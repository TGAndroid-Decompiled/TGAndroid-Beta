package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ot0 extends vq0 {
    public final org.telegram.ui.ActionBar.o2 X0;

    public ot0(Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.X0 = o2Var;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new ym(this.X0, iVar, i10, 14), 100L);
    }
}
