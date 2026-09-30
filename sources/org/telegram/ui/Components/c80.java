package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c80 implements RequestDelegate {
    public final int f23186a = 1;
    public final Context f23187b;
    public final long f23188c;
    public final int d;
    public final Object e;
    public final Object f23189f;
    public final Object f23190g;
    public final Object h;
    public final Object f23191i;

    public c80(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, yc ycVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f23187b = context;
        this.e = a1Var;
        this.f23188c = j3;
        this.f23189f = bArr;
        this.f23190g = aVar;
        this.h = ycVar;
        this.f23191i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23186a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.a2) this.e, tLObject, (AccountInstance) this.f23189f, (i80) this.f23190g, this.f23188c, this.f23187b, (org.telegram.ui.ActionBar.m2) this.h, this.d, (TLRPC.Peer) this.f23191i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f23189f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f23190g;
                yc ycVar = (yc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f23191i;
                Context context = this.f23187b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.aw(tLObject, context, a1Var, this.f23188c, bArr, aVar, ycVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.i31(aVar, ycVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.vl0(aVar, ycVar, this.d, 8), 200L);
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

    public c80(org.telegram.ui.ActionBar.a2 a2Var, AccountInstance accountInstance, i80 i80Var, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.e = a2Var;
        this.f23189f = accountInstance;
        this.f23190g = i80Var;
        this.f23188c = j3;
        this.f23187b = context;
        this.h = m2Var;
        this.d = i10;
        this.f23191i = peer;
    }
}
