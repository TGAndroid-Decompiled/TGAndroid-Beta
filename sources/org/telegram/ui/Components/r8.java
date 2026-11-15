package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class r8 implements Runnable {
    public final zl f38893a;

    public r8(zl zlVar) {
        this.f38893a = zlVar;
    }

    @Override
    public final void run() {
        fi.u2 u2Var;
        zl zlVar = this.f38893a;
        org.telegram.messenger.g0.i3(zlVar.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = zlVar.f39207n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && zlVar.f39211x == 1.0f) {
            if (zlVar.f39212y || ((u2Var = zlVar.f39203b.f34813k) != null && u2Var.J())) {
                int i7 = zlVar.f39210w + 1;
                zlVar.f39210w = i7;
                zlVar.f39209s++;
                if (i7 > tL_emojiList.document_id.size() - 1) {
                    zlVar.f39210w = 0;
                }
                if (zlVar.f39209s > 6) {
                    zlVar.f39209s = 0;
                }
                g5 g5Var = new g5(4, zlVar.f39208r, tL_emojiList.document_id.get(zlVar.f39210w).longValue());
                zlVar.f39202a = g5Var;
                zlVar.d.setAnimatedEmojiDrawable(g5Var);
                int[] iArr = q8.f38560d0[zlVar.f39209s];
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                i10 i10Var = new i10();
                zlVar.f39206f = i10Var;
                i10Var.d(i10, i11, i12, i13);
                zlVar.f39211x = 0.0f;
                zlVar.b();
                zlVar.invalidate();
            }
        }
    }
}
