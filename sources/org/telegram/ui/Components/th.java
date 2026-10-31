package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class th extends org.telegram.ui.yr0 {
    public final org.telegram.messenger.ef f30576a;
    public final bi f30577b;

    public th(bi biVar, org.telegram.messenger.ef efVar) {
        this.f30577b = biVar;
        this.f30576a = efVar;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.x20 x20Var, final boolean z10, final int i11, int i12, final boolean z11) {
        bi biVar = this.f30577b;
        biVar.f24711p4 = true;
        if (biVar.T3 == null) {
            return;
        }
        final org.telegram.messenger.ef efVar = this.f30576a;
        efVar.f19521s = x20Var;
        s4.Z(biVar.D3, biVar.W0() + 1, 0L, new org.telegram.messenger.q20() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f23848t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f23847s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, efVar);
                th.this.f30577b.T3.H0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
