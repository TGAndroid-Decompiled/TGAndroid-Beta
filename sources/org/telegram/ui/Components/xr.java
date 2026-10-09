package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class xr implements RequestDelegate {
    public final int f32996a;
    public final ds f32997b;
    public final ci.d f32998c;

    public xr(ds dsVar, ci.d dVar, int i10) {
        this.f32996a = i10;
        this.f32997b = dsVar;
        this.f32998c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32996a) {
            case 0:
                final ds dsVar = this.f32997b;
                final ci.d dVar = this.f32998c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ds dsVar2 = dsVar;
                                dsVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    dsVar2.f25798b0 = groupcallstreamrtmpurl.url;
                                    dsVar2.f25799c0 = groupcallstreamrtmpurl.key;
                                    dsVar2.f25800d0 = new SpannableStringBuilder(dsVar2.f25799c0);
                                    dsVar2.f25801e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                ds dsVar3 = dsVar;
                                dsVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    dsVar3.f25798b0 = groupcallstreamrtmpurl2.url;
                                    dsVar3.f25799c0 = groupcallstreamrtmpurl2.key;
                                    dsVar3.f25800d0 = new SpannableStringBuilder(dsVar3.f25799c0);
                                    dsVar3.f25801e0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final ds dsVar2 = this.f32997b;
                final ci.d dVar2 = this.f32998c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ds dsVar22 = dsVar2;
                                dsVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    dsVar22.f25798b0 = groupcallstreamrtmpurl.url;
                                    dsVar22.f25799c0 = groupcallstreamrtmpurl.key;
                                    dsVar22.f25800d0 = new SpannableStringBuilder(dsVar22.f25799c0);
                                    dsVar22.f25801e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                ds dsVar3 = dsVar2;
                                dsVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    dsVar3.f25798b0 = groupcallstreamrtmpurl2.url;
                                    dsVar3.f25799c0 = groupcallstreamrtmpurl2.key;
                                    dsVar3.f25800d0 = new SpannableStringBuilder(dsVar3.f25799c0);
                                    dsVar3.f25801e0.N(true);
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
