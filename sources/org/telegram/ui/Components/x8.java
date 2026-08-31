package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final em f32975a;

    public x8(em emVar) {
        this.f32975a = emVar;
    }

    @Override
    public final void run() {
        oh.z2 z2Var;
        em emVar = this.f32975a;
        AndroidUtilities.runOnUIThread(emVar.f33403y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = emVar.f33398n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && emVar.f33401w == 1.0f) {
            if (emVar.f33402x || ((z2Var = emVar.f33394b.f28604k) != null && z2Var.hasImageLoaded())) {
                int i10 = emVar.v + 1;
                emVar.v = i10;
                emVar.f33400s++;
                if (i10 > tL_emojiList.document_id.size() - 1) {
                    emVar.v = 0;
                }
                if (emVar.f33400s > 6) {
                    emVar.f33400s = 0;
                }
                l5 l5Var = new l5(4, emVar.f33399r, tL_emojiList.document_id.get(emVar.v).longValue());
                emVar.f33393a = l5Var;
                emVar.d.setAnimatedEmojiDrawable(l5Var);
                int[] iArr = w8.Z[emVar.f33400s];
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                q20 q20Var = new q20();
                emVar.f33397f = q20Var;
                q20Var.d(i11, i12, i13, i14);
                emVar.f33401w = 0.0f;
                emVar.b();
                emVar.invalidate();
            }
        }
    }
}
