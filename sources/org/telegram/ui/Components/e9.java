package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final gm f23889a;

    public e9(gm gmVar) {
        this.f23889a = gmVar;
    }

    @Override
    public final void run() {
        ai.l4 l4Var;
        gm gmVar = this.f23889a;
        AndroidUtilities.runOnUIThread(gmVar.f24143y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = gmVar.f24138n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && gmVar.f24141w == 1.0f) {
            if (gmVar.f24142x || ((l4Var = gmVar.f24135b.f27256k) != null && l4Var.hasImageLoaded())) {
                int i10 = gmVar.v + 1;
                gmVar.v = i10;
                gmVar.f24140s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    gmVar.v = 0;
                }
                if (gmVar.f24140s > 6) {
                    gmVar.f24140s = 0;
                }
                p5 p5Var = new p5(4, gmVar.f24139r, tL_emojiList.document_id.get(gmVar.v).longValue());
                gmVar.f24134a = p5Var;
                gmVar.d.setAnimatedEmojiDrawable(p5Var);
                int[] iArr = d9.f23602c0[gmVar.f24140s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                o20 o20Var = new o20();
                gmVar.f24137f = o20Var;
                o20Var.d(i11, i12, i13, i14);
                gmVar.f24141w = 0.0f;
                gmVar.b();
                gmVar.invalidate();
            }
        }
    }
}
