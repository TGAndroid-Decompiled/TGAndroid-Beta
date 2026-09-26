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
    public final int f33124a;
    public final Object f33125b;
    public final Object f33126c;
    public final Object d;
    public final Object e;
    public final Object f33127f;
    public final Object f33128g;

    public dh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f33124a = i10;
        this.f33125b = obj;
        this.f33126c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f33127f = obj5;
        this.f33128g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33124a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f33125b, tL_error, (TLObject) this.f33126c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, tLObject, (int[]) this.f33127f, (ArrayList) this.f33128g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.v) this.f33125b, tLObject, (List) this.f33126c, (c5.h) this.d, (tg.v) this.e, (org.telegram.ui.ActionBar.m2) this.f33127f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f33128g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f33125b, tLObject, (List) this.f33126c, (c5.h) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.m2) this.f33127f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f33128g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f33125b, (c5.h) this.f33126c, (ai.m0) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f33127f, (List) this.f33128g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f33125b, (c5.h) this.f33126c, (org.telegram.ui.Components.o80) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGift) this.f33127f, (List) this.f33128g, tL_error, 6));
                return;
        }
    }
}
