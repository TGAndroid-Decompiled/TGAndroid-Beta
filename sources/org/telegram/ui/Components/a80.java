package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a80 implements RequestDelegate {
    public final int f22561a = 1;
    public final Context f22562b;
    public final long f22563c;
    public final int d;
    public final Object e;
    public final Object f22564f;
    public final Object f22565g;
    public final Object h;
    public final Object f22566i;

    public a80(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, xc xcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f22562b = context;
        this.e = a1Var;
        this.f22563c = j3;
        this.f22564f = bArr;
        this.f22565g = aVar;
        this.h = xcVar;
        this.f22566i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22561a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.a2) this.e, tLObject, (AccountInstance) this.f22564f, (g80) this.f22565g, this.f22563c, this.f22562b, (org.telegram.ui.ActionBar.m2) this.h, this.d, (TLRPC.Peer) this.f22566i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f22564f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f22565g;
                xc xcVar = (xc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f22566i;
                Context context = this.f22562b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.aw(tLObject, context, a1Var, this.f22563c, bArr, aVar, xcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.i31(aVar, xcVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.wl0(aVar, xcVar, this.d, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.i31(aVar, xcVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public a80(org.telegram.ui.ActionBar.a2 a2Var, AccountInstance accountInstance, g80 g80Var, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.e = a2Var;
        this.f22564f = accountInstance;
        this.f22565g = g80Var;
        this.f22563c = j3;
        this.f22562b = context;
        this.h = m2Var;
        this.d = i10;
        this.f22566i = peer;
    }
}
