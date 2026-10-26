package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l80 implements RequestDelegate {
    public final int f30103a = 1;
    public final Context f30104b;
    public final long f30105c;
    public final int d;
    public final Object e;
    public final Object f30106f;
    public final Object f30107g;
    public final Object h;
    public final Object f30108i;

    public l80(Context context, di.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, wc wcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f30104b = context;
        this.e = k0Var;
        this.f30105c = j10;
        this.f30106f = bArr;
        this.f30107g = aVar;
        this.h = wcVar;
        this.f30108i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30103a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hi.k1((org.telegram.ui.ActionBar.e2) this.e, tLObject, (AccountInstance) this.f30106f, (r80) this.f30107g, this.f30105c, this.f30104b, (org.telegram.ui.ActionBar.r2) this.h, this.d, (TLRPC.Peer) this.f30108i));
                return;
            default:
                di.k0 k0Var = (di.k0) this.e;
                byte[] bArr = (byte[]) this.f30106f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f30107g;
                wc wcVar = (wc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f30108i;
                Context context = this.f30104b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new bi.l4(tLObject, context, k0Var, this.f30105c, bArr, aVar, wcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.k21(aVar, wcVar, context, k0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.yx(aVar, wcVar, this.d, 12), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.k21(aVar, wcVar, context, k0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public l80(org.telegram.ui.ActionBar.e2 e2Var, AccountInstance accountInstance, r80 r80Var, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.Peer peer) {
        this.e = e2Var;
        this.f30106f = accountInstance;
        this.f30107g = r80Var;
        this.f30105c = j10;
        this.f30104b = context;
        this.h = r2Var;
        this.d = i10;
        this.f30108i = peer;
    }
}
