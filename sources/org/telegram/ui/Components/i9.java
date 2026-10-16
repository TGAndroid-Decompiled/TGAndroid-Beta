package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class i9 implements Runnable {
    public final tm f25602a;

    public i9(tm tmVar) {
        this.f25602a = tmVar;
    }

    @Override
    public final void run() {
        bi.b4 b4Var;
        tm tmVar = this.f25602a;
        AndroidUtilities.runOnUIThread(tmVar.f25937y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = tmVar.f25932n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && tmVar.f25935w == 1.0f) {
            if (tmVar.f25936x || ((b4Var = tmVar.f25929b.f28739k) != null && b4Var.hasImageLoaded())) {
                int i10 = tmVar.v + 1;
                tmVar.v = i10;
                tmVar.f25934s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    tmVar.v = 0;
                }
                if (tmVar.f25934s > 6) {
                    tmVar.f25934s = 0;
                }
                s5 s5Var = new s5(4, tmVar.f25933r, tL_emojiList.document_id.get(tmVar.v).longValue());
                tmVar.f25928a = s5Var;
                tmVar.d.setAnimatedEmojiDrawable(s5Var);
                int[] iArr = h9.f25207c0[tmVar.f25934s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                b30 b30Var = new b30();
                tmVar.f25931f = b30Var;
                b30Var.d(i11, i12, i13, i14);
                tmVar.f25935w = 0.0f;
                tmVar.b();
                tmVar.invalidate();
            }
        }
    }
}
