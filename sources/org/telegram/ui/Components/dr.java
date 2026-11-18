package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class dr implements RequestDelegate {
    public final int f34487a;
    public final hr f34488b;
    public final hi.d f34489c;

    public dr(hr hrVar, hi.d dVar, int i7) {
        this.f34487a = i7;
        this.f34488b = hrVar;
        this.f34489c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34487a) {
            case 0:
                final hr hrVar = this.f34488b;
                final hi.d dVar = this.f34489c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                hr hrVar2 = hrVar;
                                hrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    hrVar2.X1 = groupcallstreamrtmpurl.url;
                                    hrVar2.Y1 = groupcallstreamrtmpurl.key;
                                    hrVar2.Z1 = new SpannableStringBuilder(hrVar2.Y1);
                                    hrVar2.f35952a2.O(true);
                                    return;
                                }
                                return;
                            default:
                                hr hrVar3 = hrVar;
                                hrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    hrVar3.X1 = groupcallstreamrtmpurl2.url;
                                    hrVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    hrVar3.Z1 = new SpannableStringBuilder(hrVar3.Y1);
                                    hrVar3.f35952a2.O(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final hr hrVar2 = this.f34488b;
                final hi.d dVar2 = this.f34489c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                hr hrVar22 = hrVar2;
                                hrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    hrVar22.X1 = groupcallstreamrtmpurl.url;
                                    hrVar22.Y1 = groupcallstreamrtmpurl.key;
                                    hrVar22.Z1 = new SpannableStringBuilder(hrVar22.Y1);
                                    hrVar22.f35952a2.O(true);
                                    return;
                                }
                                return;
                            default:
                                hr hrVar3 = hrVar2;
                                hrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    hrVar3.X1 = groupcallstreamrtmpurl2.url;
                                    hrVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    hrVar3.Z1 = new SpannableStringBuilder(hrVar3.Y1);
                                    hrVar3.f35952a2.O(true);
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
