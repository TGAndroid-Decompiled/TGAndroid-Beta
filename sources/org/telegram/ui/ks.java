package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ks extends org.telegram.ui.Components.bk0 {
    public final ArrayList f49330c;
    public final ns d;

    public ks(ns nsVar, ArrayList arrayList) {
        this.d = nsVar;
        this.f49330c = arrayList;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f49330c.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        ms msVar = (ms) f1Var.f59122a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f49330c.get(i7);
        org.telegram.ui.ActionBar.n5 n5Var = msVar.f49947b;
        org.telegram.ui.Components.q9 q9Var = msVar.f49946a;
        msVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            n5Var.l(org.telegram.messenger.gd.M0(2131748070, null), false);
            q9Var.setImageResource(2131232046);
            return;
        }
        n5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            org.telegram.messenger.lz f10 = org.telegram.messenger.u5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.n6.f29339a7, 1.0f, msVar.f49948c);
            if (f10 != null) {
                if (w10 != null) {
                    q9Var.k(org.telegram.messenger.fc.c(w10, stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                } else {
                    q9Var.k(org.telegram.messenger.fc.b(stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                }
            }
            q9Var.k(org.telegram.messenger.fc.c(w10, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        q9Var.m(null, null, null, null, null, 0);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ms msVar = new ms(viewGroup.getContext(), this.d.f50294c0);
        msVar.setLayoutParams(new v4.q0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new v4.f1(msVar);
    }
}
