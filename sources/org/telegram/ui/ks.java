package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ks extends org.telegram.ui.Components.oj0 {
    public final ArrayList f47403c;
    public final ns d;

    public ks(ns nsVar, ArrayList arrayList) {
        this.d = nsVar;
        this.f47403c = arrayList;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f47403c.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        ms msVar = (ms) d1Var.f57052a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f47403c.get(i7);
        org.telegram.ui.ActionBar.m5 m5Var = msVar.f48047b;
        org.telegram.ui.Components.k9 k9Var = msVar.f48046a;
        msVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            m5Var.l(org.telegram.messenger.id.M0(2131748262, null), false);
            k9Var.setImageResource(2131232044);
            return;
        }
        m5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.m6.f27834a7, 1.0f, msVar.f48048c);
            if (f10 != null) {
                if (w10 != null) {
                    k9Var.k(org.telegram.messenger.hc.c(w10, stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                } else {
                    k9Var.k(org.telegram.messenger.hc.b(stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                }
            }
            k9Var.k(org.telegram.messenger.hc.c(w10, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        k9Var.m(null, null, null, null, null, 0);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ms msVar = new ms(viewGroup.getContext(), this.d.f48258c0);
        msVar.setLayoutParams(new v4.o0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new v4.d1(msVar);
    }
}
