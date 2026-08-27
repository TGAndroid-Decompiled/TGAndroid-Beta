package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

public final class vq implements RequestDelegate {

    public final int f34031a;

    public final ar f34032b;

    public final lh.d f34033c;

    public vq(ar arVar, lh.d dVar, int i10) {
        this.f34031a = i10;
        this.f34032b = arVar;
        this.f34033c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34031a) {
            case 0:
                final int i10 = 0;
                final ar arVar = this.f34032b;
                final lh.d dVar = this.f34033c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ar arVar2 = arVar;
                                arVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    arVar2.X = groupcallstreamrtmpurl.url;
                                    arVar2.Y = groupcallstreamrtmpurl.key;
                                    arVar2.Z = new SpannableStringBuilder(arVar2.Y);
                                    arVar2.f26809a0.N(true);
                                    break;
                                }
                                break;
                            default:
                                ar arVar3 = arVar;
                                arVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    arVar3.X = groupcallstreamrtmpurl2.url;
                                    arVar3.Y = groupcallstreamrtmpurl2.key;
                                    arVar3.Z = new SpannableStringBuilder(arVar3.Y);
                                    arVar3.f26809a0.N(true);
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final ar arVar2 = this.f34032b;
                final lh.d dVar2 = this.f34033c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ar arVar3 = arVar2;
                                arVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    arVar3.X = groupcallstreamrtmpurl.url;
                                    arVar3.Y = groupcallstreamrtmpurl.key;
                                    arVar3.Z = new SpannableStringBuilder(arVar3.Y);
                                    arVar3.f26809a0.N(true);
                                    break;
                                }
                                break;
                            default:
                                ar arVar4 = arVar2;
                                arVar4.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    arVar4.X = groupcallstreamrtmpurl2.url;
                                    arVar4.Y = groupcallstreamrtmpurl2.key;
                                    arVar4.Z = new SpannableStringBuilder(arVar4.Y);
                                    arVar4.f26809a0.N(true);
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
