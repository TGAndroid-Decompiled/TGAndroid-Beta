package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l60 implements RequestDelegate {
    public final int f35535a = 1;
    public final Context f35536b;
    public final long f35537c;
    public final int d;
    public final Object f35538e;
    public final Object f35539f;
    public final Object f35540g;
    public final Object h;
    public final Object f35541i;

    public l60(Context context, di.i0 i0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, hc hcVar, org.telegram.messenger.video.d dVar, int i7) {
        this.f35536b = context;
        this.f35538e = i0Var;
        this.f35537c = j3;
        this.f35539f = bArr;
        this.f35540g = aVar;
        this.h = hcVar;
        this.f35541i = dVar;
        this.d = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35535a) {
            case 0:
                org.telegram.messenger.g0.h3(new hi.a1((org.telegram.ui.ActionBar.u1) this.f35538e, tLObject, (org.telegram.messenger.c) this.f35539f, (r60) this.f35540g, this.f35537c, this.f35536b, (org.telegram.ui.ActionBar.f2) this.h, this.d, (TLRPC.Peer) this.f35541i));
                return;
            default:
                di.i0 i0Var = (di.i0) this.f35538e;
                byte[] bArr = (byte[]) this.f35539f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f35540g;
                hc hcVar = (hc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f35541i;
                Context context = this.f35536b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        org.telegram.messenger.g0.h3(new bi.m4(tLObject, context, i0Var, this.f35537c, bArr, aVar, hcVar, dVar));
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
        this.f35538e = u1Var;
        this.f35539f = cVar;
        this.f35540g = r60Var;
        this.f35537c = j3;
        this.f35536b = context;
        this.h = f2Var;
        this.d = i7;
        this.f35541i = peer;
    }
}
