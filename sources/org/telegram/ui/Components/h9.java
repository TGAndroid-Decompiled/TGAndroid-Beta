package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Runnable {
    public final sm f28868a;

    public h9(sm smVar) {
        this.f28868a = smVar;
    }

    @Override
    public final void run() {
        di.f3 f3Var;
        sm smVar = this.f28868a;
        AndroidUtilities.runOnUIThread(smVar.f29228y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = smVar.f29223n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && smVar.f29226w == 1.0f) {
            if (smVar.f29227x || ((f3Var = smVar.f29220b.f32852k) != null && f3Var.hasImageLoaded())) {
                int i10 = smVar.v + 1;
                smVar.v = i10;
                smVar.f29225s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    smVar.v = 0;
                }
                if (smVar.f29225s > 6) {
                    smVar.f29225s = 0;
                }
                t5 t5Var = new t5(4, smVar.f29224r, tL_emojiList.document_id.get(smVar.v).longValue());
                smVar.f29219a = t5Var;
                smVar.d.setAnimatedEmojiDrawable(t5Var);
                int[] iArr = g9.f28487c0[smVar.f29225s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                z20 z20Var = new z20();
                smVar.f29222f = z20Var;
                z20Var.d(i11, i12, i13, i14);
                smVar.f29226w = 0.0f;
                smVar.b();
                smVar.invalidate();
            }
        }
    }
}
