package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class e90 extends org.telegram.ui.fo {
    public boolean Qc;
    public final boolean Rc;
    public final long Sc;
    public final f90 Tc;

    public e90(f90 f90Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.Tc = f90Var;
        this.Rc = z10;
        this.Sc = j10;
        this.Qc = false;
    }

    public static void bd(e90 e90Var, long j10, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.c6 c6Var;
        if (!AndroidUtilities.isContextSafe(e90Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = e90Var.getParentActivity();
        int i10 = e90Var.currentAccount;
        long j11 = -j10;
        TLRPC.User currentUser = e90Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean z12 = chat.creator;
        c6Var = ((org.telegram.ui.ActionBar.e3) e90Var.Tc).resourcesProvider;
        a11.c(parentActivity, i10, j11, currentUser, null, z11, z12, c6Var);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Qc && this.Rc) {
            this.Qc = true;
            MessagesController messagesController = getMessagesController();
            long j10 = this.Sc;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (ChatObject.canManageMyTag(chat)) {
                sc J = zc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.i0(this, j10, chat, 20));
                J.f28813r = false;
                J.k(true);
                return;
            }
            sc Q = zc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f28813r = false;
            Q.k(true);
        }
    }
}
