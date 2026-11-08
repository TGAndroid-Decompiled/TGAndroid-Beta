package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final sl f38553a;

    public u8(sl slVar) {
        this.f38553a = slVar;
    }

    @Override
    public final void run() {
        di.z2 z2Var;
        sl slVar = this.f38553a;
        org.telegram.messenger.g0.i3(slVar.D, 1000L);
        TLRPC.TL_emojiList tL_emojiList = slVar.f38941n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && slVar.f38945x == 1.0f) {
            if (slVar.f38946y || ((z2Var = slVar.f38937b.f34541k) != null && z2Var.J())) {
                int i7 = slVar.f38944w + 1;
                slVar.f38944w = i7;
                slVar.f38943s++;
                if (i7 > tL_emojiList.document_id.size() - 1) {
                    slVar.f38944w = 0;
                }
                if (slVar.f38943s > 6) {
                    slVar.f38943s = 0;
                }
                i5 i5Var = new i5(4, slVar.f38942r, tL_emojiList.document_id.get(slVar.f38944w).longValue());
                slVar.f38936a = i5Var;
                slVar.d.setAnimatedEmojiDrawable(i5Var);
                int[] iArr = t8.f38290c0[slVar.f38943s];
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                f10 f10Var = new f10();
                slVar.f38940f = f10Var;
                f10Var.d(i10, i11, i12, i13);
                slVar.f38945x = 0.0f;
                slVar.b();
                slVar.invalidate();
            }
        }
    }
}
