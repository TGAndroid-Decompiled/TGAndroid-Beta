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
public final class dh1 implements RequestDelegate {
    public final int f33109a;
    public final Object f33110b;
    public final Object f33111c;
    public final Object d;
    public final Object e;
    public final Object f33112f;
    public final Object f33113g;

    public dh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f33109a = i10;
        this.f33110b = obj;
        this.f33111c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f33112f = obj5;
        this.f33113g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33109a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f33110b, tL_error, (TLObject) this.f33111c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, tLObject, (int[]) this.f33112f, (ArrayList) this.f33113g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.v) this.f33110b, tLObject, (List) this.f33111c, (c5.h) this.d, (tg.v) this.e, (org.telegram.ui.ActionBar.m2) this.f33112f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f33113g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f33110b, tLObject, (List) this.f33111c, (c5.h) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.m2) this.f33112f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f33113g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f33110b, (c5.h) this.f33111c, (ai.m0) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f33112f, (List) this.f33113g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f33110b, (c5.h) this.f33111c, (org.telegram.ui.Components.o80) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGift) this.f33112f, (List) this.f33113g, tL_error, 6));
                return;
        }
    }
}
