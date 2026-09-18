package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x70 implements RequestDelegate {
    public final int f30270a = 1;
    public final Context f30271b;
    public final long f30272c;
    public final int d;
    public final Object e;
    public final Object f30273f;
    public final Object f30274g;
    public final Object h;
    public final Object f30275i;

    public x70(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, xc xcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f30271b = context;
        this.e = a1Var;
        this.f30272c = j3;
        this.f30273f = bArr;
        this.f30274g = aVar;
        this.h = xcVar;
        this.f30275i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30270a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.b2) this.e, tLObject, (AccountInstance) this.f30273f, (d80) this.f30274g, this.f30272c, this.f30271b, (org.telegram.ui.ActionBar.n2) this.h, this.d, (TLRPC.Peer) this.f30275i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f30273f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f30274g;
                xc xcVar = (xc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f30275i;
                Context context = this.f30271b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.fw(tLObject, context, a1Var, this.f30272c, bArr, aVar, xcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.q31(aVar, xcVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.fm0(aVar, xcVar, this.d, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.q31(aVar, xcVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public x70(org.telegram.ui.ActionBar.b2 b2Var, AccountInstance accountInstance, d80 d80Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.e = b2Var;
        this.f30273f = accountInstance;
        this.f30274g = d80Var;
        this.f30272c = j3;
        this.f30271b = context;
        this.h = n2Var;
        this.d = i10;
        this.f30275i = peer;
    }
}
