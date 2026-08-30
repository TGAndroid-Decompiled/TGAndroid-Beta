package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class fr implements RequestDelegate {
    public final int f24937a;
    public final jr f24938b;
    public final ph.d f24939c;

    public fr(jr jrVar, ph.d dVar, int i10) {
        this.f24937a = i10;
        this.f24938b = jrVar;
        this.f24939c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24937a) {
            case 0:
                final jr jrVar = this.f24938b;
                final ph.d dVar = this.f24939c;
                AndroidUtilities.runOnUIThread(new Runnable() {
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
                                    jrVar2.Y = groupcallstreamrtmpurl.url;
                                    jrVar2.Z = groupcallstreamrtmpurl.key;
                                    jrVar2.f26023a0 = new SpannableStringBuilder(jrVar2.Z);
                                    jrVar2.f26024b0.N(true);
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
                                    jrVar3.Y = groupcallstreamrtmpurl2.url;
                                    jrVar3.Z = groupcallstreamrtmpurl2.key;
                                    jrVar3.f26023a0 = new SpannableStringBuilder(jrVar3.Z);
                                    jrVar3.f26024b0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final jr jrVar2 = this.f24938b;
                final ph.d dVar2 = this.f24939c;
                AndroidUtilities.runOnUIThread(new Runnable() {
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
                                    jrVar22.Y = groupcallstreamrtmpurl.url;
                                    jrVar22.Z = groupcallstreamrtmpurl.key;
                                    jrVar22.f26023a0 = new SpannableStringBuilder(jrVar22.Z);
                                    jrVar22.f26024b0.N(true);
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
                                    jrVar3.Y = groupcallstreamrtmpurl2.url;
                                    jrVar3.Z = groupcallstreamrtmpurl2.key;
                                    jrVar3.f26023a0 = new SpannableStringBuilder(jrVar3.Z);
                                    jrVar3.f26024b0.N(true);
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
