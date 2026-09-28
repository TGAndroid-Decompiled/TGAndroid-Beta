package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b80 implements RequestDelegate {
    public final int f22888a = 1;
    public final Context f22889b;
    public final long f22890c;
    public final int d;
    public final Object e;
    public final Object f22891f;
    public final Object f22892g;
    public final Object h;
    public final Object f22893i;

    public b80(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, xc xcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f22889b = context;
        this.e = a1Var;
        this.f22890c = j3;
        this.f22891f = bArr;
        this.f22892g = aVar;
        this.h = xcVar;
        this.f22893i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22888a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.a2) this.e, tLObject, (AccountInstance) this.f22891f, (h80) this.f22892g, this.f22890c, this.f22889b, (org.telegram.ui.ActionBar.m2) this.h, this.d, (TLRPC.Peer) this.f22893i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f22891f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f22892g;
                xc xcVar = (xc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f22893i;
                Context context = this.f22889b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.aw(tLObject, context, a1Var, this.f22890c, bArr, aVar, xcVar, dVar));
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

    public b80(org.telegram.ui.ActionBar.a2 a2Var, AccountInstance accountInstance, h80 h80Var, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.e = a2Var;
        this.f22891f = accountInstance;
        this.f22892g = h80Var;
        this.f22890c = j3;
        this.f22889b = context;
        this.h = m2Var;
        this.d = i10;
        this.f22893i = peer;
    }
}
