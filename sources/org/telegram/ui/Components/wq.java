package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class wq implements RequestDelegate {
    public final int f41423a;
    public final ar f41424b;
    public final hi.d f41425c;

    public wq(ar arVar, hi.d dVar, int i7) {
        this.f41423a = i7;
        this.f41424b = arVar;
        this.f41425c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41423a) {
            case 0:
                final ar arVar = this.f41424b;
                final hi.d dVar = this.f41425c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ar arVar2 = arVar;
                                arVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    arVar2.X1 = groupcallstreamrtmpurl.url;
                                    arVar2.Y1 = groupcallstreamrtmpurl.key;
                                    arVar2.Z1 = new SpannableStringBuilder(arVar2.Y1);
                                    arVar2.f33044a2.O(true);
                                    return;
                                }
                                return;
                            default:
                                ar arVar3 = arVar;
                                arVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    arVar3.X1 = groupcallstreamrtmpurl2.url;
                                    arVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    arVar3.Z1 = new SpannableStringBuilder(arVar3.Y1);
                                    arVar3.f33044a2.O(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final ar arVar2 = this.f41424b;
                final hi.d dVar2 = this.f41425c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ar arVar22 = arVar2;
                                arVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    arVar22.X1 = groupcallstreamrtmpurl.url;
                                    arVar22.Y1 = groupcallstreamrtmpurl.key;
                                    arVar22.Z1 = new SpannableStringBuilder(arVar22.Y1);
                                    arVar22.f33044a2.O(true);
                                    return;
                                }
                                return;
                            default:
                                ar arVar3 = arVar2;
                                arVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    arVar3.X1 = groupcallstreamrtmpurl2.url;
                                    arVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    arVar3.Z1 = new SpannableStringBuilder(arVar3.Y1);
                                    arVar3.f33044a2.O(true);
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
