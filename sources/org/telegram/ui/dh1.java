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
    public final int f32663a;
    public final Object f32664b;
    public final Object f32665c;
    public final Object d;
    public final Object e;
    public final Object f32666f;
    public final Object f32667g;

    public dh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f32663a = i10;
        this.f32664b = obj;
        this.f32665c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f32666f = obj5;
        this.f32667g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32663a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f32664b, tL_error, (TLObject) this.f32665c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, tLObject, (int[]) this.f32666f, (ArrayList) this.f32667g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.w) this.f32664b, tLObject, (List) this.f32665c, (c5.h) this.d, (tg.w) this.e, (org.telegram.ui.ActionBar.n2) this.f32666f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f32667g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f32664b, tLObject, (List) this.f32665c, (c5.h) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.n2) this.f32666f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f32667g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f32664b, (c5.h) this.f32665c, (ai.m0) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f32666f, (List) this.f32667g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f32664b, (c5.h) this.f32665c, (org.telegram.ui.Components.e80) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGift) this.f32666f, (List) this.f32667g, tL_error, 6));
                return;
        }
    }
}
