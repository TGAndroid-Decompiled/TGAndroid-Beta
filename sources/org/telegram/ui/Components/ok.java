package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ok implements t4 {
    public final int f36615a;
    public final wk f36616b;
    public final TLRPC.TL_messageMediaVenue f36617c;

    public ok(wk wkVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.f36615a = i7;
        this.f36616b = wkVar;
        this.f36617c = tL_messageMediaVenue;
    }

    @Override
    public final void L(int i7, int i10, boolean z9) {
        switch (this.f36615a) {
            case 0:
                wk wkVar = this.f36616b;
                wkVar.f40000n0.d(this.f36617c, wkVar.f40001o0, z9, i7, 0L);
                wkVar.f38948b.a(true);
                return;
            default:
                wk wkVar2 = this.f36616b;
                wkVar2.f40000n0.d(this.f36617c, wkVar2.f40001o0, z9, i7, 0L);
                wkVar2.f38948b.a(true);
                return;
        }
    }
}
