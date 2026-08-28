package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class a9 extends org.telegram.ui.Components.rp0 {
    public final org.telegram.ui.ActionBar.f3 X0;

    public a9(Context context, String str, String str2, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.ActionBar.f3 f3Var) {
        super(context, null, str, false, str2, false, b6Var);
        this.X0 = f3Var;
    }

    @Override
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        int m10;
        String formatString;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f22384id;
            if (j10 != 0 && j10 != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j10, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            int i10 = R.string.InvLinkToChats;
            if (hVar == null) {
                m10 = 1;
            } else {
                m10 = hVar.m();
            }
            formatString = LocaleController.formatString(i10, LocaleController.formatPluralString("Chats", m10, new Object[0]));
        }
        org.telegram.ui.Components.gc Q = new org.telegram.ui.Components.oc(this.X0.topBulletinContainer, this.resourcesProvider).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
        Q.f28745r = false;
        Q.j();
    }
}
