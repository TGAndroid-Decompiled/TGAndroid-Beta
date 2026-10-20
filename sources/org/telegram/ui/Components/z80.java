package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class z80 extends org.telegram.ui.qn {
    public boolean Rc;
    public final boolean Sc;
    public final long Tc;
    public final a90 Uc;

    public z80(a90 a90Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.Uc = a90Var;
        this.Sc = z10;
        this.Tc = j10;
        this.Rc = false;
    }

    public static void cd(z80 z80Var, long j10, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (!AndroidUtilities.isContextSafe(z80Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = z80Var.getParentActivity();
        int i10 = z80Var.currentAccount;
        long j11 = -j10;
        TLRPC.User currentUser = z80Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean z12 = chat.creator;
        d6Var = ((org.telegram.ui.ActionBar.f3) z80Var.Uc).resourcesProvider;
        x01.c(parentActivity, i10, j11, currentUser, null, z11, z12, d6Var);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Rc && this.Sc) {
            this.Rc = true;
            MessagesController messagesController = getMessagesController();
            long j10 = this.Tc;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (ChatObject.canManageMyTag(chat)) {
                qc J = xc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.i0(this, j10, chat, 23));
                J.f29538r = false;
                J.k(true);
                return;
            }
            qc Q = xc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f29538r = false;
            Q.k(true);
        }
    }
}
