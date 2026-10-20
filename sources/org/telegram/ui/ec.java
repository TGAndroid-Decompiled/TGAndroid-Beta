package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ec implements Utilities.Callback3 {
    public final bd f36628a;
    public final int f36629b;
    public final View f36630c;

    public ec(bd bdVar, int i10, View view) {
        this.f36628a = bdVar;
        this.f36629b = i10;
        this.f36630c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        bd bdVar = this.f36628a;
        int i10 = bdVar.U;
        int i11 = this.f36629b;
        if (i11 == i10) {
            bdVar.f35588n = l4.longValue();
            bdVar.a1(true);
        } else if (i11 == bdVar.f35577c0) {
            bdVar.f35600w = l4.longValue();
            bdVar.b1();
        } else if (i11 == bdVar.f35581f0) {
            if (l4.longValue() == 0) {
                bdVar.f35604y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                bdVar.f35604y = emojiStatusCollectibleFromGift;
                bdVar.f35595s = -1;
                bdVar.f35600w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                bdVar.f35604y = tL_emojiStatus;
            }
            bdVar.b1();
        }
        bdVar.X0(true);
        oc ocVar = (oc) this.f36630c;
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
