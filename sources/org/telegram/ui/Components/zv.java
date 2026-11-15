package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class zv extends tw {
    public static final int I0 = 0;
    public final org.telegram.ui.ActionBar.e2 F0;
    public final boolean G0;
    public final ly H0;

    public zv(ly lyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.e2 e2Var, boolean z10) {
        super(lyVar, context, e6Var);
        this.H0 = lyVar;
        this.F0 = e2Var;
        this.G0 = z10;
    }

    @Override
    public final void j() {
        aw awVar = this.H0.D0;
        if (awVar != null) {
            awVar.invalidate();
        }
    }

    @Override
    public final void o(int i7, int i10) {
        ly lyVar = this.H0;
        zj zjVar = lyVar.f36952g2;
        int i11 = lyVar.F1;
        int i12 = i7 - i11;
        int i13 = i10 - i11;
        int i14 = lyVar.f36941d1;
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i14);
        ArrayList arrayList = lyVar.f36944e1;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        Collections.sort(b02.s0(0), new ll(this, 1));
        ArrayList arrayList2 = lyVar.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            lyVar.G2.addAll(arrayList);
        }
        lyVar.D();
        org.telegram.messenger.g0.r(zjVar);
        org.telegram.messenger.g0.i3(zjVar, 1500L);
        org.telegram.messenger.si b03 = org.telegram.messenger.si.b0(i14);
        b03.Y[0] = org.telegram.messenger.si.q(b03.H[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i15 = lyVar.f36947f0; i15 < arrayList.size(); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i15)).set.f28078id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new fi.m5(19));
        org.telegram.messenger.ns.f(i14).k(org.telegram.messenger.ns.f25600x0, 0, Boolean.TRUE);
        lyVar.Y(true);
        if (org.telegram.messenger.gz.X) {
            org.telegram.messenger.gz.P();
            org.telegram.ui.ActionBar.e2 e2Var = this.F0;
            if (e2Var != null) {
                cc.a0(e2Var).L(2131624018, org.telegram.messenger.hd.M0(2131751337, null), org.telegram.messenger.hd.M0(2131751336, null), org.telegram.messenger.hd.N0("Settings"), new bd(1, e2Var)).j();
                return;
            }
            FrameLayout frameLayout = lyVar.f36981r;
            if (frameLayout != null) {
                new cc(frameLayout, lyVar.f36931a2).I(2131624018, org.telegram.messenger.hd.M0(2131751337, null), org.telegram.messenger.hd.M0(2131751336, null)).j();
            }
        }
    }

    @Override
    public final void p() {
        ly lyVar = this.H0;
        lyVar.Z();
        aw awVar = lyVar.D0;
        if (awVar != null) {
            awVar.invalidate();
        }
        invalidate();
        mx mxVar = lyVar.f36993u1;
        if (mxVar != null) {
            mxVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (!this.G0) {
                this.H0.f37007y0.invalidate();
            }
        }
    }
}
