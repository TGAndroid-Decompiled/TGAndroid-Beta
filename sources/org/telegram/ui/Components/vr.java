package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class vr implements RequestDelegate {
    public final int f30296a;
    public final as f30297b;
    public final di.d f30298c;

    public vr(as asVar, di.d dVar, int i10) {
        this.f30296a = i10;
        this.f30297b = asVar;
        this.f30298c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30296a) {
            case 0:
                final as asVar = this.f30297b;
                final di.d dVar = this.f30298c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                as asVar2 = asVar;
                                asVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    asVar2.f23290b0 = groupcallstreamrtmpurl.url;
                                    asVar2.f23291c0 = groupcallstreamrtmpurl.key;
                                    asVar2.f23292d0 = new SpannableStringBuilder(asVar2.f23291c0);
                                    asVar2.f23293e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                as asVar3 = asVar;
                                asVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    asVar3.f23290b0 = groupcallstreamrtmpurl2.url;
                                    asVar3.f23291c0 = groupcallstreamrtmpurl2.key;
                                    asVar3.f23292d0 = new SpannableStringBuilder(asVar3.f23291c0);
                                    asVar3.f23293e0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final as asVar2 = this.f30297b;
                final di.d dVar2 = this.f30298c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                as asVar22 = asVar2;
                                asVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    asVar22.f23290b0 = groupcallstreamrtmpurl.url;
                                    asVar22.f23291c0 = groupcallstreamrtmpurl.key;
                                    asVar22.f23292d0 = new SpannableStringBuilder(asVar22.f23291c0);
                                    asVar22.f23293e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                as asVar3 = asVar2;
                                asVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    asVar3.f23290b0 = groupcallstreamrtmpurl2.url;
                                    asVar3.f23291c0 = groupcallstreamrtmpurl2.key;
                                    asVar3.f23292d0 = new SpannableStringBuilder(asVar3.f23291c0);
                                    asVar3.f23293e0.N(true);
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
