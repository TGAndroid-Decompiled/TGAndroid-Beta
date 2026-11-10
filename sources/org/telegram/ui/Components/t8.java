package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class t8 implements Runnable {
    public final rl f38232a;

    public t8(rl rlVar) {
        this.f38232a = rlVar;
    }

    @Override
    public final void run() {
        di.z2 z2Var;
        rl rlVar = this.f38232a;
        org.telegram.messenger.g0.i3(rlVar.D, 1000L);
        TLRPC.TL_emojiList tL_emojiList = rlVar.f38592n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && rlVar.f38596x == 1.0f) {
            if (rlVar.f38597y || ((z2Var = rlVar.f38588b.f34176k) != null && z2Var.J())) {
                int i7 = rlVar.f38595w + 1;
                rlVar.f38595w = i7;
                rlVar.f38594s++;
                if (i7 > tL_emojiList.document_id.size() - 1) {
                    rlVar.f38595w = 0;
                }
                if (rlVar.f38594s > 6) {
                    rlVar.f38594s = 0;
                }
                h5 h5Var = new h5(4, rlVar.f38593r, tL_emojiList.document_id.get(rlVar.f38595w).longValue());
                rlVar.f38587a = h5Var;
                rlVar.d.setAnimatedEmojiDrawable(h5Var);
                int[] iArr = s8.f37885c0[rlVar.f38594s];
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                e10 e10Var = new e10();
                rlVar.f38591f = e10Var;
                e10Var.d(i10, i11, i12, i13);
                rlVar.f38596x = 0.0f;
                rlVar.b();
                rlVar.invalidate();
            }
        }
    }
}
