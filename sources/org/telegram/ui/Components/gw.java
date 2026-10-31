package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class gw extends cx {
    public static final int H0 = 0;
    public final org.telegram.ui.ActionBar.k2 E0;
    public final boolean F0;
    public final vy G0;

    public gw(vy vyVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        super(vyVar, context, p6Var);
        this.G0 = vyVar;
        this.E0 = k2Var;
        this.F0 = z10;
    }

    @Override
    public final void j() {
        hw hwVar = this.G0.C0;
        if (hwVar != null) {
            hwVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        vy vyVar = this.G0;
        ew ewVar = vyVar.f31876f2;
        int i12 = vyVar.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = vyVar.f31865c1;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i15);
        ArrayList arrayList = vyVar.f31868d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        Collections.sort(b02.s0(0), new jl(this, 1));
        ArrayList arrayList2 = vyVar.F2;
        if (arrayList2 != null) {
            arrayList2.clear();
            vyVar.F2.addAll(arrayList);
        }
        vyVar.F();
        org.telegram.messenger.i0.r(ewVar);
        org.telegram.messenger.i0.h3(ewVar, 1500L);
        org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i15);
        b03.X[0] = org.telegram.messenger.ui.q(b03.G[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = vyVar.f31870e0; i16 < arrayList.size(); i16 = c3.i0.k(i16, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.f19820id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new ag.c3(14));
        org.telegram.messenger.zs.f(i15).k(org.telegram.messenger.zs.f19718x0, 0, Boolean.TRUE);
        vyVar.Y(true);
        if (org.telegram.messenger.tz.X) {
            org.telegram.messenger.tz.P();
            org.telegram.ui.ActionBar.k2 k2Var = this.E0;
            if (k2Var != null) {
                cc.a0(k2Var).L(2131624017, org.telegram.messenger.cd.L0(2131751338, null), org.telegram.messenger.cd.L0(2131751337, null), org.telegram.messenger.cd.M0("Settings"), new wc(1, k2Var)).j();
                return;
            }
            FrameLayout frameLayout = vyVar.f31909r;
            if (frameLayout != null) {
                new cc(frameLayout, vyVar.Z1).I(2131624017, org.telegram.messenger.cd.L0(2131751338, null), org.telegram.messenger.cd.L0(2131751337, null)).j();
            }
        }
    }

    @Override
    public final void p() {
        vy vyVar = this.G0;
        vyVar.Z();
        hw hwVar = vyVar.C0;
        if (hwVar != null) {
            hwVar.invalidate();
        }
        invalidate();
        vx vxVar = vyVar.f31918t1;
        if (vxVar != null) {
            vxVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            if (!this.F0) {
                this.G0.f31931x0.invalidate();
            }
        }
    }
}
