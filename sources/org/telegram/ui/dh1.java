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
    public final int f35817a;
    public final Object f35818b;
    public final Object f35819c;
    public final Object d;
    public final Object f35820e;
    public final Object f35821f;
    public final Object f35822g;

    public dh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f35817a = i10;
        this.f35818b = obj;
        this.f35819c = obj2;
        this.d = obj3;
        this.f35820e = obj4;
        this.f35821f = obj5;
        this.f35822g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35817a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f35818b, tL_error, (TLObject) this.f35819c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f35820e, tLObject, (int[]) this.f35821f, (ArrayList) this.f35822g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.v) this.f35818b, tLObject, (List) this.f35819c, (c5.h) this.d, (tg.v) this.f35820e, (org.telegram.ui.ActionBar.n2) this.f35821f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f35822g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f35818b, tLObject, (List) this.f35819c, (c5.h) this.d, (Utilities.Callback) this.f35820e, (org.telegram.ui.ActionBar.n2) this.f35821f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f35822g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f35818b, (c5.h) this.f35819c, (ai.m0) this.d, (Activity) this.f35820e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f35821f, (List) this.f35822g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f35818b, (c5.h) this.f35819c, (org.telegram.ui.Components.r80) this.d, (Activity) this.f35820e, (TLRPC.TL_inputStorePaymentStarsGift) this.f35821f, (List) this.f35822g, tL_error, 6));
                return;
        }
    }
}
