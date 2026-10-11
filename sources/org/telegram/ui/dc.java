package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class dc implements Utilities.Callback3 {
    public final ad f37006a;
    public final int f37007b;
    public final View f37008c;

    public dc(ad adVar, int i10, View view) {
        this.f37006a = adVar;
        this.f37007b = i10;
        this.f37008c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        ad adVar = this.f37006a;
        int i10 = adVar.U;
        int i11 = this.f37007b;
        if (i11 == i10) {
            adVar.f36055n = l4.longValue();
            adVar.a1(true);
        } else if (i11 == adVar.f36043c0) {
            adVar.f36067w = l4.longValue();
            adVar.b1();
        } else if (i11 == adVar.f36048f0) {
            if (l4.longValue() == 0) {
                adVar.f36071y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                adVar.f36071y = emojiStatusCollectibleFromGift;
                adVar.f36062s = -1;
                adVar.f36067w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                adVar.f36071y = tL_emojiStatus;
            }
            adVar.b1();
        }
        adVar.X0(true);
        nc ncVar = (nc) this.f37008c;
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
