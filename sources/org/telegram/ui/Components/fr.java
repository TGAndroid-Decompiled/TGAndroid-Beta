package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class fr implements RequestDelegate {
    public final int f35307a;
    public final jr f35308b;
    public final hi.e f35309c;

    public fr(jr jrVar, hi.e eVar, int i7) {
        this.f35307a = i7;
        this.f35308b = jrVar;
        this.f35309c = eVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35307a) {
            case 0:
                final jr jrVar = this.f35308b;
                final hi.e eVar = this.f35309c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                jr jrVar2 = jrVar;
                                jrVar2.getClass();
                                eVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    jrVar2.X1 = groupcallstreamrtmpurl.url;
                                    jrVar2.Y1 = groupcallstreamrtmpurl.key;
                                    jrVar2.Z1 = new SpannableStringBuilder(jrVar2.Y1);
                                    jrVar2.f36586a2.O(true);
                                    return;
                                }
                                return;
                            default:
                                jr jrVar3 = jrVar;
                                jrVar3.getClass();
                                eVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    jrVar3.X1 = groupcallstreamrtmpurl2.url;
                                    jrVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    jrVar3.Z1 = new SpannableStringBuilder(jrVar3.Y1);
                                    jrVar3.f36586a2.O(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final jr jrVar2 = this.f35308b;
                final hi.e eVar2 = this.f35309c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                jr jrVar22 = jrVar2;
                                jrVar22.getClass();
                                eVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    jrVar22.X1 = groupcallstreamrtmpurl.url;
                                    jrVar22.Y1 = groupcallstreamrtmpurl.key;
                                    jrVar22.Z1 = new SpannableStringBuilder(jrVar22.Y1);
                                    jrVar22.f36586a2.O(true);
                                    return;
                                }
                                return;
                            default:
                                jr jrVar3 = jrVar2;
                                jrVar3.getClass();
                                eVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    jrVar3.X1 = groupcallstreamrtmpurl2.url;
                                    jrVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    jrVar3.Z1 = new SpannableStringBuilder(jrVar3.Y1);
                                    jrVar3.f36586a2.O(true);
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
