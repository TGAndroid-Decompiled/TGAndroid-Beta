package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class hx implements org.telegram.ui.Components.mg {
    public final wy f34381a;

    public hx(wy wyVar) {
        this.f34381a = wyVar;
    }

    @Override
    public final boolean C0() {
        return true;
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        wy wyVar = this.f34381a;
        if (wyVar.C2 != null && !wyVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < wyVar.I2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) wyVar.I2.get(i12)).longValue(), 0L));
            }
            wy wyVar2 = this.f34381a;
            wyVar2.C2.u(wyVar2, arrayList, charSequence, false, z10, i10, i11, null);
        }
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
    public final TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public final boolean f1(long j3) {
        return false;
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        wy wyVar = this.f34381a;
        AndroidUtilities.runOnUIThread(new kw(wyVar, 12), 100L);
        org.telegram.ui.Components.nq0 nq0Var = wyVar.G2;
        if (nq0Var != null) {
            if (z10) {
                if (nq0Var.h) {
                    nq0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            mw mwVar = wyVar.H2;
            if (mwVar != null) {
                AndroidUtilities.cancelRunOnUIThread(mwVar);
            }
            mw mwVar2 = new mw(4, this, charSequence);
            wyVar.H2 = mwVar2;
            AndroidUtilities.runOnUIThread(mwVar2, 1000L);
        }
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
    public final rn p0() {
        return null;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final TLRPC.Peer v() {
        return null;
    }

    @Override
    public final boolean w1() {
        return false;
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
    public final void E1() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void W() {
    }

    @Override
    public final void X(boolean z10) {
    }

    @Override
    public final void a1(int i10) {
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
    public final void m0() {
    }

    @Override
    public final void n1() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void v1(CharSequence charSequence) {
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
    public final void z1() {
    }

    @Override
    public final void E0(int i10, int i11) {
    }

    @Override
    public final void K(float f7, int i10) {
    }

    @Override
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
