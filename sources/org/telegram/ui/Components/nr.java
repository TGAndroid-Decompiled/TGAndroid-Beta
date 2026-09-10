package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class nr implements RequestDelegate {
    public final int f25570a;
    public final sr f25571b;
    public final bi.d f25572c;

    public nr(sr srVar, bi.d dVar, int i10) {
        this.f25570a = i10;
        this.f25571b = srVar;
        this.f25572c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25570a) {
            case 0:
                final sr srVar = this.f25571b;
                final bi.d dVar = this.f25572c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                sr srVar2 = srVar;
                                srVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    srVar2.f27201b0 = groupcallstreamrtmpurl.url;
                                    srVar2.f27202c0 = groupcallstreamrtmpurl.key;
                                    srVar2.f27203d0 = new SpannableStringBuilder(srVar2.f27202c0);
                                    srVar2.f27204e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                sr srVar3 = srVar;
                                srVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    srVar3.f27201b0 = groupcallstreamrtmpurl2.url;
                                    srVar3.f27202c0 = groupcallstreamrtmpurl2.key;
                                    srVar3.f27203d0 = new SpannableStringBuilder(srVar3.f27202c0);
                                    srVar3.f27204e0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final sr srVar2 = this.f25571b;
                final bi.d dVar2 = this.f25572c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                sr srVar22 = srVar2;
                                srVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    srVar22.f27201b0 = groupcallstreamrtmpurl.url;
                                    srVar22.f27202c0 = groupcallstreamrtmpurl.key;
                                    srVar22.f27203d0 = new SpannableStringBuilder(srVar22.f27202c0);
                                    srVar22.f27204e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                sr srVar3 = srVar2;
                                srVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    srVar3.f27201b0 = groupcallstreamrtmpurl2.url;
                                    srVar3.f27202c0 = groupcallstreamrtmpurl2.key;
                                    srVar3.f27203d0 = new SpannableStringBuilder(srVar3.f27202c0);
                                    srVar3.f27204e0.N(true);
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
