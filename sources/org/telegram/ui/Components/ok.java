package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ok implements t4 {
    public final int f36633a;
    public final wk f36634b;
    public final TLRPC.TL_messageMediaVenue f36635c;

    public ok(wk wkVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.f36633a = i7;
        this.f36634b = wkVar;
        this.f36635c = tL_messageMediaVenue;
    }

    @Override
    public final void L(int i7, int i10, boolean z9) {
        switch (this.f36633a) {
            case 0:
                wk wkVar = this.f36634b;
                wkVar.f40008n0.d(this.f36635c, wkVar.f40009o0, z9, i7, 0L);
                wkVar.f38969b.a(true);
                return;
            default:
                wk wkVar2 = this.f36634b;
                wkVar2.f40008n0.d(this.f36635c, wkVar2.f40009o0, z9, i7, 0L);
                wkVar2.f38969b.a(true);
                return;
        }
    }
}
