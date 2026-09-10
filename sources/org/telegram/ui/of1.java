package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class of1 implements org.telegram.ui.Components.to {
    public final TLRPC.TL_forumTopic f35485a;
    public final ig1 f35486b;

    public of1(ig1 ig1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f35486b = ig1Var;
        this.f35485a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f35486b.finishPreviewFragment();
    }

    @Override
    public final void n() {
        int i10;
        int i11;
        ig1 ig1Var = this.f35486b;
        ig1Var.finishPreviewFragment();
        MessagesController messagesController = ig1Var.getMessagesController();
        long j3 = ig1Var.f33681a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f35485a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.f17247id);
        ig1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f17247id, !isDialogMuted);
        if (org.telegram.ui.Components.wc.a(ig1Var)) {
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
            org.telegram.ui.Components.wc.z(ig1Var, i10, i11, ig1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
        this.f35486b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new r91(9, this, this.f35485a), 500L);
    }

    @Override
    public final void r() {
        int i10;
        ig1 ig1Var = this.f35486b;
        i10 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = ig1Var.f33681a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f35485a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.a2.i(-j3, tL_forumTopic.f17247id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.a2.i(-j3, tL_forumTopic.f17247id, new StringBuilder("sound_enabled_")), z11).apply();
        ig1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.wc.a(ig1Var)) {
            org.telegram.ui.Components.wc.S(z10 ? 1 : 0, ig1Var, ig1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void t(int i10) {
        ig1 ig1Var = this.f35486b;
        long j3 = ig1Var.f33681a;
        ig1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f35485a;
        if (i10 == 0) {
            if (ig1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.f17247id)) {
                ig1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f17247id, false);
            }
            if (org.telegram.ui.Components.wc.a(ig1Var)) {
                org.telegram.ui.Components.wc.z(ig1Var, 4, i10, ig1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        ig1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.f17247id, i10);
        if (org.telegram.ui.Components.wc.a(ig1Var)) {
            org.telegram.ui.Components.wc.z(ig1Var, 5, i10, ig1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void l() {
    }
}
