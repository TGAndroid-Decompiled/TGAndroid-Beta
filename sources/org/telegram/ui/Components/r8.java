package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class r8 implements Runnable {
    public final zl f38895a;

    public r8(zl zlVar) {
        this.f38895a = zlVar;
    }

    @Override
    public final void run() {
        fi.u2 u2Var;
        zl zlVar = this.f38895a;
        org.telegram.messenger.g0.i3(zlVar.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = zlVar.f39210n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && zlVar.f39214x == 1.0f) {
            if (zlVar.f39215y || ((u2Var = zlVar.f39206b.f34809k) != null && u2Var.J())) {
                int i7 = zlVar.f39213w + 1;
                zlVar.f39213w = i7;
                zlVar.f39212s++;
                if (i7 > tL_emojiList.document_id.size() - 1) {
                    zlVar.f39213w = 0;
                }
                if (zlVar.f39212s > 6) {
                    zlVar.f39212s = 0;
                }
                g5 g5Var = new g5(4, zlVar.f39211r, tL_emojiList.document_id.get(zlVar.f39213w).longValue());
                zlVar.f39205a = g5Var;
                zlVar.d.setAnimatedEmojiDrawable(g5Var);
                int[] iArr = q8.f38560d0[zlVar.f39212s];
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                i10 i10Var = new i10();
                zlVar.f39209f = i10Var;
                i10Var.d(i10, i11, i12, i13);
                zlVar.f39214x = 0.0f;
                zlVar.b();
                zlVar.invalidate();
            }
        }
    }
}
