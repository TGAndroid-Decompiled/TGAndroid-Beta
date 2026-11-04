package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class pq implements RequestDelegate {
    public final int f37219a;
    public final tq f37220b;
    public final gi.d f37221c;

    public pq(tq tqVar, gi.d dVar, int i3) {
        this.f37219a = i3;
        this.f37220b = tqVar;
        this.f37221c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37219a) {
            case 0:
                final tq tqVar = this.f37220b;
                final gi.d dVar = this.f37221c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                tq tqVar2 = tqVar;
                                tqVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    tqVar2.U1 = groupcallstreamrtmpurl.url;
                                    tqVar2.V1 = groupcallstreamrtmpurl.key;
                                    tqVar2.W1 = new SpannableStringBuilder(tqVar2.V1);
                                    tqVar2.X1.O(true);
                                    return;
                                }
                                return;
                            default:
                                tq tqVar3 = tqVar;
                                tqVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    tqVar3.U1 = groupcallstreamrtmpurl2.url;
                                    tqVar3.V1 = groupcallstreamrtmpurl2.key;
                                    tqVar3.W1 = new SpannableStringBuilder(tqVar3.V1);
                                    tqVar3.X1.O(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final tq tqVar2 = this.f37220b;
                final gi.d dVar2 = this.f37221c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                tq tqVar22 = tqVar2;
                                tqVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    tqVar22.U1 = groupcallstreamrtmpurl.url;
                                    tqVar22.V1 = groupcallstreamrtmpurl.key;
                                    tqVar22.W1 = new SpannableStringBuilder(tqVar22.V1);
                                    tqVar22.X1.O(true);
                                    return;
                                }
                                return;
                            default:
                                tq tqVar3 = tqVar2;
                                tqVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    tqVar3.U1 = groupcallstreamrtmpurl2.url;
                                    tqVar3.V1 = groupcallstreamrtmpurl2.key;
                                    tqVar3.W1 = new SpannableStringBuilder(tqVar3.V1);
                                    tqVar3.X1.O(true);
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
