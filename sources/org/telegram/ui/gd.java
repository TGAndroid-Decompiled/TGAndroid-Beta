package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class gd implements View.OnClickListener {
    public final int f47415a = 1;
    public final int f47416b;
    public final long f47417c;
    public final FrameLayout d;
    public final Object f47418e;

    public gd(int i7, hi.d dVar, org.telegram.ui.ActionBar.u2 u2Var, long j3) {
        this.f47416b = i7;
        this.d = dVar;
        this.f47418e = u2Var;
        this.f47417c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47415a) {
            case 0:
                xd xdVar = (xd) this.d;
                Context context = (Context) this.f47418e;
                if (view.isEnabled()) {
                    hi.d dVar = xdVar.K0;
                    if (!dVar.R) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i7 = this.f47416b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = org.telegram.messenger.np.s1(i7).j1(this.f47417c);
                        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new v7(2, xdVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                hi.d dVar2 = (hi.d) this.d;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f47418e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.f22414b.nextInt();
                int i10 = this.f47416b;
                ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new di.v(i10, dVar2, u2Var, this.f47417c));
                return;
        }
    }

    public gd(xd xdVar, int i7, long j3, Context context) {
        this.d = xdVar;
        this.f47416b = i7;
        this.f47417c = j3;
        this.f47418e = context;
    }
}
