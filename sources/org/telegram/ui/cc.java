package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class cc implements Utilities.Callback3 {
    public final bd f35764a;
    public final int f35765b;
    public final View f35766c;

    public cc(bd bdVar, int i10, View view) {
        this.f35764a = bdVar;
        this.f35765b = i10;
        this.f35766c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z4;
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        bd bdVar = this.f35764a;
        int i10 = bdVar.R;
        int i11 = this.f35765b;
        if (i11 == i10) {
            bdVar.f35437n = l10.longValue();
            bdVar.a1(true);
        } else if (i11 == bdVar.Z) {
            bdVar.f35449w = l10.longValue();
            bdVar.b1();
        } else if (i11 == bdVar.f35425c0) {
            if (l10.longValue() == 0) {
                bdVar.f35451y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                bdVar.f35451y = emojiStatusCollectibleFromGift;
                bdVar.f35444s = -1;
                bdVar.f35449w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                bdVar.f35451y = tL_emojiStatus;
            }
            bdVar.b1();
        }
        bdVar.X0(true);
        oc ocVar = (oc) this.f35766c;
        long longValue = l10.longValue();
        if (tL_starGiftUnique != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        ocVar.c(longValue, z4, true);
        bdVar.Z0(true);
    }
}
