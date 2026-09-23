package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final hm f23904a;

    public f9(hm hmVar) {
        this.f23904a = hmVar;
    }

    @Override
    public final void run() {
        ai.l4 l4Var;
        hm hmVar = this.f23904a;
        AndroidUtilities.runOnUIThread(hmVar.f24244y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = hmVar.f24239n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && hmVar.f24242w == 1.0f) {
            if (hmVar.f24243x || ((l4Var = hmVar.f24236b.f27230k) != null && l4Var.hasImageLoaded())) {
                int i10 = hmVar.v + 1;
                hmVar.v = i10;
                hmVar.f24241s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    hmVar.v = 0;
                }
                if (hmVar.f24241s > 6) {
                    hmVar.f24241s = 0;
                }
                q5 q5Var = new q5(4, hmVar.f24240r, tL_emojiList.document_id.get(hmVar.v).longValue());
                hmVar.f24235a = q5Var;
                hmVar.d.setAnimatedEmojiDrawable(q5Var);
                int[] iArr = e9.f23605c0[hmVar.f24241s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                p20 p20Var = new p20();
                hmVar.f24238f = p20Var;
                p20Var.d(i11, i12, i13, i14);
                hmVar.f24242w = 0.0f;
                hmVar.b();
                hmVar.invalidate();
            }
        }
    }
}
