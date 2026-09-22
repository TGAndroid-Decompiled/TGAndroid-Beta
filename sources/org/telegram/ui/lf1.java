package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class lf1 implements org.telegram.ui.Components.oo {
    public final TLRPC.TL_forumTopic f35453a;
    public final fg1 f35454b;

    public lf1(fg1 fg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f35454b = fg1Var;
        this.f35453a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f35454b.finishPreviewFragment();
    }

    @Override
    public final void n() {
        int i10;
        int i11;
        fg1 fg1Var = this.f35454b;
        fg1Var.finishPreviewFragment();
        MessagesController messagesController = fg1Var.getMessagesController();
        long j3 = fg1Var.f33621a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f35453a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.f18395id);
        fg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f18395id, !isDialogMuted);
        if (org.telegram.ui.Components.xc.a(fg1Var)) {
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
            org.telegram.ui.Components.xc.z(fg1Var, i10, i11, fg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
        this.f35454b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new w81(12, this, this.f35453a), 500L);
    }

    @Override
    public final void r() {
        int i10;
        fg1 fg1Var = this.f35454b;
        i10 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = fg1Var.f33621a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f35453a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.l0.h(-j3, tL_forumTopic.f18395id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.l0.h(-j3, tL_forumTopic.f18395id, new StringBuilder("sound_enabled_")), z11).apply();
        fg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.xc.a(fg1Var)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, fg1Var, fg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void u(int i10) {
        fg1 fg1Var = this.f35454b;
        long j3 = fg1Var.f33621a;
        fg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f35453a;
        if (i10 == 0) {
            if (fg1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.f18395id)) {
                fg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f18395id, false);
            }
            if (org.telegram.ui.Components.xc.a(fg1Var)) {
                org.telegram.ui.Components.xc.z(fg1Var, 4, i10, fg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        fg1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.f18395id, i10);
        if (org.telegram.ui.Components.xc.a(fg1Var)) {
            org.telegram.ui.Components.xc.z(fg1Var, 5, i10, fg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void k() {
    }
}
