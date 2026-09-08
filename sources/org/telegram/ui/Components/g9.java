package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class g9 implements Runnable {
    public final gm f26353a;

    public g9(gm gmVar) {
        this.f26353a = gmVar;
    }

    @Override
    public final void run() {
        bi.y3 y3Var;
        gm gmVar = this.f26353a;
        AndroidUtilities.runOnUIThread(gmVar.f26697y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = gmVar.f26692n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && gmVar.f26695w == 1.0f) {
            if (gmVar.f26696x || ((y3Var = gmVar.f26688b.f29611k) != null && y3Var.hasImageLoaded())) {
                int i10 = gmVar.v + 1;
                gmVar.v = i10;
                gmVar.f26694s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    gmVar.v = 0;
                }
                if (gmVar.f26694s > 6) {
                    gmVar.f26694s = 0;
                }
                q5 q5Var = new q5(4, gmVar.f26693r, tL_emojiList.document_id.get(gmVar.v).longValue());
                gmVar.f26687a = q5Var;
                gmVar.d.setAnimatedEmojiDrawable(q5Var);
                int[] iArr = f9.f25989c0[gmVar.f26694s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                o20 o20Var = new o20();
                gmVar.f26691f = o20Var;
                o20Var.d(i11, i12, i13, i14);
                gmVar.f26695w = 0.0f;
                gmVar.b();
                gmVar.invalidate();
            }
        }
    }
}
