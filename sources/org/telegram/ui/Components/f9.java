package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final jm f26386a;

    public f9(jm jmVar) {
        this.f26386a = jmVar;
    }

    @Override
    public final void run() {
        ai.l4 l4Var;
        jm jmVar = this.f26386a;
        AndroidUtilities.runOnUIThread(jmVar.f26727y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = jmVar.f26722n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && jmVar.f26725w == 1.0f) {
            if (jmVar.f26726x || ((l4Var = jmVar.f26718b.f29908k) != null && l4Var.hasImageLoaded())) {
                int i10 = jmVar.v + 1;
                jmVar.v = i10;
                jmVar.f26724s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    jmVar.v = 0;
                }
                if (jmVar.f26724s > 6) {
                    jmVar.f26724s = 0;
                }
                q5 q5Var = new q5(4, jmVar.f26723r, tL_emojiList.document_id.get(jmVar.v).longValue());
                jmVar.f26717a = q5Var;
                jmVar.d.setAnimatedEmojiDrawable(q5Var);
                int[] iArr = e9.f26000c0[jmVar.f26724s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                s20 s20Var = new s20();
                jmVar.f26721f = s20Var;
                s20Var.d(i11, i12, i13, i14);
                jmVar.f26725w = 0.0f;
                jmVar.b();
                jmVar.invalidate();
            }
        }
    }
}
