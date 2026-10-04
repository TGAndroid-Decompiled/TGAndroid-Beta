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
    public final int f36316a;
    public final Object f36317b;
    public final Object f36318c;
    public final Object d;
    public final Object f36319e;
    public final Object f36320f;
    public final Object f36321g;

    public fh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f36316a = i10;
        this.f36317b = obj;
        this.f36318c = obj2;
        this.d = obj3;
        this.f36319e = obj4;
        this.f36320f = obj5;
        this.f36321g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36316a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f36317b, tL_error, (TLObject) this.f36318c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f36319e, tLObject, (int[]) this.f36320f, (ArrayList) this.f36321g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.v) this.f36317b, tLObject, (List) this.f36318c, (c5.h) this.d, (tg.v) this.f36319e, (org.telegram.ui.ActionBar.n2) this.f36320f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f36321g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f36317b, tLObject, (List) this.f36318c, (c5.h) this.d, (Utilities.Callback) this.f36319e, (org.telegram.ui.ActionBar.n2) this.f36320f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f36321g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f36317b, (c5.h) this.f36318c, (ai.m0) this.d, (Activity) this.f36319e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f36320f, (List) this.f36321g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f36317b, (c5.h) this.f36318c, (org.telegram.ui.Components.r80) this.d, (Activity) this.f36319e, (TLRPC.TL_inputStorePaymentStarsGift) this.f36320f, (List) this.f36321g, tL_error, 6));
                return;
        }
    }
}
