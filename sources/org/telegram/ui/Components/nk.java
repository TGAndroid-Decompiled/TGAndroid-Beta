package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class nk implements s4 {
    public final int f36324a;
    public final vk f36325b;
    public final TLRPC.TL_messageMediaVenue f36326c;

    public nk(vk vkVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.f36324a = i7;
        this.f36325b = vkVar;
        this.f36326c = tL_messageMediaVenue;
    }

    @Override
    public final void L(int i7, int i10, boolean z9) {
        switch (this.f36324a) {
            case 0:
                vk vkVar = this.f36325b;
                vkVar.f39029n0.d(this.f36326c, vkVar.f39030o0, z9, i7, 0L);
                vkVar.f38656b.a(true);
                return;
            default:
                vk vkVar2 = this.f36325b;
                vkVar2.f39029n0.d(this.f36326c, vkVar2.f39030o0, z9, i7, 0L);
                vkVar2.f38656b.a(true);
                return;
        }
    }
}
