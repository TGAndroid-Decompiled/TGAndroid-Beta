package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ex implements org.telegram.ui.Components.qg {
    public final ty f37377a;

    public ex(ty tyVar) {
        this.f37377a = tyVar;
    }

    @Override
    public final boolean C1() {
        return false;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final void K(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        ty tyVar = this.f37377a;
        if (tyVar.C2 != null && !tyVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < tyVar.I2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) tyVar.I2.get(i12)).longValue(), 0L));
            }
            ty tyVar2 = this.f37377a;
            tyVar2.C2.w(tyVar2, arrayList, charSequence, false, z10, i10, i11, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers P() {
        return null;
    }

    @Override
    public final int h1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem j1() {
        return null;
    }

    @Override
    public final boolean l1(long j3) {
        return false;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final void r1(CharSequence charSequence, boolean z10, boolean z11) {
        ty tyVar = this.f37377a;
        AndroidUtilities.runOnUIThread(new hw(tyVar, 13), 100L);
        org.telegram.ui.Components.rr0 rr0Var = tyVar.G2;
        if (rr0Var != null) {
            if (z10) {
                if (rr0Var.h) {
                    rr0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.ea1 ea1Var = tyVar.H2;
            if (ea1Var != null) {
                AndroidUtilities.cancelRunOnUIThread(ea1Var);
            }
            org.telegram.ui.Components.ea1 ea1Var2 = new org.telegram.ui.Components.ea1(15, this, charSequence);
            tyVar.H2 = ea1Var2;
            AndroidUtilities.runOnUIThread(ea1Var2, 1000L);
        }
    }

    @Override
    public final pn u0() {
        return null;
    }

    @Override
    public final boolean u1() {
        return false;
    }

    @Override
    public final int v() {
        return 0;
    }

    @Override
    public final TLRPC.Peer x() {
        return null;
    }

    @Override
    public final void B1(CharSequence charSequence) {
    }

    @Override
    public final void B2() {
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void F2() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void L1() {
    }

    @Override
    public final void M0() {
    }

    @Override
    public final void O0() {
    }

    @Override
    public final void Z0() {
    }

    @Override
    public final void a0() {
    }

    @Override
    public final void c0(boolean z10) {
    }

    @Override
    public final void g1(int i10) {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void j2() {
    }

    @Override
    public final void l() {
    }

    @Override
    public final void l2(int i10) {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void p2(boolean z10) {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void z(float f7) {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void K0(int i10, int i11) {
    }

    @Override
    public final void V(float f7, int i10) {
    }

    @Override
    public final void z1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
