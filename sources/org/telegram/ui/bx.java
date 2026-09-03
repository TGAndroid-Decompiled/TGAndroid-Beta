package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class bx implements org.telegram.ui.Components.eg {
    public final py f35616a;

    public bx(py pyVar) {
        this.f35616a = pyVar;
    }

    @Override
    public final void C(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        py pyVar = this.f35616a;
        if (pyVar.f40278z2 != null && !pyVar.F2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < pyVar.F2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) pyVar.F2.get(i12)).longValue(), 0L));
            }
            py pyVar2 = this.f35616a;
            pyVar2.f40278z2.v(pyVar2, arrayList, charSequence, false, z4, i10, i11, null);
        }
    }

    @Override
    public final boolean D1() {
        return false;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override
    public final boolean H0() {
        return true;
    }

    @Override
    public final int f1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem h1() {
        return null;
    }

    @Override
    public final boolean j1(long j10) {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final TLRPC.Peer p() {
        return null;
    }

    @Override
    public final nn r0() {
        return null;
    }

    @Override
    public final void r1(CharSequence charSequence, boolean z4, boolean z10) {
        py pyVar = this.f35616a;
        AndroidUtilities.runOnUIThread(new ew(pyVar, 12), 100L);
        org.telegram.ui.Components.qq0 qq0Var = pyVar.D2;
        if (qq0Var != null) {
            if (z4) {
                if (qq0Var.h) {
                    qq0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.q51 q51Var = pyVar.E2;
            if (q51Var != null) {
                AndroidUtilities.cancelRunOnUIThread(q51Var);
            }
            org.telegram.ui.Components.q51 q51Var2 = new org.telegram.ui.Components.q51(20, this, charSequence);
            pyVar.E2 = q51Var2;
            AndroidUtilities.runOnUIThread(q51Var2, 1000L);
        }
    }

    @Override
    public final boolean u1() {
        return false;
    }

    @Override
    public final void A(boolean z4) {
    }

    @Override
    public final void B() {
    }

    @Override
    public final void C1(CharSequence charSequence) {
    }

    @Override
    public final void F2() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void J2() {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void M1() {
    }

    @Override
    public final void P0() {
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
    public final void e1(int i10) {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void o0() {
    }

    @Override
    public final void p2(int i10) {
    }

    @Override
    public final void s2() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void t2(boolean z4) {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void x2() {
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void G(float f10, int i10) {
    }

    @Override
    public final void J0(int i10, int i11) {
    }

    @Override
    public final void z1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override
    public final void u2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
