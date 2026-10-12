package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jx implements org.telegram.ui.Components.pg {
    public final yy f37452a;

    public jx(yy yyVar) {
        this.f37452a = yyVar;
    }

    @Override
    public final boolean B0() {
        return true;
    }

    @Override
    public final void J(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        yy yyVar = this.f37452a;
        if (yyVar.C2 != null && !yyVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < yyVar.I2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) yyVar.I2.get(i12)).longValue(), 0L));
            }
            yy yyVar2 = this.f37452a;
            yyVar2.C2.w(yyVar2, arrayList, charSequence, false, z10, i10, i11, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers K() {
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
        yy yyVar = this.f37452a;
        AndroidUtilities.runOnUIThread(new nw(yyVar, 13), 100L);
        org.telegram.ui.Components.or0 or0Var = yyVar.G2;
        if (or0Var != null) {
            if (z10) {
                if (or0Var.h) {
                    or0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.k31 k31Var = yyVar.H2;
            if (k31Var != null) {
                AndroidUtilities.cancelRunOnUIThread(k31Var);
            }
            org.telegram.ui.Components.k31 k31Var2 = new org.telegram.ui.Components.k31(26, this, charSequence);
            yyVar.H2 = k31Var2;
            AndroidUtilities.runOnUIThread(k31Var2, 1000L);
        }
    }

    @Override
    public final boolean j1() {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final un p0() {
        return null;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final boolean r1() {
        return false;
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
    public final void G() {
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
    public final void X() {
    }

    @Override
    public final void X0(int i10) {
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
