package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class kf1 implements org.telegram.ui.Components.no {
    public final TLRPC.TL_forumTopic f38074a;
    public final eg1 f38075b;

    public kf1(eg1 eg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f38075b = eg1Var;
        this.f38074a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f38075b.finishPreviewFragment();
    }

    @Override
    public final void n() {
        int i10;
        int i11;
        eg1 eg1Var = this.f38075b;
        eg1Var.finishPreviewFragment();
        MessagesController messagesController = eg1Var.getMessagesController();
        long j3 = eg1Var.f36052a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f38074a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.f19948id);
        eg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f19948id, !isDialogMuted);
        if (org.telegram.ui.Components.yc.a(eg1Var)) {
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
            org.telegram.ui.Components.yc.z(eg1Var, i10, i11, eg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void p() {
        this.f38075b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new w81(12, this, this.f38074a), 500L);
    }

    @Override
    public final void s() {
        int i10;
        eg1 eg1Var = this.f38075b;
        i10 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = eg1Var.f36052a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f38074a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.w1.i(-j3, tL_forumTopic.f19948id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.w1.i(-j3, tL_forumTopic.f19948id, new StringBuilder("sound_enabled_")), z11).apply();
        eg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.yc.a(eg1Var)) {
            org.telegram.ui.Components.yc.S(z10 ? 1 : 0, eg1Var, eg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void x(int i10) {
        eg1 eg1Var = this.f38075b;
        long j3 = eg1Var.f36052a;
        eg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f38074a;
        if (i10 == 0) {
            if (eg1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.f19948id)) {
                eg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f19948id, false);
            }
            if (org.telegram.ui.Components.yc.a(eg1Var)) {
                org.telegram.ui.Components.yc.z(eg1Var, 4, i10, eg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        eg1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.f19948id, i10);
        if (org.telegram.ui.Components.yc.a(eg1Var)) {
            org.telegram.ui.Components.yc.z(eg1Var, 5, i10, eg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
