package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ht extends org.telegram.ui.Components.sk0 {
    public final ArrayList f38030c;
    public final lt d;

    public ht(lt ltVar, ArrayList arrayList) {
        this.d = ltVar;
        this.f38030c = arrayList;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f38030c.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        kt ktVar = (kt) c1Var.f47898a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f38030c.get(i10);
        org.telegram.ui.ActionBar.u5 u5Var = ktVar.f38932b;
        org.telegram.ui.Components.g9 g9Var = ktVar.f38931a;
        ktVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            u5Var.l(org.telegram.messenger.cd.L0(2131748279, null), false);
            g9Var.setImageResource(2131232043);
            return;
        }
        u5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
            org.telegram.messenger.c00 f7 = org.telegram.messenger.v5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.t6.f20872a7, 1.0f, ktVar.f38933c);
            if (f7 != null) {
                if (w9 != null) {
                    g9Var.k(org.telegram.messenger.ic.c(w9, stickerSetCovered.cover), null, "webp", f7, stickerSetCovered);
                    return;
                } else {
                    g9Var.k(org.telegram.messenger.ic.b(stickerSetCovered.cover), null, "webp", f7, stickerSetCovered);
                    return;
                }
            }
            g9Var.k(org.telegram.messenger.ic.c(w9, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        g9Var.m(null, null, null, null, null, 0);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        kt ktVar = new kt(viewGroup.getContext(), this.d.f39388c0);
        ktVar.setLayoutParams(new s4.o0(-2, org.telegram.messenger.i0.L(48.0f)));
        return new s4.c1(ktVar);
    }
}
