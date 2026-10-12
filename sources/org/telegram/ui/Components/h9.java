package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Runnable {
    public final zm f26700a;

    public h9(zm zmVar) {
        this.f26700a = zmVar;
    }

    @Override
    public final void run() {
        ai.m4 m4Var;
        zm zmVar = this.f26700a;
        AndroidUtilities.runOnUIThread(zmVar.f27101y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = zmVar.f27096n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && zmVar.f27099w == 1.0f) {
            if (zmVar.f27100x || ((m4Var = zmVar.f27092b.f30406k) != null && m4Var.hasImageLoaded())) {
                int i10 = zmVar.v + 1;
                zmVar.v = i10;
                zmVar.f27098s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    zmVar.v = 0;
                }
                if (zmVar.f27098s > 6) {
                    zmVar.f27098s = 0;
                }
                s5 s5Var = new s5(4, zmVar.f27097r, tL_emojiList.document_id.get(zmVar.v).longValue());
                zmVar.f27091a = s5Var;
                zmVar.d.setAnimatedEmojiDrawable(s5Var);
                int[] iArr = g9.f26348c0[zmVar.f27098s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                i30 i30Var = new i30();
                zmVar.f27095f = i30Var;
                i30Var.d(i11, i12, i13, i14);
                zmVar.f27099w = 0.0f;
                zmVar.b();
                zmVar.invalidate();
            }
        }
    }
}
