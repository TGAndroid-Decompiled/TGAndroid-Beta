package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class th extends org.telegram.ui.xr0 {
    public final org.telegram.messenger.ff f30655a;
    public final bi f30656b;

    public th(bi biVar, org.telegram.messenger.ff ffVar) {
        this.f30656b = biVar;
        this.f30655a = ffVar;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, final boolean z10, final int i11, int i12, final boolean z11) {
        bi biVar = this.f30656b;
        biVar.f24802p4 = true;
        if (biVar.T3 == null) {
            return;
        }
        final org.telegram.messenger.ff ffVar = this.f30655a;
        ffVar.f14617s = y20Var;
        s4.Z(biVar.D3, biVar.W0() + 1, 0L, new org.telegram.messenger.r20() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f23849t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f23848s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, ffVar);
                th.this.f30656b.T3.H0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
