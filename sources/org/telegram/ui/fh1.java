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
public final class fh1 implements RequestDelegate {
    public final int f36321a;
    public final Object f36322b;
    public final Object f36323c;
    public final Object d;
    public final Object f36324e;
    public final Object f36325f;
    public final Object f36326g;

    public fh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f36321a = i10;
        this.f36322b = obj;
        this.f36323c = obj2;
        this.d = obj3;
        this.f36324e = obj4;
        this.f36325f = obj5;
        this.f36326g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36321a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f36322b, tL_error, (TLObject) this.f36323c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f36324e, tLObject, (int[]) this.f36325f, (ArrayList) this.f36326g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.v) this.f36322b, tLObject, (List) this.f36323c, (c5.h) this.d, (tg.v) this.f36324e, (org.telegram.ui.ActionBar.n2) this.f36325f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f36326g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f36322b, tLObject, (List) this.f36323c, (c5.h) this.d, (Utilities.Callback) this.f36324e, (org.telegram.ui.ActionBar.n2) this.f36325f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f36326g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f36322b, (c5.h) this.f36323c, (ai.m0) this.d, (Activity) this.f36324e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f36325f, (List) this.f36326g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f36322b, (c5.h) this.f36323c, (org.telegram.ui.Components.r80) this.d, (Activity) this.f36324e, (TLRPC.TL_inputStorePaymentStarsGift) this.f36325f, (List) this.f36326g, tL_error, 6));
                return;
        }
    }
}
