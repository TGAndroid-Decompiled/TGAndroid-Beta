package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x70 implements RequestDelegate {
    public final int f28966a = 1;
    public final Context f28967b;
    public final long f28968c;
    public final int d;
    public final Object e;
    public final Object f28969f;
    public final Object f28970g;
    public final Object h;
    public final Object f28971i;

    public x70(Context context, bq0 bq0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, wc wcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f28967b = context;
        this.e = bq0Var;
        this.f28968c = j3;
        this.f28969f = bArr;
        this.f28970g = aVar;
        this.h = wcVar;
        this.f28971i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28966a) {
            case 0:
                AndroidUtilities.runOnUIThread(new di.j1((org.telegram.ui.ActionBar.d2) this.e, tLObject, (AccountInstance) this.f28969f, (d80) this.f28970g, this.f28968c, this.f28967b, (org.telegram.ui.ActionBar.p2) this.h, this.d, (TLRPC.Peer) this.f28971i));
                return;
            default:
                bq0 bq0Var = (bq0) this.e;
                byte[] bArr = (byte[]) this.f28969f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f28970g;
                wc wcVar = (wc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f28971i;
                Context context = this.f28967b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.gw(tLObject, context, bq0Var, this.f28968c, bArr, aVar, wcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.w31(aVar, wcVar, context, bq0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.uu0(aVar, wcVar, this.d, 6), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.w31(aVar, wcVar, context, bq0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public x70(org.telegram.ui.ActionBar.d2 d2Var, AccountInstance accountInstance, d80 d80Var, long j3, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer) {
        this.e = d2Var;
        this.f28969f = accountInstance;
        this.f28970g = d80Var;
        this.f28968c = j3;
        this.f28967b = context;
        this.h = p2Var;
        this.d = i10;
        this.f28971i = peer;
    }
}
