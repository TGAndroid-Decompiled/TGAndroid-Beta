package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r80 implements RequestDelegate {
    public final int f30417a = 1;
    public final Context f30418b;
    public final long f30419c;
    public final int d;
    public final Object f30420e;
    public final Object f30421f;
    public final Object f30422g;
    public final Object h;
    public final Object f30423i;

    public r80(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, ad adVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f30418b = context;
        this.f30420e = a1Var;
        this.f30419c = j3;
        this.f30421f = bArr;
        this.f30422g = aVar;
        this.h = adVar;
        this.f30423i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30417a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.b2) this.f30420e, tLObject, (AccountInstance) this.f30421f, (x80) this.f30422g, this.f30419c, this.f30418b, (org.telegram.ui.ActionBar.n2) this.h, this.d, (TLRPC.Peer) this.f30423i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.f30420e;
                byte[] bArr = (byte[]) this.f30421f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f30422g;
                ad adVar = (ad) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f30423i;
                Context context = this.f30418b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.dw(tLObject, context, a1Var, this.f30419c, bArr, aVar, adVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.r31(aVar, adVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.bi0(aVar, adVar, this.d, 9), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.r31(aVar, adVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public r80(org.telegram.ui.ActionBar.b2 b2Var, AccountInstance accountInstance, x80 x80Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f30420e = b2Var;
        this.f30421f = accountInstance;
        this.f30422g = x80Var;
        this.f30419c = j3;
        this.f30418b = context;
        this.h = n2Var;
        this.d = i10;
        this.f30423i = peer;
    }
}
