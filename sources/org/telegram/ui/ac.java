package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class ac implements Utilities.Callback3 {

    public final xc f36503a;

    public final int f36504b;

    public final View f36505c;

    public ac(xc xcVar, int i10, View view) {
        this.f36503a = xcVar;
        this.f36504b = i10;
        this.f36505c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        xc xcVar = this.f36503a;
        int i10 = xcVar.Q;
        int i11 = this.f36504b;
        if (i11 == i10) {
            xcVar.f44397n = l10.longValue();
            xcVar.a1(true);
        } else if (i11 == xcVar.Y) {
            xcVar.f44408w = l10.longValue();
            xcVar.b1();
        } else if (i11 == xcVar.f44383b0) {
            if (l10.longValue() == 0) {
                xcVar.f44410y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectibleEmojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    tL_emojiStatusCollectibleEmojiStatusCollectibleFromGift.flags |= 1;
                    tL_emojiStatusCollectibleEmojiStatusCollectibleFromGift.until = num.intValue();
                }
                xcVar.f44410y = tL_emojiStatusCollectibleEmojiStatusCollectibleFromGift;
                xcVar.f44404s = -1;
                xcVar.f44408w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                xcVar.f44410y = tL_emojiStatus;
            }
            xcVar.b1();
        }
        xcVar.X0(true);
        ((kc) this.f36505c).c(l10.longValue(), tL_starGiftUnique != null, true);
        xcVar.Z0(true);
    }
}
