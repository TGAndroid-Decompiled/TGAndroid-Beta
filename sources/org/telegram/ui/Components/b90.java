package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class b90 extends org.telegram.ui.un {
    public boolean f26790kd;
    public final boolean f26791ld;
    public final long f26792md;
    public final c90 f26793nd;

    public b90(c90 c90Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.f26793nd = c90Var;
        this.f26791ld = z10;
        this.f26792md = j10;
        this.f26790kd = false;
    }

    public static void kd(b90 b90Var, long j10, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        if (!AndroidUtilities.isContextSafe(b90Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = b90Var.getParentActivity();
        int i10 = b90Var.currentAccount;
        long j11 = -j10;
        TLRPC.User currentUser = b90Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean z12 = chat.creator;
        u6Var = ((org.telegram.ui.ActionBar.k3) b90Var.f26793nd).resourcesProvider;
        i11.c(parentActivity, i10, j11, currentUser, null, z11, z12, u6Var);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f26790kd && this.f26791ld) {
            this.f26790kd = true;
            MessagesController messagesController = getMessagesController();
            long j10 = this.f26792md;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (ChatObject.canManageMyTag(chat)) {
                qc J = wc.b0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.i0(this, j10, chat, 23));
                J.f31898s = false;
                J.k(true);
                return;
            }
            qc R = wc.b0(this).R(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            R.f31898s = false;
            R.k(true);
        }
    }
}
