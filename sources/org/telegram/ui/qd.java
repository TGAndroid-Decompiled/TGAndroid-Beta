package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class qd implements View.OnClickListener {
    public final int f40752a = 1;
    public final int f40753b;
    public final long f40754c;
    public final FrameLayout d;
    public final Object e;

    public qd(int i10, vh.d dVar, org.telegram.ui.ActionBar.z2 z2Var, long j10) {
        this.f40753b = i10;
        this.d = dVar;
        this.e = z2Var;
        this.f40754c = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40752a) {
            case 0:
                le leVar = (le) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    vh.d dVar = leVar.J0;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f40753b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = org.telegram.messenger.wp.r1(i10).i1(this.f40754c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ag.k0(14, leVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                vh.d dVar2 = (vh.d) this.d;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.f14520b.nextInt();
                int i11 = this.f40753b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new org.telegram.ui.Components.o2(i11, dVar2, z2Var, this.f40754c));
                return;
        }
    }

    public qd(le leVar, int i10, long j10, Context context) {
        this.d = leVar;
        this.f40753b = i10;
        this.f40754c = j10;
        this.e = context;
    }
}
