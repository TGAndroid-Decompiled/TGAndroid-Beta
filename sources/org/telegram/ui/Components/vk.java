package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class vk implements r4 {
    public final int f40452a;
    public final dl f40453b;
    public final TLRPC.TL_messageMediaVenue f40454c;

    public vk(dl dlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.f40452a = i7;
        this.f40453b = dlVar;
        this.f40454c = tL_messageMediaVenue;
    }

    @Override
    public final void L(int i7, int i10, boolean z10) {
        switch (this.f40452a) {
            case 0:
                dl dlVar = this.f40453b;
                dlVar.f33988o0.d(this.f40454c, dlVar.f33989p0, z10, i7, 0L);
                dlVar.f33607b.a(true);
                return;
            default:
                dl dlVar2 = this.f40453b;
                dlVar2.f33988o0.d(this.f40454c, dlVar2.f33989p0, z10, i7, 0L);
                dlVar2.f33607b.a(true);
                return;
        }
    }
}
