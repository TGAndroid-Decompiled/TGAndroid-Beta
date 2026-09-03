package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class cx implements org.telegram.ui.Components.eg {
    public final qy f33252a;

    public cx(qy qyVar) {
        this.f33252a = qyVar;
    }

    @Override
    public final boolean B1() {
        return false;
    }

    @Override
    public final void G(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        qy qyVar = this.f33252a;
        if (qyVar.f37649z2 != null && !qyVar.F2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < qyVar.F2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) qyVar.F2.get(i12)).longValue(), 0L));
            }
            qy qyVar2 = this.f33252a;
            qyVar2.f37649z2.w(qyVar2, arrayList, charSequence, false, z4, i10, i11, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override
    public final boolean H0() {
        return true;
    }

    @Override
    public final int g1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem i1() {
        return null;
    }

    @Override
    public final boolean k1(long j10) {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    public final void q1(CharSequence charSequence, boolean z4, boolean z10) {
        qy qyVar = this.f33252a;
        AndroidUtilities.runOnUIThread(new fw(qyVar, 12), 100L);
        org.telegram.ui.Components.qq0 qq0Var = qyVar.D2;
        if (qq0Var != null) {
            if (z4) {
                if (qq0Var.h) {
                    qq0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.k41 k41Var = qyVar.E2;
            if (k41Var != null) {
                AndroidUtilities.cancelRunOnUIThread(k41Var);
            }
            org.telegram.ui.Components.k41 k41Var2 = new org.telegram.ui.Components.k41(21, this, charSequence);
            qyVar.E2 = k41Var2;
            AndroidUtilities.runOnUIThread(k41Var2, 1000L);
        }
    }

    @Override
    public final TLRPC.Peer r() {
        return null;
    }

    @Override
    public final boolean t1() {
        return false;
    }

    @Override
    public final pn u0() {
        return null;
    }

    @Override
    public final void A1(CharSequence charSequence) {
    }

    @Override
    public final void A2() {
    }

    @Override
    public final void B(boolean z4) {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void E1() {
    }

    @Override
    public final void E2() {
    }

    @Override
    public final void J1() {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void O0() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void Y(boolean z4) {
    }

    @Override
    public final void Y0() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f1(int i10) {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void k2(int i10) {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void o2(boolean z4) {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void t2() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void v1() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void J0(int i10, int i11) {
    }

    @Override
    public final void K(float f10, int i10) {
    }

    @Override
    public final void y1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override
    public final void p2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
