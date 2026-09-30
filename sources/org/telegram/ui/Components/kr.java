package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class kr implements RequestDelegate {
    public final int f25812a;
    public final pr f25813b;
    public final ci.d f25814c;

    public kr(pr prVar, ci.d dVar, int i10) {
        this.f25812a = i10;
        this.f25813b = prVar;
        this.f25814c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25812a) {
            case 0:
                final pr prVar = this.f25813b;
                final ci.d dVar = this.f25814c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                pr prVar2 = prVar;
                                prVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    prVar2.f27461b0 = groupcallstreamrtmpurl.url;
                                    prVar2.f27462c0 = groupcallstreamrtmpurl.key;
                                    prVar2.f27463d0 = new SpannableStringBuilder(prVar2.f27462c0);
                                    prVar2.f27464e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                pr prVar3 = prVar;
                                prVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    prVar3.f27461b0 = groupcallstreamrtmpurl2.url;
                                    prVar3.f27462c0 = groupcallstreamrtmpurl2.key;
                                    prVar3.f27463d0 = new SpannableStringBuilder(prVar3.f27462c0);
                                    prVar3.f27464e0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final pr prVar2 = this.f25813b;
                final ci.d dVar2 = this.f25814c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                pr prVar22 = prVar2;
                                prVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    prVar22.f27461b0 = groupcallstreamrtmpurl.url;
                                    prVar22.f27462c0 = groupcallstreamrtmpurl.key;
                                    prVar22.f27463d0 = new SpannableStringBuilder(prVar22.f27462c0);
                                    prVar22.f27464e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                pr prVar3 = prVar2;
                                prVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    prVar3.f27461b0 = groupcallstreamrtmpurl2.url;
                                    prVar3.f27462c0 = groupcallstreamrtmpurl2.key;
                                    prVar3.f27463d0 = new SpannableStringBuilder(prVar3.f27462c0);
                                    prVar3.f27464e0.N(true);
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
