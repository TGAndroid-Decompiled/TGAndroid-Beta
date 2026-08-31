package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class hr implements RequestDelegate {
    public final int f27562a;
    public final lr f27563b;
    public final qh.d f27564c;

    public hr(lr lrVar, qh.d dVar, int i10) {
        this.f27562a = i10;
        this.f27563b = lrVar;
        this.f27564c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27562a) {
            case 0:
                final lr lrVar = this.f27563b;
                final qh.d dVar = this.f27564c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                lr lrVar2 = lrVar;
                                lrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    lrVar2.Y = groupcallstreamrtmpurl.url;
                                    lrVar2.Z = groupcallstreamrtmpurl.key;
                                    lrVar2.f28808a0 = new SpannableStringBuilder(lrVar2.Z);
                                    lrVar2.f28809b0.N(true);
                                    return;
                                }
                                return;
                            default:
                                lr lrVar3 = lrVar;
                                lrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    lrVar3.Y = groupcallstreamrtmpurl2.url;
                                    lrVar3.Z = groupcallstreamrtmpurl2.key;
                                    lrVar3.f28808a0 = new SpannableStringBuilder(lrVar3.Z);
                                    lrVar3.f28809b0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final lr lrVar2 = this.f27563b;
                final qh.d dVar2 = this.f27564c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                lr lrVar22 = lrVar2;
                                lrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    lrVar22.Y = groupcallstreamrtmpurl.url;
                                    lrVar22.Z = groupcallstreamrtmpurl.key;
                                    lrVar22.f28808a0 = new SpannableStringBuilder(lrVar22.Z);
                                    lrVar22.f28809b0.N(true);
                                    return;
                                }
                                return;
                            default:
                                lr lrVar3 = lrVar2;
                                lrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    lrVar3.Y = groupcallstreamrtmpurl2.url;
                                    lrVar3.Z = groupcallstreamrtmpurl2.key;
                                    lrVar3.f28808a0 = new SpannableStringBuilder(lrVar3.Z);
                                    lrVar3.f28809b0.N(true);
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
