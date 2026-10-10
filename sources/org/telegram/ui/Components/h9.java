package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Runnable {
    public final xm f26968a;

    public h9(xm xmVar) {
        this.f26968a = xmVar;
    }

    @Override
    public final void run() {
        ai.m4 m4Var;
        xm xmVar = this.f26968a;
        AndroidUtilities.runOnUIThread(xmVar.f27280y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = xmVar.f27275n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && xmVar.f27278w == 1.0f) {
            if (xmVar.f27279x || ((m4Var = xmVar.f27271b.f30680k) != null && m4Var.hasImageLoaded())) {
                int i10 = xmVar.v + 1;
                xmVar.v = i10;
                xmVar.f27277s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    xmVar.v = 0;
                }
                if (xmVar.f27277s > 6) {
                    xmVar.f27277s = 0;
                }
                s5 s5Var = new s5(4, xmVar.f27276r, tL_emojiList.document_id.get(xmVar.v).longValue());
                xmVar.f27270a = s5Var;
                xmVar.d.setAnimatedEmojiDrawable(s5Var);
                int[] iArr = g9.f26638c0[xmVar.f27277s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                g30 g30Var = new g30();
                xmVar.f27274f = g30Var;
                g30Var.d(i11, i12, i13, i14);
                xmVar.f27278w = 0.0f;
                xmVar.b();
                xmVar.invalidate();
            }
        }
    }
}
