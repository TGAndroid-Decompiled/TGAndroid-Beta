package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final dm f30602a;

    public x8(dm dmVar) {
        this.f30602a = dmVar;
    }

    @Override
    public final void run() {
        nh.y2 y2Var;
        dm dmVar = this.f30602a;
        AndroidUtilities.runOnUIThread(dmVar.f30929y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = dmVar.f30924n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && dmVar.f30927w == 1.0f) {
            if (dmVar.f30928x || ((y2Var = dmVar.f30921b.f26569k) != null && y2Var.hasImageLoaded())) {
                int i10 = dmVar.v + 1;
                dmVar.v = i10;
                dmVar.f30926s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    dmVar.v = 0;
                }
                if (dmVar.f30926s > 6) {
                    dmVar.f30926s = 0;
                }
                l5 l5Var = new l5(4, dmVar.f30925r, tL_emojiList.document_id.get(dmVar.v).longValue());
                dmVar.f30920a = l5Var;
                dmVar.d.setAnimatedEmojiDrawable(l5Var);
                int[] iArr = w8.Z[dmVar.f30926s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                p20 p20Var = new p20();
                dmVar.f30923f = p20Var;
                p20Var.d(i11, i12, i13, i14);
                dmVar.f30927w = 0.0f;
                dmVar.b();
                dmVar.invalidate();
            }
        }
    }
}
