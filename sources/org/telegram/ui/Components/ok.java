package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ok implements t4 {
    public final int f36653a;
    public final wk f36654b;
    public final TLRPC.TL_messageMediaVenue f36655c;

    public ok(wk wkVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.f36653a = i7;
        this.f36654b = wkVar;
        this.f36655c = tL_messageMediaVenue;
    }

    @Override
    public final void L(int i7, int i10, boolean z9) {
        switch (this.f36653a) {
            case 0:
                wk wkVar = this.f36654b;
                wkVar.f39958n0.d(this.f36655c, wkVar.f39959o0, z9, i7, 0L);
                wkVar.f39004b.a(true);
                return;
            default:
                wk wkVar2 = this.f36654b;
                wkVar2.f39958n0.d(this.f36655c, wkVar2.f39959o0, z9, i7, 0L);
                wkVar2.f39004b.a(true);
                return;
        }
    }
}
