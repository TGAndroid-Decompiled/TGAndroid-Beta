package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final im f24202a;

    public f9(im imVar) {
        this.f24202a = imVar;
    }

    @Override
    public final void run() {
        ai.l4 l4Var;
        im imVar = this.f24202a;
        AndroidUtilities.runOnUIThread(imVar.f24513y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = imVar.f24508n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && imVar.f24511w == 1.0f) {
            if (imVar.f24512x || ((l4Var = imVar.f24505b.f27595k) != null && l4Var.hasImageLoaded())) {
                int i10 = imVar.v + 1;
                imVar.v = i10;
                imVar.f24510s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    imVar.v = 0;
                }
                if (imVar.f24510s > 6) {
                    imVar.f24510s = 0;
                }
                q5 q5Var = new q5(4, imVar.f24509r, tL_emojiList.document_id.get(imVar.v).longValue());
                imVar.f24504a = q5Var;
                imVar.d.setAnimatedEmojiDrawable(q5Var);
                int[] iArr = e9.f23975c0[imVar.f24510s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                r20 r20Var = new r20();
                imVar.f24507f = r20Var;
                r20Var.d(i11, i12, i13, i14);
                imVar.f24511w = 0.0f;
                imVar.b();
                imVar.invalidate();
            }
        }
    }
}
