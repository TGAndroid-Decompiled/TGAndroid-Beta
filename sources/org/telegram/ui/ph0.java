package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ph0 extends org.telegram.ui.Components.hq0 {
    public final qh0 f36114b1;

    public ph0(qh0 qh0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, str, false, str2, false, d6Var);
        this.f36114b1 = qh0Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        th0 th0Var = this.f36114b1.K;
        if (!z10) {
            return;
        }
        if (iVar != null && iVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) iVar.n(0)).f18087id;
            if (j3 != 0 && j3 != th0Var.getUserConfig().getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, th0Var.getMessagesController().getPeerName(j3, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0]));
        }
        org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(th0Var).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
        Q.f27314r = false;
        Q.k(true);
    }
}
