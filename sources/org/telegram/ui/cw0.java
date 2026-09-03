package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class cw0 implements org.telegram.ui.Components.eg {
    public final PopupNotificationActivity f33251a;

    public cw0(PopupNotificationActivity popupNotificationActivity) {
        this.f33251a = popupNotificationActivity;
    }

    @Override
    public final boolean B1() {
        return false;
    }

    @Override
    public final void G(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.f33251a;
        if (popupNotificationActivity.N == null) {
            return;
        }
        int i12 = popupNotificationActivity.P;
        if (i12 >= 0 && i12 < popupNotificationActivity.X.size()) {
            popupNotificationActivity.X.remove(popupNotificationActivity.P);
        }
        MessagesController.getInstance(popupNotificationActivity.N.currentAccount).markDialogAsRead(popupNotificationActivity.N.getDialogId(), popupNotificationActivity.N.getId(), Math.max(0, popupNotificationActivity.N.getId()), popupNotificationActivity.N.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.N = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override
    public final boolean H0() {
        return true;
    }

    @Override
    public final void J1() {
        PopupNotificationActivity popupNotificationActivity = this.f33251a;
        MessageObject messageObject = popupNotificationActivity.N;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.N.getDialogId(), 0L, 0, popupNotificationActivity.H);
        }
    }

    @Override
    public final int g1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem i1() {
        return null;
    }

    @Override
    public final boolean k1(long j10) {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    public final TLRPC.Peer r() {
        return null;
    }

    @Override
    public final boolean t1() {
        return false;
    }

    @Override
    public final pn u0() {
        return null;
    }

    @Override
    public final void A1(CharSequence charSequence) {
    }

    @Override
    public final void A2() {
    }

    @Override
    public final void B(boolean z4) {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void E1() {
    }

    @Override
    public final void E2() {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void O0() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void Y(boolean z4) {
    }

    @Override
    public final void Y0() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f1(int i10) {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void k2(int i10) {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void o2(boolean z4) {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void t2() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void v1() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void J0(int i10, int i11) {
    }

    @Override
    public final void K(float f10, int i10) {
    }

    @Override
    public final void q1(CharSequence charSequence, boolean z4, boolean z10) {
    }

    @Override
    public final void y1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override
    public final void p2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
