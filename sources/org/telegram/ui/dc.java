package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class dc implements Utilities.Callback3 {
    public final ad f33075a;
    public final int f33076b;
    public final View f33077c;

    public dc(ad adVar, int i10, View view) {
        this.f33075a = adVar;
        this.f33076b = i10;
        this.f33077c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        ad adVar = this.f33075a;
        int i10 = adVar.U;
        int i11 = this.f33076b;
        if (i11 == i10) {
            adVar.f32116n = l4.longValue();
            adVar.a1(true);
        } else if (i11 == adVar.f32105c0) {
            adVar.f32128w = l4.longValue();
            adVar.b1();
        } else if (i11 == adVar.f32109f0) {
            if (l4.longValue() == 0) {
                adVar.f32132y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                adVar.f32132y = emojiStatusCollectibleFromGift;
                adVar.f32123s = -1;
                adVar.f32128w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                adVar.f32132y = tL_emojiStatus;
            }
            adVar.b1();
        }
        adVar.X0(true);
        nc ncVar = (nc) this.f33077c;
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
