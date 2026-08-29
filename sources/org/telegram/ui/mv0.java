package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class mv0 implements org.telegram.ui.Components.hg {
    public final PopupNotificationActivity f40640a;

    public mv0(PopupNotificationActivity popupNotificationActivity) {
        this.f40640a = popupNotificationActivity;
    }

    @Override
    public final boolean C0() {
        return true;
    }

    @Override
    public final void D(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.f40640a;
        if (popupNotificationActivity.M == null) {
            return;
        }
        int i12 = popupNotificationActivity.O;
        if (i12 >= 0 && i12 < popupNotificationActivity.W.size()) {
            popupNotificationActivity.W.remove(popupNotificationActivity.O);
        }
        MessagesController.getInstance(popupNotificationActivity.M.currentAccount).markDialogAsRead(popupNotificationActivity.M.getDialogId(), popupNotificationActivity.M.getId(), Math.max(0, popupNotificationActivity.M.getId()), popupNotificationActivity.M.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.M = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    @Override
    public final void G1() {
        PopupNotificationActivity popupNotificationActivity = this.f40640a;
        MessageObject messageObject = popupNotificationActivity.M;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.M.getDialogId(), 0L, 0, popupNotificationActivity.G);
        }
    }

    @Override
    public final int b1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public final boolean f1(long j10) {
        return false;
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final jn o0() {
        return null;
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final TLRPC.Peer q() {
        return null;
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final void B() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void M() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void U(boolean z10) {
    }

    @Override
    public final void a1(int i10) {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f2(int i10) {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void k0() {
    }

    @Override
    public final void k2(boolean z10) {
    }

    @Override
    public final void n1() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void v(float f9) {
    }

    @Override
    public final void v1(CharSequence charSequence) {
    }

    @Override
    public final void v2() {
    }

    @Override
    public final void x(boolean z10) {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void z2() {
    }

    @Override
    public final void E0(int i10, int i11) {
    }

    @Override
    public final void I(float f9, int i10) {
    }

    @Override
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void l2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
