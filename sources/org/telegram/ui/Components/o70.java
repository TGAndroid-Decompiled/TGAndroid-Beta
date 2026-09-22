package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o70 implements RequestDelegate {
    public final int f26712a = 1;
    public final Context f26713b;
    public final long f26714c;
    public final int d;
    public final Object e;
    public final Object f26715f;
    public final Object f26716g;
    public final Object h;
    public final Object f26717i;

    public o70(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, vc vcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f26713b = context;
        this.e = a1Var;
        this.f26714c = j3;
        this.f26715f = bArr;
        this.f26716g = aVar;
        this.h = vcVar;
        this.f26717i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26712a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.b2) this.e, tLObject, (AccountInstance) this.f26715f, (u70) this.f26716g, this.f26714c, this.f26713b, (org.telegram.ui.ActionBar.n2) this.h, this.d, (TLRPC.Peer) this.f26717i));
                return;
            default:
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f26715f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f26716g;
                vc vcVar = (vc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f26717i;
                Context context = this.f26713b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ew(tLObject, context, a1Var, this.f26714c, bArr, aVar, vcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.r31(aVar, vcVar, context, a1Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.em0(aVar, vcVar, this.d, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.r31(aVar, vcVar, context, a1Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public o70(org.telegram.ui.ActionBar.b2 b2Var, AccountInstance accountInstance, u70 u70Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.e = b2Var;
        this.f26715f = accountInstance;
        this.f26716g = u70Var;
        this.f26714c = j3;
        this.f26713b = context;
        this.h = n2Var;
        this.d = i10;
        this.f26717i = peer;
    }
}
