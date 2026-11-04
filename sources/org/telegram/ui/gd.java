package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class gd implements View.OnClickListener {
    public final int f45635a = 1;
    public final int f45636b;
    public final long f45637c;
    public final FrameLayout d;
    public final Object f45638e;

    public gd(int i3, gi.d dVar, org.telegram.ui.ActionBar.t2 t2Var, long j10) {
        this.f45636b = i3;
        this.d = dVar;
        this.f45638e = t2Var;
        this.f45637c = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45635a) {
            case 0:
                xd xdVar = (xd) this.d;
                Context context = (Context) this.f45638e;
                if (view.isEnabled()) {
                    gi.d dVar = xdVar.K0;
                    if (!dVar.R) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i3 = this.f45636b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = org.telegram.messenger.hp.s1(i3).j1(this.f45637c);
                        ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new org.telegram.ui.ActionBar.h6(3, xdVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                gi.d dVar2 = (gi.d) this.d;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.f45638e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.f21385b.nextInt();
                int i10 = this.f45636b;
                ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new ci.x(i10, dVar2, t2Var, this.f45637c));
                return;
        }
    }

    public gd(xd xdVar, int i3, long j10, Context context) {
        this.d = xdVar;
        this.f45636b = i3;
        this.f45637c = j10;
        this.f45638e = context;
    }
}
