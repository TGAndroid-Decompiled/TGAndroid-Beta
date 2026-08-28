package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dh0 extends org.telegram.ui.Components.rp0 {
    public final eh0 X0;

    public dh0(eh0 eh0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, str, false, str2, false, b6Var);
        this.X0 = eh0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        hh0 hh0Var = this.X0.G;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f22384id;
            if (j10 != 0 && j10 != hh0Var.getUserConfig().getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, hh0Var.getMessagesController().getPeerName(j10, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i9, new Object[0]));
        }
        org.telegram.ui.Components.gc Q = org.telegram.ui.Components.oc.a0(hh0Var).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
        Q.f28745r = false;
        Q.k(true);
    }
}
