package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class fr implements RequestDelegate {
    public final int f35263a;
    public final jr f35264b;
    public final hi.d f35265c;

    public fr(jr jrVar, hi.d dVar, int i7) {
        this.f35263a = i7;
        this.f35264b = jrVar;
        this.f35265c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35263a) {
            case 0:
                final jr jrVar = this.f35264b;
                final hi.d dVar = this.f35265c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                jr jrVar2 = jrVar;
                                jrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    jrVar2.X1 = groupcallstreamrtmpurl.url;
                                    jrVar2.Y1 = groupcallstreamrtmpurl.key;
                                    jrVar2.Z1 = new SpannableStringBuilder(jrVar2.Y1);
                                    jrVar2.f36541a2.O(true);
                                    return;
                                }
                                return;
                            default:
                                jr jrVar3 = jrVar;
                                jrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    jrVar3.X1 = groupcallstreamrtmpurl2.url;
                                    jrVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    jrVar3.Z1 = new SpannableStringBuilder(jrVar3.Y1);
                                    jrVar3.f36541a2.O(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final jr jrVar2 = this.f35264b;
                final hi.d dVar2 = this.f35265c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                jr jrVar22 = jrVar2;
                                jrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    jrVar22.X1 = groupcallstreamrtmpurl.url;
                                    jrVar22.Y1 = groupcallstreamrtmpurl.key;
                                    jrVar22.Z1 = new SpannableStringBuilder(jrVar22.Y1);
                                    jrVar22.f36541a2.O(true);
                                    return;
                                }
                                return;
                            default:
                                jr jrVar3 = jrVar2;
                                jrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    jrVar3.X1 = groupcallstreamrtmpurl2.url;
                                    jrVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    jrVar3.Z1 = new SpannableStringBuilder(jrVar3.Y1);
                                    jrVar3.f36541a2.O(true);
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
