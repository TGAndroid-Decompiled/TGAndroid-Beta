package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class qr implements RequestDelegate {
    public final int f29979a;
    public final vr f29980b;
    public final ei.d f29981c;

    public qr(vr vrVar, ei.d dVar, int i10) {
        this.f29979a = i10;
        this.f29980b = vrVar;
        this.f29981c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f29979a) {
            case 0:
                final vr vrVar = this.f29980b;
                final ei.d dVar = this.f29981c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                vr vrVar2 = vrVar;
                                vrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    vrVar2.f32023b0 = groupcallstreamrtmpurl.url;
                                    vrVar2.f32024c0 = groupcallstreamrtmpurl.key;
                                    vrVar2.f32025d0 = new SpannableStringBuilder(vrVar2.f32024c0);
                                    vrVar2.f32026e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                vr vrVar3 = vrVar;
                                vrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    vrVar3.f32023b0 = groupcallstreamrtmpurl2.url;
                                    vrVar3.f32024c0 = groupcallstreamrtmpurl2.key;
                                    vrVar3.f32025d0 = new SpannableStringBuilder(vrVar3.f32024c0);
                                    vrVar3.f32026e0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final vr vrVar2 = this.f29980b;
                final ei.d dVar2 = this.f29981c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                vr vrVar22 = vrVar2;
                                vrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    vrVar22.f32023b0 = groupcallstreamrtmpurl.url;
                                    vrVar22.f32024c0 = groupcallstreamrtmpurl.key;
                                    vrVar22.f32025d0 = new SpannableStringBuilder(vrVar22.f32024c0);
                                    vrVar22.f32026e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                vr vrVar3 = vrVar2;
                                vrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    vrVar3.f32023b0 = groupcallstreamrtmpurl2.url;
                                    vrVar3.f32024c0 = groupcallstreamrtmpurl2.key;
                                    vrVar3.f32025d0 = new SpannableStringBuilder(vrVar3.f32024c0);
                                    vrVar3.f32026e0.N(true);
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
