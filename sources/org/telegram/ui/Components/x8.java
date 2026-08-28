package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final xl f34600a;

    public x8(xl xlVar) {
        this.f34600a = xlVar;
    }

    @Override
    public final void run() {
        ih.z2 z2Var;
        xl xlVar = this.f34600a;
        AndroidUtilities.runOnUIThread(xlVar.f34895y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = xlVar.f34890n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && xlVar.f34893w == 1.0f) {
            if (xlVar.f34894x || ((z2Var = xlVar.f34886b.f29951k) != null && z2Var.hasImageLoaded())) {
                int i9 = xlVar.v + 1;
                xlVar.v = i9;
                xlVar.f34892s++;
                if (i9 > tL_emojiList.document_id.size() - 1) {
                    xlVar.v = 0;
                }
                if (xlVar.f34892s > 6) {
                    xlVar.f34892s = 0;
                }
                k5 k5Var = new k5(4, xlVar.f34891r, tL_emojiList.document_id.get(xlVar.v).longValue());
                xlVar.f34885a = k5Var;
                xlVar.d.setAnimatedEmojiDrawable(k5Var);
                int[] iArr = w8.Y[xlVar.f34892s];
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                z10 z10Var = new z10();
                xlVar.f34889f = z10Var;
                z10Var.d(i10, i11, i12, i13);
                xlVar.f34893w = 0.0f;
                xlVar.b();
                xlVar.invalidate();
            }
        }
    }
}
