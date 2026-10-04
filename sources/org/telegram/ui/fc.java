package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fc implements Utilities.Callback3 {
    public final cd f36268a;
    public final int f36269b;
    public final View f36270c;

    public fc(cd cdVar, int i10, View view) {
        this.f36268a = cdVar;
        this.f36269b = i10;
        this.f36270c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        cd cdVar = this.f36268a;
        int i10 = cdVar.U;
        int i11 = this.f36269b;
        if (i11 == i10) {
            cdVar.f35431n = l4.longValue();
            cdVar.a1(true);
        } else if (i11 == cdVar.f35419c0) {
            cdVar.f35443w = l4.longValue();
            cdVar.b1();
        } else if (i11 == cdVar.f35424f0) {
            if (l4.longValue() == 0) {
                cdVar.f35447y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                cdVar.f35447y = emojiStatusCollectibleFromGift;
                cdVar.f35438s = -1;
                cdVar.f35443w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                cdVar.f35447y = tL_emojiStatus;
            }
            cdVar.b1();
        }
        cdVar.X0(true);
        pc pcVar = (pc) this.f36270c;
        long longValue = l4.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        pcVar.c(longValue, z10, true);
        cdVar.Z0(true);
    }
}
