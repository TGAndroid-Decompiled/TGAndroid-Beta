package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class fx implements org.telegram.ui.Components.ng {
    public final uy f33747a;

    public fx(uy uyVar) {
        this.f33747a = uyVar;
    }

    @Override
    public final boolean D0() {
        return true;
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        uy uyVar = this.f33747a;
        if (uyVar.C2 != null && !uyVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < uyVar.I2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) uyVar.I2.get(i12)).longValue(), 0L));
            }
            uy uyVar2 = this.f33747a;
            uyVar2.C2.u(uyVar2, arrayList, charSequence, false, z10, i10, i11, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override
    public final int c1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem e1() {
        return null;
    }

    @Override
    public final boolean g1(long j3) {
        return false;
    }

    @Override
    public final boolean j1() {
        return false;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void m1(CharSequence charSequence, boolean z10, boolean z11) {
        uy uyVar = this.f33747a;
        AndroidUtilities.runOnUIThread(new jw(uyVar, 12), 100L);
        org.telegram.ui.Components.zq0 zq0Var = uyVar.G2;
        if (zq0Var != null) {
            if (z10) {
                if (zq0Var.h) {
                    zq0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            yt ytVar = uyVar.H2;
            if (ytVar != null) {
                AndroidUtilities.cancelRunOnUIThread(ytVar);
            }
            yt ytVar2 = new yt(10, this, charSequence);
            uyVar.H2 = ytVar2;
            AndroidUtilities.runOnUIThread(ytVar2, 1000L);
        }
    }

    @Override
    public final boolean p1() {
        return false;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final pn q0() {
        return null;
    }

    @Override
    public final TLRPC.Peer v() {
        return null;
    }

    @Override
    public final boolean x1() {
        return false;
    }

    @Override
    public final void A1() {
    }

    @Override
    public final void A2() {
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void F1() {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void U0() {
    }

    @Override
    public final void W() {
    }

    @Override
    public final void X(boolean z10) {
    }

    @Override
    public final void b1(int i10) {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void f2(int i10) {
    }

    @Override
    public final void g() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void j2(boolean z10) {
    }

    @Override
    public final void l() {
    }

    @Override
    public final void n0() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void w1(CharSequence charSequence) {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void y(float f7) {
    }

    @Override
    public final void F0(int i10, int i11) {
    }

    @Override
    public final void K(float f7, int i10) {
    }

    @Override
    public final void u1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
