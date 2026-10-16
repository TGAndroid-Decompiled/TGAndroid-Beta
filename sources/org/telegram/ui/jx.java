package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jx implements org.telegram.ui.Components.pg {
    public final yy f37166a;

    public jx(yy yyVar) {
        this.f37166a = yyVar;
    }

    @Override
    public final boolean C0() {
        return true;
    }

    @Override
    public final void J(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        yy yyVar = this.f37166a;
        if (yyVar.C2 != null && !yyVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < yyVar.I2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) yyVar.I2.get(i12)).longValue(), 0L));
            }
            yy yyVar2 = this.f37166a;
            yyVar2.C2.w(yyVar2, arrayList, charSequence, false, z10, i10, i11, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers K() {
        return null;
    }

    @Override
    public final int Z0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem b1() {
        return null;
    }

    @Override
    public final boolean c1(long j10) {
        return false;
    }

    @Override
    public final boolean f1() {
        return false;
    }

    @Override
    public final void h1(CharSequence charSequence, boolean z10, boolean z11) {
        yy yyVar = this.f37166a;
        AndroidUtilities.runOnUIThread(new mw(yyVar, 13), 100L);
        org.telegram.ui.Components.nr0 nr0Var = yyVar.G2;
        if (nr0Var != null) {
            if (z10) {
                if (nr0Var.h) {
                    nr0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.n51 n51Var = yyVar.H2;
            if (n51Var != null) {
                AndroidUtilities.cancelRunOnUIThread(n51Var);
            }
            org.telegram.ui.Components.n51 n51Var2 = new org.telegram.ui.Components.n51(21, this, charSequence);
            yyVar.H2 = n51Var2;
            AndroidUtilities.runOnUIThread(n51Var2, 1000L);
        }
    }

    @Override
    public final boolean k1() {
        return false;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final un p0() {
        return null;
    }

    @Override
    public final boolean s1() {
        return false;
    }

    @Override
    public final int v() {
        return 0;
    }

    @Override
    public final TLRPC.Peer y() {
        return null;
    }

    @Override
    public final void A(float f7) {
    }

    @Override
    public final void D(boolean z10) {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void R0() {
    }

    @Override
    public final void W1() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void Y0(int i10) {
    }

    @Override
    public final void Y1(int i10) {
    }

    @Override
    public final void a0(boolean z10) {
    }

    @Override
    public final void b2() {
    }

    @Override
    public final void c2(boolean z10) {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void m0() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void n1() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void q2() {
    }

    @Override
    public final void r1(CharSequence charSequence) {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void v1() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void E0(int i10, int i11) {
    }

    @Override
    public final void U(float f7, int i10) {
    }

    @Override
    public final void p1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void d2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
