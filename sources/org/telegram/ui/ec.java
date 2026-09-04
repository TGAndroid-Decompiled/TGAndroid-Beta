package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ec implements Utilities.Callback3 {
    public final bd f35995a;
    public final int f35996b;
    public final View f35997c;

    public ec(bd bdVar, int i10, View view) {
        this.f35995a = bdVar;
        this.f35996b = i10;
        this.f35997c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        bd bdVar = this.f35995a;
        int i10 = bdVar.U;
        int i11 = this.f35996b;
        if (i11 == i10) {
            bdVar.f34751n = l4.longValue();
            bdVar.a1(true);
        } else if (i11 == bdVar.f34739c0) {
            bdVar.f34763w = l4.longValue();
            bdVar.b1();
        } else if (i11 == bdVar.f34744f0) {
            if (l4.longValue() == 0) {
                bdVar.f34767y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                bdVar.f34767y = emojiStatusCollectibleFromGift;
                bdVar.f34758s = -1;
                bdVar.f34763w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                bdVar.f34767y = tL_emojiStatus;
            }
            bdVar.b1();
        }
        bdVar.X0(true);
        pc pcVar = (pc) this.f35997c;
        long longValue = l4.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        pcVar.c(longValue, z10, true);
        bdVar.Z0(true);
    }
}
