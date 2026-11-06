package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l60 implements RequestDelegate {
    public final int f35523a = 1;
    public final Context f35524b;
    public final long f35525c;
    public final int d;
    public final Object f35526e;
    public final Object f35527f;
    public final Object f35528g;
    public final Object h;
    public final Object f35529i;

    public l60(Context context, di.i0 i0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, hc hcVar, org.telegram.messenger.video.d dVar, int i7) {
        this.f35524b = context;
        this.f35526e = i0Var;
        this.f35525c = j3;
        this.f35527f = bArr;
        this.f35528g = aVar;
        this.h = hcVar;
        this.f35529i = dVar;
        this.d = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35523a) {
            case 0:
                org.telegram.messenger.g0.h3(new hi.a1((org.telegram.ui.ActionBar.u1) this.f35526e, tLObject, (org.telegram.messenger.c) this.f35527f, (r60) this.f35528g, this.f35525c, this.f35524b, (org.telegram.ui.ActionBar.f2) this.h, this.d, (TLRPC.Peer) this.f35529i));
                return;
            default:
                di.i0 i0Var = (di.i0) this.f35526e;
                byte[] bArr = (byte[]) this.f35527f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f35528g;
                hc hcVar = (hc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f35529i;
                Context context = this.f35524b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        org.telegram.messenger.g0.h3(new bi.m4(tLObject, context, i0Var, this.f35525c, bArr, aVar, hcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.fy0(aVar, hcVar, context, i0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.d10(aVar, hcVar, this.d, 11), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.fy0(aVar, hcVar, context, i0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public l60(org.telegram.ui.ActionBar.u1 u1Var, org.telegram.messenger.c cVar, r60 r60Var, long j3, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer) {
        this.f35526e = u1Var;
        this.f35527f = cVar;
        this.f35528g = r60Var;
        this.f35525c = j3;
        this.f35524b = context;
        this.h = f2Var;
        this.d = i7;
        this.f35529i = peer;
    }
}
