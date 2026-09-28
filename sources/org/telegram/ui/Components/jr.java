package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class jr implements RequestDelegate {
    public final int f25504a;
    public final or f25505b;
    public final ci.d f25506c;

    public jr(or orVar, ci.d dVar, int i10) {
        this.f25504a = i10;
        this.f25505b = orVar;
        this.f25506c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25504a) {
            case 0:
                final or orVar = this.f25505b;
                final ci.d dVar = this.f25506c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                or orVar2 = orVar;
                                orVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    orVar2.f27175b0 = groupcallstreamrtmpurl.url;
                                    orVar2.f27176c0 = groupcallstreamrtmpurl.key;
                                    orVar2.f27177d0 = new SpannableStringBuilder(orVar2.f27176c0);
                                    orVar2.f27178e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                or orVar3 = orVar;
                                orVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    orVar3.f27175b0 = groupcallstreamrtmpurl2.url;
                                    orVar3.f27176c0 = groupcallstreamrtmpurl2.key;
                                    orVar3.f27177d0 = new SpannableStringBuilder(orVar3.f27176c0);
                                    orVar3.f27178e0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final or orVar2 = this.f25505b;
                final ci.d dVar2 = this.f25506c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                or orVar22 = orVar2;
                                orVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    orVar22.f27175b0 = groupcallstreamrtmpurl.url;
                                    orVar22.f27176c0 = groupcallstreamrtmpurl.key;
                                    orVar22.f27177d0 = new SpannableStringBuilder(orVar22.f27176c0);
                                    orVar22.f27178e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                or orVar3 = orVar2;
                                orVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    orVar3.f27175b0 = groupcallstreamrtmpurl2.url;
                                    orVar3.f27176c0 = groupcallstreamrtmpurl2.key;
                                    orVar3.f27177d0 = new SpannableStringBuilder(orVar3.f27176c0);
                                    orVar3.f27178e0.N(true);
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
