package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o70 implements RequestDelegate {
    public final int f29015a = 1;
    public final Context f29016b;
    public final long f29017c;
    public final int d;
    public final Object f29018e;
    public final Object f29019f;
    public final Object f29020g;
    public final Object h;
    public final Object f29021i;

    public o70(Context context, bi.s0 s0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, yc ycVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f29016b = context;
        this.f29018e = s0Var;
        this.f29017c = j3;
        this.f29019f = bArr;
        this.f29020g = aVar;
        this.h = ycVar;
        this.f29021i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f29015a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fi.g1((org.telegram.ui.ActionBar.b2) this.f29018e, tLObject, (AccountInstance) this.f29019f, (u70) this.f29020g, this.f29017c, this.f29016b, (org.telegram.ui.ActionBar.n2) this.h, this.d, (TLRPC.Peer) this.f29021i));
                return;
            default:
                bi.s0 s0Var = (bi.s0) this.f29018e;
                byte[] bArr = (byte[]) this.f29019f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f29020g;
                yc ycVar = (yc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f29021i;
                Context context = this.f29016b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.fw(tLObject, context, s0Var, this.f29017c, bArr, aVar, ycVar, dVar));
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
        this.f29018e = b2Var;
        this.f29019f = accountInstance;
        this.f29020g = u70Var;
        this.f29017c = j3;
        this.f29016b = context;
        this.h = n2Var;
        this.d = i10;
        this.f29021i = peer;
    }
}
