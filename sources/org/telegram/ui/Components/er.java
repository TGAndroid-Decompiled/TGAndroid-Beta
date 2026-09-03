package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class er implements RequestDelegate {
    public final int f24673a;
    public final ir f24674b;
    public final ph.d f24675c;

    public er(ir irVar, ph.d dVar, int i10) {
        this.f24673a = i10;
        this.f24674b = irVar;
        this.f24675c = dVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24673a) {
            case 0:
                final ir irVar = this.f24674b;
                final ph.d dVar = this.f24675c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ir irVar2 = irVar;
                                irVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    irVar2.Y = groupcallstreamrtmpurl.url;
                                    irVar2.Z = groupcallstreamrtmpurl.key;
                                    irVar2.f25757a0 = new SpannableStringBuilder(irVar2.Z);
                                    irVar2.f25758b0.N(true);
                                    return;
                                }
                                return;
                            default:
                                ir irVar3 = irVar;
                                irVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    irVar3.Y = groupcallstreamrtmpurl2.url;
                                    irVar3.Z = groupcallstreamrtmpurl2.key;
                                    irVar3.f25757a0 = new SpannableStringBuilder(irVar3.Z);
                                    irVar3.f25758b0.N(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final ir irVar2 = this.f24674b;
                final ph.d dVar2 = this.f24675c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ir irVar22 = irVar2;
                                irVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    irVar22.Y = groupcallstreamrtmpurl.url;
                                    irVar22.Z = groupcallstreamrtmpurl.key;
                                    irVar22.f25757a0 = new SpannableStringBuilder(irVar22.Z);
                                    irVar22.f25758b0.N(true);
                                    return;
                                }
                                return;
                            default:
                                ir irVar3 = irVar2;
                                irVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    irVar3.Y = groupcallstreamrtmpurl2.url;
                                    irVar3.Z = groupcallstreamrtmpurl2.key;
                                    irVar3.f25757a0 = new SpannableStringBuilder(irVar3.Z);
                                    irVar3.f25758b0.N(true);
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
