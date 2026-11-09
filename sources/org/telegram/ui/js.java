package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class js extends org.telegram.ui.Components.pj0 {
    public final ArrayList f47069c;
    public final ms d;

    public js(ms msVar, ArrayList arrayList) {
        this.d = msVar;
        this.f47069c = arrayList;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f47069c.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        ls lsVar = (ls) d1Var.f57056a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f47069c.get(i7);
        org.telegram.ui.ActionBar.l5 l5Var = lsVar.f47672b;
        org.telegram.ui.Components.l9 l9Var = lsVar.f47671a;
        lsVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            l5Var.l(org.telegram.messenger.id.M0(2131748262, null), false);
            l9Var.setImageResource(2131232044);
            return;
        }
        l5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.l6.f27809a7, 1.0f, lsVar.f47673c);
            if (f10 != null) {
                if (w10 != null) {
                    l9Var.k(org.telegram.messenger.hc.c(w10, stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                } else {
                    l9Var.k(org.telegram.messenger.hc.b(stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                }
            }
            l9Var.k(org.telegram.messenger.hc.c(w10, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        l9Var.m(null, null, null, null, null, 0);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ls lsVar = new ls(viewGroup.getContext(), this.d.f47961c0);
        lsVar.setLayoutParams(new v4.o0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new v4.d1(lsVar);
    }
}
