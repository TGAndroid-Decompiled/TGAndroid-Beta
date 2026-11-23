package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class y8 implements Runnable {
    public final gm f42378a;

    public y8(gm gmVar) {
        this.f42378a = gmVar;
    }

    @Override
    public final void run() {
        fi.s2 s2Var;
        gm gmVar = this.f42378a;
        org.telegram.messenger.g0.h3(gmVar.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = gmVar.f42750n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && gmVar.f42754x == 1.0f) {
            if (gmVar.f42755y || ((s2Var = gmVar.f42746b.f38028k) != null && s2Var.K())) {
                int i7 = gmVar.f42753w + 1;
                gmVar.f42753w = i7;
                gmVar.f42752s++;
                if (i7 > tL_emojiList.document_id.size() - 1) {
                    gmVar.f42753w = 0;
                }
                if (gmVar.f42752s > 6) {
                    gmVar.f42752s = 0;
                }
                o5 o5Var = new o5(4, gmVar.f42751r, tL_emojiList.document_id.get(gmVar.f42753w).longValue());
                gmVar.f42745a = o5Var;
                gmVar.d.setAnimatedEmojiDrawable(o5Var);
                int[] iArr = x8.f41916d0[gmVar.f42752s];
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                q10 q10Var = new q10();
                gmVar.f42749f = q10Var;
                q10Var.d(i10, i11, i12, i13);
                gmVar.f42754x = 0.0f;
                gmVar.b();
                gmVar.invalidate();
            }
        }
    }
}
