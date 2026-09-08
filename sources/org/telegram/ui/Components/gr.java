package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class gr implements RequestDelegate {
    public final int f26518a;
    public final lr f26519b;
    public final di.d f26520c;

    public gr(lr lrVar, di.d dVar, int i10) {
        this.f26518a = i10;
        this.f26519b = lrVar;
        this.f26520c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26518a) {
            case 0:
                final lr lrVar = this.f26519b;
                final di.d dVar = this.f26520c;
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
                                    lrVar2.f28319b0 = groupcallstreamrtmpurl.url;
                                    lrVar2.f28320c0 = groupcallstreamrtmpurl.key;
                                    lrVar2.f28321d0 = new SpannableStringBuilder(lrVar2.f28320c0);
                                    lrVar2.f28322e0.N(true);
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
                                    lrVar3.f28319b0 = groupcallstreamrtmpurl2.url;
                                    lrVar3.f28320c0 = groupcallstreamrtmpurl2.key;
                                    lrVar3.f28321d0 = new SpannableStringBuilder(lrVar3.f28320c0);
                                    lrVar3.f28322e0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final lr lrVar2 = this.f26519b;
                final di.d dVar2 = this.f26520c;
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
                                    lrVar22.f28319b0 = groupcallstreamrtmpurl.url;
                                    lrVar22.f28320c0 = groupcallstreamrtmpurl.key;
                                    lrVar22.f28321d0 = new SpannableStringBuilder(lrVar22.f28320c0);
                                    lrVar22.f28322e0.N(true);
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
                                    lrVar3.f28319b0 = groupcallstreamrtmpurl2.url;
                                    lrVar3.f28320c0 = groupcallstreamrtmpurl2.key;
                                    lrVar3.f28321d0 = new SpannableStringBuilder(lrVar3.f28320c0);
                                    lrVar3.f28322e0.N(true);
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
