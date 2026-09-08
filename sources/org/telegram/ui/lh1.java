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
    public final int f38390a;
    public final Object f38391b;
    public final Object f38392c;
    public final Object d;
    public final Object f38393e;
    public final Object f38394f;
    public final Object f38395g;

    public lh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f38390a = i10;
        this.f38391b = obj;
        this.f38392c = obj2;
        this.d = obj3;
        this.f38393e = obj4;
        this.f38394f = obj5;
        this.f38395g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38390a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ji.k((UserInfoActivity) this.f38391b, tL_error, (TLObject) this.f38392c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f38393e, tLObject, (int[]) this.f38394f, (ArrayList) this.f38395g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ji.k(tL_error, (ug.w) this.f38391b, tLObject, (List) this.f38392c, (c5.h) this.d, (ug.w) this.f38393e, (org.telegram.ui.ActionBar.n2) this.f38394f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f38395g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ji.k(tL_error, (Utilities.Callback) this.f38391b, tLObject, (List) this.f38392c, (c5.h) this.d, (Utilities.Callback) this.f38393e, (org.telegram.ui.ActionBar.n2) this.f38394f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f38395g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ji.k(tLObject, (c5.o) this.f38391b, (c5.h) this.f38392c, (bi.f0) this.d, (Activity) this.f38393e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f38394f, (List) this.f38395g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ji.k(tLObject, (c5.o) this.f38391b, (c5.h) this.f38392c, (org.telegram.ui.Components.d80) this.d, (Activity) this.f38393e, (TLRPC.TL_inputStorePaymentStarsGift) this.f38394f, (List) this.f38395g, tL_error, 6));
                return;
        }
    }
}
