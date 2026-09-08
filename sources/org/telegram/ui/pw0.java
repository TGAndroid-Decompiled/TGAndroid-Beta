package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pw0 implements org.telegram.ui.Components.og {
    public final PopupNotificationActivity f39674a;

    public pw0(PopupNotificationActivity popupNotificationActivity) {
        this.f39674a = popupNotificationActivity;
    }

    @Override
    public final void G(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        PopupNotificationActivity popupNotificationActivity = this.f39674a;
        if (popupNotificationActivity.Q == null) {
            return;
        }
        int i12 = popupNotificationActivity.S;
        if (i12 >= 0 && i12 < popupNotificationActivity.f33786a0.size()) {
            popupNotificationActivity.f33786a0.remove(popupNotificationActivity.S);
        }
        MessagesController.getInstance(popupNotificationActivity.Q.currentAccount).markDialogAsRead(popupNotificationActivity.Q.getDialogId(), popupNotificationActivity.Q.getId(), Math.max(0, popupNotificationActivity.Q.getId()), popupNotificationActivity.Q.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.Q = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override
    public final int W0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem Y0() {
        return null;
    }

    @Override
    public final boolean a1(long j3) {
        return false;
    }

    @Override
    public final boolean d1() {
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
    public final sn o0() {
        return null;
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    public final TLRPC.Peer q() {
        return null;
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void x1() {
        PopupNotificationActivity popupNotificationActivity = this.f39674a;
        MessageObject messageObject = popupNotificationActivity.Q;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.Q.getDialogId(), 0L, 0, popupNotificationActivity.K);
        }
    }

    @Override
    public final boolean z0() {
        return true;
    }

    @Override
    public final void C() {
    }

    @Override
    public final void D0() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void P0() {
    }

    @Override
    public final void U() {
    }

    @Override
    public final void V0(int i10) {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void W(boolean z10) {
    }

    @Override
    public final void X1(int i10) {
    }

    @Override
    public final void a2() {
    }

    @Override
    public final void b2(boolean z10) {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void h1() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void k1() {
    }

    @Override
    public final void l0() {
    }

    @Override
    public final void l1() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void p1(CharSequence charSequence) {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void x(float f7) {
    }

    @Override
    public final void z(boolean z10) {
    }

    @Override
    public final void B0(int i10, int i11) {
    }

    @Override
    public final void J(float f7, int i10) {
    }

    @Override
    public final void f1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void n1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void c2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
