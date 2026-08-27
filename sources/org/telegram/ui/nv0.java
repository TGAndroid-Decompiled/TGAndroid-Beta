package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class nv0 implements org.telegram.ui.Components.ag {

    public final PopupNotificationActivity f40947a;

    public nv0(PopupNotificationActivity popupNotificationActivity) {
        this.f40947a = popupNotificationActivity;
    }

    @Override
    public final hn P() {
        return null;
    }

    @Override
    public final int P0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem T0() {
        return null;
    }

    @Override
    public final boolean X0(long j10) {
        return false;
    }

    @Override
    public final boolean b1() {
        return false;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final boolean g1() {
        return false;
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final TLRPC.Peer l() {
        return null;
    }

    @Override
    public final boolean n0() {
        return true;
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final void w(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.f40947a;
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
    public final void w1() {
        PopupNotificationActivity popupNotificationActivity = this.f40947a;
        MessageObject messageObject = popupNotificationActivity.M;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.M.getDialogId(), 0L, 0, popupNotificationActivity.G);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers y() {
        return null;
    }

    @Override
    public final void F() {
    }

    @Override
    public final void G(boolean z10) {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void N0(int i10) {
    }

    @Override
    public final void N1() {
    }

    @Override
    public final void S1(int i10) {
    }

    @Override
    public final void U1() {
    }

    @Override
    public final void W1(boolean z10) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void e2() {
    }

    @Override
    public final void f1() {
    }

    @Override
    public final void g0() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void k1() {
    }

    @Override
    public final void l2() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void n(float f10) {
    }

    @Override
    public final void n1(CharSequence charSequence) {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void q2() {
    }

    @Override
    public final void r(boolean z10) {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void A(float f10, int i10) {
    }

    @Override
    public final void o0(int i10, int i11) {
    }

    @Override
    public final void c1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void l1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void X1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
