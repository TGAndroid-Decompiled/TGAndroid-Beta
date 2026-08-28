package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pw implements org.telegram.ui.Components.eg {
    public final dy f41606a;

    public pw(dy dyVar) {
        this.f41606a = dyVar;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers A() {
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
    public final gn T() {
        return null;
    }

    @Override
    public final boolean T0(long j10) {
        return false;
    }

    @Override
    public final boolean X0() {
        return false;
    }

    @Override
    public final void b1(CharSequence charSequence, boolean z10, boolean z11) {
        dy dyVar = this.f41606a;
        AndroidUtilities.runOnUIThread(new uv(dyVar, 12), 100L);
        org.telegram.ui.Components.wp0 wp0Var = dyVar.C2;
        if (wp0Var != null) {
            if (z10) {
                if (wp0Var.h) {
                    wp0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.p61 p61Var = dyVar.D2;
            if (p61Var != null) {
                AndroidUtilities.cancelRunOnUIThread(p61Var);
            }
            org.telegram.ui.Components.p61 p61Var2 = new org.telegram.ui.Components.p61(16, this, charSequence);
            dyVar.D2 = p61Var2;
            AndroidUtilities.runOnUIThread(p61Var2, 1000L);
        }
    }

    @Override
    public final boolean f1() {
        return false;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final TLRPC.Peer k() {
        return null;
    }

    @Override
    public final boolean n0() {
        return true;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final void y(CharSequence charSequence, boolean z10, int i9, int i10, long j10) {
        dy dyVar = this.f41606a;
        if (dyVar.f37752y2 != null && !dyVar.E2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < dyVar.E2.size(); i11++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) dyVar.E2.get(i11)).longValue(), 0L));
            }
            dy dyVar2 = this.f41606a;
            dyVar2.f37752y2.v(dyVar2, arrayList, charSequence, false, z10, i9, i10, null);
        }
    }

    @Override
    public final void G() {
    }

    @Override
    public final void H(boolean z10) {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void J1() {
    }

    @Override
    public final void K1(int i9) {
    }

    @Override
    public final void L0(int i9) {
    }

    @Override
    public final void Q() {
    }

    @Override
    public final void Q1() {
    }

    @Override
    public final void T1(boolean z10) {
    }

    @Override
    public final void X1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void c1() {
    }

    @Override
    public final void c2() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void h0() {
    }

    @Override
    public final void h1() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void m1(CharSequence charSequence) {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void o(float f10) {
    }

    @Override
    public final void p(boolean z10) {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void u1() {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void B(float f10, int i9) {
    }

    @Override
    public final void p0(int i9, int i10) {
    }

    @Override
    public final void k1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void U1(int i9, int i10, int i11, long j10, long j11, boolean z10) {
    }
}
