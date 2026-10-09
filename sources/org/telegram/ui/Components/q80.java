package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q80 implements RequestDelegate {
    public final int f30105a = 1;
    public final Context f30106b;
    public final long f30107c;
    public final int d;
    public final Object f30108e;
    public final Object f30109f;
    public final Object f30110g;
    public final Object h;
    public final Object f30111i;

    public q80(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, ad adVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f30106b = context;
        this.f30108e = a1Var;
        this.f30107c = j3;
        this.f30109f = bArr;
        this.f30110g = aVar;
        this.h = adVar;
        this.f30111i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30105a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.b2) this.f30108e, tLObject, (AccountInstance) this.f30109f, (w80) this.f30110g, this.f30107c, this.f30106b, (org.telegram.ui.ActionBar.n2) this.h, this.d, (TLRPC.Peer) this.f30111i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.f30108e;
                byte[] bArr = (byte[]) this.f30109f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f30110g;
                ad adVar = (ad) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f30111i;
                Context context = this.f30106b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.dw(tLObject, context, a1Var, this.f30107c, bArr, aVar, adVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.r31(aVar, adVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.bi0(aVar, adVar, this.d, 9), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.r31(aVar, adVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public q80(org.telegram.ui.ActionBar.b2 b2Var, AccountInstance accountInstance, w80 w80Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f30108e = b2Var;
        this.f30109f = accountInstance;
        this.f30110g = w80Var;
        this.f30107c = j3;
        this.f30106b = context;
        this.h = n2Var;
        this.d = i10;
        this.f30111i = peer;
    }
}
