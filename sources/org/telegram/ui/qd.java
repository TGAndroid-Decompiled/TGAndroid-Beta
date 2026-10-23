package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class qd implements View.OnClickListener {
    public final int f40783a = 1;
    public final int f40784b;
    public final long f40785c;
    public final FrameLayout d;
    public final Object e;

    public qd(int i10, ei.d dVar, org.telegram.ui.ActionBar.h3 h3Var, long j10) {
        this.f40784b = i10;
        this.d = dVar;
        this.e = h3Var;
        this.f40785c = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40783a) {
            case 0:
                ie ieVar = (ie) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    ei.d dVar = ieVar.T0;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f40784b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f40785c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new vc(1, ieVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                ei.d dVar2 = (ei.d) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f40784b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new ai.c0(i11, dVar2, h3Var, this.f40785c));
                return;
        }
    }

    public qd(ie ieVar, int i10, long j10, Context context) {
        this.d = ieVar;
        this.f40784b = i10;
        this.f40785c = j10;
        this.e = context;
    }
}
