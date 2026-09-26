package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class cf1 implements org.telegram.ui.Components.qo {
    public final TLRPC.TL_forumTopic f32708a;
    public final wf1 f32709b;

    public cf1(wf1 wf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f32709b = wf1Var;
        this.f32708a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f32709b.finishPreviewFragment();
    }

    @Override
    public final void n() {
        int i10;
        int i11;
        wf1 wf1Var = this.f32709b;
        wf1Var.finishPreviewFragment();
        MessagesController messagesController = wf1Var.getMessagesController();
        long j3 = wf1Var.f39307a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f32708a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.f18387id);
        wf1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f18387id, !isDialogMuted);
        if (org.telegram.ui.Components.xc.a(wf1Var)) {
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
            org.telegram.ui.Components.xc.z(wf1Var, i10, i11, wf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
        this.f32709b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new p81(11, this, this.f32708a), 500L);
    }

    @Override
    public final void r() {
        int i10;
        wf1 wf1Var = this.f32709b;
        i10 = ((org.telegram.ui.ActionBar.m2) wf1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = wf1Var.f39307a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f32708a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.f0.i(-j3, tL_forumTopic.f18387id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.f0.i(-j3, tL_forumTopic.f18387id, new StringBuilder("sound_enabled_")), z11).apply();
        wf1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.xc.a(wf1Var)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, wf1Var, wf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void u(int i10) {
        wf1 wf1Var = this.f32709b;
        long j3 = wf1Var.f39307a;
        wf1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f32708a;
        if (i10 == 0) {
            if (wf1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.f18387id)) {
                wf1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f18387id, false);
            }
            if (org.telegram.ui.Components.xc.a(wf1Var)) {
                org.telegram.ui.Components.xc.z(wf1Var, 4, i10, wf1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        wf1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.f18387id, i10);
        if (org.telegram.ui.Components.xc.a(wf1Var)) {
            org.telegram.ui.Components.xc.z(wf1Var, 5, i10, wf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
