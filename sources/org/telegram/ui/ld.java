package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class ld implements View.OnClickListener {
    public final int f40170a = 1;
    public final int f40171b;
    public final long f40172c;
    public final FrameLayout d;
    public final Object f40173e;

    public ld(int i10, nh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j10) {
        this.f40171b = i10;
        this.d = dVar;
        this.f40173e = f3Var;
        this.f40172c = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40170a) {
            case 0:
                de deVar = (de) this.d;
                Context context = (Context) this.f40173e;
                if (view.isEnabled()) {
                    nh.d dVar = deVar.P0;
                    if (!dVar.J) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f40171b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f40172c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new bg.h3(27, deVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                nh.d dVar2 = (nh.d) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f40173e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f40171b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new jh.u(i11, dVar2, f3Var, this.f40172c));
                return;
        }
    }

    public ld(de deVar, int i10, long j10, Context context) {
        this.d = deVar;
        this.f40171b = i10;
        this.f40172c = j10;
        this.f40173e = context;
    }
}
