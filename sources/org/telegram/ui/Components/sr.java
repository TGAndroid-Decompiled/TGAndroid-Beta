package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class sr implements RequestDelegate {
    public final int f30343a;
    public final xr f30344b;
    public final ei.d f30345c;

    public sr(xr xrVar, ei.d dVar, int i10) {
        this.f30343a = i10;
        this.f30344b = xrVar;
        this.f30345c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30343a) {
            case 0:
                final xr xrVar = this.f30344b;
                final ei.d dVar = this.f30345c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                xr xrVar2 = xrVar;
                                xrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    xrVar2.f32467b0 = groupcallstreamrtmpurl.url;
                                    xrVar2.f32468c0 = groupcallstreamrtmpurl.key;
                                    xrVar2.f32469d0 = new SpannableStringBuilder(xrVar2.f32468c0);
                                    xrVar2.f32470e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                xr xrVar3 = xrVar;
                                xrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    xrVar3.f32467b0 = groupcallstreamrtmpurl2.url;
                                    xrVar3.f32468c0 = groupcallstreamrtmpurl2.key;
                                    xrVar3.f32469d0 = new SpannableStringBuilder(xrVar3.f32468c0);
                                    xrVar3.f32470e0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final xr xrVar2 = this.f30344b;
                final ei.d dVar2 = this.f30345c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                xr xrVar22 = xrVar2;
                                xrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    xrVar22.f32467b0 = groupcallstreamrtmpurl.url;
                                    xrVar22.f32468c0 = groupcallstreamrtmpurl.key;
                                    xrVar22.f32469d0 = new SpannableStringBuilder(xrVar22.f32468c0);
                                    xrVar22.f32470e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                xr xrVar3 = xrVar2;
                                xrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    xrVar3.f32467b0 = groupcallstreamrtmpurl2.url;
                                    xrVar3.f32468c0 = groupcallstreamrtmpurl2.key;
                                    xrVar3.f32469d0 = new SpannableStringBuilder(xrVar3.f32468c0);
                                    xrVar3.f32470e0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
