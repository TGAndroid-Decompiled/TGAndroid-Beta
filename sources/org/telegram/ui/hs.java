package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hs extends org.telegram.ui.Components.oj0 {
    public final ArrayList f46483c;
    public final ks d;

    public hs(ks ksVar, ArrayList arrayList) {
        this.d = ksVar;
        this.f46483c = arrayList;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f46483c.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        js jsVar = (js) d1Var.f56952a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f46483c.get(i7);
        org.telegram.ui.ActionBar.k5 k5Var = jsVar.f47032b;
        org.telegram.ui.Components.l9 l9Var = jsVar.f47031a;
        jsVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            k5Var.l(org.telegram.messenger.hd.M0(2131748261, null), false);
            l9Var.setImageResource(2131232044);
            return;
        }
        k5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.k6.f27792a7, 1.0f, jsVar.f47033c);
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
        js jsVar = new js(viewGroup.getContext(), this.d.f47273c0);
        jsVar.setLayoutParams(new v4.o0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new v4.d1(jsVar);
    }
}
