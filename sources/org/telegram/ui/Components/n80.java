package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class n80 extends org.telegram.ui.zn {
    public boolean Pc;
    public final boolean Qc;
    public final long Rc;
    public final o80 Sc;

    public n80(o80 o80Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.Sc = o80Var;
        this.Qc = z10;
        this.Rc = j3;
        this.Pc = false;
    }

    public static void Xc(n80 n80Var, long j3, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (!AndroidUtilities.isContextSafe(n80Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = n80Var.getParentActivity();
        int i10 = n80Var.currentAccount;
        long j10 = -j3;
        TLRPC.User currentUser = n80Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = chat.creator;
        f6Var = ((org.telegram.ui.ActionBar.f3) n80Var.Sc).resourcesProvider;
        m01.c(parentActivity, i10, j10, currentUser, null, z10, z11, f6Var);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Pc && this.Qc) {
            this.Pc = true;
            MessagesController messagesController = getMessagesController();
            long j3 = this.Rc;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (ChatObject.canManageMyTag(chat)) {
                pc J = xc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.h0(this, j3, chat, 21));
                J.f27260r = false;
                J.k(true);
                return;
            }
            pc Q = xc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f27260r = false;
            Q.k(true);
        }
    }
}
