package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final cm f30532a;

    public x8(cm cmVar) {
        this.f30532a = cmVar;
    }

    @Override
    public final void run() {
        nh.y2 y2Var;
        cm cmVar = this.f30532a;
        AndroidUtilities.runOnUIThread(cmVar.f30943y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = cmVar.f30938n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && cmVar.f30941w == 1.0f) {
            if (cmVar.f30942x || ((y2Var = cmVar.f30935b.f26587k) != null && y2Var.hasImageLoaded())) {
                int i10 = cmVar.v + 1;
                cmVar.v = i10;
                cmVar.f30940s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    cmVar.v = 0;
                }
                if (cmVar.f30940s > 6) {
                    cmVar.f30940s = 0;
                }
                l5 l5Var = new l5(4, cmVar.f30939r, tL_emojiList.document_id.get(cmVar.v).longValue());
                cmVar.f30934a = l5Var;
                cmVar.d.setAnimatedEmojiDrawable(l5Var);
                int[] iArr = w8.Z[cmVar.f30940s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                q20 q20Var = new q20();
                cmVar.f30937f = q20Var;
                q20Var.d(i11, i12, i13, i14);
                cmVar.f30941w = 0.0f;
                cmVar.b();
                cmVar.invalidate();
            }
        }
    }
}
