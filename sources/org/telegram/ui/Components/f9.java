package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final rm f26147a;

    public f9(rm rmVar) {
        this.f26147a = rmVar;
    }

    @Override
    public final void run() {
        ci.g3 g3Var;
        rm rmVar = this.f26147a;
        AndroidUtilities.runOnUIThread(rmVar.f26546y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = rmVar.f26541n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && rmVar.f26544w == 1.0f) {
            if (rmVar.f26545x || ((g3Var = rmVar.f26538b.f29841k) != null && g3Var.hasImageLoaded())) {
                int i10 = rmVar.v + 1;
                rmVar.v = i10;
                rmVar.f26543s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    rmVar.v = 0;
                }
                if (rmVar.f26543s > 6) {
                    rmVar.f26543s = 0;
                }
                r5 r5Var = new r5(4, rmVar.f26542r, tL_emojiList.document_id.get(rmVar.v).longValue());
                rmVar.f26537a = r5Var;
                rmVar.d.setAnimatedEmojiDrawable(r5Var);
                int[] iArr = e9.f25843c0[rmVar.f26543s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                x20 x20Var = new x20();
                rmVar.f26540f = x20Var;
                x20Var.d(i11, i12, i13, i14);
                rmVar.f26544w = 0.0f;
                rmVar.b();
                rmVar.invalidate();
            }
        }
    }
}
