package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class eh0 extends org.telegram.ui.Components.er0 {
    public final fh0 f36653c1;

    public eh0(fh0 fh0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, str, false, str2, false, d6Var);
        this.f36653c1 = fh0Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        ih0 ih0Var = this.f36653c1.K;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f20277id;
            if (j10 != 0 && j10 != ih0Var.getUserConfig().getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, ih0Var.getMessagesController().getPeerName(j10, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0]));
        }
        org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(ih0Var).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
        Q.f29602r = false;
        Q.k(true);
    }
}
