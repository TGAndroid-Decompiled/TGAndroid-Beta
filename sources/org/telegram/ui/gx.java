package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class gx implements org.telegram.ui.Components.sg {
    public final vy f38170a;

    public gx(vy vyVar) {
        this.f38170a = vyVar;
    }

    @Override
    public final boolean D1() {
        return false;
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        vy vyVar = this.f38170a;
        if (vyVar.C2 != null && !vyVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < vyVar.I2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) vyVar.I2.get(i12)).longValue(), 0L));
            }
            vy vyVar2 = this.f38170a;
            vyVar2.C2.w(vyVar2, arrayList, charSequence, false, z10, i10, i11, null);
        }
    }

    @Override
    public final boolean H0() {
        return true;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
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
        vy vyVar = this.f38170a;
        AndroidUtilities.runOnUIThread(new jw(vyVar, 13), 100L);
        org.telegram.ui.Components.xr0 xr0Var = vyVar.G2;
        if (xr0Var != null) {
            if (z10) {
                if (xr0Var.h) {
                    xr0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.p pVar = vyVar.H2;
            if (pVar != null) {
                AndroidUtilities.cancelRunOnUIThread(pVar);
            }
            org.telegram.ui.Components.voip.p pVar2 = new org.telegram.ui.Components.voip.p(13, this, charSequence);
            vyVar.H2 = pVar2;
            AndroidUtilities.runOnUIThread(pVar2, 1000L);
        }
    }

    @Override
    public final tn t0() {
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
    public final void C(boolean z10) {
    }

    @Override
    public final void C1(CharSequence charSequence) {
    }

    @Override
    public final void D2() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void H2() {
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
    public final void X() {
    }

    @Override
    public final void Y0() {
    }

    @Override
    public final void Z(boolean z10) {
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
    public final void p0() {
    }

    @Override
    public final void p2(boolean z10) {
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
    public final void y0() {
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void z(float f7) {
    }

    @Override
    public final void J0(int i10, int i11) {
    }

    @Override
    public final void K(float f7, int i10) {
    }

    @Override
    public final void z1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
