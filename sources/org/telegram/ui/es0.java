package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class es0 implements org.telegram.ui.Components.kg {
    public final PopupNotificationActivity f47304a;

    public es0(PopupNotificationActivity popupNotificationActivity) {
        this.f47304a = popupNotificationActivity;
    }

    @Override
    public final boolean E0() {
        return true;
    }

    @Override
    public final void G1() {
        PopupNotificationActivity popupNotificationActivity = this.f47304a;
        org.telegram.messenger.fj fjVar = popupNotificationActivity.R;
        if (fjVar != null) {
            org.telegram.messenger.mp.u1(fjVar.K1).N4(0, popupNotificationActivity.L, org.telegram.messenger.fj.B0(popupNotificationActivity.R.f23965k), 0L, null);
        }
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        PopupNotificationActivity popupNotificationActivity = this.f47304a;
        if (popupNotificationActivity.R == null) {
            return;
        }
        int i11 = popupNotificationActivity.T;
        if (i11 >= 0 && i11 < popupNotificationActivity.f43410b0.size()) {
            popupNotificationActivity.f43410b0.remove(popupNotificationActivity.T);
        }
        org.telegram.messenger.mp.u1(popupNotificationActivity.R.K1).q3(org.telegram.messenger.fj.B0(popupNotificationActivity.R.f23965k), popupNotificationActivity.R.e1(), Math.max(0, popupNotificationActivity.R.e1()), popupNotificationActivity.R.f23965k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.R = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override
    public final int b1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem c1() {
        return null;
    }

    @Override
    public final boolean e1(long j3) {
        return false;
    }

    @Override
    public final boolean g1() {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final rm m0() {
        return null;
    }

    @Override
    public final boolean m1() {
        return false;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final TLRPC.Peer t() {
        return null;
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final void A(boolean z10) {
    }

    @Override
    public final void a0(boolean z10) {
    }

    @Override
    public final void a1(int i7) {
    }

    @Override
    public final void k2(int i7) {
    }

    @Override
    public final void n2(boolean z10) {
    }

    @Override
    public final void u1(CharSequence charSequence) {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void B2() {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void b0() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void g() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void l1() {
    }

    @Override
    public final void m2() {
    }

    @Override
    public final void n1() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void Q(float f10, int i7) {
    }

    @Override
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
