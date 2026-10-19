package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final rm f26159a;

    public f9(rm rmVar) {
        this.f26159a = rmVar;
    }

    @Override
    public final void run() {
        ci.g3 g3Var;
        rm rmVar = this.f26159a;
        AndroidUtilities.runOnUIThread(rmVar.f26544y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = rmVar.f26539n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && rmVar.f26542w == 1.0f) {
            if (rmVar.f26543x || ((g3Var = rmVar.f26536b.f29853k) != null && g3Var.hasImageLoaded())) {
                int i10 = rmVar.v + 1;
                rmVar.v = i10;
                rmVar.f26541s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    rmVar.v = 0;
                }
                if (rmVar.f26541s > 6) {
                    rmVar.f26541s = 0;
                }
                r5 r5Var = new r5(4, rmVar.f26540r, tL_emojiList.document_id.get(rmVar.v).longValue());
                rmVar.f26535a = r5Var;
                rmVar.d.setAnimatedEmojiDrawable(r5Var);
                int[] iArr = e9.f25853c0[rmVar.f26541s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                x20 x20Var = new x20();
                rmVar.f26538f = x20Var;
                x20Var.d(i11, i12, i13, i14);
                rmVar.f26542w = 0.0f;
                rmVar.b();
                rmVar.invalidate();
            }
        }
    }
}
