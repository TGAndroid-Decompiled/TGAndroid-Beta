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
    public final int f35759a;
    public final Object f35760b;
    public final Object f35761c;
    public final Object d;
    public final Object e;
    public final Object f35762f;
    public final Object f35763g;

    public mh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f35759a = i10;
        this.f35760b = obj;
        this.f35761c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f35762f = obj5;
        this.f35763g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35759a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f35760b, tL_error, (TLObject) this.f35761c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, tLObject, (int[]) this.f35762f, (ArrayList) this.f35763g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.v) this.f35760b, tLObject, (List) this.f35761c, (c5.h) this.d, (tg.v) this.e, (org.telegram.ui.ActionBar.n2) this.f35762f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f35763g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f35760b, tLObject, (List) this.f35761c, (c5.h) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.n2) this.f35762f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f35763g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.n) this.f35760b, (c5.h) this.f35761c, (ai.m0) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f35762f, (List) this.f35763g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.n) this.f35760b, (c5.h) this.f35761c, (org.telegram.ui.Components.o80) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGift) this.f35762f, (List) this.f35763g, tL_error, 6));
                return;
        }
    }
}
