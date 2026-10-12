package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t80 implements RequestDelegate {
    public final int f30785a = 1;
    public final Context f30786b;
    public final long f30787c;
    public final int d;
    public final Object f30788e;
    public final Object f30789f;
    public final Object f30790g;
    public final Object h;
    public final Object f30791i;

    public t80(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, zc zcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f30786b = context;
        this.f30788e = a1Var;
        this.f30787c = j3;
        this.f30789f = bArr;
        this.f30790g = aVar;
        this.h = zcVar;
        this.f30791i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30785a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.a2) this.f30788e, tLObject, (AccountInstance) this.f30789f, (a90) this.f30790g, this.f30787c, this.f30786b, (org.telegram.ui.ActionBar.m2) this.h, this.d, (TLRPC.Peer) this.f30791i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.f30788e;
                byte[] bArr = (byte[]) this.f30789f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f30790g;
                zc zcVar = (zc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f30791i;
                Context context = this.f30786b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.fw(tLObject, context, a1Var, this.f30787c, bArr, aVar, zcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.s31(aVar, zcVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ci0(aVar, zcVar, this.d, 9), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.s31(aVar, zcVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public t80(org.telegram.ui.ActionBar.a2 a2Var, AccountInstance accountInstance, a90 a90Var, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.f30788e = a2Var;
        this.f30789f = accountInstance;
        this.f30790g = a90Var;
        this.f30787c = j3;
        this.f30786b = context;
        this.h = m2Var;
        this.d = i10;
        this.f30791i = peer;
    }
}
