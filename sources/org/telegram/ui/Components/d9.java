package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class d9 implements Runnable {
    public final pm f25623a;

    public d9(pm pmVar) {
        this.f25623a = pmVar;
    }

    @Override
    public final void run() {
        ci.f3 f3Var;
        pm pmVar = this.f25623a;
        AndroidUtilities.runOnUIThread(pmVar.f25994y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = pmVar.f25989n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && pmVar.f25992w == 1.0f) {
            if (pmVar.f25993x || ((f3Var = pmVar.f25986b.f29484k) != null && f3Var.hasImageLoaded())) {
                int i10 = pmVar.v + 1;
                pmVar.v = i10;
                pmVar.f25991s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    pmVar.v = 0;
                }
                if (pmVar.f25991s > 6) {
                    pmVar.f25991s = 0;
                }
                p5 p5Var = new p5(4, pmVar.f25990r, tL_emojiList.document_id.get(pmVar.v).longValue());
                pmVar.f25985a = p5Var;
                pmVar.d.setAnimatedEmojiDrawable(p5Var);
                int[] iArr = c9.f25254c0[pmVar.f25991s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                v20 v20Var = new v20();
                pmVar.f25988f = v20Var;
                v20Var.d(i11, i12, i13, i14);
                pmVar.f25992w = 0.0f;
                pmVar.b();
                pmVar.invalidate();
            }
        }
    }
}
