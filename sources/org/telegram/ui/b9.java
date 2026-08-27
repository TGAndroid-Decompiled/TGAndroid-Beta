package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class b9 extends org.telegram.ui.Components.sp0 {
    public final org.telegram.ui.ActionBar.e3 X0;

    public b9(Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.e3 e3Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.X0 = e3Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String string;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                string = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", hVar == null ? 1 : hVar.m(), new Object[0]));
            } else {
                long j10 = ((TLRPC.Dialog) hVar.n(0)).f22384id;
                string = (j10 == 0 || j10 == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j10, true));
            }
            org.telegram.ui.Components.ec ecVarQ = new org.telegram.ui.Components.mc(this.X0.topBulletinContainer, this.resourcesProvider).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(string));
            ecVarQ.f28028r = false;
            ecVarQ.j();
        }
    }
}
