package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l60 implements RequestDelegate {
    public final int f35554a = 1;
    public final Context f35555b;
    public final long f35556c;
    public final int d;
    public final Object f35557e;
    public final Object f35558f;
    public final Object f35559g;
    public final Object h;
    public final Object f35560i;

    public l60(Context context, di.i0 i0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, gc gcVar, org.telegram.messenger.video.d dVar, int i7) {
        this.f35555b = context;
        this.f35557e = i0Var;
        this.f35556c = j3;
        this.f35558f = bArr;
        this.f35559g = aVar;
        this.h = gcVar;
        this.f35560i = dVar;
        this.d = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35554a) {
            case 0:
                org.telegram.messenger.g0.h3(new hi.a1((org.telegram.ui.ActionBar.u1) this.f35557e, tLObject, (org.telegram.messenger.c) this.f35558f, (r60) this.f35559g, this.f35556c, this.f35555b, (org.telegram.ui.ActionBar.f2) this.h, this.d, (TLRPC.Peer) this.f35560i));
                return;
            default:
                di.i0 i0Var = (di.i0) this.f35557e;
                byte[] bArr = (byte[]) this.f35558f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f35559g;
                gc gcVar = (gc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f35560i;
                Context context = this.f35555b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        org.telegram.messenger.g0.h3(new bi.m4(tLObject, context, i0Var, this.f35556c, bArr, aVar, gcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.jy0(aVar, gcVar, context, i0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.h10(aVar, gcVar, this.d, 11), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.jy0(aVar, gcVar, context, i0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public l60(org.telegram.ui.ActionBar.u1 u1Var, org.telegram.messenger.c cVar, r60 r60Var, long j3, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer) {
        this.f35557e = u1Var;
        this.f35558f = cVar;
        this.f35559g = r60Var;
        this.f35556c = j3;
        this.f35555b = context;
        this.h = f2Var;
        this.d = i7;
        this.f35560i = peer;
    }
}
