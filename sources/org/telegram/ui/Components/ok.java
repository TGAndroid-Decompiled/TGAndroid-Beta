package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ok implements t4 {
    public final int f36734a;
    public final wk f36735b;
    public final TLRPC.TL_messageMediaVenue f36736c;

    public ok(wk wkVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.f36734a = i7;
        this.f36735b = wkVar;
        this.f36736c = tL_messageMediaVenue;
    }

    @Override
    public final void L(int i7, int i10, boolean z9) {
        switch (this.f36734a) {
            case 0:
                wk wkVar = this.f36735b;
                wkVar.f40078n0.d(this.f36736c, wkVar.f40079o0, z9, i7, 0L);
                wkVar.f39071b.a(true);
                return;
            default:
                wk wkVar2 = this.f36735b;
                wkVar2.f40078n0.d(this.f36736c, wkVar2.f40079o0, z9, i7, 0L);
                wkVar2.f39071b.a(true);
                return;
        }
    }
}
