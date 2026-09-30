package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final jm f24249a;

    public f9(jm jmVar) {
        this.f24249a = jmVar;
    }

    @Override
    public final void run() {
        ai.l4 l4Var;
        jm jmVar = this.f24249a;
        AndroidUtilities.runOnUIThread(jmVar.f24479y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = jmVar.f24474n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && jmVar.f24477w == 1.0f) {
            if (jmVar.f24478x || ((l4Var = jmVar.f24471b.f27555k) != null && l4Var.hasImageLoaded())) {
                int i10 = jmVar.v + 1;
                jmVar.v = i10;
                jmVar.f24476s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    jmVar.v = 0;
                }
                if (jmVar.f24476s > 6) {
                    jmVar.f24476s = 0;
                }
                q5 q5Var = new q5(4, jmVar.f24475r, tL_emojiList.document_id.get(jmVar.v).longValue());
                jmVar.f24470a = q5Var;
                jmVar.d.setAnimatedEmojiDrawable(q5Var);
                int[] iArr = e9.f23912c0[jmVar.f24476s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                s20 s20Var = new s20();
                jmVar.f24473f = s20Var;
                s20Var.d(i11, i12, i13, i14);
                jmVar.f24477w = 0.0f;
                jmVar.b();
                jmVar.invalidate();
            }
        }
    }
}
