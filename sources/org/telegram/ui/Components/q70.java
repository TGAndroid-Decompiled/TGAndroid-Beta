package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q70 implements RequestDelegate {
    public final int f28101a = 1;
    public final Context f28102b;
    public final long f28103c;
    public final int d;
    public final Object e;
    public final Object f28104f;
    public final Object f28105g;
    public final Object h;
    public final Object f28106i;

    public q70(Context context, nh.i0 i0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, qc qcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f28102b = context;
        this.e = i0Var;
        this.f28103c = j10;
        this.f28104f = bArr;
        this.f28105g = aVar;
        this.h = qcVar;
        this.f28106i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28101a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s70((org.telegram.ui.ActionBar.d2) this.e, tLObject, (AccountInstance) this.f28104f, (x70) this.f28105g, this.f28103c, this.f28102b, (org.telegram.ui.ActionBar.p2) this.h, this.d, (TLRPC.Peer) this.f28106i));
                return;
            default:
                nh.i0 i0Var = (nh.i0) this.e;
                byte[] bArr = (byte[]) this.f28104f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f28105g;
                qc qcVar = (qc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f28106i;
                Context context = this.f28102b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new lh.a3(tLObject, context, i0Var, this.f28103c, bArr, aVar, qcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.f31(aVar, qcVar, context, i0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.gu0(aVar, qcVar, this.d, 6), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.f31(aVar, qcVar, context, i0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public q70(org.telegram.ui.ActionBar.d2 d2Var, AccountInstance accountInstance, x70 x70Var, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer) {
        this.e = d2Var;
        this.f28104f = accountInstance;
        this.f28105g = x70Var;
        this.f28103c = j10;
        this.f28102b = context;
        this.h = p2Var;
        this.d = i10;
        this.f28106i = peer;
    }
}
