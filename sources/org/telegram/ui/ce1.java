package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class ce1 implements org.telegram.ui.Components.bo {

    public final TLRPC.TL_forumTopic f37065a;

    public final we1 f37066b;

    public ce1(we1 we1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f37066b = we1Var;
        this.f37065a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f37066b.finishPreviewFragment();
    }

    @Override
    public final void m() {
        we1 we1Var = this.f37066b;
        we1Var.finishPreviewFragment();
        MessagesController messagesController = we1Var.getMessagesController();
        long j10 = we1Var.f43719a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f37065a;
        boolean zIsDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f22432id);
        we1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f22432id, !zIsDialogMuted);
        if (org.telegram.ui.Components.mc.a(we1Var)) {
            org.telegram.ui.Components.mc.z(we1Var, !zIsDialogMuted ? 3 : 4, !zIsDialogMuted ? Integer.MAX_VALUE : 0, we1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
        this.f37066b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new m21(18, this, this.f37065a), 500L);
    }

    @Override
    public final void u() {
        we1 we1Var = this.f37066b;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) we1Var).currentAccount);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = we1Var.f43719a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f37065a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.y1.j(-j10, tL_forumTopic.f22432id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.y1.j(-j10, tL_forumTopic.f22432id, new StringBuilder("sound_enabled_")), !z10).apply();
        we1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.mc.a(we1Var)) {
            org.telegram.ui.Components.mc.S(z10 ? 1 : 0, we1Var, we1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void v(int i10) {
        we1 we1Var = this.f37066b;
        long j10 = we1Var.f43719a;
        we1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f37065a;
        if (i10 != 0) {
            we1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f22432id, i10);
            if (org.telegram.ui.Components.mc.a(we1Var)) {
                org.telegram.ui.Components.mc.z(we1Var, 5, i10, we1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (we1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f22432id)) {
            we1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f22432id, false);
        }
        if (org.telegram.ui.Components.mc.a(we1Var)) {
            org.telegram.ui.Components.mc.z(we1Var, 4, i10, we1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void k() {
    }
}
