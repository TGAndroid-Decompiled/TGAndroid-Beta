package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z70 implements RequestDelegate {
    public final int f30792a = 1;
    public final Context f30793b;
    public final long f30794c;
    public final int d;
    public final Object e;
    public final Object f30795f;
    public final Object f30796g;
    public final Object h;
    public final Object f30797i;

    public z70(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, yc ycVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f30793b = context;
        this.e = a1Var;
        this.f30794c = j3;
        this.f30795f = bArr;
        this.f30796g = aVar;
        this.h = ycVar;
        this.f30797i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30792a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.a2) this.e, tLObject, (AccountInstance) this.f30795f, (f80) this.f30796g, this.f30794c, this.f30793b, (org.telegram.ui.ActionBar.m2) this.h, this.d, (TLRPC.Peer) this.f30797i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f30795f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f30796g;
                yc ycVar = (yc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f30797i;
                Context context = this.f30793b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.aw(tLObject, context, a1Var, this.f30794c, bArr, aVar, ycVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.i31(aVar, ycVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.wl0(aVar, ycVar, this.d, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.i31(aVar, ycVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public z70(org.telegram.ui.ActionBar.a2 a2Var, AccountInstance accountInstance, f80 f80Var, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.e = a2Var;
        this.f30795f = accountInstance;
        this.f30796g = f80Var;
        this.f30794c = j3;
        this.f30793b = context;
        this.h = m2Var;
        this.d = i10;
        this.f30797i = peer;
    }
}
