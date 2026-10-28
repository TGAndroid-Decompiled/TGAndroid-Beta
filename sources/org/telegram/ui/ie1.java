package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ie1 implements org.telegram.ui.Components.ap {
    public final TLRPC.TL_forumTopic f40131a;
    public final cf1 f40132b;

    public ie1(cf1 cf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f40132b = cf1Var;
        this.f40131a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f40132b.finishPreviewFragment();
    }

    @Override
    public final void n() {
        int i10;
        int i11;
        cf1 cf1Var = this.f40132b;
        cf1Var.finishPreviewFragment();
        MessagesController messagesController = cf1Var.getMessagesController();
        long j10 = cf1Var.f38288a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f40131a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f22080id);
        cf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f22080id, !isDialogMuted);
        if (org.telegram.ui.Components.wc.a(cf1Var)) {
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
            org.telegram.ui.Components.wc.z(cf1Var, i10, i11, cf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
        this.f40132b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new yc1(3, this, this.f40131a), 500L);
    }

    @Override
    public final void s() {
        int i10;
        cf1 cf1Var = this.f40132b;
        i10 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = cf1Var.f38288a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f40131a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.t.j(-j10, tL_forumTopic.f22080id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.t.j(-j10, tL_forumTopic.f22080id, new StringBuilder("sound_enabled_")), z11).apply();
        cf1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.wc.a(cf1Var)) {
            org.telegram.ui.Components.wc.T(z10 ? 1 : 0, cf1Var, cf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void w(int i10) {
        cf1 cf1Var = this.f40132b;
        long j10 = cf1Var.f38288a;
        cf1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f40131a;
        if (i10 == 0) {
            if (cf1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f22080id)) {
                cf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f22080id, false);
            }
            if (org.telegram.ui.Components.wc.a(cf1Var)) {
                org.telegram.ui.Components.wc.z(cf1Var, 4, i10, cf1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        cf1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f22080id, i10);
        if (org.telegram.ui.Components.wc.a(cf1Var)) {
            org.telegram.ui.Components.wc.z(cf1Var, 5, i10, cf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
