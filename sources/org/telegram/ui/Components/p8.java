package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class p8 implements Runnable {
    public final am f29309a;

    public p8(am amVar) {
        this.f29309a = amVar;
    }

    @Override
    public final void run() {
        ag.c2 c2Var;
        am amVar = this.f29309a;
        org.telegram.messenger.i0.h3(amVar.D, 1000L);
        TLRPC.TL_emojiList tL_emojiList = amVar.f29556n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && amVar.f29560x == 1.0f) {
            if (amVar.f29561y || ((c2Var = amVar.f29553b.f25975k) != null && c2Var.J())) {
                int i10 = amVar.f29559w + 1;
                amVar.f29559w = i10;
                amVar.f29558s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    amVar.f29559w = 0;
                }
                if (amVar.f29558s > 6) {
                    amVar.f29558s = 0;
                }
                f5 f5Var = new f5(4, amVar.f29557r, tL_emojiList.document_id.get(amVar.f29559w).longValue());
                amVar.f29552a = f5Var;
                amVar.d.setAnimatedEmojiDrawable(f5Var);
                int[] iArr = o8.f28985c0[amVar.f29558s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                u10 u10Var = new u10();
                amVar.f29555f = u10Var;
                u10Var.d(i11, i12, i13, i14);
                amVar.f29560x = 0.0f;
                amVar.b();
                amVar.invalidate();
            }
        }
    }
}
