package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class hc implements Utilities.Callback3 {
    public final fd f38323a;
    public final int f38324b;
    public final View f38325c;

    public hc(fd fdVar, int i10, View view) {
        this.f38323a = fdVar;
        this.f38324b = i10;
        this.f38325c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        fd fdVar = this.f38323a;
        int i10 = fdVar.U;
        int i11 = this.f38324b;
        if (i11 == i10) {
            fdVar.f37737n = l4.longValue();
            fdVar.a1(true);
        } else if (i11 == fdVar.f37725c0) {
            fdVar.f37749w = l4.longValue();
            fdVar.b1();
        } else if (i11 == fdVar.f37730f0) {
            if (l4.longValue() == 0) {
                fdVar.f37753y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                fdVar.f37753y = emojiStatusCollectibleFromGift;
                fdVar.f37744s = -1;
                fdVar.f37749w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                fdVar.f37753y = tL_emojiStatus;
            }
            fdVar.b1();
        }
        fdVar.X0(true);
        sc scVar = (sc) this.f38325c;
        long longValue = l4.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        scVar.c(longValue, z10, true);
        fdVar.Z0(true);
    }
}
