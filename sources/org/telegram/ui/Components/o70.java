package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o70 implements RequestDelegate {
    public final int f28988a = 1;
    public final Context f28989b;
    public final long f28990c;
    public final int d;
    public final Object f28991e;
    public final Object f28992f;
    public final Object f28993g;
    public final Object h;
    public final Object f28994i;

    public o70(Context context, bi.s0 s0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, yc ycVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f28989b = context;
        this.f28991e = s0Var;
        this.f28990c = j3;
        this.f28992f = bArr;
        this.f28993g = aVar;
        this.h = ycVar;
        this.f28994i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28988a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fi.g1((org.telegram.ui.ActionBar.b2) this.f28991e, tLObject, (AccountInstance) this.f28992f, (u70) this.f28993g, this.f28990c, this.f28989b, (org.telegram.ui.ActionBar.n2) this.h, this.d, (TLRPC.Peer) this.f28994i));
                return;
            default:
                bi.s0 s0Var = (bi.s0) this.f28991e;
                byte[] bArr = (byte[]) this.f28992f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f28993g;
                yc ycVar = (yc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f28994i;
                Context context = this.f28989b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.fw(tLObject, context, s0Var, this.f28990c, bArr, aVar, ycVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.t31(aVar, ycVar, context, s0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ai0(aVar, ycVar, this.d, 9), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.t31(aVar, ycVar, context, s0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public o70(org.telegram.ui.ActionBar.b2 b2Var, AccountInstance accountInstance, u70 u70Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f28991e = b2Var;
        this.f28992f = accountInstance;
        this.f28993g = u70Var;
        this.f28990c = j3;
        this.f28989b = context;
        this.h = n2Var;
        this.d = i10;
        this.f28994i = peer;
    }
}
