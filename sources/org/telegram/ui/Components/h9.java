package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Runnable {
    public final xm f26931a;

    public h9(xm xmVar) {
        this.f26931a = xmVar;
    }

    @Override
    public final void run() {
        ai.m4 m4Var;
        xm xmVar = this.f26931a;
        AndroidUtilities.runOnUIThread(xmVar.f27225y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = xmVar.f27220n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && xmVar.f27223w == 1.0f) {
            if (xmVar.f27224x || ((m4Var = xmVar.f27216b.f30634k) != null && m4Var.hasImageLoaded())) {
                int i10 = xmVar.v + 1;
                xmVar.v = i10;
                xmVar.f27222s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    xmVar.v = 0;
                }
                if (xmVar.f27222s > 6) {
                    xmVar.f27222s = 0;
                }
                s5 s5Var = new s5(4, xmVar.f27221r, tL_emojiList.document_id.get(xmVar.v).longValue());
                xmVar.f27215a = s5Var;
                xmVar.d.setAnimatedEmojiDrawable(s5Var);
                int[] iArr = g9.f26631c0[xmVar.f27222s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                g30 g30Var = new g30();
                xmVar.f27219f = g30Var;
                g30Var.d(i11, i12, i13, i14);
                xmVar.f27223w = 0.0f;
                xmVar.b();
                xmVar.invalidate();
            }
        }
    }
}
