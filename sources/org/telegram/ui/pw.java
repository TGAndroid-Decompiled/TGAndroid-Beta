package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pw implements org.telegram.ui.Components.og {
    public final ey f40553a;

    public pw(ey eyVar) {
        this.f40553a = eyVar;
    }

    @Override
    public final boolean B0() {
        return true;
    }

    @Override
    public final void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        ey eyVar = this.f40553a;
        if (eyVar.C2 != null && !eyVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < eyVar.I2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) eyVar.I2.get(i12)).longValue(), 0L));
            }
            ey eyVar2 = this.f40553a;
            eyVar2.C2.w(eyVar2, arrayList, charSequence, false, z10, i10, i11, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers O() {
        return null;
    }

    @Override
    public final int Y0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem a1() {
        return null;
    }

    @Override
    public final boolean b1(long j10) {
        return false;
    }

    @Override
    public final boolean e1() {
        return false;
    }

    @Override
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
        ey eyVar = this.f40553a;
        AndroidUtilities.runOnUIThread(new uv(eyVar, 13), 100L);
        org.telegram.ui.Components.nr0 nr0Var = eyVar.G2;
        if (nr0Var != null) {
            if (z10) {
                if (nr0Var.h) {
                    nr0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            ot otVar = eyVar.H2;
            if (otVar != null) {
                AndroidUtilities.cancelRunOnUIThread(otVar);
            }
            ot otVar2 = new ot(9, this, charSequence);
            eyVar.H2 = otVar2;
            AndroidUtilities.runOnUIThread(otVar2, 1000L);
        }
    }

    @Override
    public final boolean j1() {
        return false;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final in p0() {
        return null;
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final int u() {
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
    public final void F0() {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void T1() {
    }

    @Override
    public final void V1(int i10) {
    }

    @Override
    public final void X0(int i10) {
    }

    @Override
    public final void Y() {
    }

    @Override
    public final void Y1() {
    }

    @Override
    public final void Z1(boolean z10) {
    }

    @Override
    public final void a0(boolean z10) {
    }

    @Override
    public final void e2() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void l1() {
    }

    @Override
    public final void m0() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void m2() {
    }

    @Override
    public final void n1() {
    }

    @Override
    public final void q1(CharSequence charSequence) {
    }

    @Override
    public final void q2() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u1() {
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
    public final void D0(int i10, int i11) {
    }

    @Override
    public final void U(float f7, int i10) {
    }

    @Override
    public final void o1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
