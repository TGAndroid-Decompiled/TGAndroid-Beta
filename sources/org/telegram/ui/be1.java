package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class be1 implements org.telegram.ui.Components.eo {
    public final TLRPC.TL_forumTopic f36843a;
    public final we1 f36844b;

    public be1(we1 we1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f36844b = we1Var;
        this.f36843a = tL_forumTopic;
    }

    @Override
    public final void A(int i9) {
        we1 we1Var = this.f36844b;
        long j10 = we1Var.f43741a;
        we1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f36843a;
        if (i9 == 0) {
            if (we1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f22432id)) {
                we1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f22432id, false);
            }
            if (org.telegram.ui.Components.oc.a(we1Var)) {
                org.telegram.ui.Components.oc.z(we1Var, 4, i9, we1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        we1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f22432id, i9);
        if (org.telegram.ui.Components.oc.a(we1Var)) {
            org.telegram.ui.Components.oc.z(we1Var, 5, i9, we1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f36844b.finishPreviewFragment();
    }

    @Override
    public final void p() {
        int i9;
        int i10;
        we1 we1Var = this.f36844b;
        we1Var.finishPreviewFragment();
        MessagesController messagesController = we1Var.getMessagesController();
        long j10 = we1Var.f43741a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f36843a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f22432id);
        we1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f22432id, !isDialogMuted);
        if (org.telegram.ui.Components.oc.a(we1Var)) {
            if (!isDialogMuted) {
                i9 = 3;
            } else {
                i9 = 4;
            }
            if (!isDialogMuted) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            org.telegram.ui.Components.oc.z(we1Var, i9, i10, we1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void s() {
        this.f36844b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new n21(18, this, this.f36843a), 500L);
    }

    @Override
    public final void w() {
        int i9;
        we1 we1Var = this.f36844b;
        i9 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i9);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = we1Var.f43741a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f36843a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.l0.i(-j10, tL_forumTopic.f22432id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.l0.i(-j10, tL_forumTopic.f22432id, new StringBuilder("sound_enabled_")), z11).apply();
        we1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.oc.a(we1Var)) {
            org.telegram.ui.Components.oc.S(z10 ? 1 : 0, we1Var, we1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
    }
}
