package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class g9 implements Runnable {
    public final gm f26326a;

    public g9(gm gmVar) {
        this.f26326a = gmVar;
    }

    @Override
    public final void run() {
        bi.y3 y3Var;
        gm gmVar = this.f26326a;
        AndroidUtilities.runOnUIThread(gmVar.f26670y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = gmVar.f26665n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && gmVar.f26668w == 1.0f) {
            if (gmVar.f26669x || ((y3Var = gmVar.f26661b.f29584k) != null && y3Var.hasImageLoaded())) {
                int i10 = gmVar.v + 1;
                gmVar.v = i10;
                gmVar.f26667s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    gmVar.v = 0;
                }
                if (gmVar.f26667s > 6) {
                    gmVar.f26667s = 0;
                }
                q5 q5Var = new q5(4, gmVar.f26666r, tL_emojiList.document_id.get(gmVar.v).longValue());
                gmVar.f26660a = q5Var;
                gmVar.d.setAnimatedEmojiDrawable(q5Var);
                int[] iArr = f9.f25962c0[gmVar.f26667s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                o20 o20Var = new o20();
                gmVar.f26664f = o20Var;
                o20Var.d(i11, i12, i13, i14);
                gmVar.f26668w = 0.0f;
                gmVar.b();
                gmVar.invalidate();
            }
        }
    }
}
