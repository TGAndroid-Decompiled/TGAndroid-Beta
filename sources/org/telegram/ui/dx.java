package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class dx implements org.telegram.ui.Components.pg {
    public final uy f35849a;

    public dx(uy uyVar) {
        this.f35849a = uyVar;
    }

    @Override
    public final boolean C0() {
        return true;
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        uy uyVar = this.f35849a;
        if (uyVar.C2 != null && !uyVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < uyVar.I2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) uyVar.I2.get(i12)).longValue(), 0L));
            }
            uy uyVar2 = this.f35849a;
            uyVar2.C2.u(uyVar2, arrayList, charSequence, false, z10, i10, i11, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers I() {
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
        uy uyVar = this.f35849a;
        AndroidUtilities.runOnUIThread(new jw(uyVar, 11), 100L);
        org.telegram.ui.Components.er0 er0Var = uyVar.G2;
        if (er0Var != null) {
            if (z10) {
                if (er0Var.h) {
                    er0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            cu cuVar = uyVar.H2;
            if (cuVar != null) {
                AndroidUtilities.cancelRunOnUIThread(cuVar);
            }
            cu cuVar2 = new cu(5, this, charSequence);
            uyVar.H2 = cuVar2;
            AndroidUtilities.runOnUIThread(cuVar2, 1000L);
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
    public final on p0() {
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
    public final void V() {
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
    public final void f() {
    }

    @Override
    public final void f2(int i10) {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void j2(boolean z10) {
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
