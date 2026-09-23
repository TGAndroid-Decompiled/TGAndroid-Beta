package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p70 implements RequestDelegate {
    public final int f26957a = 1;
    public final Context f26958b;
    public final long f26959c;
    public final int d;
    public final Object e;
    public final Object f26960f;
    public final Object f26961g;
    public final Object h;
    public final Object f26962i;

    public p70(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, xc xcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f26958b = context;
        this.e = a1Var;
        this.f26959c = j3;
        this.f26960f = bArr;
        this.f26961g = aVar;
        this.h = xcVar;
        this.f26962i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26957a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.b2) this.e, tLObject, (AccountInstance) this.f26960f, (v70) this.f26961g, this.f26959c, this.f26958b, (org.telegram.ui.ActionBar.n2) this.h, this.d, (TLRPC.Peer) this.f26962i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f26960f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f26961g;
                xc xcVar = (xc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f26962i;
                Context context = this.f26958b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.bw(tLObject, context, a1Var, this.f26959c, bArr, aVar, xcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.j31(aVar, xcVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.yl0(aVar, xcVar, this.d, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.j31(aVar, xcVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public p70(org.telegram.ui.ActionBar.b2 b2Var, AccountInstance accountInstance, v70 v70Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.e = b2Var;
        this.f26960f = accountInstance;
        this.f26961g = v70Var;
        this.f26959c = j3;
        this.f26958b = context;
        this.h = n2Var;
        this.d = i10;
        this.f26962i = peer;
    }
}
