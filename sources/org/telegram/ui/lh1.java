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
public final class lh1 implements RequestDelegate {
    public final int f38364a;
    public final Object f38365b;
    public final Object f38366c;
    public final Object d;
    public final Object f38367e;
    public final Object f38368f;
    public final Object f38369g;

    public lh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f38364a = i10;
        this.f38365b = obj;
        this.f38366c = obj2;
        this.d = obj3;
        this.f38367e = obj4;
        this.f38368f = obj5;
        this.f38369g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38364a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ji.k((UserInfoActivity) this.f38365b, tL_error, (TLObject) this.f38366c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f38367e, tLObject, (int[]) this.f38368f, (ArrayList) this.f38369g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ji.k(tL_error, (ug.w) this.f38365b, tLObject, (List) this.f38366c, (c5.h) this.d, (ug.w) this.f38367e, (org.telegram.ui.ActionBar.n2) this.f38368f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f38369g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ji.k(tL_error, (Utilities.Callback) this.f38365b, tLObject, (List) this.f38366c, (c5.h) this.d, (Utilities.Callback) this.f38367e, (org.telegram.ui.ActionBar.n2) this.f38368f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f38369g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ji.k(tLObject, (c5.o) this.f38365b, (c5.h) this.f38366c, (bi.f0) this.d, (Activity) this.f38367e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f38368f, (List) this.f38369g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ji.k(tLObject, (c5.o) this.f38365b, (c5.h) this.f38366c, (org.telegram.ui.Components.d80) this.d, (Activity) this.f38367e, (TLRPC.TL_inputStorePaymentStarsGift) this.f38368f, (List) this.f38369g, tL_error, 6));
                return;
        }
    }
}
