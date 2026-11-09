package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class uv extends ow {
    public static final int H0 = 0;
    public final org.telegram.ui.ActionBar.f2 E0;
    public final boolean F0;
    public final hy G0;

    public uv(hy hyVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        super(hyVar, context, g6Var);
        this.G0 = hyVar;
        this.E0 = f2Var;
        this.F0 = z9;
    }

    @Override
    public final void j() {
        vv vvVar = this.G0.C0;
        if (vvVar != null) {
            vvVar.invalidate();
        }
    }

    @Override
    public final void o(int i7, int i10) {
        hy hyVar = this.G0;
        et etVar = hyVar.f34426f2;
        int i11 = hyVar.E1;
        int i12 = i7 - i11;
        int i13 = i10 - i11;
        int i14 = hyVar.f34415c1;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i14);
        ArrayList arrayList = hyVar.f34418d1;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        Collections.sort(b02.s0(0), new el(this, 1));
        ArrayList arrayList2 = hyVar.F2;
        if (arrayList2 != null) {
            arrayList2.clear();
            hyVar.F2.addAll(arrayList);
        }
        hyVar.D();
        org.telegram.messenger.g0.r(etVar);
        org.telegram.messenger.g0.i3(etVar, 1500L);
        org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i14);
        b03.X[0] = org.telegram.messenger.ui.q(b03.G[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i15 = hyVar.f34420e0; i15 < arrayList.size(); i15 = com.google.android.recaptcha.internal.a.g(i15, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i15)).set.f26983id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new di.v5(19));
        org.telegram.messenger.qs.f(i14).k(org.telegram.messenger.qs.f25104x0, 0, Boolean.TRUE);
        hyVar.X(true);
        if (org.telegram.messenger.iz.X) {
            org.telegram.messenger.iz.P();
            org.telegram.ui.ActionBar.f2 f2Var = this.E0;
            if (f2Var != null) {
                hc.a0(f2Var).L(2131624017, org.telegram.messenger.id.M0(2131751337, null), org.telegram.messenger.id.M0(2131751336, null), org.telegram.messenger.id.N0("Settings"), new dd(1, f2Var)).j();
                return;
            }
            FrameLayout frameLayout = hyVar.f34458r;
            if (frameLayout != null) {
                new hc(frameLayout, hyVar.Z1).I(2131624017, org.telegram.messenger.id.M0(2131751337, null), org.telegram.messenger.id.M0(2131751336, null)).j();
            }
        }
    }

    @Override
    public final void p() {
        hy hyVar = this.G0;
        hyVar.Z();
        vv vvVar = hyVar.C0;
        if (vvVar != null) {
            vvVar.invalidate();
        }
        invalidate();
        ix ixVar = hyVar.f34467t1;
        if (ixVar != null) {
            ixVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (!this.F0) {
                this.G0.f34480x0.invalidate();
            }
        }
    }
}
