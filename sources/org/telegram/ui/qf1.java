package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class qf1 implements org.telegram.ui.Components.bp {
    public final TLRPC.TL_forumTopic f39151a;
    public final kg1 f39152b;

    public qf1(kg1 kg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f39152b = kg1Var;
        this.f39151a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f39152b.finishPreviewFragment();
    }

    @Override
    public final void o() {
        int i10;
        int i11;
        kg1 kg1Var = this.f39152b;
        kg1Var.finishPreviewFragment();
        MessagesController messagesController = kg1Var.getMessagesController();
        long j10 = kg1Var.f37380a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f39151a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f18968id);
        kg1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f18968id, !isDialogMuted);
        if (org.telegram.ui.Components.zc.a(kg1Var)) {
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
            org.telegram.ui.Components.zc.z(kg1Var, i10, i11, kg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void p() {
        this.f39152b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new i11(26, this, this.f39151a), 500L);
    }

    @Override
    public final void t() {
        int i10;
        kg1 kg1Var = this.f39152b;
        i10 = ((org.telegram.ui.ActionBar.m2) kg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = kg1Var.f37380a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f39151a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.g0.i(-j10, tL_forumTopic.f18968id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.g0.i(-j10, tL_forumTopic.f18968id, new StringBuilder("sound_enabled_")), z11).apply();
        kg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.zc.a(kg1Var)) {
            org.telegram.ui.Components.zc.S(z10 ? 1 : 0, kg1Var, kg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void y(int i10) {
        kg1 kg1Var = this.f39152b;
        long j10 = kg1Var.f37380a;
        kg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f39151a;
        if (i10 == 0) {
            if (kg1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f18968id)) {
                kg1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f18968id, false);
            }
            if (org.telegram.ui.Components.zc.a(kg1Var)) {
                org.telegram.ui.Components.zc.z(kg1Var, 4, i10, kg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        kg1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f18968id, i10);
        if (org.telegram.ui.Components.zc.a(kg1Var)) {
            org.telegram.ui.Components.zc.z(kg1Var, 5, i10, kg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
