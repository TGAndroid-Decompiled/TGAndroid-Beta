package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class kw implements org.telegram.ui.Components.og {
    public final cy f41073a;

    public kw(cy cyVar) {
        this.f41073a = cyVar;
    }

    @Override
    public final void A(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        cy cyVar = this.f41073a;
        if (cyVar.C2 != null && !cyVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < cyVar.I2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) cyVar.I2.get(i12)).longValue(), 0L));
            }
            cy cyVar2 = this.f41073a;
            cyVar2.C2.v(cyVar2, arrayList, charSequence, false, z10, i10, i11, null);
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
        cy cyVar = this.f41073a;
        AndroidUtilities.runOnUIThread(new sv(cyVar, 14), 100L);
        org.telegram.ui.Components.qr0 qr0Var = cyVar.G2;
        if (qr0Var != null) {
            if (z10) {
                if (qr0Var.h) {
                    qr0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.c71 c71Var = cyVar.H2;
            if (c71Var != null) {
                AndroidUtilities.cancelRunOnUIThread(c71Var);
            }
            org.telegram.ui.Components.c71 c71Var2 = new org.telegram.ui.Components.c71(24, this, charSequence);
            cyVar.H2 = c71Var2;
            AndroidUtilities.runOnUIThread(c71Var2, 1000L);
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
    public final kn i0() {
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
