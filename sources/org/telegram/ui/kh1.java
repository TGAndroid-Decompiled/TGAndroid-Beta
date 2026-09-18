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
public final class kh1 implements RequestDelegate {
    public final int f35106a;
    public final Object f35107b;
    public final Object f35108c;
    public final Object d;
    public final Object e;
    public final Object f35109f;
    public final Object f35110g;

    public kh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f35106a = i10;
        this.f35107b = obj;
        this.f35108c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f35109f = obj5;
        this.f35110g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35106a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f35107b, tL_error, (TLObject) this.f35108c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, tLObject, (int[]) this.f35109f, (ArrayList) this.f35110g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.v) this.f35107b, tLObject, (List) this.f35108c, (c5.h) this.d, (tg.v) this.e, (org.telegram.ui.ActionBar.n2) this.f35109f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f35110g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f35107b, tLObject, (List) this.f35108c, (c5.h) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.n2) this.f35109f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f35110g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f35107b, (c5.h) this.f35108c, (ai.m0) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f35109f, (List) this.f35110g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f35107b, (c5.h) this.f35108c, (org.telegram.ui.Components.m80) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGift) this.f35109f, (List) this.f35110g, tL_error, 6));
                return;
        }
    }
}
