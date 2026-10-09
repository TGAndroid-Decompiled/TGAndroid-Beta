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
    public final int f41084a = 1;
    public final int f41085b;
    public final long f41086c;
    public final FrameLayout d;
    public final Object f41087e;

    public qd(int i10, ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j3) {
        this.f41085b = i10;
        this.d = dVar;
        this.f41087e = f3Var;
        this.f41086c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41084a) {
            case 0:
                ke keVar = (ke) this.d;
                Context context = (Context) this.f41087e;
                if (view.isEnabled()) {
                    ci.d dVar = keVar.T0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f41085b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f41086c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ai.v1(24, keVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                ci.d dVar2 = (ci.d) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f41087e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f41085b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new ai.l8(i11, dVar2, f3Var, this.f41086c));
                return;
        }
    }

    public qd(ke keVar, int i10, long j3, Context context) {
        this.d = keVar;
        this.f41085b = i10;
        this.f41086c = j3;
        this.f41087e = context;
    }
}
