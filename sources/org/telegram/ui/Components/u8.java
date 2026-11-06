package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final sl f38542a;

    public u8(sl slVar) {
        this.f38542a = slVar;
    }

    @Override
    public final void run() {
        di.z2 z2Var;
        sl slVar = this.f38542a;
        org.telegram.messenger.g0.i3(slVar.D, 1000L);
        TLRPC.TL_emojiList tL_emojiList = slVar.f38885n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && slVar.f38889x == 1.0f) {
            if (slVar.f38890y || ((z2Var = slVar.f38881b.f34450k) != null && z2Var.J())) {
                int i7 = slVar.f38888w + 1;
                slVar.f38888w = i7;
                slVar.f38887s++;
                if (i7 > tL_emojiList.document_id.size() - 1) {
                    slVar.f38888w = 0;
                }
                if (slVar.f38887s > 6) {
                    slVar.f38887s = 0;
                }
                i5 i5Var = new i5(4, slVar.f38886r, tL_emojiList.document_id.get(slVar.f38888w).longValue());
                slVar.f38880a = i5Var;
                slVar.d.setAnimatedEmojiDrawable(i5Var);
                int[] iArr = t8.f38273c0[slVar.f38887s];
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                e10 e10Var = new e10();
                slVar.f38884f = e10Var;
                e10Var.d(i10, i11, i12, i13);
                slVar.f38889x = 0.0f;
                slVar.b();
                slVar.invalidate();
            }
        }
    }
}
