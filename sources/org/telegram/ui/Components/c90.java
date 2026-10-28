package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class c90 extends org.telegram.ui.wn {
    public boolean f27104od;
    public final boolean f27105pd;
    public final long f27106qd;
    public final d90 f27107rd;

    public c90(d90 d90Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.f27107rd = d90Var;
        this.f27105pd = z10;
        this.f27106qd = j10;
        this.f27104od = false;
    }

    public static void od(c90 c90Var, long j10, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        if (!AndroidUtilities.isContextSafe(c90Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = c90Var.getParentActivity();
        int i10 = c90Var.currentAccount;
        long j11 = -j10;
        TLRPC.User currentUser = c90Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean z12 = chat.creator;
        u6Var = ((org.telegram.ui.ActionBar.k3) c90Var.f27107rd).resourcesProvider;
        j11.c(parentActivity, i10, j11, currentUser, null, z11, z12, u6Var);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f27104od && this.f27105pd) {
            this.f27104od = true;
            MessagesController messagesController = getMessagesController();
            long j10 = this.f27106qd;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (ChatObject.canManageMyTag(chat)) {
                qc J = wc.b0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.i0(this, j10, chat, 23));
                J.f31870s = false;
                J.k(true);
                return;
            }
            qc R = wc.b0(this).R(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            R.f31870s = false;
            R.k(true);
        }
    }
}
