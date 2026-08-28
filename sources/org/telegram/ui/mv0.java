package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class mv0 implements org.telegram.ui.Components.eg {
    public final PopupNotificationActivity f40538a;

    public mv0(PopupNotificationActivity popupNotificationActivity) {
        this.f40538a = popupNotificationActivity;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers A() {
        return null;
    }

    @Override
    public final int N0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem P0() {
        return null;
    }

    @Override
    public final gn T() {
        return null;
    }

    @Override
    public final boolean T0(long j10) {
        return false;
    }

    @Override
    public final boolean X0() {
        return false;
    }

    @Override
    public final boolean f1() {
        return false;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final TLRPC.Peer k() {
        return null;
    }

    @Override
    public final boolean n0() {
        return true;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final void u1() {
        PopupNotificationActivity popupNotificationActivity = this.f40538a;
        MessageObject messageObject = popupNotificationActivity.M;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.M.getDialogId(), 0L, 0, popupNotificationActivity.G);
        }
    }

    @Override
    public final void y(CharSequence charSequence, boolean z10, int i9, int i10, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.f40538a;
        if (popupNotificationActivity.M == null) {
            return;
        }
        int i11 = popupNotificationActivity.O;
        if (i11 >= 0 && i11 < popupNotificationActivity.W.size()) {
            popupNotificationActivity.W.remove(popupNotificationActivity.O);
        }
        MessagesController.getInstance(popupNotificationActivity.M.currentAccount).markDialogAsRead(popupNotificationActivity.M.getDialogId(), popupNotificationActivity.M.getId(), Math.max(0, popupNotificationActivity.M.getId()), popupNotificationActivity.M.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.M = null;
        popupNotificationActivity.f();
    }

    @Override
    public final void G() {
    }

    @Override
    public final void H(boolean z10) {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void J1() {
    }

    @Override
    public final void K1(int i9) {
    }

    @Override
    public final void L0(int i9) {
    }

    @Override
    public final void Q() {
    }

    @Override
    public final void Q1() {
    }

    @Override
    public final void T1(boolean z10) {
    }

    @Override
    public final void X1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void c1() {
    }

    @Override
    public final void c2() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void h0() {
    }

    @Override
    public final void h1() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void m1(CharSequence charSequence) {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void o(float f10) {
    }

    @Override
    public final void p(boolean z10) {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void B(float f10, int i9) {
    }

    @Override
    public final void p0(int i9, int i10) {
    }

    @Override
    public final void b1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void k1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void U1(int i9, int i10, int i11, long j10, long j11, boolean z10) {
    }
}
