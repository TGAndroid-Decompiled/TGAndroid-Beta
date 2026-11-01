package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bc implements org.telegram.messenger.m20 {
    public final zc f36024a;
    public final int f36025b;
    public final View f36026c;

    public bc(zc zcVar, int i10, View view) {
        this.f36024a = zcVar;
        this.f36025b = i10;
        this.f36026c = view;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        zc zcVar = this.f36024a;
        int i10 = zcVar.U;
        int i11 = this.f36025b;
        if (i11 == i10) {
            zcVar.f43905n = l4.longValue();
            zcVar.h1(true);
        } else if (i11 == zcVar.f43894c0) {
            zcVar.f43919x = l4.longValue();
            zcVar.i1();
        } else if (i11 == zcVar.f43898f0) {
            if (l4.longValue() == 0) {
                zcVar.D = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible q02 = org.telegram.messenger.wp.q0(tL_starGiftUnique);
                if (num != null) {
                    q02.flags |= 1;
                    q02.until = num.intValue();
                }
                zcVar.D = q02;
                zcVar.f43912s = -1;
                zcVar.f43919x = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                zcVar.D = tL_emojiStatus;
            }
            zcVar.i1();
        }
        zcVar.e1(true);
        mc mcVar = (mc) this.f36026c;
        long longValue = l4.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        mcVar.c(longValue, z10, true);
        zcVar.g1(true);
    }
}
