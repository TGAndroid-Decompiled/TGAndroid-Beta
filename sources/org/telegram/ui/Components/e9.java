package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final gm f23777a;

    public e9(gm gmVar) {
        this.f23777a = gmVar;
    }

    @Override
    public final void run() {
        ai.l4 l4Var;
        gm gmVar = this.f23777a;
        AndroidUtilities.runOnUIThread(gmVar.f24054y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = gmVar.f24049n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && gmVar.f24052w == 1.0f) {
            if (gmVar.f24053x || ((l4Var = gmVar.f24046b.f27162k) != null && l4Var.hasImageLoaded())) {
                int i10 = gmVar.v + 1;
                gmVar.v = i10;
                gmVar.f24051s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    gmVar.v = 0;
                }
                if (gmVar.f24051s > 6) {
                    gmVar.f24051s = 0;
                }
                p5 p5Var = new p5(4, gmVar.f24050r, tL_emojiList.document_id.get(gmVar.v).longValue());
                gmVar.f24045a = p5Var;
                gmVar.d.setAnimatedEmojiDrawable(p5Var);
                int[] iArr = d9.f23518c0[gmVar.f24051s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                o20 o20Var = new o20();
                gmVar.f24048f = o20Var;
                o20Var.d(i11, i12, i13, i14);
                gmVar.f24052w = 0.0f;
                gmVar.b();
                gmVar.invalidate();
            }
        }
    }
}
