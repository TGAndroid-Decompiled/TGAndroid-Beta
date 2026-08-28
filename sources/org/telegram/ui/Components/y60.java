package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y60 implements RequestDelegate {
    public final int f34871a = 1;
    public final Context f34872b;
    public final long f34873c;
    public final int d;
    public final Object f34874e;
    public final Object f34875f;
    public final Object f34876g;
    public final Object h;
    public final Object f34877i;

    public y60(Context context, ih.j0 j0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, oc ocVar, org.telegram.messenger.video.d dVar, int i9) {
        this.f34872b = context;
        this.f34874e = j0Var;
        this.f34873c = j10;
        this.f34875f = bArr;
        this.f34876g = aVar;
        this.h = ocVar;
        this.f34877i = dVar;
        this.d = i9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34871a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mh.d1((org.telegram.ui.ActionBar.c2) this.f34874e, tLObject, (AccountInstance) this.f34875f, (e70) this.f34876g, this.f34873c, this.f34872b, (org.telegram.ui.ActionBar.o2) this.h, this.d, (TLRPC.Peer) this.f34877i));
                return;
            default:
                ih.j0 j0Var = (ih.j0) this.f34874e;
                byte[] bArr = (byte[]) this.f34875f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f34876g;
                oc ocVar = (oc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f34877i;
                Context context = this.f34872b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new gh.b3(tLObject, context, j0Var, this.f34873c, bArr, aVar, ocVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.l21(aVar, ocVar, context, j0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.jh0(aVar, ocVar, this.d, 9), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.l21(aVar, ocVar, context, j0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public y60(org.telegram.ui.ActionBar.c2 c2Var, AccountInstance accountInstance, e70 e70Var, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i9, TLRPC.Peer peer) {
        this.f34874e = c2Var;
        this.f34875f = accountInstance;
        this.f34876g = e70Var;
        this.f34873c = j10;
        this.f34872b = context;
        this.h = o2Var;
        this.d = i9;
        this.f34877i = peer;
    }
}
