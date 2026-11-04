package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g60 implements RequestDelegate {
    public final int f34006a = 1;
    public final Context f34007b;
    public final long f34008c;
    public final int d;
    public final Object f34009e;
    public final Object f34010f;
    public final Object f34011g;
    public final Object h;
    public final Object f34012i;

    public g60(Context context, ei.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, fc fcVar, org.telegram.messenger.video.d dVar, int i3) {
        this.f34007b = context;
        this.f34009e = k0Var;
        this.f34008c = j10;
        this.f34010f = bArr;
        this.f34011g = aVar;
        this.h = fcVar;
        this.f34012i = dVar;
        this.d = i3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34006a) {
            case 0:
                org.telegram.messenger.g0.h3(new ii.b1((org.telegram.ui.ActionBar.s1) this.f34009e, tLObject, (org.telegram.messenger.c) this.f34010f, (m60) this.f34011g, this.f34008c, this.f34007b, (org.telegram.ui.ActionBar.d2) this.h, this.d, (TLRPC.Peer) this.f34012i));
                return;
            default:
                ei.k0 k0Var = (ei.k0) this.f34009e;
                byte[] bArr = (byte[]) this.f34010f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f34011g;
                fc fcVar = (fc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f34012i;
                Context context = this.f34007b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        org.telegram.messenger.g0.h3(new ci.w3(tLObject, context, k0Var, this.f34008c, bArr, aVar, fcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.wx0(aVar, fcVar, context, k0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.rw(aVar, fcVar, this.d, 12), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.wx0(aVar, fcVar, context, k0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public g60(org.telegram.ui.ActionBar.s1 s1Var, org.telegram.messenger.c cVar, m60 m60Var, long j10, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, TLRPC.Peer peer) {
        this.f34009e = s1Var;
        this.f34010f = cVar;
        this.f34011g = m60Var;
        this.f34008c = j10;
        this.f34007b = context;
        this.h = d2Var;
        this.d = i3;
        this.f34012i = peer;
    }
}
