package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Runnable {
    public final zm f26704a;

    public h9(zm zmVar) {
        this.f26704a = zmVar;
    }

    @Override
    public final void run() {
        ai.m4 m4Var;
        zm zmVar = this.f26704a;
        AndroidUtilities.runOnUIThread(zmVar.f27086y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = zmVar.f27081n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && zmVar.f27084w == 1.0f) {
            if (zmVar.f27085x || ((m4Var = zmVar.f27077b.f30402k) != null && m4Var.hasImageLoaded())) {
                int i10 = zmVar.v + 1;
                zmVar.v = i10;
                zmVar.f27083s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    zmVar.v = 0;
                }
                if (zmVar.f27083s > 6) {
                    zmVar.f27083s = 0;
                }
                s5 s5Var = new s5(4, zmVar.f27082r, tL_emojiList.document_id.get(zmVar.v).longValue());
                zmVar.f27076a = s5Var;
                zmVar.d.setAnimatedEmojiDrawable(s5Var);
                int[] iArr = g9.f26346c0[zmVar.f27083s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                i30 i30Var = new i30();
                zmVar.f27080f = i30Var;
                i30Var.d(i11, i12, i13, i14);
                zmVar.f27084w = 0.0f;
                zmVar.b();
                zmVar.invalidate();
            }
        }
    }
}
