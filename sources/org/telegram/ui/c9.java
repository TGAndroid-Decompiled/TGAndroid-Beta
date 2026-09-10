package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class c9 extends org.telegram.ui.Components.sq0 {
    public final org.telegram.ui.ActionBar.h3 f31573b1;

    public c9(Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.h3 h3Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.f31573b1 = h3Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        int m10;
        String formatString;
        if (!z10) {
            return;
        }
        if (iVar != null && iVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) iVar.n(0)).f17199id;
            if (j3 != 0 && j3 != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j3, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            int i11 = R.string.InvLinkToChats;
            if (iVar == null) {
                m10 = 1;
            } else {
                m10 = iVar.m();
            }
            formatString = LocaleController.formatString(i11, LocaleController.formatPluralString("Chats", m10, new Object[0]));
        }
        org.telegram.ui.Components.pc Q = new org.telegram.ui.Components.wc(this.f31573b1.topBulletinContainer, this.resourcesProvider).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
        Q.f26089r = false;
        Q.j();
    }
}
