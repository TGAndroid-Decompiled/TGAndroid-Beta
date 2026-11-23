package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class cr implements RequestDelegate {
    public final int f34110a;
    public final gr f34111b;
    public final hi.e f34112c;

    public cr(gr grVar, hi.e eVar, int i7) {
        this.f34110a = i7;
        this.f34111b = grVar;
        this.f34112c = eVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34110a) {
            case 0:
                final gr grVar = this.f34111b;
                final hi.e eVar = this.f34112c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                gr grVar2 = grVar;
                                grVar2.getClass();
                                eVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    grVar2.X1 = groupcallstreamrtmpurl.url;
                                    grVar2.Y1 = groupcallstreamrtmpurl.key;
                                    grVar2.Z1 = new SpannableStringBuilder(grVar2.Y1);
                                    grVar2.f35519a2.O(true);
                                    return;
                                }
                                return;
                            default:
                                gr grVar3 = grVar;
                                grVar3.getClass();
                                eVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    grVar3.X1 = groupcallstreamrtmpurl2.url;
                                    grVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    grVar3.Z1 = new SpannableStringBuilder(grVar3.Y1);
                                    grVar3.f35519a2.O(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final gr grVar2 = this.f34111b;
                final hi.e eVar2 = this.f34112c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                gr grVar22 = grVar2;
                                grVar22.getClass();
                                eVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    grVar22.X1 = groupcallstreamrtmpurl.url;
                                    grVar22.Y1 = groupcallstreamrtmpurl.key;
                                    grVar22.Z1 = new SpannableStringBuilder(grVar22.Y1);
                                    grVar22.f35519a2.O(true);
                                    return;
                                }
                                return;
                            default:
                                gr grVar3 = grVar2;
                                grVar3.getClass();
                                eVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    grVar3.X1 = groupcallstreamrtmpurl2.url;
                                    grVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    grVar3.Z1 = new SpannableStringBuilder(grVar3.Y1);
                                    grVar3.f35519a2.O(true);
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
