package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n80 implements RequestDelegate {
    public final int f27618a = 1;
    public final Context f27619b;
    public final long f27620c;
    public final int d;
    public final Object e;
    public final Object f27621f;
    public final Object f27622g;
    public final Object h;
    public final Object f27623i;

    public n80(Context context, bi.s0 s0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, zc zcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f27619b = context;
        this.e = s0Var;
        this.f27620c = j10;
        this.f27621f = bArr;
        this.f27622g = aVar;
        this.h = zcVar;
        this.f27623i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27618a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fi.f1((org.telegram.ui.ActionBar.a2) this.e, tLObject, (AccountInstance) this.f27621f, (u80) this.f27622g, this.f27620c, this.f27619b, (org.telegram.ui.ActionBar.m2) this.h, this.d, (TLRPC.Peer) this.f27623i));
                return;
            default:
                bi.s0 s0Var = (bi.s0) this.e;
                byte[] bArr = (byte[]) this.f27621f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f27622g;
                zc zcVar = (zc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f27623i;
                Context context = this.f27619b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.jw(tLObject, context, s0Var, this.f27620c, bArr, aVar, zcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.x31(aVar, zcVar, context, s0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.c90(aVar, zcVar, this.d, 10), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.x31(aVar, zcVar, context, s0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public n80(org.telegram.ui.ActionBar.a2 a2Var, AccountInstance accountInstance, u80 u80Var, long j10, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.e = a2Var;
        this.f27621f = accountInstance;
        this.f27622g = u80Var;
        this.f27620c = j10;
        this.f27619b = context;
        this.h = m2Var;
        this.d = i10;
        this.f27623i = peer;
    }
}
