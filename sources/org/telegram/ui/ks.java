package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ks extends org.telegram.ui.Components.tj0 {
    public final ArrayList f48750c;
    public final ns d;

    public ks(ns nsVar, ArrayList arrayList) {
        this.d = nsVar;
        this.f48750c = arrayList;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f48750c.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        ms msVar = (ms) e1Var.f58535a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f48750c.get(i7);
        org.telegram.ui.ActionBar.j5 j5Var = msVar.f49310b;
        org.telegram.ui.Components.i9 i9Var = msVar.f49309a;
        msVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            j5Var.l(org.telegram.messenger.hd.M0(2131748262, null), false);
            i9Var.setImageResource(2131232045);
            return;
        }
        j5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            org.telegram.messenger.pz f10 = org.telegram.messenger.t5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.j6.f28792a7, 1.0f, msVar.f49311c);
            if (f10 != null) {
                if (w10 != null) {
                    i9Var.k(org.telegram.messenger.gc.c(w10, stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                } else {
                    i9Var.k(org.telegram.messenger.gc.b(stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                }
            }
            i9Var.k(org.telegram.messenger.gc.c(w10, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        i9Var.m(null, null, null, null, null, 0);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ms msVar = new ms(viewGroup.getContext(), this.d.f49647c0);
        msVar.setLayoutParams(new v4.p0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new v4.e1(msVar);
    }
}
