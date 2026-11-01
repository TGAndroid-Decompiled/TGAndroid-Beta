package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class zq implements RequestDelegate {
    public final int f33206a;
    public final cr f33207b;
    public final vh.d f33208c;

    public zq(cr crVar, vh.d dVar, int i10) {
        this.f33206a = i10;
        this.f33207b = crVar;
        this.f33208c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33206a) {
            case 0:
                final cr crVar = this.f33207b;
                final vh.d dVar = this.f33208c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                cr crVar2 = crVar;
                                crVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    crVar2.T1 = groupcallstreamrtmpurl.url;
                                    crVar2.U1 = groupcallstreamrtmpurl.key;
                                    crVar2.V1 = new SpannableStringBuilder(crVar2.U1);
                                    crVar2.W1.O(true);
                                    return;
                                }
                                return;
                            default:
                                cr crVar3 = crVar;
                                crVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    crVar3.T1 = groupcallstreamrtmpurl2.url;
                                    crVar3.U1 = groupcallstreamrtmpurl2.key;
                                    crVar3.V1 = new SpannableStringBuilder(crVar3.U1);
                                    crVar3.W1.O(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final cr crVar2 = this.f33207b;
                final vh.d dVar2 = this.f33208c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                cr crVar22 = crVar2;
                                crVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    crVar22.T1 = groupcallstreamrtmpurl.url;
                                    crVar22.U1 = groupcallstreamrtmpurl.key;
                                    crVar22.V1 = new SpannableStringBuilder(crVar22.U1);
                                    crVar22.W1.O(true);
                                    return;
                                }
                                return;
                            default:
                                cr crVar3 = crVar2;
                                crVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    crVar3.T1 = groupcallstreamrtmpurl2.url;
                                    crVar3.U1 = groupcallstreamrtmpurl2.key;
                                    crVar3.V1 = new SpannableStringBuilder(crVar3.U1);
                                    crVar3.W1.O(true);
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
