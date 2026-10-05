package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final jm f26428a;

    public f9(jm jmVar) {
        this.f26428a = jmVar;
    }

    @Override
    public final void run() {
        ai.l4 l4Var;
        jm jmVar = this.f26428a;
        AndroidUtilities.runOnUIThread(jmVar.f26764y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = jmVar.f26759n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && jmVar.f26762w == 1.0f) {
            if (jmVar.f26763x || ((l4Var = jmVar.f26755b.f29935k) != null && l4Var.hasImageLoaded())) {
                int i10 = jmVar.v + 1;
                jmVar.v = i10;
                jmVar.f26761s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    jmVar.v = 0;
                }
                if (jmVar.f26761s > 6) {
                    jmVar.f26761s = 0;
                }
                q5 q5Var = new q5(4, jmVar.f26760r, tL_emojiList.document_id.get(jmVar.v).longValue());
                jmVar.f26754a = q5Var;
                jmVar.d.setAnimatedEmojiDrawable(q5Var);
                int[] iArr = e9.f26068c0[jmVar.f26761s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                s20 s20Var = new s20();
                jmVar.f26758f = s20Var;
                s20Var.d(i11, i12, i13, i14);
                jmVar.f26762w = 0.0f;
                jmVar.b();
                jmVar.invalidate();
            }
        }
    }
}
