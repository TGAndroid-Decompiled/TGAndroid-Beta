package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class yr implements RequestDelegate {
    public final int f33323a;
    public final es f33324b;
    public final ci.d f33325c;

    public yr(es esVar, ci.d dVar, int i10) {
        this.f33323a = i10;
        this.f33324b = esVar;
        this.f33325c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33323a) {
            case 0:
                final es esVar = this.f33324b;
                final ci.d dVar = this.f33325c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                es esVar2 = esVar;
                                esVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    esVar2.f26120b0 = groupcallstreamrtmpurl.url;
                                    esVar2.f26121c0 = groupcallstreamrtmpurl.key;
                                    esVar2.f26122d0 = new SpannableStringBuilder(esVar2.f26121c0);
                                    esVar2.f26123e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                es esVar3 = esVar;
                                esVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    esVar3.f26120b0 = groupcallstreamrtmpurl2.url;
                                    esVar3.f26121c0 = groupcallstreamrtmpurl2.key;
                                    esVar3.f26122d0 = new SpannableStringBuilder(esVar3.f26121c0);
                                    esVar3.f26123e0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final es esVar2 = this.f33324b;
                final ci.d dVar2 = this.f33325c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                es esVar22 = esVar2;
                                esVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    esVar22.f26120b0 = groupcallstreamrtmpurl.url;
                                    esVar22.f26121c0 = groupcallstreamrtmpurl.key;
                                    esVar22.f26122d0 = new SpannableStringBuilder(esVar22.f26121c0);
                                    esVar22.f26123e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                es esVar3 = esVar2;
                                esVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    esVar3.f26120b0 = groupcallstreamrtmpurl2.url;
                                    esVar3.f26121c0 = groupcallstreamrtmpurl2.key;
                                    esVar3.f26122d0 = new SpannableStringBuilder(esVar3.f26121c0);
                                    esVar3.f26123e0.N(true);
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
