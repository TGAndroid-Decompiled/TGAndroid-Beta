package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class c70 implements RequestDelegate {

    public final int f27348a = 1;

    public final Context f27349b;

    public final long f27350c;
    public final int d;

    public final Object f27351e;

    public final Object f27352f;

    public final Object f27353g;
    public final Object h;

    public final Object f27354i;

    public c70(Context context, jh.h0 h0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, mc mcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.f27349b = context;
        this.f27351e = h0Var;
        this.f27350c = j10;
        this.f27352f = bArr;
        this.f27353g = aVar;
        this.h = mcVar;
        this.f27354i = dVar;
        this.d = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27348a) {
            case 0:
                AndroidUtilities.runOnUIThread(new nh.c1((org.telegram.ui.ActionBar.b2) this.f27351e, tLObject, (AccountInstance) this.f27352f, (i70) this.f27353g, this.f27350c, this.f27349b, (org.telegram.ui.ActionBar.n2) this.h, this.d, (TLRPC.Peer) this.f27354i));
                break;
            default:
                jh.h0 h0Var = (jh.h0) this.f27351e;
                byte[] bArr = (byte[]) this.f27352f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f27353g;
                mc mcVar = (mc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f27354i;
                Context context = this.f27349b;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new hh.b3(tLObject, context, h0Var, this.f27350c, bArr, aVar, mcVar, dVar));
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.k21(aVar, mcVar, context, h0Var, 0), 200L);
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ol0(aVar, mcVar, this.d, 8), 200L);
                    }
                    break;
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.k21(aVar, mcVar, context, h0Var, 1), 200L);
                    break;
                }
                break;
        }
    }

    public c70(org.telegram.ui.ActionBar.b2 b2Var, AccountInstance accountInstance, i70 i70Var, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f27351e = b2Var;
        this.f27352f = accountInstance;
        this.f27353g = i70Var;
        this.f27350c = j10;
        this.f27349b = context;
        this.h = n2Var;
        this.d = i10;
        this.f27354i = peer;
    }
}
