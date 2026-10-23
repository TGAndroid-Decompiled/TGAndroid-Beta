package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class de1 implements org.telegram.ui.Components.yo {
    public final TLRPC.TL_forumTopic f36608a;
    public final ye1 f36609b;

    public de1(ye1 ye1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f36609b = ye1Var;
        this.f36608a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f36609b.finishPreviewFragment();
    }

    @Override
    public final void o() {
        int i10;
        int i11;
        ye1 ye1Var = this.f36609b;
        ye1Var.finishPreviewFragment();
        MessagesController messagesController = ye1Var.getMessagesController();
        long j10 = ye1Var.f43792a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f36608a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f20395id);
        ye1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f20395id, !isDialogMuted);
        if (org.telegram.ui.Components.xc.a(ye1Var)) {
            if (!isDialogMuted) {
                i10 = 3;
            } else {
                i10 = 4;
            }
            if (!isDialogMuted) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            org.telegram.ui.Components.xc.z(ye1Var, i10, i11, ye1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void p() {
        this.f36609b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new o71(12, this, this.f36608a), 500L);
    }

    @Override
    public final void t() {
        int i10;
        ye1 ye1Var = this.f36609b;
        i10 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = ye1Var.f43792a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f36608a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.v0.i(-j10, tL_forumTopic.f20395id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.v0.i(-j10, tL_forumTopic.f20395id, new StringBuilder("sound_enabled_")), z11).apply();
        ye1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.xc.a(ye1Var)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, ye1Var, ye1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void v(int i10) {
        ye1 ye1Var = this.f36609b;
        long j10 = ye1Var.f43792a;
        ye1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f36608a;
        if (i10 == 0) {
            if (ye1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f20395id)) {
                ye1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f20395id, false);
            }
            if (org.telegram.ui.Components.xc.a(ye1Var)) {
                org.telegram.ui.Components.xc.z(ye1Var, 4, i10, ye1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        ye1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f20395id, i10);
        if (org.telegram.ui.Components.xc.a(ye1Var)) {
            org.telegram.ui.Components.xc.z(ye1Var, 5, i10, ye1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
