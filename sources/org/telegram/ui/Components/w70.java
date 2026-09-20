package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w70 implements RequestDelegate {
    public final int f29970a = 1;
    public final Context f29971b;
    public final long f29972c;
    public final int d;
    public final Object e;
    public final Object f29973f;
    public final Object f29974g;
    public final Object h;
    public final Object f29975i;

    public w70(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, xc xcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f29971b = context;
        this.e = a1Var;
        this.f29972c = j3;
        this.f29973f = bArr;
        this.f29974g = aVar;
        this.h = xcVar;
        this.f29975i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f29970a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.b2) this.e, tLObject, (AccountInstance) this.f29973f, (c80) this.f29974g, this.f29972c, this.f29971b, (org.telegram.ui.ActionBar.n2) this.h, this.d, (TLRPC.Peer) this.f29975i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f29973f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f29974g;
                xc xcVar = (xc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f29975i;
                Context context = this.f29971b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.fw(tLObject, context, a1Var, this.f29972c, bArr, aVar, xcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.r31(aVar, xcVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.fm0(aVar, xcVar, this.d, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.r31(aVar, xcVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public w70(org.telegram.ui.ActionBar.b2 b2Var, AccountInstance accountInstance, c80 c80Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.e = b2Var;
        this.f29973f = accountInstance;
        this.f29974g = c80Var;
        this.f29972c = j3;
        this.f29971b = context;
        this.h = n2Var;
        this.d = i10;
        this.f29975i = peer;
    }
}
