package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class mw implements org.telegram.ui.Components.og {
    public final ey f41574a;

    public mw(ey eyVar) {
        this.f41574a = eyVar;
    }

    @Override
    public final void A(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        ey eyVar = this.f41574a;
        if (eyVar.C2 != null && !eyVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < eyVar.I2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) eyVar.I2.get(i12)).longValue(), 0L));
            }
            ey eyVar2 = this.f41574a;
            eyVar2.C2.v(eyVar2, arrayList, charSequence, false, z10, i10, i11, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers B() {
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
    public final boolean R0(long j10) {
        return false;
    }

    @Override
    public final boolean T0() {
        return false;
    }

    @Override
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
        ey eyVar = this.f41574a;
        AndroidUtilities.runOnUIThread(new uv(eyVar, 14), 100L);
        org.telegram.ui.Components.rr0 rr0Var = eyVar.G2;
        if (rr0Var != null) {
            if (z10) {
                if (rr0Var.h) {
                    rr0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.d71 d71Var = eyVar.H2;
            if (d71Var != null) {
                AndroidUtilities.cancelRunOnUIThread(d71Var);
            }
            org.telegram.ui.Components.d71 d71Var2 = new org.telegram.ui.Components.d71(25, this, charSequence);
            eyVar.H2 = d71Var2;
            AndroidUtilities.runOnUIThread(d71Var2, 1000L);
        }
    }

    @Override
    public final boolean Y0() {
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final int g() {
        return 0;
    }

    @Override
    public final boolean h1() {
        return false;
    }

    @Override
    public final mn i0() {
        return null;
    }

    @Override
    public final TLRPC.Peer k() {
        return null;
    }

    @Override
    public final boolean p0() {
        return true;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void J1() {
    }

    @Override
    public final void N1() {
    }

    @Override
    public final void T1() {
    }

    @Override
    public final void U() {
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
    public final void b() {
    }

    @Override
    public final void b1() {
    }

    @Override
    public final void c1() {
    }

    @Override
    public final void c2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void l0() {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void L1(int i10) {
    }

    @Override
    public final void M0(int i10) {
    }

    @Override
    public final void O1(boolean z10) {
    }

    @Override
    public final void R(boolean z10) {
    }

    @Override
    public final void g1(CharSequence charSequence) {
    }

    @Override
    public final void t(float f7) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void G(float f7, int i10) {
    }

    @Override
    public final void v0(int i10, int i11) {
    }

    @Override
    public final void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void P1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
