package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class zu extends lq0 {
    public final mv Y0;

    public zu(mv mvVar, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.Y0 = mvVar;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        AndroidUtilities.runOnUIThread(new ah.a(this, hVar, i10, 29), 100L);
    }
}
