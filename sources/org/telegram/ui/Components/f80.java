package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class f80 extends org.telegram.ui.co {
    public boolean Qc;
    public final boolean Rc;
    public final long Sc;
    public final g80 Tc;

    public f80(g80 g80Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.Tc = g80Var;
        this.Rc = z10;
        this.Sc = j3;
        this.Qc = false;
    }

    public static void Xc(f80 f80Var, long j3, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (!AndroidUtilities.isContextSafe(f80Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = f80Var.getParentActivity();
        int i10 = f80Var.currentAccount;
        long j10 = -j3;
        TLRPC.User currentUser = f80Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = chat.creator;
        f6Var = ((org.telegram.ui.ActionBar.f3) f80Var.Tc).resourcesProvider;
        a01.c(parentActivity, i10, j10, currentUser, null, z10, z11, f6Var);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Qc && this.Rc) {
            this.Qc = true;
            MessagesController messagesController = getMessagesController();
            long j3 = this.Sc;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (ChatObject.canManageMyTag(chat)) {
                qc J = yc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.h0(this, j3, chat, 21));
                J.f29714r = false;
                J.k(true);
                return;
            }
            qc Q = yc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f29714r = false;
            Q.k(true);
        }
    }
}
