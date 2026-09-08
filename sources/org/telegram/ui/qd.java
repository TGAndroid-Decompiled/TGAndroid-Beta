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
    public final int f39867a = 1;
    public final int f39868b;
    public final long f39869c;
    public final FrameLayout d;
    public final Object f39870e;

    public qd(int i10, di.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j3) {
        this.f39868b = i10;
        this.d = dVar;
        this.f39870e = f3Var;
        this.f39869c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39867a) {
            case 0:
                ke keVar = (ke) this.d;
                Context context = (Context) this.f39870e;
                if (view.isEnabled()) {
                    di.d dVar = keVar.T0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f39868b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f39869c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new bi.m1(24, keVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                di.d dVar2 = (di.d) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f39870e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f39868b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new bi.s7(i11, dVar2, f3Var, this.f39869c));
                return;
        }
    }

    public qd(ke keVar, int i10, long j3, Context context) {
        this.d = keVar;
        this.f39868b = i10;
        this.f39869c = j3;
        this.f39870e = context;
    }
}
