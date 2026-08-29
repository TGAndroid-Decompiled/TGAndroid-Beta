package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class m80 extends dq0 {
    public final r80 X0;

    public m80(r80 r80Var, Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.X0 = r80Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f22396id;
            if (j10 != 0 && j10 != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j10, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0]));
        }
        this.X0.e(R.raw.forward, AndroidUtilities.replaceTags(formatString));
    }
}
