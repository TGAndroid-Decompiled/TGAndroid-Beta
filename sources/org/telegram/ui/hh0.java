package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class hh0 extends org.telegram.ui.Components.hr0 {
    public final ih0 f37870e1;

    public hh0(ih0 ih0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.f37870e1 = ih0Var;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        lh0 lh0Var = this.f37870e1.K;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f20348id;
            if (j10 != 0 && j10 != lh0Var.getUserConfig().getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, lh0Var.getMessagesController().getPeerName(j10, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0]));
        }
        org.telegram.ui.Components.oc Q = org.telegram.ui.Components.vc.a0(lh0Var).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
        Q.f29211r = false;
        Q.k(true);
    }
}
