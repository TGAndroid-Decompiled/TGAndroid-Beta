package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class c9 implements Runnable {
    public final bm f27379a;

    public c9(bm bmVar) {
        this.f27379a = bmVar;
    }

    @Override
    public final void run() {
        lh.x2 x2Var;
        bm bmVar = this.f27379a;
        AndroidUtilities.runOnUIThread(bmVar.f27716y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = bmVar.f27711n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && bmVar.f27714w == 1.0f) {
            if (bmVar.f27715x || ((x2Var = bmVar.f27707b.f31593k) != null && x2Var.hasImageLoaded())) {
                int i10 = bmVar.v + 1;
                bmVar.v = i10;
                bmVar.f27713s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    bmVar.v = 0;
                }
                if (bmVar.f27713s > 6) {
                    bmVar.f27713s = 0;
                }
                p5 p5Var = new p5(4, bmVar.f27712r, tL_emojiList.document_id.get(bmVar.v).longValue());
                bmVar.f27706a = p5Var;
                bmVar.d.setAnimatedEmojiDrawable(p5Var);
                int[] iArr = b9.Y[bmVar.f27713s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                k20 k20Var = new k20();
                bmVar.f27710f = k20Var;
                k20Var.d(i11, i12, i13, i14);
                bmVar.f27714w = 0.0f;
                bmVar.b();
                bmVar.invalidate();
            }
        }
    }
}
