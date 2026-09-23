package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class cx implements org.telegram.ui.Components.ng {
    public final ry f32430a;

    public cx(ry ryVar) {
        this.f32430a = ryVar;
    }

    @Override
    public final boolean C0() {
        return true;
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        ry ryVar = this.f32430a;
        if (ryVar.C2 != null && !ryVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < ryVar.I2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) ryVar.I2.get(i12)).longValue(), 0L));
            }
            ry ryVar2 = this.f32430a;
            ryVar2.C2.u(ryVar2, arrayList, charSequence, false, z10, i10, i11, null);
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
        ry ryVar = this.f32430a;
        AndroidUtilities.runOnUIThread(new fw(ryVar, 12), 100L);
        org.telegram.ui.Components.mq0 mq0Var = ryVar.G2;
        if (mq0Var != null) {
            if (z10) {
                if (mq0Var.h) {
                    mq0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            hw hwVar = ryVar.H2;
            if (hwVar != null) {
                AndroidUtilities.cancelRunOnUIThread(hwVar);
            }
            hw hwVar2 = new hw(4, this, charSequence);
            ryVar.H2 = hwVar2;
            AndroidUtilities.runOnUIThread(hwVar2, 1000L);
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
    public final nn p0() {
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
