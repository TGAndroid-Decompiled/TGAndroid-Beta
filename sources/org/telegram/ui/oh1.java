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
public final class oh1 implements RequestDelegate {
    public final int f40722a;
    public final Object f40723b;
    public final Object f40724c;
    public final Object d;
    public final Object f40725e;
    public final Object f40726f;
    public final Object f40727g;

    public oh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f40722a = i10;
        this.f40723b = obj;
        this.f40724c = obj2;
        this.d = obj3;
        this.f40725e = obj4;
        this.f40726f = obj5;
        this.f40727g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40722a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f40723b, tL_error, (TLObject) this.f40724c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f40725e, tLObject, (int[]) this.f40726f, (ArrayList) this.f40727g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.u) this.f40723b, tLObject, (List) this.f40724c, (c5.h) this.d, (tg.u) this.f40725e, (org.telegram.ui.ActionBar.m2) this.f40726f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f40727g, 7));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f40723b, tLObject, (List) this.f40724c, (c5.h) this.d, (Utilities.Callback) this.f40725e, (org.telegram.ui.ActionBar.m2) this.f40726f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f40727g, 8));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f40723b, (c5.h) this.f40724c, (qh.r) this.d, (Activity) this.f40725e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f40726f, (List) this.f40727g, tL_error, 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f40723b, (c5.h) this.f40724c, (org.telegram.ui.Components.j90) this.d, (Activity) this.f40725e, (TLRPC.TL_inputStorePaymentStarsGift) this.f40726f, (List) this.f40727g, tL_error, 10));
                return;
        }
    }
}
