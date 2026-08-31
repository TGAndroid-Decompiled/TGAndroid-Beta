package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class d9 extends org.telegram.ui.Components.mq0 {
    public final org.telegram.ui.ActionBar.h3 Y0;

    public d9(Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.h3 h3Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.Y0 = h3Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        int m9;
        String formatString;
        if (!z4) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f20847id;
            if (j10 != 0 && j10 != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j10, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            int i11 = R.string.InvLinkToChats;
            if (hVar == null) {
                m9 = 1;
            } else {
                m9 = hVar.m();
            }
            formatString = LocaleController.formatString(i11, LocaleController.formatPluralString("Chats", m9, new Object[0]));
        }
        org.telegram.ui.Components.ic Q = new org.telegram.ui.Components.qc(this.Y0.topBulletinContainer, this.resourcesProvider).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
        Q.f27753r = false;
        Q.j();
    }
}
