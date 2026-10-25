package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class ur implements RequestDelegate {
    public final int f33479a;
    public final zr f33480b;
    public final fi.d f33481c;

    public ur(zr zrVar, fi.d dVar, int i10) {
        this.f33479a = i10;
        this.f33480b = zrVar;
        this.f33481c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33479a) {
            case 0:
                final zr zrVar = this.f33480b;
                final fi.d dVar = this.f33481c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                zr zrVar2 = zrVar;
                                zrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    zrVar2.f35386b0 = groupcallstreamrtmpurl.url;
                                    zrVar2.f35387c0 = groupcallstreamrtmpurl.key;
                                    zrVar2.f35388d0 = new SpannableStringBuilder(zrVar2.f35387c0);
                                    zrVar2.f35389e0.O(true);
                                    return;
                                }
                                return;
                            default:
                                zr zrVar3 = zrVar;
                                zrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    zrVar3.f35386b0 = groupcallstreamrtmpurl2.url;
                                    zrVar3.f35387c0 = groupcallstreamrtmpurl2.key;
                                    zrVar3.f35388d0 = new SpannableStringBuilder(zrVar3.f35387c0);
                                    zrVar3.f35389e0.O(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final zr zrVar2 = this.f33480b;
                final fi.d dVar2 = this.f33481c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                zr zrVar22 = zrVar2;
                                zrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    zrVar22.f35386b0 = groupcallstreamrtmpurl.url;
                                    zrVar22.f35387c0 = groupcallstreamrtmpurl.key;
                                    zrVar22.f35388d0 = new SpannableStringBuilder(zrVar22.f35387c0);
                                    zrVar22.f35389e0.O(true);
                                    return;
                                }
                                return;
                            default:
                                zr zrVar3 = zrVar2;
                                zrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    zrVar3.f35386b0 = groupcallstreamrtmpurl2.url;
                                    zrVar3.f35387c0 = groupcallstreamrtmpurl2.key;
                                    zrVar3.f35388d0 = new SpannableStringBuilder(zrVar3.f35387c0);
                                    zrVar3.f35389e0.O(true);
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
