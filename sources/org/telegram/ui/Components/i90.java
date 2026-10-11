package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class i90 extends org.telegram.ui.zn {
    public boolean Qc;
    public final boolean Rc;
    public final long Sc;
    public final j90 Tc;

    public i90(j90 j90Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.Tc = j90Var;
        this.Rc = z10;
        this.Sc = j3;
        this.Qc = false;
    }

    public static void bd(i90 i90Var, long j3, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (!AndroidUtilities.isContextSafe(i90Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = i90Var.getParentActivity();
        int i10 = i90Var.currentAccount;
        long j10 = -j3;
        TLRPC.User currentUser = i90Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean z12 = chat.creator;
        d6Var = ((org.telegram.ui.ActionBar.e3) i90Var.Tc).resourcesProvider;
        f11.c(parentActivity, i10, j10, currentUser, null, z11, z12, d6Var);
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
                sc J = ad.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.h0(this, j3, chat, 20));
                J.f30719r = false;
                J.k(true);
                return;
            }
            sc Q = ad.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f30719r = false;
            Q.k(true);
        }
    }
}
