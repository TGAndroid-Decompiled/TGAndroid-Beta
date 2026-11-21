package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hw extends bx {
    public static final int I0 = 0;
    public final org.telegram.ui.ActionBar.g2 F0;
    public final boolean G0;
    public final ty H0;

    public hw(ty tyVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        super(tyVar, context, h6Var);
        this.H0 = tyVar;
        this.F0 = g2Var;
        this.G0 = z10;
    }

    @Override
    public final void j() {
        iw iwVar = this.H0.D0;
        if (iwVar != null) {
            iwVar.invalidate();
        }
    }

    @Override
    public final void o(int i7, int i10) {
        ty tyVar = this.H0;
        ik ikVar = tyVar.f40110g2;
        int i11 = tyVar.F1;
        int i12 = i7 - i11;
        int i13 = i10 - i11;
        int i14 = tyVar.f40099d1;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i14);
        ArrayList arrayList = tyVar.f40102e1;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        Collections.sort(d02.u0(0), new ul(this, 1));
        ArrayList arrayList2 = tyVar.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            tyVar.G2.addAll(arrayList);
        }
        tyVar.E();
        org.telegram.messenger.g0.r(ikVar);
        org.telegram.messenger.g0.h3(ikVar, 1500L);
        org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(i14);
        d03.Y[0] = org.telegram.messenger.ri.s(d03.H[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i15 = tyVar.f40105f0; i15 < arrayList.size(); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i15)).set.f28458id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new fi.l5(19));
        org.telegram.messenger.ks.f(i14).k(org.telegram.messenger.ks.f25246x0, 0, Boolean.TRUE);
        tyVar.Y(true);
        if (org.telegram.messenger.bz.X) {
            org.telegram.messenger.bz.P();
            org.telegram.ui.ActionBar.g2 g2Var = this.F0;
            if (g2Var != null) {
                lc.b0(g2Var).L(2131624018, org.telegram.messenger.gd.N0(2131751325, null), org.telegram.messenger.gd.N0(2131751324, null), org.telegram.messenger.gd.O0("Settings"), new kd(1, g2Var)).j();
                return;
            }
            FrameLayout frameLayout = tyVar.f40139r;
            if (frameLayout != null) {
                new lc(frameLayout, tyVar.f40089a2).I(2131624018, org.telegram.messenger.gd.N0(2131751325, null), org.telegram.messenger.gd.N0(2131751324, null)).j();
            }
        }
    }

    @Override
    public final void p() {
        ty tyVar = this.H0;
        tyVar.Z();
        iw iwVar = tyVar.D0;
        if (iwVar != null) {
            iwVar.invalidate();
        }
        invalidate();
        tx txVar = tyVar.f40151u1;
        if (txVar != null) {
            txVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (!this.G0) {
                this.H0.f40165y0.invalidate();
            }
        }
    }
}
