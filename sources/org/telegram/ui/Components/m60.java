package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m60 implements RequestDelegate {
    public final int f35970a = 1;
    public final Context f35971b;
    public final long f35972c;
    public final int d;
    public final Object f35973e;
    public final Object f35974f;
    public final Object f35975g;
    public final Object h;
    public final Object f35976i;

    public m60(Context context, di.i0 i0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, hc hcVar, org.telegram.messenger.video.d dVar, int i7) {
        this.f35971b = context;
        this.f35973e = i0Var;
        this.f35972c = j3;
        this.f35974f = bArr;
        this.f35975g = aVar;
        this.h = hcVar;
        this.f35976i = dVar;
        this.d = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35970a) {
            case 0:
                org.telegram.messenger.g0.h3(new hi.a1((org.telegram.ui.ActionBar.u1) this.f35973e, tLObject, (org.telegram.messenger.c) this.f35974f, (s60) this.f35975g, this.f35972c, this.f35971b, (org.telegram.ui.ActionBar.f2) this.h, this.d, (TLRPC.Peer) this.f35976i));
                return;
            default:
                di.i0 i0Var = (di.i0) this.f35973e;
                byte[] bArr = (byte[]) this.f35974f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f35975g;
                hc hcVar = (hc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f35976i;
                Context context = this.f35971b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        org.telegram.messenger.g0.h3(new bi.m4(tLObject, context, i0Var, this.f35972c, bArr, aVar, hcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.iy0(aVar, hcVar, context, i0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.f10(aVar, hcVar, this.d, 11), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.iy0(aVar, hcVar, context, i0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public m60(org.telegram.ui.ActionBar.u1 u1Var, org.telegram.messenger.c cVar, s60 s60Var, long j3, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer) {
        this.f35973e = u1Var;
        this.f35974f = cVar;
        this.f35975g = s60Var;
        this.f35972c = j3;
        this.f35971b = context;
        this.h = f2Var;
        this.d = i7;
        this.f35976i = peer;
    }
}
