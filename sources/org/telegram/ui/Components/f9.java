package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final jm f26387a;

    public f9(jm jmVar) {
        this.f26387a = jmVar;
    }

    @Override
    public final void run() {
        ai.l4 l4Var;
        jm jmVar = this.f26387a;
        AndroidUtilities.runOnUIThread(jmVar.f26728y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = jmVar.f26723n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && jmVar.f26726w == 1.0f) {
            if (jmVar.f26727x || ((l4Var = jmVar.f26719b.f29909k) != null && l4Var.hasImageLoaded())) {
                int i10 = jmVar.v + 1;
                jmVar.v = i10;
                jmVar.f26725s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    jmVar.v = 0;
                }
                if (jmVar.f26725s > 6) {
                    jmVar.f26725s = 0;
                }
                q5 q5Var = new q5(4, jmVar.f26724r, tL_emojiList.document_id.get(jmVar.v).longValue());
                jmVar.f26718a = q5Var;
                jmVar.d.setAnimatedEmojiDrawable(q5Var);
                int[] iArr = e9.f26001c0[jmVar.f26725s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                s20 s20Var = new s20();
                jmVar.f26722f = s20Var;
                s20Var.d(i11, i12, i13, i14);
                jmVar.f26726w = 0.0f;
                jmVar.b();
                jmVar.invalidate();
            }
        }
    }
}
