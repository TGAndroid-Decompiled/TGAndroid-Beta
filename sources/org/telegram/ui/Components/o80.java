package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class o80 extends org.telegram.ui.zn {
    public boolean Pc;
    public final boolean Qc;
    public final long Rc;
    public final p80 Sc;

    public o80(p80 p80Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.Sc = p80Var;
        this.Qc = z10;
        this.Rc = j3;
        this.Pc = false;
    }

    public static void Xc(o80 o80Var, long j3, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        if (!AndroidUtilities.isContextSafe(o80Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = o80Var.getParentActivity();
        int i10 = o80Var.currentAccount;
        long j10 = -j3;
        TLRPC.User currentUser = o80Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = chat.creator;
        e6Var = ((org.telegram.ui.ActionBar.f3) o80Var.Sc).resourcesProvider;
        n01.c(parentActivity, i10, j10, currentUser, null, z10, z11, e6Var);
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
                qc J = xc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.h0(this, j3, chat, 21));
                J.f27558r = false;
                J.k(true);
                return;
            }
            qc Q = xc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f27558r = false;
            Q.k(true);
        }
    }
}
