package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ax implements org.telegram.ui.Components.eg {
    public final oy f32716a;

    public ax(oy oyVar) {
        this.f32716a = oyVar;
    }

    @Override
    public final void D(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        oy oyVar = this.f32716a;
        if (oyVar.f37131z2 != null && !oyVar.F2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < oyVar.F2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) oyVar.F2.get(i12)).longValue(), 0L));
            }
            oy oyVar2 = this.f32716a;
            oyVar2.f37131z2.w(oyVar2, arrayList, charSequence, false, z4, i10, i11, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    @Override
    public final boolean G0() {
        return true;
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
    public final boolean g1(long j10) {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean k1() {
        return false;
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final void n1(CharSequence charSequence, boolean z4, boolean z10) {
        oy oyVar = this.f32716a;
        AndroidUtilities.runOnUIThread(new dw(oyVar, 12), 100L);
        org.telegram.ui.Components.qq0 qq0Var = oyVar.D2;
        if (qq0Var != null) {
            if (z4) {
                if (qq0Var.h) {
                    qq0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.k41 k41Var = oyVar.E2;
            if (k41Var != null) {
                AndroidUtilities.cancelRunOnUIThread(k41Var);
            }
            org.telegram.ui.Components.k41 k41Var2 = new org.telegram.ui.Components.k41(22, this, charSequence);
            oyVar.E2 = k41Var2;
            AndroidUtilities.runOnUIThread(k41Var2, 1000L);
        }
    }

    @Override
    public final TLRPC.Peer p() {
        return null;
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final nn r0() {
        return null;
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void C() {
    }

    @Override
    public final void C1() {
    }

    @Override
    public final void E2() {
    }

    @Override
    public final void H1() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void N0() {
    }

    @Override
    public final void V0() {
    }

    @Override
    public final void Y() {
    }

    @Override
    public final void b0(boolean z4) {
    }

    @Override
    public final void b1(int i10) {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void j2(int i10) {
    }

    @Override
    public final void m2() {
    }

    @Override
    public final void n2(boolean z4) {
    }

    @Override
    public final void o0() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void u1() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void y1(CharSequence charSequence) {
    }

    @Override
    public final void z(boolean z4) {
    }

    @Override
    public final void z2() {
    }

    @Override
    public final void H(float f10, int i10) {
    }

    @Override
    public final void I0(int i10, int i11) {
    }

    @Override
    public final void v1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override
    public final void o2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
