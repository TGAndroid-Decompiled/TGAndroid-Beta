package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p70 implements RequestDelegate {
    public final int f27762a = 1;
    public final Context f27763b;
    public final long f27764c;
    public final int d;
    public final Object e;
    public final Object f27765f;
    public final Object f27766g;
    public final Object h;
    public final Object f27767i;

    public p70(Context context, nh.i0 i0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, qc qcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f27763b = context;
        this.e = i0Var;
        this.f27764c = j10;
        this.f27765f = bArr;
        this.f27766g = aVar;
        this.h = qcVar;
        this.f27767i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27762a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r70((org.telegram.ui.ActionBar.d2) this.e, tLObject, (AccountInstance) this.f27765f, (w70) this.f27766g, this.f27764c, this.f27763b, (org.telegram.ui.ActionBar.p2) this.h, this.d, (TLRPC.Peer) this.f27767i));
                return;
            default:
                nh.i0 i0Var = (nh.i0) this.e;
                byte[] bArr = (byte[]) this.f27765f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f27766g;
                qc qcVar = (qc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f27767i;
                Context context = this.f27763b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new lh.a3(tLObject, context, i0Var, this.f27764c, bArr, aVar, qcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.y21(aVar, qcVar, context, i0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.zt0(aVar, qcVar, this.d, 6), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.y21(aVar, qcVar, context, i0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public p70(org.telegram.ui.ActionBar.d2 d2Var, AccountInstance accountInstance, w70 w70Var, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer) {
        this.e = d2Var;
        this.f27765f = accountInstance;
        this.f27766g = w70Var;
        this.f27764c = j10;
        this.f27763b = context;
        this.h = p2Var;
        this.d = i10;
        this.f27767i = peer;
    }
}
