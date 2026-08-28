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
    public final int f40393a = 1;
    public final int f40394b;
    public final long f40395c;
    public final FrameLayout d;
    public final Object f40396e;

    public md(int i9, kh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j10) {
        this.f40394b = i9;
        this.d = dVar;
        this.f40396e = f3Var;
        this.f40395c = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40393a) {
            case 0:
                fe feVar = (fe) this.d;
                Context context = (Context) this.f40396e;
                if (view.isEnabled()) {
                    kh.d dVar = feVar.P0;
                    if (!dVar.J) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i9 = this.f40394b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i9).getInputPeer(this.f40395c);
                        ConnectionsManager.getInstance(i9).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new rc(1, feVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                kh.d dVar2 = (kh.d) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f40396e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i10 = this.f40394b;
                ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new gh.v(i10, dVar2, f3Var, this.f40395c));
                return;
        }
    }

    public md(fe feVar, int i9, long j10, Context context) {
        this.d = feVar;
        this.f40394b = i9;
        this.f40395c = j10;
        this.f40396e = context;
    }
}
