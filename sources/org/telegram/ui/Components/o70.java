package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o70 implements RequestDelegate {
    public final int f26648a = 1;
    public final Context f26649b;
    public final long f26650c;
    public final int d;
    public final Object e;
    public final Object f26651f;
    public final Object f26652g;
    public final Object h;
    public final Object f26653i;

    public o70(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, vc vcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f26649b = context;
        this.e = a1Var;
        this.f26650c = j3;
        this.f26651f = bArr;
        this.f26652g = aVar;
        this.h = vcVar;
        this.f26653i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26648a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.c2) this.e, tLObject, (AccountInstance) this.f26651f, (u70) this.f26652g, this.f26650c, this.f26649b, (org.telegram.ui.ActionBar.o2) this.h, this.d, (TLRPC.Peer) this.f26653i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f26651f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f26652g;
                vc vcVar = (vc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f26653i;
                Context context = this.f26649b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.gw(tLObject, context, a1Var, this.f26650c, bArr, aVar, vcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.s31(aVar, vcVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.gm0(aVar, vcVar, this.d, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.s31(aVar, vcVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public o70(org.telegram.ui.ActionBar.c2 c2Var, AccountInstance accountInstance, u70 u70Var, long j3, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer) {
        this.e = c2Var;
        this.f26651f = accountInstance;
        this.f26652g = u70Var;
        this.f26650c = j3;
        this.f26649b = context;
        this.h = o2Var;
        this.d = i10;
        this.f26653i = peer;
    }
}
