package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class pd implements View.OnClickListener {
    public final int f36488a = 1;
    public final int f36489b;
    public final long f36490c;
    public final FrameLayout d;
    public final Object e;

    public pd(int i10, ci.d dVar, org.telegram.ui.ActionBar.e3 e3Var, long j3) {
        this.f36489b = i10;
        this.d = dVar;
        this.e = e3Var;
        this.f36490c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36488a) {
            case 0:
                je jeVar = (je) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    ci.d dVar = jeVar.T0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f36489b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f36490c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ai.v1(24, jeVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                ci.d dVar2 = (ci.d) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f36489b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new ai.k8(i11, dVar2, e3Var, this.f36490c));
                return;
        }
    }

    public pd(je jeVar, int i10, long j3, Context context) {
        this.d = jeVar;
        this.f36489b = i10;
        this.f36490c = j3;
        this.e = context;
    }
}
