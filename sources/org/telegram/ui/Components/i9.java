package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class i9 implements Runnable {
    public final um f25913a;

    public i9(um umVar) {
        this.f25913a = umVar;
    }

    @Override
    public final void run() {
        bi.b4 b4Var;
        um umVar = this.f25913a;
        AndroidUtilities.runOnUIThread(umVar.f26268y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = umVar.f26263n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && umVar.f26266w == 1.0f) {
            if (umVar.f26267x || ((b4Var = umVar.f26260b.f29031k) != null && b4Var.hasImageLoaded())) {
                int i10 = umVar.v + 1;
                umVar.v = i10;
                umVar.f26265s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    umVar.v = 0;
                }
                if (umVar.f26265s > 6) {
                    umVar.f26265s = 0;
                }
                s5 s5Var = new s5(4, umVar.f26264r, tL_emojiList.document_id.get(umVar.v).longValue());
                umVar.f26259a = s5Var;
                umVar.d.setAnimatedEmojiDrawable(s5Var);
                int[] iArr = h9.f25562c0[umVar.f26265s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                b30 b30Var = new b30();
                umVar.f26262f = b30Var;
                b30Var.d(i11, i12, i13, i14);
                umVar.f26266w = 0.0f;
                umVar.b();
                umVar.invalidate();
            }
        }
    }
}
