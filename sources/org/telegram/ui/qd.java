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
    public final int f36884a = 1;
    public final int f36885b;
    public final long f36886c;
    public final FrameLayout d;
    public final Object e;

    public qd(int i10, ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j3) {
        this.f36885b = i10;
        this.d = dVar;
        this.e = f3Var;
        this.f36886c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36884a) {
            case 0:
                ke keVar = (ke) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    ci.d dVar = keVar.T0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f36885b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f36886c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ai.v1(24, keVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                ci.d dVar2 = (ci.d) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f36885b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new ai.j8(i11, dVar2, f3Var, this.f36886c));
                return;
        }
    }

    public qd(ke keVar, int i10, long j3, Context context) {
        this.d = keVar;
        this.f36885b = i10;
        this.f36886c = j3;
        this.e = context;
    }
}
