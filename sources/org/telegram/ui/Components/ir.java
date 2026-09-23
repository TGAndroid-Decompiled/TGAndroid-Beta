package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class ir implements RequestDelegate {
    public final int f25049a;
    public final nr f25050b;
    public final ci.d f25051c;

    public ir(nr nrVar, ci.d dVar, int i10) {
        this.f25049a = i10;
        this.f25050b = nrVar;
        this.f25051c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25049a) {
            case 0:
                final nr nrVar = this.f25050b;
                final ci.d dVar = this.f25051c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                nr nrVar2 = nrVar;
                                nrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    nrVar2.f26498b0 = groupcallstreamrtmpurl.url;
                                    nrVar2.f26499c0 = groupcallstreamrtmpurl.key;
                                    nrVar2.f26500d0 = new SpannableStringBuilder(nrVar2.f26499c0);
                                    nrVar2.f26501e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                nr nrVar3 = nrVar;
                                nrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    nrVar3.f26498b0 = groupcallstreamrtmpurl2.url;
                                    nrVar3.f26499c0 = groupcallstreamrtmpurl2.key;
                                    nrVar3.f26500d0 = new SpannableStringBuilder(nrVar3.f26499c0);
                                    nrVar3.f26501e0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final nr nrVar2 = this.f25050b;
                final ci.d dVar2 = this.f25051c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                nr nrVar22 = nrVar2;
                                nrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    nrVar22.f26498b0 = groupcallstreamrtmpurl.url;
                                    nrVar22.f26499c0 = groupcallstreamrtmpurl.key;
                                    nrVar22.f26500d0 = new SpannableStringBuilder(nrVar22.f26499c0);
                                    nrVar22.f26501e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                nr nrVar3 = nrVar2;
                                nrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    nrVar3.f26498b0 = groupcallstreamrtmpurl2.url;
                                    nrVar3.f26499c0 = groupcallstreamrtmpurl2.key;
                                    nrVar3.f26500d0 = new SpannableStringBuilder(nrVar3.f26499c0);
                                    nrVar3.f26501e0.N(true);
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
