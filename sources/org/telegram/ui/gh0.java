package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class gh0 extends org.telegram.ui.Components.sp0 {
    public final hh0 X0;

    public gh0(hh0 hh0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.X0 = hh0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String string;
        kh0 kh0Var = this.X0.G;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                string = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0]));
            } else {
                long j10 = ((TLRPC.Dialog) hVar.n(0)).f22384id;
                string = (j10 == 0 || j10 == kh0Var.getUserConfig().getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, kh0Var.getMessagesController().getPeerName(j10, true));
            }
            org.telegram.ui.Components.ec ecVarQ = org.telegram.ui.Components.mc.a0(kh0Var).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(string));
            ecVarQ.f28028r = false;
            ecVarQ.k(true);
        }
    }
}
