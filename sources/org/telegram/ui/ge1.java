package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ge1 implements org.telegram.ui.Components.ap {
    public final TLRPC.TL_forumTopic f39635a;
    public final af1 f39636b;

    public ge1(af1 af1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f39636b = af1Var;
        this.f39635a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f39636b.finishPreviewFragment();
    }

    @Override
    public final void n() {
        int i10;
        int i11;
        af1 af1Var = this.f39636b;
        af1Var.finishPreviewFragment();
        MessagesController messagesController = af1Var.getMessagesController();
        long j10 = af1Var.f37731a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f39635a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f22079id);
        af1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f22079id, !isDialogMuted);
        if (org.telegram.ui.Components.wc.a(af1Var)) {
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
            org.telegram.ui.Components.wc.z(af1Var, i10, i11, af1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
        this.f39636b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new zc1(2, this, this.f39635a), 500L);
    }

    @Override
    public final void r() {
        int i10;
        af1 af1Var = this.f39636b;
        i10 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = af1Var.f37731a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f39635a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.t.j(-j10, tL_forumTopic.f22079id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.t.j(-j10, tL_forumTopic.f22079id, new StringBuilder("sound_enabled_")), z11).apply();
        af1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.wc.a(af1Var)) {
            org.telegram.ui.Components.wc.T(z10 ? 1 : 0, af1Var, af1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void u(int i10) {
        af1 af1Var = this.f39636b;
        long j10 = af1Var.f37731a;
        af1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f39635a;
        if (i10 == 0) {
            if (af1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f22079id)) {
                af1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f22079id, false);
            }
            if (org.telegram.ui.Components.wc.a(af1Var)) {
                org.telegram.ui.Components.wc.z(af1Var, 4, i10, af1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        af1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f22079id, i10);
        if (org.telegram.ui.Components.wc.a(af1Var)) {
            org.telegram.ui.Components.wc.z(af1Var, 5, i10, af1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
