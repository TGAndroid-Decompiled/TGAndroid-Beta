package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class gs0 implements org.telegram.ui.Components.wf {
    public final PopupNotificationActivity f46062a;

    public gs0(PopupNotificationActivity popupNotificationActivity) {
        this.f46062a = popupNotificationActivity;
    }

    @Override
    public final void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        PopupNotificationActivity popupNotificationActivity = this.f46062a;
        if (popupNotificationActivity.Q == null) {
            return;
        }
        int i11 = popupNotificationActivity.S;
        if (i11 >= 0 && i11 < popupNotificationActivity.f41601a0.size()) {
            popupNotificationActivity.f41601a0.remove(popupNotificationActivity.S);
        }
        org.telegram.messenger.qp.s1(popupNotificationActivity.Q.I1).j3(org.telegram.messenger.ij.B0(popupNotificationActivity.Q.f23262k), popupNotificationActivity.Q.e1(), Math.max(0, popupNotificationActivity.Q.e1()), popupNotificationActivity.Q.f23262k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.Q = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override
    public final int S0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem T0() {
        return null;
    }

    @Override
    public final boolean V0(long j3) {
        return false;
    }

    @Override
    public final boolean X0() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final boolean d1() {
        return false;
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final sm o0() {
        return null;
    }

    @Override
    public final TLRPC.Peer s() {
        return null;
    }

    @Override
    public final void t1() {
        PopupNotificationActivity popupNotificationActivity = this.f46062a;
        org.telegram.messenger.ij ijVar = popupNotificationActivity.Q;
        if (ijVar != null) {
            org.telegram.messenger.qp.s1(ijVar.I1).C4(0, popupNotificationActivity.K, org.telegram.messenger.ij.B0(popupNotificationActivity.Q.f23262k), 0L, null);
        }
    }

    @Override
    public final boolean v0() {
        return true;
    }

    @Override
    public final void B(boolean z9) {
    }

    @Override
    public final void R0(int i7) {
    }

    @Override
    public final void V1(int i7) {
    }

    @Override
    public final void Y(boolean z9) {
    }

    @Override
    public final void Y1(boolean z9) {
    }

    @Override
    public final void k1(CharSequence charSequence) {
    }

    @Override
    public final void w(float f10) {
    }

    @Override
    public final void C0() {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void E() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void T1() {
    }

    @Override
    public final void W() {
    }

    @Override
    public final void X1() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c1() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void e1() {
    }

    @Override
    public final void f1() {
    }

    @Override
    public final void h1() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void j0() {
    }

    @Override
    public final void l2() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void M(float f10, int i7) {
    }

    @Override
    public final void a1(CharSequence charSequence, boolean z9, boolean z10) {
    }

    @Override
    public final void i1(View view, CharSequence charSequence, boolean z9) {
    }

    @Override
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
    }
}
