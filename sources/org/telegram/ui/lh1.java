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
    public final int f39707a;
    public final Object f39708b;
    public final Object f39709c;
    public final Object d;
    public final Object f39710e;
    public final Object f39711f;
    public final Object f39712g;

    public lh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f39707a = i10;
        this.f39708b = obj;
        this.f39709c = obj2;
        this.d = obj3;
        this.f39710e = obj4;
        this.f39711f = obj5;
        this.f39712g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39707a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f39708b, tL_error, (TLObject) this.f39709c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f39710e, tLObject, (int[]) this.f39711f, (ArrayList) this.f39712g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.u) this.f39708b, tLObject, (List) this.f39709c, (c5.h) this.d, (tg.u) this.f39710e, (org.telegram.ui.ActionBar.m2) this.f39711f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f39712g, 7));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f39708b, tLObject, (List) this.f39709c, (c5.h) this.d, (Utilities.Callback) this.f39710e, (org.telegram.ui.ActionBar.m2) this.f39711f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f39712g, 8));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f39708b, (c5.h) this.f39709c, (qh.r) this.d, (Activity) this.f39710e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f39711f, (List) this.f39712g, tL_error, 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f39708b, (c5.h) this.f39709c, (org.telegram.ui.Components.f90) this.d, (Activity) this.f39710e, (TLRPC.TL_inputStorePaymentStarsGift) this.f39711f, (List) this.f39712g, tL_error, 10));
                return;
        }
    }
}
