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
    public final int f36315a;
    public final Object f36316b;
    public final Object f36317c;
    public final Object d;
    public final Object f36318e;
    public final Object f36319f;
    public final Object f36320g;

    public fh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f36315a = i10;
        this.f36316b = obj;
        this.f36317c = obj2;
        this.d = obj3;
        this.f36318e = obj4;
        this.f36319f = obj5;
        this.f36320g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36315a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f36316b, tL_error, (TLObject) this.f36317c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f36318e, tLObject, (int[]) this.f36319f, (ArrayList) this.f36320g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.v) this.f36316b, tLObject, (List) this.f36317c, (c5.h) this.d, (tg.v) this.f36318e, (org.telegram.ui.ActionBar.n2) this.f36319f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f36320g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f36316b, tLObject, (List) this.f36317c, (c5.h) this.d, (Utilities.Callback) this.f36318e, (org.telegram.ui.ActionBar.n2) this.f36319f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f36320g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f36316b, (c5.h) this.f36317c, (ai.m0) this.d, (Activity) this.f36318e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f36319f, (List) this.f36320g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f36316b, (c5.h) this.f36317c, (org.telegram.ui.Components.r80) this.d, (Activity) this.f36318e, (TLRPC.TL_inputStorePaymentStarsGift) this.f36319f, (List) this.f36320g, tL_error, 6));
                return;
        }
    }
}
