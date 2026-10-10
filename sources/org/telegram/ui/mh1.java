package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class mh1 implements RequestDelegate {
    public final int f39965a;
    public final Object f39966b;
    public final Object f39967c;
    public final Object d;
    public final Object f39968e;
    public final Object f39969f;
    public final Object f39970g;

    public mh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f39965a = i10;
        this.f39966b = obj;
        this.f39967c = obj2;
        this.d = obj3;
        this.f39968e = obj4;
        this.f39969f = obj5;
        this.f39970g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39965a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f39966b, tL_error, (TLObject) this.f39967c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f39968e, tLObject, (int[]) this.f39969f, (ArrayList) this.f39970g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.v) this.f39966b, tLObject, (List) this.f39967c, (c5.h) this.d, (tg.v) this.f39968e, (org.telegram.ui.ActionBar.n2) this.f39969f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f39970g, 7));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f39966b, tLObject, (List) this.f39967c, (c5.h) this.d, (Utilities.Callback) this.f39968e, (org.telegram.ui.ActionBar.n2) this.f39969f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f39970g, 8));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f39966b, (c5.h) this.f39967c, (qh.r) this.d, (Activity) this.f39968e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f39969f, (List) this.f39970g, tL_error, 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f39966b, (c5.h) this.f39967c, (org.telegram.ui.Components.g90) this.d, (Activity) this.f39968e, (TLRPC.TL_inputStorePaymentStarsGift) this.f39969f, (List) this.f39970g, tL_error, 10));
                return;
        }
    }
}
