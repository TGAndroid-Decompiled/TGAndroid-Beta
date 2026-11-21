package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class z8 implements Runnable {
    public final im f42729a;

    public z8(im imVar) {
        this.f42729a = imVar;
    }

    @Override
    public final void run() {
        fi.s2 s2Var;
        im imVar = this.f42729a;
        org.telegram.messenger.g0.h3(imVar.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = imVar.f33422n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && imVar.f33426x == 1.0f) {
            if (imVar.f33427y || ((s2Var = imVar.f33418b.f38501k) != null && s2Var.J())) {
                int i7 = imVar.f33425w + 1;
                imVar.f33425w = i7;
                imVar.f33424s++;
                if (i7 > tL_emojiList.document_id.size() - 1) {
                    imVar.f33425w = 0;
                }
                if (imVar.f33424s > 6) {
                    imVar.f33424s = 0;
                }
                p5 p5Var = new p5(4, imVar.f33423r, tL_emojiList.document_id.get(imVar.f33425w).longValue());
                imVar.f33417a = p5Var;
                imVar.d.setAnimatedEmojiDrawable(p5Var);
                int[] iArr = y8.f42348d0[imVar.f33424s];
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                s10 s10Var = new s10();
                imVar.f33421f = s10Var;
                s10Var.d(i10, i11, i12, i13);
                imVar.f33426x = 0.0f;
                imVar.b();
                imVar.invalidate();
            }
        }
    }
}
