package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class cw0 implements org.telegram.ui.Components.og {
    public final PopupNotificationActivity f38556a;

    public cw0(PopupNotificationActivity popupNotificationActivity) {
        this.f38556a = popupNotificationActivity;
    }

    @Override
    public final void A(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.f38556a;
        if (popupNotificationActivity.Q == null) {
            return;
        }
        int i12 = popupNotificationActivity.S;
        if (i12 >= 0 && i12 < popupNotificationActivity.f35855a0.size()) {
            popupNotificationActivity.f35855a0.remove(popupNotificationActivity.S);
        }
        MessagesController.getInstance(popupNotificationActivity.Q.currentAccount).markDialogAsRead(popupNotificationActivity.Q.getDialogId(), popupNotificationActivity.Q.getId(), Math.max(0, popupNotificationActivity.Q.getId()), popupNotificationActivity.Q.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.Q = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers B() {
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
    public final boolean R0(long j10) {
        return false;
    }

    @Override
    public final boolean T0() {
        return false;
    }

    @Override
    public final boolean Y0() {
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final int g() {
        return 0;
    }

    @Override
    public final boolean h1() {
        return false;
    }

    @Override
    public final kn i0() {
        return null;
    }

    @Override
    public final TLRPC.Peer k() {
        return null;
    }

    @Override
    public final void o1() {
        PopupNotificationActivity popupNotificationActivity = this.f38556a;
        MessageObject messageObject = popupNotificationActivity.Q;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.Q.getDialogId(), 0L, 0, popupNotificationActivity.K);
        }
    }

    @Override
    public final boolean p0() {
        return true;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void J1() {
    }

    @Override
    public final void N1() {
    }

    @Override
    public final void T1() {
    }

    @Override
    public final void U() {
    }

    @Override
    public final void X0() {
    }

    @Override
    public final void Y1() {
    }

    @Override
    public final void a1() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void b1() {
    }

    @Override
    public final void c1() {
    }

    @Override
    public final void c2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void l0() {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void L1(int i10) {
    }

    @Override
    public final void M0(int i10) {
    }

    @Override
    public final void O1(boolean z10) {
    }

    @Override
    public final void R(boolean z10) {
    }

    @Override
    public final void g1(CharSequence charSequence) {
    }

    @Override
    public final void t(float f7) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void G(float f7, int i10) {
    }

    @Override
    public final void v0(int i10, int i11) {
    }

    @Override
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void P1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
