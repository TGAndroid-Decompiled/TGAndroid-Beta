package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class gc implements Utilities.Callback3 {
    public final dd f37183a;
    public final int f37184b;
    public final View f37185c;

    public gc(dd ddVar, int i10, View view) {
        this.f37183a = ddVar;
        this.f37184b = i10;
        this.f37185c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        dd ddVar = this.f37183a;
        int i10 = ddVar.U;
        int i11 = this.f37184b;
        if (i11 == i10) {
            ddVar.f36173n = l4.longValue();
            ddVar.a1(true);
        } else if (i11 == ddVar.f36162c0) {
            ddVar.f36185w = l4.longValue();
            ddVar.b1();
        } else if (i11 == ddVar.f36166f0) {
            if (l4.longValue() == 0) {
                ddVar.f36189y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                ddVar.f36189y = emojiStatusCollectibleFromGift;
                ddVar.f36180s = -1;
                ddVar.f36185w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                ddVar.f36189y = tL_emojiStatus;
            }
            ddVar.b1();
        }
        ddVar.X0(true);
        qc qcVar = (qc) this.f37185c;
        long longValue = l4.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        qcVar.c(longValue, z10, true);
        ddVar.Z0(true);
    }
}
