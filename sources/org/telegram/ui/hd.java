package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class hd implements View.OnClickListener {
    public final int f46329a = 1;
    public final int f46330b;
    public final long f46331c;
    public final FrameLayout d;
    public final Object f46332e;

    public hd(int i7, fi.d dVar, org.telegram.ui.ActionBar.v2 v2Var, long j3) {
        this.f46330b = i7;
        this.d = dVar;
        this.f46332e = v2Var;
        this.f46331c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46329a) {
            case 0:
                zd zdVar = (zd) this.d;
                Context context = (Context) this.f46332e;
                if (view.isEnabled()) {
                    fi.d dVar = zdVar.J0;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i7 = this.f46330b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = org.telegram.messenger.qp.s1(i7).j1(this.f46331c);
                        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ld(0, zdVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                fi.d dVar2 = (fi.d) this.d;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f46332e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.f21331b.nextInt();
                int i10 = this.f46330b;
                ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new bi.b0(i10, dVar2, v2Var, this.f46331c));
                return;
        }
    }

    public hd(zd zdVar, int i7, long j3, Context context) {
        this.d = zdVar;
        this.f46330b = i7;
        this.f46331c = j3;
        this.f46332e = context;
    }
}
