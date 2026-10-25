package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fc implements Utilities.Callback3 {
    public final bd f39332a;
    public final int f39333b;
    public final View f39334c;

    public fc(bd bdVar, int i10, View view) {
        this.f39332a = bdVar;
        this.f39333b = i10;
        this.f39334c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        bd bdVar = this.f39332a;
        int i10 = bdVar.U;
        int i11 = this.f39333b;
        if (i11 == i10) {
            bdVar.f38048n = l4.longValue();
            bdVar.d1(true);
        } else if (i11 == bdVar.f38037c0) {
            bdVar.f38060w = l4.longValue();
            bdVar.e1();
        } else if (i11 == bdVar.f38041f0) {
            if (l4.longValue() == 0) {
                bdVar.f38064y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                bdVar.f38064y = emojiStatusCollectibleFromGift;
                bdVar.f38055s = -1;
                bdVar.f38060w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                bdVar.f38064y = tL_emojiStatus;
            }
            bdVar.e1();
        }
        bdVar.a1(true);
        pc pcVar = (pc) this.f39334c;
        long longValue = l4.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        pcVar.c(longValue, z10, true);
        bdVar.c1(true);
    }
}
