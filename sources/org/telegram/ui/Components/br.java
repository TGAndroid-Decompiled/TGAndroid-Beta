package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class br implements RequestDelegate {
    public final int f27206a;
    public final fr f27207b;
    public final nh.d f27208c;

    public br(fr frVar, nh.d dVar, int i10) {
        this.f27206a = i10;
        this.f27207b = frVar;
        this.f27208c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27206a) {
            case 0:
                final fr frVar = this.f27207b;
                final nh.d dVar = this.f27208c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                fr frVar2 = frVar;
                                frVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    frVar2.X = groupcallstreamrtmpurl.url;
                                    frVar2.Y = groupcallstreamrtmpurl.key;
                                    frVar2.Z = new SpannableStringBuilder(frVar2.Y);
                                    frVar2.f28520a0.N(true);
                                    return;
                                }
                                return;
                            default:
                                fr frVar3 = frVar;
                                frVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    frVar3.X = groupcallstreamrtmpurl2.url;
                                    frVar3.Y = groupcallstreamrtmpurl2.key;
                                    frVar3.Z = new SpannableStringBuilder(frVar3.Y);
                                    frVar3.f28520a0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final fr frVar2 = this.f27207b;
                final nh.d dVar2 = this.f27208c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                fr frVar22 = frVar2;
                                frVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    frVar22.X = groupcallstreamrtmpurl.url;
                                    frVar22.Y = groupcallstreamrtmpurl.key;
                                    frVar22.Z = new SpannableStringBuilder(frVar22.Y);
                                    frVar22.f28520a0.N(true);
                                    return;
                                }
                                return;
                            default:
                                fr frVar3 = frVar2;
                                frVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    frVar3.X = groupcallstreamrtmpurl2.url;
                                    frVar3.Y = groupcallstreamrtmpurl2.key;
                                    frVar3.Z = new SpannableStringBuilder(frVar3.Y);
                                    frVar3.f28520a0.N(true);
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
