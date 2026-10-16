package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m80 implements RequestDelegate {
    public final int f27001a = 1;
    public final Context f27002b;
    public final long f27003c;
    public final int d;
    public final Object e;
    public final Object f27004f;
    public final Object f27005g;
    public final Object h;
    public final Object f27006i;

    public m80(Context context, bi.s0 s0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, zc zcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f27002b = context;
        this.e = s0Var;
        this.f27003c = j10;
        this.f27004f = bArr;
        this.f27005g = aVar;
        this.h = zcVar;
        this.f27006i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27001a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fi.f1((org.telegram.ui.ActionBar.a2) this.e, tLObject, (AccountInstance) this.f27004f, (t80) this.f27005g, this.f27003c, this.f27002b, (org.telegram.ui.ActionBar.m2) this.h, this.d, (TLRPC.Peer) this.f27006i));
                return;
            default:
                bi.s0 s0Var = (bi.s0) this.e;
                byte[] bArr = (byte[]) this.f27004f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f27005g;
                zc zcVar = (zc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f27006i;
                Context context = this.f27002b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.iw(tLObject, context, s0Var, this.f27003c, bArr, aVar, zcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.x31(aVar, zcVar, context, s0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.c90(aVar, zcVar, this.d, 10), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.x31(aVar, zcVar, context, s0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public m80(org.telegram.ui.ActionBar.a2 a2Var, AccountInstance accountInstance, t80 t80Var, long j10, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.e = a2Var;
        this.f27004f = accountInstance;
        this.f27005g = t80Var;
        this.f27003c = j10;
        this.f27002b = context;
        this.h = m2Var;
        this.d = i10;
        this.f27006i = peer;
    }
}
