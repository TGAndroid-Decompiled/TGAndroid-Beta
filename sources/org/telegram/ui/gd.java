package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class gd implements View.OnClickListener {
    public final int f48242a = 1;
    public final int f48243b;
    public final long f48244c;
    public final FrameLayout d;
    public final Object f48245e;

    public gd(int i7, hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, long j3) {
        this.f48243b = i7;
        this.d = eVar;
        this.f48245e = w2Var;
        this.f48244c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48242a) {
            case 0:
                xd xdVar = (xd) this.d;
                Context context = (Context) this.f48245e;
                if (view.isEnabled()) {
                    hi.e eVar = xdVar.K0;
                    if (!eVar.R) {
                        eVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i7 = this.f48243b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = org.telegram.messenger.mp.u1(i7).l1(this.f48244c);
                        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new v7(2, xdVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                hi.e eVar2 = (hi.e) this.d;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f48245e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.f22875b.nextInt();
                int i10 = this.f48243b;
                ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new di.v(i10, eVar2, w2Var, this.f48244c));
                return;
        }
    }

    public gd(xd xdVar, int i7, long j3, Context context) {
        this.d = xdVar;
        this.f48243b = i7;
        this.f48244c = j3;
        this.f48245e = context;
    }
}
