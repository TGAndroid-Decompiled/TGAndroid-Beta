package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l60 implements RequestDelegate {
    public final int f35541a = 1;
    public final Context f35542b;
    public final long f35543c;
    public final int d;
    public final Object f35544e;
    public final Object f35545f;
    public final Object f35546g;
    public final Object h;
    public final Object f35547i;

    public l60(Context context, di.i0 i0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, hc hcVar, org.telegram.messenger.video.d dVar, int i7) {
        this.f35542b = context;
        this.f35544e = i0Var;
        this.f35543c = j3;
        this.f35545f = bArr;
        this.f35546g = aVar;
        this.h = hcVar;
        this.f35547i = dVar;
        this.d = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35541a) {
            case 0:
                org.telegram.messenger.g0.h3(new hi.a1((org.telegram.ui.ActionBar.u1) this.f35544e, tLObject, (org.telegram.messenger.c) this.f35545f, (r60) this.f35546g, this.f35543c, this.f35542b, (org.telegram.ui.ActionBar.f2) this.h, this.d, (TLRPC.Peer) this.f35547i));
                return;
            default:
                di.i0 i0Var = (di.i0) this.f35544e;
                byte[] bArr = (byte[]) this.f35545f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f35546g;
                hc hcVar = (hc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f35547i;
                Context context = this.f35542b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        org.telegram.messenger.g0.h3(new bi.m4(tLObject, context, i0Var, this.f35543c, bArr, aVar, hcVar, dVar));
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
        this.f35544e = u1Var;
        this.f35545f = cVar;
        this.f35546g = r60Var;
        this.f35543c = j3;
        this.f35542b = context;
        this.h = f2Var;
        this.d = i7;
        this.f35547i = peer;
    }
}
