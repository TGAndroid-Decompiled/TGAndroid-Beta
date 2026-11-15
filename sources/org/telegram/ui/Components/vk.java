package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class vk implements r4 {
    public final int f40455a;
    public final dl f40456b;
    public final TLRPC.TL_messageMediaVenue f40457c;

    public vk(dl dlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.f40455a = i7;
        this.f40456b = dlVar;
        this.f40457c = tL_messageMediaVenue;
    }

    @Override
    public final void L(int i7, int i10, boolean z10) {
        switch (this.f40455a) {
            case 0:
                dl dlVar = this.f40456b;
                dlVar.f33975o0.d(this.f40457c, dlVar.f33976p0, z10, i7, 0L);
                dlVar.f33609b.a(true);
                return;
            default:
                dl dlVar2 = this.f40456b;
                dlVar2.f33975o0.d(this.f40457c, dlVar2.f33976p0, z10, i7, 0L);
                dlVar2.f33609b.a(true);
                return;
        }
    }
}
