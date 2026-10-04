package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class t80 extends org.telegram.ui.yn {
    public boolean Kc;
    public final boolean Lc;
    public final long Mc;
    public final u80 Nc;

    public t80(u80 u80Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.Nc = u80Var;
        this.Lc = z10;
        this.Mc = j3;
        this.Kc = false;
    }

    public static void Wc(t80 t80Var, long j3, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (!AndroidUtilities.isContextSafe(t80Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = t80Var.getParentActivity();
        int i10 = t80Var.currentAccount;
        long j10 = -j3;
        TLRPC.User currentUser = t80Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = chat.creator;
        d6Var = ((org.telegram.ui.ActionBar.f3) t80Var.Nc).resourcesProvider;
        w01.c(parentActivity, i10, j10, currentUser, null, z10, z11, d6Var);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Kc && this.Lc) {
            this.Kc = true;
            MessagesController messagesController = getMessagesController();
            long j3 = this.Mc;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (ChatObject.canManageMyTag(chat)) {
                rc J = yc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.h0(this, j3, chat, 20));
                J.f30353r = false;
                J.k(true);
                return;
            }
            rc Q = yc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f30353r = false;
            Q.k(true);
        }
    }
}
