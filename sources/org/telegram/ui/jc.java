package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jc implements Utilities.Callback3 {
    public final gd f37011a;
    public final int f37012b;
    public final View f37013c;

    public jc(gd gdVar, int i10, View view) {
        this.f37011a = gdVar;
        this.f37012b = i10;
        this.f37013c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        gd gdVar = this.f37011a;
        int i10 = gdVar.U;
        int i11 = this.f37012b;
        if (i11 == i10) {
            gdVar.f36153n = l4.longValue();
            gdVar.a1(true);
        } else if (i11 == gdVar.f36142c0) {
            gdVar.f36165w = l4.longValue();
            gdVar.b1();
        } else if (i11 == gdVar.f36146f0) {
            if (l4.longValue() == 0) {
                gdVar.f36169y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                gdVar.f36169y = emojiStatusCollectibleFromGift;
                gdVar.f36160s = -1;
                gdVar.f36165w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                gdVar.f36169y = tL_emojiStatus;
            }
            gdVar.b1();
        }
        gdVar.X0(true);
        tc tcVar = (tc) this.f37013c;
        long longValue = l4.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        tcVar.c(longValue, z10, true);
        gdVar.Z0(true);
    }
}
