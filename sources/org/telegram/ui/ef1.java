package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ef1 implements org.telegram.ui.Components.ro {
    public final TLRPC.TL_forumTopic f36013a;
    public final yf1 f36014b;

    public ef1(yf1 yf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f36014b = yf1Var;
        this.f36013a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f36014b.finishPreviewFragment();
    }

    @Override
    public final void k() {
        int i10;
        int i11;
        yf1 yf1Var = this.f36014b;
        yf1Var.finishPreviewFragment();
        MessagesController messagesController = yf1Var.getMessagesController();
        long j3 = yf1Var.f43163a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f36013a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.f20090id);
        yf1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f20090id, !isDialogMuted);
        if (org.telegram.ui.Components.yc.a(yf1Var)) {
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
            org.telegram.ui.Components.yc.z(yf1Var, i10, i11, yf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void l() {
        this.f36014b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new g91(9, this, this.f36013a), 500L);
    }

    @Override
    public final void r() {
        int i10;
        yf1 yf1Var = this.f36014b;
        i10 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = yf1Var.f43163a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f36013a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.f0.i(-j3, tL_forumTopic.f20090id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.f0.i(-j3, tL_forumTopic.f20090id, new StringBuilder("sound_enabled_")), z11).apply();
        yf1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.yc.a(yf1Var)) {
            org.telegram.ui.Components.yc.S(z10 ? 1 : 0, yf1Var, yf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void t(int i10) {
        yf1 yf1Var = this.f36014b;
        long j3 = yf1Var.f43163a;
        yf1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f36013a;
        if (i10 == 0) {
            if (yf1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.f20090id)) {
                yf1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f20090id, false);
            }
            if (org.telegram.ui.Components.yc.a(yf1Var)) {
                org.telegram.ui.Components.yc.z(yf1Var, 4, i10, yf1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        yf1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.f20090id, i10);
        if (org.telegram.ui.Components.yc.a(yf1Var)) {
            org.telegram.ui.Components.yc.z(yf1Var, 5, i10, yf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void j() {
    }
}
