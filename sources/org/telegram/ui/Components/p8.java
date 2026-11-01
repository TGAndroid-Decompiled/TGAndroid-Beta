package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class p8 implements Runnable {
    public final am f29372a;

    public p8(am amVar) {
        this.f29372a = amVar;
    }

    @Override
    public final void run() {
        ag.c2 c2Var;
        am amVar = this.f29372a;
        org.telegram.messenger.i0.h3(amVar.D, 1000L);
        TLRPC.TL_emojiList tL_emojiList = amVar.f29659n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && amVar.f29663x == 1.0f) {
            if (amVar.f29664y || ((c2Var = amVar.f29656b.f26070k) != null && c2Var.J())) {
                int i10 = amVar.f29662w + 1;
                amVar.f29662w = i10;
                amVar.f29661s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    amVar.f29662w = 0;
                }
                if (amVar.f29661s > 6) {
                    amVar.f29661s = 0;
                }
                f5 f5Var = new f5(4, amVar.f29660r, tL_emojiList.document_id.get(amVar.f29662w).longValue());
                amVar.f29655a = f5Var;
                amVar.d.setAnimatedEmojiDrawable(f5Var);
                int[] iArr = o8.f29042c0[amVar.f29661s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                u10 u10Var = new u10();
                amVar.f29658f = u10Var;
                u10Var.d(i11, i12, i13, i14);
                amVar.f29663x = 0.0f;
                amVar.b();
                amVar.invalidate();
            }
        }
    }
}
