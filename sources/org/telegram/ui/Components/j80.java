package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j80 implements RequestDelegate {
    public final int f27425a = 1;
    public final Context f27426b;
    public final long f27427c;
    public final int d;
    public final Object e;
    public final Object f27428f;
    public final Object f27429g;
    public final Object h;
    public final Object f27430i;

    public j80(Context context, ci.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, xc xcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f27426b = context;
        this.e = k0Var;
        this.f27427c = j10;
        this.f27428f = bArr;
        this.f27429g = aVar;
        this.h = xcVar;
        this.f27430i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27425a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gi.d1((org.telegram.ui.ActionBar.b2) this.e, tLObject, (AccountInstance) this.f27428f, (p80) this.f27429g, this.f27427c, this.f27426b, (org.telegram.ui.ActionBar.n2) this.h, this.d, (TLRPC.Peer) this.f27430i));
                return;
            default:
                ci.k0 k0Var = (ci.k0) this.e;
                byte[] bArr = (byte[]) this.f27428f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f27429g;
                xc xcVar = (xc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f27430i;
                Context context = this.f27426b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ai.q4(tLObject, context, k0Var, this.f27427c, bArr, aVar, xcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.d21(aVar, xcVar, context, k0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new y31(aVar, xcVar, this.d, 14), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.d21(aVar, xcVar, context, k0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public j80(org.telegram.ui.ActionBar.b2 b2Var, AccountInstance accountInstance, p80 p80Var, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.e = b2Var;
        this.f27428f = accountInstance;
        this.f27429g = p80Var;
        this.f27427c = j10;
        this.f27426b = context;
        this.h = n2Var;
        this.d = i10;
        this.f27430i = peer;
    }
}
