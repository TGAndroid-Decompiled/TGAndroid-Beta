package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class fh0 extends org.telegram.ui.Components.mr0 {
    public final gh0 f39381a1;

    public fh0(gh0 gh0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, str, false, str2, false, u6Var);
        this.f39381a1 = gh0Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        jh0 jh0Var = this.f39381a1.K;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f22031id;
            if (j10 != 0 && j10 != jh0Var.getUserConfig().getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, jh0Var.getMessagesController().getPeerName(j10, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0]));
        }
        org.telegram.ui.Components.qc R = org.telegram.ui.Components.wc.b0(jh0Var).R(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
        R.f31898s = false;
        R.k(true);
    }
}
