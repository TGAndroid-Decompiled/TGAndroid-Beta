package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class dc implements Utilities.Callback3 {
    public final ad f33152a;
    public final int f33153b;
    public final View f33154c;

    public dc(ad adVar, int i10, View view) {
        this.f33152a = adVar;
        this.f33153b = i10;
        this.f33154c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        ad adVar = this.f33152a;
        int i10 = adVar.U;
        int i11 = this.f33153b;
        if (i11 == i10) {
            adVar.f32189n = l4.longValue();
            adVar.a1(true);
        } else if (i11 == adVar.f32178c0) {
            adVar.f32201w = l4.longValue();
            adVar.b1();
        } else if (i11 == adVar.f32182f0) {
            if (l4.longValue() == 0) {
                adVar.f32205y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                adVar.f32205y = emojiStatusCollectibleFromGift;
                adVar.f32196s = -1;
                adVar.f32201w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                adVar.f32205y = tL_emojiStatus;
            }
            adVar.b1();
        }
        adVar.X0(true);
        nc ncVar = (nc) this.f33154c;
        long longValue = l4.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ncVar.c(longValue, z10, true);
        adVar.Z0(true);
    }
}
