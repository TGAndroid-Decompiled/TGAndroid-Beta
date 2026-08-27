package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

public final class md implements View.OnClickListener {

    public final int f40442a = 1;

    public final int f40443b;

    public final long f40444c;
    public final FrameLayout d;

    public final Object f40445e;

    public md(int i10, lh.d dVar, org.telegram.ui.ActionBar.e3 e3Var, long j10) {
        this.f40443b = i10;
        this.d = dVar;
        this.f40445e = e3Var;
        this.f40444c = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40442a) {
            case 0:
                fe feVar = (fe) this.d;
                Context context = (Context) this.f40445e;
                if (view.isEnabled()) {
                    lh.d dVar = feVar.P0;
                    if (!dVar.J) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f40443b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f40444c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new cg.g0(28, feVar, context));
                        break;
                    }
                }
                break;
            default:
                lh.d dVar2 = (lh.d) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f40445e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f40443b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new hh.v(i11, dVar2, e3Var, this.f40444c));
                break;
        }
    }

    public md(fe feVar, int i10, long j10, Context context) {
        this.d = feVar;
        this.f40443b = i10;
        this.f40444c = j10;
        this.f40445e = context;
    }
}
