package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class o70 extends org.telegram.ui.qn {
    public boolean Mc;
    public final boolean Nc;
    public final long Oc;
    public final p70 Pc;

    public o70(p70 p70Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.Pc = p70Var;
        this.Nc = z10;
        this.Oc = j10;
        this.Mc = false;
    }

    public static void Xc(o70 o70Var, long j10, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.b6 b6Var;
        if (!AndroidUtilities.isContextSafe(o70Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = o70Var.getParentActivity();
        int i9 = o70Var.currentAccount;
        long j11 = -j10;
        TLRPC.User currentUser = o70Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = chat.creator;
        b6Var = ((org.telegram.ui.ActionBar.f3) o70Var.Pc).resourcesProvider;
        iz0.c(parentActivity, i9, j11, currentUser, null, z10, z11, b6Var);
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
                gc J = oc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new e5.w(this, j10, chat, 24));
                J.f28745r = false;
                J.k(true);
                return;
            }
            gc Q = oc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f28745r = false;
            Q.k(true);
        }
    }
}
