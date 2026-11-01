package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a70 implements RequestDelegate {
    public final int f24298a = 1;
    public final Context f24299b;
    public final long f24300c;
    public final int d;
    public final Object e;
    public final Object f24301f;
    public final Object f24302g;
    public final Object h;
    public final Object f24303i;

    public a70(Context context, so0 so0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, cc ccVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f24299b = context;
        this.e = so0Var;
        this.f24300c = j10;
        this.f24301f = bArr;
        this.f24302g = aVar;
        this.h = ccVar;
        this.f24303i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24298a) {
            case 0:
                org.telegram.messenger.i0.g3(new d70((org.telegram.ui.ActionBar.x1) this.e, tLObject, (org.telegram.messenger.c) this.f24301f, (i70) this.f24302g, this.f24300c, this.f24299b, (org.telegram.ui.ActionBar.k2) this.h, this.d, (TLRPC.Peer) this.f24303i));
                return;
            default:
                so0 so0Var = (so0) this.e;
                byte[] bArr = (byte[]) this.f24301f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f24302g;
                cc ccVar = (cc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f24303i;
                Context context = this.f24299b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        org.telegram.messenger.i0.g3(new org.telegram.messenger.f10(tLObject, context, so0Var, this.f24300c, bArr, aVar, ccVar, dVar, 2));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        org.telegram.messenger.i0.h3(new org.telegram.ui.tz0(aVar, ccVar, context, so0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        org.telegram.messenger.i0.h3(new ki0(aVar, ccVar, this.d, 28), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.i0.h3(new org.telegram.ui.tz0(aVar, ccVar, context, so0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public a70(org.telegram.ui.ActionBar.x1 x1Var, org.telegram.messenger.c cVar, i70 i70Var, long j10, Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, TLRPC.Peer peer) {
        this.e = x1Var;
        this.f24301f = cVar;
        this.f24302g = i70Var;
        this.f24300c = j10;
        this.f24299b = context;
        this.h = k2Var;
        this.d = i10;
        this.f24303i = peer;
    }
}
