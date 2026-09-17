package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class d9 implements Runnable {
    public final gm f23233a;

    public d9(gm gmVar) {
        this.f23233a = gmVar;
    }

    @Override
    public final void run() {
        ai.l4 l4Var;
        gm gmVar = this.f23233a;
        AndroidUtilities.runOnUIThread(gmVar.f23519y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = gmVar.f23514n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && gmVar.f23517w == 1.0f) {
            if (gmVar.f23518x || ((l4Var = gmVar.f23511b.f26636k) != null && l4Var.hasImageLoaded())) {
                int i10 = gmVar.v + 1;
                gmVar.v = i10;
                gmVar.f23516s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    gmVar.v = 0;
                }
                if (gmVar.f23516s > 6) {
                    gmVar.f23516s = 0;
                }
                o5 o5Var = new o5(4, gmVar.f23515r, tL_emojiList.document_id.get(gmVar.v).longValue());
                gmVar.f23510a = o5Var;
                gmVar.d.setAnimatedEmojiDrawable(o5Var);
                int[] iArr = c9.f22961c0[gmVar.f23516s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                o20 o20Var = new o20();
                gmVar.f23513f = o20Var;
                o20Var.d(i11, i12, i13, i14);
                gmVar.f23517w = 0.0f;
                gmVar.b();
                gmVar.invalidate();
            }
        }
    }
}
