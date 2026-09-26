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
    public final int f33123a;
    public final Object f33124b;
    public final Object f33125c;
    public final Object d;
    public final Object e;
    public final Object f33126f;
    public final Object f33127g;

    public dh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f33123a = i10;
        this.f33124b = obj;
        this.f33125c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f33126f = obj5;
        this.f33127g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33123a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f33124b, tL_error, (TLObject) this.f33125c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, tLObject, (int[]) this.f33126f, (ArrayList) this.f33127g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.v) this.f33124b, tLObject, (List) this.f33125c, (c5.h) this.d, (tg.v) this.e, (org.telegram.ui.ActionBar.m2) this.f33126f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f33127g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f33124b, tLObject, (List) this.f33125c, (c5.h) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.m2) this.f33126f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f33127g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f33124b, (c5.h) this.f33125c, (ai.m0) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f33126f, (List) this.f33127g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f33124b, (c5.h) this.f33125c, (org.telegram.ui.Components.p80) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGift) this.f33126f, (List) this.f33127g, tL_error, 6));
                return;
        }
    }
}
