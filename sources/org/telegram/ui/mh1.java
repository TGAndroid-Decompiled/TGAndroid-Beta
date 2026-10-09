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
    public final int f39921a;
    public final Object f39922b;
    public final Object f39923c;
    public final Object d;
    public final Object f39924e;
    public final Object f39925f;
    public final Object f39926g;

    public mh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f39921a = i10;
        this.f39922b = obj;
        this.f39923c = obj2;
        this.d = obj3;
        this.f39924e = obj4;
        this.f39925f = obj5;
        this.f39926g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39921a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f39922b, tL_error, (TLObject) this.f39923c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f39924e, tLObject, (int[]) this.f39925f, (ArrayList) this.f39926g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.v) this.f39922b, tLObject, (List) this.f39923c, (c5.h) this.d, (tg.v) this.f39924e, (org.telegram.ui.ActionBar.n2) this.f39925f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f39926g, 7));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f39922b, tLObject, (List) this.f39923c, (c5.h) this.d, (Utilities.Callback) this.f39924e, (org.telegram.ui.ActionBar.n2) this.f39925f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f39926g, 8));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f39922b, (c5.h) this.f39923c, (qh.r) this.d, (Activity) this.f39924e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f39925f, (List) this.f39926g, tL_error, 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f39922b, (c5.h) this.f39923c, (org.telegram.ui.Components.f90) this.d, (Activity) this.f39924e, (TLRPC.TL_inputStorePaymentStarsGift) this.f39925f, (List) this.f39926g, tL_error, 10));
                return;
        }
    }
}
