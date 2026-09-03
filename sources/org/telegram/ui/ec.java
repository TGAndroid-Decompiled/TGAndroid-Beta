package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ec implements Utilities.Callback3 {
    public final dd f33769a;
    public final int f33770b;
    public final View f33771c;

    public ec(dd ddVar, int i10, View view) {
        this.f33769a = ddVar;
        this.f33770b = i10;
        this.f33771c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z4;
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        dd ddVar = this.f33769a;
        int i10 = ddVar.R;
        int i11 = this.f33770b;
        if (i11 == i10) {
            ddVar.f33432n = l10.longValue();
            ddVar.a1(true);
        } else if (i11 == ddVar.Z) {
            ddVar.f33444w = l10.longValue();
            ddVar.b1();
        } else if (i11 == ddVar.f33421c0) {
            if (l10.longValue() == 0) {
                ddVar.f33446y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                ddVar.f33446y = emojiStatusCollectibleFromGift;
                ddVar.f33439s = -1;
                ddVar.f33444w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                ddVar.f33446y = tL_emojiStatus;
            }
            ddVar.b1();
        }
        ddVar.X0(true);
        qc qcVar = (qc) this.f33771c;
        long longValue = l10.longValue();
        if (tL_starGiftUnique != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        qcVar.c(longValue, z4, true);
        ddVar.Z0(true);
    }
}
