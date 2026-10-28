package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m80 implements RequestDelegate {
    public final int f30463a = 1;
    public final Context f30464b;
    public final long f30465c;
    public final int d;
    public final Object e;
    public final Object f30466f;
    public final Object f30467g;
    public final Object h;
    public final Object f30468i;

    public m80(Context context, di.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, wc wcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f30464b = context;
        this.e = k0Var;
        this.f30465c = j10;
        this.f30466f = bArr;
        this.f30467g = aVar;
        this.h = wcVar;
        this.f30468i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30463a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hi.k1((org.telegram.ui.ActionBar.e2) this.e, tLObject, (AccountInstance) this.f30466f, (s80) this.f30467g, this.f30465c, this.f30464b, (org.telegram.ui.ActionBar.r2) this.h, this.d, (TLRPC.Peer) this.f30468i));
                return;
            default:
                di.k0 k0Var = (di.k0) this.e;
                byte[] bArr = (byte[]) this.f30466f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f30467g;
                wc wcVar = (wc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f30468i;
                Context context = this.f30464b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new bi.l4(tLObject, context, k0Var, this.f30465c, bArr, aVar, wcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.m21(aVar, wcVar, context, k0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.fx(aVar, wcVar, this.d, 13), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.m21(aVar, wcVar, context, k0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public m80(org.telegram.ui.ActionBar.e2 e2Var, AccountInstance accountInstance, s80 s80Var, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.Peer peer) {
        this.e = e2Var;
        this.f30466f = accountInstance;
        this.f30467g = s80Var;
        this.f30465c = j10;
        this.f30464b = context;
        this.h = r2Var;
        this.d = i10;
        this.f30468i = peer;
    }
}
