package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r80 implements RequestDelegate {
    public final int f30387a = 1;
    public final Context f30388b;
    public final long f30389c;
    public final int d;
    public final Object f30390e;
    public final Object f30391f;
    public final Object f30392g;
    public final Object h;
    public final Object f30393i;

    public r80(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, ad adVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f30388b = context;
        this.f30390e = a1Var;
        this.f30389c = j3;
        this.f30391f = bArr;
        this.f30392g = aVar;
        this.h = adVar;
        this.f30393i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30387a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.a2) this.f30390e, tLObject, (AccountInstance) this.f30391f, (x80) this.f30392g, this.f30389c, this.f30388b, (org.telegram.ui.ActionBar.m2) this.h, this.d, (TLRPC.Peer) this.f30393i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.f30390e;
                byte[] bArr = (byte[]) this.f30391f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f30392g;
                ad adVar = (ad) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f30393i;
                Context context = this.f30388b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.cw(tLObject, context, a1Var, this.f30389c, bArr, aVar, adVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.q31(aVar, adVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ai0(aVar, adVar, this.d, 9), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.q31(aVar, adVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public r80(org.telegram.ui.ActionBar.a2 a2Var, AccountInstance accountInstance, x80 x80Var, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.f30390e = a2Var;
        this.f30391f = accountInstance;
        this.f30392g = x80Var;
        this.f30389c = j3;
        this.f30388b = context;
        this.h = m2Var;
        this.d = i10;
        this.f30393i = peer;
    }
}
