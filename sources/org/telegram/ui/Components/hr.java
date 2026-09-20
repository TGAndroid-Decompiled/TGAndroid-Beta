package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class hr implements RequestDelegate {
    public final int f24738a;
    public final mr f24739b;
    public final ci.d f24740c;

    public hr(mr mrVar, ci.d dVar, int i10) {
        this.f24738a = i10;
        this.f24739b = mrVar;
        this.f24740c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24738a) {
            case 0:
                final mr mrVar = this.f24739b;
                final ci.d dVar = this.f24740c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                mr mrVar2 = mrVar;
                                mrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    mrVar2.f26481b0 = groupcallstreamrtmpurl.url;
                                    mrVar2.f26482c0 = groupcallstreamrtmpurl.key;
                                    mrVar2.f26483d0 = new SpannableStringBuilder(mrVar2.f26482c0);
                                    mrVar2.f26484e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                mr mrVar3 = mrVar;
                                mrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    mrVar3.f26481b0 = groupcallstreamrtmpurl2.url;
                                    mrVar3.f26482c0 = groupcallstreamrtmpurl2.key;
                                    mrVar3.f26483d0 = new SpannableStringBuilder(mrVar3.f26482c0);
                                    mrVar3.f26484e0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final mr mrVar2 = this.f24739b;
                final ci.d dVar2 = this.f24740c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                mr mrVar22 = mrVar2;
                                mrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    mrVar22.f26481b0 = groupcallstreamrtmpurl.url;
                                    mrVar22.f26482c0 = groupcallstreamrtmpurl.key;
                                    mrVar22.f26483d0 = new SpannableStringBuilder(mrVar22.f26482c0);
                                    mrVar22.f26484e0.N(true);
                                    return;
                                }
                                return;
                            default:
                                mr mrVar3 = mrVar2;
                                mrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    mrVar3.f26481b0 = groupcallstreamrtmpurl2.url;
                                    mrVar3.f26482c0 = groupcallstreamrtmpurl2.key;
                                    mrVar3.f26483d0 = new SpannableStringBuilder(mrVar3.f26482c0);
                                    mrVar3.f26484e0.N(true);
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
