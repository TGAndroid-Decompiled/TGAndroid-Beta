package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class gd implements View.OnClickListener {
    public final int f47425a = 1;
    public final int f47426b;
    public final long f47427c;
    public final FrameLayout d;
    public final Object f47428e;

    public gd(int i7, hi.d dVar, org.telegram.ui.ActionBar.u2 u2Var, long j3) {
        this.f47426b = i7;
        this.d = dVar;
        this.f47428e = u2Var;
        this.f47427c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47425a) {
            case 0:
                xd xdVar = (xd) this.d;
                Context context = (Context) this.f47428e;
                if (view.isEnabled()) {
                    hi.d dVar = xdVar.K0;
                    if (!dVar.R) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i7 = this.f47426b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = org.telegram.messenger.np.s1(i7).j1(this.f47427c);
                        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new v7(2, xdVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                hi.d dVar2 = (hi.d) this.d;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f47428e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.f22414b.nextInt();
                int i10 = this.f47426b;
                ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new di.v(i10, dVar2, u2Var, this.f47427c));
                return;
        }
    }

    public gd(xd xdVar, int i7, long j3, Context context) {
        this.d = xdVar;
        this.f47426b = i7;
        this.f47427c = j3;
        this.f47428e = context;
    }
}
