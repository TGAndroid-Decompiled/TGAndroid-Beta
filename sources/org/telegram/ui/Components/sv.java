package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class sv extends mw {
    public static final int I0 = 0;
    public final org.telegram.ui.ActionBar.d2 F0;
    public final boolean G0;
    public final ey H0;

    public sv(ey eyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        super(eyVar, context, e6Var);
        this.H0 = eyVar;
        this.F0 = d2Var;
        this.G0 = z10;
    }

    @Override
    public final void j() {
        tv tvVar = this.H0.D0;
        if (tvVar != null) {
            tvVar.invalidate();
        }
    }

    @Override
    public final void o(int i3, int i10) {
        ey eyVar = this.H0;
        lt ltVar = eyVar.f33541g2;
        int i11 = eyVar.F1;
        int i12 = i3 - i11;
        int i13 = i10 - i11;
        int i14 = eyVar.f33529d1;
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i14);
        ArrayList arrayList = eyVar.f33533e1;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        Collections.sort(b02.s0(0), new dl(this, 1));
        ArrayList arrayList2 = eyVar.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            eyVar.G2.addAll(arrayList);
        }
        eyVar.D();
        org.telegram.messenger.g0.r(ltVar);
        org.telegram.messenger.g0.i3(ltVar, 1500L);
        org.telegram.messenger.li b03 = org.telegram.messenger.li.b0(i14);
        b03.Y[0] = org.telegram.messenger.li.q(b03.H[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i15 = eyVar.f33536f0; i15 < arrayList.size(); i15 = a1.g.h(i15, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i15)).set.f27028id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new ei.u5(19));
        org.telegram.messenger.hs.f(i14).k(org.telegram.messenger.hs.f23333x0, 0, Boolean.TRUE);
        eyVar.X(true);
        if (org.telegram.messenger.az.X) {
            org.telegram.messenger.az.P();
            org.telegram.ui.ActionBar.d2 d2Var = this.F0;
            if (d2Var != null) {
                fc.a0(d2Var).L(2131624017, org.telegram.messenger.bd.M0(2131751338, null), org.telegram.messenger.bd.M0(2131751337, null), org.telegram.messenger.bd.N0("Settings"), new bd(1, d2Var)).j();
                return;
            }
            FrameLayout frameLayout = eyVar.f33570r;
            if (frameLayout != null) {
                new fc(frameLayout, eyVar.f33520a2).I(2131624017, org.telegram.messenger.bd.M0(2131751338, null), org.telegram.messenger.bd.M0(2131751337, null)).j();
            }
        }
    }

    @Override
    public final void p() {
        ey eyVar = this.H0;
        eyVar.Z();
        tv tvVar = eyVar.D0;
        if (tvVar != null) {
            tvVar.invalidate();
        }
        invalidate();
        fx fxVar = eyVar.f33582u1;
        if (fxVar != null) {
            fxVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (!this.G0) {
                this.H0.f33596y0.invalidate();
            }
        }
    }
}
