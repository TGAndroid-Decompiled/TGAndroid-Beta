package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class fx implements org.telegram.ui.Components.og {
    public final uy f36489a;

    public fx(uy uyVar) {
        this.f36489a = uyVar;
    }

    @Override
    public final void G(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        uy uyVar = this.f36489a;
        if (uyVar.C2 != null && !uyVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < uyVar.I2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) uyVar.I2.get(i12)).longValue(), 0L));
            }
            uy uyVar2 = this.f36489a;
            uyVar2.C2.u(uyVar2, arrayList, charSequence, false, z10, i10, i11, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override
    public final int W0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem Y0() {
        return null;
    }

    @Override
    public final boolean a1(long j3) {
        return false;
    }

    @Override
    public final boolean d1() {
        return false;
    }

    @Override
    public final void f1(CharSequence charSequence, boolean z10, boolean z11) {
        uy uyVar = this.f36489a;
        AndroidUtilities.runOnUIThread(new jw(uyVar, 12), 100L);
        org.telegram.ui.Components.mq0 mq0Var = uyVar.G2;
        if (mq0Var != null) {
            if (z10) {
                if (mq0Var.h) {
                    mq0Var.e(charSequence, true);
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
    public final boolean i1() {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final sn o0() {
        return null;
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    public final TLRPC.Peer q() {
        return null;
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final boolean z0() {
        return true;
    }

    @Override
    public final void C() {
    }

    @Override
    public final void D0() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void P0() {
    }

    @Override
    public final void U() {
    }

    @Override
    public final void V0(int i10) {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void W(boolean z10) {
    }

    @Override
    public final void X1(int i10) {
    }

    @Override
    public final void a2() {
    }

    @Override
    public final void b2(boolean z10) {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void h1() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void k1() {
    }

    @Override
    public final void l0() {
    }

    @Override
    public final void l1() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void p1(CharSequence charSequence) {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void x(float f7) {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void z(boolean z10) {
    }

    @Override
    public final void B0(int i10, int i11) {
    }

    @Override
    public final void J(float f7, int i10) {
    }

    @Override
    public final void n1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void c2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
