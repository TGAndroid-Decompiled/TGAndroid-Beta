package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class oq implements RequestDelegate {
    public final int f36664a;
    public final sq f36665b;
    public final fi.d f36666c;

    public oq(sq sqVar, fi.d dVar, int i7) {
        this.f36664a = i7;
        this.f36665b = sqVar;
        this.f36666c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36664a) {
            case 0:
                final sq sqVar = this.f36665b;
                final fi.d dVar = this.f36666c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                sq sqVar2 = sqVar;
                                sqVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    sqVar2.W1 = groupcallstreamrtmpurl.url;
                                    sqVar2.X1 = groupcallstreamrtmpurl.key;
                                    sqVar2.Y1 = new SpannableStringBuilder(sqVar2.X1);
                                    sqVar2.Z1.O(true);
                                    return;
                                }
                                return;
                            default:
                                sq sqVar3 = sqVar;
                                sqVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    sqVar3.W1 = groupcallstreamrtmpurl2.url;
                                    sqVar3.X1 = groupcallstreamrtmpurl2.key;
                                    sqVar3.Y1 = new SpannableStringBuilder(sqVar3.X1);
                                    sqVar3.Z1.O(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final sq sqVar2 = this.f36665b;
                final fi.d dVar2 = this.f36666c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                sq sqVar22 = sqVar2;
                                sqVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    sqVar22.W1 = groupcallstreamrtmpurl.url;
                                    sqVar22.X1 = groupcallstreamrtmpurl.key;
                                    sqVar22.Y1 = new SpannableStringBuilder(sqVar22.X1);
                                    sqVar22.Z1.O(true);
                                    return;
                                }
                                return;
                            default:
                                sq sqVar3 = sqVar2;
                                sqVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    sqVar3.W1 = groupcallstreamrtmpurl2.url;
                                    sqVar3.X1 = groupcallstreamrtmpurl2.key;
                                    sqVar3.Y1 = new SpannableStringBuilder(sqVar3.X1);
                                    sqVar3.Z1.O(true);
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
