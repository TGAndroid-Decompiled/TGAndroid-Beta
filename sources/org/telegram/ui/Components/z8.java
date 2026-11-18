package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class z8 implements Runnable {
    public final gm f42823a;

    public z8(gm gmVar) {
        this.f42823a = gmVar;
    }

    @Override
    public final void run() {
        fi.s2 s2Var;
        gm gmVar = this.f42823a;
        org.telegram.messenger.g0.h3(gmVar.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = gmVar.f33294n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && gmVar.f33298x == 1.0f) {
            if (gmVar.f33299y || ((s2Var = gmVar.f33290b.f37976k) != null && s2Var.J())) {
                int i7 = gmVar.f33297w + 1;
                gmVar.f33297w = i7;
                gmVar.f33296s++;
                if (i7 > tL_emojiList.document_id.size() - 1) {
                    gmVar.f33297w = 0;
                }
                if (gmVar.f33296s > 6) {
                    gmVar.f33296s = 0;
                }
                o5 o5Var = new o5(4, gmVar.f33295r, tL_emojiList.document_id.get(gmVar.f33297w).longValue());
                gmVar.f33289a = o5Var;
                gmVar.d.setAnimatedEmojiDrawable(o5Var);
                int[] iArr = y8.f42392d0[gmVar.f33296s];
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                p10 p10Var = new p10();
                gmVar.f33293f = p10Var;
                p10Var.d(i10, i11, i12, i13);
                gmVar.f33298x = 0.0f;
                gmVar.b();
                gmVar.invalidate();
            }
        }
    }
}
