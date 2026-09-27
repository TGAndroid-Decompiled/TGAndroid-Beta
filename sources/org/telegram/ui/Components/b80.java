package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b80 implements RequestDelegate {
    public final int f22924a = 1;
    public final Context f22925b;
    public final long f22926c;
    public final int d;
    public final Object e;
    public final Object f22927f;
    public final Object f22928g;
    public final Object h;
    public final Object f22929i;

    public b80(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, xc xcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f22925b = context;
        this.e = a1Var;
        this.f22926c = j3;
        this.f22927f = bArr;
        this.f22928g = aVar;
        this.h = xcVar;
        this.f22929i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22924a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.c2) this.e, tLObject, (AccountInstance) this.f22927f, (h80) this.f22928g, this.f22926c, this.f22925b, (org.telegram.ui.ActionBar.o2) this.h, this.d, (TLRPC.Peer) this.f22929i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f22927f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f22928g;
                xc xcVar = (xc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f22929i;
                Context context = this.f22925b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.dw(tLObject, context, a1Var, this.f22926c, bArr, aVar, xcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.k31(aVar, xcVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.zl0(aVar, xcVar, this.d, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.k31(aVar, xcVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public b80(org.telegram.ui.ActionBar.c2 c2Var, AccountInstance accountInstance, h80 h80Var, long j3, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer) {
        this.e = c2Var;
        this.f22927f = accountInstance;
        this.f22928g = h80Var;
        this.f22926c = j3;
        this.f22925b = context;
        this.h = o2Var;
        this.d = i10;
        this.f22929i = peer;
    }
}
