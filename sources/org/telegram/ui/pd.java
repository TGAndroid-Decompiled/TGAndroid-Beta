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
    public final int f40861a = 1;
    public final int f40862b;
    public final long f40863c;
    public final FrameLayout d;
    public final Object f40864e;

    public pd(int i10, ci.d dVar, org.telegram.ui.ActionBar.e3 e3Var, long j3) {
        this.f40862b = i10;
        this.d = dVar;
        this.f40864e = e3Var;
        this.f40863c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40861a) {
            case 0:
                je jeVar = (je) this.d;
                Context context = (Context) this.f40864e;
                if (view.isEnabled()) {
                    ci.d dVar = jeVar.T0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f40862b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f40863c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ai.v1(24, jeVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                ci.d dVar2 = (ci.d) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f40864e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f40862b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new ai.l8(i11, dVar2, e3Var, this.f40863c));
                return;
        }
    }

    public pd(je jeVar, int i10, long j3, Context context) {
        this.d = jeVar;
        this.f40862b = i10;
        this.f40863c = j3;
        this.f40864e = context;
    }
}
