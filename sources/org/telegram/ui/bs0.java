package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class bs0 implements org.telegram.ui.Components.cg {
    public final PopupNotificationActivity f45813a;

    public bs0(PopupNotificationActivity popupNotificationActivity) {
        this.f45813a = popupNotificationActivity;
    }

    @Override
    public final boolean E0() {
        return true;
    }

    @Override
    public final void G1() {
        PopupNotificationActivity popupNotificationActivity = this.f45813a;
        org.telegram.messenger.gj gjVar = popupNotificationActivity.R;
        if (gjVar != null) {
            org.telegram.messenger.np.s1(gjVar.K1).D4(0, popupNotificationActivity.L, org.telegram.messenger.gj.B0(popupNotificationActivity.R.f23819k), 0L, null);
        }
    }

    @Override
    public final void M(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        PopupNotificationActivity popupNotificationActivity = this.f45813a;
        if (popupNotificationActivity.R == null) {
            return;
        }
        int i11 = popupNotificationActivity.T;
        if (i11 >= 0 && i11 < popupNotificationActivity.f42965b0.size()) {
            popupNotificationActivity.f42965b0.remove(popupNotificationActivity.T);
        }
        org.telegram.messenger.np.s1(popupNotificationActivity.R.K1).j3(org.telegram.messenger.gj.B0(popupNotificationActivity.R.f23819k), popupNotificationActivity.R.e1(), Math.max(0, popupNotificationActivity.R.e1()), popupNotificationActivity.R.f23819k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.R = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers O() {
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
    public final boolean l() {
        return false;
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
    public final qm p0() {
        return null;
    }

    @Override
    public final TLRPC.Peer s() {
        return null;
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void a1(int i7) {
    }

    @Override
    public final void b0(boolean z10) {
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
    public final void y(float f10) {
    }

    @Override
    public final void B2() {
    }

    @Override
    public final void E() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void I() {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void Y() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void l1() {
    }

    @Override
    public final void m0() {
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
    public final void v() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void W(float f10, int i7) {
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
