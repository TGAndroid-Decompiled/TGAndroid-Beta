package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class nf1 implements org.telegram.ui.Components.gp {
    public final TLRPC.TL_forumTopic f40402a;
    public final hg1 f40403b;

    public nf1(hg1 hg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f40403b = hg1Var;
        this.f40402a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f40403b.finishPreviewFragment();
    }

    @Override
    public final void k() {
        int i10;
        int i11;
        hg1 hg1Var = this.f40403b;
        hg1Var.finishPreviewFragment();
        MessagesController messagesController = hg1Var.getMessagesController();
        long j3 = hg1Var.f38376a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f40402a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.f19854id);
        hg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f19854id, !isDialogMuted);
        if (org.telegram.ui.Components.zc.a(hg1Var)) {
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
            org.telegram.ui.Components.zc.z(hg1Var, i10, i11, hg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void l() {
        this.f40403b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new w31(17, this, this.f40402a), 500L);
    }

    @Override
    public final void q() {
        int i10;
        hg1 hg1Var = this.f40403b;
        i10 = ((org.telegram.ui.ActionBar.m2) hg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = hg1Var.f38376a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f40402a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.v0.i(-j3, tL_forumTopic.f19854id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.v0.i(-j3, tL_forumTopic.f19854id, new StringBuilder("sound_enabled_")), z11).apply();
        hg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.zc.a(hg1Var)) {
            org.telegram.ui.Components.zc.S(z10 ? 1 : 0, hg1Var, hg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void t(int i10) {
        hg1 hg1Var = this.f40403b;
        long j3 = hg1Var.f38376a;
        hg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f40402a;
        if (i10 == 0) {
            if (hg1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.f19854id)) {
                hg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f19854id, false);
            }
            if (org.telegram.ui.Components.zc.a(hg1Var)) {
                org.telegram.ui.Components.zc.z(hg1Var, 4, i10, hg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        hg1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.f19854id, i10);
        if (org.telegram.ui.Components.zc.a(hg1Var)) {
            org.telegram.ui.Components.zc.z(hg1Var, 5, i10, hg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void j() {
    }
}
