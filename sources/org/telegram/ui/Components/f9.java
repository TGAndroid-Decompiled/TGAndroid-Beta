package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final gm f24073a;

    public f9(gm gmVar) {
        this.f24073a = gmVar;
    }

    @Override
    public final void run() {
        ai.l4 l4Var;
        gm gmVar = this.f24073a;
        AndroidUtilities.runOnUIThread(gmVar.f24345y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = gmVar.f24340n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && gmVar.f24343w == 1.0f) {
            if (gmVar.f24344x || ((l4Var = gmVar.f24337b.f27461k) != null && l4Var.hasImageLoaded())) {
                int i10 = gmVar.v + 1;
                gmVar.v = i10;
                gmVar.f24342s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    gmVar.v = 0;
                }
                if (gmVar.f24342s > 6) {
                    gmVar.f24342s = 0;
                }
                q5 q5Var = new q5(4, gmVar.f24341r, tL_emojiList.document_id.get(gmVar.v).longValue());
                gmVar.f24336a = q5Var;
                gmVar.d.setAnimatedEmojiDrawable(q5Var);
                int[] iArr = e9.f23809c0[gmVar.f24342s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                o20 o20Var = new o20();
                gmVar.f24339f = o20Var;
                o20Var.d(i11, i12, i13, i14);
                gmVar.f24343w = 0.0f;
                gmVar.b();
                gmVar.invalidate();
            }
        }
    }
}
