package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class d9 implements Runnable {
    public final gm f23240a;

    public d9(gm gmVar) {
        this.f23240a = gmVar;
    }

    @Override
    public final void run() {
        ai.l4 l4Var;
        gm gmVar = this.f23240a;
        AndroidUtilities.runOnUIThread(gmVar.f23592y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = gmVar.f23587n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && gmVar.f23590w == 1.0f) {
            if (gmVar.f23591x || ((l4Var = gmVar.f23584b.f26689k) != null && l4Var.hasImageLoaded())) {
                int i10 = gmVar.v + 1;
                gmVar.v = i10;
                gmVar.f23589s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    gmVar.v = 0;
                }
                if (gmVar.f23589s > 6) {
                    gmVar.f23589s = 0;
                }
                o5 o5Var = new o5(4, gmVar.f23588r, tL_emojiList.document_id.get(gmVar.v).longValue());
                gmVar.f23583a = o5Var;
                gmVar.d.setAnimatedEmojiDrawable(o5Var);
                int[] iArr = c9.f22977c0[gmVar.f23589s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                o20 o20Var = new o20();
                gmVar.f23586f = o20Var;
                o20Var.d(i11, i12, i13, i14);
                gmVar.f23590w = 0.0f;
                gmVar.b();
                gmVar.invalidate();
            }
        }
    }
}
