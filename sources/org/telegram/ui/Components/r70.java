package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r70 implements RequestDelegate {
    public final int f30618a = 1;
    public final Context f30619b;
    public final long f30620c;
    public final int d;
    public final Object f30621e;
    public final Object f30622f;
    public final Object f30623g;
    public final Object h;
    public final Object f30624i;

    public r70(Context context, oh.h0 h0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, qc qcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f30619b = context;
        this.f30621e = h0Var;
        this.f30620c = j10;
        this.f30622f = bArr;
        this.f30623g = aVar;
        this.h = qcVar;
        this.f30624i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30618a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t70((org.telegram.ui.ActionBar.d2) this.f30621e, tLObject, (AccountInstance) this.f30622f, (y70) this.f30623g, this.f30620c, this.f30619b, (org.telegram.ui.ActionBar.p2) this.h, this.d, (TLRPC.Peer) this.f30624i));
                return;
            default:
                oh.h0 h0Var = (oh.h0) this.f30621e;
                byte[] bArr = (byte[]) this.f30622f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f30623g;
                qc qcVar = (qc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f30624i;
                Context context = this.f30619b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new mh.z2(tLObject, context, h0Var, this.f30620c, bArr, aVar, qcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.a31(aVar, qcVar, context, h0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.bu0(aVar, qcVar, this.d, 6), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.a31(aVar, qcVar, context, h0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public r70(org.telegram.ui.ActionBar.d2 d2Var, AccountInstance accountInstance, y70 y70Var, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer) {
        this.f30621e = d2Var;
        this.f30622f = accountInstance;
        this.f30623g = y70Var;
        this.f30620c = j10;
        this.f30619b = context;
        this.h = p2Var;
        this.d = i10;
        this.f30624i = peer;
    }
}
