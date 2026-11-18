package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class fw extends zw {
    public static final int I0 = 0;
    public final org.telegram.ui.ActionBar.h2 F0;
    public final boolean G0;
    public final ry H0;

    public fw(ry ryVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h2 h2Var, boolean z10) {
        super(ryVar, context, i6Var);
        this.H0 = ryVar;
        this.F0 = h2Var;
        this.G0 = z10;
    }

    @Override
    public final void j() {
        gw gwVar = this.H0.D0;
        if (gwVar != null) {
            gwVar.invalidate();
        }
    }

    @Override
    public final void o(int i7, int i10) {
        ry ryVar = this.H0;
        gk gkVar = ryVar.f39356g2;
        int i11 = ryVar.F1;
        int i12 = i7 - i11;
        int i13 = i10 - i11;
        int i14 = ryVar.f39345d1;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i14);
        ArrayList arrayList = ryVar.f39348e1;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        Collections.sort(d02.u0(0), new sl(this, 1));
        ArrayList arrayList2 = ryVar.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            ryVar.G2.addAll(arrayList);
        }
        ryVar.E();
        org.telegram.messenger.g0.r(gkVar);
        org.telegram.messenger.g0.h3(gkVar, 1500L);
        org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(i14);
        d03.Y[0] = org.telegram.messenger.ri.s(d03.H[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i15 = ryVar.f39351f0; i15 < arrayList.size(); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i15)).set.f28430id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new fi.k5(19));
        org.telegram.messenger.ks.f(i14).k(org.telegram.messenger.ks.f25218x0, 0, Boolean.TRUE);
        ryVar.Y(true);
        if (org.telegram.messenger.bz.X) {
            org.telegram.messenger.bz.P();
            org.telegram.ui.ActionBar.h2 h2Var = this.F0;
            if (h2Var != null) {
                lc.b0(h2Var).L(2131624018, org.telegram.messenger.gd.M0(2131751326, null), org.telegram.messenger.gd.M0(2131751325, null), org.telegram.messenger.gd.N0("Settings"), new kd(1, h2Var)).j();
                return;
            }
            FrameLayout frameLayout = ryVar.f39385r;
            if (frameLayout != null) {
                new lc(frameLayout, ryVar.f39335a2).I(2131624018, org.telegram.messenger.gd.M0(2131751326, null), org.telegram.messenger.gd.M0(2131751325, null)).j();
            }
        }
    }

    @Override
    public final void p() {
        ry ryVar = this.H0;
        ryVar.Z();
        gw gwVar = ryVar.D0;
        if (gwVar != null) {
            gwVar.invalidate();
        }
        invalidate();
        rx rxVar = ryVar.f39397u1;
        if (rxVar != null) {
            rxVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (!this.G0) {
                this.H0.f39411y0.invalidate();
            }
        }
    }
}
