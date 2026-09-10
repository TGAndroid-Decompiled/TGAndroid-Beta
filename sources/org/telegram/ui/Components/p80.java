package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p80 extends org.telegram.ui.eo {
    public boolean Qc;
    public final boolean Rc;
    public final long Sc;
    public final q80 Tc;

    public p80(q80 q80Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.Tc = q80Var;
        this.Rc = z10;
        this.Sc = j3;
        this.Qc = false;
    }

    public static void Xc(p80 p80Var, long j3, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (!AndroidUtilities.isContextSafe(p80Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = p80Var.getParentActivity();
        int i10 = p80Var.currentAccount;
        long j10 = -j3;
        TLRPC.User currentUser = p80Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = chat.creator;
        f6Var = ((org.telegram.ui.ActionBar.h3) p80Var.Tc).resourcesProvider;
        n01.c(parentActivity, i10, j10, currentUser, null, z10, z11, f6Var);
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
                pc J = wc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.h0(this, j3, chat, 15));
                J.f26089r = false;
                J.k(true);
                return;
            }
            pc Q = wc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f26089r = false;
            Q.k(true);
        }
    }
}
