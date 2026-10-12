package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class kc implements Utilities.Callback3 {
    public final hd f37620a;
    public final int f37621b;
    public final View f37622c;

    public kc(hd hdVar, int i10, View view) {
        this.f37620a = hdVar;
        this.f37621b = i10;
        this.f37622c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        hd hdVar = this.f37620a;
        int i10 = hdVar.U;
        int i11 = this.f37621b;
        if (i11 == i10) {
            hdVar.f36740n = l4.longValue();
            hdVar.a1(true);
        } else if (i11 == hdVar.f36729c0) {
            hdVar.f36752w = l4.longValue();
            hdVar.b1();
        } else if (i11 == hdVar.f36733f0) {
            if (l4.longValue() == 0) {
                hdVar.f36756y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                hdVar.f36756y = emojiStatusCollectibleFromGift;
                hdVar.f36747s = -1;
                hdVar.f36752w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                hdVar.f36756y = tL_emojiStatus;
            }
            hdVar.b1();
        }
        hdVar.X0(true);
        uc ucVar = (uc) this.f37622c;
        long longValue = l4.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ucVar.c(longValue, z10, true);
        hdVar.Z0(true);
    }
}
