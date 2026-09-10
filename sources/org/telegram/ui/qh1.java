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
public final class qh1 implements RequestDelegate {
    public final int f36065a;
    public final Object f36066b;
    public final Object f36067c;
    public final Object d;
    public final Object e;
    public final Object f36068f;
    public final Object f36069g;

    public qh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f36065a = i10;
        this.f36066b = obj;
        this.f36067c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f36068f = obj5;
        this.f36069g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36065a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hi.l((UserInfoActivity) this.f36066b, tL_error, (TLObject) this.f36067c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, tLObject, (int[]) this.f36068f, (ArrayList) this.f36069g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hi.l(tL_error, (sg.v) this.f36066b, tLObject, (List) this.f36067c, (c5.h) this.d, (sg.v) this.e, (org.telegram.ui.ActionBar.p2) this.f36068f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f36069g, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new hi.l(tL_error, (Utilities.Callback) this.f36066b, tLObject, (List) this.f36067c, (c5.h) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.p2) this.f36068f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f36069g, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new hi.l(tLObject, (c5.o) this.f36066b, (c5.h) this.f36067c, (bi.k6) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f36068f, (List) this.f36069g, tL_error, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new hi.l(tLObject, (c5.o) this.f36066b, (c5.h) this.f36067c, (org.telegram.ui.Components.n80) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGift) this.f36068f, (List) this.f36069g, tL_error, 6));
                return;
        }
    }
}
