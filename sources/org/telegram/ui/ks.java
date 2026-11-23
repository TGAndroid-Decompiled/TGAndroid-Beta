package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ks extends org.telegram.ui.Components.dk0 {
    public final ArrayList f49347c;
    public final ns d;

    public ks(ns nsVar, ArrayList arrayList) {
        this.d = nsVar;
        this.f49347c = arrayList;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f49347c.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        ms msVar = (ms) e1Var.f59111a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f49347c.get(i7);
        org.telegram.ui.ActionBar.m5 m5Var = msVar.f49937b;
        org.telegram.ui.Components.q9 q9Var = msVar.f49936a;
        msVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            m5Var.l(org.telegram.messenger.hd.N0(2131748069, null), false);
            q9Var.setImageResource(2131232046);
            return;
        }
        m5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            org.telegram.messenger.mz f10 = org.telegram.messenger.u5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.m6.f29290a7, 1.0f, msVar.f49938c);
            if (f10 != null) {
                if (w10 != null) {
                    q9Var.k(org.telegram.messenger.gc.c(w10, stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                } else {
                    q9Var.k(org.telegram.messenger.gc.b(stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
                    return;
                }
            }
            q9Var.k(org.telegram.messenger.gc.c(w10, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        q9Var.m(null, null, null, null, null, 0);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ms msVar = new ms(viewGroup.getContext(), this.d.f50293c0);
        msVar.setLayoutParams(new v4.p0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new v4.e1(msVar);
    }
}
