package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class as implements RequestDelegate {
    public final int f24463a;
    public final fs f24464b;
    public final ci.d f24465c;

    public as(fs fsVar, ci.d dVar, int i10) {
        this.f24463a = i10;
        this.f24464b = fsVar;
        this.f24465c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24463a) {
            case 0:
                final fs fsVar = this.f24464b;
                final ci.d dVar = this.f24465c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                fs fsVar2 = fsVar;
                                fsVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    fsVar2.f26160b0 = groupcallstreamrtmpurl.url;
                                    fsVar2.f26161c0 = groupcallstreamrtmpurl.key;
                                    fsVar2.f26162d0 = new SpannableStringBuilder(fsVar2.f26161c0);
                                    fsVar2.f26163e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                fs fsVar3 = fsVar;
                                fsVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    fsVar3.f26160b0 = groupcallstreamrtmpurl2.url;
                                    fsVar3.f26161c0 = groupcallstreamrtmpurl2.key;
                                    fsVar3.f26162d0 = new SpannableStringBuilder(fsVar3.f26161c0);
                                    fsVar3.f26163e0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final fs fsVar2 = this.f24464b;
                final ci.d dVar2 = this.f24465c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                fs fsVar22 = fsVar2;
                                fsVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    fsVar22.f26160b0 = groupcallstreamrtmpurl.url;
                                    fsVar22.f26161c0 = groupcallstreamrtmpurl.key;
                                    fsVar22.f26162d0 = new SpannableStringBuilder(fsVar22.f26161c0);
                                    fsVar22.f26163e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                fs fsVar3 = fsVar2;
                                fsVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    fsVar3.f26160b0 = groupcallstreamrtmpurl2.url;
                                    fsVar3.f26161c0 = groupcallstreamrtmpurl2.key;
                                    fsVar3.f26162d0 = new SpannableStringBuilder(fsVar3.f26161c0);
                                    fsVar3.f26163e0.N(true);
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
