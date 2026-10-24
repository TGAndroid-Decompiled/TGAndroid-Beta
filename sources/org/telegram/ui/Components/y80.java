package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class y80 extends org.telegram.ui.sn {
    public boolean f32844ed;
    public final boolean f32845fd;
    public final long f32846gd;
    public final z80 f32847hd;

    public y80(z80 z80Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.f32847hd = z80Var;
        this.f32845fd = z10;
        this.f32846gd = j10;
        this.f32844ed = false;
    }

    public static void ed(y80 y80Var, long j10, TLRPC.Chat chat) {
        boolean z10;
        org.telegram.ui.ActionBar.g6 g6Var;
        if (!AndroidUtilities.isContextSafe(y80Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = y80Var.getParentActivity();
        int i10 = y80Var.currentAccount;
        long j11 = -j10;
        TLRPC.User currentUser = y80Var.getUserConfig().getCurrentUser();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean z12 = chat.creator;
        g6Var = ((org.telegram.ui.ActionBar.h3) y80Var.f32847hd).resourcesProvider;
        z01.c(parentActivity, i10, j11, currentUser, null, z11, z12, g6Var);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f32844ed && this.f32845fd) {
            this.f32844ed = true;
            MessagesController messagesController = getMessagesController();
            long j10 = this.f32846gd;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (ChatObject.canManageMyTag(chat)) {
                oc J = vc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.i0(this, j10, chat, 23));
                J.f29211r = false;
                J.k(true);
                return;
            }
            oc Q = vc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.f29211r = false;
            Q.k(true);
        }
    }
}
