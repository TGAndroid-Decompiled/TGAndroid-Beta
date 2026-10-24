package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ce1 implements org.telegram.ui.Components.wo {
    public final TLRPC.TL_forumTopic f36319a;
    public final xe1 f36320b;

    public ce1(xe1 xe1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f36320b = xe1Var;
        this.f36319a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f36320b.finishPreviewFragment();
    }

    @Override
    public final void o() {
        int i10;
        int i11;
        xe1 xe1Var = this.f36320b;
        xe1Var.finishPreviewFragment();
        MessagesController messagesController = xe1Var.getMessagesController();
        long j10 = xe1Var.f43545a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f36319a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f20396id);
        xe1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f20396id, !isDialogMuted);
        if (org.telegram.ui.Components.vc.a(xe1Var)) {
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
            org.telegram.ui.Components.vc.z(xe1Var, i10, i11, xe1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void p() {
        this.f36320b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new n71(12, this, this.f36319a), 500L);
    }

    @Override
    public final void t() {
        int i10;
        xe1 xe1Var = this.f36320b;
        i10 = ((org.telegram.ui.ActionBar.o2) xe1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = xe1Var.f43545a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f36319a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.v0.i(-j10, tL_forumTopic.f20396id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.v0.i(-j10, tL_forumTopic.f20396id, new StringBuilder("sound_enabled_")), z11).apply();
        xe1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.vc.a(xe1Var)) {
            org.telegram.ui.Components.vc.S(z10 ? 1 : 0, xe1Var, xe1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void v(int i10) {
        xe1 xe1Var = this.f36320b;
        long j10 = xe1Var.f43545a;
        xe1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f36319a;
        if (i10 == 0) {
            if (xe1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f20396id)) {
                xe1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f20396id, false);
            }
            if (org.telegram.ui.Components.vc.a(xe1Var)) {
                org.telegram.ui.Components.vc.z(xe1Var, 4, i10, xe1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        xe1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f20396id, i10);
        if (org.telegram.ui.Components.vc.a(xe1Var)) {
            org.telegram.ui.Components.vc.z(xe1Var, 5, i10, xe1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
