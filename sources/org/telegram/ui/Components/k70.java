package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k70 implements RequestDelegate {
    public final int f29955a = 1;
    public final Context f29956b;
    public final long f29957c;
    public final int d;
    public final Object f29958e;
    public final Object f29959f;
    public final Object f29960g;
    public final Object h;
    public final Object f29961i;

    public k70(Context context, lh.h0 h0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, tc tcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f29956b = context;
        this.f29958e = h0Var;
        this.f29957c = j10;
        this.f29959f = bArr;
        this.f29960g = aVar;
        this.h = tcVar;
        this.f29961i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f29955a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m70((org.telegram.ui.ActionBar.c2) this.f29958e, tLObject, (AccountInstance) this.f29959f, (r70) this.f29960g, this.f29957c, this.f29956b, (org.telegram.ui.ActionBar.o2) this.h, this.d, (TLRPC.Peer) this.f29961i));
                return;
            default:
                lh.h0 h0Var = (lh.h0) this.f29958e;
                byte[] bArr = (byte[]) this.f29959f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f29960g;
                tc tcVar = (tc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f29961i;
                Context context = this.f29956b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new jh.a3(tLObject, context, h0Var, this.f29957c, bArr, aVar, tcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.m21(aVar, tcVar, context, h0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ll0(aVar, tcVar, this.d, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.m21(aVar, tcVar, context, h0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public k70(org.telegram.ui.ActionBar.c2 c2Var, AccountInstance accountInstance, r70 r70Var, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer) {
        this.f29958e = c2Var;
        this.f29959f = accountInstance;
        this.f29960g = r70Var;
        this.f29957c = j10;
        this.f29956b = context;
        this.h = o2Var;
        this.d = i10;
        this.f29961i = peer;
    }
}
