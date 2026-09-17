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
    public final int f35814a;
    public final Object f35815b;
    public final Object f35816c;
    public final Object d;
    public final Object e;
    public final Object f35817f;
    public final Object f35818g;

    public mh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f35814a = i10;
        this.f35815b = obj;
        this.f35816c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f35817f = obj5;
        this.f35818g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35814a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f35815b, tL_error, (TLObject) this.f35816c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, tLObject, (int[]) this.f35817f, (ArrayList) this.f35818g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.w) this.f35815b, tLObject, (List) this.f35816c, (c5.h) this.d, (tg.w) this.e, (org.telegram.ui.ActionBar.o2) this.f35817f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f35818g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f35815b, tLObject, (List) this.f35816c, (c5.h) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.o2) this.f35817f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f35818g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f35815b, (c5.h) this.f35816c, (ai.m0) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f35817f, (List) this.f35818g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f35815b, (c5.h) this.f35816c, (org.telegram.ui.Components.d80) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGift) this.f35817f, (List) this.f35818g, tL_error, 6));
                return;
        }
    }
}
