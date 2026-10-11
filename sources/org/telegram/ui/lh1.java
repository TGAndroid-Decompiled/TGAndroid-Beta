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
public final class lh1 implements RequestDelegate {
    public final int f39673a;
    public final Object f39674b;
    public final Object f39675c;
    public final Object d;
    public final Object f39676e;
    public final Object f39677f;
    public final Object f39678g;

    public lh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f39673a = i10;
        this.f39674b = obj;
        this.f39675c = obj2;
        this.d = obj3;
        this.f39676e = obj4;
        this.f39677f = obj5;
        this.f39678g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39673a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f39674b, tL_error, (TLObject) this.f39675c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f39676e, tLObject, (int[]) this.f39677f, (ArrayList) this.f39678g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.u) this.f39674b, tLObject, (List) this.f39675c, (c5.h) this.d, (tg.u) this.f39676e, (org.telegram.ui.ActionBar.m2) this.f39677f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f39678g, 7));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f39674b, tLObject, (List) this.f39675c, (c5.h) this.d, (Utilities.Callback) this.f39676e, (org.telegram.ui.ActionBar.m2) this.f39677f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f39678g, 8));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f39674b, (c5.h) this.f39675c, (qh.r) this.d, (Activity) this.f39676e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f39677f, (List) this.f39678g, tL_error, 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f39674b, (c5.h) this.f39675c, (org.telegram.ui.Components.g90) this.d, (Activity) this.f39676e, (TLRPC.TL_inputStorePaymentStarsGift) this.f39677f, (List) this.f39678g, tL_error, 10));
                return;
        }
    }
}
