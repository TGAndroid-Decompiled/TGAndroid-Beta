package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class de1 implements org.telegram.ui.Components.io {
    public final TLRPC.TL_forumTopic f37532a;
    public final ze1 f37533b;

    public de1(ze1 ze1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f37533b = ze1Var;
        this.f37532a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f37533b.finishPreviewFragment();
    }

    @Override
    public final void k() {
        int i10;
        int i11;
        ze1 ze1Var = this.f37533b;
        ze1Var.finishPreviewFragment();
        MessagesController messagesController = ze1Var.getMessagesController();
        long j10 = ze1Var.f45155a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f37532a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f22444id);
        ze1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f22444id, !isDialogMuted);
        if (org.telegram.ui.Components.tc.a(ze1Var)) {
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
            org.telegram.ui.Components.tc.z(ze1Var, i10, i11, ze1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void l() {
        this.f37533b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new t31(15, this, this.f37532a), 500L);
    }

    @Override
    public final void u() {
        int i10;
        ze1 ze1Var = this.f37533b;
        i10 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = ze1Var.f45155a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f37532a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.x3.j(-j10, tL_forumTopic.f22444id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.x3.j(-j10, tL_forumTopic.f22444id, new StringBuilder("sound_enabled_")), z11).apply();
        ze1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.tc.a(ze1Var)) {
            org.telegram.ui.Components.tc.S(z10 ? 1 : 0, ze1Var, ze1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void w(int i10) {
        ze1 ze1Var = this.f37533b;
        long j10 = ze1Var.f45155a;
        ze1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f37532a;
        if (i10 == 0) {
            if (ze1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f22444id)) {
                ze1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f22444id, false);
            }
            if (org.telegram.ui.Components.tc.a(ze1Var)) {
                org.telegram.ui.Components.tc.z(ze1Var, 4, i10, ze1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        ze1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f22444id, i10);
        if (org.telegram.ui.Components.tc.a(ze1Var)) {
            org.telegram.ui.Components.tc.z(ze1Var, 5, i10, ze1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void j() {
    }
}
