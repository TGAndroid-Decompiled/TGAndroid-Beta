package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class a90 extends org.telegram.ui.sn {
    public boolean f24665ed;
    public final boolean f24666fd;
    public final long f24667gd;
    public final b90 f24668hd;

    public a90(b90 b90Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.f24668hd = b90Var;
        this.f24666fd = z10;
        this.f24667gd = j10;
        this.f24665ed = false;
    }

    public static void ed(a90 a90Var, long j10, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.g6 g6Var;
        if (!AndroidUtilities.isContextSafe(a90Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = a90Var.getParentActivity();
        int i10 = a90Var.currentAccount;
        long j11 = -j10;
        TLRPC.User currentUser = a90Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean z12 = chat.creator;
        g6Var = ((org.telegram.ui.ActionBar.h3) a90Var.f24668hd).resourcesProvider;
        a11.c(parentActivity, i10, j11, currentUser, null, z11, z12, g6Var);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f24665ed && this.f24666fd) {
            this.f24665ed = true;
            MessagesController messagesController = getMessagesController();
            long j10 = this.f24667gd;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (ChatObject.canManageMyTag(chat)) {
                qc J = xc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.i0(this, j10, chat, 23));
                J.f29840r = false;
                J.k(true);
                return;
            }
            qc Q = xc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f29840r = false;
            Q.k(true);
        }
    }
}
