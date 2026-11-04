package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final rl f37949a;

    public s8(rl rlVar) {
        this.f37949a = rlVar;
    }

    @Override
    public final void run() {
        ei.c3 c3Var;
        rl rlVar = this.f37949a;
        org.telegram.messenger.g0.i3(rlVar.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = rlVar.f38343n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && rlVar.f38347x == 1.0f) {
            if (rlVar.f38348y || ((c3Var = rlVar.f38339b.f33971k) != null && c3Var.J())) {
                int i3 = rlVar.f38346w + 1;
                rlVar.f38346w = i3;
                rlVar.f38345s++;
                if (i3 > tL_emojiList.document_id.size() - 1) {
                    rlVar.f38346w = 0;
                }
                if (rlVar.f38345s > 6) {
                    rlVar.f38345s = 0;
                }
                g5 g5Var = new g5(4, rlVar.f38344r, tL_emojiList.document_id.get(rlVar.f38346w).longValue());
                rlVar.f38338a = g5Var;
                rlVar.d.setAnimatedEmojiDrawable(g5Var);
                int[] iArr = r8.f37665d0[rlVar.f38345s];
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                b10 b10Var = new b10();
                rlVar.f38342f = b10Var;
                b10Var.d(i10, i11, i12, i13);
                rlVar.f38347x = 0.0f;
                rlVar.b();
                rlVar.invalidate();
            }
        }
    }
}
