package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fs extends org.telegram.ui.Components.sj0 {
    public final ArrayList f45363c;
    public final is d;

    public fs(is isVar, ArrayList arrayList) {
        this.d = isVar;
        this.f45363c = arrayList;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f45363c.size();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        hs hsVar = (hs) d1Var.f55540a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f45363c.get(i3);
        org.telegram.ui.ActionBar.k5 k5Var = hsVar.f45970b;
        org.telegram.ui.Components.k9 k9Var = hsVar.f45969a;
        hsVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            k5Var.l(org.telegram.messenger.bd.M0(2131748270, null), false);
            k9Var.setImageResource(2131232044);
            return;
        }
        k5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            org.telegram.messenger.jz f10 = org.telegram.messenger.t5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.k6.f27824a7, 1.0f, hsVar.f45971c);
            if (f10 != null) {
                if (w10 != null) {
                    k9Var.k(org.telegram.messenger.ac.c(w10, stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                } else {
                    k9Var.k(org.telegram.messenger.ac.b(stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                }
            }
            k9Var.k(org.telegram.messenger.ac.c(w10, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        k9Var.m(null, null, null, null, null, 0);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        hs hsVar = new hs(viewGroup.getContext(), this.d.f46387c0);
        hsVar.setLayoutParams(new u4.p0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new u4.d1(hsVar);
    }
}
