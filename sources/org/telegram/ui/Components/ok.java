package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ok implements t4 {
    public final int f36737a;
    public final wk f36738b;
    public final TLRPC.TL_messageMediaVenue f36739c;

    public ok(wk wkVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.f36737a = i7;
        this.f36738b = wkVar;
        this.f36739c = tL_messageMediaVenue;
    }

    @Override
    public final void L(int i7, int i10, boolean z9) {
        switch (this.f36737a) {
            case 0:
                wk wkVar = this.f36738b;
                wkVar.f39993n0.d(this.f36739c, wkVar.f39994o0, z9, i7, 0L);
                wkVar.f38951b.a(true);
                return;
            default:
                wk wkVar2 = this.f36738b;
                wkVar2.f39993n0.d(this.f36739c, wkVar2.f39994o0, z9, i7, 0L);
                wkVar2.f38951b.a(true);
                return;
        }
    }
}
