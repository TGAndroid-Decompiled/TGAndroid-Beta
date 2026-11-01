package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class nt0 implements org.telegram.ui.Components.sf {
    public final PopupNotificationActivity f39974a;

    public nt0(PopupNotificationActivity popupNotificationActivity) {
        this.f39974a = popupNotificationActivity;
    }

    @Override
    public final void E(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.f39974a;
        if (popupNotificationActivity.Q == null) {
            return;
        }
        int i12 = popupNotificationActivity.S;
        if (i12 >= 0 && i12 < popupNotificationActivity.f33686a0.size()) {
            popupNotificationActivity.f33686a0.remove(popupNotificationActivity.S);
        }
        org.telegram.messenger.wp.r1(popupNotificationActivity.Q.I1).h3(org.telegram.messenger.kj.B0(popupNotificationActivity.Q.f16690k), popupNotificationActivity.Q.f1(), Math.max(0, popupNotificationActivity.Q.f1()), popupNotificationActivity.Q.f16690k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.Q = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override
    public final int H0() {
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
    public final kn b0() {
        return null;
    }

    @Override
    public final boolean h1() {
        return false;
    }

    @Override
    public final boolean k0() {
        return true;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void o1() {
        PopupNotificationActivity popupNotificationActivity = this.f39974a;
        org.telegram.messenger.kj kjVar = popupNotificationActivity.Q;
        if (kjVar != null) {
            org.telegram.messenger.wp.r1(kjVar.I1).z4(0, popupNotificationActivity.K, org.telegram.messenger.kj.B0(popupNotificationActivity.Q.f16690k), 0L, null);
        }
    }

    @Override
    public final int r() {
        return 0;
    }

    @Override
    public final TLRPC.Peer u() {
        return null;
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void G0(int i10) {
    }

    @Override
    public final void Q1(int i10) {
    }

    @Override
    public final void U1(boolean z10) {
    }

    @Override
    public final void V(boolean z10) {
    }

    @Override
    public final void g1(CharSequence charSequence) {
    }

    @Override
    public final void y(float f7) {
    }

    @Override
    public final void C() {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void O1() {
    }

    @Override
    public final void T1() {
    }

    @Override
    public final void X() {
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
    public final void b1() {
    }

    @Override
    public final void d1() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void j0() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void n0() {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void I(float f7, int i10) {
    }

    @Override
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void V1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
