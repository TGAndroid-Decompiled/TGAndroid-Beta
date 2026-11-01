package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gt extends org.telegram.ui.Components.tk0 {
    public final ArrayList f37563c;
    public final kt d;

    public gt(kt ktVar, ArrayList arrayList) {
        this.d = ktVar;
        this.f37563c = arrayList;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f37563c.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        jt jtVar = (jt) c1Var.f47909a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f37563c.get(i10);
        org.telegram.ui.ActionBar.u5 u5Var = jtVar.f38538b;
        org.telegram.ui.Components.g9 g9Var = jtVar.f38537a;
        jtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            u5Var.l(org.telegram.messenger.dd.L0(2131748279, null), false);
            g9Var.setImageResource(2131232043);
            return;
        }
        u5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
            org.telegram.messenger.d00 f7 = org.telegram.messenger.v5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.t6.f20873a7, 1.0f, jtVar.f38539c);
            if (f7 != null) {
                if (w9 != null) {
                    g9Var.k(org.telegram.messenger.jc.c(w9, stickerSetCovered.cover), null, "webp", f7, stickerSetCovered);
                    return;
                } else {
                    g9Var.k(org.telegram.messenger.jc.b(stickerSetCovered.cover), null, "webp", f7, stickerSetCovered);
                    return;
                }
            }
            g9Var.k(org.telegram.messenger.jc.c(w9, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        g9Var.m(null, null, null, null, null, 0);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        jt jtVar = new jt(viewGroup.getContext(), this.d.f38978c0);
        jtVar.setLayoutParams(new s4.o0(-2, org.telegram.messenger.i0.L(48.0f)));
        return new s4.c1(jtVar);
    }
}
