package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class s80 extends org.telegram.ui.wn {
    public boolean Pc;
    public final boolean Qc;
    public final long Rc;
    public final t80 Sc;

    public s80(t80 t80Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.Sc = t80Var;
        this.Qc = z10;
        this.Rc = j3;
        this.Pc = false;
    }

    public static void Xc(s80 s80Var, long j3, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (!AndroidUtilities.isContextSafe(s80Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = s80Var.getParentActivity();
        int i10 = s80Var.currentAccount;
        long j10 = -j3;
        TLRPC.User currentUser = s80Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = chat.creator;
        d6Var = ((org.telegram.ui.ActionBar.e3) s80Var.Sc).resourcesProvider;
        n01.c(parentActivity, i10, j10, currentUser, null, z10, z11, d6Var);
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
                qc J = yc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.h0(this, j3, chat, 21));
                J.f27649r = false;
                J.k(true);
                return;
            }
            qc Q = yc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f27649r = false;
            Q.k(true);
        }
    }
}
