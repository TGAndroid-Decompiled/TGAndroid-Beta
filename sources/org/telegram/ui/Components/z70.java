package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z70 implements RequestDelegate {
    public final int f30803a = 1;
    public final Context f30804b;
    public final long f30805c;
    public final int d;
    public final Object e;
    public final Object f30806f;
    public final Object f30807g;
    public final Object h;
    public final Object f30808i;

    public z70(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, xc xcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f30804b = context;
        this.e = a1Var;
        this.f30805c = j3;
        this.f30806f = bArr;
        this.f30807g = aVar;
        this.h = xcVar;
        this.f30808i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30803a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.a2) this.e, tLObject, (AccountInstance) this.f30806f, (f80) this.f30807g, this.f30805c, this.f30804b, (org.telegram.ui.ActionBar.m2) this.h, this.d, (TLRPC.Peer) this.f30808i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f30806f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f30807g;
                xc xcVar = (xc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f30808i;
                Context context = this.f30804b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.aw(tLObject, context, a1Var, this.f30805c, bArr, aVar, xcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.i31(aVar, xcVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.wl0(aVar, xcVar, this.d, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.i31(aVar, xcVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public z70(org.telegram.ui.ActionBar.a2 a2Var, AccountInstance accountInstance, f80 f80Var, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.e = a2Var;
        this.f30806f = accountInstance;
        this.f30807g = f80Var;
        this.f30805c = j3;
        this.f30804b = context;
        this.h = m2Var;
        this.d = i10;
        this.f30808i = peer;
    }
}
