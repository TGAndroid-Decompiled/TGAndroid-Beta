package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ds0 implements org.telegram.ui.Components.mg {
    public final PopupNotificationActivity f47220a;

    public ds0(PopupNotificationActivity popupNotificationActivity) {
        this.f47220a = popupNotificationActivity;
    }

    @Override
    public final void G(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        PopupNotificationActivity popupNotificationActivity = this.f47220a;
        if (popupNotificationActivity.R == null) {
            return;
        }
        int i11 = popupNotificationActivity.T;
        if (i11 >= 0 && i11 < popupNotificationActivity.f43536b0.size()) {
            popupNotificationActivity.f43536b0.remove(popupNotificationActivity.T);
        }
        org.telegram.messenger.mp.u1(popupNotificationActivity.R.K1).q3(org.telegram.messenger.fj.B0(popupNotificationActivity.R.f24073k), popupNotificationActivity.R.e1(), Math.max(0, popupNotificationActivity.R.e1()), popupNotificationActivity.R.f24073k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.R = null;
        popupNotificationActivity.f();
    }

    @Override
    public final void G1() {
        PopupNotificationActivity popupNotificationActivity = this.f47220a;
        org.telegram.messenger.fj fjVar = popupNotificationActivity.R;
        if (fjVar != null) {
            org.telegram.messenger.mp.u1(fjVar.K1).N4(0, popupNotificationActivity.L, org.telegram.messenger.fj.B0(popupNotificationActivity.R.f24073k), 0L, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override
    public final int X0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem Y0() {
        return null;
    }

    @Override
    public final rm a0() {
        return null;
    }

    @Override
    public final boolean b1(long j3) {
        return false;
    }

    @Override
    public final boolean d1() {
        return false;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final TLRPC.Peer o() {
        return null;
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final boolean w0() {
        return true;
    }

    @Override
    public final void Q(boolean z10) {
    }

    @Override
    public final void U0(int i7) {
    }

    @Override
    public final void i2(int i7) {
    }

    @Override
    public final void n2(boolean z10) {
    }

    @Override
    public final void u(float f10) {
    }

    @Override
    public final void u1(CharSequence charSequence) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void E() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void g0() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void j1() {
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
    public final void r() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void t2() {
    }

    @Override
    public final void v2() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void K(float f10, int i7) {
    }

    @Override
    public final void i1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
