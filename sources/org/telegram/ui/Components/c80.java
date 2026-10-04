package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c80 implements RequestDelegate {
    public final int f25253a = 1;
    public final Context f25254b;
    public final long f25255c;
    public final int d;
    public final Object f25256e;
    public final Object f25257f;
    public final Object f25258g;
    public final Object h;
    public final Object f25259i;

    public c80(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, yc ycVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f25254b = context;
        this.f25256e = a1Var;
        this.f25255c = j3;
        this.f25257f = bArr;
        this.f25258g = aVar;
        this.h = ycVar;
        this.f25259i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25253a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.h1((org.telegram.ui.ActionBar.b2) this.f25256e, tLObject, (AccountInstance) this.f25257f, (i80) this.f25258g, this.f25255c, this.f25254b, (org.telegram.ui.ActionBar.n2) this.h, this.d, (TLRPC.Peer) this.f25259i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.f25256e;
                byte[] bArr = (byte[]) this.f25257f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f25258g;
                yc ycVar = (yc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f25259i;
                Context context = this.f25254b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ew(tLObject, context, a1Var, this.f25255c, bArr, aVar, ycVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.k31(aVar, ycVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.am0(aVar, ycVar, this.d, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.k31(aVar, ycVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public c80(org.telegram.ui.ActionBar.b2 b2Var, AccountInstance accountInstance, i80 i80Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f25256e = b2Var;
        this.f25257f = accountInstance;
        this.f25258g = i80Var;
        this.f25255c = j3;
        this.f25254b = context;
        this.h = n2Var;
        this.d = i10;
        this.f25259i = peer;
    }
}
