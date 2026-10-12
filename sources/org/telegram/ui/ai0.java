package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ai0 extends org.telegram.ui.Components.jr0 {
    public final bi0 f34227b1;

    public ai0(bi0 bi0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.f34227b1 = bi0Var;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        ei0 ei0Var = this.f34227b1.K;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f19220id;
            if (j10 != 0 && j10 != ei0Var.getUserConfig().getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, ei0Var.getMessagesController().getPeerName(j10, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0]));
        }
        org.telegram.ui.Components.sc Q = org.telegram.ui.Components.zc.a0(ei0Var).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
        Q.f29110r = false;
        Q.k(true);
    }
}
