package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final sl f38644a;

    public u8(sl slVar) {
        this.f38644a = slVar;
    }

    @Override
    public final void run() {
        di.z2 z2Var;
        sl slVar = this.f38644a;
        org.telegram.messenger.g0.i3(slVar.D, 1000L);
        TLRPC.TL_emojiList tL_emojiList = slVar.f38997n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && slVar.f39001x == 1.0f) {
            if (slVar.f39002y || ((z2Var = slVar.f38993b.f34568k) != null && z2Var.J())) {
                int i7 = slVar.f39000w + 1;
                slVar.f39000w = i7;
                slVar.f38999s++;
                if (i7 > tL_emojiList.document_id.size() - 1) {
                    slVar.f39000w = 0;
                }
                if (slVar.f38999s > 6) {
                    slVar.f38999s = 0;
                }
                i5 i5Var = new i5(4, slVar.f38998r, tL_emojiList.document_id.get(slVar.f39000w).longValue());
                slVar.f38992a = i5Var;
                slVar.d.setAnimatedEmojiDrawable(i5Var);
                int[] iArr = t8.f38312c0[slVar.f38999s];
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                f10 f10Var = new f10();
                slVar.f38996f = f10Var;
                f10Var.d(i10, i11, i12, i13);
                slVar.f39001x = 0.0f;
                slVar.b();
                slVar.invalidate();
            }
        }
    }
}
