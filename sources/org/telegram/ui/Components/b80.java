package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class b80 extends org.telegram.ui.tn {
    public boolean Mc;
    public final boolean Nc;
    public final long Oc;
    public final c80 Pc;

    public b80(c80 c80Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.Pc = c80Var;
        this.Nc = z10;
        this.Oc = j10;
        this.Mc = false;
    }

    public static void Xc(b80 b80Var, long j10, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.c6 c6Var;
        if (!AndroidUtilities.isContextSafe(b80Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = b80Var.getParentActivity();
        int i10 = b80Var.currentAccount;
        long j11 = -j10;
        TLRPC.User currentUser = b80Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = chat.creator;
        c6Var = ((org.telegram.ui.ActionBar.f3) b80Var.Pc).resourcesProvider;
        uz0.c(parentActivity, i10, j11, currentUser, null, z10, z11, c6Var);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Mc && this.Nc) {
            this.Mc = true;
            MessagesController messagesController = getMessagesController();
            long j10 = this.Oc;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (ChatObject.canManageMyTag(chat)) {
                mc J = tc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new g5.v(this, j10, chat, 23));
                J.f30660r = false;
                J.k(true);
                return;
            }
            mc Q = tc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f30660r = false;
            Q.k(true);
        }
    }
}
