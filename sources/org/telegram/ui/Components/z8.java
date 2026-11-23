package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class z8 implements Runnable {
    public final im f42690a;

    public z8(im imVar) {
        this.f42690a = imVar;
    }

    @Override
    public final void run() {
        fi.s2 s2Var;
        im imVar = this.f42690a;
        org.telegram.messenger.g0.h3(imVar.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = imVar.f33401n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && imVar.f33405x == 1.0f) {
            if (imVar.f33406y || ((s2Var = imVar.f33397b.f38457k) != null && s2Var.J())) {
                int i7 = imVar.f33404w + 1;
                imVar.f33404w = i7;
                imVar.f33403s++;
                if (i7 > tL_emojiList.document_id.size() - 1) {
                    imVar.f33404w = 0;
                }
                if (imVar.f33403s > 6) {
                    imVar.f33403s = 0;
                }
                p5 p5Var = new p5(4, imVar.f33402r, tL_emojiList.document_id.get(imVar.f33404w).longValue());
                imVar.f33396a = p5Var;
                imVar.d.setAnimatedEmojiDrawable(p5Var);
                int[] iArr = y8.f42318d0[imVar.f33403s];
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                s10 s10Var = new s10();
                imVar.f33400f = s10Var;
                s10Var.d(i10, i11, i12, i13);
                imVar.f33405x = 0.0f;
                imVar.b();
                imVar.invalidate();
            }
        }
    }
}
