package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class g80 extends org.telegram.ui.xn {
    public boolean Nc;
    public final boolean Oc;
    public final long Pc;
    public final h80 Qc;

    public g80(h80 h80Var, Bundle bundle, boolean z4, long j10) {
        super(bundle);
        this.Qc = h80Var;
        this.Oc = z4;
        this.Pc = j10;
        this.Nc = false;
    }

    public static void Xc(g80 g80Var, long j10, TLRPC.Chat chat) {
        boolean z4;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (!AndroidUtilities.isContextSafe(g80Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = g80Var.getParentActivity();
        int i10 = g80Var.currentAccount;
        long j11 = -j10;
        TLRPC.User currentUser = g80Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z10 = chat.creator;
        f6Var = ((org.telegram.ui.ActionBar.g3) g80Var.Qc).resourcesProvider;
        f01.c(parentActivity, i10, j11, currentUser, null, z4, z10, f6Var);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Nc && this.Oc) {
            this.Nc = true;
            MessagesController messagesController = getMessagesController();
            long j10 = this.Pc;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (ChatObject.canManageMyTag(chat)) {
                ic J = qc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new i5.v(this, j10, chat, 22));
                J.f25680r = false;
                J.k(true);
                return;
            }
            ic Q = qc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f25680r = false;
            Q.k(true);
        }
    }
}
