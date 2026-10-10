package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ec implements Utilities.Callback3 {
    public final bd f37262a;
    public final int f37263b;
    public final View f37264c;

    public ec(bd bdVar, int i10, View view) {
        this.f37262a = bdVar;
        this.f37263b = i10;
        this.f37264c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        bd bdVar = this.f37262a;
        int i10 = bdVar.U;
        int i11 = this.f37263b;
        if (i11 == i10) {
            bdVar.f36308n = l4.longValue();
            bdVar.a1(true);
        } else if (i11 == bdVar.f36296c0) {
            bdVar.f36320w = l4.longValue();
            bdVar.b1();
        } else if (i11 == bdVar.f36301f0) {
            if (l4.longValue() == 0) {
                bdVar.f36324y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                bdVar.f36324y = emojiStatusCollectibleFromGift;
                bdVar.f36315s = -1;
                bdVar.f36320w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                bdVar.f36324y = tL_emojiStatus;
            }
            bdVar.b1();
        }
        bdVar.X0(true);
        oc ocVar = (oc) this.f37264c;
        long longValue = l4.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ocVar.c(longValue, z10, true);
        bdVar.Z0(true);
    }
}
