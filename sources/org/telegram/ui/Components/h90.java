package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class h90 extends org.telegram.ui.zn {
    public boolean Qc;
    public final boolean Rc;
    public final long Sc;
    public final i90 Tc;

    public h90(i90 i90Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.Tc = i90Var;
        this.Rc = z10;
        this.Sc = j3;
        this.Qc = false;
    }

    public static void bd(h90 h90Var, long j3, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        if (!AndroidUtilities.isContextSafe(h90Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = h90Var.getParentActivity();
        int i10 = h90Var.currentAccount;
        long j10 = -j3;
        TLRPC.User currentUser = h90Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean z12 = chat.creator;
        e6Var = ((org.telegram.ui.ActionBar.f3) h90Var.Tc).resourcesProvider;
        d11.c(parentActivity, i10, j10, currentUser, null, z11, z12, e6Var);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Qc && this.Rc) {
            this.Qc = true;
            MessagesController messagesController = getMessagesController();
            long j3 = this.Sc;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (ChatObject.canManageMyTag(chat)) {
                tc J = ad.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.h0(this, j3, chat, 21));
                J.f31138r = false;
                J.k(true);
                return;
            }
            tc Q = ad.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f31138r = false;
            Q.k(true);
        }
    }
}
