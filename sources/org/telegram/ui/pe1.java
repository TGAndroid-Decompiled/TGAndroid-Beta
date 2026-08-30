package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class pe1 implements org.telegram.ui.Components.ko {
    public final TLRPC.TL_forumTopic f37296a;
    public final kf1 f37297b;

    public pe1(kf1 kf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f37297b = kf1Var;
        this.f37296a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f37297b.finishPreviewFragment();
    }

    @Override
    public final void r() {
        int i10;
        int i11;
        kf1 kf1Var = this.f37297b;
        kf1Var.finishPreviewFragment();
        MessagesController messagesController = kf1Var.getMessagesController();
        long j10 = kf1Var.f35668a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f37296a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f19236id);
        kf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f19236id, !isDialogMuted);
        if (org.telegram.ui.Components.qc.a(kf1Var)) {
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
            org.telegram.ui.Components.qc.z(kf1Var, i10, i11, kf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void s() {
        this.f37297b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new l01(24, this, this.f37296a), 500L);
    }

    @Override
    public final void v() {
        int i10;
        kf1 kf1Var = this.f37297b;
        i10 = ((org.telegram.ui.ActionBar.p2) kf1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j10 = kf1Var.f35668a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f37296a;
        boolean z4 = notificationsSettings.getBoolean(org.telegram.messenger.y3.i(-j10, tL_forumTopic.f19236id, sb), true);
        boolean z10 = !z4 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.y3.i(-j10, tL_forumTopic.f19236id, new StringBuilder("sound_enabled_")), z10).apply();
        kf1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.qc.a(kf1Var)) {
            org.telegram.ui.Components.qc.S(z4 ? 1 : 0, kf1Var, kf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void x(int i10) {
        kf1 kf1Var = this.f37297b;
        long j10 = kf1Var.f35668a;
        kf1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f37296a;
        if (i10 == 0) {
            if (kf1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f19236id)) {
                kf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f19236id, false);
            }
            if (org.telegram.ui.Components.qc.a(kf1Var)) {
                org.telegram.ui.Components.qc.z(kf1Var, 4, i10, kf1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        kf1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f19236id, i10);
        if (org.telegram.ui.Components.qc.a(kf1Var)) {
            org.telegram.ui.Components.qc.z(kf1Var, 5, i10, kf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
    }
}
