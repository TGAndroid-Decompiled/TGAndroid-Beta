package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n60 implements RequestDelegate {
    public final int f37461a = 1;
    public final Context f37462b;
    public final long f37463c;
    public final int d;
    public final Object f37464e;
    public final Object f37465f;
    public final Object f37466g;
    public final Object h;
    public final Object f37467i;

    public n60(Context context, fi.i0 i0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, cc ccVar, org.telegram.messenger.video.d dVar, int i7) {
        this.f37462b = context;
        this.f37464e = i0Var;
        this.f37463c = j3;
        this.f37465f = bArr;
        this.f37466g = aVar;
        this.h = ccVar;
        this.f37467i = dVar;
        this.d = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37461a) {
            case 0:
                org.telegram.messenger.g0.h3(new ki.b1((org.telegram.ui.ActionBar.t1) this.f37464e, tLObject, (org.telegram.messenger.c) this.f37465f, (t60) this.f37466g, this.f37463c, this.f37462b, (org.telegram.ui.ActionBar.e2) this.h, this.d, (TLRPC.Peer) this.f37467i));
                return;
            default:
                fi.i0 i0Var = (fi.i0) this.f37464e;
                byte[] bArr = (byte[]) this.f37465f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f37466g;
                cc ccVar = (cc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f37467i;
                Context context = this.f37462b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        org.telegram.messenger.g0.h3(new di.n3(tLObject, context, i0Var, this.f37463c, bArr, aVar, ccVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.dy0(aVar, ccVar, context, i0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        org.telegram.messenger.g0.i3(new u11(aVar, ccVar, this.d, 14), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.dy0(aVar, ccVar, context, i0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public n60(org.telegram.ui.ActionBar.t1 t1Var, org.telegram.messenger.c cVar, t60 t60Var, long j3, Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, TLRPC.Peer peer) {
        this.f37464e = t1Var;
        this.f37465f = cVar;
        this.f37466g = t60Var;
        this.f37463c = j3;
        this.f37462b = context;
        this.h = e2Var;
        this.d = i7;
        this.f37467i = peer;
    }
}
