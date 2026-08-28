package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class xq implements RequestDelegate {
    public final int f34740a;
    public final cr f34741b;
    public final kh.d f34742c;

    public xq(cr crVar, kh.d dVar, int i9) {
        this.f34740a = i9;
        this.f34741b = crVar;
        this.f34742c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34740a) {
            case 0:
                final cr crVar = this.f34741b;
                final kh.d dVar = this.f34742c;
                AndroidUtilities.runOnUIThread(new Runnable() {
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
                                    crVar2.X = groupcallstreamrtmpurl.url;
                                    crVar2.Y = groupcallstreamrtmpurl.key;
                                    crVar2.Z = new SpannableStringBuilder(crVar2.Y);
                                    crVar2.f27556a0.N(true);
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
                                    crVar3.X = groupcallstreamrtmpurl2.url;
                                    crVar3.Y = groupcallstreamrtmpurl2.key;
                                    crVar3.Z = new SpannableStringBuilder(crVar3.Y);
                                    crVar3.f27556a0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final cr crVar2 = this.f34741b;
                final kh.d dVar2 = this.f34742c;
                AndroidUtilities.runOnUIThread(new Runnable() {
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
                                    crVar22.X = groupcallstreamrtmpurl.url;
                                    crVar22.Y = groupcallstreamrtmpurl.key;
                                    crVar22.Z = new SpannableStringBuilder(crVar22.Y);
                                    crVar22.f27556a0.N(true);
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
                                    crVar3.X = groupcallstreamrtmpurl2.url;
                                    crVar3.Y = groupcallstreamrtmpurl2.key;
                                    crVar3.Z = new SpannableStringBuilder(crVar3.Y);
                                    crVar3.f27556a0.N(true);
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
