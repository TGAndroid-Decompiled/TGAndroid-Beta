package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ks extends org.telegram.ui.Components.dk0 {
    public final ArrayList f49517c;
    public final ns d;

    public ks(ns nsVar, ArrayList arrayList) {
        this.d = nsVar;
        this.f49517c = arrayList;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f49517c.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        ms msVar = (ms) f1Var.f59245a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f49517c.get(i7);
        org.telegram.ui.ActionBar.n5 n5Var = msVar.f50104b;
        org.telegram.ui.Components.p9 p9Var = msVar.f50103a;
        msVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            n5Var.l(org.telegram.messenger.gd.N0(2131748069, null), false);
            p9Var.setImageResource(2131232049);
            return;
        }
        n5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            org.telegram.messenger.kz f10 = org.telegram.messenger.u5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.n6.f29394a7, 1.0f, msVar.f50105c);
            if (f10 != null) {
                if (w10 != null) {
                    p9Var.k(org.telegram.messenger.fc.c(w10, stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                } else {
                    p9Var.k(org.telegram.messenger.fc.b(stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                }
            }
            p9Var.k(org.telegram.messenger.fc.c(w10, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        p9Var.m(null, null, null, null, null, 0);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ms msVar = new ms(viewGroup.getContext(), this.d.f50405c0);
        msVar.setLayoutParams(new v4.q0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new v4.f1(msVar);
    }
}
