package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final mm f22631a;

    public e9(mm mmVar) {
        this.f22631a = mmVar;
    }

    @Override
    public final void run() {
        gg.h1 h1Var;
        mm mmVar = this.f22631a;
        AndroidUtilities.runOnUIThread(mmVar.f22946y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = mmVar.f22941n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && mmVar.f22944w == 1.0f) {
            if (mmVar.f22945x || ((h1Var = mmVar.f22938b.f26033k) != null && h1Var.hasImageLoaded())) {
                int i10 = mmVar.v + 1;
                mmVar.v = i10;
                mmVar.f22943s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    mmVar.v = 0;
                }
                if (mmVar.f22943s > 6) {
                    mmVar.f22943s = 0;
                }
                p5 p5Var = new p5(4, mmVar.f22942r, tL_emojiList.document_id.get(mmVar.v).longValue());
                mmVar.f22937a = p5Var;
                mmVar.d.setAnimatedEmojiDrawable(p5Var);
                int[] iArr = d9.f22323c0[mmVar.f22943s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                x20 x20Var = new x20();
                mmVar.f22940f = x20Var;
                x20Var.d(i11, i12, i13, i14);
                mmVar.f22944w = 0.0f;
                mmVar.b();
                mmVar.invalidate();
            }
        }
    }
}
