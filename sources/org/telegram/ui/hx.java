package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class hx implements org.telegram.ui.Components.qg {
    public final wy f33481a;

    public hx(wy wyVar) {
        this.f33481a = wyVar;
    }

    @Override
    public final boolean D0() {
        return true;
    }

    @Override
    public final void I(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        wy wyVar = this.f33481a;
        if (wyVar.C2 != null && !wyVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < wyVar.I2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) wyVar.I2.get(i12)).longValue(), 0L));
            }
            wy wyVar2 = this.f33481a;
            wyVar2.C2.v(wyVar2, arrayList, charSequence, false, z10, i10, i11, null);
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
    public final boolean e1(long j3) {
        return false;
    }

    @Override
    public final boolean h1() {
        return false;
    }

    @Override
    public final void k1(CharSequence charSequence, boolean z10, boolean z11) {
        wy wyVar = this.f33481a;
        AndroidUtilities.runOnUIThread(new kw(wyVar, 12), 100L);
        org.telegram.ui.Components.xq0 xq0Var = wyVar.G2;
        if (xq0Var != null) {
            if (z10) {
                if (xq0Var.h) {
                    xq0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            uv uvVar = wyVar.H2;
            if (uvVar != null) {
                AndroidUtilities.cancelRunOnUIThread(uvVar);
            }
            uv uvVar2 = new uv(7, this, charSequence);
            wyVar.H2 = uvVar2;
            AndroidUtilities.runOnUIThread(uvVar2, 1000L);
        }
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
    public final tn p0() {
        return null;
    }

    @Override
    public final int u() {
        return 0;
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final TLRPC.Peer w() {
        return null;
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void D1() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void H0() {
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
    public final void Z(boolean z10) {
    }

    @Override
    public final void a1(int i10) {
    }

    @Override
    public final void b2() {
    }

    @Override
    public final void d2(int i10) {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void h2(boolean z10) {
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
    public final void m2() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u1(CharSequence charSequence) {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void y(float f7) {
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void y2() {
    }

    @Override
    public final void F0(int i10, int i11) {
    }

    @Override
    public final void T(float f7, int i10) {
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void i2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
