package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k80 implements RequestDelegate {
    public final int f27948a = 1;
    public final Context f27949b;
    public final long f27950c;
    public final int d;
    public final Object e;
    public final Object f27951f;
    public final Object f27952g;
    public final Object h;
    public final Object f27953i;

    public k80(Context context, ci.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, xc xcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f27949b = context;
        this.e = k0Var;
        this.f27950c = j10;
        this.f27951f = bArr;
        this.f27952g = aVar;
        this.h = xcVar;
        this.f27953i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27948a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gi.d1((org.telegram.ui.ActionBar.c2) this.e, tLObject, (AccountInstance) this.f27951f, (q80) this.f27952g, this.f27950c, this.f27949b, (org.telegram.ui.ActionBar.o2) this.h, this.d, (TLRPC.Peer) this.f27953i));
                return;
            default:
                ci.k0 k0Var = (ci.k0) this.e;
                byte[] bArr = (byte[]) this.f27951f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f27952g;
                xc xcVar = (xc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f27953i;
                Context context = this.f27949b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ai.q4(tLObject, context, k0Var, this.f27950c, bArr, aVar, xcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.h21(aVar, xcVar, context, k0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new c41(aVar, xcVar, this.d, 14), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.h21(aVar, xcVar, context, k0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public k80(org.telegram.ui.ActionBar.c2 c2Var, AccountInstance accountInstance, q80 q80Var, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer) {
        this.e = c2Var;
        this.f27951f = accountInstance;
        this.f27952g = q80Var;
        this.f27950c = j10;
        this.f27949b = context;
        this.h = o2Var;
        this.d = i10;
        this.f27953i = peer;
    }
}
