package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class s70 extends org.telegram.ui.rn {
    public boolean Mc;
    public final boolean Nc;
    public final long Oc;
    public final t70 Pc;

    public s70(t70 t70Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.Pc = t70Var;
        this.Nc = z10;
        this.Oc = j10;
        this.Mc = false;
    }

    public static void Xc(s70 s70Var, long j10, TLRPC.Chat chat) {
        if (AndroidUtilities.isContextSafe(s70Var.getParentActivity())) {
            kz0.c(s70Var.getParentActivity(), s70Var.currentAccount, -j10, s70Var.getUserConfig().getCurrentUser(), null, chat.admin_rights != null, chat.creator, ((org.telegram.ui.ActionBar.e3) s70Var.Pc).resourcesProvider);
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Mc || !this.Nc) {
            return;
        }
        this.Mc = true;
        MessagesController messagesController = getMessagesController();
        long j10 = this.Oc;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (ChatObject.canManageMyTag(chat)) {
            ec ecVarJ = mc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new e5.u(this, j10, chat, 24));
            ecVarJ.f28028r = false;
            ecVarJ.k(true);
        } else {
            ec ecVarQ = mc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            ecVarQ.f28028r = false;
            ecVarQ.k(true);
        }
    }
}
