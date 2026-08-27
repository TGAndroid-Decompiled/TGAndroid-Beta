package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class w8 implements Runnable {

    public final tl f34139a;

    public w8(tl tlVar) {
        this.f34139a = tlVar;
    }

    @Override
    public final void run() {
        jh.y2 y2Var;
        tl tlVar = this.f34139a;
        AndroidUtilities.runOnUIThread(tlVar.f34551y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = tlVar.f34546n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || tlVar.f34549w != 1.0f) {
            return;
        }
        if (tlVar.f34550x || ((y2Var = tlVar.f34542b.f29961k) != null && y2Var.hasImageLoaded())) {
            int i10 = tlVar.v + 1;
            tlVar.v = i10;
            tlVar.f34548s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                tlVar.v = 0;
            }
            if (tlVar.f34548s > 6) {
                tlVar.f34548s = 0;
            }
            k5 k5Var = new k5(4, tlVar.f34547r, tL_emojiList.document_id.get(tlVar.v).longValue());
            tlVar.f34541a = k5Var;
            tlVar.d.setAnimatedEmojiDrawable(k5Var);
            int[] iArr = v8.Y[tlVar.f34548s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            c20 c20Var = new c20();
            tlVar.f34545f = c20Var;
            c20Var.d(i11, i12, i13, i14);
            tlVar.f34549w = 0.0f;
            tlVar.b();
            tlVar.invalidate();
        }
    }
}
